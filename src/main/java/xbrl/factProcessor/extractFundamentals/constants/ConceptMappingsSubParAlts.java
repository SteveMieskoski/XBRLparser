package xbrl.factProcessor.extractFundamentals.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Alternative (last resort) tags to check.
 * Only if no other tag mapping or computed value exists for the given quantity
* */
public class ConceptMappingsSubParAlts {

    public static final Map<String, String[]> mappings = new HashMap<>();
    public static final Map<String, String[]> mappingOther = new HashMap<>();

    static {
        String[] OtherThanFixedNoncurrentAssets = {
                "ServicingAssetAtAmortizedValue"
        };

        mappings.put("OtherThanFixedNoncurrentAssets", OtherThanFixedNoncurrentAssets);

        //==============================================================
        // No related quantity in ConceptMappings
        String[] LongTermDebt = {
                "SubordinatedDebt"
        };

        String [] Cash = {"Cash","CashEquivalentsAtCarryingValue ","CashAndDueFromBanks","CashCashEquivalentsAndShortTermInvestments"};


        mappingOther.put("LongTermDebt", LongTermDebt);
        mappingOther.put("Cash", Cash);
    }
}
