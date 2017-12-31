package xbrl.factProcessor.extractFundamentals.ratios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ComputableRatiosCheck {
    private final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private static final Map<String, Set<String>> ratioRequirementsMap = new HashMap<>();

    static {

        HashSet<String> ROE = new HashSet<>();
        ROE.add("NetIncomeLoss");
        ROE.add("Equity");

        HashSet<String> ROA = new HashSet<>();
        ROA.add("NetIncomeLoss");
        ROA.add("Assets");

        HashSet<String> ROS = new HashSet<>();
        ROS.add("NetIncomeLoss");
        ROS.add("Revenues");


        HashSet<String> CurrentRatio = new HashSet<>();
//        CurrentRatio.add("CurrentAssets");
        CurrentRatio.add("Cash");
        CurrentRatio.add("CurrentLiabilities");

        HashSet<String> WorkingCapitalToSales = new HashSet<>();
        WorkingCapitalToSales.add("CurrentAssets");
        WorkingCapitalToSales.add("CurrentLiabilities");
        WorkingCapitalToSales.add("Revenues");
//
        HashSet<String> EfficiencyRatio = new HashSet<>();
        EfficiencyRatio.add("NoninterestExpense");
        EfficiencyRatio.add("Revenues");

        HashSet<String> CashRatio = new HashSet<>();
        CashRatio.add("Cash");
        CashRatio.add("CurrentLiabilities");

        HashSet<String> AssetTurnover = new HashSet<>();
        AssetTurnover.add("Revenues");
        AssetTurnover.add("Assets");

        HashSet<String> DebtRatio = new HashSet<>();
        DebtRatio.add("Liabilities");
        DebtRatio.add("Assets");

        HashSet<String> SGR = new HashSet<>();
        SGR.add("NetIncomeLoss");
        SGR.add("Revenues");
        SGR.add("Assets");
        SGR.add("Equity");

        HashSet<String> OperatingProfit = new HashSet<>();
        OperatingProfit.add("Revenues");
        OperatingProfit.add("CostOfRevenue");
        OperatingProfit.add("OperatingExpenses");

        HashSet<String> NetProfitMargin = new HashSet<>();
        NetProfitMargin.add("NetIncomeLoss");
        NetProfitMargin.add("Revenues");

        ratioRequirementsMap.put("ROE", ROE);
        ratioRequirementsMap.put("ROA", ROA);
        ratioRequirementsMap.put("CurrentRatio", CurrentRatio);
        ratioRequirementsMap.put("EfficiencyRatio", EfficiencyRatio);
        ratioRequirementsMap.put("WorkingCapitalToSales", WorkingCapitalToSales);
        ratioRequirementsMap.put("CashRatio", CashRatio);
        ratioRequirementsMap.put("AssetTurnover", AssetTurnover);
        ratioRequirementsMap.put("DebtRatio", DebtRatio);
        ratioRequirementsMap.put("SGR", SGR);
        ratioRequirementsMap.put("ROS", ROS);
        ratioRequirementsMap.put("OperatingProfit", OperatingProfit);
        ratioRequirementsMap.put("NetProfitMargin", NetProfitMargin);
    }

    public static Map<String, Boolean> determineComputableRatios(Map<String, Double> fundamentals){
        Map<String, Boolean> canCompute = new HashMap<>();
        for(String s: ratioRequirementsMap.keySet()){
            canCompute.put(s, fundamentals.keySet().containsAll(ratioRequirementsMap.get(s)));
//            for(String ss: ratioRequirementsMap.get(s)){
//                System.out.println(ss + ": " + fundamentals.keySet().contains(ss));
//            }

        }
        return canCompute;
    }
}
