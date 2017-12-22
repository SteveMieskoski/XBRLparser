package xbrl.factProcessor.extractFundamentals;

import xbrl.elementTypes.FactElement;

import java.util.HashMap;
import java.util.Map;

public class BulkCollect {

  public static Map<String, Double> findAndExtractIncomeStatementValues(Map<String, FactElement> factByName) {
    Map<String, Double> values = new HashMap<>();
    Map<String, FactElement> toUse = new HashMap<>();
    Map<String, FactElement> forUse = new HashMap<>();

    // Income Statement
    values.put("BenefitsCostsExpenses", 0d); // IS
    values.put("CostOfRevenue", 0d); // IS
    values.put("CostOfRevenueGoods", 0d); // IS
    values.put("CostOfRevenueServices", 0d); // IS
    values.put("CostsAndExpenses", 0d); // IS
    values.put("ExtraordinaryItemsOfIncomeExpenseNetOfTax", 0d); // IS
    values.put("GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee", 0d); // IS
    values.put(
        "GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome",
        0d); // IS
    values.put("GainLossOnSalePropertiesNetTax", 0d); // IS
    values.put("GrossProfit", 0d); // IS
    values.put("IncomeLossFromContinuingOperationsAfterTax", 0d); // IS
    values.put("IncomeLossFromContinuingOperationsBeforeTax", 0d); // IS
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTax", 0d); // IS
    values.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal",
        0d); // IS
    values.put("IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut", 0d); // IS
    values.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal", 0d); // IS
    values.put("IncomeLossFromEquityMethodInvestments", 0d); // IS
    values.put("IncomeTaxExpenseBenefit", 0d); // IS
    values.put("IncomeTaxExpenseBenefitCurrent", 0d); // IS
    values.put("IncomeTaxExpenseBenefitDeferred", 0d); // IS
    values.put("InterestAndDebtExpense", 0d); // IS
    values.put("InterestAndDividendIncomeOperating", 0d); // IS
    values.put("InterestExpense", 0d); // IS
    values.put("InterestExpenseOperating", 0d); // IS
    values.put("InterestIncomeExpenseAfterProvisionForLosses", 0d); // IS
    values.put("InterestIncomeExpenseOperatingNet", 0d); // IS
    values.put("NetIncomeLoss", 0d); // IS
    values.put("NetIncomeLossAttributableToNoncontrollingInterest", 0d); // IS
    values.put(
        "NetIncomeLossAttributableToNoncontrollingInterestPlusPreferredStockDividendsAndOtherAdjustments",
        0d); // IS
    values.put("NetIncomeLossAttributableToNonredeemableNoncontrollingInterest", 0d); // IS
    values.put("NetIncomeLossAttributableToParent", 0d); // IS
    values.put("NetIncomeLossAttributableToRedeemableNoncontrollingInterest", 0d); // IS
    values.put("NetIncomeLossAvailableToCommonStockholdersBasic", 0d); // IS
    values.put("NoninterestExpense", 0d); // IS
    values.put("NoninterestIncome", 0d); // IS
    values.put("NonoperatingGainsLosses", 0d); // IS
    values.put("NonoperatingIncomeLoss", 0d); // IS
    values.put("NonoperatingIncomeLossPlusInterestAndDebtExpense", 0d); // IS
    values.put(
        "NonoperatingIncomePlusInterestAndDebtExpensePlusIncomeFromEquityMethodInvestments",
        0d); // IS
    values.put("OperatingAndNonoperatingCostsAndExpenses", 0d); // IS
    values.put("OperatingAndNonoperatingRevenues", 0d); // IS
    values.put("OperatingExpenses", 0d); // IS
    values.put("OperatingIncomeLoss", 0d); // IS
    values.put("OtherOperatingIncomeExpenses", 0d); // IS
    values.put("ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic", 0d); // IS
    values.put("PreferredStockDividendsAndOtherAdjustments", 0d); // IS
    values.put("ProvisionForLoanLeaseAndOtherLosses", 0d); // IS
    values.put("Revenues", 0d); // IS
    values.put("RevenuesExcludingInterestDividends", 0d); // IS
    values.put("RevenuesNetInterestExpense", 0d); // IS
    values.put("UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic", 0d); // IS

    if (factByName.get("BenefitsLossesAndExpenses") != null) {
      values.put(
          "BenefitsCostsExpenses",
          Double.parseDouble(factByName.get("BenefitsLossesAndExpenses").getValue()));
    }

    if (factByName.get("CostOfRevenue") != null) {
      values.put("CostOfRevenue", Double.parseDouble(factByName.get("CostOfRevenue").getValue()));
    } else if (factByName.get("CostOfGoodsAndServicesSold") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfGoodsAndServicesSold").getValue()));
    } else if (factByName.get("CostOfGoodsSoldExcludingDepreciationDepletionAndAmortization")
        != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(
              factByName
                  .get("CostOfGoodsSoldExcludingDepreciationDepletionAndAmortization")
                  .getValue()));
    } else if (factByName.get("DirectOperatingCosts") != null) {
      values.put(
          "CostOfRevenue", Double.parseDouble(factByName.get("DirectOperatingCosts").getValue()));
    } else if (factByName.get("CostOfGoodsSoldOilAndGas") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfGoodsSoldOilAndGas").getValue()));
    } else if (factByName.get("CostOfGoodsSoldElectric") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfGoodsSoldElectric").getValue()));
    } else if (factByName.get("FinancialServicesCosts") != null) {
      values.put(
          "CostOfRevenue", Double.parseDouble(factByName.get("FinancialServicesCosts").getValue()));
    } else if (factByName.get("ContractRevenueCost") != null) {
      values.put(
          "CostOfRevenue", Double.parseDouble(factByName.get("ContractRevenueCost").getValue()));
    } else if (factByName.get("RefiningAndMarketingCosts") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("RefiningAndMarketingCosts").getValue()));
    } else if (factByName.get("CostOfNaturalGasPurchases") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfNaturalGasPurchases").getValue()));
    } else if (factByName.get("CostOfGoldProductsAndServices") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfGoldProductsAndServices").getValue()));
    } else if (factByName.get("CostOfRealEstateRevenue") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfRealEstateRevenue").getValue()));
    } else if (factByName.get("CostOfMerchandiseSalesBuyingAndOccupancyCosts") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(
              factByName.get("CostOfMerchandiseSalesBuyingAndOccupancyCosts").getValue()));
    } else if (factByName.get("CostOfServicesExcludingDepreciationDepletionAndAmortization")
        != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(
              factByName
                  .get("CostOfServicesExcludingDepreciationDepletionAndAmortization")
                  .getValue()));
    } else if (factByName.get("CostOfServicesOilAndGas") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfServicesOilAndGas").getValue()));
    } else if (factByName.get("CostOfGoodsSoldDirectMaterials") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("CostOfGoodsSoldDirectMaterials").getValue()));
    } else if (factByName.get("ExplorationExpenseMining") != null) {
      values.put(
          "CostOfRevenue",
          Double.parseDouble(factByName.get("ExplorationExpenseMining").getValue()));
    } else if (factByName.get("DirectCostsOfHotels") != null) {
      values.put(
          "CostOfRevenue", Double.parseDouble(factByName.get("DirectCostsOfHotels").getValue()));
    }
    if (factByName.get("CostOfGoodsSold") != null) {
      values.put(
          "CostOfRevenueGoods", Double.parseDouble(factByName.get("CostOfGoodsSold").getValue()));
    }
    if (factByName.get("CostOfServices") != null) {
      values.put(
          "CostOfRevenueServices", Double.parseDouble(factByName.get("CostOfServices").getValue()));
    }
    if (factByName.get("OperatingCostsAndExpenses") != null) {
      values.put(
          "CostsAndExpenses",
          Double.parseDouble(factByName.get("OperatingCostsAndExpenses").getValue()));
    }

    if (factByName.get("ExtraordinaryItemNetOfTax") != null) {
      values.put(
          "ExtraordinaryItemsOfIncomeExpenseNetOfTax",
          Double.parseDouble(factByName.get("ExtraordinaryItemNetOfTax").getValue()));
    }

    if (factByName.get("GainLossOnSaleOfStockInSubsidiaryOrEquityMethodInvestee") != null) {
      values.put(
          "GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee",
          Double.parseDouble(
              factByName
                  .get("GainLossOnSaleOfStockInSubsidiaryOrEquityMethodInvestee")
                  .getValue()));
    }
    if (factByName.get(
            "GainLossOnSaleOfPreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome")
        != null) {
      values.put(
          "GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome",
          Double.parseDouble(
              factByName
                  .get(
                      "GainLossOnSaleOfPreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome")
                  .getValue()));
    }
    if (factByName.get("GainLossOnSaleOfPropertiesNetOfApplicableIncomeTaxes") != null) {
      values.put(
          "GainLossOnSalePropertiesNetTax",
          Double.parseDouble(
              factByName.get("GainLossOnSaleOfPropertiesNetOfApplicableIncomeTaxes").getValue()));
    }
    if (factByName.get("GrossProfit") != null) {
      values.put("GrossProfit", Double.parseDouble(factByName.get("GrossProfit").getValue()));
    }
    if (factByName.get(
            "IncomeLossFromContinuingOperationsIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "IncomeLossFromContinuingOperationsAfterTax",
          Double.parseDouble(
              factByName
                  .get(
                      "IncomeLossFromContinuingOperationsIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get(
            "IncomeLossBeforeExtraordinaryItemsAndCumulativeEffectOfChangeInAccountingPrinciple")
        != null) {
      values.put(
          "IncomeLossFromContinuingOperationsAfterTax",
          Double.parseDouble(
              factByName
                  .get(
                      "IncomeLossBeforeExtraordinaryItemsAndCumulativeEffectOfChangeInAccountingPrinciple")
                  .getValue()));
    } else if (factByName.get("IncomeLossFromContinuingOperations") != null) {
      values.put(
          "IncomeLossFromContinuingOperationsAfterTax",
          Double.parseDouble(factByName.get("IncomeLossFromContinuingOperations").getValue()));
    }
    if (factByName.get(
            "IncomeLossFromContinuingOperationsBeforeIncomeTaxesExtraordinaryItemsNoncontrollingInterest")
        != null) {
      values.put(
          "IncomeLossFromContinuingOperationsBeforeTax",
          Double.parseDouble(
              factByName
                  .get(
                      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesExtraordinaryItemsNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get(
            "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments")
        != null) {
      values.put(
          "IncomeLossFromContinuingOperationsBeforeTax",
          Double.parseDouble(
              factByName
                  .get(
                      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments")
                  .getValue()));
    }
    if (factByName.get("IncomeLossFromDiscontinuedOperationsNetOfTax") != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTax",
          Double.parseDouble(
              factByName.get("IncomeLossFromDiscontinuedOperationsNetOfTax").getValue()));
    } else if (factByName.get(
            "DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax")
        != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTax",
          Double.parseDouble(
              factByName
                  .get("DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax")
                  .getValue()));
    } else if (factByName.get(
            "IncomeLossFromDiscontinuedOperationsNetOfTaxAttributableToReportingEntity")
        != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTax",
          Double.parseDouble(
              factByName
                  .get("IncomeLossFromDiscontinuedOperationsNetOfTaxAttributableToReportingEntity")
                  .getValue()));
    } else if (factByName.get(
            "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax")
        != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTax",
          Double.parseDouble(
              factByName
                  .get(
                      "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax")
                  .getValue()));
    }
    if (factByName.get(
            "DiscontinuedOperationAmountOfAdjustmentToPriorPeriodGainLossOnDisposalNetOfTax")
        != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal",
          Double.parseDouble(
              factByName
                  .get(
                      "DiscontinuedOperationAmountOfAdjustmentToPriorPeriodGainLossOnDisposalNetOfTax")
                  .getValue()));
    }
    if (factByName.get("DiscontinuedOperationProvisionForLossGainOnDisposalNetOfTax") != null) {
      values.put(
          "IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal",
          Double.parseDouble(
              factByName
                  .get("DiscontinuedOperationProvisionForLossGainOnDisposalNetOfTax")
                  .getValue()));
    }
    if (factByName.get("IncomeLossFromEquityMethodInvestments") != null) {
      values.put(
          "IncomeLossFromEquityMethodInvestments",
          Double.parseDouble(factByName.get("IncomeLossFromEquityMethodInvestments").getValue()));
    } else if (factByName.get("EquityMethodInvestmentSummarizedFinancialInformationNetIncomeLoss")
        != null) {
      values.put(
          "IncomeLossFromEquityMethodInvestments",
          Double.parseDouble(
              factByName
                  .get("EquityMethodInvestmentSummarizedFinancialInformationNetIncomeLoss")
                  .getValue()));
    } else if (factByName.get("IncomeLossFromEquityMethodInvestmentsNetOfDividendsOrDistributions")
        != null) {
      values.put(
          "IncomeLossFromEquityMethodInvestments",
          Double.parseDouble(
              factByName
                  .get("IncomeLossFromEquityMethodInvestmentsNetOfDividendsOrDistributions")
                  .getValue()));
    }
    if (factByName.get("IncomeTaxExpenseBenefit") != null) {
      values.put(
          "IncomeTaxExpenseBenefit",
          Double.parseDouble(factByName.get("IncomeTaxExpenseBenefit").getValue()));
    } else if (factByName.get("IncomeTaxExpenseBenefitContinuingOperations") != null) {
      values.put(
          "IncomeTaxExpenseBenefit",
          Double.parseDouble(
              factByName.get("IncomeTaxExpenseBenefitContinuingOperations").getValue()));
    } else if (factByName.get("FederalHomeLoanBankAssessments") != null) {
      values.put(
          "IncomeTaxExpenseBenefit",
          Double.parseDouble(factByName.get("FederalHomeLoanBankAssessments").getValue()));
    } else if (factByName.get("FederalIncomeTaxExpenseBenefitContinuingOperations") != null) {
      values.put(
          "IncomeTaxExpenseBenefit",
          Double.parseDouble(
              factByName.get("FederalIncomeTaxExpenseBenefitContinuingOperations").getValue()));
    } else if (factByName.get("AffordableHousingProgramAssessments") != null) {
      values.put(
          "IncomeTaxExpenseBenefit",
          Double.parseDouble(factByName.get("AffordableHousingProgramAssessments").getValue()));
    }
    if (factByName.get("CurrentIncomeTaxExpenseBenefit") != null) {
      values.put(
          "IncomeTaxExpenseBenefitCurrent",
          Double.parseDouble(factByName.get("CurrentIncomeTaxExpenseBenefit").getValue()));
    }
    if (factByName.get("DeferredIncomeTaxExpenseBenefit") != null) {
      values.put(
          "IncomeTaxExpenseBenefitDeferred",
          Double.parseDouble(factByName.get("DeferredIncomeTaxExpenseBenefit").getValue()));
    }
    if (factByName.get("InterestAndDebtExpense") != null) {
      values.put(
          "InterestAndDebtExpense",
          Double.parseDouble(factByName.get("InterestAndDebtExpense").getValue()));
    }
    if (factByName.get("InterestExpense") != null) {
      values.put(
          "InterestExpenseOperating",
          Double.parseDouble(factByName.get("InterestExpense").getValue()));
    } else if (factByName.get("InterestExpenseBorrowings") != null) {
      values.put(
          "InterestExpenseOperating",
          Double.parseDouble(factByName.get("InterestExpenseBorrowings").getValue()));
    } else if (factByName.get("InterestExpenseDeposits") != null) {
      values.put(
          "InterestExpenseOperating",
          Double.parseDouble(factByName.get("InterestExpenseDeposits").getValue()));
    }
    if (factByName.get("InterestIncomeExpenseAfterProvisionForLoanLoss") != null) {
      values.put(
          "InterestIncomeExpenseAfterProvisionForLosses",
          Double.parseDouble(
              factByName.get("InterestIncomeExpenseAfterProvisionForLoanLoss").getValue()));
    } else if (factByName.get("NetInterestIncomeLossAfterProvisionForLoanLosses") != null) {
      values.put(
          "InterestIncomeExpenseAfterProvisionForLosses",
          Double.parseDouble(
              factByName.get("NetInterestIncomeLossAfterProvisionForLoanLosses").getValue()));
    }

    if (factByName.get("ProfitLoss") != null) {
      values.put("NetIncomeLoss", Double.parseDouble(factByName.get("ProfitLoss").getValue()));
    } else if (factByName.get("IncomeLossIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "NetIncomeLoss",
          Double.parseDouble(
              factByName
                  .get("IncomeLossIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    }
    if (factByName.get("NetIncomeLossAttributableToNoncontrollingInterest") != null) {
      values.put(
          "NetIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("NetIncomeLossAttributableToNoncontrollingInterest").getValue()));
    } else if (factByName.get("IncomeLossAttributableToNoncontrollingInterest") != null) {
      values.put(
          "NetIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("IncomeLossAttributableToNoncontrollingInterest").getValue()));
    } else if (factByName.get("NetIncomeLossAttributableToNonredeemableNoncontrollingInterest")
        != null) {
      values.put(
          "NetIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName
                  .get("NetIncomeLossAttributableToNonredeemableNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get("NetIncomeLossAttributableToRedeemableNoncontrollingInterest")
        != null) {
      values.put(
          "NetIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName
                  .get("NetIncomeLossAttributableToRedeemableNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get(
            "IncomeLossFromContinuingOperationsAttributableToNoncontrollingEntity")
        != null) {
      values.put(
          "NetIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName
                  .get("IncomeLossFromContinuingOperationsAttributableToNoncontrollingEntity")
                  .getValue()));
    }
    if (factByName.get("NetIncomeLoss") != null) {
      values.put(
          "NetIncomeLossAttributableToParent",
          Double.parseDouble(factByName.get("NetIncomeLoss").getValue()));
    } else if (factByName.get("IncomeLossAttributableToParent") != null) {
      values.put(
          "NetIncomeLossAttributableToParent",
          Double.parseDouble(factByName.get("IncomeLossAttributableToParent").getValue()));
    } else if (factByName.get(
            "NetIncomeLossAttributableToParentNetOfFederalHomeLoanBankAssessments")
        != null) {
      values.put(
          "NetIncomeLossAttributableToParent",
          Double.parseDouble(
              factByName
                  .get("NetIncomeLossAttributableToParentNetOfFederalHomeLoanBankAssessments")
                  .getValue()));
    }
    if (factByName.get("NetIncomeLossAvailableToCommonStockholdersBasic") != null) {
      values.put(
          "NetIncomeLossAvailableToCommonStockholdersBasic",
          Double.parseDouble(
              factByName.get("NetIncomeLossAvailableToCommonStockholdersBasic").getValue()));
    }

    if (factByName.get("NoninterestExpense") != null) {
      values.put(
          "NoninterestExpense",
          Double.parseDouble(factByName.get("NoninterestExpense").getValue()));
    }
    if (factByName.get("NoninterestIncome") != null) {
      values.put(
          "NoninterestIncome", Double.parseDouble(factByName.get("NoninterestIncome").getValue()));
    } else if (factByName.get("NoninterestIncomeOther") != null) {
      values.put(
          "NoninterestIncome",
          Double.parseDouble(factByName.get("NoninterestIncomeOther").getValue()));
    }
    if (factByName.get("NonoperatingIncomeExpense") != null) {
      values.put(
          "NonoperatingIncomeLoss",
          Double.parseDouble(factByName.get("NonoperatingIncomeExpense").getValue()));
    }
    if (factByName.get("CostsAndExpenses") != null) {
      values.put(
          "OperatingAndNonoperatingCostsAndExpenses",
          Double.parseDouble(factByName.get("CostsAndExpenses").getValue()));
    }
    if (factByName.get("Revenues") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("Revenues").getValue()));
    } else if (factByName.get("SalesRevenueNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SalesRevenueNet").getValue()));
    } else if (factByName.get("SalesRevenueServicesNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SalesRevenueServicesNet").getValue()));
    } else if (factByName.get("SalesRevenueGoodsNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SalesRevenueGoodsNet").getValue()));
    } else if (factByName.get("RevenuesNetOfInterestExpense") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenuesNetOfInterestExpense").getValue()));
    } else if (factByName.get("HealthCareOrganizationRevenueNetOfPatientServiceRevenueProvisions")
        != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(
              factByName
                  .get("HealthCareOrganizationRevenueNetOfPatientServiceRevenueProvisions")
                  .getValue()));
    } else if (factByName.get("InterestAndDividendIncomeOperating") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("InterestAndDividendIncomeOperating").getValue()));
    } else if (factByName.get("RealEstateRevenueNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RealEstateRevenueNet").getValue()));
    } else if (factByName.get("ResultsOfOperationsRevenueFromOilAndGasProducingActivities")
        != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(
              factByName
                  .get("ResultsOfOperationsRevenueFromOilAndGasProducingActivities")
                  .getValue()));
    } else if (factByName.get("OilAndGasRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("OilAndGasRevenue").getValue()));
    } else if (factByName.get("FinancialServicesRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("FinancialServicesRevenue").getValue()));
    } else if (factByName.get("RegulatedAndUnregulatedOperatingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RegulatedAndUnregulatedOperatingRevenue").getValue()));
    } else if (factByName.get("ShippingAndHandlingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("ShippingAndHandlingRevenue").getValue()));
    } else if (factByName.get("SalesRevenueFromEnergyCommoditiesAndServices") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(
              factByName.get("SalesRevenueFromEnergyCommoditiesAndServices").getValue()));
    } else if (factByName.get("UtilityRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("UtilityRevenue").getValue()));
    } else if (factByName.get("PhaseInPlanAmountOfCapitalizedCostsRecovered") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(
              factByName.get("PhaseInPlanAmountOfCapitalizedCostsRecovered").getValue()));
    } else if (factByName.get("SecondaryProcessingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SecondaryProcessingRevenue").getValue()));
    } else if (factByName.get("RevenueSteamProductsAndServices") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenueSteamProductsAndServices").getValue()));
    } else if (factByName.get("RevenueFromLeasedAndOwnedHotels") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenueFromLeasedAndOwnedHotels").getValue()));
    } else if (factByName.get("FranchisorRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("FranchisorRevenue").getValue()));
    } else if (factByName.get("SubscriptionRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SubscriptionRevenue").getValue()));
    } else if (factByName.get("AdvertisingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("AdvertisingRevenue").getValue()));
    } else if (factByName.get("AdmissionsRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("AdmissionsRevenue").getValue()));
    } else if (factByName.get(
            "RevenueFromEnrollmentAndRegistrationFeesExcludingHospitalityEnterprises")
        != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(
              factByName
                  .get("RevenueFromEnrollmentAndRegistrationFeesExcludingHospitalityEnterprises")
                  .getValue()));
    } else if (factByName.get("MembershipDuesRevenueOnGoing") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("MembershipDuesRevenueOnGoing").getValue()));
    } else if (factByName.get("LicensesRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("LicensesRevenue").getValue()));
    } else if (factByName.get("RoyaltyRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RoyaltyRevenue").getValue()));
    } else if (factByName.get("SalesOfOilAndGasProspects") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SalesOfOilAndGasProspects").getValue()));
    } else if (factByName.get("ClearingFeesRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("ClearingFeesRevenue").getValue()));
    } else if (factByName.get("ReimbursementRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("ReimbursementRevenue").getValue()));
    } else if (factByName.get("RevenueFromGrants") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenueFromGrants").getValue()));
    } else if (factByName.get("RevenueOtherManufacturedProducts") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenueOtherManufacturedProducts").getValue()));
    } else if (factByName.get("ConstructionMaterialsRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("ConstructionMaterialsRevenue").getValue()));
    } else if (factByName.get("TimberRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("TimberRevenue").getValue()));
    } else if (factByName.get("RecyclingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RecyclingRevenue").getValue()));
    } else if (factByName.get("OtherSalesRevenueNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("OtherSalesRevenueNet").getValue()));
    } else if (factByName.get("SaleOfTrustAssetsToPayExpenses") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("SaleOfTrustAssetsToPayExpenses").getValue()));
    } else if (factByName.get("PassengerRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("PassengerRevenue").getValue()));
    } else if (factByName.get("VehicleTollRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("VehicleTollRevenue").getValue()));
    } else if (factByName.get("CargoAndFreightRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("CargoAndFreightRevenue").getValue()));
    } else if (factByName.get("NetInvestmentIncome") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("NetInvestmentIncome").getValue()));
    } else if (factByName.get("RevenuesExcludingInterestAndDividends") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenuesExcludingInterestAndDividends").getValue()));
    } else if (factByName.get("InvestmentBankingRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("InvestmentBankingRevenue").getValue()));
    } else if (factByName.get("UnderwritingIncomeLoss") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("UnderwritingIncomeLoss").getValue()));
    } else if (factByName.get("MarketDataRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("MarketDataRevenue").getValue()));
    } else if (factByName.get("ElectricUtilityRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("ElectricUtilityRevenue").getValue()));
    } else if (factByName.get("OilAndGasSalesRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("OilAndGasSalesRevenue").getValue()));
    } else if (factByName.get("HealthCareOrganizationRevenue") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("HealthCareOrganizationRevenue").getValue()));
    } else if (factByName.get("RevenueMineralSales") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("RevenueMineralSales").getValue()));
    } else if (factByName.get("InterestIncomeExpenseNet") != null) {
      values.put(
          "OperatingAndNonoperatingRevenues",
          Double.parseDouble(factByName.get("InterestIncomeExpenseNet").getValue()));
    }
    if (factByName.get("OperatingExpenses") != null) {
      values.put(
          "OperatingExpenses", Double.parseDouble(factByName.get("OperatingExpenses").getValue()));
    } else if (factByName.get("UtilitiesOperatingExpense") != null) {
      values.put(
          "OperatingExpenses",
          Double.parseDouble(factByName.get("UtilitiesOperatingExpense").getValue()));
    }
    if (factByName.get("OperatingIncomeLoss") != null) {
      values.put(
          "OperatingIncomeLoss",
          Double.parseDouble(factByName.get("OperatingIncomeLoss").getValue()));
    } else if (factByName.get(
            "IncomeLossFromContinuingOperationsBeforeInterestExpenseInterestIncomeIncomeTaxesExtraordinaryItemsNoncontrollingInterestsNet")
        != null) {
      values.put(
          "OperatingIncomeLoss",
          Double.parseDouble(
              factByName
                  .get(
                      "IncomeLossFromContinuingOperationsBeforeInterestExpenseInterestIncomeIncomeTaxesExtraordinaryItemsNoncontrollingInterestsNet")
                  .getValue()));
    }

    if (factByName.get("OtherOperatingIncome") != null) {
      values.put(
          "OtherOperatingIncomeExpenses",
          Double.parseDouble(factByName.get("OtherOperatingIncome").getValue()));
    }

    if (factByName.get("ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic")
        != null) {
      values.put(
          "ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic",
          Double.parseDouble(
              factByName
                  .get("ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic")
                  .getValue()));
    }
    if (factByName.get("PreferredStockDividendsAndOtherAdjustments") != null) {
      values.put(
          "PreferredStockDividendsAndOtherAdjustments",
          Double.parseDouble(
              factByName.get("PreferredStockDividendsAndOtherAdjustments").getValue()));
    }
    if (factByName.get("ProvisionForLoanLeaseAndOtherLosses") != null) {
      values.put(
          "ProvisionForLoanLeaseAndOtherLosses",
          Double.parseDouble(factByName.get("ProvisionForLoanLeaseAndOtherLosses").getValue()));
    } else if (factByName.get("ProvisionForLoanAndLeaseLosses") != null) {
      values.put(
          "ProvisionForLoanLeaseAndOtherLosses",
          Double.parseDouble(factByName.get("ProvisionForLoanAndLeaseLosses").getValue()));
    } else if (factByName.get("ProvisionForLoanLossesExpensed") != null) {
      values.put(
          "ProvisionForLoanLeaseAndOtherLosses",
          Double.parseDouble(factByName.get("ProvisionForLoanLossesExpensed").getValue()));
    }
    if (factByName.get("RedeemableNoncontrollingInterestEquityCarryingAmount") != null) {
      values.put(
          "RedeemableNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("RedeemableNoncontrollingInterestEquityCarryingAmount").getValue()));
    } else if (factByName.get("RedeemableNoncontrollingInterestEquityFairValue") != null) {
      values.put(
          "RedeemableNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("RedeemableNoncontrollingInterestEquityFairValue").getValue()));
    } else if (factByName.get("RedeemableNoncontrollingInterestEquityOtherFairValue") != null) {
      values.put(
          "RedeemableNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("RedeemableNoncontrollingInterestEquityOtherFairValue").getValue()));
    }
    if (factByName.get("RedeemableNoncontrollingInterestEquityCommonCarryingAmount") != null) {
      values.put(
          "RedeemableNoncontrollingInterestCommon",
          Double.parseDouble(
              factByName
                  .get("RedeemableNoncontrollingInterestEquityCommonCarryingAmount")
                  .getValue()));
    }
    if (factByName.get("RedeemableNoncontrollingInterestEquityOtherCarryingAmount") != null) {
      values.put(
          "RedeemableNoncontrollingInterestOther",
          Double.parseDouble(
              factByName
                  .get("RedeemableNoncontrollingInterestEquityOtherCarryingAmount")
                  .getValue()));
    }
    if (factByName.get("RedeemableNoncontrollingInterestEquityPreferredCarryingAmount") != null) {
      values.put(
          "RedeemableNoncontrollingInterestPreferred",
          Double.parseDouble(
              factByName
                  .get("RedeemableNoncontrollingInterestEquityPreferredCarryingAmount")
                  .getValue()));
    }
    if (factByName.get("ContractsRevenue") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("ContractsRevenue").getValue()));
    } else if (factByName.get("LicenseAndServicesRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("LicenseAndServicesRevenue").getValue()));
    } else if (factByName.get("RefiningAndMarketingRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("RefiningAndMarketingRevenue").getValue()));
    } else if (factByName.get("GasDomesticRegulatedRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("GasDomesticRegulatedRevenue").getValue()));
    } else if (factByName.get("GoldProductsAndServicesRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(factByName.get("GoldProductsAndServicesRevenue").getValue()));
    } else if (factByName.get("NaturalGasProductionRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("NaturalGasProductionRevenue").getValue()));
    } else if (factByName.get("InvestmentAdvisoryManagementAndAdministrativeFees") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName.get("InvestmentAdvisoryManagementAndAdministrativeFees").getValue()));
    } else if (factByName.get("AssetManagementFees1") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("AssetManagementFees1").getValue()));
    } else if (factByName.get("RevenueOilAndGasServices") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("RevenueOilAndGasServices").getValue()));
    } else if (factByName.get("ElectricalGenerationRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("ElectricalGenerationRevenue").getValue()));
    } else if (factByName.get("FoodAndBeverageRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("FoodAndBeverageRevenue").getValue()));
    } else if (factByName.get("RevenueFromPurchasedOilAndGas") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(factByName.get("RevenueFromPurchasedOilAndGas").getValue()));
    } else if (factByName.get("TechnologyServicesRevenue") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("TechnologyServicesRevenue").getValue()));
    } else if (factByName.get("HomeBuildingRevenue") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("HomeBuildingRevenue").getValue()));
    } else if (factByName.get("RetailRevenue") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("RetailRevenue").getValue()));
    } else if (factByName.get("ElectricalTransmissionAndDistributionRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName.get("ElectricalTransmissionAndDistributionRevenue").getValue()));
    } else if (factByName.get("SalesRevenueEnergyServices") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("SalesRevenueEnergyServices").getValue()));
    } else if (factByName.get("ElectricDomesticRegulatedRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(factByName.get("ElectricDomesticRegulatedRevenue").getValue()));
    } else if (factByName.get("OperatingLeasesIncomeStatementLeaseRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName.get("OperatingLeasesIncomeStatementLeaseRevenue").getValue()));
    } else if (factByName.get(
            "InterestAndFeeIncomeLoansConsumerInstallmentAutomobilesMarineAndOtherVehicles")
        != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName
                  .get(
                      "InterestAndFeeIncomeLoansConsumerInstallmentAutomobilesMarineAndOtherVehicles")
                  .getValue()));
    } else if (factByName.get("FeesAndCommissions") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("FeesAndCommissions").getValue()));
    } else if (factByName.get("LandSales") != null) {
      values.put("Revenues", Double.parseDouble(factByName.get("LandSales").getValue()));
    } else if (factByName.get("GasGatheringTransportationMarketingAndProcessingRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName
                  .get("GasGatheringTransportationMarketingAndProcessingRevenue")
                  .getValue()));
    } else if (factByName.get("RevenueFromRelatedParties") != null) {
      values.put(
          "Revenues", Double.parseDouble(factByName.get("RevenueFromRelatedParties").getValue()));
    } else if (factByName.get("HealthCareOrganizationPatientServiceRevenueLessProvisionForBadDebts")
        != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName
                  .get("HealthCareOrganizationPatientServiceRevenueLessProvisionForBadDebts")
                  .getValue()));
    } else if (factByName.get("HealthCareOrganizationPatientServiceRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(
              factByName.get("HealthCareOrganizationPatientServiceRevenue").getValue()));
    } else if (factByName.get("CoalProductsAndServicesRevenue") != null) {
      values.put(
          "Revenues",
          Double.parseDouble(factByName.get("CoalProductsAndServicesRevenue").getValue()));
    }
    if (factByName.get("BrokerageCommissionsRevenue") != null) {
      values.put(
          "RevenuesExcludingInterestDividends",
          Double.parseDouble(factByName.get("BrokerageCommissionsRevenue").getValue()));
    }

    if (factByName.get("UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic")
        != null) {
      values.put(
          "UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic",
          Double.parseDouble(
              factByName
                  .get("UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic")
                  .getValue()));
    } else if (factByName.get("UndistributedEarningsLossAlloc") != null) {
      values.put(
          "UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic",
          Double.parseDouble(factByName.get("UndistributedEarningsLossAlloc").getValue()));
    }

    return values;
  }

  public static Map<String, Double> findAndExtractBalanceSheetValues(
      Map<String, FactElement> factByName) {
    Map<String, Double> values = new HashMap<>();
    Map<String, FactElement> toUse = new HashMap<>();
    Map<String, FactElement> forUse = new HashMap<>();

    // Balance Sheet
    values.put("Assets", 0d); // BS
    values.put("CommitmentsAndContingencies", 0d); // BS
    values.put("Capitalization", 0d); // BS
    values.put("CurrentAssets", 0d); // BS
    values.put("CurrentLiabilities", 0d); // BS
    values.put("Equity", 0d); // BS
    values.put("EquityAttributableToNoncontrollingInterest", 0d); // BS
    values.put("EquityAttributableToParent", 0d); // BS
    values.put("FixedAssets", 0d); // BS
    values.put("Liabilities", 0d); // BS
    values.put("LiabilitiesAndEquity", 0d); // BS
    values.put("LongTermDebt", 0d); // BS
    values.put("NoncurrentAssets", 0d); // BS
    values.put("NoncurrentLiabilities", 0d); // BS
    values.put("OtherNoncurrentAssetsOfRegulatedEntity", 0d); // BS
    values.put("OtherNoncurrentLiabilitiesOfRegulatedEntity", 0d); // BS
    values.put("OtherThanFixedNoncurrentAssets", 0d); // BS
    values.put("PublicUtilitiesPropertyPlantAndEquipmentNet", 0d); // BS
    values.put("RedeemableNoncontrollingInterest", 0d); // BS
    values.put("RedeemableNoncontrollingInterestCommon", 0d); // BS
    values.put("RedeemableNoncontrollingInterestOther", 0d); // BS
    values.put("RedeemableNoncontrollingInterestPreferred", 0d); // BS
    values.put("TemporaryEquity", 0d); // BS
    values.put("TemporaryEquityAttributableToParent", 0d); // BS

    if (factByName.get("Assets") != null) {
      values.put("Assets", Double.parseDouble(factByName.get("Assets").getValue()));
    }
    if (factByName.get("CommitmentsAndContingencies") != null) {
      values.put(
          "CommitmentsAndContingencies",
          Double.parseDouble(factByName.get("CommitmentsAndContingencies").getValue()));
    }
    if (factByName.get("AssetsCurrent") != null) {
      values.put("CurrentAssets", Double.parseDouble(factByName.get("AssetsCurrent").getValue()));
    }
    if (factByName.get("LiabilitiesCurrent") != null) {
      values.put(
          "CurrentLiabilities",
          Double.parseDouble(factByName.get("LiabilitiesCurrent").getValue()));
    }
    if (factByName.get("StockholdersEquityIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "Equity",
          Double.parseDouble(
              factByName
                  .get("StockholdersEquityIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get("PartnersCapitalIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "Equity",
          Double.parseDouble(
              factByName
                  .get("PartnersCapitalIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    } else if (factByName.get(
            "LimitedLiabilityCompanyLlcMembersEquityIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "Equity",
          Double.parseDouble(
              factByName
                  .get(
                      "LimitedLiabilityCompanyLlcMembersEquityIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    }

    if (factByName.get("MinorityInterest") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("MinorityInterest").getValue()));
    } else if (factByName.get("PartnersCapitalAttributableToNoncontrollingInterest") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("PartnersCapitalAttributableToNoncontrollingInterest").getValue()));
    } else if (factByName.get("MembersEquityAttributableToNoncontrollingInterest") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("MembersEquityAttributableToNoncontrollingInterest").getValue()));
    } else if (factByName.get("MinorityInterestInLimitedPartnerships") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("MinorityInterestInLimitedPartnerships").getValue()));
    } else if (factByName.get("MinorityInterestInOperatingPartnerships") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("MinorityInterestInOperatingPartnerships").getValue()));
    } else if (factByName.get("MinorityInterestInPreferredUnitHolders") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("MinorityInterestInPreferredUnitHolders").getValue()));
    } else if (factByName.get("MinorityInterestInJointVentures") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("MinorityInterestInJointVentures").getValue()));
    } else if (factByName.get("OtherMinorityInterests") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("OtherMinorityInterests").getValue()));
    } else if (factByName.get("NonredeemableNoncontrollingInterest") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(factByName.get("NonredeemableNoncontrollingInterest").getValue()));
    } else if (factByName.get("NoncontrollingInterestInVariableInterestEntity") != null) {
      values.put(
          "EquityAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName.get("NoncontrollingInterestInVariableInterestEntity").getValue()));
    }

    if (factByName.get("StockholdersEquity") != null) {
      values.put(
          "EquityAttributableToParent",
          Double.parseDouble(factByName.get("StockholdersEquity").getValue()));
    } else if (factByName.get("PartnersCapital") != null) {
      values.put(
          "EquityAttributableToParent",
          Double.parseDouble(factByName.get("PartnersCapital").getValue()));
    } else if (factByName.get("MembersEquity") != null) {
      values.put(
          "EquityAttributableToParent",
          Double.parseDouble(factByName.get("MembersEquity").getValue()));
    } else if (factByName.get("GeneralPartnersCapitalAccount") != null) {
      values.put(
          "EquityAttributableToParent",
          Double.parseDouble(factByName.get("GeneralPartnersCapitalAccount").getValue()));
    }
    if (factByName.get("PropertyPlantAndEquipmentNet") != null) {
      values.put(
          "FixedAssets",
          Double.parseDouble(factByName.get("PropertyPlantAndEquipmentNet").getValue()));
    } else if (factByName.get("PublicUtilitiesPropertyPlantAndEquipmentNet") != null) {
      values.put(
          "FixedAssets",
          Double.parseDouble(
              factByName.get("PublicUtilitiesPropertyPlantAndEquipmentNet").getValue()));
    }
    if (factByName.get("Liabilities") != null) {
      values.put("Liabilities", Double.parseDouble(factByName.get("Liabilities").getValue()));
    }
    if (factByName.get("LiabilitiesAndStockholdersEquity") != null) {
      values.put(
          "LiabilitiesAndEquity",
          Double.parseDouble(factByName.get("LiabilitiesAndStockholdersEquity").getValue()));
    } else if (factByName.get("LiabilitiesAndPartnersCapital") != null) {
      values.put(
          "LiabilitiesAndEquity",
          Double.parseDouble(factByName.get("LiabilitiesAndPartnersCapital").getValue()));
    }

    if (factByName.get("LiabilitiesNoncurrent") != null) {
      values.put(
          "NoncurrentLiabilities",
          Double.parseDouble(factByName.get("LiabilitiesNoncurrent").getValue()));
    }
    if (factByName.get("AssetsNoncurrent") != null) {
      values.put(
          "OtherThanFixedNoncurrentAssets",
          Double.parseDouble(factByName.get("AssetsNoncurrent").getValue()));
    } else if (factByName.get(
            "AssetsNoncurrentOtherThanNoncurrentInvestmentsAndPropertyPlantAndEquipment")
        != null) {
      values.put(
          "OtherThanFixedNoncurrentAssets",
          Double.parseDouble(
              factByName
                  .get("AssetsNoncurrentOtherThanNoncurrentInvestmentsAndPropertyPlantAndEquipment")
                  .getValue()));
    }
    if (factByName.get(
            "TemporaryEquityCarryingAmountIncludingPortionAttributableToNoncontrollingInterests")
        != null) {
      values.put(
          "TemporaryEquity",
          Double.parseDouble(
              factByName
                  .get(
                      "TemporaryEquityCarryingAmountIncludingPortionAttributableToNoncontrollingInterests")
                  .getValue()));
    } else if (factByName.get("RedeemablePreferredStockCarryingAmount") != null) {
      values.put(
          "TemporaryEquity",
          Double.parseDouble(factByName.get("RedeemablePreferredStockCarryingAmount").getValue()));
    } else if (factByName.get("TemporaryEquityValueExcludingAdditionalPaidInCapital") != null) {
      values.put(
          "TemporaryEquity",
          Double.parseDouble(
              factByName.get("TemporaryEquityValueExcludingAdditionalPaidInCapital").getValue()));
    } else if (factByName.get("TemporaryEquityCarryingAmountAttributableToParent") != null) {
      values.put(
          "TemporaryEquity",
          Double.parseDouble(
              factByName.get("TemporaryEquityCarryingAmountAttributableToParent").getValue()));
    }
    return values;
  }

  public static Map<String, Double> findAndExtractCashFlowValues(
      Map<String, FactElement> factByName) {
    Map<String, Double> values = new HashMap<>();
    Map<String, FactElement> toUse = new HashMap<>();
    Map<String, FactElement> forUse = new HashMap<>();

    // Cash Flow
    values.put("ExchangeGainsLosses", 0d); // CF
    values.put("NetCashFlow", 0d); // CF
    values.put("NetCashFlowContinuing", 0d); // CF
    values.put("NetCashFlowDiscontinued", 0d); // CF
    values.put("NetCashFlowFromFinancingActivities", 0d); // CF
    values.put("NetCashFlowFromFinancingActivitiesContinuing", 0d); // CF
    values.put("NetCashFlowFromFinancingActivitiesDiscontinued", 0d); // CF
    values.put("NetCashFlowFromInvestingActivities", 0d); // CF
    values.put("NetCashFlowFromInvestingActivitiesContinuing", 0d); // CF
    values.put("NetCashFlowFromInvestingActivitiesDiscontinued", 0d); // CF
    values.put("NetCashFlowFromOperatingActivities", 0d); // CF
    values.put("NetCashFlowFromOperatingActivitiesContinuing", 0d); // CF
    values.put("NetCashFlowFromOperatingActivitiesDiscontinued", 0d); // CF

    if (factByName.get("EffectOfExchangeRateOnCashAndCashEquivalents") != null) {
      values.put(
          "ExchangeGainsLosses",
          Double.parseDouble(
              factByName.get("EffectOfExchangeRateOnCashAndCashEquivalents").getValue()));
    } else if (factByName.get("EffectOfExchangeRateOnCash") != null) {
      values.put(
          "ExchangeGainsLosses",
          Double.parseDouble(factByName.get("EffectOfExchangeRateOnCash").getValue()));
    } else if (factByName.get("EffectOfExchangeRateOnCashAndCashEquivalentsContinuingOperations")
        != null) {
      values.put(
          "ExchangeGainsLosses",
          Double.parseDouble(
              factByName
                  .get("EffectOfExchangeRateOnCashAndCashEquivalentsContinuingOperations")
                  .getValue()));
    } else if (factByName.get("EffectOfExchangeRateOnCashContinuingOperations") != null) {
      values.put(
          "ExchangeGainsLosses",
          Double.parseDouble(
              factByName.get("EffectOfExchangeRateOnCashContinuingOperations").getValue()));
    } else if (factByName.get("EffectOfExchangeRateOnCashAndCashEquivalentsDiscontinuedOperations")
        != null) {
      values.put(
          "ExchangeGainsLosses",
          Double.parseDouble(
              factByName
                  .get("EffectOfExchangeRateOnCashAndCashEquivalentsDiscontinuedOperations")
                  .getValue()));
    }

    if (factByName.get("CashAndCashEquivalentsPeriodIncreaseDecrease") != null) {
      values.put(
          "NetCashFlow",
          Double.parseDouble(
              factByName.get("CashAndCashEquivalentsPeriodIncreaseDecrease").getValue()));
    } else if (factByName.get("CashPeriodIncreaseDecrease") != null) {
      values.put(
          "NetCashFlow",
          Double.parseDouble(factByName.get("CashPeriodIncreaseDecrease").getValue()));
    } else if (factByName.get(
            "CashAndCashEquivalentsPeriodIncreaseDecreaseExcludingExchangeRateEffect")
        != null) {
      values.put(
          "NetCashFlow",
          Double.parseDouble(
              factByName
                  .get("CashAndCashEquivalentsPeriodIncreaseDecreaseExcludingExchangeRateEffect")
                  .getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInContinuingOperations") != null) {
      values.put(
          "NetCashFlowContinuing",
          Double.parseDouble(
              factByName.get("NetCashProvidedByUsedInContinuingOperations").getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInDiscontinuedOperations") != null) {
      values.put(
          "NetCashFlowDiscontinued",
          Double.parseDouble(
              factByName.get("NetCashProvidedByUsedInDiscontinuedOperations").getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInFinancingActivities") != null) {
      values.put(
          "NetCashFlowFromFinancingActivities",
          Double.parseDouble(
              factByName.get("NetCashProvidedByUsedInFinancingActivities").getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInFinancingActivitiesContinuingOperations") != null) {
      values.put(
          "NetCashFlowFromFinancingActivitiesContinuing",
          Double.parseDouble(
              factByName
                  .get("NetCashProvidedByUsedInFinancingActivitiesContinuingOperations")
                  .getValue()));
    }
    if (factByName.get("CashProvidedByUsedInFinancingActivitiesDiscontinuedOperations") != null) {
      values.put(
          "NetCashFlowFromFinancingActivitiesDiscontinued",
          Double.parseDouble(
              factByName
                  .get("CashProvidedByUsedInFinancingActivitiesDiscontinuedOperations")
                  .getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInInvestingActivities") != null) {
      values.put(
          "NetCashFlowFromInvestingActivities",
          Double.parseDouble(
              factByName.get("NetCashProvidedByUsedInInvestingActivities").getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInInvestingActivitiesContinuingOperations") != null) {
      values.put(
          "NetCashFlowFromInvestingActivitiesContinuing",
          Double.parseDouble(
              factByName
                  .get("NetCashProvidedByUsedInInvestingActivitiesContinuingOperations")
                  .getValue()));
    }
    if (factByName.get("CashProvidedByUsedInInvestingActivitiesDiscontinuedOperations") != null) {
      values.put(
          "NetCashFlowFromInvestingActivitiesDiscontinued",
          Double.parseDouble(
              factByName
                  .get("CashProvidedByUsedInInvestingActivitiesDiscontinuedOperations")
                  .getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInOperatingActivities") != null) {
      values.put(
          "NetCashFlowFromOperatingActivities",
          Double.parseDouble(
              factByName.get("NetCashProvidedByUsedInOperatingActivities").getValue()));
    }
    if (factByName.get("NetCashProvidedByUsedInOperatingActivitiesContinuingOperations") != null) {
      values.put(
          "NetCashFlowFromOperatingActivitiesContinuing",
          Double.parseDouble(
              factByName
                  .get("NetCashProvidedByUsedInOperatingActivitiesContinuingOperations")
                  .getValue()));
    }
    if (factByName.get("CashProvidedByUsedInOperatingActivitiesDiscontinuedOperations") != null) {
      values.put(
          "NetCashFlowFromOperatingActivitiesDiscontinued",
          Double.parseDouble(
              factByName
                  .get("CashProvidedByUsedInOperatingActivitiesDiscontinuedOperations")
                  .getValue()));
    }

    return values;
  }

  public static Map<String, Double> findAndExtractComprehensiveIncomeValues(
      Map<String, FactElement> factByName) {
    Map<String, Double> values = new HashMap<>();
    Map<String, FactElement> toUse = new HashMap<>();
    Map<String, FactElement> forUse = new HashMap<>();

    // Comprehensive Income
    values.put("ComprehensiveIncomeLoss", 0d); // CI
    values.put("ComprehensiveIncomeLossAttributableToNoncontrollingInterest", 0d); // CI
    values.put("ComprehensiveIncomeLossAttributableToParent", 0d); // CI
    values.put("OtherComprehensiveIncomeLoss", 0d); // CI
    values.put("OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest", 0d); // CI
    values.put("OtherComprehensiveIncomeLossAttributableToParent", 0d); // CI

    if (factByName.get(
            "ComprehensiveIncomeNetOfTaxIncludingPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "ComprehensiveIncomeLoss",
          Double.parseDouble(
              factByName
                  .get(
                      "ComprehensiveIncomeNetOfTaxIncludingPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    }
    if (factByName.get("ComprehensiveIncomeNetOfTaxAttributableToNoncontrollingInterest") != null) {
      values.put(
          "ComprehensiveIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName
                  .get("ComprehensiveIncomeNetOfTaxAttributableToNoncontrollingInterest")
                  .getValue()));
    }
    if (factByName.get("ComprehensiveIncomeNetOfTax") != null) {
      values.put(
          "ComprehensiveIncomeLossAttributableToParent",
          Double.parseDouble(factByName.get("ComprehensiveIncomeNetOfTax").getValue()));
    }

    if (factByName.get("OtherComprehensiveIncomeLossNetOfTax") != null) {
      values.put(
          "OtherComprehensiveIncomeLoss",
          Double.parseDouble(factByName.get("OtherComprehensiveIncomeLossNetOfTax").getValue()));
    }
    if (factByName.get(
            "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToNoncontrollingInterest")
        != null) {
      values.put(
          "OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest",
          Double.parseDouble(
              factByName
                  .get(
                      "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToNoncontrollingInterest")
                  .getValue()));
    }
    if (factByName.get("OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToParent") != null) {
      values.put(
          "OtherComprehensiveIncomeLossAttributableToParent",
          Double.parseDouble(
              factByName
                  .get("OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToParent")
                  .getValue()));
    }

    return values;
  }

  public static Map<String, Double> findAndExtractCompanyDetailsValues(
      Map<String, FactElement> factByName) {
    Map<String, Double> values = new HashMap<>();
    Map<String, FactElement> toUse = new HashMap<>();
    Map<String, FactElement> forUse = new HashMap<>();

    // Company details
    values.put("BalanceSheetDate", 0d);
    values.put("DocumentType", 0d);
    values.put("EntityCentralIndexKey", 0d);
    values.put("EntityFilerCategory", 0d);
    values.put("EntityRegistrantName", 0d);
    values.put("FiscalPeriodFocus", 0d);
    values.put("FiscalYearEnd", 0d);
    values.put("FiscalYearFocus", 0d);
    values.put("TradingSymbol", 0d);

    if (factByName.get("DocumentPeriodEndDate") != null) {
      values.put(
          "BalanceSheetDate",
          Double.parseDouble(factByName.get("DocumentPeriodEndDate").getValue()));
    }

    if (factByName.get("DocumentType") != null) {
      values.put("DocumentType", Double.parseDouble(factByName.get("DocumentType").getValue()));
    }
    if (factByName.get("EntityCentralIndexKey") != null) {
      values.put(
          "EntityCentralIndexKey",
          Double.parseDouble(factByName.get("EntityCentralIndexKey").getValue()));
    }
    if (factByName.get("EntityFilerCategory") != null) {
      values.put(
          "EntityFilerCategory",
          Double.parseDouble(factByName.get("EntityFilerCategory").getValue()));
    }
    if (factByName.get("EntityRegistrantName") != null) {
      values.put(
          "EntityRegistrantName",
          Double.parseDouble(factByName.get("EntityRegistrantName").getValue()));
    }
    if (factByName.get("DocumentFiscalPeriodFocus") != null) {
      values.put(
          "FiscalPeriodFocus",
          Double.parseDouble(factByName.get("DocumentFiscalPeriodFocus").getValue()));
    }
    if (factByName.get("CurrentFiscalYearEndDate") != null) {
      values.put(
          "FiscalYearEnd",
          Double.parseDouble(factByName.get("CurrentFiscalYearEndDate").getValue()));
    }
    if (factByName.get("DocumentFiscalYearFocus") != null) {
      values.put(
          "FiscalYearFocus",
          Double.parseDouble(factByName.get("DocumentFiscalYearFocus").getValue()));
    }
    if (factByName.get("TradingSymbol") != null) {
      values.put("TradingSymbol", Double.parseDouble(factByName.get("TradingSymbol").getValue()));
    }

    return values;
  }
}
