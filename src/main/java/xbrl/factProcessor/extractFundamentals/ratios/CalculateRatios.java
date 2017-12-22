package xbrl.factProcessor.extractFundamentals.ratios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CalculateRatios {

    private static final Map<String, Set<String>> ratioRequirementsMap = new HashMap<>();

    static {

        HashSet<String> ROE = new HashSet<>();
        ROE.add("NetIncomeLoss");
        ROE.add("Equity");

        HashSet<String> ROA = new HashSet<>();
        ROA.add("NetIncomeLoss");
        ROA.add("Assets");

        HashSet<String> CurrentRatio = new HashSet<>();
        CurrentRatio.add("CurrentAssets");
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

        //

        ratioRequirementsMap.put("ROE", ROE);
        ratioRequirementsMap.put("ROA", ROA);
        ratioRequirementsMap.put("CurrentRatio", CurrentRatio);
        ratioRequirementsMap.put("EfficiencyRatio", EfficiencyRatio);
        ratioRequirementsMap.put("WorkingCapitalToSales", WorkingCapitalToSales);
        ratioRequirementsMap.put("CashRatio", CashRatio);
        ratioRequirementsMap.put("AssetTurnover", AssetTurnover);
        ratioRequirementsMap.put("DebtRatio", DebtRatio);
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