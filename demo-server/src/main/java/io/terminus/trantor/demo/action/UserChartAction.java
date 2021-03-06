package io.terminus.trantor.demo.action;

import com.alibaba.fastjson.JSON;
import io.terminus.trantor.sdk.datasource.ChartDataAction;
import io.terminus.trantor.sdk.datasource.ChartDataParams;
import io.terminus.trantor.sdk.datasource.ChartDataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Dashboard功能服务端实现
 * 实现ChartDataAction接口的load方法
 */
@Slf4j
@Component
public class UserChartAction implements ChartDataAction {

    public ChartDataResult load(ChartDataParams chartDataParams) {
        log.info("chartDataParams info: " + JSON.toJSONString(chartDataParams));
        ChartDataResult chartDataResult = new ChartDataResult();
        List<ChartDataResult.DashboardChartItem> result = new ArrayList<ChartDataResult.DashboardChartItem>();
        ChartDataResult.DashboardChartItem item = new ChartDataResult.DashboardChartItem();
        item.setGroup("2020-07-16");
        item.setLabel("水果");
        item.setValue(432l);
        result.add(item);

        ChartDataResult.DashboardChartItem item1 = new ChartDataResult.DashboardChartItem();
        item1.setGroup("2020-07-15");
        item1.setLabel("药品");
        item1.setValue(2312l);
        result.add(item1);

        ChartDataResult.DashboardChartItem item2 = new ChartDataResult.DashboardChartItem();
        item2.setGroup("2020-07-14");
        item2.setLabel("肉禽");
        item2.setValue(332l);
        result.add(item2);

        ChartDataResult.DashboardChartItem item3 = new ChartDataResult.DashboardChartItem();
        item3.setGroup("2020-07-13");
        item3.setLabel("蔬菜");
        item3.setValue(154l);
        result.add(item3);


        chartDataResult.setData(result);
        return chartDataResult;
    }
}
