package xbrl.factProcessor.extractFundamentals.constants;

import java.util.HashMap;
import java.util.Map;

public class ConceptMappings {
  public static final Map<String, String[]> mappings = new HashMap<>();

  static {
    String[] Assets = {"Assets", "AssetsCurrent"};
    String[] BenefitsCostsExpenses = {"BenefitsLossesAndExpenses"};
    String[] CommitmentsAndContingencies = {"CommitmentsAndContingencies"};
    String[] ComprehensiveIncomeLoss = {
      "ComprehensiveIncomeNetOfTaxIncludingPortionAttributableToNoncontrollingInterest"
    };
    String[] ComprehensiveIncomeLossAttributableToNoncontrollingInterest = {
      "ComprehensiveIncomeNetOfTaxAttributableToNoncontrollingInterest"
    };
    String[] ComprehensiveIncomeLossAttributableToParent = {"ComprehensiveIncomeNetOfTax"};
    String[] CostOfRevenue = {
      "CostOfRevenue",
      "CostOfGoodsAndServicesSold",
      "CostOfServices",
      "CostOfGoodsSold",
      "CostOfGoodsSoldExcludingDepreciationDepletionAndAmortization",
      "CostOfGoodsSoldElectric",
      "DirectOperatingCosts",
      "CostOfGoodsSoldOilAndGas",
      "CostOfGoodsSoldElectric",
      "FinancialServicesCosts",
      "ContractRevenueCost",
      "CostOfRealEstateRevenue",
      "RefiningAndMarketingCosts",
      "CostOfNaturalGasPurchases",
      "CostOfGoldProductsAndServices",
      "CostOfRealEstateRevenue",
      "CostOfMerchandiseSalesBuyingAndOccupancyCosts",
      "CostOfServicesExcludingDepreciationDepletionAndAmortization",
      "CostOfServicesOilAndGas",
      "CostOfGoodsSoldDirectMaterials",
      "ExplorationExpenseMining",
      "DirectCostsOfHotels"
    };

    String[] CostOfRevenueGoods = {"CostOfGoodsSold"};
    String[] CostOfRevenueServices = {"CostOfServices"};
    String[] CostsAndExpenses = {"CostsAndExpenses", "OperatingCostsAndExpenses", "BenefitsLossesAndExpenses"};
    String[] CurrentAssets = {"AssetsCurrent"};
    String[] CurrentLiabilities = {"LiabilitiesCurrent"};
    String[] Equity = {
      "StockholdersEquityIncludingPortionAttributableToNoncontrollingInterest",
      "PartnersCapitalIncludingPortionAttributableToNoncontrollingInterest",
      "LimitedLiabilityCompanyLlcMembersEquityIncludingPortionAttributableToNoncontrollingInterest"
    };

    String[] EquityAttributableToNoncontrollingInterest = {
      "MinorityInterest",
      "PartnersCapitalAttributableToNoncontrollingInterest",
      "MembersEquityAttributableToNoncontrollingInterest",
      "MinorityInterestInLimitedPartnerships",
      "MinorityInterestInOperatingPartnerships",
      "MinorityInterestInPreferredUnitHolders",
      "MinorityInterestInJointVentures",
      "OtherMinorityInterests",
      "NonredeemableNoncontrollingInterest",
      "NoncontrollingInterestInVariableInterestEntity"
    };
    String[] EquityAttributableToParent = {
      "StockholdersEquity", "PartnersCapital", "MembersEquity", "GeneralPartnersCapitalAccount"
    };
    String[] ExchangeGainsLosses = {
      "EffectOfExchangeRateOnCashAndCashEquivalents",
      "EffectOfExchangeRateOnCash",
      "EffectOfExchangeRateOnCashAndCashEquivalentsContinuingOperations",
      "EffectOfExchangeRateOnCashContinuingOperations",
      "EffectOfExchangeRateOnCashAndCashEquivalentsDiscontinuedOperations"
    };
    String[] ExtraordinaryItemsOfIncomeExpenseNetOfTax = {"ExtraordinaryItemNetOfTax"};

    String[] FixedAssets = {
      "PropertyPlantAndEquipmentNet", "PublicUtilitiesPropertyPlantAndEquipmentNet"
    };
    String[] GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee = {
      "GainLossOnSaleOfStockInSubsidiaryOrEquityMethodInvestee"
    };
    String[] GainLossOnSalePropertiesNetTax = {
      "GainLossOnSaleOfPropertiesNetOfApplicableIncomeTaxes"
    };
    String[] GrossProfit = {"GrossProfit"};



    String[] GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome = {
      "GainLossOnSaleOfPreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome"
    };



    String[] IncomeLossBeforeEquityMethodInvestments = {
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments"
    };
    String[] IncomeLossFromEquityMethodInvestments = {
            "IncomeLossFromEquityMethodInvestments",
            "EquityMethodInvestmentSummarizedFinancialInformationNetIncomeLoss",
            "IncomeLossFromEquityMethodInvestmentsNetOfDividendsOrDistributions"
    };
    String[] IncomeLossFromContinuingOperationsAfterTax = {
      "IncomeLossFromContinuingOperationsIncludingPortionAttributableToNoncontrollingInterest",
      "IncomeLossBeforeExtraordinaryItemsAndCumulativeEffectOfChangeInAccountingPrinciple",
      "IncomeLossFromContinuingOperations"
    };
    String[] IncomeLossFromContinuingOperationsBeforeTax = {
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesExtraordinaryItemsNoncontrollingInterest",
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments"
    };

    String[] IncomeLossFromDiscontinuedOperationsNetOfTax = {
      "IncomeLossFromDiscontinuedOperationsNetOfTax",
      "DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax",
      "IncomeLossFromDiscontinuedOperationsNetOfTaxAttributableToReportingEntity",
      "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax"
    };
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal = {
            "DiscontinuedOperationAmountOfAdjustmentToPriorPeriodGainLossOnDisposalNetOfTax"
    };
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal = {
            "DiscontinuedOperationProvisionForLossGainOnDisposalNetOfTax"
    };

    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxGainLossOnDisposal = {
      "DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax"
    };
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut = {
      "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax"
    };
    String[] IncomeTaxExpenseBenefit = {
      "IncomeTaxExpenseBenefit",
      "IncomeTaxExpenseBenefitContinuingOperations",
      "FederalHomeLoanBankAssessments",
      "FederalIncomeTaxExpenseBenefitContinuingOperations",
      "AffordableHousingProgramAssessments"
    };
    String[] IncomeTaxExpenseBenefitCurrent = {"CurrentIncomeTaxExpenseBenefit"};
    String[] IncomeTaxExpenseBenefitDeferred = {"DeferredIncomeTaxExpenseBenefit"};

    String[] InterestAndDebtExpense = {"InterestAndDebtExpense"};
    String[] InterestAndDividendIncomeOperating = {"InterestAndDividendIncomeOperating"};
    String[] InterestExpenseOperating = {
      "InterestExpense", "InterestExpenseBorrowings", "InterestExpenseDeposits"
    };
    String[] InterestIncomeExpenseAfterProvisionForLosses = {
      "InterestIncomeExpenseAfterProvisionForLoanLoss",
      "NetInterestIncomeLossAfterProvisionForLoanLosses"
    };

    String[] InterestIncomeExpenseOperatingNet = {"InterestIncomeExpenseNet"};

    String[] Liabilities = {"Liabilities"};

    String[] LiabilitiesAndEquity = {
      "LiabilitiesAndStockholdersEquity", "LiabilitiesAndPartnersCapital"
    };
    String[] NetCashFlow = {
      "CashAndCashEquivalentsPeriodIncreaseDecrease",
      "CashPeriodIncreaseDecrease",
      "CashAndCashEquivalentsPeriodIncreaseDecreaseExcludingExchangeRateEffect"
    };

    String[] NetCashFlowContinuing = {"NetCashProvidedByUsedInContinuingOperations"};
    String[] NetCashFlowDiscontinued = {"NetCashProvidedByUsedInDiscontinuedOperations"};
    String[] NetCashFlowFromFinancingActivities = {"NetCashProvidedByUsedInFinancingActivities"};
    String[] NetCashFlowFromFinancingActivitiesContinuing = {
      "NetCashProvidedByUsedInFinancingActivitiesContinuingOperations"
    };
    String[] NetCashFlowFromFinancingActivitiesDiscontinued = {
      "CashProvidedByUsedInFinancingActivitiesDiscontinuedOperations"
    };
    String[] NetCashFlowFromInvestingActivities = {"NetCashProvidedByUsedInInvestingActivities"};
    String[] NetCashFlowFromInvestingActivitiesContinuing = {
      "NetCashProvidedByUsedInInvestingActivitiesContinuingOperations"
    };
    String[] NetCashFlowFromInvestingActivitiesDiscontinued = {
      "CashProvidedByUsedInInvestingActivitiesDiscontinuedOperations"
    };

    String[] NetCashFlowFromOperatingActivities = {"NetCashProvidedByUsedInOperatingActivities"};
    String[] NetCashFlowFromOperatingActivitiesContinuing = {
      "NetCashProvidedByUsedInOperatingActivitiesContinuingOperations"
    };
    String[] NetCashFlowFromOperatingActivitiesDiscontinued = {
      "CashProvidedByUsedInOperatingActivitiesDiscontinuedOperations"
    };
    String[] NetIncomeLoss = {
            "ProfitLoss", "IncomeLossIncludingPortionAttributableToNoncontrollingInterest"
    };
    String[] NetIncomeLossAttributableToNoncontrollingInterest = {
            "NetIncomeLossAttributableToNoncontrollingInterest",
            "IncomeLossAttributableToNoncontrollingInterest",
            "NetIncomeLossAttributableToNonredeemableNoncontrollingInterest",
            "NetIncomeLossAttributableToRedeemableNoncontrollingInterest",
            "IncomeLossFromContinuingOperationsAttributableToNoncontrollingEntity"
    };
    String[] NetIncomeLossAttributableToNonredeemableNoncontrollingInterest = {
            "NetIncomeLossAttributableToNonredeemableNoncontrollingInterest"
    };
    String[] NetIncomeLossAttributableToParent = {
            "NetIncomeLoss",
            "IncomeLossAttributableToParent",
            "NetIncomeLossAttributableToParentNetOfFederalHomeLoanBankAssessments"
    };
    String[] NetIncomeLossAttributableToRedeemableNoncontrollingInterest = {
            "NetIncomeLossAttributableToRedeemableNoncontrollingInterest"
    };
    String[] NetIncomeLossAvailableToCommonStockholdersBasic = {
      "NetIncomeLossAvailableToCommonStockholdersBasic"
    };


    String[] NoncurrentAssets = {"NoncurrentAssets"};
    String[] NoncurrentLiabilities = {"LiabilitiesNoncurrent"};
    String[] NoninterestExpense = {"NoninterestExpense"};
    String[] NoninterestIncome = {"NoninterestIncome", "NoninterestIncomeOther"};
    String[] NonoperatingIncomeLoss = {"NonoperatingIncomeExpense"};


    String[] OperatingExpenses = {"OperatingExpenses", "UtilitiesOperatingExpense"};

    String[] OperatingIncomeLoss = {
            "OperatingIncomeLoss",
            "IncomeLossFromContinuingOperationsBeforeInterestExpenseInterestIncomeIncomeTaxesExtraordinaryItemsNoncontrollingInterestsNet"
    };
    String[] OtherComprehensiveIncomeLoss = {"OtherComprehensiveIncomeLossNetOfTax"};
    String[] OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest = {
            "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToNoncontrollingInterest"
    };
    String[] OtherComprehensiveIncomeLossAttributableToParent = {
            "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToParent"
    };
    String[] OtherOperatingIncomeExpenses = {"OtherOperatingIncome"};
    String[] OtherThanFixedNoncurrentAssets = {
            "AssetsNoncurrent",
            "AssetsNoncurrentOtherThanNoncurrentInvestmentsAndPropertyPlantAndEquipment"
    };

    String[] OperatingAndNonoperatingCostsAndExpenses = {"CostsAndExpenses"};

    // not listed???
    String[] OperatingAndNonoperatingRevenues = {
      "Revenues",
      "SalesRevenueNet",
      "SalesRevenueServicesNet",
      "SalesRevenueGoodsNet",
      "RevenuesNetOfInterestExpense",
      "HealthCareOrganizationRevenueNetOfPatientServiceRevenueProvisions",
      "InterestAndDividendIncomeOperating",
      "RealEstateRevenueNet",
      "ResultsOfOperationsRevenueFromOilAndGasProducingActivities",
      "OilAndGasRevenue",
      "FinancialServicesRevenue",
      "RegulatedAndUnregulatedOperatingRevenue",
      "ShippingAndHandlingRevenue",
      "SalesRevenueFromEnergyCommoditiesAndServices",
      "UtilityRevenue",
      "PhaseInPlanAmountOfCapitalizedCostsRecovered",
      "SecondaryProcessingRevenue",
      "RevenueSteamProductsAndServices",
      "RevenueFromLeasedAndOwnedHotels",
      "FranchisorRevenue",
      "SubscriptionRevenue",
      "AdvertisingRevenue",
      "AdmissionsRevenue",
      "RevenueFromEnrollmentAndRegistrationFeesExcludingHospitalityEnterprises",
      "MembershipDuesRevenueOnGoing",
      "LicensesRevenue",
      "RoyaltyRevenue",
      "SalesOfOilAndGasProspects",
      "ClearingFeesRevenue",
      "ReimbursementRevenue",
      "RevenueFromGrants",
      "RevenueOtherManufacturedProducts",
      "ConstructionMaterialsRevenue",
      "TimberRevenue",
      "RecyclingRevenue",
      "OtherSalesRevenueNet",
      "SaleOfTrustAssetsToPayExpenses",
      "PassengerRevenue",
      "VehicleTollRevenue",
      "CargoAndFreightRevenue",
      "NetInvestmentIncome",
      "RevenuesExcludingInterestAndDividends",
      "InvestmentBankingRevenue",
      "UnderwritingIncomeLoss",
      "MarketDataRevenue",
      "ElectricUtilityRevenue",
      "OilAndGasSalesRevenue",
      "HealthCareOrganizationRevenue",
      "RevenueMineralSales",
    //  "InterestIncomeExpenseNet"// -> InterestIncomeExpenseOperatingNet
    };








    String[] ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic = {
      "ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic"
    };

    String[] PreferredStockDividendsAndOtherAdjustments = {
      "PreferredStockDividendsAndOtherAdjustments"
    };

    String[] ProvisionForLoanLeaseAndOtherLosses = {
      "ProvisionForLoanLeaseAndOtherLosses",
      "ProvisionForLoanAndLeaseLosses",
      "ProvisionForLoanLossesExpensed"
    };

    String[] RedeemableNoncontrollingInterest = {
      "RedeemableNoncontrollingInterestEquityCarryingAmount",
      "RedeemableNoncontrollingInterestEquityFairValue",
      "RedeemableNoncontrollingInterestEquityOtherFairValue"
    };

    String[] RedeemableNoncontrollingInterestCommon = {
      "RedeemableNoncontrollingInterestEquityCommonCarryingAmount"
    };
    String[] RedeemableNoncontrollingInterestOther = {
      "RedeemableNoncontrollingInterestEquityOtherCarryingAmount"
    };
    String[] RedeemableNoncontrollingInterestPreferred = {
      "RedeemableNoncontrollingInterestEquityPreferredCarryingAmount"
    };
    String[] RevenuesExcludingInterestDividends = {
            "BrokerageCommissionsRevenue",
            "InvestmentBankingRevenue",
            "RevenuesExcludingInterestAndDividends"
    };
    String[] RevenuesNetInterestExpense = {"RevenuesNetOfInterestExpense"};
    String[] Revenues = {
      "Revenues",
      "SalesRevenueNet",
      "SalesRevenueServicesNet",
      "SalesRevenueGoodsNet",
      "RevenuesNetOfInterestExpense",
      "RealEstateRevenueNet",
      "InterestAndDividendIncomeOperating",
      "RevenueMineralSales",
      "OilAndGasRevenue",
      "FinancialServicesRevenue",
      "RegulatedAndUnregulatedOperatingRevenue",
      "ShippingAndHandlingRevenue",
      "SalesRevenueFromEnergyCommoditiesAndServices",
      "UtilityRevenue",
      "PhaseInPlanAmountOfCapitalizedCostsRecovered",
      "SecondaryProcessingRevenue",
      "RevenueSteamProductsAndServices",
      "RevenueFromLeasedAndOwnedHotels",
      "FranchisorRevenue",
      "SubscriptionRevenue",
      "AdvertisingRevenue",
      "AdmissionsRevenue",
      "RevenueFromEnrollmentAndRegistrationFeesExcludingHospitalityEnterprises",
      "MembershipDuesRevenueOnGoing",
      "LicensesRevenue",
      "RoyaltyRevenue",
      "SalesOfOilAndGasProspects",
      "ClearingFeesRevenue",
      "ContractsRevenue",
      "RevenueFromGrants",
      "RevenueOtherManufacturedProducts",
      "ConstructionMaterialsRevenue",
      "TimberRevenue",
      "RecyclingRevenue",
      "PassengerRevenue",
      "SaleOfTrustAssetsToPayExpenses",
      "VehicleTollRevenue",
      "CargoAndFreightRevenue",
      "NetInvestmentIncome",
      "RevenuesExcludingInterestAndDividends",
      "InvestmentBankingRevenue",
      "UnderwritingIncomeLoss",
      "MarketDataRevenue",
      "ElectricUtilityRevenue",
      "ReimbursementRevenue",
      "LicenseAndServicesRevenue",
      "OilAndGasSalesRevenue",
      "RefiningAndMarketingRevenue",
      "GasDomesticRegulatedRevenue",
      "GoldProductsAndServicesRevenue",
      "NaturalGasProductionRevenue",
      "InvestmentAdvisoryManagementAndAdministrativeFees",
      "AssetManagementFees1",
      "RevenueOilAndGasServices",
      "ElectricalGenerationRevenue",
      "FoodAndBeverageRevenue",
      "RevenueFromPurchasedOilAndGas",
      "TechnologyServicesRevenue",
      "HomeBuildingRevenue",
      "RetailRevenue",
      "ElectricalTransmissionAndDistributionRevenue",
      "SalesRevenueEnergyServices",
      "OperatingLeasesIncomeStatementLeaseRevenue",
      "ElectricDomesticRegulatedRevenue",
      "OperatingLeasesIncomeStatementLeaseRevenue",
      "InterestAndFeeIncomeLoansConsumerInstallmentAutomobilesMarineAndOtherVehicles",
      "FeesAndCommissions",
      "LandSales",
      "GasGatheringTransportationMarketingAndProcessingRevenue",
      "RevenueFromRelatedParties",
      "HealthCareOrganizationRevenue",
      "HealthCareOrganizationRevenueNetOfPatientServiceRevenueProvisions",
      "HealthCareOrganizationPatientServiceRevenueLessProvisionForBadDebts",
      "HealthCareOrganizationPatientServiceRevenue",
      "OtherSalesRevenueNet",
      "InterestIncomeExpenseNet",
      "CoalProductsAndServicesRevenue"
    };





    String[] TemporaryEquity = {
      "TemporaryEquityCarryingAmountIncludingPortionAttributableToNoncontrollingInterests",
      "RedeemablePreferredStockCarryingAmount",
      "TemporaryEquityValueExcludingAdditionalPaidInCapital",
      "TemporaryEquityCarryingAmountAttributableToParent"
    };
    String[] TemporaryEquityAttributableToParent = {
      "TemporaryEquityCarryingAmountAttributableToParent"
    };

    String[] UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic = {
      "UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic"
    };

    mappings.put("Assets", Assets);
    mappings.put("BenefitsCostsExpenses", BenefitsCostsExpenses);
    mappings.put("ComprehensiveIncomeLoss", ComprehensiveIncomeLoss);
    mappings.put("CommitmentsAndContingencies", CommitmentsAndContingencies);
    mappings.put(
        "ComprehensiveIncomeLossAttributableToNoncontrollingInterest",
        ComprehensiveIncomeLossAttributableToNoncontrollingInterest);
    mappings.put(
        "ComprehensiveIncomeLossAttributableToParent", ComprehensiveIncomeLossAttributableToParent);
    mappings.put("CostOfRevenue", CostOfRevenue);
    mappings.put("CostOfRevenueGoods", CostOfRevenueGoods);
    mappings.put("CostOfRevenueServices", CostOfRevenueServices);
    mappings.put("CostsAndExpenses", CostsAndExpenses);
    mappings.put("CurrentAssets", CurrentAssets);
    mappings.put("CurrentLiabilities", CurrentLiabilities);
    mappings.put("Equity", Equity);
    mappings.put(
        "EquityAttributableToNoncontrollingInterest", EquityAttributableToNoncontrollingInterest);
    mappings.put("EquityAttributableToParent", EquityAttributableToParent);
    mappings.put("ExchangeGainsLosses", ExchangeGainsLosses);
    mappings.put(
        "ExtraordinaryItemsOfIncomeExpenseNetOfTax", ExtraordinaryItemsOfIncomeExpenseNetOfTax);
    mappings.put("FixedAssets", FixedAssets);
    mappings.put(
        "GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee",
        GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee);
    mappings.put(
        "GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome",
        GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome);
    mappings.put("GainLossOnSalePropertiesNetTax", GainLossOnSalePropertiesNetTax);
    mappings.put("GrossProfit", GrossProfit);
    mappings.put(
        "IncomeLossFromContinuingOperationsAfterTax", IncomeLossFromContinuingOperationsAfterTax);
    mappings.put(
        "IncomeLossFromContinuingOperationsBeforeTax", IncomeLossFromContinuingOperationsBeforeTax);
    mappings.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTax",
        IncomeLossFromDiscontinuedOperationsNetOfTax);
    mappings.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal",
        IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal);
    mappings.put(
        "IncomeLossBeforeEquityMethodInvestments", IncomeLossBeforeEquityMethodInvestments);
    mappings.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut",
        IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut);
    mappings.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxGainLossOnDisposal",
        IncomeLossFromDiscontinuedOperationsNetOfTaxGainLossOnDisposal);
    mappings.put(
        "IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal",
        IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal);
    mappings.put("IncomeLossFromEquityMethodInvestments", IncomeLossFromEquityMethodInvestments);
    mappings.put(
        "NetIncomeLossAttributableToRedeemableNoncontrollingInterest",
        NetIncomeLossAttributableToRedeemableNoncontrollingInterest);
    mappings.put(
        "NetIncomeLossAttributableToNonredeemableNoncontrollingInterest",
        NetIncomeLossAttributableToNonredeemableNoncontrollingInterest);
    mappings.put("IncomeTaxExpenseBenefit", IncomeTaxExpenseBenefit);
    mappings.put("IncomeTaxExpenseBenefitCurrent", IncomeTaxExpenseBenefitCurrent);
    mappings.put("IncomeTaxExpenseBenefitDeferred", IncomeTaxExpenseBenefitDeferred);
    mappings.put("InterestAndDebtExpense", InterestAndDebtExpense);
    mappings.put("InterestAndDividendIncomeOperating", InterestAndDividendIncomeOperating);
    mappings.put("InterestExpenseOperating", InterestExpenseOperating);
    mappings.put(
        "InterestIncomeExpenseAfterProvisionForLosses",
        InterestIncomeExpenseAfterProvisionForLosses);
    mappings.put("InterestIncomeExpenseOperatingNet", InterestIncomeExpenseOperatingNet);
    mappings.put("Liabilities", Liabilities);
    mappings.put("LiabilitiesAndEquity", LiabilitiesAndEquity);
    mappings.put("NetCashFlow", NetCashFlow);
    mappings.put("NetCashFlowContinuing", NetCashFlowContinuing);
    mappings.put("NetCashFlowDiscontinued", NetCashFlowDiscontinued);
    mappings.put("NetCashFlowFromFinancingActivities", NetCashFlowFromFinancingActivities);
    mappings.put(
        "NetCashFlowFromFinancingActivitiesContinuing",
        NetCashFlowFromFinancingActivitiesContinuing);
    mappings.put(
        "NetCashFlowFromFinancingActivitiesDiscontinued",
        NetCashFlowFromFinancingActivitiesDiscontinued);
    mappings.put("NetCashFlowFromInvestingActivities", NetCashFlowFromInvestingActivities);
    mappings.put(
        "NetCashFlowFromInvestingActivitiesContinuing",
        NetCashFlowFromInvestingActivitiesContinuing);
    mappings.put(
        "NetCashFlowFromInvestingActivitiesDiscontinued",
        NetCashFlowFromInvestingActivitiesDiscontinued);
    mappings.put("NetCashFlowFromOperatingActivities", NetCashFlowFromOperatingActivities);
    mappings.put(
        "NetCashFlowFromOperatingActivitiesContinuing",
        NetCashFlowFromOperatingActivitiesContinuing);
    mappings.put(
        "NetCashFlowFromOperatingActivitiesDiscontinued",
        NetCashFlowFromOperatingActivitiesDiscontinued);
    mappings.put("NetIncomeLoss", NetIncomeLoss);
    mappings.put(
        "NetIncomeLossAttributableToNoncontrollingInterest",
        NetIncomeLossAttributableToNoncontrollingInterest);
    mappings.put("NetIncomeLossAttributableToParent", NetIncomeLossAttributableToParent);
    mappings.put(
        "NetIncomeLossAvailableToCommonStockholdersBasic",
        NetIncomeLossAvailableToCommonStockholdersBasic);
    mappings.put("NoncurrentAssets", NoncurrentAssets);
    mappings.put("NoncurrentLiabilities", NoncurrentLiabilities);
    mappings.put("NoninterestExpense", NoninterestExpense);
    mappings.put("NoninterestIncome", NoninterestIncome);
    mappings.put("NonoperatingIncomeLoss", NonoperatingIncomeLoss);
    mappings.put(
        "OperatingAndNonoperatingCostsAndExpenses", OperatingAndNonoperatingCostsAndExpenses);
    mappings.put("OperatingAndNonoperatingRevenues", OperatingAndNonoperatingRevenues);
    mappings.put("OperatingExpenses", OperatingExpenses);
    mappings.put("OperatingIncomeLoss", OperatingIncomeLoss);
    mappings.put("OtherComprehensiveIncomeLoss", OtherComprehensiveIncomeLoss);
    mappings.put(
        "OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest",
        OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest);
    mappings.put(
        "OtherComprehensiveIncomeLossAttributableToParent",
        OtherComprehensiveIncomeLossAttributableToParent);
    mappings.put("OtherOperatingIncomeExpenses", OtherOperatingIncomeExpenses);
    mappings.put("OtherThanFixedNoncurrentAssets", OtherThanFixedNoncurrentAssets);
    mappings.put(
        "ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic",
        ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic);
    mappings.put(
        "PreferredStockDividendsAndOtherAdjustments", PreferredStockDividendsAndOtherAdjustments);
    mappings.put("ProvisionForLoanLeaseAndOtherLosses", ProvisionForLoanLeaseAndOtherLosses);
    mappings.put("RedeemableNoncontrollingInterest", RedeemableNoncontrollingInterest);
    mappings.put("RedeemableNoncontrollingInterestCommon", RedeemableNoncontrollingInterestCommon);
    mappings.put("RedeemableNoncontrollingInterestOther", RedeemableNoncontrollingInterestOther);
    mappings.put(
        "RedeemableNoncontrollingInterestPreferred", RedeemableNoncontrollingInterestPreferred);
    mappings.put("RevenuesNetInterestExpense", RevenuesNetInterestExpense);
    mappings.put("Revenues", Revenues);
    mappings.put("RevenuesExcludingInterestDividends", RevenuesExcludingInterestDividends);
    mappings.put("TemporaryEquity", TemporaryEquity);
    mappings.put("TemporaryEquityAttributableToParent", TemporaryEquityAttributableToParent);
    mappings.put(
        "UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic",
        UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic);
  }
}
