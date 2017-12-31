package xbrl.factProcessor.extractFundamentals.entityInformation;

import xbrl.elementTypes.OrganizationElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyDetailsCollect {

    public static Map<String, String> findAndExtractValues(
            List<OrganizationElement> organizationElements) {
        Map<String, String> values = new HashMap<>();

        values.put("BalanceSheetDate", "");
        values.put("DocumentType", "");
        values.put("EntityCentralIndexKey", "");
        values.put("EntityFilerCategory", "");
        values.put("EntityRegistrantName", "");
        values.put("FiscalPeriodFocus", "");
        values.put("FiscalYearEnd", "");
        values.put("FiscalYearFocus", "");
        values.put("TradingSymbol", "");

        for(OrganizationElement oe: organizationElements){
            if ("DocumentPeriodEndDate".equals(oe.getTag())) {
                values.put("BalanceSheetDate", oe.getTag());
            }
            if ("DocumentType".equals(oe.getTag())) {
                values.put("DocumentType", oe.getValue());
            }
            if ("EntityCentralIndexKey".equals(oe.getTag())) {
                values.put("EntityCentralIndexKey", oe.getValue());
            }
            if ("EntityFilerCategory".equals(oe.getTag())) {
                values.put("EntityFilerCategory", oe.getValue());
            }
            if ("EntityRegistrantName".equals(oe.getTag())) {
                values.put("EntityRegistrantName", oe.getValue());
            }
            if ("DocumentFiscalPeriodFocus".equals(oe.getTag())) {
                values.put("FiscalPeriodFocus", oe.getValue());
            }
            if ("CurrentFiscalYearEndDate".equals(oe.getTag())) {
                values.put("FiscalYearEnd", oe.getValue());
            }
            if ("DocumentFiscalYearFocus".equals(oe.getTag())) {
                values.put("FiscalYearFocus", oe.getValue());
            }
            if ("TradingSymbol".equals(oe.getTag())) {
                values.put("TradingSymbol", oe.getValue());
            }
        }

        return values;
    }
}
