package xbrl.factProcessor.extractFundamentals.constants;

import java.util.HashMap;
import java.util.Map;

public class ConceptMappings {
  public static final Map<String, String[]> mappings = new HashMap<>();

  static {
    /*Balance Sheet*/
    String[] Assets = {"Assets", "AssetsCurrent"};
    /*Balance Sheet*/
    String[] CommitmentsAndContingencies = {"CommitmentsAndContingencies"};
    /*Balance Sheet*/
    String[] CurrentAssets = {"AssetsCurrent"};
    /*Balance Sheet*/
    String[] CurrentLiabilities = {"LiabilitiesCurrent"};
    /*Balance Sheet*/
    String[] Equity = {
      "StockholdersEquityIncludingPortionAttributableToNoncontrollingInterest",
      "PartnersCapitalIncludingPortionAttributableToNoncontrollingInterest",
      "LimitedLiabilityCompanyLlcMembersEquityIncludingPortionAttributableToNoncontrollingInterest"
    };
    /*Balance Sheet*/
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
    /*Balance Sheet*/
    String[] EquityAttributableToParent = {
      "StockholdersEquity", "PartnersCapital", "MembersEquity", "GeneralPartnersCapitalAccount"
    };
    /*Balance Sheet*/
    String[] Liabilities = {"Liabilities"};
    /*Balance Sheet*/
    String[] LiabilitiesAndEquity = {
      "LiabilitiesAndStockholdersEquity", "LiabilitiesAndPartnersCapital"
    };
    /*Balance Sheet*/
    String[] NoncurrentAssets = {"NoncurrentAssets"};
    /*Balance Sheet*/
    String[] NoncurrentLiabilities = {"LiabilitiesNoncurrent"};
    /*Balance Sheet??*/
    String[] RedeemableNoncontrollingInterest = {
      "RedeemableNoncontrollingInterestEquityCarryingAmount",
      "RedeemableNoncontrollingInterestEquityFairValue",
      "RedeemableNoncontrollingInterestEquityOtherFairValue"
    };
    /*Balance Sheet??*/
    String[] RedeemableNoncontrollingInterestCommon = {
      "RedeemableNoncontrollingInterestEquityCommonCarryingAmount"
    };
    /*Balance Sheet??*/
    String[] RedeemableNoncontrollingInterestOther = {
      "RedeemableNoncontrollingInterestEquityOtherCarryingAmount"
    };
    /*Balance Sheet*/
    String[] RedeemableNoncontrollingInterestPreferred = {
      "RedeemableNoncontrollingInterestEquityPreferredCarryingAmount"
    };
    /*Balance Sheet*/
    String[] OtherThanFixedNoncurrentAssets = {
      "AssetsNoncurrent",
      "AssetsNoncurrentOtherThanNoncurrentInvestmentsAndPropertyPlantAndEquipment"
    };
    /*Balance Sheet*/
    String[] FixedAssets = {
      "PropertyPlantAndEquipmentNet", "PublicUtilitiesPropertyPlantAndEquipmentNet"
    };
    /*Balance Sheet*/
    String[] TemporaryEquity = {
      "TemporaryEquityCarryingAmountIncludingPortionAttributableToNoncontrollingInterests",
      "RedeemablePreferredStockCarryingAmount",
      "TemporaryEquityValueExcludingAdditionalPaidInCapital",
      "TemporaryEquityCarryingAmountAttributableToParent"
    };
    /*Balance Sheet*/
    String[] TemporaryEquityAttributableToParent = {
      "TemporaryEquityCarryingAmountAttributableToParent"
    };
    /*Balance Sheet (Extended)*/
    String[] Inventory = {"Inventory"};

    // ==================================================================================================
    /*Cash Flow*/
    String[] ExchangeGainsLosses = {
      "EffectOfExchangeRateOnCashAndCashEquivalents",
      "EffectOfExchangeRateOnCash",
      "EffectOfExchangeRateOnCashAndCashEquivalentsContinuingOperations",
      "EffectOfExchangeRateOnCashContinuingOperations",
      "EffectOfExchangeRateOnCashAndCashEquivalentsDiscontinuedOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowContinuing = {"NetCashProvidedByUsedInContinuingOperations"};
    /*Cash Flow*/
    String[] NetCashFlowDiscontinued = {"NetCashProvidedByUsedInDiscontinuedOperations"};
    /*Cash Flow*/
    String[] NetCashFlowFromFinancingActivities = {"NetCashProvidedByUsedInFinancingActivities"};
    /*Cash Flow*/
    String[] NetCashFlowFromFinancingActivitiesContinuing = {
      "NetCashProvidedByUsedInFinancingActivitiesContinuingOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowFromFinancingActivitiesDiscontinued = {
      "CashProvidedByUsedInFinancingActivitiesDiscontinuedOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowFromInvestingActivities = {"NetCashProvidedByUsedInInvestingActivities"};
    /*Cash Flow*/
    String[] NetCashFlowFromInvestingActivitiesContinuing = {
      "NetCashProvidedByUsedInInvestingActivitiesContinuingOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowFromInvestingActivitiesDiscontinued = {
      "CashProvidedByUsedInInvestingActivitiesDiscontinuedOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowFromOperatingActivities = {"NetCashProvidedByUsedInOperatingActivities"};
    /*Cash Flow*/
    String[] NetCashFlowFromOperatingActivitiesContinuing = {
      "NetCashProvidedByUsedInOperatingActivitiesContinuingOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlowFromOperatingActivitiesDiscontinued = {
      "CashProvidedByUsedInOperatingActivitiesDiscontinuedOperations"
    };
    /*Cash Flow*/
    String[] NetCashFlow = {
      "CashAndCashEquivalentsPeriodIncreaseDecrease",
      "CashPeriodIncreaseDecrease",
      "CashAndCashEquivalentsPeriodIncreaseDecreaseExcludingExchangeRateEffect"
    };
    /*Cash Flow (Extended Item*/
    String [] Cash = {"Cash","CashEquivalentsAtCarryingValue ","CashAndDueFromBanks","CashCashEquivalentsAndShortTermInvestments"};
    // ==================================================================================================
    /*Income Statement*/
    String[] ComprehensiveIncomeLoss = {
      "ComprehensiveIncomeNetOfTaxIncludingPortionAttributableToNoncontrollingInterest"
    };
    /*Income Statement*/
    String[] ComprehensiveIncomeLossAttributableToNoncontrollingInterest = {
      "ComprehensiveIncomeNetOfTaxAttributableToNoncontrollingInterest"
    };
    /*Income Statement*/
    String[] ComprehensiveIncomeLossAttributableToParent = {"ComprehensiveIncomeNetOfTax"};
    /*Income Statement*/
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
    /*Income Statement*/
    String[] CostOfRevenueGoods = {"CostOfGoodsSold"};
    /*Income Statement*/
    String[] CostOfRevenueServices = {"CostOfServices"};
    /*Income Statement*/
    String[] CostsAndExpenses = {
      "CostsAndExpenses", "OperatingCostsAndExpenses", "BenefitsLossesAndExpenses"
    };
    /*Income Statement*/
    String[] GrossProfit = {"GrossProfit"};
    /*Income Statement*/
    String[] IncomeLossBeforeEquityMethodInvestments = {
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments"
    };
    /*Income Statement*/
    String[] IncomeLossFromEquityMethodInvestments = {
      "IncomeLossFromEquityMethodInvestments",
      "EquityMethodInvestmentSummarizedFinancialInformationNetIncomeLoss",
      "IncomeLossFromEquityMethodInvestmentsNetOfDividendsOrDistributions"
    };
    /*Income Statement*/
    String[] IncomeLossFromContinuingOperationsAfterTax = {
      "IncomeLossFromContinuingOperationsIncludingPortionAttributableToNoncontrollingInterest",
      "IncomeLossBeforeExtraordinaryItemsAndCumulativeEffectOfChangeInAccountingPrinciple",
      "IncomeLossFromContinuingOperations"
    };
    /*Income Statement*/
    String[] IncomeLossFromContinuingOperationsBeforeTax = {
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesExtraordinaryItemsNoncontrollingInterest",
      "IncomeLossFromContinuingOperationsBeforeIncomeTaxesMinorityInterestAndIncomeLossFromEquityMethodInvestments"
    };
    /*Income Statement*/
    String[] IncomeLossFromDiscontinuedOperationsNetOfTax = {
      "IncomeLossFromDiscontinuedOperationsNetOfTax",
      "DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax",
      "IncomeLossFromDiscontinuedOperationsNetOfTaxAttributableToReportingEntity",
      "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax"
    };
    /*Income Statement*/
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxAdjustmentToPriorYearGainLossOnDisposal = {
      "DiscontinuedOperationAmountOfAdjustmentToPriorPeriodGainLossOnDisposalNetOfTax"
    };
    /*Income Statement*/
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxProvisionForGainLossOnDisposal = {
      "DiscontinuedOperationProvisionForLossGainOnDisposalNetOfTax"
    };
    /*Income Statement*/
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxGainLossOnDisposal = {
      "DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax"
    };
    String[] IncomeLossFromDiscontinuedOperationsNetOfTaxDuringPhaseOut = {
      "DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax"
    };
    /*Income Statement*/
    String[] IncomeTaxExpenseBenefit = {
      "IncomeTaxExpenseBenefit",
      "IncomeTaxExpenseBenefitContinuingOperations",
      "FederalHomeLoanBankAssessments",
      "FederalIncomeTaxExpenseBenefitContinuingOperations",
      "AffordableHousingProgramAssessments"
    };
    /*Income Statement*/
    String[] IncomeTaxExpenseBenefitCurrent = {"CurrentIncomeTaxExpenseBenefit"};
    /*Income Statement*/
    String[] IncomeTaxExpenseBenefitDeferred = {"DeferredIncomeTaxExpenseBenefit"};
    /*Income Statement*/
    String[] InterestAndDebtExpense = {"InterestAndDebtExpense"};
    /*Income Statement*/
    String[] InterestAndDividendIncomeOperating = {"InterestAndDividendIncomeOperating"};
    /*Income Statement*/
    String[] InterestExpenseOperating = {
      "InterestExpense", "InterestExpenseBorrowings", "InterestExpenseDeposits"
    };
    /*Income Statement*/
    String[] NetIncomeLoss = {
      "ProfitLoss", "IncomeLossIncludingPortionAttributableToNoncontrollingInterest"
    };
    /*Income Statement*/
    String[] NetIncomeLossAttributableToNoncontrollingInterest = {
      "NetIncomeLossAttributableToNoncontrollingInterest",
      "IncomeLossAttributableToNoncontrollingInterest",
      "NetIncomeLossAttributableToNonredeemableNoncontrollingInterest",
      "NetIncomeLossAttributableToRedeemableNoncontrollingInterest",
      "IncomeLossFromContinuingOperationsAttributableToNoncontrollingEntity"
    };
    /*Income Statement*/
    String[] NetIncomeLossAttributableToNonredeemableNoncontrollingInterest = {
      "NetIncomeLossAttributableToNonredeemableNoncontrollingInterest"
    };
    /*Income Statement*/
    String[] NetIncomeLossAttributableToParent = {
      "NetIncomeLoss",
      "IncomeLossAttributableToParent",
      "NetIncomeLossAttributableToParentNetOfFederalHomeLoanBankAssessments"
    };
    /*Income Statement*/
    String[] NetIncomeLossAttributableToRedeemableNoncontrollingInterest = {
      "NetIncomeLossAttributableToRedeemableNoncontrollingInterest"
    };
    /*Income Statement*/
    String[] NetIncomeLossAvailableToCommonStockholdersBasic = {
      "NetIncomeLossAvailableToCommonStockholdersBasic"
    };
    /*Income Statement*/
    String[] NonoperatingIncomeLoss = {"NonoperatingIncomeExpense"};
    /*Income Statement*/
    String[] OperatingExpenses = {"OperatingExpenses", "UtilitiesOperatingExpense"};
    /*Income Statement*/
    String[] OperatingIncomeLoss = {
      "OperatingIncomeLoss",
      "IncomeLossFromContinuingOperationsBeforeInterestExpenseInterestIncomeIncomeTaxesExtraordinaryItemsNoncontrollingInterestsNet"
    };
    /*Income Statement*/
    String[] OtherComprehensiveIncomeLoss = {"OtherComprehensiveIncomeLossNetOfTax"};
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
    /*Income Statement*/
    String[] PreferredStockDividendsAndOtherAdjustments = {
      "PreferredStockDividendsAndOtherAdjustments"
    };
    /*Income Statement*/
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
    // ==================================================================================================
    String[] BenefitsCostsExpenses = {"BenefitsLossesAndExpenses"};
    String[] GainLossOnSalePreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome = {
      "GainLossOnSaleOfPreviouslyUnissuedStockBySubsidiaryOrEquityInvesteeNonoperatingIncome"
    };

    String[] NoninterestExpense = {"NoninterestExpense"};
    String[] NoninterestIncome = {"NoninterestIncome", "NoninterestIncomeOther"};
    String[] OtherComprehensiveIncomeLossAttributableToNoncontrollingInterest = {
      "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToNoncontrollingInterest"
    };
    String[] OtherComprehensiveIncomeLossAttributableToParent = {
      "OtherComprehensiveIncomeLossNetOfTaxPortionAttributableToParent"
    };
    String[] OtherOperatingIncomeExpenses = {"OtherOperatingIncome"};
    String[] InterestIncomeExpenseAfterProvisionForLosses = {
      "InterestIncomeExpenseAfterProvisionForLoanLoss",
      "NetInterestIncomeLossAfterProvisionForLoanLosses"
    };

    String[] InterestIncomeExpenseOperatingNet = {"InterestIncomeExpenseNet"};

    String[] OperatingAndNonoperatingCostsAndExpenses = {"CostsAndExpenses"};

    String[] ExtraordinaryItemsOfIncomeExpenseNetOfTax = {"ExtraordinaryItemNetOfTax"};

    String[] ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic = {
      "ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic"
    };

    String[] GainLossOnDispositionStockInSubsidiaryOrEquityMethodInvestee = {
      "GainLossOnSaleOfStockInSubsidiaryOrEquityMethodInvestee"
    };
    String[] GainLossOnSalePropertiesNetTax = {
      "GainLossOnSaleOfPropertiesNetOfApplicableIncomeTaxes"
    };
    String[] ProvisionForLoanLeaseAndOtherLosses = {
      "ProvisionForLoanLeaseAndOtherLosses",
      "ProvisionForLoanAndLeaseLosses",
      "ProvisionForLoanLossesExpensed"
    };

    String[] RevenuesExcludingInterestDividends = {
      "BrokerageCommissionsRevenue",
      "InvestmentBankingRevenue",
      "RevenuesExcludingInterestAndDividends"
    };
    String[] RevenuesNetInterestExpense = {"RevenuesNetOfInterestExpense"};

    String[] UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic = {
      "UndistributedEarningsLossAllocatedToParticipatingSecuritiesBasic"
    };
    // ==================================================================================================
    mappings.put("Assets", Assets);
    mappings.put("BenefitsCostsExpenses", BenefitsCostsExpenses);
    mappings.put("Cash", Cash);
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
