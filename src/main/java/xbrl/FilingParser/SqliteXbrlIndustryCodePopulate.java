package xbrl.FilingParser;

public interface SqliteXbrlIndustryCodePopulate {

    static String industryCodeInsert1 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(4315, 'SEC', 3576, 'Computer Communications Equipment', 4, 2424),\n" +
            "(4316, 'SEC', 4955, 'Hazardous Waste Management', 4, 2552),\n" +
            "(4317, 'SEC', 4990, 'Hazardous Waste Management', 3, 2792),\n" +
            "(4318, 'SEC', 4991, 'Hazardous Waste Management', 4, 4317),\n" +
            "(4319, 'SEC', 5412, 'Convenience Stores', 4, 2618),\n" +
            "(4320, 'SEC', 6170, 'Finance Lessors', 3, 2659),\n" +
            "(4322, 'SEC', 6180, 'Asset Backed Securities', 3, 2659),\n" +
            "(4323, 'SEC', 6189, 'Asset Backed Securities', 4, 4322),\n" +
            "(4324, 'SEC', 6190, 'Financial Services', 3, 2659),\n" +
            "(4325, 'SEC', 6199, 'Financial Services', 4, 4324),\n" +
            "(4326, 'SEC', 6532, 'Real Estate Dealers (for their own account)', 4, 2694),\n" +
            "(4327, 'SEC', 6770, 'Blank Checks', 3, 2703),\n" +
            "(4328, 'SEC', 6795, 'Mineral Royalty Traders', 4, 2704),\n" +
            "(4329, 'SEC', 7385, 'Telephone Interconnect Systems', 4, 2731),\n" +
            "(4337, 'SEC', 8880, 'American Depositary Receipts', 2, 4336),\n" +
            "(4338, 'SEC', 8888, 'Foreign Governments', 2, 4336),\n" +
            "(4339, 'SEC', 9995, 'Non-operating Establishments', 2, 4336),\n" +
            "(4340, 'SEC', 6172, 'Finance Lessors', 4, 4320),\n" +
            "(4336, 'SEC', 99, 'Miscellaneous', 1, NULL),\n" +
            "(1, 'NAICS', 11, 'Agriculture, Forestry, Fishing and Hunting', 1, NULL),\n" +
            "(132, 'NAICS', 21, 'Mining, Quarrying, and Oil and Gas Extraction', 1, NULL),\n" +
            "(98, 'NAICS', 113, 'Forestry and Logging', 2, 1),\n" +
            "(180, 'NAICS', 22, 'Utilities', 1, NULL),\n" +
            "(205, 'NAICS', 23, 'Construction', 1, NULL),\n" +
            "(278, 'NAICS', 31, 'Manufacturing', 4, NULL),\n" +
            "(572, 'NAICS', 327, 'Nonmetallic Mineral Product Manufacturing', 2, 278),\n" +
            "(700, 'NAICS', 333, 'Machinery Manufacturing', 2, 278),\n" +
            "(930, 'NAICS', 42, 'Wholesale Trade', 1, NULL),\n" +
            "(1095, 'NAICS', 44, 'Retail Trade', 4, NULL),\n" +
            "(1194, 'NAICS', 4482, 'Shoe Stores', 3, 1180),\n" +
            "(1262, 'NAICS', 48, 'Transportation and Warehousing', 4, NULL),\n" +
            "(1273, 'NAICS', 482, 'Rail Transportation', 2, 1262),\n" +
            "(1402, 'NAICS', 51, 'Information', 1, NULL),\n" +
            "(1480, 'NAICS', 52, 'Finance and Insurance', 1, NULL),\n" +
            "(1569, 'NAICS', 53, 'Real Estate and Rental and Leasing', 1, NULL),\n" +
            "(1624, 'NAICS', 54, 'Professional, Scientific, and Technical Services', 1, NULL),\n" +
            "(1591, 'NAICS', 532, 'Rental and Leasing Services', 2, 1569),\n" +
            "(1718, 'NAICS', 55, 'Management of Companies and Enterprises', 1, NULL),\n" +
            "(1725, 'NAICS', 56, 'Administrative and Support and Waste Management and Remediation Services', 1, NULL),\n" +
            "(1812, 'NAICS', 61, 'Educational Services', 1, NULL),\n" +
            "(1850, 'NAICS', 62, 'Health Care and Social Assistance', 1, NULL),\n" +
            "(1942, 'NAICS', 71, 'Arts, Entertainment, and Recreation', 1, NULL),\n" +
            "(2003, 'NAICS', 72, 'Accommodation and Food Services', 1, NULL),\n" +
            "(2037, 'NAICS', 81, 'Other Services (except Public Administration)', 1, NULL),\n" +
            "(2071, 'NAICS', 812, 'Personal and Laundry Services', 2, 2037),\n" +
            "(2135, 'NAICS', 92, 'Public Administration', 1, NULL),\n" +
            "(2900, 'SIC', 1099, 'Metal Ores, nec', 4, 2898),\n" +
            "(3040, 'SIC', 2099, 'Food Preparations, nec', 4, 3033),\n" +
            "(3162, 'SIC', 2541, 'Wood Partitions & Fixtures', 4, 3161),\n" +
            "(3295, 'SIC', 3161, 'Luggage', 4, 3294),\n" +
            "(2797, 'SEC', 90, 'Public Administration', 1, NULL),\n" +
            "(2789, 'SEC', 10, 'Mining', 1, NULL),\n" +
            "(2790, 'SEC', 15, 'Construction', 1, NULL),\n" +
            "(2791, 'SEC', 20, 'Manufacturing', 1, NULL),\n" +
            "(2792, 'SEC', 40, 'Transportation, Communications, Eletric, Gas and Sanitary Services', 1, NULL),\n" +
            "(2793, 'SEC', 50, 'Wholesale Trade', 1, NULL),\n" +
            "(2794, 'SEC', 52, 'Retail Trade', 1, NULL),\n" +
            "(2795, 'SEC', 60, 'Finance, Insurance, and Real Estate', 1, NULL),\n" +
            "(2796, 'SEC', 70, 'Services', 1, NULL),\n" +
            "(4314, 'SIC', 90, 'Public Administration', 1, NULL),\n" +
            "(4306, 'SIC', 10, 'Mining', 1, NULL),\n" +
            "(4307, 'SIC', 15, 'Construction', 1, NULL),\n" +
            "(4308, 'SIC', 20, 'Manufacturing', 1, NULL),\n" +
            "(4309, 'SIC', 40, 'Transportation, Communications, Eletric, Gas and Sanitary Services', 1, NULL),\n" +
            "(4310, 'SIC', 50, 'Wholesale Trade', 1, NULL),\n" +
            "(4311, 'SIC', 52, 'Retail Trade', 1, NULL),\n" +
            "(4312, 'SIC', 60, 'Finance, Insurance, and Real Estate', 1, NULL),\n" +
            "(4313, 'SIC', 70, 'Services', 1, NULL),\n" +
            "(2788, 'SEC', 1, 'Agriculture, Forestry, And Fishing', 1, NULL),\n" +
            "(4305, 'SIC', 1, 'Agriculture, Forestry, And Fishing', 1, NULL),\n" +
            "(2513, 'SEC', 4010, 'Railroads', 3, 2512),\n" +
            "(2799, 'SIC', 110, 'Cash Grains', 3, 2798),\n" +
            "(3420, 'SIC', 3510, 'Engines & Turbines', 3, 3419),\n" +
            "(2868, 'SIC', 800, 'FORESTRY', 2, 4305),\n" +
            "(2804, 'SIC', 119, 'Cash Grains, nec', 4, 2799),\n" +
            "(2800, 'SIC', 111, 'Wheat', 4, 2799),\n" +
            "(2801, 'SIC', 112, 'Rice', 4, 2799),\n" +
            "(2802, 'SIC', 115, 'Corn', 4, 2799),\n" +
            "(2803, 'SIC', 116, 'Soybeans', 4, 2799),\n" +
            "(2810, 'SIC', 139, 'Field Crops, Except Cash Grains, nec', 4, 2805),\n" +
            "(2809, 'SIC', 134, 'Potato Growers', 4, 2805),\n" +
            "(2808, 'SIC', 133, 'Sugarcane And Sugar Beets', 4, 2805),\n" +
            "(2807, 'SIC', 132, 'Tobacco Growers', 4, 2805),\n" +
            "(2806, 'SIC', 131, 'Cotton', 4, 2805),\n" +
            "(2812, 'SIC', 161, 'Vegetables And Melons', 4, 2811),\n" +
            "(2814, 'SIC', 171, 'Berry Crops', 4, 2813),\n" +
            "(2815, 'SIC', 172, 'Grapes/Vineyards', 4, 2813),\n" +
            "(2816, 'SIC', 173, 'Tree Nuts', 4, 2813),\n" +
            "(2214, 'SEC', 900, 'FISHING, HUNTING & TRAPPING', 2, 2788),\n" +
            "(2213, 'SEC', 800, 'FORESTRY', 2, 2788),\n" +
            "(105, 'NAICS', 1133, 'Logging', 3, 98),\n" +
            "(368, 'NAICS', 313, 'TEXTile Mills', 2, 278),\n" +
            "(2817, 'SIC', 174, 'Citrus Fruits', 4, 2813),\n" +
            "(2818, 'SIC', 175, 'Deciduous Tree Fruits/Orchards', 4, 2813),\n" +
            "(2819, 'SIC', 179, 'Fruits & Tree Nuts, nec', 4, 2813),\n" +
            "(2821, 'SIC', 181, 'Ornamental Nursery Products', 4, 2820),\n" +
            "(2822, 'SIC', 182, 'Food Crops Grown Under Cover', 4, 2820),\n" +
            "(2824, 'SIC', 191, 'General Farms, Primarily Crop', 4, 2823),\n" +
            "(2829, 'SIC', 213, 'Hogs', 4, 2826),\n" +
            "(2877, 'SIC', 912, 'Finfish', 4, 2876),\n" +
            "(2830, 'SIC', 214, 'Sheep & Goats', 4, 2826),\n" +
            "(2828, 'SIC', 212, 'Beef Cattle, Except Feedlots', 4, 2826),\n" +
            "(2827, 'SIC', 211, 'Beef Cattle Feedlots', 4, 2826),\n" +
            "(2831, 'SIC', 219, 'General Livestock, Except Dairy/Poultry', 4, 2826),\n" +
            "(2833, 'SIC', 241, 'Dairy Farms', 4, 2832),\n" +
            "(2978, 'SIC', 1794, 'Excavation Work', 4, 2975),\n" +
            "(2979, 'SIC', 1795, 'Wrecking & Demolition Work', 4, 2975),\n" +
            "(2980, 'SIC', 1796, 'Installing Building Equipment, nec', 4, 2975),\n" +
            "(2981, 'SIC', 1799, 'Special Trade Contractors, nec', 4, 2975),\n" +
            "(2976, 'SIC', 1791, 'Structural Steel Erection', 4, 2975),\n" +
            "(2242, 'SEC', 2011, 'Meat Packing Plants', 4, 2241),\n" +
            "(2244, 'SEC', 2015, 'Poultry Slaughtering & Processing', 4, 2241),\n" +
            "(2243, 'SEC', 2013, 'Sausages & Other Prepared Meats', 4, 2241),\n" +
            "(2984, 'SIC', 2011, 'Meat Packing Plants', 4, 2983),\n" +
            "(2986, 'SIC', 2015, 'Poultry Slaughtering & Processing', 4, 2983),\n" +
            "(2985, 'SIC', 2013, 'Sausages & Other Prepared Meats', 4, 2983),\n" +
            "(2246, 'SEC', 2024, 'Ice Cream & Frozen Desserts', 4, 2245),\n" +
            "(2990, 'SIC', 2023, 'Dry, Condensed & Evaporated Products', 4, 2987),\n" +
            "(2991, 'SIC', 2024, 'Ice Cream & Frozen Desserts', 4, 2987),\n" +
            "(2989, 'SIC', 2022, 'Cheese, Natural & Processed', 4, 2987),\n" +
            "(2988, 'SIC', 2021, 'Creamery Butter', 4, 2987),\n" +
            "(2992, 'SIC', 2026, 'Fluid Milk', 4, 2987),\n" +
            "(2248, 'SEC', 2033, 'Canned Fruits & Vegetables', 4, 2247),\n" +
            "(2999, 'SIC', 2038, 'Frozen Specialties, nec', 4, 2993),\n" +
            "(2994, 'SIC', 2032, 'Canned Specialties', 4, 2993),\n" +
            "(2998, 'SIC', 2037, 'Frozen Fruits & Vegetables', 4, 2993),\n" +
            "(2997, 'SIC', 2035, 'Pickles, Sauces & Salad Dressings', 4, 2993),\n" +
            "(2607, 'SEC', 5211, 'Lumber & Other Building Materials', 4, 2606),\n" +
            "(3806, 'SIC', 5211, 'Lumber & Other Building Materials', 4, 3805),\n" +
            "(3808, 'SIC', 5231, 'Paint, Glass & Wallpaper Stores', 4, 3807),\n" +
            "(3810, 'SIC', 5251, 'Hardware Stores', 4, 3809),\n" +
            "(3812, 'SIC', 5261, 'Retail Nurseries & Garden Stores', 4, 3811),\n" +
            "(2609, 'SEC', 5271, 'Mobile Homes Dealers', 4, 2608),\n" +
            "(3814, 'SIC', 5271, 'Mobile Homes Dealers', 4, 3813),\n" +
            "(2612, 'SEC', 5311, 'Department Stores', 4, 2611),\n" +
            "(3817, 'SIC', 5311, 'Department Stores', 4, 3816),\n" +
            "(2614, 'SEC', 5331, 'Variety Stores', 4, 2613),\n" +
            "(3819, 'SIC', 5331, 'Variety Stores', 4, 3818),\n" +
            "(2616, 'SEC', 5399, 'Miscellaneous General Merchandise Stores', 4, 2615),\n" +
            "(3821, 'SIC', 5399, 'Miscellaneous General Merchandise Stores', 4, 3820),\n" +
            "(2619, 'SEC', 5411, 'Grocery Stores', 4, 2618),\n" +
            "(3824, 'SIC', 5411, 'Grocery Stores', 4, 3823),\n" +
            "(3826, 'SIC', 5421, 'Meat & Fish Markets', 4, 3825),\n" +
            "(3828, 'SIC', 5431, 'Fruit & Vegetable Markets', 4, 3827),\n" +
            "(3830, 'SIC', 5441, 'Candy, Nut & Confectionery Stores', 4, 3829),\n" +
            "(3832, 'SIC', 5451, 'Dairy Products Stores', 4, 3831),\n" +
            "(3834, 'SIC', 5461, 'Retail Bakeries', 4, 3833),\n" +
            "(3836, 'SIC', 5499, 'Miscellaneous Food Stores', 4, 3835),\n" +
            "(3839, 'SIC', 5511, 'New & Used Car Dealers', 4, 3838),\n" +
            "(3841, 'SIC', 5521, 'Used Car Dealers', 4, 3840),\n" +
            "(2622, 'SEC', 5531, 'Auto & Home Supply Stores', 4, 2621),\n" +
            "(3919, 'SIC', 6011, 'Federal Reserve Banks', 4, 3918),\n" +
            "(2711, 'SEC', 7011, 'Hotels & Motels', 4, 2710),\n" +
            "(4009, 'SIC', 7011, 'Hotels & Motels', 4, 4008),\n" +
            "(4011, 'SIC', 7021, 'Rooming & Boarding Houses', 4, 4010),\n" +
            "(4013, 'SIC', 7032, 'Sporting & Recreational Camps', 4, 4012),\n" +
            "(4014, 'SIC', 7033, 'Trailer Parks & Campsites', 4, 4012),\n" +
            "(4016, 'SIC', 7041, 'Membership Basis Organization Hotels', 4, 4015),\n" +
            "(4024, 'SIC', 7217, 'Carpet & Upholstery Cleaners', 4, 4018),\n" +
            "(4020, 'SIC', 7212, 'Garment Pressing & Cleaners'' Agents', 4, 4018),\n" +
            "(4021, 'SIC', 7213, 'Linen Supply', 4, 4018),\n" +
            "(4022, 'SIC', 7215, 'Coin-Operated Laundries & Cleaning', 4, 4018),\n" +
            "(4023, 'SIC', 7216, 'Drycleaning Plants, Except Rug', 4, 4018),\n" +
            "(12, 'NAICS', 111150, 'Corn Farming', 5, 13),\n" +
            "(107, 'NAICS', 11331, 'Logging', 4, 105),\n" +
            "(1151, 'NAICS', 44521, 'Meat Markets', 4, 1149),\n" +
            "(1773, 'NAICS', 561622, 'Locksmiths', 5, 1771),\n" +
            "(2315, 'SEC', 2770, 'Greeting Cards', 3, 2302),\n" +
            "(2860, 'SIC', 752, 'Animal Specialty Services', 4, 2858),\n" +
            "(2837, 'SIC', 253, 'Turkey Farms', 4, 2834),\n" +
            "(2839, 'SIC', 259, 'Poultry & Eggs, nec', 4, 2834),\n" +
            "(2838, 'SIC', 254, 'Poultry Farms', 4, 2834),\n" +
            "(2836, 'SIC', 252, 'Chicken Eggs', 4, 2834),\n" +
            "(2835, 'SIC', 251, 'Broiler, Fryer & Roaster Chickens', 4, 2834),\n" +
            "(2843, 'SIC', 273, 'Aquaculture', 4, 2840),\n" +
            "(2844, 'SIC', 279, 'Animal Specialties, nec', 4, 2840),\n" +
            "(2841, 'SIC', 271, 'Fur Bearing Animals & Rabbits', 4, 2840),\n" +
            "(2842, 'SIC', 272, 'Horses & Other Equines', 4, 2840),\n" +
            "(2846, 'SIC', 291, 'General Farms, Primarily Animal', 4, 2845),\n" +
            "(2849, 'SIC', 711, 'Soil Preparation Services', 4, 2848),\n" +
            "(2854, 'SIC', 724, 'Cotton Ginning', 4, 2850),\n" +
            "(2853, 'SIC', 723, 'Crop Preparation Services For Market', 4, 2850),\n" +
            "(2851, 'SIC', 721, 'Crop Planting & Protecting', 4, 2850),\n" +
            "(2852, 'SIC', 722, 'Crop Harvesting', 4, 2850),\n" +
            "(2856, 'SIC', 741, 'Veterinary Services for Livestock', 4, 2855),\n" +
            "(2857, 'SIC', 742, 'Veterinary Services, Specialties', 4, 2855),\n" +
            "(2859, 'SIC', 751, 'Livestock Services, Except Veterinary', 4, 2858),\n" +
            "(2862, 'SIC', 761, 'Farm Labor Contractors', 4, 2861),\n" +
            "(2863, 'SIC', 762, 'Farm Management Services', 4, 2861),\n" +
            "(2866, 'SIC', 782, 'Lawn & Garden Services', 4, 2864),\n" +
            "(2867, 'SIC', 783, 'Ornamental Shrub & Tree Services', 4, 2864),\n" +
            "(2865, 'SIC', 781, 'Landscape Counseling & Planning', 4, 2864),\n" +
            "(2870, 'SIC', 811, 'Timber Tracts', 4, 2869),\n" +
            "(2872, 'SIC', 831, 'Forest Products', 4, 2871),\n" +
            "(2874, 'SIC', 851, 'Forestry Services', 4, 2873),\n" +
            "(2879, 'SIC', 919, 'Miscellaneous Marine Products', 4, 2876),\n" +
            "(2878, 'SIC', 913, 'Shellfish', 4, 2876),\n" +
            "(2881, 'SIC', 921, 'Fish Hatcheries & Preserves', 4, 2880),\n" +
            "(2883, 'SIC', 971, 'Hunting, Trapping & Game Propagation', 4, 2882),\n" +
            "(2886, 'SIC', 1011, 'Iron Ores', 4, 2885),\n" +
            "(2888, 'SIC', 1021, 'Copper Ores', 4, 2887),\n" +
            "(2890, 'SIC', 1031, 'Lead & Zinc Ores', 4, 2889),\n" +
            "(2893, 'SIC', 1044, 'Silver Ores', 4, 2891),\n" +
            "(2892, 'SIC', 1041, 'Gold Ores', 4, 2891),\n" +
            "(2895, 'SIC', 1061, 'Ferroalloy Ores, Except Vanadium', 4, 2894),\n" +
            "(2223, 'SEC', 1311, 'Crude Petroleum & Natural Gas', 4, 2222),\n" +
            "(2911, 'SIC', 1311, 'Crude Petroleum & Natural Gas', 4, 2910),\n" +
            "(2913, 'SIC', 1321, 'Natural Gas Liquids', 4, 2912),\n" +
            "(2226, 'SEC', 1382, 'Oil & Gas Exploration Services', 4, 2224),\n" +
            "(2227, 'SEC', 1389, 'Oil & Gas Field Services, nec', 4, 2224),\n" +
            "(2225, 'SEC', 1381, 'Drilling Oil & Gas Wells', 4, 2224),\n" +
            "(2917, 'SIC', 1389, 'Oil & Gas Field Services, nec', 4, 2914),\n" +
            "(2915, 'SIC', 1381, 'Drilling Oil & Gas Wells', 4, 2914),\n" +
            "(2916, 'SIC', 1382, 'Oil & Gas Exploration Services', 4, 2914),\n" +
            "(2920, 'SIC', 1411, 'Dimension Stone', 4, 2919),\n" +
            "(2924, 'SIC', 1429, 'Crushed & Broken Stone, nec', 4, 2921),\n" +
            "(2922, 'SIC', 1422, 'Crushed & Broken Limestone', 4, 2921),\n" +
            "(2923, 'SIC', 1423, 'Crushed & Broken Granite', 4, 2921),\n" +
            "(2926, 'SIC', 1442, 'Construction Sand & Gravel', 4, 2925),\n" +
            "(2927, 'SIC', 1446, 'Industrial Sand', 4, 2925),\n" +
            "(2929, 'SIC', 1455, 'Kaolin & Ball Clay', 4, 2928),\n" +
            "(2930, 'SIC', 1459, 'Clay & Related Minerals, nec', 4, 2928),\n" +
            "(2934, 'SIC', 1479, 'Chemical & Fertilizer Mining nec', 4, 2931),\n" +
            "(2932, 'SIC', 1474, 'Potash, Soda & Borate Minerals', 4, 2931),\n" +
            "(2933, 'SIC', 1475, 'Phosphate Rock', 4, 2931),\n" +
            "(2936, 'SIC', 1481, 'Nonmetallic Minerals Services', 4, 2935),\n" +
            "(2938, 'SIC', 1499, 'Miscellaneous Nonmetallic Minerals', 4, 2937),\n" +
            "(2942, 'SIC', 1522, 'Residential Construction, nec', 4, 2940),\n" +
            "(2941, 'SIC', 1521, 'Single-Family HoConstruction', 4, 2940),\n" +
            "(2232, 'SEC', 1531, 'Operative Builders', 4, 2231),\n" +
            "(2944, 'SIC', 1531, 'Operative Builders', 4, 2943),\n" +
            "(2946, 'SIC', 1541, 'Industrial Buildings & Warehouses', 4, 2945),\n" +
            "(2947, 'SIC', 1542, 'Nonresidential Construction, nec', 4, 2945),\n" +
            "(2950, 'SIC', 1611, 'Highway & Street Construction', 4, 2949),\n" +
            "(2236, 'SEC', 1623, 'Water, Sewer & Utility Lines', 4, 2235),\n" +
            "(2954, 'SIC', 1629, 'Heavy Construction, nec', 4, 2951),\n" +
            "(2953, 'SIC', 1623, 'Water, Sewer & Utility Lines', 4, 2951),\n" +
            "(2952, 'SIC', 1622, 'Bridge, Tunnel & Elevated Highway', 4, 2951),\n" +
            "(2957, 'SIC', 1711, 'Plumbing, Heating, Air-Conditioning', 4, 2956),\n" +
            "(2996, 'SIC', 2034, 'Dehydrated Fruits, Vegetables & Soups', 4, 2993),\n" +
            "(2995, 'SIC', 2033, 'Canned Fruits & Vegetables', 4, 2993),\n" +
            "(3005, 'SIC', 2046, 'Wet Corn Milling', 4, 3000),\n" +
            "(3007, 'SIC', 2048, 'Prepared Feeds, nec', 4, 3000),\n" +
            "(3006, 'SIC', 2047, 'Dog & Cat Food', 4, 3000),\n" +
            "(3004, 'SIC', 2045, 'Prepared Flour Mixes & Doughs', 4, 3000),\n" +
            "(3003, 'SIC', 2044, 'Rice Milling', 4, 3000),\n" +
            "(3002, 'SIC', 2043, 'Cereal Breakfast Foods', 4, 3000),\n" +
            "(3001, 'SIC', 2041, 'Flour & Other Grain Mill Products', 4, 3000),\n" +
            "(2251, 'SEC', 2052, 'Cookies & Crackers', 4, 2250),\n" +
            "(3009, 'SIC', 2051, 'Bread, Cake & Related Products', 4, 3008),\n" +
            "(3011, 'SIC', 2053, 'Frozen Bakery Products, Except Bread', 4, 3008),\n" +
            "(3010, 'SIC', 2052, 'Cookies & Crackers', 4, 3008),\n" +
            "(3015, 'SIC', 2063, 'Beet Sugar', 4, 3012),\n" +
            "(3019, 'SIC', 2068, 'Salted & Roasted Nuts & Seeds', 4, 3012),\n" +
            "(3018, 'SIC', 2067, 'Chewing Gum', 4, 3012),\n" +
            "(3017, 'SIC', 2066, 'Chocolate & Cocoa Products', 4, 3012),\n" +
            "(3016, 'SIC', 2064, 'Candy & Other Confectionery Products', 4, 3012),\n" +
            "(3072, 'SIC', 2273, 'Carpets & Rugs', 4, 3071),\n" +
            "(3075, 'SIC', 2282, 'Throwing & Winding Mills', 4, 3073),\n" +
            "(3076, 'SIC', 2284, 'Thread Mills', 4, 3073),\n" +
            "(3074, 'SIC', 2281, 'Yarn Spinning Mills', 4, 3073),\n" +
            "(3079, 'SIC', 2296, 'Tire Cord & Fabrics', 4, 3077),\n" +
            "(3082, 'SIC', 2299, 'TEXTile Goods, nec', 4, 3077),\n" +
            "(3081, 'SIC', 2298, 'Cordage & Twine', 4, 3077),\n" +
            "(3080, 'SIC', 2297, 'Nonwoven Fabrics', 4, 3077),\n" +
            "(3078, 'SIC', 2295, 'Coated Fabrics, Not Rubberized', 4, 3077),\n" +
            "(3085, 'SIC', 2311, 'Men''s & Boys'' Suits & Coats', 4, 3084),\n" +
            "(3087, 'SIC', 2321, 'Men''s & Boys'' Shirts', 4, 3086),\n" +
            "(3091, 'SIC', 2326, 'Men''s & Boys'' Work Clothing', 4, 3086),\n" +
            "(3092, 'SIC', 2329, 'Men''s & Boys'' Clothing, nec', 4, 3086),\n" +
            "(3088, 'SIC', 2322, 'Men''s & Boys'' Underwear & Nightwear', 4, 3086),\n" +
            "(3089, 'SIC', 2323, 'Men''s & Boys'' Neckwear', 4, 3086),\n" +
            "(3090, 'SIC', 2325, 'Men''s & Boys'' Trousers & Slacks', 4, 3086),\n" +
            "(3097, 'SIC', 2339, 'Women''s & Misses'' Outerwear, nec', 4, 3093),\n" +
            "(3094, 'SIC', 2331, 'Women''s & Misses'' Blouses & Shirts', 4, 3093),\n" +
            "(3095, 'SIC', 2335, 'Women''s & Misses'' & Junior''s Dresses', 4, 3093),\n" +
            "(3096, 'SIC', 2337, 'Women''s & Misses'' Suits & Coats', 4, 3093),\n" +
            "(3100, 'SIC', 2342, 'Bras, Girdles & Allied Garments', 4, 3098),\n" +
            "(3099, 'SIC', 2341, 'Women''s & Children''s Underwear', 4, 3098),\n" +
            "(3107, 'SIC', 2371, 'Fur Goods', 4, 3106),\n" +
            "(3147, 'SIC', 2499, 'Wood Products, nec', 4, 3144),\n" +
            "(3145, 'SIC', 2491, 'Wood Preserving', 4, 3144),\n" +
            "(3146, 'SIC', 2493, 'Reconstituted Wood Products', 4, 3144),\n" +
            "(2285, 'SEC', 2511, 'Wood Household Furniture', 4, 2284),\n" +
            "(3155, 'SIC', 2519, 'Household Furniture, nec', 4, 3149),\n" +
            "(3154, 'SIC', 2517, 'Wood TV & Radio Cabinets', 4, 3149),\n" +
            "(3153, 'SIC', 2515, 'Mattresses & Bedsprings', 4, 3149),\n" +
            "(3152, 'SIC', 2514, 'Metal Household Furniture', 4, 3149),\n" +
            "(3151, 'SIC', 2512, 'Upholstered Household Furniture', 4, 3149),\n" +
            "(3150, 'SIC', 2511, 'Wood Household Furniture', 4, 3149),\n" +
            "(2287, 'SEC', 2522, 'Office Furniture, Except Wood', 4, 2286),\n" +
            "(3158, 'SIC', 2522, 'Office Furniture, Except Wood', 4, 3156),\n" +
            "(3157, 'SIC', 2521, 'Wood Office Furniture', 4, 3156),\n" +
            "(2289, 'SEC', 2531, 'Public Building & Related Furniture', 4, 2288),\n" +
            "(3160, 'SIC', 2531, 'Public Building & Related Furniture', 4, 3159),\n" +
            "(3163, 'SIC', 2542, 'Partitions & Fixtures, Except Wood', 4, 3161),\n" +
            "(3165, 'SIC', 2591, 'Drapery Hardware & Blinds & Shades', 4, 3164),\n" +
            "(3166, 'SIC', 2599, 'Furniture & Fixtures, nec', 4, 3164),\n" +
            "(2294, 'SEC', 2611, 'Pulp Mills', 4, 2293),\n" +
            "(3169, 'SIC', 2611, 'Pulp Mills', 4, 3168),\n" +
            "(2296, 'SEC', 2621, 'Paper Mills', 4, 2295),\n" +
            "(3171, 'SIC', 2621, 'Paper Mills', 4, 3170),\n" +
            "(2298, 'SEC', 2631, 'Paperboard Mills', 4, 2297),\n" +
            "(3173, 'SIC', 2631, 'Paperboard Mills', 4, 3172),\n" +
            "(3175, 'SIC', 2652, 'Setup Paperboard Boxes', 4, 3174),\n" +
            "(3179, 'SIC', 2657, 'Folding Paperboard Boxes', 4, 3174),\n" +
            "(3177, 'SIC', 2655, 'Fiber Cans, Drums & Similar Products', 4, 3174),\n" +
            "(3176, 'SIC', 2653, 'Corrugated & Solid Fiber Boxes', 4, 3174),\n" +
            "(3178, 'SIC', 2656, 'Sanitary Food Containers', 4, 3174),\n" +
            "(2301, 'SEC', 2673, 'Bags: Plastic, Laminated & Coated', 4, 2300),\n" +
            "(3188, 'SIC', 2678, 'Stationery Products', 4, 3180),\n" +
            "(3189, 'SIC', 2679, 'Converted Paper Products, nec', 4, 3180),\n" +
            "(3183, 'SIC', 2673, 'Bags: Plastic, Laminated & Coated', 4, 3180),\n" +
            "(3184, 'SIC', 2674, 'Bags: Uncoated Paper & Multiwall', 4, 3180),\n" +
            "(3185, 'SIC', 2675, 'Die-Cut Paper & Board', 4, 3180),\n" +
            "(3186, 'SIC', 2676, 'Sanitary Paper Products', 4, 3180),\n" +
            "(3187, 'SIC', 2677, 'Envelopes', 4, 3180),\n" +
            "(3197, 'SIC', 2732, 'Book Printing', 4, 3195),\n" +
            "(3196, 'SIC', 2731, 'Book Publishing', 4, 3195),\n" +
            "(2311, 'SEC', 2741, 'Miscellaneous Publishing', 4, 2310),\n" +
            "(3199, 'SIC', 2741, 'Miscellaneous Publishing', 4, 3198),\n" +
            "(3202, 'SIC', 2754, 'Commercial Printing, Gravure', 4, 3200),\n" +
            "(3203, 'SIC', 2759, 'Commercial Printing, nec', 4, 3200),\n" +
            "(3201, 'SIC', 2752, 'Commercial Printing, Lithographic', 4, 3200),\n" +
            "(2314, 'SEC', 2761, 'Manifold Business Forms', 4, 2313),\n" +
            "(3205, 'SIC', 2761, 'Manifold Business Forms', 4, 3204),\n" +
            "(2316, 'SEC', 2771, 'Greeting Cards', 4, 2315),\n" +
            "(3207, 'SIC', 2771, 'Greeting Cards', 4, 3206),\n" +
            "(3209, 'SIC', 2782, 'Blankbooks & Looseleaf Binders', 4, 3208),\n" +
            "(3210, 'SIC', 2789, 'Bookbinding & Related Work', 4, 3208),\n" +
            "(3212, 'SIC', 2791, 'Typesetting', 4, 3211),\n" +
            "(3213, 'SIC', 2796, 'Platemaking Services', 4, 3211),\n" +
            "(3216, 'SIC', 2812, 'Alkalies & Chlorine', 4, 3215),\n" +
            "(3217, 'SIC', 2813, 'Industrial Gases', 4, 3215),\n" +
            "(3218, 'SIC', 2816, 'Inorganic Pigments', 4, 3215),\n" +
            "(3219, 'SIC', 2819, 'Industrial Inorganic Chemicals, nec', 4, 3215),\n" +
            "(2322, 'SEC', 2821, 'Plastics Materials & Resins', 4, 2321),\n" +
            "(3222, 'SIC', 2822, 'Synthetic Rubber', 4, 3220),\n" +
            "(3221, 'SIC', 2821, 'Plastics Materials & Resins', 4, 3220),\n" +
            "(3223, 'SIC', 2823, 'Cellulosic Manmade Fibers', 4, 3220),\n" +
            "(3248, 'SIC', 2892, 'Explosives', 4, 3246),\n" +
            "(3259, 'SIC', 2992, 'Lubricating Oils & Greases', 4, 3258),\n" +
            "(2344, 'SEC', 3011, 'Tires & Inner Tubes', 4, 2343),\n" +
            "(3263, 'SIC', 3011, 'Tires & Inner Tubes', 4, 3262),\n" +
            "(2346, 'SEC', 3021, 'Rubber & Plastics Footwear', 4, 2345),\n" +
            "(3265, 'SIC', 3021, 'Rubber & Plastics Footwear', 4, 3264),\n" +
            "(3267, 'SIC', 3052, 'Rubber & Plastics Hose & Belting', 4, 3266),\n" +
            "(3268, 'SIC', 3053, 'Gaskets, Packing & Sealing Devices', 4, 3266),\n" +
            "(3271, 'SIC', 3069, 'Fabricated Rubber Products, nec', 4, 3269),\n" +
            "(3270, 'SIC', 3061, 'Mechanical Rubber Goods', 4, 3269),\n" +
            "(2352, 'SEC', 3089, 'Plastics Products, nec', 4, 2349),\n" +
            "(2350, 'SEC', 3081, 'Unsupported Plastics Film & Sheet', 4, 2349),\n" +
            "(2351, 'SEC', 3086, 'Plastics Foam Products', 4, 2349),\n" +
            "(3276, 'SIC', 3084, 'Plastics Pipe', 4, 3272),\n" +
            "(3278, 'SIC', 3086, 'Plastics Foam Products', 4, 3272),\n" +
            "(3279, 'SIC', 3087, 'Custom Compound Purchased Resins', 4, 3272),\n" +
            "(3280, 'SIC', 3088, 'Plastics Plumbing Fixtures', 4, 3272),\n" +
            "(3281, 'SIC', 3089, 'Plastics Products, nec', 4, 3272),\n" +
            "(3273, 'SIC', 3081, 'Unsupported Plastics Film & Sheet', 4, 3272),\n" +
            "(3277, 'SIC', 3085, 'Plastics Bottles', 4, 3272),\n" +
            "(3274, 'SIC', 3082, 'Unsupported Plastics Profile Shapes', 4, 3272),\n" +
            "(3275, 'SIC', 3083, 'Laminated Plastics Plate, Sheet, and Profile Shapes', 4, 3272),\n" +
            "(3284, 'SIC', 3111, 'Leather Tanning & Finishing', 4, 3283),\n" +
            "(3286, 'SIC', 3131, 'Footwear Cut Stock', 4, 3285),\n" +
            "(3291, 'SIC', 3149, 'Footwear, Except Rubber, nec', 4, 3287),\n" +
            "(3289, 'SIC', 3143, 'Men''s Footwear, Except Athletic', 4, 3287),\n" +
            "(3290, 'SIC', 3144, 'Women''s Footwear, Except Athletic', 4, 3287),\n" +
            "(3288, 'SIC', 3142, 'House Slippers', 4, 3287),\n" +
            "(3293, 'SIC', 3151, 'Leather Gloves & Mittens', 4, 3292),\n" +
            "(3298, 'SIC', 3172, 'Personal Leather Goods, nec', 4, 3296),\n" +
            "(3297, 'SIC', 3171, 'Women''s Handbags & Purses', 4, 3296),\n" +
            "(3300, 'SIC', 3199, 'Leather Goods, nec', 4, 3299),\n" +
            "(2357, 'SEC', 3211, 'Flat Glass', 4, 2356),\n" +
            "(3303, 'SIC', 3211, 'Flat Glass', 4, 3302),\n" +
            "(2359, 'SEC', 3221, 'Glass Containers', 4, 2358),\n" +
            "(3305, 'SIC', 3221, 'Glass Containers', 4, 3304),\n" +
            "(3306, 'SIC', 3229, 'Pressed & Blown Glass, nec', 4, 3304),\n" +
            "(2361, 'SEC', 3231, 'Products of Purchased Glass', 4, 2360),\n" +
            "(3308, 'SIC', 3231, 'Products of Purchased Glass', 4, 3307),\n" +
            "(3321, 'SIC', 3269, 'Pottery Products, nec', 4, 3316),\n" +
            "(3319, 'SIC', 3263, 'Semivitreous Table & Kitchenware', 4, 3316),\n" +
            "(3317, 'SIC', 3261, 'Vitreous Plumbing Fixtures', 4, 3316),\n" +
            "(3318, 'SIC', 3262, 'Vitreous China Table & Kitchenware', 4, 3316),\n" +
            "(3320, 'SIC', 3264, 'Porcelain Electrical Supplies', 4, 3316),\n" +
            "(2367, 'SEC', 3272, 'Concrete Products, nec', 4, 2366),\n" +
            "(3325, 'SIC', 3273, 'Ready-Mixed Concrete', 4, 3322),\n" +
            "(3324, 'SIC', 3272, 'Concrete Products, nec', 4, 3322),\n" +
            "(3326, 'SIC', 3274, 'Lime', 4, 3322),\n" +
            "(3327, 'SIC', 3275, 'Gypsum Products', 4, 3322),\n" +
            "(3323, 'SIC', 3271, 'Concrete Block & Brick', 4, 3322),\n" +
            "(2369, 'SEC', 3281, 'Cut Stone & Stone Products', 4, 2368),\n" +
            "(3329, 'SIC', 3281, 'Cut Stone & Stone Products', 4, 3328),\n" +
            "(3336, 'SIC', 3299, 'Nonmetallic Mineral Products, nec', 4, 3330),\n" +
            "(3331, 'SIC', 3291, 'Abrasive Products', 4, 3330),\n" +
            "(3332, 'SIC', 3292, 'Asbestos Products', 4, 3330),\n" +
            "(3333, 'SIC', 3295, 'Minerals, Ground or Treated', 4, 3330),\n" +
            "(3334, 'SIC', 3296, 'Mineral Wool', 4, 3330),\n" +
            "(3335, 'SIC', 3297, 'Nonclay Refractories', 4, 3330),\n" +
            "(2373, 'SEC', 3312, 'Blast Furnaces & Steel Mills', 4, 2372),\n" +
            "(2374, 'SEC', 3317, 'Steel Pipe & Tubes', 4, 2372),\n" +
            "(3341, 'SIC', 3315, 'Steel Wire & Related Products', 4, 3338),\n" +
            "(3342, 'SIC', 3316, 'Cold Finishing of Steel Shapes', 4, 3338),\n" +
            "(3343, 'SIC', 3317, 'Steel Pipe & Tubes', 4, 3338),\n" +
            "(3339, 'SIC', 3312, 'Blast Furnaces & Steel Mills', 4, 3338),\n" +
            "(3340, 'SIC', 3313, 'Electrometallurgical Products', 4, 3338),\n" +
            "(3347, 'SIC', 3324, 'Steel Investment Foundries', 4, 3344),\n" +
            "(3348, 'SIC', 3325, 'Steel Foundries, nec', 4, 3344),\n" +
            "(3346, 'SIC', 3322, 'Malleable Iron Foundries', 4, 3344),\n" +
            "(3345, 'SIC', 3321, 'Gray & Ductile Iron Foundries', 4, 3344),\n" +
            "(2377, 'SEC', 3334, 'Primary Aluminum', 4, 2376),\n" +
            "(2387, 'SEC', 3412, 'Metal Barrels, Drums & Pails', 4, 2385),\n" +
            "(2386, 'SEC', 3411, 'Metal Cans', 4, 2385),\n" +
            "(3374, 'SIC', 3412, 'Metal Barrels, Drums & Pails', 4, 3372),\n" +
            "(3373, 'SIC', 3411, 'Metal Cans', 4, 3372),\n" +
            "(3377, 'SIC', 3423, 'Hand & Edge Tools, nec', 4, 3375),\n" +
            "(3379, 'SIC', 3429, 'Hardware, nec', 4, 3375),\n" +
            "(3378, 'SIC', 3425, 'Saw Blades & Handsaws', 4, 3375),\n" +
            "(3376, 'SIC', 3421, 'Cutlery', 4, 3375),\n" +
            "(2390, 'SEC', 3433, 'Heating Equipment, Except Electric', 4, 2389),\n" +
            "(3382, 'SIC', 3432, 'Plumbing Fixture Fittings & Trim', 4, 3380),\n" +
            "(3383, 'SIC', 3433, 'Heating Equipment, Except Electric', 4, 3380),\n" +
            "(3381, 'SIC', 3431, 'Metal Sanitary Ware', 4, 3380),\n" +
            "(2392, 'SEC', 3442, 'Metal Doors, Sash & Trim', 4, 2391),\n" +
            "(2393, 'SEC', 3443, 'Fabricated Plate Work (Boiler Shops)', 4, 2391),\n" +
            "(2395, 'SEC', 3448, 'Prefabricated Metal Buildings', 4, 2391),\n" +
            "(2394, 'SEC', 3444, 'Sheet Metal Work', 4, 2391),\n" +
            "(3391, 'SIC', 3449, 'Miscellaneous Metal Work', 4, 3384),\n" +
            "(3390, 'SIC', 3448, 'Prefabricated Metal Buildings', 4, 3384),\n" +
            "(3389, 'SIC', 3446, 'Architectural Metal Work', 4, 3384),\n" +
            "(3388, 'SIC', 3444, 'Sheet Metal Work', 4, 3384),\n" +
            "(3387, 'SIC', 3443, 'Fabricated Plate Work (Boiler Shops)', 4, 3384),\n" +
            "(3386, 'SIC', 3442, 'Metal Doors, Sash & Trim', 4, 3384),\n" +
            "(3432, 'SIC', 3536, 'Hoists, Cranes & Monorails', 4, 3426),\n" +
            "(3431, 'SIC', 3535, 'Conveyors & Conveying Equipment', 4, 3426),\n" +
            "(3430, 'SIC', 3534, 'Elevators & Moving Stairways', 4, 3426),\n" +
            "(3429, 'SIC', 3533, 'Oil & Gas Field Machinery', 4, 3426),\n" +
            "(3428, 'SIC', 3532, 'Mining Machinery', 4, 3426),\n" +
            "(2414, 'SEC', 3541, 'Machine Tools, Metal Cutting Types', 4, 2413),\n" +
            "(3443, 'SIC', 3549, 'Metalworking Machinery, nec', 4, 3434),\n" +
            "(3435, 'SIC', 3541, 'Machine Tools, Metal Cutting Types', 4, 3434),\n" +
            "(3436, 'SIC', 3542, 'Machine Tools, Metal Forming Types', 4, 3434),\n" +
            "(3437, 'SIC', 3543, 'Industrial Patterns', 4, 3434),\n" +
            "(3438, 'SIC', 3544, 'Special Dies, Tools, Jigs & Fixtures', 4, 3434),\n" +
            "(3439, 'SIC', 3545, 'Machine Tool Accessories', 4, 3434),\n" +
            "(3440, 'SIC', 3546, 'Power-Driven Handtools', 4, 3434),\n" +
            "(3441, 'SIC', 3547, 'Rolling Mill Machinery', 4, 3434),\n" +
            "(3442, 'SIC', 3548, 'Welding Apparatus', 4, 3434),\n" +
            "(2416, 'SEC', 3555, 'Printing Trades Machinery', 4, 2415),\n" +
            "(2417, 'SEC', 3559, 'Special Industry Machinery, nec', 4, 2415),\n" +
            "(3449, 'SIC', 3556, 'Food Products Machinery', 4, 3444),\n" +
            "(3483, 'SIC', 3613, 'Switchgear & Switchboard Apparatus', 4, 3481),\n" +
            "(3482, 'SIC', 3612, 'Transformers, Except Electronic', 4, 3481),\n" +
            "(2439, 'SEC', 3621, 'Motors & Generators', 4, 2438),\n" +
            "(3488, 'SIC', 3629, 'Electrical Industrial Apparatus, nec', 4, 3484),\n" +
            "(3486, 'SIC', 3624, 'Carbon & Graphite Products', 4, 3484),\n" +
            "(3485, 'SIC', 3621, 'Motors & Generators', 4, 3484),\n" +
            "(3487, 'SIC', 3625, 'Relays & Industrial Controls', 4, 3484),\n" +
            "(2441, 'SEC', 3634, 'Electric Housewares & Fans', 4, 2440),\n" +
            "(3490, 'SIC', 3631, 'Household Cooking Equipment', 4, 3489),\n" +
            "(3491, 'SIC', 3632, 'Household Refrigerators & Freezers', 4, 3489),\n" +
            "(3492, 'SIC', 3633, 'Household Laundry Equipment', 4, 3489),\n" +
            "(3493, 'SIC', 3634, 'Electric Housewares & Fans', 4, 3489),\n" +
            "(3494, 'SIC', 3635, 'Household Vacuum Cleaners', 4, 3489),\n" +
            "(3495, 'SIC', 3639, 'Household Appliances, nec', 4, 3489),\n" +
            "(3502, 'SIC', 3647, 'Vehicular Lighting Equipment', 4, 3496),\n" +
            "(3536, 'SIC', 3728, 'Aircraft Parts & Equipment, nec', 4, 3533),\n" +
            "(3535, 'SIC', 3724, 'Aircraft Engines & Engine Parts', 4, 3533),\n" +
            "(3539, 'SIC', 3732, 'Boat Building & Repairing', 4, 3537),\n" +
            "(3538, 'SIC', 3731, 'Ship Building & Repairing', 4, 3537),\n" +
            "(2471, 'SEC', 3743, 'Railroad Equipment', 4, 2470),\n" +
            "(3541, 'SIC', 3743, 'Railroad Equipment', 4, 3540),\n" +
            "(2473, 'SEC', 3751, 'Motorcycles, Bicycles & Parts', 4, 2472),\n" +
            "(3543, 'SIC', 3751, 'Motorcycles, Bicycles & Parts', 4, 3542),\n" +
            "(3546, 'SIC', 3764, 'Space Propulsion Units & Parts', 4, 3544),\n" +
            "(3547, 'SIC', 3769, 'Space Vehicle Equipment, nec', 4, 3544),\n" +
            "(3545, 'SIC', 3761, 'Guided Missiles & Space Vehicles', 4, 3544),\n" +
            "(3549, 'SIC', 3792, 'Travel Trailers & Campers', 4, 3548),\n" +
            "(3550, 'SIC', 3795, 'Tanks & Tank Components', 4, 3548),\n" +
            "(3551, 'SIC', 3799, 'Transportation Equipment, nec', 4, 3548),\n" +
            "(2478, 'SEC', 3812, 'Search & Navigation Equipment', 4, 2477),\n" +
            "(3554, 'SIC', 3812, 'Search & Navigation Equipment', 4, 3553),\n" +
            "(2482, 'SEC', 3823, 'Process Control Instruments', 4, 2479),\n" +
            "(2480, 'SEC', 3821, 'Laboratory Apparatus & Furniture', 4, 2479),\n" +
            "(2481, 'SEC', 3822, 'Environmental Controls', 4, 2479),\n" +
            "(2483, 'SEC', 3824, 'Fluid Meters & Counting Devices', 4, 2479),\n" +
            "(2484, 'SEC', 3825, 'Instruments to Measure Electricity', 4, 2479),\n" +
            "(2485, 'SEC', 3826, 'Analytical Instruments', 4, 2479),\n" +
            "(2486, 'SEC', 3827, 'Optical Instruments & Lenses', 4, 2479),\n" +
            "(2487, 'SEC', 3829, 'Measuring & Controlling Devices, nec', 4, 2479),\n" +
            "(2506, 'SEC', 3942, 'Dolls & Stuffed Toys', 4, 2505),\n" +
            "(2508, 'SEC', 3949, 'Sporting & Athletic Goods, nec', 4, 2505),\n" +
            "(2507, 'SEC', 3944, 'Games, Toys & Children''s Vehicles', 4, 2505),\n" +
            "(3586, 'SIC', 3949, 'Sporting & Athletic Goods, nec', 4, 3583),\n" +
            "(3584, 'SIC', 3942, 'Dolls & Stuffed Toys', 4, 3583),\n" +
            "(3585, 'SIC', 3944, 'Games, Toys & Children''s Vehicles', 4, 3583),\n" +
            "(3591, 'SIC', 3955, 'Carbon Paper & Inked Ribbons', 4, 3587),\n" +
            "(3590, 'SIC', 3953, 'Marking Devices', 4, 3587);\n" +
            "\n" ;
    static String industryCodeInsert2 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(3589, 'SIC', 3952, 'Lead Pencils & Art Goods', 4, 3587),\n" +
            "(3588, 'SIC', 3951, 'Pens & Mechanical Pencils', 4, 3587),\n" +
            "(3593, 'SIC', 3961, 'Costume Jewelry', 4, 3592),\n" +
            "(3594, 'SIC', 3965, 'Fasteners, Buttons, Needles & Pins', 4, 3592),\n" +
            "(3597, 'SIC', 3993, 'Signs & Advertising Specialties', 4, 3595),\n" +
            "(3600, 'SIC', 3999, 'Manufacturing Industries, nec', 4, 3595),\n" +
            "(3599, 'SIC', 3996, 'Hard Surface Floor Coverings, nec', 4, 3595),\n" +
            "(3598, 'SIC', 3995, 'Burial Caskets', 4, 3595),\n" +
            "(3596, 'SIC', 3991, 'Brooms & Brushes', 4, 3595),\n" +
            "(2514, 'SEC', 4011, 'Railroads Line-Haul Operating', 4, 2513),\n" +
            "(2515, 'SEC', 4013, 'Switching & Terminal Devices', 4, 2513),\n" +
            "(3604, 'SIC', 4013, 'Switching & Terminal Devices', 4, 3602),\n" +
            "(3603, 'SIC', 4011, 'Railroads Line-Haul Operating', 4, 3602),\n" +
            "(3608, 'SIC', 4119, 'Local Passenger Transportation, nec', 4, 3606),\n" +
            "(3607, 'SIC', 4111, 'Local & Suburban Transit', 4, 3606),\n" +
            "(3610, 'SIC', 4121, 'Taxicabs', 4, 3609),\n" +
            "(3612, 'SIC', 4131, 'Intercity & Rural Bus Transportation', 4, 3611),\n" +
            "(3615, 'SIC', 4142, 'Bus Charter Service, Except Local', 4, 3613),\n" +
            "(3614, 'SIC', 4141, 'Local Bus Charter Service', 4, 3613),\n" +
            "(3617, 'SIC', 4151, 'School Buses', 4, 3616),\n" +
            "(3619, 'SIC', 4173, 'Bus Terminal & Service Facilities', 4, 3618),\n" +
            "(2519, 'SEC', 4213, 'Trucking, Except Local', 4, 2518),\n" +
            "(3622, 'SIC', 4212, 'Local Trucking, Without Storage', 4, 3621),\n" +
            "(3624, 'SIC', 4214, 'Local Trucking With Storage', 4, 3621),\n" +
            "(3625, 'SIC', 4215, 'Courier Service, Except by Air', 4, 3621),\n" +
            "(3623, 'SIC', 4213, 'Trucking, Except Local', 4, 3621),\n" +
            "(3627, 'SIC', 4221, 'Farm Product Wareho& Storage', 4, 3626),\n" +
            "(3630, 'SIC', 4226, 'Special Wareho& Storage, nec', 4, 3626),\n" +
            "(3629, 'SIC', 4225, 'General Wareho& Storage', 4, 3626),\n" +
            "(3628, 'SIC', 4222, 'Refrigerated Wareho& Storage', 4, 3626),\n" +
            "(2522, 'SEC', 4231, 'Trucking Terminal Facilities', 4, 2521),\n" +
            "(2525, 'SEC', 4412, 'Deep Sea Foreign Transport of Freight', 4, 2524),\n" +
            "(3638, 'SIC', 4412, 'Deep Sea Foreign Transport of Freight', 4, 3637),\n" +
            "(3640, 'SIC', 4424, 'Deep Sea Domestic Transport of Freight', 4, 3639),\n" +
            "(3642, 'SIC', 4432, 'Freight Transport on The Great Lakes', 4, 3641),\n" +
            "(3644, 'SIC', 4449, 'Water Transportation of Freight, nec', 4, 3643),\n" +
            "(3648, 'SIC', 4489, 'Water Passenger Transportation, nec', 4, 3645),\n" +
            "(3646, 'SIC', 4481, 'Deep Sea Passenger Transportation, Except Ferry', 4, 3645),\n" +
            "(3647, 'SIC', 4482, 'Ferries', 4, 3645),\n" +
            "(3650, 'SIC', 4491, 'Marine Cargo Handling', 4, 3649),\n" +
            "(3653, 'SIC', 4499, 'Water Transportation Services, nec', 4, 3649),\n" +
            "(3652, 'SIC', 4493, 'Marinas', 4, 3649),\n" +
            "(3651, 'SIC', 4492, 'Towing & Tugboat Service', 4, 3649),\n" +
            "(2528, 'SEC', 4512, 'Air Transportation, Scheduled', 4, 2527),\n" +
            "(2529, 'SEC', 4513, 'Air Courier Services', 4, 2527),\n" +
            "(3656, 'SIC', 4512, 'Air Transportation, Scheduled', 4, 3655),\n" +
            "(3657, 'SIC', 4513, 'Air Courier Services', 4, 3655),\n" +
            "(2531, 'SEC', 4522, 'Air Transportation, Nonscheduled', 4, 2530),\n" +
            "(3659, 'SIC', 4522, 'Air Transportation, Nonscheduled', 4, 3658),\n" +
            "(2533, 'SEC', 4581, 'Airports, Flying Fields & Services', 4, 2532),\n" +
            "(3661, 'SIC', 4581, 'Airports, Flying Fields & Services', 4, 3660),\n" +
            "(3664, 'SIC', 4612, 'Crude Petroleum Pipelines', 4, 3663),\n" +
            "(3666, 'SIC', 4619, 'Pipelines, nec', 4, 3663),\n" +
            "(3665, 'SIC', 4613, 'Refined Petroleum Pipelines', 4, 3663),\n" +
            "(3670, 'SIC', 4725, 'Tour Operators', 4, 3668),\n" +
            "(3669, 'SIC', 4724, 'Travel Agencies', 4, 3668),\n" +
            "(3671, 'SIC', 4729, 'Passenger Transport Arrangement, nec', 4, 3668),\n" +
            "(2538, 'SEC', 4731, 'Freight Transportation Arrangement', 4, 2537),\n" +
            "(3673, 'SIC', 4731, 'Freight Transportation Arrangement', 4, 3672),\n" +
            "(3675, 'SIC', 4741, 'Rental of Railroad Cars', 4, 3674),\n" +
            "(3679, 'SIC', 4789, 'Transportation Services, nec', 4, 3676),\n" +
            "(3678, 'SIC', 4785, 'Inspection & Fixed Facilities', 4, 3676),\n" +
            "(3677, 'SIC', 4783, 'Packing & Crating', 4, 3676),\n" +
            "(2554, 'SEC', 4911, 'Electric Services', 4, 2553),\n" +
            "(3695, 'SIC', 4911, 'Electric Services', 4, 3694),\n" +
            "(2558, 'SEC', 4924, 'Natural Gas Distribution', 4, 2555),\n" +
            "(2556, 'SEC', 4922, 'Natural Gas Transmission', 4, 2555),\n" +
            "(2557, 'SEC', 4923, 'Gas Transmission & Distribution', 4, 2555),\n" +
            "(3698, 'SIC', 4923, 'Gas Transmission & Distribution', 4, 3696),\n" +
            "(3697, 'SIC', 4922, 'Natural Gas Transmission', 4, 3696),\n" +
            "(3700, 'SIC', 4925, 'Gas Production and/or Distribution', 4, 3696),\n" +
            "(3699, 'SIC', 4924, 'Natural Gas Distribution', 4, 3696),\n" +
            "(2561, 'SEC', 4932, 'Gas & Other Services Combined', 4, 2559),\n" +
            "(2560, 'SEC', 4931, 'Electric & Other Services Combined', 4, 2559),\n" +
            "(3704, 'SIC', 4939, 'Combination Utilities, nec', 4, 3701),\n" +
            "(3703, 'SIC', 4932, 'Gas & Other Services Combined', 4, 3701),\n" +
            "(3702, 'SIC', 4931, 'Electric & Other Services Combined', 4, 3701),\n" +
            "(2563, 'SEC', 4941, 'Water Supply', 4, 2562),\n" +
            "(3706, 'SIC', 4941, 'Water Supply', 4, 3705),\n" +
            "(2565, 'SEC', 4953, 'Refuse Systems', 4, 2564),\n" +
            "(3708, 'SIC', 4952, 'Sewerage Systems', 4, 3707),\n" +
            "(3709, 'SIC', 4953, 'Refuse Systems', 4, 3707),\n" +
            "(3710, 'SIC', 4959, 'Sanitary Services, nec', 4, 3707),\n" +
            "(2567, 'SEC', 4961, 'Steam & Air Conditioning Supply', 4, 2566),\n" +
            "(3712, 'SIC', 4961, 'Steam & Air Conditioning Supply', 4, 3711),\n" +
            "(3714, 'SIC', 4971, 'Irrigation Systems', 4, 3713),\n" +
            "(2570, 'SEC', 5013, 'Motor Vehicle Supplies & New Parts', 4, 2569),\n" +
            "(3719, 'SIC', 5014, 'Tires & Tubes', 4, 3716),\n" +
            "(3717, 'SIC', 5012, 'Automobiles & Other Motor Vehicles', 4, 3716),\n" +
            "(3718, 'SIC', 5013, 'Motor Vehicle Supplies & New Parts', 4, 3716),\n" +
            "(3720, 'SIC', 5015, 'Motor Vehicle Parts, Used', 4, 3716),\n" +
            "(3723, 'SIC', 5023, 'Homefurnishings', 4, 3721),\n" +
            "(3722, 'SIC', 5021, 'Furniture', 4, 3721),\n" +
            "(2573, 'SEC', 5031, 'Lumber, Plywood & Millwork', 4, 2572),\n" +
            "(3728, 'SIC', 5039, 'Construction Materials, nec', 4, 3724),\n" +
            "(3726, 'SIC', 5032, 'Brick, Stone & Related Materials', 4, 3724),\n" +
            "(2582, 'SEC', 5065, 'Electronic Parts & Equipment', 4, 2579),\n" +
            "(3743, 'SIC', 5065, 'Electronic Parts & Equipment', 4, 3740),\n" +
            "(3741, 'SIC', 5063, 'Electrical Apparatus & Equipment', 4, 3740),\n" +
            "(3742, 'SIC', 5064, 'Electrical Appliances, TV & Radios', 4, 3740),\n" +
            "(2584, 'SEC', 5072, 'Hardware', 4, 2583),\n" +
            "(3745, 'SIC', 5072, 'Hardware', 4, 3744),\n" +
            "(3747, 'SIC', 5075, 'Warm Air Heating & Air-Conditioning', 4, 3744),\n" +
            "(3746, 'SIC', 5074, 'Plumbing & Hydronic Heating Supplies', 4, 3744),\n" +
            "(3748, 'SIC', 5078, 'Refrigeration Equipment & Supplies', 4, 3744),\n" +
            "(2586, 'SEC', 5082, 'Construction & Mining Machinery', 4, 2585),\n" +
            "(2587, 'SEC', 5084, 'Industrial Machinery & Equipment', 4, 2585),\n" +
            "(3751, 'SIC', 5083, 'Farm & Garden Machinery', 4, 3749),\n" +
            "(3752, 'SIC', 5084, 'Industrial Machinery & Equipment', 4, 3749),\n" +
            "(3750, 'SIC', 5082, 'Construction & Mining Machinery', 4, 3749),\n" +
            "(3755, 'SIC', 5088, 'Transportation Equipment & Supplies', 4, 3749),\n" +
            "(3754, 'SIC', 5087, 'Service Establishment Equipment', 4, 3749),\n" +
            "(3753, 'SIC', 5085, 'Industrial Supplies', 4, 3749),\n" +
            "(2590, 'SEC', 5099, 'Durable Goods, nec', 4, 2588),\n" +
            "(2589, 'SEC', 5094, 'Jewelry & Precious Stones', 4, 2588),\n" +
            "(3761, 'SIC', 5099, 'Durable Goods, nec', 4, 3756),\n" +
            "(3843, 'SIC', 5531, 'Auto & Home Supply Stores', 4, 3842),\n" +
            "(3845, 'SIC', 5541, 'Gasoline Service Stations', 4, 3844),\n" +
            "(3847, 'SIC', 5551, 'Boat Dealers', 4, 3846),\n" +
            "(3849, 'SIC', 5561, 'Recreational Vehicle Dealers', 4, 3848),\n" +
            "(3851, 'SIC', 5571, 'Motorcycle Dealers', 4, 3850),\n" +
            "(3853, 'SIC', 5599, 'Automotive Dealers, nec', 4, 3852),\n" +
            "(3856, 'SIC', 5611, 'Men''s & Boys'' Clothing Stores', 4, 3855),\n" +
            "(2625, 'SEC', 5621, 'Women''s Clothing Stores', 4, 2624),\n" +
            "(3858, 'SIC', 5621, 'Women''s Clothing Stores', 4, 3857),\n" +
            "(3860, 'SIC', 5632, 'Women''s Accessory & Specialty Stores', 4, 3859),\n" +
            "(3862, 'SIC', 5641, 'Children''s & Infants'' Wear Stores', 4, 3861),\n" +
            "(2627, 'SEC', 5651, 'Family Clothing Stores', 4, 2626),\n" +
            "(3864, 'SIC', 5651, 'Family Clothing Stores', 4, 3863),\n" +
            "(2629, 'SEC', 5661, 'Shoe Stores', 4, 2628),\n" +
            "(3866, 'SIC', 5661, 'Shoe Stores', 4, 3865),\n" +
            "(3868, 'SIC', 5699, 'Miscellaneous Apparel & Accessory Stores', 4, 3867),\n" +
            "(2632, 'SEC', 5712, 'Furniture Stores', 4, 2631),\n" +
            "(3871, 'SIC', 5712, 'Furniture Stores', 4, 3870),\n" +
            "(3874, 'SIC', 5719, 'Miscellaneous Homefurnishings Stores', 4, 3870),\n" +
            "(3873, 'SIC', 5714, 'Drapery & Upholstery Stores', 4, 3870),\n" +
            "(3872, 'SIC', 5713, 'Floor Covering Stores', 4, 3870),\n" +
            "(3876, 'SIC', 5722, 'Household Appliance Stores', 4, 3875),\n" +
            "(2634, 'SEC', 5731, 'Radio, TV & Electronic Stores', 4, 2633),\n" +
            "(2636, 'SEC', 5735, 'Record & Prerecorded Tape Stores', 4, 2633),\n" +
            "(2635, 'SEC', 5734, 'Computer & Software Stores', 4, 2633),\n" +
            "(3880, 'SIC', 5735, 'Record & Prerecorded Tape Stores', 4, 3877),\n" +
            "(3878, 'SIC', 5731, 'Radio, TV & Electronic Stores', 4, 3877),\n" +
            "(3881, 'SIC', 5736, 'Musical Instrument Stores', 4, 3877),\n" +
            "(3879, 'SIC', 5734, 'Computer & Software Stores', 4, 3877),\n" +
            "(2639, 'SEC', 5812, 'Caterers & Banquet Halls', 4, 2638),\n" +
            "(3885, 'SIC', 5813, 'Drinking Places', 4, 3883),\n" +
            "(3884, 'SIC', 5812, 'Caterers & Banquet Halls', 4, 3883),\n" +
            "(2642, 'SEC', 5912, 'Drug Stores & Proprietary Stores', 4, 2641),\n" +
            "(3888, 'SIC', 5912, 'Drug Stores & Proprietary Stores', 4, 3887),\n" +
            "(3920, 'SIC', 6019, 'Central Reserve Depository, nec', 4, 3918),\n" +
            "(2651, 'SEC', 6021, 'National Commercial Banks', 4, 2650),\n" +
            "(2652, 'SEC', 6022, 'State Commercial Banks', 4, 2650),\n" +
            "(2653, 'SEC', 6029, 'Commercial Banks, nec', 4, 2650),\n" +
            "(3923, 'SIC', 6022, 'State Commercial Banks', 4, 3921),\n" +
            "(3922, 'SIC', 6021, 'National Commercial Banks', 4, 3921),\n" +
            "(3924, 'SIC', 6029, 'Commercial Banks, nec', 4, 3921),\n" +
            "(2656, 'SEC', 6036, 'Savings Institutions, Except Federal', 4, 2654),\n" +
            "(2655, 'SEC', 6035, 'Federal Savings Institutions', 4, 2654),\n" +
            "(3927, 'SIC', 6036, 'Savings Institutions, Except Federal', 4, 3925),\n" +
            "(3926, 'SIC', 6035, 'Federal Savings Institutions', 4, 3925),\n" +
            "(3930, 'SIC', 6062, 'State Credit Unions', 4, 3928),\n" +
            "(3929, 'SIC', 6061, 'Federal Credit Unions', 4, 3928),\n" +
            "(3932, 'SIC', 6081, 'Foreign Bank & Branches & Agencies', 4, 3931),\n" +
            "(3933, 'SIC', 6082, 'Foreign Trade & International Banks', 4, 3931),\n" +
            "(2658, 'SEC', 6099, 'Functions Related to Deposit Banking', 4, 2657),\n" +
            "(3936, 'SIC', 6099, 'Functions Related to Deposit Banking', 4, 3934),\n" +
            "(3935, 'SIC', 6091, 'Nondeposit Trust Facilities', 4, 3934),\n" +
            "(2661, 'SEC', 6111, 'Federal & Federally Sponsored Credit Agencies', 4, 2660),\n" +
            "(3939, 'SIC', 6111, 'Federal & Federally Sponsored Credit Agencies', 4, 3938),\n" +
            "(2663, 'SEC', 6141, 'Personal Credit Unions', 4, 2662),\n" +
            "(3941, 'SIC', 6141, 'Personal Credit Unions', 4, 3940),\n" +
            "(2665, 'SEC', 6153, 'Short Term Business Credit', 4, 2664),\n" +
            "(2666, 'SEC', 6159, 'Misc. Business Credit Institutions', 4, 2664),\n" +
            "(3944, 'SIC', 6159, 'Misc. Business Credit Institutions', 4, 3942),\n" +
            "(3943, 'SIC', 6153, 'Short Term Business Credit', 4, 3942),\n" +
            "(2669, 'SEC', 6163, 'Loan Brokers', 4, 2667),\n" +
            "(2668, 'SEC', 6162, 'Mortgage Bankers & Correspondents', 4, 2667),\n" +
            "(3946, 'SIC', 6162, 'Mortgage Bankers & Correspondents', 4, 3945),\n" +
            "(3947, 'SIC', 6163, 'Loan Brokers', 4, 3945),\n" +
            "(2672, 'SEC', 6211, 'Security Brokers & Dealers', 4, 2671),\n" +
            "(3950, 'SIC', 6211, 'Security Brokers & Dealers', 4, 3949),\n" +
            "(2674, 'SEC', 6221, 'Commodity Contracts Brokers, Dealers', 4, 2673),\n" +
            "(3952, 'SIC', 6221, 'Commodity Contracts Brokers, Dealers', 4, 3951),\n" +
            "(3954, 'SIC', 6231, 'Security & Commodity Exchanges', 4, 3953),\n" +
            "(2676, 'SEC', 6282, 'Investment Advice', 4, 2675),\n" +
            "(3957, 'SIC', 6289, 'Security & Commodity Services, nec', 4, 3955),\n" +
            "(3956, 'SIC', 6282, 'Investment Advice', 4, 3955),\n" +
            "(2679, 'SEC', 6311, 'Life Insurance', 4, 2678),\n" +
            "(3960, 'SIC', 6311, 'Life Insurance', 4, 3959),\n" +
            "(2682, 'SEC', 6324, 'Hospital & Medical Service Plans', 4, 2680),\n" +
            "(2681, 'SEC', 6321, 'Accident & Health Insurance', 4, 2680),\n" +
            "(3962, 'SIC', 6321, 'Accident & Health Insurance', 4, 3961),\n" +
            "(3963, 'SIC', 6324, 'Hospital & Medical Service Plans', 4, 3961),\n" +
            "(2684, 'SEC', 6331, 'Fire, Marine & Casualty Insurance', 4, 2683),\n" +
            "(3965, 'SIC', 6331, 'Fire, Marine & Casualty Insurance', 4, 3964),\n" +
            "(2686, 'SEC', 6351, 'Surety Insurance', 4, 2685),\n" +
            "(3967, 'SIC', 6351, 'Surety Insurance', 4, 3966),\n" +
            "(2688, 'SEC', 6361, 'Title Insurance', 4, 2687),\n" +
            "(3969, 'SIC', 6361, 'Title Insurance', 4, 3968),\n" +
            "(3971, 'SIC', 6371, 'Pension, Health & Welfare Funds', 4, 3970),\n" +
            "(2690, 'SEC', 6399, 'Insurance Carriers, nec', 4, 2689),\n" +
            "(3973, 'SIC', 6399, 'Insurance Carriers, nec', 4, 3972),\n" +
            "(2693, 'SEC', 6411, 'Insurance Agents, Brokers & Service', 4, 2692),\n" +
            "(3976, 'SIC', 6411, 'Insurance Agents, Brokers & Service', 4, 3975),\n" +
            "(2696, 'SEC', 6512, 'Nonresidential Building Operators', 4, 2695),\n" +
            "(2698, 'SEC', 6519, 'Real Property Lessors, nec', 4, 2695),\n" +
            "(2697, 'SEC', 6513, 'Apartment Building Operators', 4, 2695),\n" +
            "(3983, 'SIC', 6517, 'Railroad Property Lessors', 4, 3978),\n" +
            "(3984, 'SIC', 6519, 'Real Property Lessors, nec', 4, 3978),\n" +
            "(3979, 'SIC', 6512, 'Nonresidential Building Operators', 4, 3978),\n" +
            "(3980, 'SIC', 6513, 'Apartment Building Operators', 4, 3978),\n" +
            "(3981, 'SIC', 6514, 'Dwelling Operators, Except Apartments', 4, 3978),\n" +
            "(3982, 'SIC', 6515, 'Mobile Home Site Operators', 4, 3978),\n" +
            "(2700, 'SEC', 6531, 'Real Estate Agents & Managers', 4, 2699),\n" +
            "(3986, 'SIC', 6531, 'Real Estate Agents & Managers', 4, 3985),\n" +
            "(3988, 'SIC', 6541, 'Title Abstract Offices', 4, 3987),\n" +
            "(2702, 'SEC', 6552, 'Subdividers & Developers, nec', 4, 2701),\n" +
            "(3990, 'SIC', 6552, 'Subdividers & Developers, nec', 4, 3989),\n" +
            "(3991, 'SIC', 6553, 'Cemetery Subdividers & Developers', 4, 3989),\n" +
            "(3994, 'SIC', 6712, 'Bank Holding Companies', 4, 3993),\n" +
            "(3995, 'SIC', 6719, 'Holding Companies, nec', 4, 3993),\n" +
            "(4025, 'SIC', 7218, 'Industrial Launderers', 4, 4018),\n" +
            "(4026, 'SIC', 7219, 'Laundry & Garment Services, nec', 4, 4018),\n" +
            "(4019, 'SIC', 7211, 'Power Laundries, Family & Commercial', 4, 4018),\n" +
            "(4028, 'SIC', 7221, 'Photographic Studios, Portrait', 4, 4027),\n" +
            "(4030, 'SIC', 7231, 'Beauty Shops', 4, 4029),\n" +
            "(4032, 'SIC', 7241, 'Barber Shops', 4, 4031),\n" +
            "(4034, 'SIC', 7251, 'Shoe Repair & Shoeshine Parlors', 4, 4033),\n" +
            "(4036, 'SIC', 7261, 'Funeral Service & Crematories', 4, 4035),\n" +
            "(4039, 'SIC', 7299, 'Miscellaneous Personal Services, nec', 4, 4037),\n" +
            "(4038, 'SIC', 7291, 'Tax Return Preparation Services', 4, 4037),\n" +
            "(2715, 'SEC', 7311, 'Advertising Agencies', 4, 2714),\n" +
            "(4042, 'SIC', 7311, 'Advertising Agencies', 4, 4041),\n" +
            "(4044, 'SIC', 7313, 'Radio, TV Publisher Representatives', 4, 4041),\n" +
            "(4045, 'SIC', 7319, 'Advertising, nec', 4, 4041),\n" +
            "(4043, 'SIC', 7312, 'Outdoor Advertising Services', 4, 4041),\n" +
            "(4047, 'SIC', 7322, 'Adjustment & Collection Services', 4, 4046),\n" +
            "(4048, 'SIC', 7323, 'Credit Reporting Services', 4, 4046),\n" +
            "(2718, 'SEC', 7331, 'Direct Mail Advertising Services', 4, 2717),\n" +
            "(4050, 'SIC', 7331, 'Direct Mail Advertising Services', 4, 4049),\n" +
            "(4051, 'SIC', 7334, 'Photocopying & Duplicating Services', 4, 4049),\n" +
            "(4052, 'SIC', 7335, 'Commercial Photography', 4, 4049),\n" +
            "(4053, 'SIC', 7336, 'Commercial Art & Graphic Design', 4, 4049),\n" +
            "(4054, 'SIC', 7338, 'Secretarial & Court Reporting', 4, 4049),\n" +
            "(4057, 'SIC', 7349, 'Building Maintenance Services, nec', 4, 4055),\n" +
            "(4056, 'SIC', 7342, 'Disinfecting & Pest Control Services', 4, 4055),\n" +
            "(2721, 'SEC', 7359, 'Misc. Equipment Rental & Leasing, nec', 4, 2720),\n" +
            "(4061, 'SIC', 7359, 'Misc. Equipment Rental & Leasing, nec', 4, 4058),\n" +
            "(4059, 'SIC', 7352, 'Medical Equipment Rental', 4, 4058),\n" +
            "(4060, 'SIC', 7353, 'Heavy Construction Equipment Rental', 4, 4058),\n" +
            "(2723, 'SEC', 7361, 'Employment Agencies', 4, 2722),\n" +
            "(2724, 'SEC', 7363, 'Help Supply Services', 4, 2722),\n" +
            "(4063, 'SIC', 7361, 'Employment Agencies', 4, 4062),\n" +
            "(4064, 'SIC', 7363, 'Help Supply Services', 4, 4062),\n" +
            "(2727, 'SEC', 7372, 'Prepackaged Software', 4, 2725),\n" +
            "(2730, 'SEC', 7377, 'Computer Rental & Leasing', 4, 2725),\n" +
            "(2729, 'SEC', 7374, 'Data Processing & Preparation', 4, 2725),\n" +
            "(2728, 'SEC', 7373, 'Computer Integrated Systems Design', 4, 2725),\n" +
            "(2726, 'SEC', 7371, 'Computer Programming Services', 4, 2725),\n" +
            "(4071, 'SIC', 7376, 'Computer Facilities Management', 4, 4065),\n" +
            "(4069, 'SIC', 7374, 'Data Processing & Preparation', 4, 4065),\n" +
            "(4068, 'SIC', 7373, 'Computer Integrated Systems Design', 4, 4065),\n" +
            "(4119, 'SIC', 7829, 'Motion Picture Distribution Services', 4, 4117),\n" +
            "(4118, 'SIC', 7822, 'Motion Picture & Tape Distribution', 4, 4117),\n" +
            "(4121, 'SIC', 7832, 'Motion Picture Theaters, Except Drive-In', 4, 4120),\n" +
            "(4122, 'SIC', 7833, 'Drive-In Motion Picture Theaters', 4, 4120),\n" +
            "(2747, 'SEC', 7841, 'Video Tape Rental', 4, 2746),\n" +
            "(4124, 'SIC', 7841, 'Video Tape Rental', 4, 4123),\n" +
            "(4127, 'SIC', 7911, 'Dance Studios, Schools & Halls', 4, 4126),\n" +
            "(4129, 'SIC', 7922, 'Theatrical Producers & Services', 4, 4128),\n" +
            "(4130, 'SIC', 7929, 'Entertainers & Entertainment Groups', 4, 4128),\n" +
            "(4132, 'SIC', 7933, 'Bowling Centers', 4, 4131),\n" +
            "(2750, 'SEC', 7948, 'Racing, Including Track Operation', 4, 2749),\n" +
            "(4134, 'SIC', 7941, 'Sports Clubs, Managers & Promoters', 4, 4133),\n" +
            "(4135, 'SIC', 7948, 'Racing, Including Track Operation', 4, 4133),\n" +
            "(4137, 'SIC', 7951, 'Ski Facilities, Down Hill', 4, 4136),\n" +
            "(4138, 'SIC', 7952, 'Ski Facilities, Cross Country', 4, 4136),\n" +
            "(2752, 'SEC', 7997, 'Membership Sports & Recreation Clubs', 4, 2751),\n" +
            "(4140, 'SIC', 7991, 'Physical Fitness Facilities', 4, 4139),\n" +
            "(4145, 'SIC', 7999, 'Amusement & Recreation, nec', 4, 4139),\n" +
            "(4144, 'SIC', 7997, 'Membership Sports & Recreation Clubs', 4, 4139),\n" +
            "(4143, 'SIC', 7996, 'Amusement Parks', 4, 4139),\n" +
            "(4142, 'SIC', 7993, 'Coin-Operated Amusement Devices', 4, 4139),\n" +
            "(4141, 'SIC', 7992, 'Public Golf Courses', 4, 4139),\n" +
            "(2755, 'SEC', 8011, 'Offices & Clinics of Medical Doctors', 4, 2754),\n" +
            "(4148, 'SIC', 8011, 'Offices & Clinics of Medical Doctors', 4, 4147),\n" +
            "(4150, 'SIC', 8021, 'Offices & Clinics of Dentists', 4, 4149),\n" +
            "(4152, 'SIC', 8031, 'Offices of Osteopathic Physicians', 4, 4151),\n" +
            "(4157, 'SIC', 8049, 'Offices of Health Practitioners, nec', 4, 4153),\n" +
            "(4156, 'SIC', 8043, 'Offices & Clinics of Podiatrists', 4, 4153),\n" +
            "(4180, 'SIC', 8211, 'Elementary & Secondary Schools', 4, 4179),\n" +
            "(4182, 'SIC', 8221, 'Colleges & Universities', 4, 4181),\n" +
            "(4183, 'SIC', 8222, 'Junior Colleges', 4, 4181),\n" +
            "(4185, 'SIC', 8231, 'Libraries', 4, 4184),\n" +
            "(4187, 'SIC', 8243, 'Data Processing Schools', 4, 4186),\n" +
            "(4189, 'SIC', 8249, 'Vocational Schools, nec', 4, 4186),\n" +
            "(4188, 'SIC', 8244, 'Business & Secretarial Schools', 4, 4186),\n" +
            "(4191, 'SIC', 8299, 'Schools & Educational Services, nec', 4, 4190),\n" +
            "(4194, 'SIC', 8322, 'Individual & Family Services', 4, 4193),\n" +
            "(4196, 'SIC', 8331, 'Job Training & Related Services', 4, 4195),\n" +
            "(2772, 'SEC', 8351, 'Child Day Care Services', 4, 2771),\n" +
            "(4198, 'SIC', 8351, 'Child Day Care Services', 4, 4197),\n" +
            "(4200, 'SIC', 8361, 'Residential Care', 4, 4199),\n" +
            "(4202, 'SIC', 8399, 'Social Services, nec', 4, 4201),\n" +
            "(4205, 'SIC', 8412, 'Museums & Art Galleries', 4, 4204),\n" +
            "(4207, 'SIC', 8422, 'Botanical & Zoological Gardens', 4, 4206),\n" +
            "(4210, 'SIC', 8611, 'Business Associations', 4, 4209),\n" +
            "(4212, 'SIC', 8621, 'Professional Organizations', 4, 4211),\n" +
            "(4214, 'SIC', 8631, 'Labor Organizations', 4, 4213),\n" +
            "(4216, 'SIC', 8641, 'Civic & Social Organizations', 4, 4215),\n" +
            "(4218, 'SIC', 8651, 'Political Organizations', 4, 4217),\n" +
            "(4220, 'SIC', 8661, 'Religious Organizations', 4, 4219),\n" +
            "(4222, 'SIC', 8699, 'Membership Organizations, nec', 4, 4221),\n" +
            "(2776, 'SEC', 8711, 'Engineering Services', 4, 2775),\n" +
            "(4226, 'SIC', 8712, 'Architectural Services', 4, 4224),\n" +
            "(4227, 'SIC', 8713, 'Surveying Services', 4, 4224),\n" +
            "(4225, 'SIC', 8711, 'Engineering Services', 4, 4224),\n" +
            "(4229, 'SIC', 8721, 'Accounting, Auditing & Bookkeeping', 4, 4228),\n" +
            "(2778, 'SEC', 8731, 'Commercial Physical Research', 4, 2777),\n" +
            "(2779, 'SEC', 8734, 'Testing Laboratories', 4, 2777),\n" +
            "(4232, 'SIC', 8732, 'Commercial Nonphysical Research', 4, 4230),\n" +
            "(4234, 'SIC', 8734, 'Testing Laboratories', 4, 4230),\n" +
            "(4231, 'SIC', 8731, 'Commercial Physical Research', 4, 4230),\n" +
            "(4233, 'SIC', 8733, 'Noncommercial Research Organizations', 4, 4230),\n" +
            "(2781, 'SEC', 8741, 'Management Services', 4, 2780),\n" +
            "(2783, 'SEC', 8744, 'Facilities Support Services', 4, 2780),\n" +
            "(2782, 'SEC', 8742, 'Management Consulting Services', 4, 2780),\n" +
            "(4249, 'SIC', 9111, 'Executive Offices', 4, 4248),\n" +
            "(4251, 'SIC', 9121, 'Legislative Bodies', 4, 4250),\n" +
            "(4253, 'SIC', 9131, 'Executive & Legislative Combined', 4, 4252),\n" +
            "(4255, 'SIC', 9191, 'General Government, nec', 4, 4254),\n" +
            "(4258, 'SIC', 9211, 'Courts', 4, 4257),\n" +
            "(4261, 'SIC', 9222, 'Legal Counsel & Prosecution', 4, 4259),\n" +
            "(4262, 'SIC', 9223, 'Correctional Institutions', 4, 4259),\n" +
            "(4263, 'SIC', 9224, 'Fire Protection', 4, 4259),\n" +
            "(4264, 'SIC', 9229, 'Public Order & Safety, nec', 4, 4259),\n" +
            "(4260, 'SIC', 9221, 'Police Protection', 4, 4259),\n" +
            "(4267, 'SIC', 9311, 'Finance, Taxation & Monetary Policy', 4, 4266),\n" +
            "(4270, 'SIC', 9411, 'Admin. of Educational Programs', 4, 4269),\n" +
            "(4272, 'SIC', 9431, 'Admin. of Public Health Programs', 4, 4271),\n" +
            "(4274, 'SIC', 9441, 'Admin. of Social & Manpower Programs', 4, 4273),\n" +
            "(4276, 'SIC', 9451, 'Administration of Veteran''s Affairs', 4, 4275),\n" +
            "(4280, 'SIC', 9512, 'Land, Mineral, Wildlife Conservation', 4, 4278),\n" +
            "(4279, 'SIC', 9511, 'Air, Water & Solid Waste Management', 4, 4278),\n" +
            "(4283, 'SIC', 9532, 'Urban & Community Development', 4, 4281),\n" +
            "(4282, 'SIC', 9531, 'HoPrograms', 4, 4281),\n" +
            "(4286, 'SIC', 9611, 'Administration of General Economic Programs', 4, 4285),\n" +
            "(4288, 'SIC', 9621, 'Regulation, Admin. of Transportation', 4, 4287),\n" +
            "(4290, 'SIC', 9631, 'Regulation, Admin. of Utilities', 4, 4289),\n" +
            "(1321, 'NAICS', 4855, 'Charter Bus Industry', 3, 1303),\n" +
            "(2163, 'NAICS', 92216, 'Fire Protection', 4, 2151),\n" +
            "(3127, 'SIC', 2420, 'Sawmills & Planing Mills', 3, 3124),\n" +
            "(3840, 'SIC', 5520, 'Used Car Dealers', 3, 3837),\n" +
            "(2210, 'SEC', 100, 'AGRICULTURAL PRODUCTION - CROPS', 2, 2788),\n" +
            "(2212, 'SEC', 700, 'AGRICULTURAL SERVICES', 2, 2788),\n" +
            "(2211, 'SEC', 200, 'AGRICULTURAL PRODUCTION - LIVESTOCK', 2, 2788),\n" +
            "(2875, 'SIC', 900, 'FISHING, HUNTING & TRAPPING', 2, 4305),\n" +
            "(2798, 'SIC', 100, 'AGRICULTURAL PRODUCTION - CROPS', 2, 4305),\n" +
            "(2825, 'SIC', 200, 'AGRICULTURAL PRODUCTION - LIVESTOCK', 2, 4305),\n" +
            "(2847, 'SIC', 700, 'AGRICULTURAL SERVICES', 2, 4305),\n" +
            "(2820, 'SIC', 180, 'Horticultural Specialties', 3, 2798),\n" +
            "(2805, 'SIC', 130, 'Field Crops, Except Cash Grains', 3, 2798),\n" +
            "(2811, 'SIC', 160, 'Vegetables & Melons', 3, 2798),\n" +
            "(2823, 'SIC', 190, 'General Farms, Primarily Crop', 3, 2798),\n" +
            "(2813, 'SIC', 170, 'Fruits & Tree Nuts', 3, 2798),\n" +
            "(2897, 'SIC', 1081, 'Metal Mining Services', 4, 2896),\n" +
            "(2899, 'SIC', 1094, 'Uranium Radium Vanadium Ores', 4, 2898),\n" +
            "(2220, 'SEC', 1221, 'Bituminous Coal & Lignite - Surface', 4, 2219),\n" +
            "(2903, 'SIC', 1221, 'Bituminous Coal & Lignite - Surface', 4, 2902),\n" +
            "(2904, 'SIC', 1222, 'Bituminous Coal - Underground', 4, 2902),\n" +
            "(2906, 'SIC', 1231, 'Anthracite Mining', 4, 2905),\n" +
            "(2908, 'SIC', 1241, 'Coal Mining Services', 4, 2907),\n" +
            "(2218, 'SEC', 1200, 'COAL MINING', 2, 2789),\n" +
            "(2959, 'SIC', 1721, 'Painting & Paper Hanging', 4, 2958),\n" +
            "(2239, 'SEC', 1731, 'Electrical Work', 4, 2238),\n" +
            "(2961, 'SIC', 1731, 'Electrical Work', 4, 2960),\n" +
            "(2965, 'SIC', 1743, 'Terrazzo, Tile, Marble, Mosaic Work', 4, 2962),\n" +
            "(2964, 'SIC', 1742, 'Plastering, Drywall & Insulation', 4, 2962),\n" +
            "(2963, 'SIC', 1741, 'Masonry & Other Stonework', 4, 2962),\n" +
            "(2968, 'SIC', 1752, 'Floor Laying & Floor Work, nec', 4, 2966),\n" +
            "(2967, 'SIC', 1751, 'Carpentry Work', 4, 2966),\n" +
            "(2970, 'SIC', 1761, 'Roofing, Siding & Sheet Metal Work', 4, 2969),\n" +
            "(2972, 'SIC', 1771, 'Concrete Work', 4, 2971),\n" +
            "(2974, 'SIC', 1781, 'Water Well Drilling', 4, 2973),\n" +
            "(2977, 'SIC', 1793, 'Glass & Glazing Work', 4, 2975),\n" +
            "(3013, 'SIC', 2061, 'Raw Cane Sugar', 4, 3012),\n" +
            "(3014, 'SIC', 2062, 'Cane Sugar Refining', 4, 3012),\n" +
            "(3021, 'SIC', 2074, 'Cottonseed Oil Mills', 4, 3020),\n" +
            "(3025, 'SIC', 2079, 'Edible Fats & Oils, nec', 4, 3020),\n" +
            "(3024, 'SIC', 2077, 'Animal & Marine Fats & Oils', 4, 3020),\n" +
            "(3023, 'SIC', 2076, 'Vegetable Oil Mills, nec', 4, 3020),\n" +
            "(3022, 'SIC', 2075, 'Soybean Oil Mills', 4, 3020),\n" +
            "(2256, 'SEC', 2086, 'Bottled & Canned Soft Drinks', 4, 2254),\n" +
            "(2255, 'SEC', 2082, 'Malt Beverages', 4, 2254),\n" +
            "(3029, 'SIC', 2084, 'Wines, Brandy & Brandy Spirits', 4, 3026),\n" +
            "(3028, 'SIC', 2083, 'Malt', 4, 3026),\n" +
            "(3027, 'SIC', 2082, 'Malt Beverages', 4, 3026),\n" +
            "(3031, 'SIC', 2086, 'Bottled & Canned Soft Drinks', 4, 3026),\n" +
            "(3030, 'SIC', 2085, 'Distilled & Blended Liquors', 4, 3026),\n" +
            "(3032, 'SIC', 2087, 'Flavoring Extracts & Syrups, nec', 4, 3026),\n" +
            "(2258, 'SEC', 2092, 'Fresh or Frozen Prepared Fish', 4, 2257),\n" +
            "(3034, 'SIC', 2091, 'Canned & Cured Fish & Seafoods', 4, 3033),\n" +
            "(3039, 'SIC', 2098, 'Macaroni & Spaghetti', 4, 3033),\n" +
            "(3038, 'SIC', 2097, 'Manufactured Ice', 4, 3033),\n" +
            "(3037, 'SIC', 2096, 'Potato Chips & Similar Snacks', 4, 3033),\n" +
            "(3035, 'SIC', 2092, 'Fresh or Frozen Prepared Fish', 4, 3033),\n" +
            "(3036, 'SIC', 2095, 'Roasted Coffee', 4, 3033),\n" +
            "(2261, 'SEC', 2111, 'Cigarettes', 4, 2260),\n" +
            "(3043, 'SIC', 2111, 'Cigarettes', 4, 3042),\n" +
            "(3045, 'SIC', 2121, 'Cigars', 4, 3044),\n" +
            "(3047, 'SIC', 2131, 'Chewing & Smoking Tobacco', 4, 3046),\n" +
            "(3049, 'SIC', 2141, 'Tobacco Stemming & Redrying', 4, 3048),\n" +
            "(2264, 'SEC', 2211, 'Broadwoven Fabric Mills, Cotton', 4, 2263),\n" +
            "(3052, 'SIC', 2211, 'Broadwoven Fabric Mills, Cotton', 4, 3051),\n" +
            "(2266, 'SEC', 2221, 'Broadwoven Fabric Mills, Manmade', 4, 2265),\n" +
            "(3054, 'SIC', 2221, 'Broadwoven Fabric Mills, Manmade', 4, 3053),\n" +
            "(3056, 'SIC', 2231, 'Broadwoven Fabric Mills, Wool', 4, 3055),\n" +
            "(3058, 'SIC', 2241, 'Narrow Fabric Mills', 4, 3057),\n" +
            "(2268, 'SEC', 2253, 'Knit Outerwear Mills', 4, 2267),\n" +
            "(3062, 'SIC', 2253, 'Knit Outerwear Mills', 4, 3059),\n" +
            "(3066, 'SIC', 2259, 'Knitting Mills, nec', 4, 3059),\n" +
            "(3065, 'SIC', 2258, 'Lace & Warp Knit Fabric Mills', 4, 3059),\n" +
            "(3064, 'SIC', 2257, 'Weft Knit Fabric Mills', 4, 3059),\n" +
            "(3063, 'SIC', 2254, 'Knit Underwear Mills', 4, 3059),\n" +
            "(3061, 'SIC', 2252, 'Hosiery, nec', 4, 3059),\n" +
            "(3060, 'SIC', 2251, 'Women''s Hosiery, Except Socks', 4, 3059),\n" +
            "(3068, 'SIC', 2261, 'Finishing Plants, Cotton', 4, 3067),\n" +
            "(3069, 'SIC', 2262, 'Finishing Plants, Manmade', 4, 3067),\n" +
            "(3070, 'SIC', 2269, 'Finishing Plants, nec', 4, 3067),\n" +
            "(2270, 'SEC', 2273, 'Carpets & Rugs', 4, 2269),\n" +
            "(2260, 'SEC', 2110, 'Cigarettes', 3, 2259),\n" +
            "(3102, 'SIC', 2353, 'Hats, Caps & Millinery', 4, 3101),\n" +
            "(3104, 'SIC', 2361, 'Girls & Children''s Dresses & Blouses', 4, 3103),\n" +
            "(3105, 'SIC', 2369, 'Girls & Children''s Outerwear, nec', 4, 3103),\n" +
            "(3109, 'SIC', 2381, 'Fabric Dress & Work Gloves', 4, 3108),\n" +
            "(3113, 'SIC', 2387, 'Apparel Belts', 4, 3108),\n" +
            "(3114, 'SIC', 2389, 'Apparel & Accessories, nec', 4, 3108),\n" +
            "(3112, 'SIC', 2386, 'Leather & Sheep-Lined Clothing', 4, 3108),\n" +
            "(3111, 'SIC', 2385, 'Waterproof Outerwear', 4, 3108),\n" +
            "(3110, 'SIC', 2384, 'Robes & Dressing Gowns', 4, 3108),\n" +
            "(3120, 'SIC', 2395, 'Pleating & Stitching', 4, 3115),\n" +
            "(3122, 'SIC', 2397, 'Schiffli Machine Embroideries', 4, 3115),\n" +
            "(3116, 'SIC', 2391, 'Curtains & Draperies', 4, 3115),\n" +
            "(3123, 'SIC', 2399, 'Fabricated TEXTile Products, nec', 4, 3115),\n" +
            "(3117, 'SIC', 2392, 'House Furnishings, nec', 4, 3115),\n" +
            "(3118, 'SIC', 2393, 'TEXTile Bags', 4, 3115),\n" +
            "(3119, 'SIC', 2394, 'Canvas & Related Products', 4, 3115),\n" +
            "(3121, 'SIC', 2396, 'Automotive & Apparel Trimmings', 4, 3115),\n" +
            "(3126, 'SIC', 2411, 'Logging', 4, 3125),\n" +
            "(2278, 'SEC', 2421, 'Sawmills & Planing Mills, General', 4, 2277),\n" +
            "(3128, 'SIC', 2421, 'Sawmills & Planing Mills, General', 4, 3127),\n" +
            "(3130, 'SIC', 2429, 'Special Product Sawmills, nec', 4, 3127),\n" +
            "(3129, 'SIC', 2426, 'Hardwood Dimension & Flooring Mills', 4, 3127),\n" +
            "(3134, 'SIC', 2435, 'Hardwood Veneer & Plywood', 4, 3131),\n" +
            "(3133, 'SIC', 2434, 'Wood Kitchen Cabinets', 4, 3131),\n" +
            "(3132, 'SIC', 2431, 'Millwork', 4, 3131),\n" +
            "(3136, 'SIC', 2439, 'Structural Wood Members, nec', 4, 3131),\n" +
            "(3135, 'SIC', 2436, 'Softwood Veneer & Plywood', 4, 3131),\n" +
            "(3139, 'SIC', 2448, 'Wood Pallets & Skids', 4, 3137),\n" +
            "(3138, 'SIC', 2441, 'Nailed Wood Boxes & Shook', 4, 3137),\n" +
            "(3140, 'SIC', 2449, 'Wood Containers, nec', 4, 3137),\n" +
            "(2281, 'SEC', 2451, 'Mobile Homes', 4, 2280),\n" +
            "(2282, 'SEC', 2452, 'Prefabricated Wood Buildings', 4, 2280),\n" +
            "(3142, 'SIC', 2451, 'Mobile Homes', 4, 3141),\n" +
            "(3143, 'SIC', 2452, 'Prefabricated Wood Buildings', 4, 3141),\n" +
            "(3106, 'SIC', 2370, 'Fur Goods', 3, 3083),\n" +
            "(3181, 'SIC', 2671, 'Paper Coated & Laminated, Packaging', 4, 3180),\n" +
            "(3182, 'SIC', 2672, 'Paper Coated & Laminated, nec', 4, 3180),\n" +
            "(2304, 'SEC', 2711, 'Newspapers', 4, 2303),\n" +
            "(3192, 'SIC', 2711, 'Newspapers', 4, 3191),\n" +
            "(2306, 'SEC', 2721, 'Periodicals', 4, 2305),\n" +
            "(3194, 'SIC', 2721, 'Periodicals', 4, 3193),\n" +
            "(2309, 'SEC', 2732, 'Book Printing', 4, 2307),\n" +
            "(2308, 'SEC', 2731, 'Book Publishing', 4, 2307),\n" +
            "(3224, 'SIC', 2824, 'Organic Fibers, Noncellulosic', 4, 3220),\n" +
            "(2326, 'SEC', 2835, 'Diagnostic Substances', 4, 2323),\n" +
            "(2327, 'SEC', 2836, 'Biological Products, Except Diagnostic', 4, 2323),\n" +
            "(2324, 'SEC', 2833, 'Medicinals & Botanicals', 4, 2323),\n" +
            "(2325, 'SEC', 2834, 'Pharmaceutical Preparations', 4, 2323),\n" +
            "(3229, 'SIC', 2836, 'Biological Products, Except Diagnostic', 4, 3225),\n" +
            "(3226, 'SIC', 2833, 'Medicinals & Botanicals', 4, 3225),\n" +
            "(3228, 'SIC', 2835, 'Diagnostic Substances', 4, 3225),\n" +
            "(3227, 'SIC', 2834, 'Pharmaceutical Preparations', 4, 3225),\n" +
            "(2329, 'SEC', 2842, 'Polishes & Sanitation Goods', 4, 2328),\n" +
            "(2330, 'SEC', 2844, 'Perfumes & Cosmetics -Toilet Preparations', 4, 2328),\n" +
            "(3231, 'SIC', 2841, 'Soap & Other Detergents', 4, 3230),\n" +
            "(3232, 'SIC', 2842, 'Polishes & Sanitation Goods', 4, 3230),\n" +
            "(3233, 'SIC', 2843, 'Surface Active Agents', 4, 3230),\n" +
            "(3234, 'SIC', 2844, 'Perfumes & Cosmetics -Toilet Preparations', 4, 3230),\n" +
            "(2332, 'SEC', 2851, 'Paints & Allied Products', 4, 2331),\n" +
            "(3236, 'SIC', 2851, 'Paints & Allied Products', 4, 3235),\n" +
            "(3240, 'SIC', 2869, 'Industrial Organic Chemicals, nec', 4, 3237),\n" +
            "(3238, 'SIC', 2861, 'Gum & Wood Chemicals', 4, 3237),\n" +
            "(3239, 'SIC', 2865, 'Cyclic Crudes & Intermediates', 4, 3237),\n" +
            "(3244, 'SIC', 2875, 'Fertilizers, Mixing Only', 4, 3241),\n" +
            "(3245, 'SIC', 2879, 'Agricultural Chemicals, nec', 4, 3241),\n" +
            "(3243, 'SIC', 2874, 'Phosphatic Fertilizers', 4, 3241),\n" +
            "(3242, 'SIC', 2873, 'Nitrogenous Fertilizers', 4, 3241);\n";
    static String industryCodeInsert3 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(2336, 'SEC', 2891, 'Adhesives & Sealants', 4, 2335),\n" +
            "(3251, 'SIC', 2899, 'Chemical Preparations, nec', 4, 3246),\n" +
            "(3247, 'SIC', 2891, 'Adhesives & Sealants', 4, 3246),\n" +
            "(3249, 'SIC', 2893, 'Printing Ink', 4, 3246),\n" +
            "(3250, 'SIC', 2895, 'Carbon Black', 4, 3246),\n" +
            "(2339, 'SEC', 2911, 'Petroleum Refining', 4, 2338),\n" +
            "(3254, 'SIC', 2911, 'Petroleum Refining', 4, 3253),\n" +
            "(3256, 'SIC', 2951, 'Asphalt Paving Mixtures & Blocks', 4, 3255),\n" +
            "(3257, 'SIC', 2952, 'Asphalt Felts & Coatings', 4, 3255),\n" +
            "(3260, 'SIC', 2999, 'Petroleum & Coal Products, nec', 4, 3258),\n" +
            "(2363, 'SEC', 3241, 'Cement, Hydraulic', 4, 2362),\n" +
            "(3310, 'SIC', 3241, 'Cement, Hydraulic', 4, 3309),\n" +
            "(3313, 'SIC', 3253, 'Ceramic Wall & Floor Tile', 4, 3311),\n" +
            "(3314, 'SIC', 3255, 'Clay Refectories', 4, 3311),\n" +
            "(3315, 'SIC', 3259, 'Structural Clay Products, nec', 4, 3311),\n" +
            "(3312, 'SIC', 3251, 'Brick & Structural Clay Tile', 4, 3311),\n" +
            "(3351, 'SIC', 3334, 'Primary Aluminum', 4, 3349),\n" +
            "(3352, 'SIC', 3339, 'Primary Nonferrous Metals, nec', 4, 3349),\n" +
            "(3350, 'SIC', 3331, 'Primary Copper', 4, 3349),\n" +
            "(2379, 'SEC', 3341, 'Secondary Nonferrous Metals', 4, 2378),\n" +
            "(3354, 'SIC', 3341, 'Secondary Nonferrous Metals', 4, 3353),\n" +
            "(2381, 'SEC', 3357, 'Nonferrous Wiredrawing & Insulating', 4, 2380),\n" +
            "(3357, 'SIC', 3353, 'Aluminum Sheet, Plate & Foil', 4, 3355),\n" +
            "(3359, 'SIC', 3355, 'Aluminum Rolling & Drawing, nec', 4, 3355),\n" +
            "(3361, 'SIC', 3357, 'Nonferrous Wiredrawing & Insulating', 4, 3355),\n" +
            "(3360, 'SIC', 3356, 'Nonferrous Rolling & Drawing, nec', 4, 3355),\n" +
            "(3356, 'SIC', 3351, 'Copper Rolling & Drawing', 4, 3355),\n" +
            "(3358, 'SIC', 3354, 'Aluminum Extruded Products', 4, 3355),\n" +
            "(3365, 'SIC', 3365, 'Aluminum Foundries', 4, 3362),\n" +
            "(3367, 'SIC', 3369, 'Nonferrous Foundries, nec', 4, 3362),\n" +
            "(3364, 'SIC', 3364, 'Nonferrous Die Castings, Except Aluminum', 4, 3362),\n" +
            "(3366, 'SIC', 3366, 'Copper Foundries', 4, 3362),\n" +
            "(3363, 'SIC', 3363, 'Aluminum Die Castings', 4, 3362),\n" +
            "(3370, 'SIC', 3399, 'Primary Metal Products, nec', 4, 3368),\n" +
            "(3369, 'SIC', 3398, 'Metal Heat Treating', 4, 3368),\n" +
            "(2400, 'SEC', 3470, 'Metal Services, nec', 3, 2384),\n" +
            "(3385, 'SIC', 3441, 'Fabricated Structural Metal', 4, 3384),\n" +
            "(2398, 'SEC', 3452, 'Bolts, Nuts, Rivets & Washers', 4, 2396),\n" +
            "(2397, 'SEC', 3451, 'Screw Machine Products', 4, 2396),\n" +
            "(3394, 'SIC', 3452, 'Bolts, Nuts, Rivets & Washers', 4, 3392),\n" +
            "(3393, 'SIC', 3451, 'Screw Machine Products', 4, 3392),\n" +
            "(3399, 'SIC', 3466, 'Crowns & Closures', 4, 3395),\n" +
            "(3400, 'SIC', 3469, 'Metal Stampings, nec', 4, 3395),\n" +
            "(3396, 'SIC', 3462, 'Iron & Steel Forgings', 4, 3395),\n" +
            "(3397, 'SIC', 3463, 'Nonferrous Forgings', 4, 3395),\n" +
            "(3398, 'SIC', 3465, 'Automotive Stampings', 4, 3395),\n" +
            "(3402, 'SIC', 3471, 'Plating & Polishing', 4, 3401),\n" +
            "(3403, 'SIC', 3479, 'Metal Coating & Allied Services', 4, 3401),\n" +
            "(3406, 'SIC', 3483, 'Ammunition, Except for Small Arms, nec', 4, 3404),\n" +
            "(3405, 'SIC', 3482, 'Small Arms Ammunition', 4, 3404),\n" +
            "(3408, 'SIC', 3489, 'Ordnance & Accessories, nec', 4, 3404),\n" +
            "(3407, 'SIC', 3484, 'Small Arms', 4, 3404),\n" +
            "(3412, 'SIC', 3493, 'Steel Spring, Except Wire', 4, 3409),\n" +
            "(3418, 'SIC', 3499, 'Fabricated Metal Products, nec', 4, 3409),\n" +
            "(3417, 'SIC', 3498, 'Fabricated Pipe & Fittings', 4, 3409),\n" +
            "(3416, 'SIC', 3497, 'Metal Foil & Leaf', 4, 3409),\n" +
            "(3415, 'SIC', 3496, 'Miscellaneous Fabricated Wire Products', 4, 3409),\n" +
            "(3414, 'SIC', 3495, 'Wire Springs', 4, 3409),\n" +
            "(3413, 'SIC', 3494, 'Valves & Pipe Fittings, nec', 4, 3409),\n" +
            "(3411, 'SIC', 3492, 'Fluid Power Valves & Hose Fittings', 4, 3409),\n" +
            "(3410, 'SIC', 3491, 'Industrial Valves', 4, 3409),\n" +
            "(3422, 'SIC', 3519, 'Internal Combustion Engines, nec', 4, 3420),\n" +
            "(3421, 'SIC', 3511, 'Turbines & Turbine Generator Sets', 4, 3420),\n" +
            "(2407, 'SEC', 3524, 'Lawn & Garden Equipment', 4, 2405),\n" +
            "(2406, 'SEC', 3523, 'Farm Machinery & Equipment', 4, 2405),\n" +
            "(3425, 'SIC', 3524, 'Lawn & Garden Equipment', 4, 3423),\n" +
            "(3424, 'SIC', 3523, 'Farm Machinery & Equipment', 4, 3423),\n" +
            "(2412, 'SEC', 3537, 'Industrial Trucks & Tractors', 4, 2408),\n" +
            "(2409, 'SEC', 3531, 'Construction Machinery', 4, 2408),\n" +
            "(2410, 'SEC', 3532, 'Mining Machinery', 4, 2408),\n" +
            "(2411, 'SEC', 3533, 'Oil & Gas Field Machinery', 4, 2408),\n" +
            "(3427, 'SIC', 3531, 'Construction Machinery', 4, 3426),\n" +
            "(3433, 'SIC', 3537, 'Industrial Trucks & Tractors', 4, 3426),\n" +
            "(3450, 'SIC', 3559, 'Special Industry Machinery, nec', 4, 3444),\n" +
            "(3445, 'SIC', 3552, 'TEXTile Machinery', 4, 3444),\n" +
            "(3447, 'SIC', 3554, 'Paper Industries Machinery', 4, 3444),\n" +
            "(3446, 'SIC', 3553, 'Woodworking Machinery', 4, 3444),\n" +
            "(3448, 'SIC', 3555, 'Printing Trades Machinery', 4, 3444),\n" +
            "(2420, 'SEC', 3562, 'Ball & Roller Bearings', 4, 2418),\n" +
            "(2421, 'SEC', 3564, 'Blowers & Fans', 4, 2418),\n" +
            "(2422, 'SEC', 3567, 'Industrial Furnaces & Ovens', 4, 2418),\n" +
            "(2423, 'SEC', 3569, 'General Industrial Machinery, nec', 4, 2418),\n" +
            "(2419, 'SEC', 3561, 'Pumps & Pumping Equipment', 4, 2418),\n" +
            "(3452, 'SIC', 3561, 'Pumps & Pumping Equipment', 4, 3451),\n" +
            "(3454, 'SIC', 3563, 'Air & Gas Compressors', 4, 3451),\n" +
            "(3455, 'SIC', 3564, 'Blowers & Fans', 4, 3451),\n" +
            "(3456, 'SIC', 3565, 'Packaging Machinery', 4, 3451),\n" +
            "(3457, 'SIC', 3566, 'Speed Changers, Drives & Gears', 4, 3451),\n" +
            "(3458, 'SIC', 3567, 'Industrial Furnaces & Ovens', 4, 3451),\n" +
            "(3459, 'SIC', 3568, 'Power Transmission Equipment, nec', 4, 3451),\n" +
            "(3460, 'SIC', 3569, 'General Industrial Machinery, nec', 4, 3451),\n" +
            "(3453, 'SIC', 3562, 'Ball & Roller Bearings', 4, 3451),\n" +
            "(2426, 'SEC', 3572, 'Computer Storage Devices', 4, 2424),\n" +
            "(2428, 'SEC', 3577, 'Computer Peripheral Equipment, nec', 4, 2424),\n" +
            "(2429, 'SEC', 3578, 'Calculating & Accounting Equipment', 4, 2424),\n" +
            "(2430, 'SEC', 3579, 'Office Machines, nec', 4, 2424),\n" +
            "(2425, 'SEC', 3571, 'Electronic Computers', 4, 2424),\n" +
            "(2427, 'SEC', 3575, 'Computer Terminals', 4, 2424),\n" +
            "(3462, 'SIC', 3571, 'Electronic Computers', 4, 3461),\n" +
            "(3463, 'SIC', 3572, 'Computer Storage Devices', 4, 3461),\n" +
            "(3464, 'SIC', 3575, 'Computer Terminals', 4, 3461),\n" +
            "(3465, 'SIC', 3577, 'Computer Peripheral Equipment, nec', 4, 3461),\n" +
            "(3466, 'SIC', 3578, 'Calculating & Accounting Equipment', 4, 3461),\n" +
            "(3467, 'SIC', 3579, 'Office Machines, nec', 4, 3461),\n" +
            "(2432, 'SEC', 3585, 'Refrigeration & Heating Equipment', 4, 2431),\n" +
            "(3473, 'SIC', 3589, 'Service Industry Machinery, nec', 4, 3468),\n" +
            "(3472, 'SIC', 3586, 'Measuring & Dispensing Pumps', 4, 3468),\n" +
            "(3469, 'SIC', 3581, 'Automatic Vending Machines', 4, 3468),\n" +
            "(3470, 'SIC', 3582, 'Commercial Laundry Equipment', 4, 3468),\n" +
            "(3471, 'SIC', 3585, 'Refrigeration & Heating Equipment', 4, 3468),\n" +
            "(3475, 'SIC', 3592, 'Carburetors, Piston Rings & Valves', 4, 3474),\n" +
            "(3479, 'SIC', 3599, 'Industrial Machinery, nec', 4, 3474),\n" +
            "(3476, 'SIC', 3593, 'Fluid Power Cylinders & Actuators', 4, 3474),\n" +
            "(3477, 'SIC', 3594, 'Fluid Power Pumps & Motors', 4, 3474),\n" +
            "(3478, 'SIC', 3596, 'Scales & Balances, Except Laboratory', 4, 3474),\n" +
            "(2437, 'SEC', 3613, 'Switchgear & Switchboard Apparatus', 4, 2435),\n" +
            "(2436, 'SEC', 3612, 'Transformers, Except Electronic', 4, 2435),\n" +
            "(3503, 'SIC', 3648, 'Lighting Equipment, nec', 4, 3496),\n" +
            "(3501, 'SIC', 3646, 'Commercial Lighting Fixtures', 4, 3496),\n" +
            "(3500, 'SIC', 3645, 'Residential Lighting Fixtures', 4, 3496),\n" +
            "(3499, 'SIC', 3644, 'Noncurrent-Carrying Wiring Devices', 4, 3496),\n" +
            "(3498, 'SIC', 3643, 'Current-Carrying Wiring Devices', 4, 3496),\n" +
            "(3497, 'SIC', 3641, 'Electric Lamps', 4, 3496),\n" +
            "(2444, 'SEC', 3651, 'Household Audio & Video Equipment', 4, 2443),\n" +
            "(2445, 'SEC', 3652, 'Prerecorded Records & Tapes', 4, 2443),\n" +
            "(3506, 'SIC', 3652, 'Prerecorded Records & Tapes', 4, 3504),\n" +
            "(3505, 'SIC', 3651, 'Household Audio & Video Equipment', 4, 3504),\n" +
            "(2449, 'SEC', 3669, 'Communications Equipment, nec', 4, 2446),\n" +
            "(2447, 'SEC', 3661, 'Telephone & Telegraph Apparatus', 4, 2446),\n" +
            "(2448, 'SEC', 3663, 'Radio & TV Communications Equipment', 4, 2446),\n" +
            "(3508, 'SIC', 3661, 'Telephone & Telegraph Apparatus', 4, 3507),\n" +
            "(3509, 'SIC', 3663, 'Radio & TV Communications Equipment', 4, 3507),\n" +
            "(3510, 'SIC', 3669, 'Communications Equipment, nec', 4, 3507),\n" +
            "(2451, 'SEC', 3672, 'Printed Circuit Boards', 4, 2450),\n" +
            "(2453, 'SEC', 3677, 'Electronic Coils & Transformers', 4, 2450),\n" +
            "(2452, 'SEC', 3674, 'Semiconductors & Related Devices', 4, 2450),\n" +
            "(2454, 'SEC', 3678, 'Electronic Connectors', 4, 2450),\n" +
            "(2455, 'SEC', 3679, 'Electronic Components, nec', 4, 2450),\n" +
            "(3516, 'SIC', 3676, 'Electronic Resistors', 4, 3511),\n" +
            "(3519, 'SIC', 3679, 'Electronic Components, nec', 4, 3511),\n" +
            "(3518, 'SIC', 3678, 'Electronic Connectors', 4, 3511),\n" +
            "(3517, 'SIC', 3677, 'Electronic Coils & Transformers', 4, 3511),\n" +
            "(3515, 'SIC', 3675, 'Electronic Capacitors', 4, 3511),\n" +
            "(3514, 'SIC', 3674, 'Semiconductors & Related Devices', 4, 3511),\n" +
            "(3513, 'SIC', 3672, 'Printed Circuit Boards', 4, 3511),\n" +
            "(3512, 'SIC', 3671, 'Electron Tubes', 4, 3511),\n" +
            "(2457, 'SEC', 3695, 'Magnetic & Optical Recording Media', 4, 2456),\n" +
            "(3521, 'SIC', 3691, 'Storage Batteries', 4, 3520),\n" +
            "(3522, 'SIC', 3692, 'Primary Batteries, Dry & Wet', 4, 3520),\n" +
            "(3523, 'SIC', 3694, 'Engine Electrical Equipment', 4, 3520),\n" +
            "(3524, 'SIC', 3695, 'Magnetic & Optical Recording Media', 4, 3520),\n" +
            "(3525, 'SIC', 3699, 'Electrical Equipment & Supplies, nec', 4, 3520),\n" +
            "(2460, 'SEC', 3711, 'Motor Vehicles & Car Bodies', 4, 2459),\n" +
            "(2464, 'SEC', 3716, 'Motor Homes', 4, 2459),\n" +
            "(2463, 'SEC', 3715, 'Truck Trailers', 4, 2459),\n" +
            "(2462, 'SEC', 3714, 'Motor Vehicle Parts & Accessories', 4, 2459),\n" +
            "(2461, 'SEC', 3713, 'Truck & Bus Bodies', 4, 2459),\n" +
            "(3532, 'SIC', 3716, 'Motor Homes', 4, 3527),\n" +
            "(3528, 'SIC', 3711, 'Motor Vehicles & Car Bodies', 4, 3527),\n" +
            "(3530, 'SIC', 3714, 'Motor Vehicle Parts & Accessories', 4, 3527),\n" +
            "(3531, 'SIC', 3715, 'Truck Trailers', 4, 3527),\n" +
            "(3529, 'SIC', 3713, 'Truck & Bus Bodies', 4, 3527),\n" +
            "(2467, 'SEC', 3724, 'Aircraft Engines & Engine Parts', 4, 2465),\n" +
            "(2468, 'SEC', 3728, 'Aircraft Parts & Equipment, nec', 4, 2465),\n" +
            "(2466, 'SEC', 3721, 'Aircraft', 4, 2465),\n" +
            "(3534, 'SIC', 3721, 'Aircraft', 4, 3533),\n" +
            "(3559, 'SIC', 3824, 'Fluid Meters & Counting Devices', 4, 3555),\n" +
            "(3560, 'SIC', 3825, 'Instruments to Measure Electricity', 4, 3555),\n" +
            "(3561, 'SIC', 3826, 'Analytical Instruments', 4, 3555),\n" +
            "(3563, 'SIC', 3829, 'Measuring & Controlling Devices, nec', 4, 3555),\n" +
            "(3562, 'SIC', 3827, 'Optical Instruments & Lenses', 4, 3555),\n" +
            "(3556, 'SIC', 3821, 'Laboratory Apparatus & Furniture', 4, 3555),\n" +
            "(3557, 'SIC', 3822, 'Environmental Controls', 4, 3555),\n" +
            "(3558, 'SIC', 3823, 'Process Control Instruments', 4, 3555),\n" +
            "(2490, 'SEC', 3842, 'Surgical Appliances & Supplies', 4, 2488),\n" +
            "(2491, 'SEC', 3843, 'Dental Equipment & Supplies', 4, 2488),\n" +
            "(2492, 'SEC', 3844, 'X-Ray Apparatus & Tubes', 4, 2488),\n" +
            "(2493, 'SEC', 3845, 'Electromedical Equipment', 4, 2488),\n" +
            "(2489, 'SEC', 3841, 'Surgical & Medical Instruments', 4, 2488),\n" +
            "(3565, 'SIC', 3841, 'Surgical & Medical Instruments', 4, 3564),\n" +
            "(3566, 'SIC', 3842, 'Surgical Appliances & Supplies', 4, 3564),\n" +
            "(3567, 'SIC', 3843, 'Dental Equipment & Supplies', 4, 3564),\n" +
            "(3568, 'SIC', 3844, 'X-Ray Apparatus & Tubes', 4, 3564),\n" +
            "(3569, 'SIC', 3845, 'Electromedical Equipment', 4, 3564),\n" +
            "(2495, 'SEC', 3851, 'Ophthalmic Goods', 4, 2494),\n" +
            "(3571, 'SIC', 3851, 'Ophthalmic Goods', 4, 3570),\n" +
            "(2497, 'SEC', 3861, 'Photographic Equipment & Supplies', 4, 2496),\n" +
            "(3573, 'SIC', 3861, 'Photographic Equipment & Supplies', 4, 3572),\n" +
            "(2499, 'SEC', 3873, 'Watches, Clocks, Watchcases & Parts', 4, 2498),\n" +
            "(3575, 'SIC', 3873, 'Watches, Clocks, Watchcases & Parts', 4, 3574),\n" +
            "(2502, 'SEC', 3911, 'Jewelry, Precious Metal', 4, 2501),\n" +
            "(3580, 'SIC', 3915, 'Jewelers'' Materials & Lapidary Work', 4, 3577),\n" +
            "(3579, 'SIC', 3914, 'Silverware & Plated Ware', 4, 3577),\n" +
            "(3578, 'SIC', 3911, 'Jewelry, Precious Metal', 4, 3577),\n" +
            "(2504, 'SEC', 3931, 'Musical Instruments', 4, 2503),\n" +
            "(3582, 'SIC', 3931, 'Musical Instruments', 4, 3581),\n" +
            "(3632, 'SIC', 4231, 'Trucking Terminal Facilities', 4, 3631),\n" +
            "(3635, 'SIC', 4311, 'US Postal Service', 4, 3634),\n" +
            "(2541, 'SEC', 4812, 'Radiotelephone Communications', 4, 2540),\n" +
            "(2542, 'SEC', 4813, 'Telephone Communications, Except Radio', 4, 2540),\n" +
            "(3682, 'SIC', 4812, 'Radiotelephone Communications', 4, 3681),\n" +
            "(3683, 'SIC', 4813, 'Telephone Communications, Except Radio', 4, 3681),\n" +
            "(2544, 'SEC', 4822, 'Telegraph & Other Communications', 4, 2543),\n" +
            "(3685, 'SIC', 4822, 'Telegraph & Other Communications', 4, 3684),\n" +
            "(2546, 'SEC', 4832, 'Radio Broadcasting Stations', 4, 2545),\n" +
            "(2547, 'SEC', 4833, 'Television Broadcasting Stations', 4, 2545),\n" +
            "(3688, 'SIC', 4833, 'Television Broadcasting Stations', 4, 3686),\n" +
            "(3687, 'SIC', 4832, 'Radio Broadcasting Stations', 4, 3686),\n" +
            "(2549, 'SEC', 4841, 'Cable & Other Pay TV Services', 4, 2548),\n" +
            "(3690, 'SIC', 4841, 'Cable & Other Pay TV Services', 4, 3689),\n" +
            "(2551, 'SEC', 4899, 'Communications Services, nec', 4, 2550),\n" +
            "(3692, 'SIC', 4899, 'Communications Services, nec', 4, 3691),\n" +
            "(3725, 'SIC', 5031, 'Lumber, Plywood & Millwork', 4, 3724),\n" +
            "(3727, 'SIC', 5033, 'Roofing, Siding & Insulation', 4, 3724),\n" +
            "(2576, 'SEC', 5047, 'Medical & Hospital Equipment', 4, 2574),\n" +
            "(2575, 'SEC', 5045, 'Computers, Peripherals & Software', 4, 2574),\n" +
            "(3732, 'SIC', 5045, 'Computers, Peripherals & Software', 4, 3729),\n" +
            "(3736, 'SIC', 5049, 'Professional Equipment, nec', 4, 3729),\n" +
            "(3735, 'SIC', 5048, 'Ophthalmic Goods', 4, 3729),\n" +
            "(3734, 'SIC', 5047, 'Medical & Hospital Equipment', 4, 3729),\n" +
            "(3733, 'SIC', 5046, 'Commercial Equipment, nec', 4, 3729),\n" +
            "(3731, 'SIC', 5044, 'Office Equipment', 4, 3729),\n" +
            "(3730, 'SIC', 5043, 'Photographic Equipment & Supplies', 4, 3729),\n" +
            "(2578, 'SEC', 5051, 'Metals Service Centers & Offices', 4, 2577),\n" +
            "(3738, 'SIC', 5051, 'Metals Service Centers & Offices', 4, 3737),\n" +
            "(3739, 'SIC', 5052, 'Coal & Other Minerals & Ores', 4, 3737),\n" +
            "(2580, 'SEC', 5063, 'Electrical Apparatus & Equipment', 4, 2579),\n" +
            "(2581, 'SEC', 5064, 'Electrical Appliances, TV & Radios', 4, 2579),\n" +
            "(3758, 'SIC', 5092, 'Toys & Hobby Goods & Supplies', 4, 3756),\n" +
            "(3759, 'SIC', 5093, 'Scrap & Waste Materials', 4, 3756),\n" +
            "(3760, 'SIC', 5094, 'Jewelry & Precious Stones', 4, 3756),\n" +
            "(3757, 'SIC', 5091, 'Sporting & Recreational Goods', 4, 3756),\n" +
            "(3766, 'SIC', 5113, 'Industrial & Personal Service Paper', 4, 3763),\n" +
            "(3764, 'SIC', 5111, 'Printing & Writing Paper', 4, 3763),\n" +
            "(3765, 'SIC', 5112, 'Stationery & Office Supplies', 4, 3763),\n" +
            "(2594, 'SEC', 5122, 'Drugs, Proprietaries & Sundries', 4, 2593),\n" +
            "(3768, 'SIC', 5122, 'Drugs, Proprietaries & Sundries', 4, 3767),\n" +
            "(3770, 'SIC', 5131, 'Piece Goods & Notations', 4, 3769),\n" +
            "(3773, 'SIC', 5139, 'Footwear', 4, 3769),\n" +
            "(3772, 'SIC', 5137, 'Women''s & Children''s Clothing', 4, 3769),\n" +
            "(3771, 'SIC', 5136, 'Men''s & Boys'' Clothing', 4, 3769),\n" +
            "(2597, 'SEC', 5141, 'Groceries, General Line', 4, 2596),\n" +
            "(3775, 'SIC', 5141, 'Groceries, General Line', 4, 3774),\n" +
            "(3776, 'SIC', 5142, 'Packaged Frozen Foods', 4, 3774),\n" +
            "(3777, 'SIC', 5143, 'Dairy Products, Except Dried or Canned', 4, 3774),\n" +
            "(3778, 'SIC', 5144, 'Poultry & Poultry Products', 4, 3774),\n" +
            "(3779, 'SIC', 5145, 'Confectionery', 4, 3774),\n" +
            "(3780, 'SIC', 5146, 'Fish & Seafoods', 4, 3774),\n" +
            "(3781, 'SIC', 5147, 'Meat & Meat Products', 4, 3774),\n" +
            "(3783, 'SIC', 5149, 'Groceries & Related Products, nec', 4, 3774),\n" +
            "(3782, 'SIC', 5148, 'Fresh Fruits & Vegetables', 4, 3774),\n" +
            "(3786, 'SIC', 5154, 'Livestock', 4, 3784),\n" +
            "(3785, 'SIC', 5153, 'Grain & Field Beans', 4, 3784),\n" +
            "(3787, 'SIC', 5159, 'Farm-Product Raw Materials, nec', 4, 3784),\n" +
            "(3789, 'SIC', 5162, 'Plastics Materials & Basic Shapes', 4, 3788),\n" +
            "(3790, 'SIC', 5169, 'Chemicals & Allied Products, nec', 4, 3788),\n" +
            "(2601, 'SEC', 5171, 'Petroleum Bulk Stations &Terminals', 4, 2600),\n" +
            "(2602, 'SEC', 5172, 'Petroleum Products, nec', 4, 2600),\n" +
            "(3793, 'SIC', 5172, 'Petroleum Products, nec', 4, 3791),\n" +
            "(3792, 'SIC', 5171, 'Petroleum Bulk Stations &Terminals', 4, 3791),\n" +
            "(3796, 'SIC', 5182, 'Wines & Distilled Beverages', 4, 3794),\n" +
            "(3795, 'SIC', 5181, 'Beer & Ale', 4, 3794),\n" +
            "(3800, 'SIC', 5193, 'Flowers & Florists'' Supplies', 4, 3797),\n" +
            "(3798, 'SIC', 5191, 'Farm Supplies', 4, 3797),\n" +
            "(3799, 'SIC', 5192, 'Books, Periodicals & Newspapers', 4, 3797),\n" +
            "(3803, 'SIC', 5199, 'Nondurable Goods, nec', 4, 3797),\n" +
            "(3802, 'SIC', 5198, 'Paints, Varnishes & Supplies', 4, 3797),\n" +
            "(3801, 'SIC', 5194, 'Tobacco & Tobacco Products', 4, 3797),\n" +
            "(3890, 'SIC', 5921, 'Liquor Stores', 4, 3889),\n" +
            "(3892, 'SIC', 5932, 'Used Merchandise Stores', 4, 3891),\n" +
            "(2644, 'SEC', 5944, 'Jewelers Stores', 4, 2643),\n" +
            "(2645, 'SEC', 5945, 'Hobby, Toy & Game Shops', 4, 2643),\n" +
            "(3896, 'SIC', 5943, 'Stationary Stores', 4, 3893),\n" +
            "(3895, 'SIC', 5942, 'Book Stores', 4, 3893),\n" +
            "(3894, 'SIC', 5941, 'Sporting Goods & Bicycle Shops', 4, 3893),\n" +
            "(3897, 'SIC', 5944, 'Jewelers Stores', 4, 3893),\n" +
            "(3902, 'SIC', 5949, 'Sewing, Needlework & Piece Goods', 4, 3893),\n" +
            "(3901, 'SIC', 5948, 'Luggage & Leather Goods Stores', 4, 3893),\n" +
            "(3900, 'SIC', 5947, 'Gift, Novelty & Souvenir Shops', 4, 3893),\n" +
            "(3899, 'SIC', 5946, 'Camera & Photographic Supply Stores', 4, 3893),\n" +
            "(3898, 'SIC', 5945, 'Hobby, Toy & Game Shops', 4, 3893),\n" +
            "(2647, 'SEC', 5961, 'Catalog & Mail Order Houses', 4, 2646),\n" +
            "(3906, 'SIC', 5963, 'Direct Selling Establishments', 4, 3903),\n" +
            "(3905, 'SIC', 5962, 'Merchandising Machine Operators', 4, 3903),\n" +
            "(3904, 'SIC', 5961, 'Catalog & Mail Order Houses', 4, 3903),\n" +
            "(3910, 'SIC', 5989, 'Fuel Dealers, nec', 4, 3907),\n" +
            "(3909, 'SIC', 5984, 'Liquefied Petroleum Gas Dealers', 4, 3907),\n" +
            "(3908, 'SIC', 5983, 'Fuel Oil Dealers', 4, 3907),\n" +
            "(3915, 'SIC', 5995, 'Optical Goods Stores', 4, 3911),\n" +
            "(3912, 'SIC', 5992, 'Florists', 4, 3911),\n" +
            "(3913, 'SIC', 5993, 'Tobacco Stores & Stands', 4, 3911),\n" +
            "(3914, 'SIC', 5994, 'News Dealers & News Stands', 4, 3911),\n" +
            "(3916, 'SIC', 5999, 'Miscellaneous Retail Stores, nec', 4, 3911),\n" +
            "(3998, 'SIC', 6726, 'Investment Offices, nec', 4, 3996),\n" +
            "(3997, 'SIC', 6722, 'Management Investment Open-End', 4, 3996),\n" +
            "(4000, 'SIC', 6732, 'Education, Religious, Etc. Trusts', 4, 3999),\n" +
            "(4001, 'SIC', 6733, 'Trusts, nec', 4, 3999),\n" +
            "(2706, 'SEC', 6794, 'Patent Owners & Lessors', 4, 2704),\n" +
            "(2705, 'SEC', 6792, 'Oil Royalty Traders', 4, 2704),\n" +
            "(2707, 'SEC', 6798, 'Real Estate Investment Trusts', 4, 2704),\n" +
            "(2708, 'SEC', 6799, 'Investors, nec', 4, 2704),\n" +
            "(4004, 'SIC', 6794, 'Patent Owners & Lessors', 4, 4002),\n" +
            "(4003, 'SIC', 6792, 'Oil Royalty Traders', 4, 4002),\n" +
            "(4005, 'SIC', 6798, 'Real Estate Investment Trusts', 4, 4002),\n" +
            "(4006, 'SIC', 6799, 'Investors, nec', 4, 4002),\n" +
            "(4067, 'SIC', 7372, 'Prepackaged Software', 4, 4065),\n" +
            "(4074, 'SIC', 7379, 'Computer Related Services, nec', 4, 4065),\n" +
            "(4066, 'SIC', 7371, 'Computer Programming Services', 4, 4065),\n" +
            "(4073, 'SIC', 7378, 'Computer Maintenance & Repair', 4, 4065),\n" +
            "(4072, 'SIC', 7377, 'Computer Rental & Leasing', 4, 4065),\n" +
            "(4070, 'SIC', 7375, 'Information Retrieval Services', 4, 4065),\n" +
            "(2732, 'SEC', 7381, 'Detective & Armored Car Services', 4, 2731),\n" +
            "(2733, 'SEC', 7384, 'Photo Finishing Laboratories', 4, 2731),\n" +
            "(2734, 'SEC', 7389, 'Trade Shows & Fairs', 4, 2731),\n" +
            "(4077, 'SIC', 7382, 'Security Systems Services', 4, 4075),\n" +
            "(4080, 'SIC', 7389, 'Trade Shows & Fairs', 4, 4075),\n" +
            "(4078, 'SIC', 7383, 'News Syndicates', 4, 4075),\n" +
            "(4076, 'SIC', 7381, 'Detective & Armored Car Services', 4, 4075),\n" +
            "(4079, 'SIC', 7384, 'Photo Finishing Laboratories', 4, 4075),\n" +
            "(4083, 'SIC', 7513, 'Truck Rental & Leasing, No Drivers', 4, 4082),\n" +
            "(4086, 'SIC', 7519, 'Utility Trailer Rental', 4, 4082),\n" +
            "(4085, 'SIC', 7515, 'Passenger Car Leasing', 4, 4082),\n" +
            "(4084, 'SIC', 7514, 'Passenger Car Rental', 4, 4082),\n" +
            "(4088, 'SIC', 7521, 'Automobile Parking', 4, 4087),\n" +
            "(4091, 'SIC', 7533, 'Auto Exhaust System Repair Shops', 4, 4089),\n" +
            "(4093, 'SIC', 7536, 'Automotive Glass Replacement Shops', 4, 4089),\n" +
            "(4092, 'SIC', 7534, 'Tire Retreading & Repair Shops', 4, 4089),\n" +
            "(4096, 'SIC', 7539, 'Automotive Repair Shops, nec', 4, 4089),\n" +
            "(4095, 'SIC', 7538, 'General Automotive Repair Shops', 4, 4089),\n" +
            "(4094, 'SIC', 7537, 'Automotive Transmission Repair Shops', 4, 4089),\n" +
            "(4090, 'SIC', 7532, 'Top & Body Repair & Paint Shops', 4, 4089),\n" +
            "(4099, 'SIC', 7549, 'Automotive Services, nec', 4, 4097),\n" +
            "(4098, 'SIC', 7542, 'Carwashes', 4, 4097),\n" +
            "(4102, 'SIC', 7622, 'Radio & Television Repair', 4, 4101),\n" +
            "(4103, 'SIC', 7623, 'Refrigeration Service & Repair', 4, 4101),\n" +
            "(4104, 'SIC', 7629, 'Electrical Repair Shops, nec', 4, 4101),\n" +
            "(4106, 'SIC', 7631, 'Watch, Clock & Jewelry Repair', 4, 4105),\n" +
            "(4108, 'SIC', 7641, 'Reupholstery & Furniture Repair', 4, 4107),\n" +
            "(4112, 'SIC', 7699, 'Repair Services, nec', 4, 4109),\n" +
            "(4111, 'SIC', 7694, 'Armatures Rewinding Shops', 4, 4109),\n" +
            "(4110, 'SIC', 7692, 'Welding Repair', 4, 4109),\n" +
            "(2740, 'SEC', 7812, 'Motion Picture & Video Production', 4, 2739),\n" +
            "(2741, 'SEC', 7819, 'Services Allied to Motion Pictures', 4, 2739),\n" +
            "(4115, 'SIC', 7812, 'Motion Picture & Video Production', 4, 4114),\n" +
            "(4116, 'SIC', 7819, 'Services Allied to Motion Pictures', 4, 4114),\n" +
            "(2743, 'SEC', 7822, 'Motion Picture & Tape Distribution', 4, 2742),\n" +
            "(2744, 'SEC', 7829, 'Motion Picture Distribution Services', 4, 2742),\n" +
            "(4155, 'SIC', 8042, 'Offices & Clinics of Optometrists', 4, 4153),\n" +
            "(4154, 'SIC', 8041, 'Offices & Clinics of Chiropractors', 4, 4153),\n" +
            "(2757, 'SEC', 8051, 'Skilled Nursing Care Facilities', 4, 2756),\n" +
            "(4159, 'SIC', 8051, 'Skilled Nursing Care Facilities', 4, 4158),\n" +
            "(4161, 'SIC', 8059, 'Nursing & Personal Care, nec', 4, 4158),\n" +
            "(4160, 'SIC', 8052, 'Intermediate Care Facilities', 4, 4158),\n" +
            "(2759, 'SEC', 8062, 'General Medical & Surgical Hospitals', 4, 2758),\n" +
            "(4163, 'SIC', 8062, 'General Medical & Surgical Hospitals', 4, 4162),\n" +
            "(4164, 'SIC', 8063, 'Psychiatric Hospitals', 4, 4162),\n" +
            "(4165, 'SIC', 8069, 'Specialty Hospitals, Except Psychiatric', 4, 4162),\n" +
            "(2761, 'SEC', 8071, 'Medical Laboratories', 4, 2760),\n" +
            "(4168, 'SIC', 8072, 'Dental Laboratories', 4, 4166),\n" +
            "(4167, 'SIC', 8071, 'Medical Laboratories', 4, 4166),\n" +
            "(2763, 'SEC', 8082, 'Home Health Care Services', 4, 2762),\n" +
            "(4170, 'SIC', 8082, 'Home Health Care Services', 4, 4169),\n" +
            "(2765, 'SEC', 8093, 'Specialty Outpatient Clinics, nec', 4, 2764),\n" +
            "(4173, 'SIC', 8093, 'Specialty Outpatient Clinics, nec', 4, 4171),\n" +
            "(4172, 'SIC', 8092, 'Kidney Dialysis Centers', 4, 4171),\n" +
            "(4174, 'SIC', 8099, 'Health & Allied Services, nec', 4, 4171),\n" +
            "(2768, 'SEC', 8111, 'Legal Services', 4, 2767),\n" +
            "(4177, 'SIC', 8111, 'Legal Services', 4, 4176),\n" +
            "(4238, 'SIC', 8743, 'Public Relations Services', 4, 4235),\n" +
            "(4236, 'SIC', 8741, 'Management Services', 4, 4235),\n" +
            "(4237, 'SIC', 8742, 'Management Consulting Services', 4, 4235),\n" +
            "(4239, 'SIC', 8744, 'Facilities Support Services', 4, 4235),\n" +
            "(4240, 'SIC', 8748, 'Business Consulting, nec', 4, 4235),\n" +
            "(4243, 'SIC', 8811, 'Private Households', 4, 4242),\n" +
            "(4246, 'SIC', 8999, 'Services, nec', 4, 4245),\n" +
            "(4292, 'SIC', 9641, 'Regulation of Agricultural Marketing', 4, 4291),\n" +
            "(4294, 'SIC', 9651, 'Regulation Misc. Commercial Sectors', 4, 4293),\n" +
            "(4296, 'SIC', 9661, 'Space Research & Technology', 4, 4295),\n" +
            "(4299, 'SIC', 9711, 'National Security', 4, 4298),\n" +
            "(2787, 'SEC', 9721, 'International Affairs', 4, 2786),\n" +
            "(4301, 'SIC', 9721, 'International Affairs', 4, 4300),\n" +
            "(4304, 'SIC', 9999, 'Nonclassifiable Establishments', 4, 4303),\n" +
            "(56, 'NAICS', 112, 'Animal Production and Aquaculture', 2, 1),\n" +
            "(108, 'NAICS', 114, 'Fishing, Hunting and Trapping', 2, 1),\n" +
            "(2, 'NAICS', 111, 'Crop Production', 2, 1),\n" +
            "(117, 'NAICS', 115, 'Support Activities for Agriculture and Forestry', 2, 1),\n" +
            "(3, 'NAICS', 1111, 'Oilseed and Grain Farming', 3, 2),\n" +
            "(23, 'NAICS', 1113, 'Fruit and Tree Nut Farming', 3, 2),\n" +
            "(43, 'NAICS', 1119, 'Other Crop Farming', 3, 2),\n" +
            "(19, 'NAICS', 1112, 'Vegetable and Melon Farming', 3, 2),\n" +
            "(36, 'NAICS', 1114, 'Greenhouse, Nursery, and Floriculture Production', 3, 2),\n" +
            "(11, 'NAICS', 11114, 'Wheat Farming', 4, 3),\n" +
            "(5, 'NAICS', 11111, 'Soybean Farming', 4, 3),\n" +
            "(13, 'NAICS', 11115, 'Corn Farming', 4, 3),\n" +
            "(15, 'NAICS', 11116, 'Rice Farming', 4, 3),\n" +
            "(16, 'NAICS', 11119, 'Other Grain Farming', 4, 3),\n" +
            "(7, 'NAICS', 11112, 'Oilseed (except Soybean) Farming', 4, 3),\n" +
            "(9, 'NAICS', 11113, 'Dry Pea and Bean Farming', 4, 3),\n" +
            "(4, 'NAICS', 111110, 'Soybean Farming', 5, 5),\n" +
            "(6, 'NAICS', 111120, 'Oilseed (except Soybean) Farming', 5, 7),\n" +
            "(8, 'NAICS', 111130, 'Dry Pea and Bean Farming', 5, 9),\n" +
            "(10, 'NAICS', 111140, 'Wheat Farming', 5, 11),\n" +
            "(14, 'NAICS', 111160, 'Rice Farming', 5, 15),\n" +
            "(17, 'NAICS', 111191, 'Oilseed and Grain Combination Farming', 5, 16),\n" +
            "(18, 'NAICS', 111199, 'All Other Grain Farming', 5, 16),\n" +
            "(20, 'NAICS', 11121, 'Vegetable and Melon Farming', 4, 19),\n" +
            "(21, 'NAICS', 111211, 'Potato Farming', 5, 20),\n" +
            "(4257, 'SIC', 9210, 'Courts', 3, 4256),\n" +
            "(22, 'NAICS', 111219, 'Other Vegetable (except Potato) and Melon Farming', 5, 20),\n" +
            "(28, 'NAICS', 11133, 'Noncitrus Fruit and Tree Nut Farming', 4, 23),\n" +
            "(27, 'NAICS', 11132, 'Citrus (except Orange) Groves', 4, 23),\n" +
            "(25, 'NAICS', 11131, 'Orange Groves', 4, 23),\n" +
            "(24, 'NAICS', 111310, 'Orange Groves', 5, 25),\n" +
            "(26, 'NAICS', 111320, 'Citrus (except Orange) Groves', 5, 27),\n" +
            "(32, 'NAICS', 111334, 'Berry (except Strawberry) Farming', 5, 28),\n" +
            "(33, 'NAICS', 111335, 'Tree Nut Farming', 5, 28),\n" +
            "(34, 'NAICS', 111336, 'Fruit and Tree Nut Combination Farming', 5, 28),\n" +
            "(30, 'NAICS', 111332, 'Grape Vineyards', 5, 28),\n" +
            "(29, 'NAICS', 111331, 'Apple Orchards', 5, 28),\n" +
            "(35, 'NAICS', 111339, 'Other Noncitrus Fruit Farming', 5, 28),\n" +
            "(31, 'NAICS', 111333, 'Strawberry Farming', 5, 28),\n" +
            "(37, 'NAICS', 11141, 'Food Crops Grown Under Cover', 4, 36),\n" +
            "(40, 'NAICS', 11142, 'Nursery and Floriculture Production', 4, 36),\n" +
            "(39, 'NAICS', 111419, 'Other Food Crops Grown Under Cover', 5, 37),\n" +
            "(38, 'NAICS', 111411, 'Mushroom Production', 5, 37),\n" +
            "(42, 'NAICS', 111422, 'Floriculture Production', 5, 40),\n" +
            "(41, 'NAICS', 111421, 'Nursery and Tree Production', 5, 40),\n" +
            "(51, 'NAICS', 11194, 'Hay Farming', 4, 43),\n" +
            "(45, 'NAICS', 11191, 'Tobacco Farming', 4, 43),\n" +
            "(47, 'NAICS', 11192, 'Cotton Farming', 4, 43),\n" +
            "(49, 'NAICS', 11193, 'Sugarcane Farming', 4, 43),\n" +
            "(52, 'NAICS', 11199, 'All Other Crop Farming', 4, 43),\n" +
            "(44, 'NAICS', 111910, 'Tobacco Farming', 5, 45),\n" +
            "(46, 'NAICS', 111920, 'Cotton Farming', 5, 47),\n" +
            "(48, 'NAICS', 111930, 'Sugarcane Farming', 5, 49),\n" +
            "(50, 'NAICS', 111940, 'Hay Farming', 5, 51),\n" +
            "(53, 'NAICS', 111991, 'Sugar Beet Farming', 5, 52),\n" +
            "(55, 'NAICS', 111998, 'All Other Miscellaneous Crop Farming', 5, 52),\n" +
            "(54, 'NAICS', 111992, 'Peanut Farming', 5, 52),\n" +
            "(68, 'NAICS', 1123, 'Poultry and Egg Production', 3, 56),\n" +
            "(65, 'NAICS', 1122, 'Hog and Pig Farming', 3, 56),\n" +
            "(89, 'NAICS', 1129, 'Other Animal Production', 3, 56),\n" +
            "(84, 'NAICS', 1125, 'Aquaculture', 3, 56),\n" +
            "(79, 'NAICS', 1124, 'Sheep and Goat Farming', 3, 56),\n" +
            "(57, 'NAICS', 1121, 'Cattle Ranching and Farming', 3, 56),\n" +
            "(62, 'NAICS', 11212, 'Dairy Cattle and Milk Production', 4, 57),\n" +
            "(64, 'NAICS', 11213, 'Dual-Purpose Cattle Ranching and Farming', 4, 57),\n" +
            "(58, 'NAICS', 11211, 'Beef Cattle Ranching and Farming, including Feedlots', 4, 57),\n" +
            "(59, 'NAICS', 112111, 'Beef Cattle Ranching and Farming', 5, 58),\n" +
            "(60, 'NAICS', 112112, 'Cattle Feedlots', 5, 58),\n" +
            "(61, 'NAICS', 112120, 'Dairy Cattle and Milk Production', 5, 62),\n" +
            "(63, 'NAICS', 112130, 'Dual-Purpose Cattle Ranching and Farming', 5, 64),\n" +
            "(67, 'NAICS', 11221, 'Hog and Pig Farming', 4, 65),\n" +
            "(66, 'NAICS', 112210, 'Hog and Pig Farming', 5, 67),\n" +
            "(70, 'NAICS', 11231, 'Chicken Egg Production', 4, 68),\n" +
            "(72, 'NAICS', 11232, 'Broilers and Other Meat Type Chicken Production', 4, 68),\n" +
            "(76, 'NAICS', 11234, 'Poultry Hatcheries', 4, 68),\n" +
            "(78, 'NAICS', 11239, 'Other Poultry Production', 4, 68),\n" +
            "(74, 'NAICS', 11233, 'Turkey Production', 4, 68),\n" +
            "(69, 'NAICS', 112310, 'Chicken Egg Production', 5, 70),\n" +
            "(71, 'NAICS', 112320, 'Broilers and Other Meat Type Chicken Production', 5, 72),\n" +
            "(73, 'NAICS', 112330, 'Turkey Production', 5, 74),\n" +
            "(75, 'NAICS', 112340, 'Poultry Hatcheries', 5, 76),\n" +
            "(77, 'NAICS', 112390, 'Other Poultry Production', 5, 78),\n" +
            "(81, 'NAICS', 11241, 'Sheep Farming', 4, 79),\n" +
            "(83, 'NAICS', 11242, 'Goat Farming', 4, 79),\n" +
            "(80, 'NAICS', 112410, 'Sheep Farming', 5, 81),\n" +
            "(82, 'NAICS', 112420, 'Goat Farming', 5, 83),\n" +
            "(85, 'NAICS', 11251, 'Aquaculture', 4, 84),\n" +
            "(88, 'NAICS', 112519, 'Other Aquaculture', 5, 85),\n" +
            "(86, 'NAICS', 112511, 'Finfish Farming and Fish Hatcheries', 5, 85),\n" +
            "(87, 'NAICS', 112512, 'Shellfish Farming', 5, 85),\n" +
            "(95, 'NAICS', 11293, 'Fur-Bearing Animal and Rabbit Production', 4, 89),\n" +
            "(97, 'NAICS', 11299, 'All Other Animal Production', 4, 89),\n" +
            "(93, 'NAICS', 11292, 'Horses and Other Equine Production', 4, 89),\n" +
            "(91, 'NAICS', 11291, 'Apiculture', 4, 89),\n" +
            "(90, 'NAICS', 112910, 'Apiculture', 5, 91),\n" +
            "(92, 'NAICS', 112920, 'Horses and Other Equine Production', 5, 93),\n" +
            "(94, 'NAICS', 112930, 'Fur-Bearing Animal and Rabbit Production', 5, 95),\n" +
            "(96, 'NAICS', 112990, 'All Other Animal Production', 5, 97),\n" +
            "(102, 'NAICS', 1132, 'Forest Nurseries and Gathering of Forest Products', 3, 98),\n" +
            "(99, 'NAICS', 1131, 'Timber Tract Operations', 3, 98),\n" +
            "(101, 'NAICS', 11311, 'Timber Tract Operations', 4, 99),\n" +
            "(100, 'NAICS', 113110, 'Timber Tract Operations', 5, 101),\n" +
            "(104, 'NAICS', 11321, 'Forest Nurseries and Gathering of Forest Products', 4, 102),\n" +
            "(103, 'NAICS', 113210, 'Forest Nurseries and Gathering of Forest Products', 5, 104),\n" +
            "(106, 'NAICS', 113310, 'Logging', 5, 107),\n" +
            "(109, 'NAICS', 1141, 'Fishing', 3, 108),\n" +
            "(114, 'NAICS', 1142, 'Hunting and Trapping', 3, 108),\n" +
            "(110, 'NAICS', 11411, 'Fishing', 4, 109),\n" +
            "(113, 'NAICS', 114119, 'Other Marine Fishing', 5, 110),\n" +
            "(111, 'NAICS', 114111, 'Finfish Fishing', 5, 110),\n" +
            "(112, 'NAICS', 114112, 'Shellfish Fishing', 5, 110),\n" +
            "(116, 'NAICS', 11421, 'Hunting and Trapping', 4, 114),\n" +
            "(115, 'NAICS', 114210, 'Hunting and Trapping', 5, 116),\n" +
            "(129, 'NAICS', 1153, 'Support Activities for Forestry', 3, 117),\n" +
            "(126, 'NAICS', 1152, 'Support Activities for Animal Production', 3, 117);\n";
    static String industryCodeInsert4 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(118, 'NAICS', 1151, 'Support Activities for Crop Production', 3, 117),\n" +
            "(119, 'NAICS', 11511, 'Support Activities for Crop Production', 4, 118),\n" +
            "(120, 'NAICS', 115111, 'Cotton Ginning', 5, 119),\n" +
            "(125, 'NAICS', 115116, 'Farm Management Services', 5, 119),\n" +
            "(124, 'NAICS', 115115, 'Farm Labor Contractors and Crew Leaders', 5, 119),\n" +
            "(123, 'NAICS', 115114, 'Postharvest Crop Activities (except Cotton Ginning)', 5, 119),\n" +
            "(122, 'NAICS', 115113, 'Crop Harvesting, Primarily by Machine', 5, 119),\n" +
            "(121, 'NAICS', 115112, 'Soil Preparation, Planting, and Cultivating', 5, 119),\n" +
            "(128, 'NAICS', 11521, 'Support Activities for Animal Production', 4, 126),\n" +
            "(127, 'NAICS', 115210, 'Support Activities for Animal Production', 5, 128),\n" +
            "(131, 'NAICS', 11531, 'Support Activities for Forestry', 4, 129),\n" +
            "(130, 'NAICS', 115310, 'Support Activities for Forestry', 5, 131),\n" +
            "(172, 'NAICS', 213, 'Support Activities for Mining', 2, 132),\n" +
            "(133, 'NAICS', 211, 'Oil and Gas Extraction', 2, 132),\n" +
            "(138, 'NAICS', 212, 'Mining (except Oil and Gas)', 2, 132),\n" +
            "(134, 'NAICS', 2111, 'Oil and Gas Extraction', 3, 133),\n" +
            "(135, 'NAICS', 21111, 'Oil and Gas Extraction', 4, 134),\n" +
            "(137, 'NAICS', 211112, 'Natural Gas Liquid Extraction', 5, 135),\n" +
            "(136, 'NAICS', 211111, 'Crude Petroleum and Natural Gas Extraction', 5, 135),\n" +
            "(156, 'NAICS', 2123, 'Nonmetallic Mineral Mining and Quarrying', 3, 138),\n" +
            "(144, 'NAICS', 2122, 'Metal Ore Mining', 3, 138),\n" +
            "(139, 'NAICS', 2121, 'Coal Mining', 3, 138),\n" +
            "(140, 'NAICS', 21211, 'Coal Mining', 4, 139),\n" +
            "(143, 'NAICS', 212113, 'Anthracite Mining', 5, 140),\n" +
            "(142, 'NAICS', 212112, 'Bituminous Coal Underground Mining', 5, 140),\n" +
            "(141, 'NAICS', 212111, 'Bituminous Coal and Lignite Surface Mining', 5, 140),\n" +
            "(153, 'NAICS', 21229, 'Other Metal Ore Mining', 4, 144),\n" +
            "(150, 'NAICS', 21223, 'Copper, Nickel, Lead, and Zinc Mining', 4, 144),\n" +
            "(147, 'NAICS', 21222, 'Gold Ore and Silver Ore Mining', 4, 144),\n" +
            "(146, 'NAICS', 21221, 'Iron Ore Mining', 4, 144),\n" +
            "(145, 'NAICS', 212210, 'Iron Ore Mining', 5, 146),\n" +
            "(148, 'NAICS', 212221, 'Gold Ore Mining', 5, 147),\n" +
            "(149, 'NAICS', 212222, 'Silver Ore Mining', 5, 147),\n" +
            "(151, 'NAICS', 212231, 'Lead Ore and Zinc Ore Mining', 5, 150),\n" +
            "(152, 'NAICS', 212234, 'Copper Ore and Nickel Ore Mining', 5, 150),\n" +
            "(155, 'NAICS', 212299, 'All Other Metal Ore Mining', 5, 153),\n" +
            "(154, 'NAICS', 212291, 'Uranium-Radium-Vanadium Ore Mining', 5, 153),\n" +
            "(162, 'NAICS', 21232, 'Sand, Gravel, Clay, and Ceramic and Refractory Minerals Mining and Quarrying', 4, 156),\n" +
            "(167, 'NAICS', 21239, 'Other Nonmetallic Mineral Mining and Quarrying', 4, 156),\n" +
            "(157, 'NAICS', 21231, 'Stone Mining and Quarrying', 4, 156),\n" +
            "(159, 'NAICS', 212312, 'Crushed and Broken Limestone Mining and Quarrying', 5, 157),\n" +
            "(160, 'NAICS', 212313, 'Crushed and Broken Granite Mining and Quarrying', 5, 157),\n" +
            "(161, 'NAICS', 212319, 'Other Crushed and Broken Stone Mining and Quarrying', 5, 157),\n" +
            "(158, 'NAICS', 212311, 'Dimension Stone Mining and Quarrying', 5, 157),\n" +
            "(163, 'NAICS', 212321, 'Construction Sand and Gravel Mining', 5, 162),\n" +
            "(166, 'NAICS', 212325, 'Clay and Ceramic and Refractory Minerals Mining', 5, 162),\n" +
            "(165, 'NAICS', 212324, 'Kaolin and Ball Clay Mining', 5, 162),\n" +
            "(164, 'NAICS', 212322, 'Industrial Sand Mining', 5, 162),\n" +
            "(170, 'NAICS', 212393, 'Other Chemical and Fertilizer Mineral Mining', 5, 167),\n" +
            "(169, 'NAICS', 212392, 'Phosphate Rock Mining', 5, 167),\n" +
            "(171, 'NAICS', 212399, 'All Other Nonmetallic Mineral Mining', 5, 167),\n" +
            "(168, 'NAICS', 212391, 'Potash, Soda, and Borate Mineral Mining', 5, 167),\n" +
            "(173, 'NAICS', 2131, 'Support Activities for Mining', 3, 172),\n" +
            "(174, 'NAICS', 21311, 'Support Activities for Mining', 4, 173),\n" +
            "(176, 'NAICS', 213112, 'Support Activities for Oil and Gas Operations', 5, 174),\n" +
            "(178, 'NAICS', 213114, 'Support Activities for Metal Mining', 5, 174),\n" +
            "(179, 'NAICS', 213115, 'Support Activities for Nonmetallic Minerals (except Fuels) Mining', 5, 174),\n" +
            "(296, 'NAICS', 31131, 'Sugar Manufacturing', 4, 295),\n" +
            "(177, 'NAICS', 213113, 'Support Activities for Coal Mining', 5, 174),\n" +
            "(175, 'NAICS', 213111, 'Drilling Oil and Gas Wells', 5, 174),\n" +
            "(181, 'NAICS', 221, 'Utilities', 2, 180),\n" +
            "(182, 'NAICS', 2211, 'Electric Power Generation, Transmission and Distribution', 3, 181),\n" +
            "(195, 'NAICS', 2212, 'Natural Gas Distribution', 3, 181),\n" +
            "(198, 'NAICS', 2213, 'Water, Sewage and Other Systems', 3, 181),\n" +
            "(192, 'NAICS', 22112, 'Electric Power Transmission, Control, and Distribution', 4, 182),\n" +
            "(183, 'NAICS', 22111, 'Electric Power Generation', 4, 182),\n" +
            "(190, 'NAICS', 221117, 'Biomass Electric Power Generation', 5, 183),\n" +
            "(184, 'NAICS', 221111, 'Hydroelectric Power Generation', 5, 183),\n" +
            "(185, 'NAICS', 221112, 'Fossil Fuel Electric Power Generation', 5, 183),\n" +
            "(186, 'NAICS', 221113, 'Nuclear Electric Power Generation', 5, 183),\n" +
            "(187, 'NAICS', 221114, 'Solar Electric Power Generation', 5, 183),\n" +
            "(188, 'NAICS', 221115, 'Wind Electric Power Generation', 5, 183),\n" +
            "(189, 'NAICS', 221116, 'Geothermal Electric Power Generation', 5, 183),\n" +
            "(191, 'NAICS', 221118, 'Other Electric Power Generation', 5, 183),\n" +
            "(193, 'NAICS', 221121, 'Electric Bulk Power Transmission and Control', 5, 192),\n" +
            "(194, 'NAICS', 221122, 'Electric Power Distribution', 5, 192),\n" +
            "(197, 'NAICS', 22121, 'Natural Gas Distribution', 4, 195),\n" +
            "(196, 'NAICS', 221210, 'Natural Gas Distribution', 5, 197),\n" +
            "(204, 'NAICS', 22133, 'Steam and Air-Conditioning Supply', 4, 198),\n" +
            "(200, 'NAICS', 22131, 'Water Supply and Irrigation Systems', 4, 198),\n" +
            "(202, 'NAICS', 22132, 'Sewage Treatment Facilities', 4, 198),\n" +
            "(199, 'NAICS', 221310, 'Water Supply and Irrigation Systems', 5, 200),\n" +
            "(201, 'NAICS', 221320, 'Sewage Treatment Facilities', 5, 202),\n" +
            "(203, 'NAICS', 221330, 'Steam and Air-Conditioning Supply', 5, 204),\n" +
            "(206, 'NAICS', 236, 'Construction of Buildings', 2, 205),\n" +
            "(235, 'NAICS', 238, 'Specialty Trade Contractors', 2, 205),\n" +
            "(218, 'NAICS', 237, 'Heavy and Civil Engineering Construction', 2, 205),\n" +
            "(213, 'NAICS', 2362, 'Nonresidential Building Construction', 3, 206),\n" +
            "(207, 'NAICS', 2361, 'Residential Building Construction', 3, 206),\n" +
            "(208, 'NAICS', 23611, 'Residential Building Construction', 4, 207),\n" +
            "(209, 'NAICS', 236115, 'New Single-Family HoConstruction (except For-Sale Builders)', 5, 208),\n" +
            "(210, 'NAICS', 236116, 'New Multifamily HoConstruction (except For-Sale Builders)', 5, 208),\n" +
            "(211, 'NAICS', 236117, 'New HoFor-Sale Builders', 5, 208),\n" +
            "(212, 'NAICS', 236118, 'Residential Remodelers', 5, 208),\n" +
            "(217, 'NAICS', 23622, 'Commercial and Institutional Building Construction', 4, 213),\n" +
            "(215, 'NAICS', 23621, 'Industrial Building Construction', 4, 213),\n" +
            "(214, 'NAICS', 236210, 'Industrial Building Construction', 5, 215),\n" +
            "(216, 'NAICS', 236220, 'Commercial and Institutional Building Construction', 5, 217),\n" +
            "(229, 'NAICS', 2373, 'Highway, Street, and Bridge Construction', 3, 218),\n" +
            "(232, 'NAICS', 2379, 'Other Heavy and Civil Engineering Construction', 3, 218),\n" +
            "(219, 'NAICS', 2371, 'Utility System Construction', 3, 218),\n" +
            "(226, 'NAICS', 2372, 'Land Subdivision', 3, 218),\n" +
            "(225, 'NAICS', 23713, 'Power and Communication Line and Related Structures Construction', 4, 219),\n" +
            "(221, 'NAICS', 23711, 'Water and Sewer Line and Related Structures Construction', 4, 219),\n" +
            "(223, 'NAICS', 23712, 'Oil and Gas Pipeline and Related Structures Construction', 4, 219),\n" +
            "(220, 'NAICS', 237110, 'Water and Sewer Line and Related Structures Construction', 5, 221),\n" +
            "(222, 'NAICS', 237120, 'Oil and Gas Pipeline and Related Structures Construction', 5, 223),\n" +
            "(224, 'NAICS', 237130, 'Power and Communication Line and Related Structures Construction', 5, 225),\n" +
            "(228, 'NAICS', 23721, 'Land Subdivision', 4, 226),\n" +
            "(227, 'NAICS', 237210, 'Land Subdivision', 5, 228),\n" +
            "(231, 'NAICS', 23731, 'Highway, Street, and Bridge Construction', 4, 229),\n" +
            "(230, 'NAICS', 237310, 'Highway, Street, and Bridge Construction', 5, 231),\n" +
            "(234, 'NAICS', 23799, 'Other Heavy and Civil Engineering Construction', 4, 232),\n" +
            "(233, 'NAICS', 237990, 'Other Heavy and Civil Engineering Construction', 5, 234),\n" +
            "(253, 'NAICS', 2382, 'Building Equipment Contractors', 3, 235),\n" +
            "(273, 'NAICS', 2389, 'Other Specialty Trade Contractors', 3, 235),\n" +
            "(260, 'NAICS', 2383, 'Building Finishing Contractors', 3, 235),\n" +
            "(236, 'NAICS', 2381, 'Foundation, Structure, and Building Exterior Contractors', 3, 235),\n" +
            "(246, 'NAICS', 23815, 'Glass and Glazing Contractors', 4, 236),\n" +
            "(252, 'NAICS', 23819, 'Other Foundation, Structure, and Building Exterior Contractors', 4, 236),\n" +
            "(238, 'NAICS', 23811, 'Poured Concrete Foundation and Structure Contractors', 4, 236),\n" +
            "(250, 'NAICS', 23817, 'Siding Contractors', 4, 236),\n" +
            "(240, 'NAICS', 23812, 'Structural Steel and Precast Concrete Contractors', 4, 236),\n" +
            "(248, 'NAICS', 23816, 'Roofing Contractors', 4, 236),\n" +
            "(242, 'NAICS', 23813, 'Framing Contractors', 4, 236),\n" +
            "(244, 'NAICS', 23814, 'Masonry Contractors', 4, 236),\n" +
            "(237, 'NAICS', 238110, 'Poured Concrete Foundation and Structure Contractors', 5, 238),\n" +
            "(239, 'NAICS', 238120, 'Structural Steel and Precast Concrete Contractors', 5, 240),\n" +
            "(241, 'NAICS', 238130, 'Framing Contractors', 5, 242),\n" +
            "(243, 'NAICS', 238140, 'Masonry Contractors', 5, 244),\n" +
            "(245, 'NAICS', 238150, 'Glass and Glazing Contractors', 5, 246),\n" +
            "(247, 'NAICS', 238160, 'Roofing Contractors', 5, 248),\n" +
            "(249, 'NAICS', 238170, 'Siding Contractors', 5, 250),\n" +
            "(251, 'NAICS', 238190, 'Other Foundation, Structure, and Building Exterior Contractors', 5, 252),\n" +
            "(259, 'NAICS', 23829, 'Other Building Equipment Contractors', 4, 253),\n" +
            "(255, 'NAICS', 23821, 'Electrical Contractors and Other Wiring Installation Contractors', 4, 253),\n" +
            "(257, 'NAICS', 23822, 'Plumbing, Heating, and Air-Conditioning Contractors', 4, 253),\n" +
            "(254, 'NAICS', 238210, 'Electrical Contractors and Other Wiring Installation Contractors', 5, 255),\n" +
            "(256, 'NAICS', 238220, 'Plumbing, Heating, and Air-Conditioning Contractors', 5, 257),\n" +
            "(258, 'NAICS', 238290, 'Other Building Equipment Contractors', 5, 259),\n" +
            "(268, 'NAICS', 23834, 'Tile and Terrazzo Contractors', 4, 260),\n" +
            "(266, 'NAICS', 23833, 'Flooring Contractors', 4, 260),\n" +
            "(272, 'NAICS', 23839, 'Other Building Finishing Contractors', 4, 260),\n" +
            "(270, 'NAICS', 23835, 'Finish Carpentry Contractors', 4, 260),\n" +
            "(264, 'NAICS', 23832, 'Painting and Wall Covering Contractors', 4, 260),\n" +
            "(262, 'NAICS', 23831, 'Drywall and Insulation Contractors', 4, 260),\n" +
            "(261, 'NAICS', 238310, 'Drywall and Insulation Contractors', 5, 262),\n" +
            "(263, 'NAICS', 238320, 'Painting and Wall Covering Contractors', 5, 264),\n" +
            "(265, 'NAICS', 238330, 'Flooring Contractors', 5, 266),\n" +
            "(267, 'NAICS', 238340, 'Tile and Terrazzo Contractors', 5, 268),\n" +
            "(269, 'NAICS', 238350, 'Finish Carpentry Contractors', 5, 270),\n" +
            "(271, 'NAICS', 238390, 'Other Building Finishing Contractors', 5, 272),\n" +
            "(275, 'NAICS', 23891, 'Site Preparation Contractors', 4, 273),\n" +
            "(277, 'NAICS', 23899, 'All Other Specialty Trade Contractors', 4, 273),\n" +
            "(274, 'NAICS', 238910, 'Site Preparation Contractors', 5, 275),\n" +
            "(276, 'NAICS', 238990, 'All Other Specialty Trade Contractors', 5, 277),\n" +
            "(353, 'NAICS', 312, 'Beverage and Tobacco Product Manufacturing', 2, 278),\n" +
            "(904, 'NAICS', 339, 'Miscellaneous Manufacturing', 2, 278),\n" +
            "(883, 'NAICS', 337, 'Furniture and Related Product Manufacturing', 2, 278),\n" +
            "(833, 'NAICS', 336, 'Transportation Equipment Manufacturing', 2, 278),\n" +
            "(798, 'NAICS', 335, 'Electrical Equipment, Appliance, and Component Manufacturing', 2, 278),\n" +
            "(279, 'NAICS', 311, 'Food Manufacturing', 2, 278),\n" +
            "(759, 'NAICS', 334, 'Computer and Electronic Product Manufacturing', 2, 278),\n" +
            "(386, 'NAICS', 314, 'TEXTile Product Mills', 2, 278),\n" +
            "(398, 'NAICS', 315, 'Apparel Manufacturing', 2, 278),\n" +
            "(416, 'NAICS', 316, 'Leather and Allied Product Manufacturing', 2, 278),\n" +
            "(427, 'NAICS', 321, 'Wood Product Manufacturing', 2, 278),\n" +
            "(640, 'NAICS', 332, 'Fabricated Metal Product Manufacturing', 2, 278),\n" +
            "(450, 'NAICS', 322, 'Paper Manufacturing', 2, 278),\n" +
            "(471, 'NAICS', 323, 'Printing and Related Support Activities', 2, 278),\n" +
            "(479, 'NAICS', 324, 'Petroleum and Coal Products Manufacturing', 2, 278),\n" +
            "(607, 'NAICS', 331, 'Primary Metal Manufacturing', 2, 278),\n" +
            "(489, 'NAICS', 325, 'Chemical Manufacturing', 2, 278),\n" +
            "(543, 'NAICS', 326, 'Plastics and Rubber Products Manufacturing', 2, 278),\n" +
            "(329, 'NAICS', 3118, 'Bakeries and Tortilla Manufacturing', 3, 279),\n" +
            "(326, 'NAICS', 3117, 'Seafood Product Preparation and Packaging', 3, 279),\n" +
            "(320, 'NAICS', 3116, 'Animal Slaughtering and Processing', 3, 279),\n" +
            "(295, 'NAICS', 3113, 'Sugar and Confectionery Product Manufacturing', 3, 279),\n" +
            "(280, 'NAICS', 3111, 'Animal Food Manufacturing', 3, 279),\n" +
            "(284, 'NAICS', 3112, 'Grain and Oilseed Milling', 3, 279),\n" +
            "(304, 'NAICS', 3114, 'Fruit and Vegetable Preserving and Specialty Food Manufacturing', 3, 279),\n" +
            "(312, 'NAICS', 3115, 'Dairy Product Manufacturing', 3, 279),\n" +
            "(339, 'NAICS', 3119, 'Other Food Manufacturing', 3, 279),\n" +
            "(281, 'NAICS', 31111, 'Animal Food Manufacturing', 4, 280),\n" +
            "(283, 'NAICS', 311119, 'Other Animal Food Manufacturing', 5, 281),\n" +
            "(282, 'NAICS', 311111, 'Dog and Cat Food Manufacturing', 5, 281),\n" +
            "(289, 'NAICS', 31122, 'Starch and Vegetable Fats and Oils Manufacturing', 4, 284),\n" +
            "(285, 'NAICS', 31121, 'Flour Milling and Malt Manufacturing', 4, 284),\n" +
            "(294, 'NAICS', 31123, 'Breakfast Cereal Manufacturing', 4, 284),\n" +
            "(287, 'NAICS', 311212, 'Rice Milling', 5, 285),\n" +
            "(288, 'NAICS', 311213, 'Malt Manufacturing', 5, 285),\n" +
            "(286, 'NAICS', 311211, 'Flour Milling', 5, 285),\n" +
            "(290, 'NAICS', 311221, 'Wet Corn Milling', 5, 289),\n" +
            "(292, 'NAICS', 311225, 'Fats and Oils Refining and Blending', 5, 289),\n" +
            "(291, 'NAICS', 311224, 'Soybean and Other Oilseed Processing', 5, 289),\n" +
            "(293, 'NAICS', 311230, 'Breakfast Cereal Manufacturing', 5, 294),\n" +
            "(300, 'NAICS', 31134, 'Nonchocolate Confectionery Manufacturing', 4, 295),\n" +
            "(301, 'NAICS', 31135, 'Chocolate and Confectionery Manufacturing', 4, 295),\n" +
            "(298, 'NAICS', 311314, 'Cane Sugar Manufacturing', 5, 296),\n" +
            "(297, 'NAICS', 311313, 'Beet Sugar Manufacturing', 5, 296),\n" +
            "(299, 'NAICS', 311340, 'Nonchocolate Confectionery Manufacturing', 5, 300),\n" +
            "(303, 'NAICS', 311352, 'Confectionery Manufacturing from Purchased Chocolate', 5, 301),\n" +
            "(302, 'NAICS', 311351, 'Chocolate and Confectionery Manufacturing from Cacao Beans', 5, 301),\n" +
            "(305, 'NAICS', 31141, 'Frozen Food Manufacturing', 4, 304),\n" +
            "(308, 'NAICS', 31142, 'Fruit and Vegetable Canning, Pickling, and Drying', 4, 304),\n" +
            "(306, 'NAICS', 311411, 'Frozen Fruit, Juice, and Vegetable Manufacturing', 5, 305),\n" +
            "(307, 'NAICS', 311412, 'Frozen Specialty Food Manufacturing', 5, 305),\n" +
            "(311, 'NAICS', 311423, 'Dried and Dehydrated Food Manufacturing', 5, 308),\n" +
            "(309, 'NAICS', 311421, 'Fruit and Vegetable Canning', 5, 308),\n" +
            "(310, 'NAICS', 311422, 'Specialty Canning', 5, 308),\n" +
            "(319, 'NAICS', 31152, 'Ice Cream and Frozen Dessert Manufacturing', 4, 312),\n" +
            "(313, 'NAICS', 31151, 'Dairy Product (except Frozen) Manufacturing', 4, 312),\n" +
            "(317, 'NAICS', 311514, 'Dry, Condensed, and Evaporated Dairy Product Manufacturing', 5, 313),\n" +
            "(316, 'NAICS', 311513, 'Cheese Manufacturing', 5, 313),\n" +
            "(315, 'NAICS', 311512, 'Creamery Butter Manufacturing', 5, 313),\n" +
            "(314, 'NAICS', 311511, 'Fluid Milk Manufacturing', 5, 313),\n" +
            "(318, 'NAICS', 311520, 'Ice Cream and Frozen Dessert Manufacturing', 5, 319),\n" +
            "(321, 'NAICS', 31161, 'Animal Slaughtering and Processing', 4, 320),\n" +
            "(323, 'NAICS', 311612, 'Meat Processed from Carcasses', 5, 321),\n" +
            "(322, 'NAICS', 311611, 'Animal (except Poultry) Slaughtering', 5, 321),\n" +
            "(324, 'NAICS', 311613, 'Rendering and Meat Byproduct Processing', 5, 321),\n" +
            "(325, 'NAICS', 311615, 'Poultry Processing', 5, 321),\n" +
            "(328, 'NAICS', 31171, 'Seafood Product Preparation and Packaging', 4, 326),\n" +
            "(327, 'NAICS', 311710, 'Seafood Product Preparation and Packaging', 5, 328),\n" +
            "(338, 'NAICS', 31183, 'Tortilla Manufacturing', 4, 329),\n" +
            "(330, 'NAICS', 31181, 'Bread and Bakery Product Manufacturing', 4, 329),\n" +
            "(334, 'NAICS', 31182, 'Cookie, Cracker, and Pasta Manufacturing', 4, 329),\n" +
            "(331, 'NAICS', 311811, 'Retail Bakeries', 5, 330),\n" +
            "(332, 'NAICS', 311812, 'Commercial Bakeries', 5, 330),\n" +
            "(333, 'NAICS', 311813, 'Frozen Cakes, Pies, and Other Pastries Manufacturing', 5, 330),\n" +
            "(335, 'NAICS', 311821, 'Cookie and Cracker Manufacturing', 5, 334),\n" +
            "(336, 'NAICS', 311824, 'Dry Pasta, Dough, and Flour Mixes Manufacturing from Purchased Flour', 5, 334),\n" +
            "(337, 'NAICS', 311830, 'Tortilla Manufacturing', 5, 338),\n" +
            "(347, 'NAICS', 31194, 'Seasoning and Dressing Manufacturing', 4, 339),\n" +
            "(340, 'NAICS', 31191, 'Snack Food Manufacturing', 4, 339),\n" +
            "(344, 'NAICS', 31192, 'Coffee and Tea Manufacturing', 4, 339),\n" +
            "(346, 'NAICS', 31193, 'Flavoring Syrup and Concentrate Manufacturing', 4, 339),\n" +
            "(350, 'NAICS', 31199, 'All Other Food Manufacturing', 4, 339),\n" +
            "(341, 'NAICS', 311911, 'Roasted Nuts and Peanut Butter Manufacturing', 5, 340),\n" +
            "(342, 'NAICS', 311919, 'Other Snack Food Manufacturing', 5, 340),\n" +
            "(343, 'NAICS', 311920, 'Coffee and Tea Manufacturing', 5, 344),\n" +
            "(345, 'NAICS', 311930, 'Flavoring Syrup and Concentrate Manufacturing', 5, 346),\n" +
            "(349, 'NAICS', 311942, 'Spice and Extract Manufacturing', 5, 347),\n" +
            "(348, 'NAICS', 311941, 'Mayonnaise, Dressing, and Other Prepared Sauce Manufacturing', 5, 347),\n" +
            "(351, 'NAICS', 311991, 'Perishable Prepared Food Manufacturing', 5, 350),\n" +
            "(352, 'NAICS', 311999, 'All Other Miscellaneous Food Manufacturing', 5, 350),\n" +
            "(354, 'NAICS', 3121, 'Beverage Manufacturing', 3, 353),\n" +
            "(365, 'NAICS', 3122, 'Tobacco Manufacturing', 3, 353),\n" +
            "(364, 'NAICS', 31214, 'Distilleries', 4, 354),\n" +
            "(360, 'NAICS', 31212, 'Breweries', 4, 354),\n" +
            "(355, 'NAICS', 31211, 'Soft Drink and Ice Manufacturing', 4, 354),\n" +
            "(362, 'NAICS', 31213, 'Wineries', 4, 354),\n" +
            "(356, 'NAICS', 312111, 'Soft Drink Manufacturing', 5, 355),\n" +
            "(357, 'NAICS', 312112, 'Bottled Water Manufacturing', 5, 355),\n" +
            "(358, 'NAICS', 312113, 'Ice Manufacturing', 5, 355),\n" +
            "(359, 'NAICS', 312120, 'Breweries', 5, 360),\n" +
            "(361, 'NAICS', 312130, 'Wineries', 5, 362),\n" +
            "(363, 'NAICS', 312140, 'Distilleries', 5, 364),\n" +
            "(367, 'NAICS', 31223, 'Tobacco Manufacturing', 4, 365),\n" +
            "(366, 'NAICS', 312230, 'Tobacco Manufacturing', 5, 367),\n" +
            "(381, 'NAICS', 3133, 'TEXTile and Fabric Finishing and Fabric Coating Mills', 3, 368),\n" +
            "(369, 'NAICS', 3131, 'Fiber, Yarn, and Thread Mills', 3, 368),\n" +
            "(372, 'NAICS', 3132, 'Fabric Mills', 3, 368),\n" +
            "(371, 'NAICS', 31311, 'Fiber, Yarn, and Thread Mills', 4, 369),\n" +
            "(370, 'NAICS', 313110, 'Fiber, Yarn, and Thread Mills', 5, 371),\n" +
            "(376, 'NAICS', 31322, 'Narrow Fabric Mills and Schiffli Machine Embroidery', 4, 372),\n" +
            "(378, 'NAICS', 31323, 'Nonwoven Fabric Mills', 4, 372),\n" +
            "(374, 'NAICS', 31321, 'Broadwoven Fabric Mills', 4, 372),\n" +
            "(380, 'NAICS', 31324, 'Knit Fabric Mills', 4, 372),\n" +
            "(373, 'NAICS', 313210, 'Broadwoven Fabric Mills', 5, 374),\n" +
            "(375, 'NAICS', 313220, 'Narrow Fabric Mills and Schiffli Machine Embroidery', 5, 376),\n" +
            "(377, 'NAICS', 313230, 'Nonwoven Fabric Mills', 5, 378),\n" +
            "(379, 'NAICS', 313240, 'Knit Fabric Mills', 5, 380),\n" +
            "(385, 'NAICS', 31332, 'Fabric Coating Mills', 4, 381),\n" +
            "(383, 'NAICS', 31331, 'TEXTile and Fabric Finishing Mills', 4, 381),\n" +
            "(382, 'NAICS', 313310, 'TEXTile and Fabric Finishing Mills', 5, 383),\n" +
            "(384, 'NAICS', 313320, 'Fabric Coating Mills', 5, 385),\n" +
            "(387, 'NAICS', 3141, 'TEXTile Furnishings Mills', 3, 386),\n" +
            "(392, 'NAICS', 3149, 'Other TEXTile Product Mills', 3, 386),\n" +
            "(391, 'NAICS', 31412, 'Curtain and Linen Mills', 4, 387),\n" +
            "(389, 'NAICS', 31411, 'Carpet and Rug Mills', 4, 387),\n" +
            "(388, 'NAICS', 314110, 'Carpet and Rug Mills', 5, 389),\n" +
            "(390, 'NAICS', 314120, 'Curtain and Linen Mills', 5, 391),\n" +
            "(394, 'NAICS', 31491, 'TEXTile Bag and Canvas Mills', 4, 392),\n" +
            "(395, 'NAICS', 31499, 'All Other TEXTile Product Mills', 4, 392),\n" +
            "(393, 'NAICS', 314910, 'TEXTile Bag and Canvas Mills', 5, 394),\n" +
            "(396, 'NAICS', 314994, 'Rope, Cordage, Twine, Tire Cord, and Tire Fabric Mills', 5, 395),\n" +
            "(397, 'NAICS', 314999, 'All Other Miscellaneous TEXTile Product Mills', 5, 395),\n" +
            "(399, 'NAICS', 3151, 'Apparel Knitting Mills', 3, 398),\n" +
            "(404, 'NAICS', 3152, 'Cut and Sew Apparel Manufacturing', 3, 398),\n" +
            "(413, 'NAICS', 3159, 'Apparel Accessories and Other Apparel Manufacturing', 3, 398),\n" +
            "(403, 'NAICS', 31519, 'Other Apparel Knitting Mills', 4, 399),\n" +
            "(401, 'NAICS', 31511, 'Hosiery and Sock Mills', 4, 399),\n" +
            "(400, 'NAICS', 315110, 'Hosiery and Sock Mills', 5, 401),\n" +
            "(402, 'NAICS', 315190, 'Other Apparel Knitting Mills', 5, 403),\n" +
            "(412, 'NAICS', 31528, 'Other Cut and Sew Apparel Manufacturing', 4, 404),\n" +
            "(406, 'NAICS', 31521, 'Cut and Sew Apparel Contractors', 4, 404),\n" +
            "(408, 'NAICS', 31522, 'Men.s and Boys. Cut and Sew Apparel Manufacturing', 4, 404),\n" +
            "(410, 'NAICS', 31524, 'Women.s, Girls., and Infants. Cut and Sew Apparel Manufacturing', 4, 404),\n" +
            "(405, 'NAICS', 315210, 'Cut and Sew Apparel Contractors', 5, 406),\n" +
            "(407, 'NAICS', 315220, 'Men.s and Boys. Cut and Sew Apparel Manufacturing', 5, 408),\n" +
            "(409, 'NAICS', 315240, 'Women.s, Girls., and Infants. Cut and Sew Apparel Manufacturing', 5, 410),\n" +
            "(411, 'NAICS', 315280, 'Other Cut and Sew Apparel Manufacturing', 5, 412),\n" +
            "(415, 'NAICS', 31599, 'Apparel Accessories and Other Apparel Manufacturing', 4, 413),\n" +
            "(414, 'NAICS', 315990, 'Apparel Accessories and Other Apparel Manufacturing', 5, 415),\n" +
            "(420, 'NAICS', 3162, 'Footwear Manufacturing', 3, 416),\n" +
            "(423, 'NAICS', 3169, 'Other Leather and Allied Product Manufacturing', 3, 416),\n" +
            "(417, 'NAICS', 3161, 'Leather and Hide Tanning and Finishing', 3, 416),\n" +
            "(419, 'NAICS', 31611, 'Leather and Hide Tanning and Finishing', 4, 417),\n" +
            "(418, 'NAICS', 316110, 'Leather and Hide Tanning and Finishing', 5, 419),\n" +
            "(422, 'NAICS', 31621, 'Footwear Manufacturing', 4, 420),\n" +
            "(421, 'NAICS', 316210, 'Footwear Manufacturing', 5, 422),\n" +
            "(424, 'NAICS', 31699, 'Other Leather and Allied Product Manufacturing', 4, 423),\n" +
            "(426, 'NAICS', 316998, 'All Other Leather Good and Allied Product Manufacturing', 5, 424),\n" +
            "(425, 'NAICS', 316992, 'Women''s Handbag and Purse Manufacturing', 5, 424),\n" +
            "(439, 'NAICS', 3219, 'Other Wood Product Manufacturing', 3, 427),\n" +
            "(428, 'NAICS', 3211, 'Sawmills and Wood Preservation', 3, 427),\n" +
            "(432, 'NAICS', 3212, 'Veneer, Plywood, and Engineered Wood Product Manufacturing', 3, 427),\n" +
            "(429, 'NAICS', 32111, 'Sawmills and Wood Preservation', 4, 428),\n" +
            "(430, 'NAICS', 321113, 'Sawmills', 5, 429),\n" +
            "(431, 'NAICS', 321114, 'Wood Preservation', 5, 429),\n" +
            "(433, 'NAICS', 32121, 'Veneer, Plywood, and Engineered Wood Product Manufacturing', 4, 432),\n" +
            "(435, 'NAICS', 321212, 'Softwood Veneer and Plywood Manufacturing', 5, 433),\n" +
            "(434, 'NAICS', 321211, 'Hardwood Veneer and Plywood Manufacturing', 5, 433),\n" +
            "(436, 'NAICS', 321213, 'Engineered Wood Member (except Truss) Manufacturing', 5, 433),\n" +
            "(437, 'NAICS', 321214, 'Truss Manufacturing', 5, 433),\n" +
            "(438, 'NAICS', 321219, 'Reconstituted Wood Product Manufacturing', 5, 433),\n" +
            "(445, 'NAICS', 32192, 'Wood Container and Pallet Manufacturing', 4, 439),\n" +
            "(440, 'NAICS', 32191, 'Millwork', 4, 439),\n" +
            "(446, 'NAICS', 32199, 'All Other Wood Product Manufacturing', 4, 439),\n" +
            "(442, 'NAICS', 321912, 'Cut Stock, Resawing Lumber, and Planing', 5, 440),\n" +
            "(443, 'NAICS', 321918, 'Other Millwork (including Flooring)', 5, 440),\n" +
            "(441, 'NAICS', 321911, 'Wood Window and Door Manufacturing', 5, 440),\n" +
            "(444, 'NAICS', 321920, 'Wood Container and Pallet Manufacturing', 5, 445),\n" +
            "(447, 'NAICS', 321991, 'Manufactured Home (Mobile Home) Manufacturing', 5, 446),\n" +
            "(448, 'NAICS', 321992, 'Prefabricated Wood Building Manufacturing', 5, 446),\n" +
            "(449, 'NAICS', 321999, 'All Other Miscellaneous Wood Product Manufacturing', 5, 446),\n" +
            "(459, 'NAICS', 3222, 'Converted Paper Product Manufacturing', 3, 450),\n" +
            "(451, 'NAICS', 3221, 'Pulp, Paper, and Paperboard Mills', 3, 450),\n" +
            "(454, 'NAICS', 32212, 'Paper Mills', 4, 451),\n" +
            "(453, 'NAICS', 32211, 'Pulp Mills', 4, 451),\n" +
            "(458, 'NAICS', 32213, 'Paperboard Mills', 4, 451),\n" +
            "(452, 'NAICS', 322110, 'Pulp Mills', 5, 453),\n" +
            "(456, 'NAICS', 322122, 'Newsprint Mills', 5, 454),\n" +
            "(455, 'NAICS', 322121, 'Paper (except Newsprint) Mills', 5, 454),\n" +
            "(457, 'NAICS', 322130, 'Paperboard Mills', 5, 458),\n" +
            "(460, 'NAICS', 32221, 'Paperboard Container Manufacturing', 4, 459),\n" +
            "(467, 'NAICS', 32223, 'Stationery Product Manufacturing', 4, 459),\n" +
            "(468, 'NAICS', 32229, 'Other Converted Paper Product Manufacturing', 4, 459),\n" +
            "(465, 'NAICS', 32222, 'Paper Bag and Coated and Treated Paper Manufacturing', 4, 459),\n" +
            "(463, 'NAICS', 322219, 'Other Paperboard Container Manufacturing', 5, 460),\n" +
            "(462, 'NAICS', 322212, 'Folding Paperboard Box Manufacturing', 5, 460),\n" +
            "(461, 'NAICS', 322211, 'Corrugated and Solid Fiber Box Manufacturing', 5, 460),\n" +
            "(464, 'NAICS', 322220, 'Paper Bag and Coated and Treated Paper Manufacturing', 5, 465),\n" +
            "(466, 'NAICS', 322230, 'Stationery Product Manufacturing', 5, 467),\n" +
            "(469, 'NAICS', 322291, 'Sanitary Paper Product Manufacturing', 5, 468),\n" +
            "(470, 'NAICS', 322299, 'All Other Converted Paper Product Manufacturing', 5, 468),\n" +
            "(472, 'NAICS', 3231, 'Printing and Related Support Activities', 3, 471),\n" +
            "(478, 'NAICS', 32312, 'Support Activities for Printing', 4, 472),\n" +
            "(473, 'NAICS', 32311, 'Printing', 4, 472),\n" +
            "(827, 'NAICS', 33593, 'Wiring Device Manufacturing', 4, 820),\n" +
            "(474, 'NAICS', 323111, 'Commercial Printing (except Screen and Books)', 5, 473),\n" +
            "(475, 'NAICS', 323113, 'Commercial Screen Printing', 5, 473),\n" +
            "(476, 'NAICS', 323117, 'Books Printing', 5, 473),\n" +
            "(477, 'NAICS', 323120, 'Support Activities for Printing', 5, 478),\n" +
            "(480, 'NAICS', 3241, 'Petroleum and Coal Products Manufacturing', 3, 479),\n" +
            "(482, 'NAICS', 32411, 'Petroleum Refineries', 4, 480),\n" +
            "(486, 'NAICS', 32419, 'Other Petroleum and Coal Products Manufacturing', 4, 480),\n" +
            "(483, 'NAICS', 32412, 'Asphalt Paving, Roofing, and Saturated Materials Manufacturing', 4, 480),\n" +
            "(481, 'NAICS', 324110, 'Petroleum Refineries', 5, 482),\n" +
            "(485, 'NAICS', 324122, 'Asphalt Shingle and Coating Materials Manufacturing', 5, 483),\n" +
            "(484, 'NAICS', 324121, 'Asphalt Paving Mixture and Block Manufacturing', 5, 483),\n" +
            "(488, 'NAICS', 324199, 'All Other Petroleum and Coal Products Manufacturing', 5, 486),\n" +
            "(487, 'NAICS', 324191, 'Petroleum Lubricating Oil and Grease Manufacturing', 5, 486),\n" +
            "(534, 'NAICS', 3259, 'Other Chemical Product and Preparation Manufacturing', 3, 489),\n" +
            "(522, 'NAICS', 3255, 'Paint, Coating, and Adhesive Manufacturing', 3, 489),\n" +
            "(509, 'NAICS', 3253, 'Pesticide, Fertilizer, and Other Agricultural Chemical Manufacturing', 3, 489),\n" +
            "(516, 'NAICS', 3254, 'Pharmaceutical and Medicine Manufacturing', 3, 489),\n" +
            "(503, 'NAICS', 3252, 'Resin, Synthetic Rubber, and Artificial Synthetic Fibers and Filaments Manufacturing', 3, 489),\n" +
            "(490, 'NAICS', 3251, 'Basic Chemical Manufacturing', 3, 489),\n" +
            "(527, 'NAICS', 3256, 'Soap, Cleaning Compound, and Toilet Preparation Manufacturing', 3, 489),\n" +
            "(492, 'NAICS', 32511, 'Petrochemical Manufacturing', 4, 490),\n" +
            "(494, 'NAICS', 32512, 'Industrial Gas Manufacturing', 4, 490),\n" +
            "(496, 'NAICS', 32513, 'Synthetic Dye and Pigment Manufacturing', 4, 490),\n" +
            "(498, 'NAICS', 32518, 'Other Basic Inorganic Chemical Manufacturing', 4, 490),\n" +
            "(499, 'NAICS', 32519, 'Other Basic Organic Chemical Manufacturing', 4, 490),\n" +
            "(491, 'NAICS', 325110, 'Petrochemical Manufacturing', 5, 492),\n" +
            "(493, 'NAICS', 325120, 'Industrial Gas Manufacturing', 5, 494),\n" +
            "(495, 'NAICS', 325130, 'Synthetic Dye and Pigment Manufacturing', 5, 496),\n" +
            "(497, 'NAICS', 325180, 'Other Basic Inorganic Chemical Manufacturing', 5, 498),\n" +
            "(501, 'NAICS', 325194, 'Cyclic Crude, Intermediate, and Gum and Wood Chemical Manufacturing', 5, 499),\n" +
            "(500, 'NAICS', 325193, 'Ethyl Alcohol Manufacturing', 5, 499),\n" +
            "(502, 'NAICS', 325199, 'All Other Basic Organic Chemical Manufacturing', 5, 499),\n" +
            "(508, 'NAICS', 32522, 'Artificial and Synthetic Fibers and Filaments Manufacturing', 4, 503),\n" +
            "(504, 'NAICS', 32521, 'Resin and Synthetic Rubber Manufacturing', 4, 503),\n" +
            "(506, 'NAICS', 325212, 'Synthetic Rubber Manufacturing', 5, 504),\n" +
            "(505, 'NAICS', 325211, 'Plastics Material and Resin Manufacturing', 5, 504),\n" +
            "(507, 'NAICS', 325220, 'Artificial and Synthetic Fibers and Filaments Manufacturing', 5, 508),\n" +
            "(515, 'NAICS', 32532, 'Pesticide and Other Agricultural Chemical Manufacturing', 4, 509),\n" +
            "(510, 'NAICS', 32531, 'Fertilizer Manufacturing', 4, 509),\n" +
            "(512, 'NAICS', 325312, 'Phosphatic Fertilizer Manufacturing', 5, 510),\n" +
            "(513, 'NAICS', 325314, 'Fertilizer (Mixing Only) Manufacturing', 5, 510),\n" +
            "(511, 'NAICS', 325311, 'Nitrogenous Fertilizer Manufacturing', 5, 510),\n" +
            "(514, 'NAICS', 325320, 'Pesticide and Other Agricultural Chemical Manufacturing', 5, 515),\n" +
            "(517, 'NAICS', 32541, 'Pharmaceutical and Medicine Manufacturing', 4, 516),\n" +
            "(519, 'NAICS', 325412, 'Pharmaceutical Preparation Manufacturing', 5, 517),\n" +
            "(520, 'NAICS', 325413, 'In-Vitro Diagnostic Substance Manufacturing', 5, 517),\n" +
            "(521, 'NAICS', 325414, 'Biological Product (except Diagnostic) Manufacturing', 5, 517),\n" +
            "(518, 'NAICS', 325411, 'Medicinal and Botanical Manufacturing', 5, 517),\n" +
            "(524, 'NAICS', 32551, 'Paint and Coating Manufacturing', 4, 522),\n" +
            "(526, 'NAICS', 32552, 'Adhesive Manufacturing', 4, 522),\n" +
            "(523, 'NAICS', 325510, 'Paint and Coating Manufacturing', 5, 524),\n" +
            "(525, 'NAICS', 325520, 'Adhesive Manufacturing', 5, 526),\n" +
            "(533, 'NAICS', 32562, 'Toilet Preparation Manufacturing', 4, 527),\n" +
            "(528, 'NAICS', 32561, 'Soap and Cleaning Compound Manufacturing', 4, 527),\n" +
            "(530, 'NAICS', 325612, 'Polish and Other Sanitation Good Manufacturing', 5, 528),\n" +
            "(531, 'NAICS', 325613, 'Surface Active Agent Manufacturing', 5, 528),\n" +
            "(529, 'NAICS', 325611, 'Soap and Other Detergent Manufacturing', 5, 528),\n" +
            "(532, 'NAICS', 325620, 'Toilet Preparation Manufacturing', 5, 533),\n" +
            "(539, 'NAICS', 32599, 'All Other Chemical Product and Preparation Manufacturing', 4, 534),\n" +
            "(538, 'NAICS', 32592, 'Explosives Manufacturing', 4, 534),\n" +
            "(536, 'NAICS', 32591, 'Printing Ink Manufacturing', 4, 534),\n" +
            "(535, 'NAICS', 325910, 'Printing Ink Manufacturing', 5, 536),\n" +
            "(537, 'NAICS', 325920, 'Explosives Manufacturing', 5, 538),\n" +
            "(540, 'NAICS', 325991, 'Custom Compounding of Purchased Resins', 5, 539),\n" +
            "(541, 'NAICS', 325992, 'Photographic Film, Paper, Plate, and Chemical Manufacturing', 5, 539),\n" +
            "(542, 'NAICS', 325998, 'All Other Miscellaneous Chemical Product and Preparation Manufacturing', 5, 539),\n" +
            "(563, 'NAICS', 3262, 'Rubber Product Manufacturing', 3, 543),\n" +
            "(544, 'NAICS', 3261, 'Plastics Product Manufacturing', 3, 543),\n" +
            "(549, 'NAICS', 32612, 'Plastics Pipe, Pipe Fitting, and Unlaminated Profile Shape Manufacturing', 4, 544),\n" +
            "(545, 'NAICS', 32611, 'Plastics Packaging Materials and Unlaminated Film and Sheet Manufacturing', 4, 544),\n" +
            "(553, 'NAICS', 32613, 'Laminated Plastics Plate, Sheet (except Packaging), and Shape Manufacturing', 4, 544),\n" +
            "(555, 'NAICS', 32614, 'Polystyrene Foam Product Manufacturing', 4, 544),\n" +
            "(557, 'NAICS', 32615, 'Urethane and Other Foam Product (except Polystyrene) Manufacturing', 4, 544),\n" +
            "(559, 'NAICS', 32616, 'Plastics Bottle Manufacturing', 4, 544),\n" +
            "(560, 'NAICS', 32619, 'Other Plastics Product Manufacturing', 4, 544),\n" +
            "(546, 'NAICS', 326111, 'Plastics Bag and Pouch Manufacturing', 5, 545),\n" +
            "(548, 'NAICS', 326113, 'Unlaminated Plastics Film and Sheet (except Packaging) Manufacturing', 5, 545),\n" +
            "(547, 'NAICS', 326112, 'Plastics Packaging Film and Sheet (including Laminated) Manufacturing', 5, 545),\n" +
            "(551, 'NAICS', 326122, 'Plastics Pipe and Pipe Fitting Manufacturing', 5, 549),\n" +
            "(550, 'NAICS', 326121, 'Unlaminated Plastics Profile Shape Manufacturing', 5, 549),\n" +
            "(552, 'NAICS', 326130, 'Laminated Plastics Plate, Sheet (except Packaging), and Shape Manufacturing', 5, 553),\n" +
            "(554, 'NAICS', 326140, 'Polystyrene Foam Product Manufacturing', 5, 555),\n" +
            "(556, 'NAICS', 326150, 'Urethane and Other Foam Product (except Polystyrene) Manufacturing', 5, 557),\n" +
            "(558, 'NAICS', 326160, 'Plastics Bottle Manufacturing', 5, 559),\n" +
            "(562, 'NAICS', 326199, 'All Other Plastics Product Manufacturing', 5, 560),\n" +
            "(561, 'NAICS', 326191, 'Plastics Plumbing Fixture Manufacturing', 5, 560),\n" +
            "(568, 'NAICS', 32622, 'Rubber and Plastics Hoses and Belting Manufacturing', 4, 563),\n" +
            "(569, 'NAICS', 32629, 'Other Rubber Product Manufacturing', 4, 563),\n" +
            "(564, 'NAICS', 32621, 'Tire Manufacturing', 4, 563),\n" +
            "(565, 'NAICS', 326211, 'Tire Manufacturing (except Retreading)', 5, 564),\n" +
            "(566, 'NAICS', 326212, 'Tire Retreading', 5, 564),\n" +
            "(567, 'NAICS', 326220, 'Rubber and Plastics Hoses and Belting Manufacturing', 5, 568),\n" +
            "(571, 'NAICS', 326299, 'All Other Rubber Product Manufacturing', 5, 569),\n" +
            "(570, 'NAICS', 326291, 'Rubber Product Manufacturing for Mechanical Use', 5, 569),\n" +
            "(578, 'NAICS', 3272, 'Glass and Glass Product Manufacturing', 3, 572),\n" +
            "(594, 'NAICS', 3274, 'Lime and Gypsum Product Manufacturing', 3, 572),\n" +
            "(584, 'NAICS', 3273, 'Cement and Concrete Product Manufacturing', 3, 572),\n" +
            "(599, 'NAICS', 3279, 'Other Nonmetallic Mineral Product Manufacturing', 3, 572),\n" +
            "(573, 'NAICS', 3271, 'Clay Product and Refractory Manufacturing', 3, 572),\n" +
            "(577, 'NAICS', 32712, 'Clay Building Material and Refractories Manufacturing', 4, 573),\n" +
            "(575, 'NAICS', 32711, 'Pottery, Ceramics, and Plumbing Fixture Manufacturing', 4, 573),\n" +
            "(574, 'NAICS', 327110, 'Pottery, Ceramics, and Plumbing Fixture Manufacturing', 5, 575),\n" +
            "(576, 'NAICS', 327120, 'Clay Building Material and Refractories Manufacturing', 5, 577),\n" +
            "(579, 'NAICS', 32721, 'Glass and Glass Product Manufacturing', 4, 578),\n" +
            "(582, 'NAICS', 327213, 'Glass Container Manufacturing', 5, 579),\n" +
            "(583, 'NAICS', 327215, 'Glass Product Manufacturing Made of Purchased Glass', 5, 579),\n" +
            "(580, 'NAICS', 327211, 'Flat Glass Manufacturing', 5, 579),\n" +
            "(645, 'NAICS', 332114, 'Custom Roll Forming', 5, 642),\n" +
            "(581, 'NAICS', 327212, 'Other Pressed and Blown Glass and Glassware Manufacturing', 5, 579),\n" +
            "(588, 'NAICS', 32732, 'Ready-Mix Concrete Manufacturing', 4, 584),\n" +
            "(586, 'NAICS', 32731, 'Cement Manufacturing', 4, 584),\n" +
            "(589, 'NAICS', 32733, 'Concrete Pipe, Brick, and Block Manufacturing', 4, 584),\n" +
            "(593, 'NAICS', 32739, 'Other Concrete Product Manufacturing', 4, 584),\n" +
            "(585, 'NAICS', 327310, 'Cement Manufacturing', 5, 586),\n" +
            "(587, 'NAICS', 327320, 'Ready-Mix Concrete Manufacturing', 5, 588),\n" +
            "(590, 'NAICS', 327331, 'Concrete Block and Brick Manufacturing', 5, 589),\n" +
            "(591, 'NAICS', 327332, 'Concrete Pipe Manufacturing', 5, 589),\n" +
            "(592, 'NAICS', 327390, 'Other Concrete Product Manufacturing', 5, 593),\n" +
            "(596, 'NAICS', 32741, 'Lime Manufacturing', 4, 594),\n" +
            "(598, 'NAICS', 32742, 'Gypsum Product Manufacturing', 4, 594),\n" +
            "(595, 'NAICS', 327410, 'Lime Manufacturing', 5, 596),\n" +
            "(597, 'NAICS', 327420, 'Gypsum Product Manufacturing', 5, 598),\n" +
            "(602, 'NAICS', 32799, 'All Other Nonmetallic Mineral Product Manufacturing', 4, 599),\n" +
            "(601, 'NAICS', 32791, 'Abrasive Product Manufacturing', 4, 599),\n" +
            "(600, 'NAICS', 327910, 'Abrasive Product Manufacturing', 5, 601),\n" +
            "(603, 'NAICS', 327991, 'Cut Stone and Stone Product Manufacturing', 5, 602),\n" +
            "(604, 'NAICS', 327992, 'Ground or Treated Mineral and Earth Manufacturing', 5, 602),\n" +
            "(606, 'NAICS', 327999, 'All Other Miscellaneous Nonmetallic Mineral Product Manufacturing', 5, 602),\n" +
            "(605, 'NAICS', 327993, 'Mineral Wool Manufacturing', 5, 602),\n" +
            "(623, 'NAICS', 3314, 'Nonferrous Metal (except Aluminum) Production and Processing', 3, 607),\n" +
            "(611, 'NAICS', 3312, 'Steel Product Manufacturing from Purchased Steel', 3, 607),\n" +
            "(608, 'NAICS', 3311, 'Iron and Steel Mills and Ferroalloy Manufacturing', 3, 607),\n" +
            "(631, 'NAICS', 3315, 'Foundries', 3, 607),\n" +
            "(617, 'NAICS', 3313, 'Alumina and Aluminum Production and Processing', 3, 607),\n" +
            "(610, 'NAICS', 33111, 'Iron and Steel Mills and Ferroalloy Manufacturing', 4, 608),\n" +
            "(609, 'NAICS', 331110, 'Iron and Steel Mills and Ferroalloy Manufacturing', 5, 610),\n" +
            "(614, 'NAICS', 33122, 'Rolling and Drawing of Purchased Steel', 4, 611),\n" +
            "(613, 'NAICS', 33121, 'Iron and Steel Pipe and Tube Manufacturing from Purchased Steel', 4, 611);\n";
    static String industryCodeInsert5 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(612, 'NAICS', 331210, 'Iron and Steel Pipe and Tube Manufacturing from Purchased Steel', 5, 613),\n" +
            "(616, 'NAICS', 331222, 'Steel Wire Drawing', 5, 614),\n" +
            "(615, 'NAICS', 331221, 'Rolled Steel Shape Manufacturing', 5, 614),\n" +
            "(618, 'NAICS', 33131, 'Alumina and Aluminum Production and Processing', 4, 617),\n" +
            "(622, 'NAICS', 331318, 'Other Aluminum Rolling, Drawing, and Extruding', 5, 618),\n" +
            "(619, 'NAICS', 331313, 'Alumina Refining and Primary Aluminum Production', 5, 618),\n" +
            "(620, 'NAICS', 331314, 'Secondary Smelting and Alloying of Aluminum', 5, 618),\n" +
            "(621, 'NAICS', 331315, 'Aluminum Sheet, Plate, and Foil Manufacturing', 5, 618),\n" +
            "(627, 'NAICS', 33142, 'Copper Rolling, Drawing, Extruding, and Alloying', 4, 623),\n" +
            "(628, 'NAICS', 33149, 'Nonferrous Metal (except Copper and Aluminum) Rolling, Drawing, Extruding, and Alloying', 4, 623),\n" +
            "(625, 'NAICS', 33141, 'Nonferrous Metal (except Aluminum) Smelting and Refining', 4, 623),\n" +
            "(624, 'NAICS', 331410, 'Nonferrous Metal (except Aluminum) Smelting and Refining', 5, 625),\n" +
            "(626, 'NAICS', 331420, 'Copper Rolling, Drawing, Extruding, and Alloying', 5, 627),\n" +
            "(630, 'NAICS', 331492, 'Secondary Smelting, Refining, and Alloying of Nonferrous Metal (except Copper and Aluminum)', 5, 628),\n" +
            "(629, 'NAICS', 331491, 'Nonferrous Metal (except Copper and Aluminum) Rolling, Drawing, and Extruding', 5, 628),\n" +
            "(632, 'NAICS', 33151, 'Ferrous Metal Foundries', 4, 631),\n" +
            "(636, 'NAICS', 33152, 'Nonferrous Metal Foundries', 4, 631),\n" +
            "(633, 'NAICS', 331511, 'Iron Foundries', 5, 632),\n" +
            "(635, 'NAICS', 331513, 'Steel Foundries (except Investment)', 5, 632),\n" +
            "(634, 'NAICS', 331512, 'Steel Investment Foundries', 5, 632),\n" +
            "(639, 'NAICS', 331529, 'Other Nonferrous Metal Foundries (except Die-Casting)', 5, 636),\n" +
            "(637, 'NAICS', 331523, 'Nonferrous Metal Die-Casting Foundries', 5, 636),\n" +
            "(638, 'NAICS', 331524, 'Aluminum Foundries (except Die-Casting)', 5, 636),\n" +
            "(672, 'NAICS', 3326, 'Spring and Wire Product Manufacturing', 3, 640),\n" +
            "(687, 'NAICS', 3329, 'Other Fabricated Metal Product Manufacturing', 3, 640),\n" +
            "(669, 'NAICS', 3325, 'Hardware Manufacturing', 3, 640),\n" +
            "(641, 'NAICS', 3321, 'Forging and Stamping', 3, 640),\n" +
            "(648, 'NAICS', 3322, 'Cutlery and Handtool Manufacturing', 3, 640),\n" +
            "(652, 'NAICS', 3323, 'Architectural and Structural Metals Manufacturing', 3, 640),\n" +
            "(661, 'NAICS', 3324, 'Boiler, Tank, and Shipping Container Manufacturing', 3, 640),\n" +
            "(676, 'NAICS', 3327, 'Machine Shops, Turned Product, and Screw, Nut, and Bolt Manufacturing', 3, 640),\n" +
            "(682, 'NAICS', 3328, 'Coating, Engraving, Heat Treating, and Allied Activities', 3, 640),\n" +
            "(642, 'NAICS', 33211, 'Forging and Stamping', 4, 641),\n" +
            "(647, 'NAICS', 332119, 'Metal Crown, Closure, and Other Metal Stamping (except Automotive)', 5, 642),\n" +
            "(643, 'NAICS', 332111, 'Iron and Steel Forging', 5, 642),\n" +
            "(644, 'NAICS', 332112, 'Nonferrous Forging', 5, 642),\n" +
            "(646, 'NAICS', 332117, 'Powder Metallurgy Part Manufacturing', 5, 642),\n" +
            "(649, 'NAICS', 33221, 'Cutlery and Handtool Manufacturing', 4, 648),\n" +
            "(651, 'NAICS', 332216, 'Saw Blade and Handtool Manufacturing', 5, 649),\n" +
            "(650, 'NAICS', 332215, 'Metal Kitchen Cookware, Utensil, Cutlery, and Flatware (except Precious) Manufacturing', 5, 649),\n" +
            "(657, 'NAICS', 33232, 'Ornamental and Architectural Metal Products Manufacturing', 4, 652),\n" +
            "(653, 'NAICS', 33231, 'Plate Work and Fabricated Structural Product Manufacturing', 4, 652),\n" +
            "(656, 'NAICS', 332313, 'Plate Work Manufacturing', 5, 653),\n" +
            "(654, 'NAICS', 332311, 'Prefabricated Metal Building and Component Manufacturing', 5, 653),\n" +
            "(655, 'NAICS', 332312, 'Fabricated Structural Metal Manufacturing', 5, 653),\n" +
            "(660, 'NAICS', 332323, 'Ornamental and Architectural Metal Work Manufacturing', 5, 657),\n" +
            "(658, 'NAICS', 332321, 'Metal Window and Door Manufacturing', 5, 657),\n" +
            "(659, 'NAICS', 332322, 'Sheet Metal Work Manufacturing', 5, 657),\n" +
            "(665, 'NAICS', 33242, 'Metal Tank (Heavy Gauge) Manufacturing', 4, 661),\n" +
            "(663, 'NAICS', 33241, 'Power Boiler and Heat Exchanger Manufacturing', 4, 661),\n" +
            "(666, 'NAICS', 33243, 'Metal Can, Box, and Other Metal Container (Light Gauge) Manufacturing', 4, 661),\n" +
            "(662, 'NAICS', 332410, 'Power Boiler and Heat Exchanger Manufacturing', 5, 663),\n" +
            "(664, 'NAICS', 332420, 'Metal Tank (Heavy Gauge) Manufacturing', 5, 665),\n" +
            "(667, 'NAICS', 332431, 'Metal Can Manufacturing', 5, 666),\n" +
            "(668, 'NAICS', 332439, 'Other Metal Container Manufacturing', 5, 666),\n" +
            "(671, 'NAICS', 33251, 'Hardware Manufacturing', 4, 669),\n" +
            "(670, 'NAICS', 332510, 'Hardware Manufacturing', 5, 671),\n" +
            "(673, 'NAICS', 33261, 'Spring and Wire Product Manufacturing', 4, 672),\n" +
            "(674, 'NAICS', 332613, 'Spring Manufacturing', 5, 673),\n" +
            "(675, 'NAICS', 332618, 'Other Fabricated Wire Product Manufacturing', 5, 673),\n" +
            "(678, 'NAICS', 33271, 'Machine Shops', 4, 676),\n" +
            "(679, 'NAICS', 33272, 'Turned Product and Screw, Nut, and Bolt Manufacturing', 4, 676),\n" +
            "(677, 'NAICS', 332710, 'Machine Shops', 5, 678),\n" +
            "(680, 'NAICS', 332721, 'Precision Turned Product Manufacturing', 5, 679),\n" +
            "(681, 'NAICS', 332722, 'Bolt, Nut, Screw, Rivet, and Washer Manufacturing', 5, 679),\n" +
            "(683, 'NAICS', 33281, 'Coating, Engraving, Heat Treating, and Allied Activities', 4, 682),\n" +
            "(685, 'NAICS', 332812, 'Metal Coating, Engraving (except Jewelry and Silverware), and Allied Services to Manufacturers', 5, 683),\n" +
            "(684, 'NAICS', 332811, 'Metal Heat Treating', 5, 683),\n" +
            "(686, 'NAICS', 332813, 'Electroplating, Plating, Polishing, Anodizing, and Coloring', 5, 683),\n" +
            "(688, 'NAICS', 33291, 'Metal Valve Manufacturing', 4, 687),\n" +
            "(693, 'NAICS', 33299, 'All Other Fabricated Metal Product Manufacturing', 4, 687),\n" +
            "(689, 'NAICS', 332911, 'Industrial Valve Manufacturing', 5, 688),\n" +
            "(692, 'NAICS', 332919, 'Other Metal Valve and Pipe Fitting Manufacturing', 5, 688),\n" +
            "(691, 'NAICS', 332913, 'Plumbing Fixture Fitting and Trim Manufacturing', 5, 688),\n" +
            "(690, 'NAICS', 332912, 'Fluid Power Valve and Hose Fitting Manufacturing', 5, 688),\n" +
            "(694, 'NAICS', 332991, 'Ball and Roller Bearing Manufacturing', 5, 693),\n" +
            "(697, 'NAICS', 332994, 'Small Arms, Ordnance, and Ordnance Accessories Manufacturing', 5, 693),\n" +
            "(698, 'NAICS', 332996, 'Fabricated Pipe and Pipe Fitting Manufacturing', 5, 693),\n" +
            "(699, 'NAICS', 332999, 'All Other Miscellaneous Fabricated Metal Product Manufacturing', 5, 693),\n" +
            "(696, 'NAICS', 332993, 'Ammunition (except Small Arms) Manufacturing', 5, 693),\n" +
            "(695, 'NAICS', 332992, 'Small Arms Ammunition Manufacturing', 5, 693),\n" +
            "(727, 'NAICS', 3335, 'Metalworking Machinery Manufacturing', 3, 700),\n" +
            "(701, 'NAICS', 3331, 'Agriculture, Construction, and Mining Machinery Manufacturing', 3, 700),\n" +
            "(710, 'NAICS', 3332, 'Industrial Machinery Manufacturing', 3, 700),\n" +
            "(722, 'NAICS', 3334, 'Ventilation, Heating, Air-Conditioning, and Commercial Refrigeration Equipment Manufacturing', 3, 700),\n" +
            "(734, 'NAICS', 3336, 'Engine, Turbine, and Power Transmission Equipment Manufacturing', 3, 700),\n" +
            "(717, 'NAICS', 3333, 'Commercial and Service Industry Machinery Manufacturing', 3, 700),\n" +
            "(740, 'NAICS', 3339, 'Other General Purpose Machinery Manufacturing', 3, 700),\n" +
            "(702, 'NAICS', 33311, 'Agricultural Implement Manufacturing', 4, 701),\n" +
            "(706, 'NAICS', 33312, 'Construction Machinery Manufacturing', 4, 701),\n" +
            "(707, 'NAICS', 33313, 'Mining and Oil and Gas Field Machinery Manufacturing', 4, 701),\n" +
            "(704, 'NAICS', 333112, 'Lawn and Garden Tractor and Home Lawn and Garden Equipment Manufacturing', 5, 702),\n" +
            "(703, 'NAICS', 333111, 'Farm Machinery and Equipment Manufacturing', 5, 702),\n" +
            "(705, 'NAICS', 333120, 'Construction Machinery Manufacturing', 5, 706),\n" +
            "(708, 'NAICS', 333131, 'Mining Machinery and Equipment Manufacturing', 5, 707),\n" +
            "(709, 'NAICS', 333132, 'Oil and Gas Field Machinery and Equipment Manufacturing', 5, 707),\n" +
            "(711, 'NAICS', 33324, 'Industrial Machinery Manufacturing', 4, 710),\n" +
            "(712, 'NAICS', 333241, 'Food Product Machinery Manufacturing', 5, 711),\n" +
            "(713, 'NAICS', 333242, 'Semiconductor Machinery Manufacturing', 5, 711),\n" +
            "(714, 'NAICS', 333243, 'Sawmill, Woodworking, and Paper Machinery Manufacturing', 5, 711),\n" +
            "(715, 'NAICS', 333244, 'Printing Machinery and Equipment Manufacturing', 5, 711),\n" +
            "(716, 'NAICS', 333249, 'Other Industrial Machinery Manufacturing', 5, 711),\n" +
            "(718, 'NAICS', 33331, 'Commercial and Service Industry Machinery Manufacturing', 4, 717),\n" +
            "(720, 'NAICS', 333316, 'Photographic and Photocopying Equipment Manufacturing', 5, 718),\n" +
            "(721, 'NAICS', 333318, 'Other Commercial and Service Industry Machinery Manufacturing', 5, 718),\n" +
            "(719, 'NAICS', 333314, 'Optical Instrument and Lens Manufacturing', 5, 718),\n" +
            "(723, 'NAICS', 33341, 'Ventilation, Heating, Air-Conditioning, and Commercial Refrigeration Equipment Manufacturing', 4, 722),\n" +
            "(725, 'NAICS', 333414, 'Heating Equipment (except Warm Air Furnaces) Manufacturing', 5, 723),\n" +
            "(724, 'NAICS', 333413, 'Industrial and Commercial Fan and Blower and Air Purification Equipment Manufacturing', 5, 723),\n" +
            "(726, 'NAICS', 333415, 'Air-Conditioning and Warm Air Heating Equipment and Commercial and Industrial Refrigeration Equipment Manufacturing', 5, 723),\n" +
            "(728, 'NAICS', 33351, 'Metalworking Machinery Manufacturing', 4, 727),\n" +
            "(732, 'NAICS', 333517, 'Machine Tool Manufacturing', 5, 728),\n" +
            "(733, 'NAICS', 333519, 'Rolling Mill and Other Metalworking Machinery Manufacturing', 5, 728),\n" +
            "(730, 'NAICS', 333514, 'Special Die and Tool, Die Set, Jig, and Fixture Manufacturing', 5, 728),\n" +
            "(731, 'NAICS', 333515, 'Cutting Tool and Machine Tool Accessory Manufacturing', 5, 728),\n" +
            "(729, 'NAICS', 333511, 'Industrial Mold Manufacturing', 5, 728),\n" +
            "(735, 'NAICS', 33361, 'Engine, Turbine, and Power Transmission Equipment Manufacturing', 4, 734),\n" +
            "(736, 'NAICS', 333611, 'Turbine and Turbine Generator Set Units Manufacturing', 5, 735),\n" +
            "(739, 'NAICS', 333618, 'Other Engine Equipment Manufacturing', 5, 735),\n" +
            "(737, 'NAICS', 333612, 'Speed Changer, Industrial High-Speed Drive, and Gear Manufacturing', 5, 735),\n" +
            "(738, 'NAICS', 333613, 'Mechanical Power Transmission Equipment Manufacturing', 5, 735),\n" +
            "(745, 'NAICS', 33392, 'Material Handling Equipment Manufacturing', 4, 740),\n" +
            "(750, 'NAICS', 33399, 'All Other General Purpose Machinery Manufacturing', 4, 740),\n" +
            "(741, 'NAICS', 33391, 'Pump and Compressor Manufacturing', 4, 740),\n" +
            "(742, 'NAICS', 333911, 'Pump and Pumping Equipment Manufacturing', 5, 741),\n" +
            "(743, 'NAICS', 333912, 'Air and Gas Compressor Manufacturing', 5, 741),\n" +
            "(744, 'NAICS', 333913, 'Measuring and Dispensing Pump Manufacturing', 5, 741),\n" +
            "(746, 'NAICS', 333921, 'Elevator and Moving Stairway Manufacturing', 5, 745),\n" +
            "(748, 'NAICS', 333923, 'Overhead Traveling Crane, Hoist, and Monorail System Manufacturing', 5, 745),\n" +
            "(749, 'NAICS', 333924, 'Industrial Truck, Tractor, Trailer, and Stacker Machinery Manufacturing', 5, 745),\n" +
            "(747, 'NAICS', 333922, 'Conveyor and Conveying Equipment Manufacturing', 5, 745),\n" +
            "(754, 'NAICS', 333994, 'Industrial Process Furnace and Oven Manufacturing', 5, 750),\n" +
            "(751, 'NAICS', 333991, 'Power-Driven Handtool Manufacturing', 5, 750),\n" +
            "(752, 'NAICS', 333992, 'Welding and Soldering Equipment Manufacturing', 5, 750),\n" +
            "(753, 'NAICS', 333993, 'Packaging Machinery Manufacturing', 5, 750),\n" +
            "(755, 'NAICS', 333995, 'Fluid Power Cylinder and Actuator Manufacturing', 5, 750),\n" +
            "(756, 'NAICS', 333996, 'Fluid Power Pump and Motor Manufacturing', 5, 750),\n" +
            "(757, 'NAICS', 333997, 'Scale and Balance Manufacturing', 5, 750),\n" +
            "(758, 'NAICS', 333999, 'All Other Miscellaneous General Purpose Machinery Manufacturing', 5, 750),\n" +
            "(794, 'NAICS', 3346, 'Manufacturing and Reproducing Magnetic and Optical Media', 3, 759),\n" +
            "(775, 'NAICS', 3344, 'Semiconductor and Other Electronic Component Manufacturing', 3, 759),\n" +
            "(772, 'NAICS', 3343, 'Audio and Video Equipment Manufacturing', 3, 759),\n" +
            "(783, 'NAICS', 3345, 'Navigational, Measuring, Electromedical, and Control Instruments Manufacturing', 3, 759),\n" +
            "(765, 'NAICS', 3342, 'Communications Equipment Manufacturing', 3, 759),\n" +
            "(760, 'NAICS', 3341, 'Computer and Peripheral Equipment Manufacturing', 3, 759),\n" +
            "(761, 'NAICS', 33411, 'Computer and Peripheral Equipment Manufacturing', 4, 760),\n" +
            "(763, 'NAICS', 334112, 'Computer Storage Device Manufacturing', 5, 761),\n" +
            "(762, 'NAICS', 334111, 'Electronic Computer Manufacturing', 5, 761),\n" +
            "(764, 'NAICS', 334118, 'Computer Terminal and Other Computer Peripheral Equipment Manufacturing', 5, 761),\n" +
            "(767, 'NAICS', 33421, 'Telephone Apparatus Manufacturing', 4, 765),\n" +
            "(769, 'NAICS', 33422, 'Radio and Television Broadcasting and Wireless Communications Equipment Manufacturing', 4, 765),\n" +
            "(771, 'NAICS', 33429, 'Other Communications Equipment Manufacturing', 4, 765),\n" +
            "(766, 'NAICS', 334210, 'Telephone Apparatus Manufacturing', 5, 767),\n" +
            "(768, 'NAICS', 334220, 'Radio and Television Broadcasting and Wireless Communications Equipment Manufacturing', 5, 769),\n" +
            "(770, 'NAICS', 334290, 'Other Communications Equipment Manufacturing', 5, 771),\n" +
            "(774, 'NAICS', 33431, 'Audio and Video Equipment Manufacturing', 4, 772),\n" +
            "(773, 'NAICS', 334310, 'Audio and Video Equipment Manufacturing', 5, 774),\n" +
            "(776, 'NAICS', 33441, 'Semiconductor and Other Electronic Component Manufacturing', 4, 775),\n" +
            "(780, 'NAICS', 334417, 'Electronic Connector Manufacturing', 5, 776),\n" +
            "(779, 'NAICS', 334416, 'Capacitor, Resistor, Coil, Transformer, and Other Inductor Manufacturing', 5, 776),\n" +
            "(781, 'NAICS', 334418, 'Printed Circuit Assembly (Electronic Assembly) Manufacturing', 5, 776),\n" +
            "(777, 'NAICS', 334412, 'Bare Printed Circuit Board Manufacturing', 5, 776),\n" +
            "(778, 'NAICS', 334413, 'Semiconductor and Related Device Manufacturing', 5, 776),\n" +
            "(782, 'NAICS', 334419, 'Other Electronic Component Manufacturing', 5, 776),\n" +
            "(785, 'NAICS', 33451, 'Navigational, Measuring, Electromedical, and Control Instruments Manufacturing', 4, 783),\n" +
            "(792, 'NAICS', 334517, 'Irradiation Apparatus Manufacturing', 5, 785),\n" +
            "(790, 'NAICS', 334515, 'Instrument Manufacturing for Measuring and Testing Electricity and Electrical Signals', 5, 785),\n" +
            "(789, 'NAICS', 334514, 'Totalizing Fluid Meter and Counting Device Manufacturing', 5, 785),\n" +
            "(788, 'NAICS', 334513, 'Instruments and Related Products Manufacturing for Measuring, Displaying, and Controlling Industrial Process Variables', 5, 785),\n" +
            "(787, 'NAICS', 334512, 'Automatic Environmental Control Manufacturing for Residential, Commercial, and Appliance Use', 5, 785),\n" +
            "(786, 'NAICS', 334511, 'Search, Detection, Navigation, Guidance, Aeronautical, and Nautical System and Instrument Manufacturing', 5, 785),\n" +
            "(784, 'NAICS', 334510, 'Electromedical and Electrotherapeutic Apparatus Manufacturing', 5, 785),\n" +
            "(793, 'NAICS', 334519, 'Other Measuring and Controlling Device Manufacturing', 5, 785),\n" +
            "(791, 'NAICS', 334516, 'Analytical Laboratory Instrument Manufacturing', 5, 785),\n" +
            "(795, 'NAICS', 33461, 'Manufacturing and Reproducing Magnetic and Optical Media', 4, 794),\n" +
            "(797, 'NAICS', 334614, 'Software and Other Prerecorded Compact Disc, Tape, and Record Reproducing', 5, 795),\n" +
            "(796, 'NAICS', 334613, 'Blank Magnetic and Optical Recording Media Manufacturing', 5, 795),\n" +
            "(820, 'NAICS', 3359, 'Other Electrical Equipment and Component Manufacturing', 3, 798),\n" +
            "(799, 'NAICS', 3351, 'Electric Lighting Equipment Manufacturing', 3, 798),\n" +
            "(814, 'NAICS', 3353, 'Electrical Equipment Manufacturing', 3, 798),\n" +
            "(806, 'NAICS', 3352, 'Household Appliance Manufacturing', 3, 798),\n" +
            "(801, 'NAICS', 33511, 'Electric Lamp Bulb and Part Manufacturing', 4, 799),\n" +
            "(802, 'NAICS', 33512, 'Lighting Fixture Manufacturing', 4, 799),\n" +
            "(800, 'NAICS', 335110, 'Electric Lamp Bulb and Part Manufacturing', 5, 801),\n" +
            "(804, 'NAICS', 335122, 'Commercial, Industrial, and Institutional Electric Lighting Fixture Manufacturing', 5, 802),\n" +
            "(803, 'NAICS', 335121, 'Residential Electric Lighting Fixture Manufacturing', 5, 802),\n" +
            "(805, 'NAICS', 335129, 'Other Lighting Equipment Manufacturing', 5, 802),\n" +
            "(809, 'NAICS', 33522, 'Major Appliance Manufacturing', 4, 806),\n" +
            "(808, 'NAICS', 33521, 'Small Electrical Appliance Manufacturing', 4, 806),\n" +
            "(807, 'NAICS', 335210, 'Small Electrical Appliance Manufacturing', 5, 808),\n" +
            "(810, 'NAICS', 335221, 'Household Cooking Appliance Manufacturing', 5, 809),\n" +
            "(813, 'NAICS', 335228, 'Other Major Household Appliance Manufacturing', 5, 809),\n" +
            "(812, 'NAICS', 335224, 'Household Laundry Equipment Manufacturing', 5, 809),\n" +
            "(811, 'NAICS', 335222, 'Household Refrigerator and Home Freezer Manufacturing', 5, 809),\n" +
            "(815, 'NAICS', 33531, 'Electrical Equipment Manufacturing', 4, 814),\n" +
            "(816, 'NAICS', 335311, 'Power, Distribution, and Specialty Transformer Manufacturing', 5, 815),\n" +
            "(817, 'NAICS', 335312, 'Motor and Generator Manufacturing', 5, 815),\n" +
            "(819, 'NAICS', 335314, 'Relay and Industrial Control Manufacturing', 5, 815),\n" +
            "(818, 'NAICS', 335313, 'Switchgear and Switchboard Apparatus Manufacturing', 5, 815),\n" +
            "(824, 'NAICS', 33592, 'Communication and Energy Wire and Cable Manufacturing', 4, 820),\n" +
            "(830, 'NAICS', 33599, 'All Other Electrical Equipment and Component Manufacturing', 4, 820),\n" +
            "(821, 'NAICS', 33591, 'Battery Manufacturing', 4, 820),\n" +
            "(823, 'NAICS', 335912, 'Primary Battery Manufacturing', 5, 821),\n" +
            "(822, 'NAICS', 335911, 'Storage Battery Manufacturing', 5, 821),\n" +
            "(825, 'NAICS', 335921, 'Fiber Optic Cable Manufacturing', 5, 824),\n" +
            "(826, 'NAICS', 335929, 'Other Communication and Energy Wire Manufacturing', 5, 824),\n" +
            "(828, 'NAICS', 335931, 'Current-Carrying Wiring Device Manufacturing', 5, 827),\n" +
            "(829, 'NAICS', 335932, 'Noncurrent-Carrying Wiring Device Manufacturing', 5, 827),\n" +
            "(831, 'NAICS', 335991, 'Carbon and Graphite Product Manufacturing', 5, 830),\n" +
            "(832, 'NAICS', 335999, 'All Other Miscellaneous Electrical Equipment and Component Manufacturing', 5, 830),\n" +
            "(846, 'NAICS', 3363, 'Motor Vehicle Parts Manufacturing', 3, 833),\n" +
            "(863, 'NAICS', 3364, 'Aerospace Product and Parts Manufacturing', 3, 833),\n" +
            "(874, 'NAICS', 3366, 'Ship and Boat Building', 3, 833),\n" +
            "(834, 'NAICS', 3361, 'Motor Vehicle Manufacturing', 3, 833),\n" +
            "(878, 'NAICS', 3369, 'Other Transportation Equipment Manufacturing', 3, 833),\n" +
            "(840, 'NAICS', 3362, 'Motor Vehicle Body and Trailer Manufacturing', 3, 833),\n" +
            "(871, 'NAICS', 3365, 'Railroad Rolling Stock Manufacturing', 3, 833),\n" +
            "(835, 'NAICS', 33611, 'Automobile and Light Duty Motor Vehicle Manufacturing', 4, 834),\n" +
            "(839, 'NAICS', 33612, 'Heavy Duty Truck Manufacturing', 4, 834),\n" +
            "(837, 'NAICS', 336112, 'Light Truck and Utility Vehicle Manufacturing', 5, 835),\n" +
            "(836, 'NAICS', 336111, 'Automobile Manufacturing', 5, 835),\n" +
            "(838, 'NAICS', 336120, 'Heavy Duty Truck Manufacturing', 5, 839),\n" +
            "(841, 'NAICS', 33621, 'Motor Vehicle Body and Trailer Manufacturing', 4, 840),\n" +
            "(843, 'NAICS', 336212, 'Truck Trailer Manufacturing', 5, 841),\n" +
            "(845, 'NAICS', 336214, 'Travel Trailer and Camper Manufacturing', 5, 841),\n" +
            "(844, 'NAICS', 336213, 'Motor Home Manufacturing', 5, 841),\n" +
            "(842, 'NAICS', 336211, 'Motor Vehicle Body Manufacturing', 5, 841),\n" +
            "(856, 'NAICS', 33635, 'Motor Vehicle Transmission and Power Train Parts Manufacturing', 4, 846),\n" +
            "(848, 'NAICS', 33631, 'Motor Vehicle Gasoline Engine and Engine Parts Manufacturing', 4, 846),\n" +
            "(862, 'NAICS', 33639, 'Other Motor Vehicle Parts Manufacturing', 4, 846),\n" +
            "(850, 'NAICS', 33632, 'Motor Vehicle Electrical and Electronic Equipment Manufacturing', 4, 846),\n" +
            "(860, 'NAICS', 33637, 'Motor Vehicle Metal Stamping', 4, 846),\n" +
            "(852, 'NAICS', 33633, 'Motor Vehicle Steering and Suspension Components (except Spring) Manufacturing', 4, 846),\n" +
            "(858, 'NAICS', 33636, 'Motor Vehicle Seating and Interior Trim Manufacturing', 4, 846),\n" +
            "(854, 'NAICS', 33634, 'Motor Vehicle Brake System Manufacturing', 4, 846),\n" +
            "(847, 'NAICS', 336310, 'Motor Vehicle Gasoline Engine and Engine Parts Manufacturing', 5, 848),\n" +
            "(849, 'NAICS', 336320, 'Motor Vehicle Electrical and Electronic Equipment Manufacturing', 5, 850),\n" +
            "(851, 'NAICS', 336330, 'Motor Vehicle Steering and Suspension Components (except Spring) Manufacturing', 5, 852),\n" +
            "(853, 'NAICS', 336340, 'Motor Vehicle Brake System Manufacturing', 5, 854),\n" +
            "(855, 'NAICS', 336350, 'Motor Vehicle Transmission and Power Train Parts Manufacturing', 5, 856),\n" +
            "(857, 'NAICS', 336360, 'Motor Vehicle Seating and Interior Trim Manufacturing', 5, 858),\n" +
            "(859, 'NAICS', 336370, 'Motor Vehicle Metal Stamping', 5, 860),\n" +
            "(861, 'NAICS', 336390, 'Other Motor Vehicle Parts Manufacturing', 5, 862),\n" +
            "(864, 'NAICS', 33641, 'Aerospace Product and Parts Manufacturing', 4, 863),\n" +
            "(865, 'NAICS', 336411, 'Aircraft Manufacturing', 5, 864),\n" +
            "(869, 'NAICS', 336415, 'Guided Missile and Space Vehicle Propulsion Unit and Propulsion Unit Parts Manufacturing', 5, 864),\n" +
            "(870, 'NAICS', 336419, 'Other Guided Missile and Space Vehicle Parts and Auxiliary Equipment Manufacturing', 5, 864),\n" +
            "(867, 'NAICS', 336413, 'Other Aircraft Parts and Auxiliary Equipment Manufacturing', 5, 864),\n" +
            "(866, 'NAICS', 336412, 'Aircraft Engine and Engine Parts Manufacturing', 5, 864),\n" +
            "(868, 'NAICS', 336414, 'Guided Missile and Space Vehicle Manufacturing', 5, 864),\n" +
            "(873, 'NAICS', 33651, 'Railroad Rolling Stock Manufacturing', 4, 871),\n" +
            "(872, 'NAICS', 336510, 'Railroad Rolling Stock Manufacturing', 5, 873),\n" +
            "(875, 'NAICS', 33661, 'Ship and Boat Building', 4, 874),\n" +
            "(876, 'NAICS', 336611, 'Ship Building and Repairing', 5, 875),\n" +
            "(877, 'NAICS', 336612, 'Boat Building', 5, 875),\n" +
            "(879, 'NAICS', 33699, 'Other Transportation Equipment Manufacturing', 4, 878),\n" +
            "(882, 'NAICS', 336999, 'All Other Transportation Equipment Manufacturing', 5, 879),\n" +
            "(881, 'NAICS', 336992, 'Military Armored Vehicle, Tank, and Tank Component Manufacturing', 5, 879),\n" +
            "(880, 'NAICS', 336991, 'Motorcycle, Bicycle, and Parts Manufacturing', 5, 879),\n" +
            "(884, 'NAICS', 3371, 'Household and Institutional Furniture and Kitchen Cabinet Manufacturing', 3, 883),\n" +
            "(893, 'NAICS', 3372, 'Office Furniture (including Fixtures) Manufacturing', 3, 883),\n" +
            "(899, 'NAICS', 3379, 'Other Furniture Related Product Manufacturing', 3, 883),\n" +
            "(886, 'NAICS', 33711, 'Wood Kitchen Cabinet and Countertop Manufacturing', 4, 884),\n" +
            "(887, 'NAICS', 33712, 'Household and Institutional Furniture Manufacturing', 4, 884),\n" +
            "(885, 'NAICS', 337110, 'Wood Kitchen Cabinet and Countertop Manufacturing', 5, 886),\n" +
            "(892, 'NAICS', 337127, 'Institutional Furniture Manufacturing', 5, 887),\n" +
            "(889, 'NAICS', 337122, 'Nonupholstered Wood Household Furniture Manufacturing', 5, 887),\n" +
            "(888, 'NAICS', 337121, 'Upholstered Household Furniture Manufacturing', 5, 887),\n" +
            "(890, 'NAICS', 337124, 'Metal Household Furniture Manufacturing', 5, 887),\n" +
            "(891, 'NAICS', 337125, 'Household Furniture (except Wood and Metal) Manufacturing', 5, 887),\n" +
            "(894, 'NAICS', 33721, 'Office Furniture (including Fixtures) Manufacturing', 4, 893),\n" +
            "(898, 'NAICS', 337215, 'Showcase, Partition, Shelving, and Locker Manufacturing', 5, 894),\n" +
            "(895, 'NAICS', 337211, 'Wood Office Furniture Manufacturing', 5, 894),\n" +
            "(896, 'NAICS', 337212, 'Custom Architectural Woodwork and Millwork Manufacturing', 5, 894),\n" +
            "(897, 'NAICS', 337214, 'Office Furniture (except Wood) Manufacturing', 5, 894),\n" +
            "(903, 'NAICS', 33792, 'Blind and Shade Manufacturing', 4, 899),\n" +
            "(901, 'NAICS', 33791, 'Mattress Manufacturing', 4, 899),\n" +
            "(900, 'NAICS', 337910, 'Mattress Manufacturing', 5, 901),\n" +
            "(902, 'NAICS', 337920, 'Blind and Shade Manufacturing', 5, 903),\n" +
            "(912, 'NAICS', 3399, 'Other Miscellaneous Manufacturing', 3, 904),\n" +
            "(905, 'NAICS', 3391, 'Medical Equipment and Supplies Manufacturing', 3, 904),\n" +
            "(906, 'NAICS', 33911, 'Medical Equipment and Supplies Manufacturing', 4, 905),\n" +
            "(908, 'NAICS', 339113, 'Surgical Appliance and Supplies Manufacturing', 5, 906),\n" +
            "(911, 'NAICS', 339116, 'Dental Laboratories', 5, 906),\n" +
            "(910, 'NAICS', 339115, 'Ophthalmic Goods Manufacturing', 5, 906),\n" +
            "(909, 'NAICS', 339114, 'Dental Equipment and Supplies Manufacturing', 5, 906),\n" +
            "(907, 'NAICS', 339112, 'Surgical and Medical Instrument Manufacturing', 5, 906),\n" +
            "(918, 'NAICS', 33993, 'Doll, Toy, and Game Manufacturing', 4, 912),\n" +
            "(914, 'NAICS', 33991, 'Jewelry and Silverware Manufacturing', 4, 912),\n" +
            "(922, 'NAICS', 33995, 'Sign Manufacturing', 4, 912),\n" +
            "(923, 'NAICS', 33999, 'All Other Miscellaneous Manufacturing', 4, 912),\n" +
            "(920, 'NAICS', 33994, 'Office Supplies (except Paper) Manufacturing', 4, 912),\n" +
            "(916, 'NAICS', 33992, 'Sporting and Athletic Goods Manufacturing', 4, 912),\n" +
            "(913, 'NAICS', 339910, 'Jewelry and Silverware Manufacturing', 5, 914),\n" +
            "(915, 'NAICS', 339920, 'Sporting and Athletic Goods Manufacturing', 5, 916),\n" +
            "(917, 'NAICS', 339930, 'Doll, Toy, and Game Manufacturing', 5, 918),\n" +
            "(919, 'NAICS', 339940, 'Office Supplies (except Paper) Manufacturing', 5, 920),\n" +
            "(921, 'NAICS', 339950, 'Sign Manufacturing', 5, 922),\n" +
            "(925, 'NAICS', 339992, 'Musical Instrument Manufacturing', 5, 923),\n" +
            "(924, 'NAICS', 339991, 'Gasket, Packing, and Sealing Device Manufacturing', 5, 923),\n" +
            "(926, 'NAICS', 339993, 'Fastener, Button, Needle, and Pin Manufacturing', 5, 923),\n" +
            "(927, 'NAICS', 339994, 'Broom, Brush, and Mop Manufacturing', 5, 923),\n" +
            "(928, 'NAICS', 339995, 'Burial Casket Manufacturing', 5, 923),\n" +
            "(929, 'NAICS', 339999, 'All Other Miscellaneous Manufacturing', 5, 923),\n" +
            "(1057, 'NAICS', 424520, 'Livestock Merchant Wholesalers', 5, 1058),\n" +
            "(1089, 'NAICS', 425, 'Wholesale Electronic Markets and Agents and Brokers', 2, 930),\n" +
            "(931, 'NAICS', 423, 'Merchant Wholesalers, Durable Goods', 2, 930),\n" +
            "(1015, 'NAICS', 424, 'Merchant Wholesalers, Nondurable Goods', 2, 930),\n" +
            "(1004, 'NAICS', 4239, 'Miscellaneous Durable Goods Merchant Wholesalers', 3, 931),\n" +
            "(991, 'NAICS', 4238, 'Machinery, Equipment, and Supplies Merchant Wholesalers', 3, 931),\n" +
            "(975, 'NAICS', 4236, 'Household Appliances and Electrical and Electronic Goods Merchant Wholesalers', 3, 931),\n" +
            "(982, 'NAICS', 4237, 'Hardware, and Plumbing and Heating Equipment and Supplies Merchant Wholesalers', 3, 931),\n" +
            "(941, 'NAICS', 4232, 'Furniture and Home Furnishing Merchant Wholesalers', 3, 931),\n" +
            "(970, 'NAICS', 4235, 'Metal and Mineral (except Petroleum) Merchant Wholesalers', 3, 931),\n" +
            "(946, 'NAICS', 4233, 'Lumber and Other Construction Materials Merchant Wholesalers', 3, 931),\n" +
            "(932, 'NAICS', 4231, 'Motor Vehicle and Motor Vehicle Parts and Supplies Merchant Wholesalers', 3, 931),\n" +
            "(955, 'NAICS', 4234, 'Professional and Commercial Equipment and Supplies Merchant Wholesalers', 3, 931),\n" +
            "(938, 'NAICS', 42313, 'Tire and Tube Merchant Wholesalers', 4, 932),\n" +
            "(940, 'NAICS', 42314, 'Motor Vehicle Parts (Used) Merchant Wholesalers', 4, 932),\n" +
            "(934, 'NAICS', 42311, 'Automobile and Other Motor Vehicle Merchant Wholesalers', 4, 932),\n" +
            "(936, 'NAICS', 42312, 'Motor Vehicle Supplies and New Parts Merchant Wholesalers', 4, 932),\n" +
            "(933, 'NAICS', 423110, 'Automobile and Other Motor Vehicle Merchant Wholesalers', 5, 934),\n" +
            "(935, 'NAICS', 423120, 'Motor Vehicle Supplies and New Parts Merchant Wholesalers', 5, 936),\n" +
            "(937, 'NAICS', 423130, 'Tire and Tube Merchant Wholesalers', 5, 938),\n" +
            "(939, 'NAICS', 423140, 'Motor Vehicle Parts (Used) Merchant Wholesalers', 5, 940),\n" +
            "(943, 'NAICS', 42321, 'Furniture Merchant Wholesalers', 4, 941),\n" +
            "(945, 'NAICS', 42322, 'Home Furnishing Merchant Wholesalers', 4, 941),\n" +
            "(942, 'NAICS', 423210, 'Furniture Merchant Wholesalers', 5, 943),\n" +
            "(1144, 'NAICS', 4451, 'Grocery Stores', 3, 1143),\n" +
            "(944, 'NAICS', 423220, 'Home Furnishing Merchant Wholesalers', 5, 945),\n" +
            "(948, 'NAICS', 42331, 'Lumber, Plywood, Millwork, and Wood Panel Merchant Wholesalers', 4, 946),\n" +
            "(952, 'NAICS', 42333, 'Roofing, Siding, and Insulation Material Merchant Wholesalers', 4, 946),\n" +
            "(954, 'NAICS', 42339, 'Other Construction Material Merchant Wholesalers', 4, 946),\n" +
            "(950, 'NAICS', 42332, 'Brick, Stone, and Related Construction Material Merchant Wholesalers', 4, 946),\n" +
            "(947, 'NAICS', 423310, 'Lumber, Plywood, Millwork, and Wood Panel Merchant Wholesalers', 5, 948),\n" +
            "(949, 'NAICS', 423320, 'Brick, Stone, and Related Construction Material Merchant Wholesalers', 5, 950),\n" +
            "(951, 'NAICS', 423330, 'Roofing, Siding, and Insulation Material Merchant Wholesalers', 5, 952),\n" +
            "(953, 'NAICS', 423390, 'Other Construction Material Merchant Wholesalers', 5, 954),\n" +
            "(961, 'NAICS', 42343, 'Computer and Computer Peripheral Equipment and Software Merchant Wholesalers', 4, 955),\n" +
            "(965, 'NAICS', 42345, 'Medical, Dental, and Hospital Equipment and Supplies Merchant Wholesalers', 4, 955),\n" +
            "(959, 'NAICS', 42342, 'Office Equipment Merchant Wholesalers', 4, 955),\n" +
            "(969, 'NAICS', 42349, 'Other Professional Equipment and Supplies Merchant Wholesalers', 4, 955),\n" +
            "(963, 'NAICS', 42344, 'Other Commercial Equipment Merchant Wholesalers', 4, 955),\n" +
            "(967, 'NAICS', 42346, 'Ophthalmic Goods Merchant Wholesalers', 4, 955),\n" +
            "(957, 'NAICS', 42341, 'Photographic Equipment and Supplies Merchant Wholesalers', 4, 955),\n" +
            "(956, 'NAICS', 423410, 'Photographic Equipment and Supplies Merchant Wholesalers', 5, 957),\n" +
            "(958, 'NAICS', 423420, 'Office Equipment Merchant Wholesalers', 5, 959),\n" +
            "(1157, 'NAICS', 445291, 'Baked Goods Stores', 5, 1156),\n" +
            "(960, 'NAICS', 423430, 'Computer and Computer Peripheral Equipment and Software Merchant Wholesalers', 5, 961),\n" +
            "(962, 'NAICS', 423440, 'Other Commercial Equipment Merchant Wholesalers', 5, 963),\n" +
            "(964, 'NAICS', 423450, 'Medical, Dental, and Hospital Equipment and Supplies Merchant Wholesalers', 5, 965),\n" +
            "(966, 'NAICS', 423460, 'Ophthalmic Goods Merchant Wholesalers', 5, 967),\n" +
            "(968, 'NAICS', 423490, 'Other Professional Equipment and Supplies Merchant Wholesalers', 5, 969),\n" +
            "(974, 'NAICS', 42352, 'Coal and Other Mineral and Ore Merchant Wholesalers', 4, 970),\n" +
            "(972, 'NAICS', 42351, 'Metal Service Centers and Other Metal Merchant Wholesalers', 4, 970),\n" +
            "(971, 'NAICS', 423510, 'Metal Service Centers and Other Metal Merchant Wholesalers', 5, 972),\n" +
            "(973, 'NAICS', 423520, 'Coal and Other Mineral and Ore Merchant Wholesalers', 5, 974),\n" +
            "(981, 'NAICS', 42369, 'Other Electronic Parts and Equipment Merchant Wholesalers', 4, 975),\n" +
            "(979, 'NAICS', 42362, 'Household Appliances, Electric Housewares, and Consumer Electronics Merchant Wholesalers', 4, 975),\n" +
            "(977, 'NAICS', 42361, 'Electrical Apparatus and Equipment, Wiring Supplies, and Related Equipment Merchant Wholesalers', 4, 975),\n" +
            "(976, 'NAICS', 423610, 'Electrical Apparatus and Equipment, Wiring Supplies, and Related Equipment Merchant Wholesalers', 5, 977),\n" +
            "(978, 'NAICS', 423620, 'Household Appliances, Electric Housewares, and Consumer Electronics Merchant Wholesalers', 5, 979),\n" +
            "(980, 'NAICS', 423690, 'Other Electronic Parts and Equipment Merchant Wholesalers', 5, 981),\n" +
            "(986, 'NAICS', 42372, 'Plumbing and Heating Equipment and Supplies (Hydronics) Merchant Wholesalers', 4, 982),\n" +
            "(984, 'NAICS', 42371, 'Hardware Merchant Wholesalers', 4, 982),\n" +
            "(988, 'NAICS', 42373, 'Warm Air Heating and Air-Conditioning Equipment and Supplies Merchant Wholesalers', 4, 982),\n" +
            "(990, 'NAICS', 42374, 'Refrigeration Equipment and Supplies Merchant Wholesalers', 4, 982),\n" +
            "(983, 'NAICS', 423710, 'Hardware Merchant Wholesalers', 5, 984),\n" +
            "(985, 'NAICS', 423720, 'Plumbing and Heating Equipment and Supplies (Hydronics) Merchant Wholesalers', 5, 986),\n" +
            "(987, 'NAICS', 423730, 'Warm Air Heating and Air-Conditioning Equipment and Supplies Merchant Wholesalers', 5, 988),\n" +
            "(989, 'NAICS', 423740, 'Refrigeration Equipment and Supplies Merchant Wholesalers', 5, 990),\n" +
            "(999, 'NAICS', 42384, 'Industrial Supplies Merchant Wholesalers', 4, 991),\n" +
            "(1059, 'NAICS', 424590, 'Other Farm Product Raw Material Merchant Wholesalers', 5, 1060),\n" +
            "(993, 'NAICS', 42381, 'Construction and Mining (except Oil Well) Machinery and Equipment Merchant Wholesalers', 4, 991),\n" +
            "(995, 'NAICS', 42382, 'Farm and Garden Machinery and Equipment Merchant Wholesalers', 4, 991),\n" +
            "(997, 'NAICS', 42383, 'Industrial Machinery and Equipment Merchant Wholesalers', 4, 991),\n" +
            "(1001, 'NAICS', 42385, 'Service Establishment Equipment and Supplies Merchant Wholesalers', 4, 991),\n" +
            "(1003, 'NAICS', 42386, 'Transportation Equipment and Supplies (except Motor Vehicle) Merchant Wholesalers', 4, 991),\n" +
            "(992, 'NAICS', 423810, 'Construction and Mining (except Oil Well) Machinery and Equipment Merchant Wholesalers', 5, 993),\n" +
            "(994, 'NAICS', 423820, 'Farm and Garden Machinery and Equipment Merchant Wholesalers', 5, 995),\n" +
            "(996, 'NAICS', 423830, 'Industrial Machinery and Equipment Merchant Wholesalers', 5, 997),\n" +
            "(998, 'NAICS', 423840, 'Industrial Supplies Merchant Wholesalers', 5, 999),\n" +
            "(1000, 'NAICS', 423850, 'Service Establishment Equipment and Supplies Merchant Wholesalers', 5, 1001),\n" +
            "(1002, 'NAICS', 423860, 'Transportation Equipment and Supplies (except Motor Vehicle) Merchant Wholesalers', 5, 1003),\n" +
            "(1012, 'NAICS', 42394, 'Jewelry, Watch, Precious Stone, and Precious Metal Merchant Wholesalers', 4, 1004),\n" +
            "(1006, 'NAICS', 42391, 'Sporting and Recreational Goods and Supplies Merchant Wholesalers', 4, 1004),\n" +
            "(1008, 'NAICS', 42392, 'Toy and Hobby Goods and Supplies Merchant Wholesalers', 4, 1004),\n" +
            "(1010, 'NAICS', 42393, 'Recyclable Material Merchant Wholesalers', 4, 1004),\n" +
            "(1014, 'NAICS', 42399, 'Other Miscellaneous Durable Goods Merchant Wholesalers', 4, 1004),\n" +
            "(1005, 'NAICS', 423910, 'Sporting and Recreational Goods and Supplies Merchant Wholesalers', 5, 1006),\n" +
            "(1007, 'NAICS', 423920, 'Toy and Hobby Goods and Supplies Merchant Wholesalers', 5, 1008),\n" +
            "(1009, 'NAICS', 423930, 'Recyclable Material Merchant Wholesalers', 5, 1010),\n" +
            "(1011, 'NAICS', 423940, 'Jewelry, Watch, Precious Stone, and Precious Metal Merchant Wholesalers', 5, 1012),\n" +
            "(1013, 'NAICS', 423990, 'Other Miscellaneous Durable Goods Merchant Wholesalers', 5, 1014),\n" +
            "(1155, 'NAICS', 44523, 'Fruit and Vegetable Markets', 4, 1149),\n" +
            "(1066, 'NAICS', 4247, 'Petroleum and Petroleum Products Merchant Wholesalers', 3, 1015),\n" +
            "(1016, 'NAICS', 4241, 'Paper and Paper Product Merchant Wholesalers', 3, 1015),\n" +
            "(1023, 'NAICS', 4242, 'Drugs and Druggists'' Sundries Merchant Wholesalers', 3, 1015),\n" +
            "(1246, 'NAICS', 453991, 'Tobacco Stores', 5, 1245),\n" +
            "(1026, 'NAICS', 4243, 'Apparel, Piece Goods, and Notions Merchant Wholesalers', 3, 1015),\n" +
            "(1071, 'NAICS', 4248, 'Beer, Wine, and Distilled Alcoholic Beverage Merchant Wholesalers', 3, 1015),\n" +
            "(1054, 'NAICS', 4245, 'Farm Product Raw Material Merchant Wholesalers', 3, 1015),\n" +
            "(1061, 'NAICS', 4246, 'Chemical and Allied Products Merchant Wholesalers', 3, 1015),\n" +
            "(1076, 'NAICS', 4249, 'Miscellaneous Nondurable Goods Merchant Wholesalers', 3, 1015),\n" +
            "(1035, 'NAICS', 4244, 'Grocery and Related Product Merchant Wholesalers', 3, 1015),\n" +
            "(1018, 'NAICS', 42411, 'Printing and Writing Paper Merchant Wholesalers', 4, 1016),\n" +
            "(1020, 'NAICS', 42412, 'Stationery and Office Supplies Merchant Wholesalers', 4, 1016),\n" +
            "(1022, 'NAICS', 42413, 'Industrial and Personal Service Paper Merchant Wholesalers', 4, 1016),\n" +
            "(1017, 'NAICS', 424110, 'Printing and Writing Paper Merchant Wholesalers', 5, 1018),\n" +
            "(1019, 'NAICS', 424120, 'Stationery and Office Supplies Merchant Wholesalers', 5, 1020),\n" +
            "(1021, 'NAICS', 424130, 'Industrial and Personal Service Paper Merchant Wholesalers', 5, 1022),\n" +
            "(1025, 'NAICS', 42421, 'Drugs and Druggists'' Sundries Merchant Wholesalers', 4, 1023),\n" +
            "(1024, 'NAICS', 424210, 'Drugs and Druggists'' Sundries Merchant Wholesalers', 5, 1025),\n" +
            "(1034, 'NAICS', 42434, 'Footwear Merchant Wholesalers', 4, 1026),\n" +
            "(1028, 'NAICS', 42431, 'Piece Goods, Notions, and Other Dry Goods Merchant Wholesalers', 4, 1026),\n" +
            "(1030, 'NAICS', 42432, 'Men''s and Boys'' Clothing and Furnishings Merchant Wholesalers', 4, 1026),\n" +
            "(1032, 'NAICS', 42433, 'Women''s, Children''s, and Infants'' Clothing and Accessories Merchant Wholesalers', 4, 1026),\n" +
            "(1027, 'NAICS', 424310, 'Piece Goods, Notions, and Other Dry Goods Merchant Wholesalers', 5, 1028),\n" +
            "(1029, 'NAICS', 424320, 'Men''s and Boys'' Clothing and Furnishings Merchant Wholesalers', 5, 1030),\n" +
            "(1031, 'NAICS', 424330, 'Women''s, Children''s, and Infants'' Clothing and Accessories Merchant Wholesalers', 5, 1032),\n" +
            "(1033, 'NAICS', 424340, 'Footwear Merchant Wholesalers', 5, 1034),\n" +
            "(1045, 'NAICS', 42445, 'Confectionery Merchant Wholesalers', 4, 1035),\n" +
            "(1047, 'NAICS', 42446, 'Fish and Seafood Merchant Wholesalers', 4, 1035),\n" +
            "(1051, 'NAICS', 42448, 'Fresh Fruit and Vegetable Merchant Wholesalers', 4, 1035),\n" +
            "(1039, 'NAICS', 42442, 'Packaged Frozen Food Merchant Wholesalers', 4, 1035),\n" +
            "(1041, 'NAICS', 42443, 'Dairy Product (except Dried or Canned) Merchant Wholesalers', 4, 1035),\n" +
            "(1043, 'NAICS', 42444, 'Poultry and Poultry Product Merchant Wholesalers', 4, 1035),\n" +
            "(1053, 'NAICS', 42449, 'Other Grocery and Related Products Merchant Wholesalers', 4, 1035),\n" +
            "(1049, 'NAICS', 42447, 'Meat and Meat Product Merchant Wholesalers', 4, 1035),\n" +
            "(1037, 'NAICS', 42441, 'General Line Grocery Merchant Wholesalers', 4, 1035),\n" +
            "(1036, 'NAICS', 424410, 'General Line Grocery Merchant Wholesalers', 5, 1037),\n" +
            "(1038, 'NAICS', 424420, 'Packaged Frozen Food Merchant Wholesalers', 5, 1039),\n" +
            "(1040, 'NAICS', 424430, 'Dairy Product (except Dried or Canned) Merchant Wholesalers', 5, 1041),\n" +
            "(1042, 'NAICS', 424440, 'Poultry and Poultry Product Merchant Wholesalers', 5, 1043),\n" +
            "(1044, 'NAICS', 424450, 'Confectionery Merchant Wholesalers', 5, 1045),\n" +
            "(1046, 'NAICS', 424460, 'Fish and Seafood Merchant Wholesalers', 5, 1047),\n" +
            "(1048, 'NAICS', 424470, 'Meat and Meat Product Merchant Wholesalers', 5, 1049),\n" +
            "(1050, 'NAICS', 424480, 'Fresh Fruit and Vegetable Merchant Wholesalers', 5, 1051),\n" +
            "(1052, 'NAICS', 424490, 'Other Grocery and Related Products Merchant Wholesalers', 5, 1053),\n" +
            "(1058, 'NAICS', 42452, 'Livestock Merchant Wholesalers', 4, 1054),\n" +
            "(1060, 'NAICS', 42459, 'Other Farm Product Raw Material Merchant Wholesalers', 4, 1054),\n" +
            "(1056, 'NAICS', 42451, 'Grain and Field Bean Merchant Wholesalers', 4, 1054),\n" +
            "(1055, 'NAICS', 424510, 'Grain and Field Bean Merchant Wholesalers', 5, 1056),\n" +
            "(1065, 'NAICS', 42469, 'Other Chemical and Allied Products Merchant Wholesalers', 4, 1061),\n" +
            "(1063, 'NAICS', 42461, 'Plastics Materials and Basic Forms and Shapes Merchant Wholesalers', 4, 1061),\n" +
            "(1062, 'NAICS', 424610, 'Plastics Materials and Basic Forms and Shapes Merchant Wholesalers', 5, 1063),\n" +
            "(1064, 'NAICS', 424690, 'Other Chemical and Allied Products Merchant Wholesalers', 5, 1065),\n" +
            "(1070, 'NAICS', 42472, 'Petroleum and Petroleum Products Merchant Wholesalers (except Bulk Stations and Terminals)', 4, 1066),\n" +
            "(1068, 'NAICS', 42471, 'Petroleum Bulk Stations and Terminals', 4, 1066),\n" +
            "(1067, 'NAICS', 424710, 'Petroleum Bulk Stations and Terminals', 5, 1068),\n" +
            "(1069, 'NAICS', 424720, 'Petroleum and Petroleum Products Merchant Wholesalers (except Bulk Stations and Terminals)', 5, 1070),\n" +
            "(1073, 'NAICS', 42481, 'Beer and Ale Merchant Wholesalers', 4, 1071),\n" +
            "(1075, 'NAICS', 42482, 'Wine and Distilled Alcoholic Beverage Merchant Wholesalers', 4, 1071),\n" +
            "(1072, 'NAICS', 424810, 'Beer and Ale Merchant Wholesalers', 5, 1073),\n" +
            "(1074, 'NAICS', 424820, 'Wine and Distilled Alcoholic Beverage Merchant Wholesalers', 5, 1075),\n" +
            "(1078, 'NAICS', 42491, 'Farm Supplies Merchant Wholesalers', 4, 1076),\n" +
            "(1080, 'NAICS', 42492, 'Book, Periodical, and Newspaper Merchant Wholesalers', 4, 1076),\n" +
            "(1082, 'NAICS', 42493, 'Flower, Nursery Stock, and Florists'' Supplies Merchant Wholesalers', 4, 1076),\n" +
            "(1084, 'NAICS', 42494, 'Tobacco and Tobacco Product Merchant Wholesalers', 4, 1076),\n" +
            "(1086, 'NAICS', 42495, 'Paint, Varnish, and Supplies Merchant Wholesalers', 4, 1076),\n" +
            "(1088, 'NAICS', 42499, 'Other Miscellaneous Nondurable Goods Merchant Wholesalers', 4, 1076),\n" +
            "(1077, 'NAICS', 424910, 'Farm Supplies Merchant Wholesalers', 5, 1078),\n" +
            "(1079, 'NAICS', 424920, 'Book, Periodical, and Newspaper Merchant Wholesalers', 5, 1080),\n" +
            "(1081, 'NAICS', 424930, 'Flower, Nursery Stock, and Florists'' Supplies Merchant Wholesalers', 5, 1082),\n" +
            "(1083, 'NAICS', 424940, 'Tobacco and Tobacco Product Merchant Wholesalers', 5, 1084),\n" +
            "(1085, 'NAICS', 424950, 'Paint, Varnish, and Supplies Merchant Wholesalers', 5, 1086),\n" +
            "(1087, 'NAICS', 424990, 'Other Miscellaneous Nondurable Goods Merchant Wholesalers', 5, 1088),\n" +
            "(1090, 'NAICS', 4251, 'Wholesale Electronic Markets and Agents and Brokers', 3, 1089),\n" +
            "(1092, 'NAICS', 42511, 'Business to Business Electronic Markets', 4, 1090),\n" +
            "(1094, 'NAICS', 42512, 'Wholesale Trade Agents and Brokers', 4, 1090),\n" +
            "(1091, 'NAICS', 425110, 'Business to Business Electronic Markets', 5, 1092),\n" +
            "(1093, 'NAICS', 425120, 'Wholesale Trade Agents and Brokers', 5, 1094),\n" +
            "(1163, 'NAICS', 446, 'Health and Personal Care Stores', 2, 1095),\n" +
            "(1180, 'NAICS', 448, 'Clothing and Clothing Accessories Stores', 2, 1095),\n" +
            "(1174, 'NAICS', 447, 'Gasoline Stations', 2, 1095),\n" +
            "(1096, 'NAICS', 441, 'Motor Vehicle and Parts Dealers', 2, 1095),\n" +
            "(1113, 'NAICS', 442, 'Furniture and Home Furnishings Stores', 2, 1095),\n" +
            "(1123, 'NAICS', 443, 'Electronics and Appliance Stores', 2, 1095),\n" +
            "(1128, 'NAICS', 444, 'Building Material and Garden Equipment and Supplies Dealers', 2, 1095),\n" +
            "(1143, 'NAICS', 445, 'Food and Beverage Stores', 2, 1095),\n" +
            "(1226, 'NAICS', 453, 'Miscellaneous Store Retailers', 2, 1095),\n" +
            "(1248, 'NAICS', 454, 'Nonstore Retailers', 2, 1095),\n" +
            "(1216, 'NAICS', 452, 'General Merchandise Stores', 2, 1095),\n" +
            "(1202, 'NAICS', 451, 'Sporting Goods, Hobby, Musical Instrument, and Book Stores', 2, 1095),\n" +
            "(1102, 'NAICS', 4412, 'Other Motor Vehicle Dealers', 3, 1096),\n" +
            "(1097, 'NAICS', 4411, 'Automobile Dealers', 3, 1096),\n" +
            "(1108, 'NAICS', 4413, 'Automotive Parts, Accessories, and Tire Stores', 3, 1096),\n" +
            "(1099, 'NAICS', 44111, 'New Car Dealers', 4, 1097),\n" +
            "(1101, 'NAICS', 44112, 'Used Car Dealers', 4, 1097),\n" +
            "(1098, 'NAICS', 441110, 'New Car Dealers', 5, 1099),\n" +
            "(1100, 'NAICS', 441120, 'Used Car Dealers', 5, 1101),\n" +
            "(1104, 'NAICS', 44121, 'Recreational Vehicle Dealers', 4, 1102),\n" +
            "(1105, 'NAICS', 44122, 'Motorcycle, Boat, and Other Motor Vehicle Dealers', 4, 1102),\n" +
            "(1103, 'NAICS', 441210, 'Recreational Vehicle Dealers', 5, 1104),\n" +
            "(1106, 'NAICS', 441222, 'Boat Dealers', 5, 1105),\n" +
            "(1107, 'NAICS', 441228, 'Motorcycle, ATV, and All Other Motor Vehicle Dealers', 5, 1105),\n" +
            "(1112, 'NAICS', 44132, 'Tire Dealers', 4, 1108);\n";
    static String industryCodeInsert6 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(1110, 'NAICS', 44131, 'Automotive Parts and Accessories Stores', 4, 1108),\n" +
            "(1109, 'NAICS', 441310, 'Automotive Parts and Accessories Stores', 5, 1110),\n" +
            "(1111, 'NAICS', 441320, 'Tire Dealers', 5, 1112),\n" +
            "(1114, 'NAICS', 4421, 'Furniture Stores', 3, 1113),\n" +
            "(1117, 'NAICS', 4422, 'Home Furnishings Stores', 3, 1113),\n" +
            "(1116, 'NAICS', 44211, 'Furniture Stores', 4, 1114),\n" +
            "(1115, 'NAICS', 442110, 'Furniture Stores', 5, 1116),\n" +
            "(1120, 'NAICS', 44229, 'Other Home Furnishings Stores', 4, 1117),\n" +
            "(1119, 'NAICS', 44221, 'Floor Covering Stores', 4, 1117),\n" +
            "(1118, 'NAICS', 442210, 'Floor Covering Stores', 5, 1119),\n" +
            "(1122, 'NAICS', 442299, 'All Other Home Furnishings Stores', 5, 1120),\n" +
            "(1121, 'NAICS', 442291, 'Window Treatment Stores', 5, 1120),\n" +
            "(1124, 'NAICS', 4431, 'Electronics and Appliance Stores', 3, 1123),\n" +
            "(1125, 'NAICS', 44314, 'Electronics and Appliance Stores', 4, 1124),\n" +
            "(1126, 'NAICS', 443141, 'Household Appliance Stores', 5, 1125),\n" +
            "(1127, 'NAICS', 443142, 'Electronics Stores', 5, 1125),\n" +
            "(1129, 'NAICS', 4441, 'Building Material and Supplies Dealers', 3, 1128),\n" +
            "(1138, 'NAICS', 4442, 'Lawn and Garden Equipment and Supplies Stores', 3, 1128),\n" +
            "(1137, 'NAICS', 44419, 'Other Building Material Dealers', 4, 1129),\n" +
            "(1131, 'NAICS', 44411, 'Home Centers', 4, 1129),\n" +
            "(1133, 'NAICS', 44412, 'Paint and Wallpaper Stores', 4, 1129),\n" +
            "(1135, 'NAICS', 44413, 'Hardware Stores', 4, 1129),\n" +
            "(1130, 'NAICS', 444110, 'Home Centers', 5, 1131),\n" +
            "(1132, 'NAICS', 444120, 'Paint and Wallpaper Stores', 5, 1133),\n" +
            "(1134, 'NAICS', 444130, 'Hardware Stores', 5, 1135),\n" +
            "(1136, 'NAICS', 444190, 'Other Building Material Dealers', 5, 1137),\n" +
            "(1140, 'NAICS', 44421, 'Outdoor Power Equipment Stores', 4, 1138),\n" +
            "(1142, 'NAICS', 44422, 'Nursery, Garden Center, and Farm Supply Stores', 4, 1138),\n" +
            "(1139, 'NAICS', 444210, 'Outdoor Power Equipment Stores', 5, 1140),\n" +
            "(1141, 'NAICS', 444220, 'Nursery, Garden Center, and Farm Supply Stores', 5, 1142),\n" +
            "(1149, 'NAICS', 4452, 'Specialty Food Stores', 3, 1143),\n" +
            "(1160, 'NAICS', 4453, 'Beer, Wine, and Liquor Stores', 3, 1143),\n" +
            "(1148, 'NAICS', 44512, 'Convenience Stores', 4, 1144),\n" +
            "(1146, 'NAICS', 44511, 'Supermarkets and Other Grocery (except Convenience) Stores', 4, 1144),\n" +
            "(1145, 'NAICS', 445110, 'Supermarkets and Other Grocery (except Convenience) Stores', 5, 1146),\n" +
            "(1147, 'NAICS', 445120, 'Convenience Stores', 5, 1148),\n" +
            "(1153, 'NAICS', 44522, 'Fish and Seafood Markets', 4, 1149),\n" +
            "(1156, 'NAICS', 44529, 'Other Specialty Food Stores', 4, 1149),\n" +
            "(1150, 'NAICS', 445210, 'Meat Markets', 5, 1151),\n" +
            "(1152, 'NAICS', 445220, 'Fish and Seafood Markets', 5, 1153),\n" +
            "(1154, 'NAICS', 445230, 'Fruit and Vegetable Markets', 5, 1155),\n" +
            "(1158, 'NAICS', 445292, 'Confectionery and Nut Stores', 5, 1156),\n" +
            "(1159, 'NAICS', 445299, 'All Other Specialty Food Stores', 5, 1156),\n" +
            "(1162, 'NAICS', 44531, 'Beer, Wine, and Liquor Stores', 4, 1160),\n" +
            "(1161, 'NAICS', 445310, 'Beer, Wine, and Liquor Stores', 5, 1162),\n" +
            "(1164, 'NAICS', 4461, 'Health and Personal Care Stores', 3, 1163),\n" +
            "(1171, 'NAICS', 44619, 'Other Health and Personal Care Stores', 4, 1164),\n" +
            "(1166, 'NAICS', 44611, 'Pharmacies and Drug Stores', 4, 1164),\n" +
            "(1168, 'NAICS', 44612, 'Cosmetics, Beauty Supplies, and Perfume Stores', 4, 1164),\n" +
            "(1170, 'NAICS', 44613, 'Optical Goods Stores', 4, 1164),\n" +
            "(1165, 'NAICS', 446110, 'Pharmacies and Drug Stores', 5, 1166),\n" +
            "(1167, 'NAICS', 446120, 'Cosmetics, Beauty Supplies, and Perfume Stores', 5, 1168),\n" +
            "(1169, 'NAICS', 446130, 'Optical Goods Stores', 5, 1170),\n" +
            "(1173, 'NAICS', 446199, 'All Other Health and Personal Care Stores', 5, 1171),\n" +
            "(1172, 'NAICS', 446191, 'Food (Health) Supplement Stores', 5, 1171),\n" +
            "(1175, 'NAICS', 4471, 'Gasoline Stations', 3, 1174),\n" +
            "(1179, 'NAICS', 44719, 'Other Gasoline Stations', 4, 1175),\n" +
            "(1177, 'NAICS', 44711, 'Gasoline Stations with Convenience Stores', 4, 1175),\n" +
            "(1176, 'NAICS', 447110, 'Gasoline Stations with Convenience Stores', 5, 1177),\n" +
            "(1178, 'NAICS', 447190, 'Other Gasoline Stations', 5, 1179),\n" +
            "(1181, 'NAICS', 4481, 'Clothing Stores', 3, 1180),\n" +
            "(1197, 'NAICS', 4483, 'Jewelry, Luggage, and Leather Goods Stores', 3, 1180),\n" +
            "(1189, 'NAICS', 44814, 'Family Clothing Stores', 4, 1181),\n" +
            "(1187, 'NAICS', 44813, 'Children''s and Infants'' Clothing Stores', 4, 1181),\n" +
            "(1185, 'NAICS', 44812, 'Women''s Clothing Stores', 4, 1181),\n" +
            "(1183, 'NAICS', 44811, 'Men''s Clothing Stores', 4, 1181),\n" +
            "(1193, 'NAICS', 44819, 'Other Clothing Stores', 4, 1181),\n" +
            "(1191, 'NAICS', 44815, 'Clothing Accessories Stores', 4, 1181),\n" +
            "(1182, 'NAICS', 448110, 'Men''s Clothing Stores', 5, 1183),\n" +
            "(1184, 'NAICS', 448120, 'Women''s Clothing Stores', 5, 1185),\n" +
            "(1186, 'NAICS', 448130, 'Children''s and Infants'' Clothing Stores', 5, 1187),\n" +
            "(1188, 'NAICS', 448140, 'Family Clothing Stores', 5, 1189),\n" +
            "(1190, 'NAICS', 448150, 'Clothing Accessories Stores', 5, 1191),\n" +
            "(1192, 'NAICS', 448190, 'Other Clothing Stores', 5, 1193),\n" +
            "(1196, 'NAICS', 44821, 'Shoe Stores', 4, 1194),\n" +
            "(1195, 'NAICS', 448210, 'Shoe Stores', 5, 1196),\n" +
            "(1199, 'NAICS', 44831, 'Jewelry Stores', 4, 1197),\n" +
            "(1201, 'NAICS', 44832, 'Luggage and Leather Goods Stores', 4, 1197),\n" +
            "(1198, 'NAICS', 448310, 'Jewelry Stores', 5, 1199),\n" +
            "(1200, 'NAICS', 448320, 'Luggage and Leather Goods Stores', 5, 1201),\n" +
            "(1203, 'NAICS', 4511, 'Sporting Goods, Hobby, and Musical Instrument Stores', 3, 1202),\n" +
            "(1212, 'NAICS', 4512, 'Book Stores and News Dealers', 3, 1202),\n" +
            "(1205, 'NAICS', 45111, 'Sporting Goods Stores', 4, 1203),\n" +
            "(1207, 'NAICS', 45112, 'Hobby, Toy, and Game Stores', 4, 1203),\n" +
            "(1209, 'NAICS', 45113, 'Sewing, Needlework, and Piece Goods Stores', 4, 1203),\n" +
            "(1211, 'NAICS', 45114, 'Musical Instrument and Supplies Stores', 4, 1203),\n" +
            "(1204, 'NAICS', 451110, 'Sporting Goods Stores', 5, 1205),\n" +
            "(1206, 'NAICS', 451120, 'Hobby, Toy, and Game Stores', 5, 1207),\n" +
            "(1208, 'NAICS', 451130, 'Sewing, Needlework, and Piece Goods Stores', 5, 1209),\n" +
            "(1210, 'NAICS', 451140, 'Musical Instrument and Supplies Stores', 5, 1211),\n" +
            "(1213, 'NAICS', 45121, 'Book Stores and News Dealers', 4, 1212),\n" +
            "(1214, 'NAICS', 451211, 'Book Stores', 5, 1213),\n" +
            "(1215, 'NAICS', 451212, 'News Dealers and Newsstands', 5, 1213),\n" +
            "(1217, 'NAICS', 4521, 'Department Stores', 3, 1216),\n" +
            "(1221, 'NAICS', 4529, 'Other General Merchandise Stores', 3, 1216),\n" +
            "(1218, 'NAICS', 45211, 'Department Stores', 4, 1217),\n" +
            "(1220, 'NAICS', 452112, 'Discount Department Stores', 5, 1218),\n" +
            "(1219, 'NAICS', 452111, 'Department Stores (except Discount Department Stores)', 5, 1218),\n" +
            "(1223, 'NAICS', 45291, 'Warehouse Clubs and Supercenters', 4, 1221),\n" +
            "(1225, 'NAICS', 45299, 'All Other General Merchandise Stores', 4, 1221),\n" +
            "(1222, 'NAICS', 452910, 'Warehouse Clubs and Supercenters', 5, 1223),\n" +
            "(1224, 'NAICS', 452990, 'All Other General Merchandise Stores', 5, 1225),\n" +
            "(1230, 'NAICS', 4532, 'Office Supplies, Stationery, and Gift Stores', 3, 1226),\n" +
            "(1235, 'NAICS', 4533, 'Used Merchandise Stores', 3, 1226),\n" +
            "(1227, 'NAICS', 4531, 'Florists', 3, 1226),\n" +
            "(1238, 'NAICS', 4539, 'Other Miscellaneous Store Retailers', 3, 1226),\n" +
            "(1229, 'NAICS', 45311, 'Florists', 4, 1227),\n" +
            "(1228, 'NAICS', 453110, 'Florists', 5, 1229),\n" +
            "(1232, 'NAICS', 45321, 'Office Supplies and Stationery Stores', 4, 1230),\n" +
            "(1234, 'NAICS', 45322, 'Gift, Novelty, and Souvenir Stores', 4, 1230),\n" +
            "(1231, 'NAICS', 453210, 'Office Supplies and Stationery Stores', 5, 1232),\n" +
            "(1233, 'NAICS', 453220, 'Gift, Novelty, and Souvenir Stores', 5, 1234),\n" +
            "(1237, 'NAICS', 45331, 'Used Merchandise Stores', 4, 1235),\n" +
            "(1236, 'NAICS', 453310, 'Used Merchandise Stores', 5, 1237),\n" +
            "(1244, 'NAICS', 45393, 'Manufactured (Mobile) Home Dealers', 4, 1238),\n" +
            "(1240, 'NAICS', 45391, 'Pet and Pet Supplies Stores', 4, 1238),\n" +
            "(1242, 'NAICS', 45392, 'Art Dealers', 4, 1238),\n" +
            "(1245, 'NAICS', 45399, 'All Other Miscellaneous Store Retailers', 4, 1238),\n" +
            "(1239, 'NAICS', 453910, 'Pet and Pet Supplies Stores', 5, 1240),\n" +
            "(1241, 'NAICS', 453920, 'Art Dealers', 5, 1242),\n" +
            "(1243, 'NAICS', 453930, 'Manufactured (Mobile) Home Dealers', 5, 1244),\n" +
            "(1247, 'NAICS', 453998, 'All Other Miscellaneous Store Retailers (except Tobacco Stores)', 5, 1245),\n" +
            "(1254, 'NAICS', 4542, 'Vending Machine Operators', 3, 1248),\n" +
            "(1257, 'NAICS', 4543, 'Direct Selling Establishments', 3, 1248),\n" +
            "(1249, 'NAICS', 4541, 'Electronic Shopping and Mail-Order Houses', 3, 1248),\n" +
            "(1250, 'NAICS', 45411, 'Electronic Shopping and Mail-Order Houses', 4, 1249),\n" +
            "(1251, 'NAICS', 454111, 'Electronic Shopping', 5, 1250),\n" +
            "(1252, 'NAICS', 454112, 'Electronic Auctions', 5, 1250),\n" +
            "(1253, 'NAICS', 454113, 'Mail-Order Houses', 5, 1250),\n" +
            "(1256, 'NAICS', 45421, 'Vending Machine Operators', 4, 1254),\n" +
            "(1255, 'NAICS', 454210, 'Vending Machine Operators', 5, 1256),\n" +
            "(1259, 'NAICS', 45431, 'Fuel Dealers', 4, 1257),\n" +
            "(1261, 'NAICS', 45439, 'Other Direct Selling Establishments', 4, 1257),\n" +
            "(1258, 'NAICS', 454310, 'Fuel Dealers', 5, 1259),\n" +
            "(1260, 'NAICS', 454390, 'Other Direct Selling Establishments', 5, 1261),\n" +
            "(1303, 'NAICS', 485, 'Transit and Ground Passenger Transportation', 2, 1262),\n" +
            "(1381, 'NAICS', 491, 'Postal Service', 2, 1262),\n" +
            "(1263, 'NAICS', 481, 'Air Transportation', 2, 1262),\n" +
            "(1328, 'NAICS', 486, 'Pipeline Transportation', 2, 1262),\n" +
            "(1340, 'NAICS', 487, 'Scenic and Sightseeing Transportation', 2, 1262),\n" +
            "(1350, 'NAICS', 488, 'Support Activities for Transportation', 2, 1262),\n" +
            "(1392, 'NAICS', 493, 'Warehoand Storage', 2, 1262),\n" +
            "(1278, 'NAICS', 483, 'Water Transportation', 2, 1262),\n" +
            "(1385, 'NAICS', 492, 'Couriers and Messengers', 2, 1262),\n" +
            "(1289, 'NAICS', 484, 'Truck Transportation', 2, 1262),\n" +
            "(1268, 'NAICS', 4812, 'Nonscheduled Air Transportation', 3, 1263),\n" +
            "(1264, 'NAICS', 4811, 'Scheduled Air Transportation', 3, 1263),\n" +
            "(1265, 'NAICS', 48111, 'Scheduled Air Transportation', 4, 1264),\n" +
            "(1266, 'NAICS', 481111, 'Scheduled Passenger Air Transportation', 5, 1265),\n" +
            "(1267, 'NAICS', 481112, 'Scheduled Freight Air Transportation', 5, 1265),\n" +
            "(1269, 'NAICS', 48121, 'Nonscheduled Air Transportation', 4, 1268),\n" +
            "(1270, 'NAICS', 481211, 'Nonscheduled Chartered Passenger Air Transportation', 5, 1269),\n" +
            "(1271, 'NAICS', 481212, 'Nonscheduled Chartered Freight Air Transportation', 5, 1269),\n" +
            "(1272, 'NAICS', 481219, 'Other Nonscheduled Air Transportation', 5, 1269),\n" +
            "(1274, 'NAICS', 4821, 'Rail Transportation', 3, 1273),\n" +
            "(1275, 'NAICS', 48211, 'Rail Transportation', 4, 1274),\n" +
            "(1276, 'NAICS', 482111, 'Line-Haul Railroads', 5, 1275),\n" +
            "(1277, 'NAICS', 482112, 'Short Line Railroads', 5, 1275),\n" +
            "(1279, 'NAICS', 4831, 'Deep Sea, Coastal, and Great Lakes Water Transportation', 3, 1278),\n" +
            "(1285, 'NAICS', 4832, 'Inland Water Transportation', 3, 1278),\n" +
            "(1280, 'NAICS', 48311, 'Deep Sea, Coastal, and Great Lakes Water Transportation', 4, 1279),\n" +
            "(1283, 'NAICS', 483113, 'Coastal and Great Lakes Freight Transportation', 5, 1280),\n" +
            "(1282, 'NAICS', 483112, 'Deep Sea Passenger Transportation', 5, 1280),\n" +
            "(1284, 'NAICS', 483114, 'Coastal and Great Lakes Passenger Transportation', 5, 1280),\n" +
            "(1281, 'NAICS', 483111, 'Deep Sea Freight Transportation', 5, 1280),\n" +
            "(1286, 'NAICS', 48321, 'Inland Water Transportation', 4, 1285),\n" +
            "(1288, 'NAICS', 483212, 'Inland Water Passenger Transportation', 5, 1286),\n" +
            "(1287, 'NAICS', 483211, 'Inland Water Freight Transportation', 5, 1286),\n" +
            "(1296, 'NAICS', 4842, 'Specialized Freight Trucking', 3, 1289),\n" +
            "(1290, 'NAICS', 4841, 'General Freight Trucking', 3, 1289),\n" +
            "(1293, 'NAICS', 48412, 'General Freight Trucking, Long-Distance', 4, 1290),\n" +
            "(1292, 'NAICS', 48411, 'General Freight Trucking, Local', 4, 1290),\n" +
            "(1291, 'NAICS', 484110, 'General Freight Trucking, Local', 5, 1292),\n" +
            "(1295, 'NAICS', 484122, 'General Freight Trucking, Long-Distance, Less Than Truckload', 5, 1293),\n" +
            "(1294, 'NAICS', 484121, 'General Freight Trucking, Long-Distance, Truckload', 5, 1293),\n" +
            "(1298, 'NAICS', 48421, 'Used Household and Office Goods Moving', 4, 1296),\n" +
            "(1300, 'NAICS', 48422, 'Specialized Freight (except Used Goods) Trucking, Local', 4, 1296),\n" +
            "(1302, 'NAICS', 48423, 'Specialized Freight (except Used Goods) Trucking, Long-Distance', 4, 1296),\n" +
            "(1297, 'NAICS', 484210, 'Used Household and Office Goods Moving', 5, 1298),\n" +
            "(1299, 'NAICS', 484220, 'Specialized Freight (except Used Goods) Trucking, Local', 5, 1300),\n" +
            "(1301, 'NAICS', 484230, 'Specialized Freight (except Used Goods) Trucking, Long-Distance', 5, 1302),\n" +
            "(1310, 'NAICS', 4852, 'Interurban and Rural Bus Transportation', 3, 1303),\n" +
            "(1304, 'NAICS', 4851, 'Urban Transit Systems', 3, 1303),\n" +
            "(1517, 'NAICS', 523120, 'Securities Brokerage', 5, 1518),\n" +
            "(1324, 'NAICS', 4859, 'Other Transit and Ground Passenger Transportation', 3, 1303),\n" +
            "(1313, 'NAICS', 4853, 'Taxi and Limousine Service', 3, 1303),\n" +
            "(1318, 'NAICS', 4854, 'School and Employee Bus Transportation', 3, 1303),\n" +
            "(1305, 'NAICS', 48511, 'Urban Transit Systems', 4, 1304),\n" +
            "(1308, 'NAICS', 485113, 'Bus and Other Motor Vehicle Transit Systems', 5, 1305),\n" +
            "(1309, 'NAICS', 485119, 'Other Urban Transit Systems', 5, 1305),\n" +
            "(1306, 'NAICS', 485111, 'Mixed Mode Transit Systems', 5, 1305),\n" +
            "(1307, 'NAICS', 485112, 'Commuter Rail Systems', 5, 1305),\n" +
            "(1312, 'NAICS', 48521, 'Interurban and Rural Bus Transportation', 4, 1310),\n" +
            "(1311, 'NAICS', 485210, 'Interurban and Rural Bus Transportation', 5, 1312),\n" +
            "(1315, 'NAICS', 48531, 'Taxi Service', 4, 1313),\n" +
            "(1317, 'NAICS', 48532, 'Limousine Service', 4, 1313),\n" +
            "(1314, 'NAICS', 485310, 'Taxi Service', 5, 1315),\n" +
            "(1316, 'NAICS', 485320, 'Limousine Service', 5, 1317),\n" +
            "(1320, 'NAICS', 48541, 'School and Employee Bus Transportation', 4, 1318),\n" +
            "(1319, 'NAICS', 485410, 'School and Employee Bus Transportation', 5, 1320),\n" +
            "(1323, 'NAICS', 48551, 'Charter Bus Industry', 4, 1321),\n" +
            "(1322, 'NAICS', 485510, 'Charter Bus Industry', 5, 1323),\n" +
            "(1325, 'NAICS', 48599, 'Other Transit and Ground Passenger Transportation', 4, 1324),\n" +
            "(1327, 'NAICS', 485999, 'All Other Transit and Ground Passenger Transportation', 5, 1325),\n" +
            "(1326, 'NAICS', 485991, 'Special Needs Transportation', 5, 1325),\n" +
            "(1329, 'NAICS', 4861, 'Pipeline Transportation of Crude Oil', 3, 1328),\n" +
            "(1335, 'NAICS', 4869, 'Other Pipeline Transportation', 3, 1328),\n" +
            "(1332, 'NAICS', 4862, 'Pipeline Transportation of Natural Gas', 3, 1328),\n" +
            "(1331, 'NAICS', 48611, 'Pipeline Transportation of Crude Oil', 4, 1329),\n" +
            "(1330, 'NAICS', 486110, 'Pipeline Transportation of Crude Oil', 5, 1331),\n" +
            "(1334, 'NAICS', 48621, 'Pipeline Transportation of Natural Gas', 4, 1332),\n" +
            "(1333, 'NAICS', 486210, 'Pipeline Transportation of Natural Gas', 5, 1334),\n" +
            "(1337, 'NAICS', 48691, 'Pipeline Transportation of Refined Petroleum Products', 4, 1335),\n" +
            "(1339, 'NAICS', 48699, 'All Other Pipeline Transportation', 4, 1335),\n" +
            "(1336, 'NAICS', 486910, 'Pipeline Transportation of Refined Petroleum Products', 5, 1337),\n" +
            "(1338, 'NAICS', 486990, 'All Other Pipeline Transportation', 5, 1339),\n" +
            "(1344, 'NAICS', 4872, 'Scenic and Sightseeing Transportation, Water', 3, 1340),\n" +
            "(1347, 'NAICS', 4879, 'Scenic and Sightseeing Transportation, Other', 3, 1340),\n" +
            "(1341, 'NAICS', 4871, 'Scenic and Sightseeing Transportation, Land', 3, 1340),\n" +
            "(1343, 'NAICS', 48711, 'Scenic and Sightseeing Transportation, Land', 4, 1341),\n" +
            "(1342, 'NAICS', 487110, 'Scenic and Sightseeing Transportation, Land', 5, 1343),\n" +
            "(1346, 'NAICS', 48721, 'Scenic and Sightseeing Transportation, Water', 4, 1344),\n" +
            "(1345, 'NAICS', 487210, 'Scenic and Sightseeing Transportation, Water', 5, 1346),\n" +
            "(1349, 'NAICS', 48799, 'Scenic and Sightseeing Transportation, Other', 4, 1347),\n" +
            "(1348, 'NAICS', 487990, 'Scenic and Sightseeing Transportation, Other', 5, 1349),\n" +
            "(1377, 'NAICS', 4889, 'Other Support Activities for Transportation', 3, 1350),\n" +
            "(1351, 'NAICS', 4881, 'Support Activities for Air Transportation', 3, 1350),\n" +
            "(1357, 'NAICS', 4882, 'Support Activities for Rail Transportation', 3, 1350),\n" +
            "(1360, 'NAICS', 4883, 'Support Activities for Water Transportation', 3, 1350),\n" +
            "(1369, 'NAICS', 4884, 'Support Activities for Road Transportation', 3, 1350),\n" +
            "(1374, 'NAICS', 4885, 'Freight Transportation Arrangement', 3, 1350),\n" +
            "(1352, 'NAICS', 48811, 'Airport Operations', 4, 1351),\n" +
            "(1356, 'NAICS', 48819, 'Other Support Activities for Air Transportation', 4, 1351),\n" +
            "(1353, 'NAICS', 488111, 'Air Traffic Control', 5, 1352),\n" +
            "(1354, 'NAICS', 488119, 'Other Airport Operations', 5, 1352),\n" +
            "(1355, 'NAICS', 488190, 'Other Support Activities for Air Transportation', 5, 1356),\n" +
            "(1359, 'NAICS', 48821, 'Support Activities for Rail Transportation', 4, 1357),\n" +
            "(1358, 'NAICS', 488210, 'Support Activities for Rail Transportation', 5, 1359),\n" +
            "(1362, 'NAICS', 48831, 'Port and Harbor Operations', 4, 1360),\n" +
            "(1366, 'NAICS', 48833, 'Navigational Services to Shipping', 4, 1360),\n" +
            "(1368, 'NAICS', 48839, 'Other Support Activities for Water Transportation', 4, 1360),\n" +
            "(1364, 'NAICS', 48832, 'Marine Cargo Handling', 4, 1360),\n" +
            "(1361, 'NAICS', 488310, 'Port and Harbor Operations', 5, 1362),\n" +
            "(1363, 'NAICS', 488320, 'Marine Cargo Handling', 5, 1364),\n" +
            "(1365, 'NAICS', 488330, 'Navigational Services to Shipping', 5, 1366),\n" +
            "(1367, 'NAICS', 488390, 'Other Support Activities for Water Transportation', 5, 1368),\n" +
            "(1373, 'NAICS', 48849, 'Other Support Activities for Road Transportation', 4, 1369),\n" +
            "(1371, 'NAICS', 48841, 'Motor Vehicle Towing', 4, 1369),\n" +
            "(1370, 'NAICS', 488410, 'Motor Vehicle Towing', 5, 1371),\n" +
            "(1372, 'NAICS', 488490, 'Other Support Activities for Road Transportation', 5, 1373),\n" +
            "(1376, 'NAICS', 48851, 'Freight Transportation Arrangement', 4, 1374),\n" +
            "(1375, 'NAICS', 488510, 'Freight Transportation Arrangement', 5, 1376),\n" +
            "(1378, 'NAICS', 48899, 'Other Support Activities for Transportation', 4, 1377),\n" +
            "(1379, 'NAICS', 488991, 'Packing and Crating', 5, 1378),\n" +
            "(1380, 'NAICS', 488999, 'All Other Support Activities for Transportation', 5, 1378),\n" +
            "(1382, 'NAICS', 4911, 'Postal Service', 3, 1381),\n" +
            "(1384, 'NAICS', 49111, 'Postal Service', 4, 1382),\n" +
            "(1383, 'NAICS', 491110, 'Postal Service', 5, 1384),\n" +
            "(1386, 'NAICS', 4921, 'Couriers and Express Delivery Services', 3, 1385),\n" +
            "(1389, 'NAICS', 4922, 'Local Messengers and Local Delivery', 3, 1385),\n" +
            "(1388, 'NAICS', 49211, 'Couriers and Express Delivery Services', 4, 1386),\n" +
            "(1387, 'NAICS', 492110, 'Couriers and Express Delivery Services', 5, 1388),\n" +
            "(1391, 'NAICS', 49221, 'Local Messengers and Local Delivery', 4, 1389),\n" +
            "(1390, 'NAICS', 492210, 'Local Messengers and Local Delivery', 5, 1391),\n" +
            "(1393, 'NAICS', 4931, 'Warehoand Storage', 3, 1392),\n" +
            "(1401, 'NAICS', 49319, 'Other Warehoand Storage', 4, 1393),\n" +
            "(1395, 'NAICS', 49311, 'General Warehoand Storage', 4, 1393),\n" +
            "(1397, 'NAICS', 49312, 'Refrigerated Warehoand Storage', 4, 1393),\n" +
            "(1399, 'NAICS', 49313, 'Farm Product Warehoand Storage', 4, 1393),\n" +
            "(1394, 'NAICS', 493110, 'General Warehoand Storage', 5, 1395),\n" +
            "(1396, 'NAICS', 493120, 'Refrigerated Warehoand Storage', 5, 1397),\n" +
            "(1398, 'NAICS', 493130, 'Farm Product Warehoand Storage', 5, 1399),\n" +
            "(1400, 'NAICS', 493190, 'Other Warehoand Storage', 5, 1401),\n" +
            "(1403, 'NAICS', 511, 'Publishing Industries (except Internet)', 2, 1402),\n" +
            "(1442, 'NAICS', 515, 'Broadcasting (except Internet)', 2, 1402),\n" +
            "(1470, 'NAICS', 519, 'Other Information Services', 2, 1402),\n" +
            "(1419, 'NAICS', 512, 'Motion Picture and Sound Recording Industries', 2, 1402),\n" +
            "(1452, 'NAICS', 517, 'Telecommunications', 2, 1402),\n" +
            "(1466, 'NAICS', 518, 'Data Processing, Hosting, and Related Services', 2, 1402),\n" +
            "(1416, 'NAICS', 5112, 'Software Publishers', 3, 1403),\n" +
            "(1404, 'NAICS', 5111, 'Newspaper, Periodical, Book, and Directory Publishers', 3, 1403),\n" +
            "(1412, 'NAICS', 51114, 'Directory and Mailing List Publishers', 4, 1404),\n" +
            "(1413, 'NAICS', 51119, 'Other Publishers', 4, 1404),\n" +
            "(1408, 'NAICS', 51112, 'Periodical Publishers', 4, 1404),\n" +
            "(1410, 'NAICS', 51113, 'Book Publishers', 4, 1404),\n" +
            "(1406, 'NAICS', 51111, 'Newspaper Publishers', 4, 1404),\n" +
            "(1405, 'NAICS', 511110, 'Newspaper Publishers', 5, 1406),\n" +
            "(1407, 'NAICS', 511120, 'Periodical Publishers', 5, 1408),\n" +
            "(1409, 'NAICS', 511130, 'Book Publishers', 5, 1410),\n" +
            "(1411, 'NAICS', 511140, 'Directory and Mailing List Publishers', 5, 1412),\n" +
            "(1414, 'NAICS', 511191, 'Greeting Card Publishers', 5, 1413),\n" +
            "(1415, 'NAICS', 511199, 'All Other Publishers', 5, 1413),\n" +
            "(1418, 'NAICS', 51121, 'Software Publishers', 4, 1416),\n" +
            "(1417, 'NAICS', 511210, 'Software Publishers', 5, 1418),\n" +
            "(1420, 'NAICS', 5121, 'Motion Picture and Video Industries', 3, 1419),\n" +
            "(1431, 'NAICS', 5122, 'Sound Recording Industries', 3, 1419),\n" +
            "(1428, 'NAICS', 51219, 'Postproduction Services and Other Motion Picture and Video Industries', 4, 1420),\n" +
            "(1422, 'NAICS', 51211, 'Motion Picture and Video Production', 4, 1420),\n" +
            "(1424, 'NAICS', 51212, 'Motion Picture and Video Distribution', 4, 1420),\n" +
            "(1425, 'NAICS', 51213, 'Motion Picture and Video Exhibition', 4, 1420),\n" +
            "(1421, 'NAICS', 512110, 'Motion Picture and Video Production', 5, 1422),\n" +
            "(1423, 'NAICS', 512120, 'Motion Picture and Video Distribution', 5, 1424),\n" +
            "(1426, 'NAICS', 512131, 'Motion Picture Theaters (except Drive-Ins)', 5, 1425),\n" +
            "(1427, 'NAICS', 512132, 'Drive-In Motion Picture Theaters', 5, 1425),\n" +
            "(1430, 'NAICS', 512199, 'Other Motion Picture and Video Industries', 5, 1428),\n" +
            "(1429, 'NAICS', 512191, 'Teleproduction and Other Postproduction Services', 5, 1428),\n" +
            "(1441, 'NAICS', 51229, 'Other Sound Recording Industries', 4, 1431),\n" +
            "(1435, 'NAICS', 51222, 'Integrated Record Production/Distribution', 4, 1431),\n" +
            "(1437, 'NAICS', 51223, 'Music Publishers', 4, 1431),\n" +
            "(1433, 'NAICS', 51221, 'Record Production', 4, 1431),\n" +
            "(1439, 'NAICS', 51224, 'Sound Recording Studios', 4, 1431),\n" +
            "(1432, 'NAICS', 512210, 'Record Production', 5, 1433),\n" +
            "(1434, 'NAICS', 512220, 'Integrated Record Production/Distribution', 5, 1435),\n" +
            "(1436, 'NAICS', 512230, 'Music Publishers', 5, 1437),\n" +
            "(1438, 'NAICS', 512240, 'Sound Recording Studios', 5, 1439),\n" +
            "(1440, 'NAICS', 512290, 'Other Sound Recording Industries', 5, 1441),\n" +
            "(1449, 'NAICS', 5152, 'Cable and Other Subscription Programming', 3, 1442),\n" +
            "(1443, 'NAICS', 5151, 'Radio and Television Broadcasting', 3, 1442),\n" +
            "(1444, 'NAICS', 51511, 'Radio Broadcasting', 4, 1443),\n" +
            "(1448, 'NAICS', 51512, 'Television Broadcasting', 4, 1443),\n" +
            "(1445, 'NAICS', 515111, 'Radio Networks', 5, 1444),\n" +
            "(1446, 'NAICS', 515112, 'Radio Stations', 5, 1444),\n" +
            "(1447, 'NAICS', 515120, 'Television Broadcasting', 5, 1448),\n" +
            "(1451, 'NAICS', 51521, 'Cable and Other Subscription Programming', 4, 1449),\n" +
            "(1450, 'NAICS', 515210, 'Cable and Other Subscription Programming', 5, 1451),\n" +
            "(1462, 'NAICS', 5179, 'Other Telecommunications', 3, 1452),\n" +
            "(1456, 'NAICS', 5172, 'Wireless Telecommunications Carriers (except Satellite)', 3, 1452),\n" +
            "(1459, 'NAICS', 5174, 'Satellite Telecommunications', 3, 1452),\n" +
            "(1453, 'NAICS', 5171, 'Wired Telecommunications Carriers', 3, 1452),\n" +
            "(1455, 'NAICS', 51711, 'Wired Telecommunications Carriers', 4, 1453),\n" +
            "(1454, 'NAICS', 517110, 'Wired Telecommunications Carriers', 5, 1455),\n" +
            "(1458, 'NAICS', 51721, 'Wireless Telecommunications Carriers (except Satellite)', 4, 1456),\n" +
            "(1457, 'NAICS', 517210, 'Wireless Telecommunications Carriers (except Satellite)', 5, 1458),\n" +
            "(1461, 'NAICS', 51741, 'Satellite Telecommunications', 4, 1459),\n" +
            "(1460, 'NAICS', 517410, 'Satellite Telecommunications', 5, 1461),\n" +
            "(1463, 'NAICS', 51791, 'Other Telecommunications', 4, 1462),\n" +
            "(1465, 'NAICS', 517919, 'All Other Telecommunications', 5, 1463),\n" +
            "(1464, 'NAICS', 517911, 'Telecommunications Resellers', 5, 1463),\n" +
            "(1467, 'NAICS', 5182, 'Data Processing, Hosting, and Related Services', 3, 1466),\n" +
            "(1469, 'NAICS', 51821, 'Data Processing, Hosting, and Related Services', 4, 1467),\n" +
            "(1468, 'NAICS', 518210, 'Data Processing, Hosting, and Related Services', 5, 1469),\n" +
            "(1471, 'NAICS', 5191, 'Other Information Services', 3, 1470),\n" +
            "(1479, 'NAICS', 51919, 'All Other Information Services', 4, 1471),\n" +
            "(1473, 'NAICS', 51911, 'News Syndicates', 4, 1471),\n" +
            "(1475, 'NAICS', 51912, 'Libraries and Archives', 4, 1471),\n" +
            "(1477, 'NAICS', 51913, 'Internet Publishing and Broadcasting and Web Search Portals', 4, 1471),\n" +
            "(1472, 'NAICS', 519110, 'News Syndicates', 5, 1473),\n" +
            "(1474, 'NAICS', 519120, 'Libraries and Archives', 5, 1475),\n" +
            "(1476, 'NAICS', 519130, 'Internet Publishing and Broadcasting and Web Search Portals', 5, 1477),\n" +
            "(1478, 'NAICS', 519190, 'All Other Information Services', 5, 1479),\n" +
            "(1485, 'NAICS', 522, 'Credit Intermediation and Related Activities', 2, 1480),\n" +
            "(1554, 'NAICS', 525, 'Funds, Trusts, and Other Financial Vehicles', 2, 1480),\n" +
            "(1481, 'NAICS', 521, 'Monetary Authorities-Central Bank', 2, 1480),\n" +
            "(1513, 'NAICS', 523, 'Securities, Commodity Contracts, and Other Financial Investments and Related Activities', 2, 1480),\n" +
            "(1536, 'NAICS', 524, 'Insurance Carriers and Related Activities', 2, 1480),\n" +
            "(1482, 'NAICS', 5211, 'Monetary Authorities-Central Bank', 3, 1481),\n" +
            "(1484, 'NAICS', 52111, 'Monetary Authorities-Central Bank', 4, 1482),\n" +
            "(1483, 'NAICS', 521110, 'Monetary Authorities-Central Bank', 5, 1484),\n" +
            "(1486, 'NAICS', 5221, 'Depository Credit Intermediation', 3, 1485),\n" +
            "(1495, 'NAICS', 5222, 'Nondepository Credit Intermediation', 3, 1485),\n" +
            "(1506, 'NAICS', 5223, 'Activities Related to Credit Intermediation', 3, 1485),\n" +
            "(1488, 'NAICS', 52211, 'Commercial Banking', 4, 1486),\n" +
            "(1492, 'NAICS', 52213, 'Credit Unions', 4, 1486),\n" +
            "(1494, 'NAICS', 52219, 'Other Depository Credit Intermediation', 4, 1486),\n" +
            "(1490, 'NAICS', 52212, 'Savings Institutions', 4, 1486),\n" +
            "(1487, 'NAICS', 522110, 'Commercial Banking', 5, 1488),\n" +
            "(1489, 'NAICS', 522120, 'Savings Institutions', 5, 1490),\n" +
            "(1491, 'NAICS', 522130, 'Credit Unions', 5, 1492),\n" +
            "(1493, 'NAICS', 522190, 'Other Depository Credit Intermediation', 5, 1494),\n" +
            "(1497, 'NAICS', 52221, 'Credit Card Issuing', 4, 1495),\n" +
            "(1499, 'NAICS', 52222, 'Sales Financing', 4, 1495),\n" +
            "(1500, 'NAICS', 52229, 'Other Nondepository Credit Intermediation', 4, 1495),\n" +
            "(1496, 'NAICS', 522210, 'Credit Card Issuing', 5, 1497),\n" +
            "(1498, 'NAICS', 522220, 'Sales Financing', 5, 1499),\n" +
            "(1504, 'NAICS', 522294, 'Secondary Market Financing', 5, 1500),\n" +
            "(1505, 'NAICS', 522298, 'All Other Nondepository Credit Intermediation', 5, 1500),\n" +
            "(1502, 'NAICS', 522292, 'Real Estate Credit', 5, 1500),\n" +
            "(1503, 'NAICS', 522293, 'International Trade Financing', 5, 1500),\n" +
            "(1501, 'NAICS', 522291, 'Consumer Lending', 5, 1500),\n" +
            "(1510, 'NAICS', 52232, 'Financial Transactions Processing, Reserve, and Clearinghouse Activities', 4, 1506),\n" +
            "(1508, 'NAICS', 52231, 'Mortgage and Nonmortgage Loan Brokers', 4, 1506),\n" +
            "(1512, 'NAICS', 52239, 'Other Activities Related to Credit Intermediation', 4, 1506),\n" +
            "(1507, 'NAICS', 522310, 'Mortgage and Nonmortgage Loan Brokers', 5, 1508),\n" +
            "(1509, 'NAICS', 522320, 'Financial Transactions Processing, Reserve, and Clearinghouse Activities', 5, 1510),\n" +
            "(1511, 'NAICS', 522390, 'Other Activities Related to Credit Intermediation', 5, 1512),\n" +
            "(1514, 'NAICS', 5231, 'Securities and Commodity Contracts Intermediation and Brokerage', 3, 1513),\n" +
            "(1526, 'NAICS', 5239, 'Other Financial Investment Activities', 3, 1513),\n" +
            "(1523, 'NAICS', 5232, 'Securities and Commodity Exchanges', 3, 1513),\n" +
            "(1518, 'NAICS', 52312, 'Securities Brokerage', 4, 1514),\n" +
            "(1516, 'NAICS', 52311, 'Investment Banking and Securities Dealing', 4, 1514),\n" +
            "(1520, 'NAICS', 52313, 'Commodity Contracts Dealing', 4, 1514),\n" +
            "(1522, 'NAICS', 52314, 'Commodity Contracts Brokerage', 4, 1514),\n" +
            "(1515, 'NAICS', 523110, 'Investment Banking and Securities Dealing', 5, 1516),\n" +
            "(1519, 'NAICS', 523130, 'Commodity Contracts Dealing', 5, 1520),\n" +
            "(1521, 'NAICS', 523140, 'Commodity Contracts Brokerage', 5, 1522),\n" +
            "(1525, 'NAICS', 52321, 'Securities and Commodity Exchanges', 4, 1523),\n" +
            "(1524, 'NAICS', 523210, 'Securities and Commodity Exchanges', 5, 1525),\n" +
            "(1530, 'NAICS', 52392, 'Portfolio Management', 4, 1526),\n" +
            "(1528, 'NAICS', 52391, 'Miscellaneous Intermediation', 4, 1526),\n" +
            "(1532, 'NAICS', 52393, 'Investment Advice', 4, 1526),\n" +
            "(1533, 'NAICS', 52399, 'All Other Financial Investment Activities', 4, 1526),\n" +
            "(1527, 'NAICS', 523910, 'Miscellaneous Intermediation', 5, 1528),\n" +
            "(1529, 'NAICS', 523920, 'Portfolio Management', 5, 1530),\n" +
            "(1531, 'NAICS', 523930, 'Investment Advice', 5, 1532),\n" +
            "(1535, 'NAICS', 523999, 'Miscellaneous Financial Investment Activities', 5, 1533),\n" +
            "(1534, 'NAICS', 523991, 'Trust, Fiduciary, and Custody Activities', 5, 1533),\n" +
            "(1537, 'NAICS', 5241, 'Insurance Carriers', 3, 1536),\n" +
            "(1547, 'NAICS', 5242, 'Agencies, Brokerages, and Other Insurance Related Activities', 3, 1536),\n" +
            "(1538, 'NAICS', 52411, 'Direct Life, Health, and Medical Insurance Carriers', 4, 1537),\n" +
            "(1546, 'NAICS', 52413, 'Reinsurance Carriers', 4, 1537),\n" +
            "(1541, 'NAICS', 52412, 'Direct Insurance (except Life, Health, and Medical) Carriers', 4, 1537),\n" +
            "(1539, 'NAICS', 524113, 'Direct Life Insurance Carriers', 5, 1538),\n" +
            "(1540, 'NAICS', 524114, 'Direct Health and Medical Insurance Carriers', 5, 1538),\n" +
            "(1920, 'NAICS', 624, 'Social Assistance', 2, 1850),\n" +
            "(1544, 'NAICS', 524128, 'Other Direct Insurance (except Life, Health, and Medical) Carriers', 5, 1541),\n" +
            "(1543, 'NAICS', 524127, 'Direct Title Insurance Carriers', 5, 1541),\n" +
            "(1542, 'NAICS', 524126, 'Direct Property and Casualty Insurance Carriers', 5, 1541),\n" +
            "(1545, 'NAICS', 524130, 'Reinsurance Carriers', 5, 1546),\n" +
            "(1550, 'NAICS', 52429, 'Other Insurance Related Activities', 4, 1547),\n" +
            "(1549, 'NAICS', 52421, 'Insurance Agencies and Brokerages', 4, 1547),\n" +
            "(1548, 'NAICS', 524210, 'Insurance Agencies and Brokerages', 5, 1549),\n" +
            "(1551, 'NAICS', 524291, 'Claims Adjusting', 5, 1550),\n" +
            "(1552, 'NAICS', 524292, 'Third Party Administration of Insurance and Pension Funds', 5, 1550),\n" +
            "(1553, 'NAICS', 524298, 'All Other Insurance Related Activities', 5, 1550),\n" +
            "(1562, 'NAICS', 5259, 'Other Investment Pools and Funds', 3, 1554),\n" +
            "(1555, 'NAICS', 5251, 'Insurance and Employee Benefit Funds', 3, 1554),\n" +
            "(1557, 'NAICS', 52511, 'Pension Funds', 4, 1555),\n" +
            "(1559, 'NAICS', 52512, 'Health and Welfare Funds', 4, 1555),\n" +
            "(1561, 'NAICS', 52519, 'Other Insurance Funds', 4, 1555),\n" +
            "(1556, 'NAICS', 525110, 'Pension Funds', 5, 1557),\n" +
            "(1558, 'NAICS', 525120, 'Health and Welfare Funds', 5, 1559),\n" +
            "(1560, 'NAICS', 525190, 'Other Insurance Funds', 5, 1561),\n" +
            "(1568, 'NAICS', 52599, 'Other Financial Vehicles', 4, 1562),\n" +
            "(1564, 'NAICS', 52591, 'Open-End Investment Funds', 4, 1562),\n" +
            "(1566, 'NAICS', 52592, 'Trusts, Estates, and Agency Accounts', 4, 1562),\n" +
            "(1563, 'NAICS', 525910, 'Open-End Investment Funds', 5, 1564),\n" +
            "(1565, 'NAICS', 525920, 'Trusts, Estates, and Agency Accounts', 5, 1566),\n" +
            "(1567, 'NAICS', 525990, 'Other Financial Vehicles', 5, 1568),\n" +
            "(1620, 'NAICS', 533, 'Lessors of Nonfinancial Intangible Assets (except Copyrighted Works)', 2, 1569),\n" +
            "(1570, 'NAICS', 531, 'Real Estate', 2, 1569),\n" +
            "(1580, 'NAICS', 5312, 'Offices of Real Estate Agents and Brokers', 3, 1570),\n" +
            "(1571, 'NAICS', 5311, 'Lessors of Real Estate', 3, 1570),\n" +
            "(1583, 'NAICS', 5313, 'Activities Related to Real Estate', 3, 1570),\n" +
            "(1575, 'NAICS', 53112, 'Lessors of Nonresidential Buildings (except Miniwarehouses)', 4, 1571),\n" +
            "(1577, 'NAICS', 53113, 'Lessors of Miniwarehouses and Self-Storage Units', 4, 1571),\n" +
            "(1579, 'NAICS', 53119, 'Lessors of Other Real Estate Property', 4, 1571),\n" +
            "(1573, 'NAICS', 53111, 'Lessors of Residential Buildings and Dwellings', 4, 1571),\n" +
            "(1572, 'NAICS', 531110, 'Lessors of Residential Buildings and Dwellings', 5, 1573),\n" +
            "(1574, 'NAICS', 531120, 'Lessors of Nonresidential Buildings (except Miniwarehouses)', 5, 1575),\n" +
            "(1576, 'NAICS', 531130, 'Lessors of Miniwarehouses and Self-Storage Units', 5, 1577),\n" +
            "(1578, 'NAICS', 531190, 'Lessors of Other Real Estate Property', 5, 1579),\n" +
            "(1582, 'NAICS', 53121, 'Offices of Real Estate Agents and Brokers', 4, 1580),\n" +
            "(1581, 'NAICS', 531210, 'Offices of Real Estate Agents and Brokers', 5, 1582),\n" +
            "(1588, 'NAICS', 53132, 'Offices of Real Estate Appraisers', 4, 1583),\n" +
            "(1590, 'NAICS', 53139, 'Other Activities Related to Real Estate', 4, 1583),\n" +
            "(1584, 'NAICS', 53131, 'Real Estate Property Managers', 4, 1583),\n" +
            "(1585, 'NAICS', 531311, 'Residential Property Managers', 5, 1584),\n" +
            "(1586, 'NAICS', 531312, 'Nonresidential Property Managers', 5, 1584),\n" +
            "(1587, 'NAICS', 531320, 'Offices of Real Estate Appraisers', 5, 1588),\n" +
            "(1589, 'NAICS', 531390, 'Other Activities Related to Real Estate', 5, 1590),\n" +
            "(1609, 'NAICS', 5323, 'General Rental Centers', 3, 1591),\n" +
            "(1612, 'NAICS', 5324, 'Commercial and Industrial Machinery and Equipment Rental and Leasing', 3, 1591),\n" +
            "(1592, 'NAICS', 5321, 'Automotive Equipment Rental and Leasing', 3, 1591),\n" +
            "(1598, 'NAICS', 5322, 'Consumer Goods Rental', 3, 1591),\n" +
            "(1597, 'NAICS', 53212, 'Truck, Utility Trailer, and RV (Recreational Vehicle) Rental and Leasing', 4, 1592),\n" +
            "(1593, 'NAICS', 53211, 'Passenger Car Rental and Leasing', 4, 1592),\n" +
            "(1594, 'NAICS', 532111, 'Passenger Car Rental', 5, 1593),\n" +
            "(1595, 'NAICS', 532112, 'Passenger Car Leasing', 5, 1593),\n" +
            "(1596, 'NAICS', 532120, 'Truck, Utility Trailer, and RV (Recreational Vehicle) Rental and Leasing', 5, 1597),\n" +
            "(1604, 'NAICS', 53223, 'Video Tape and Disc Rental', 4, 1598),\n" +
            "(1605, 'NAICS', 53229, 'Other Consumer Goods Rental', 4, 1598),\n" +
            "(1600, 'NAICS', 53221, 'Consumer Electronics and Appliances Rental', 4, 1598),\n" +
            "(1602, 'NAICS', 53222, 'Formal Wear and Costume Rental', 4, 1598),\n" +
            "(1599, 'NAICS', 532210, 'Consumer Electronics and Appliances Rental', 5, 1600),\n" +
            "(1601, 'NAICS', 532220, 'Formal Wear and Costume Rental', 5, 1602),\n" +
            "(1603, 'NAICS', 532230, 'Video Tape and Disc Rental', 5, 1604),\n" +
            "(1608, 'NAICS', 532299, 'All Other Consumer Goods Rental', 5, 1605),\n" +
            "(1607, 'NAICS', 532292, 'Recreational Goods Rental', 5, 1605),\n" +
            "(1606, 'NAICS', 532291, 'Home Health Equipment Rental', 5, 1605),\n" +
            "(1611, 'NAICS', 53231, 'General Rental Centers', 4, 1609),\n" +
            "(1610, 'NAICS', 532310, 'General Rental Centers', 5, 1611),\n" +
            "(1619, 'NAICS', 53249, 'Other Commercial and Industrial Machinery and Equipment Rental and Leasing', 4, 1612),\n" +
            "(1613, 'NAICS', 53241, 'Construction, Transportation, Mining, and Forestry Machinery and Equipment Rental and Leasing', 4, 1612),\n" +
            "(1617, 'NAICS', 53242, 'Office Machinery and Equipment Rental and Leasing', 4, 1612),\n" +
            "(1614, 'NAICS', 532411, 'Commercial Air, Rail, and Water Transportation Equipment Rental and Leasing', 5, 1613),\n" +
            "(1615, 'NAICS', 532412, 'Construction, Mining, and Forestry Machinery and Equipment Rental and Leasing', 5, 1613),\n" +
            "(1616, 'NAICS', 532420, 'Office Machinery and Equipment Rental and Leasing', 5, 1617),\n" +
            "(1618, 'NAICS', 532490, 'Other Commercial and Industrial Machinery and Equipment Rental and Leasing', 5, 1619),\n" +
            "(1621, 'NAICS', 5331, 'Lessors of Nonfinancial Intangible Assets (except Copyrighted Works)', 3, 1620),\n" +
            "(1623, 'NAICS', 53311, 'Lessors of Nonfinancial Intangible Assets (except Copyrighted Works)', 4, 1621),\n" +
            "(1622, 'NAICS', 533110, 'Lessors of Nonfinancial Intangible Assets (except Copyrighted Works)', 5, 1623),\n" +
            "(1625, 'NAICS', 541, 'Professional, Scientific, and Technical Services', 2, 1624),\n" +
            "(1626, 'NAICS', 5411, 'Legal Services', 3, 1625),\n" +
            "(1689, 'NAICS', 5418, 'Advertising, Public Relations, and Related Services', 3, 1625),\n" +
            "(1666, 'NAICS', 5415, 'Computer Systems Design and Related Services', 3, 1625),\n" +
            "(1634, 'NAICS', 5412, 'Accounting, Tax Preparation, Bookkeeping, and Payroll Services', 3, 1625),\n" +
            "(1672, 'NAICS', 5416, 'Management, Scientific, and Technical Consulting Services', 3, 1625),\n" +
            "(1657, 'NAICS', 5414, 'Specialized Design Services', 3, 1625),\n" +
            "(1706, 'NAICS', 5419, 'Other Professional, Scientific, and Technical Services', 3, 1625),\n" +
            "(1683, 'NAICS', 5417, 'Scientific Research and Development Services', 3, 1625);\n";
    static String industryCodeInsert7 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(1640, 'NAICS', 5413, 'Architectural, Engineering, and Related Services', 3, 1625),\n" +
            "(1631, 'NAICS', 54119, 'Other Legal Services', 4, 1626),\n" +
            "(1628, 'NAICS', 54111, 'Offices of Lawyers', 4, 1626),\n" +
            "(1630, 'NAICS', 54112, 'Offices of Notaries', 4, 1626),\n" +
            "(1627, 'NAICS', 541110, 'Offices of Lawyers', 5, 1628),\n" +
            "(1629, 'NAICS', 541120, 'Offices of Notaries', 5, 1630),\n" +
            "(1632, 'NAICS', 541191, 'Title Abstract and Settlement Offices', 5, 1631),\n" +
            "(1633, 'NAICS', 541199, 'All Other Legal Services', 5, 1631),\n" +
            "(1635, 'NAICS', 54121, 'Accounting, Tax Preparation, Bookkeeping, and Payroll Services', 4, 1634),\n" +
            "(1639, 'NAICS', 541219, 'Other Accounting Services', 5, 1635),\n" +
            "(1638, 'NAICS', 541214, 'Payroll Services', 5, 1635),\n" +
            "(1637, 'NAICS', 541213, 'Tax Preparation Services', 5, 1635),\n" +
            "(1636, 'NAICS', 541211, 'Offices of Certified Public Accountants', 5, 1635),\n" +
            "(1656, 'NAICS', 54138, 'Testing Laboratories', 4, 1640),\n" +
            "(1642, 'NAICS', 54131, 'Architectural Services', 4, 1640),\n" +
            "(1644, 'NAICS', 54132, 'Landscape Architectural Services', 4, 1640),\n" +
            "(1646, 'NAICS', 54133, 'Engineering Services', 4, 1640),\n" +
            "(1648, 'NAICS', 54134, 'Drafting Services', 4, 1640),\n" +
            "(1650, 'NAICS', 54135, 'Building Inspection Services', 4, 1640),\n" +
            "(1652, 'NAICS', 54136, 'Geophysical Surveying and Mapping Services', 4, 1640),\n" +
            "(1654, 'NAICS', 54137, 'Surveying and Mapping (except Geophysical) Services', 4, 1640),\n" +
            "(1641, 'NAICS', 541310, 'Architectural Services', 5, 1642),\n" +
            "(1643, 'NAICS', 541320, 'Landscape Architectural Services', 5, 1644),\n" +
            "(1645, 'NAICS', 541330, 'Engineering Services', 5, 1646),\n" +
            "(1647, 'NAICS', 541340, 'Drafting Services', 5, 1648),\n" +
            "(1649, 'NAICS', 541350, 'Building Inspection Services', 5, 1650),\n" +
            "(1651, 'NAICS', 541360, 'Geophysical Surveying and Mapping Services', 5, 1652),\n" +
            "(1653, 'NAICS', 541370, 'Surveying and Mapping (except Geophysical) Services', 5, 1654),\n" +
            "(1655, 'NAICS', 541380, 'Testing Laboratories', 5, 1656),\n" +
            "(1659, 'NAICS', 54141, 'Interior Design Services', 4, 1657),\n" +
            "(1806, 'NAICS', 56291, 'Remediation Services', 4, 1804),\n" +
            "(1665, 'NAICS', 54149, 'Other Specialized Design Services', 4, 1657),\n" +
            "(1661, 'NAICS', 54142, 'Industrial Design Services', 4, 1657),\n" +
            "(1663, 'NAICS', 54143, 'Graphic Design Services', 4, 1657),\n" +
            "(1658, 'NAICS', 541410, 'Interior Design Services', 5, 1659),\n" +
            "(1660, 'NAICS', 541420, 'Industrial Design Services', 5, 1661),\n" +
            "(1662, 'NAICS', 541430, 'Graphic Design Services', 5, 1663),\n" +
            "(1664, 'NAICS', 541490, 'Other Specialized Design Services', 5, 1665),\n" +
            "(1667, 'NAICS', 54151, 'Computer Systems Design and Related Services', 4, 1666),\n" +
            "(1670, 'NAICS', 541513, 'Computer Facilities Management Services', 5, 1667),\n" +
            "(1668, 'NAICS', 541511, 'Custom Computer Programming Services', 5, 1667),\n" +
            "(1669, 'NAICS', 541512, 'Computer Systems Design Services', 5, 1667),\n" +
            "(1671, 'NAICS', 541519, 'Other Computer Related Services', 5, 1667),\n" +
            "(1682, 'NAICS', 54169, 'Other Scientific and Technical Consulting Services', 4, 1672),\n" +
            "(1673, 'NAICS', 54161, 'Management Consulting Services', 4, 1672),\n" +
            "(1680, 'NAICS', 54162, 'Environmental Consulting Services', 4, 1672),\n" +
            "(1678, 'NAICS', 541618, 'Other Management Consulting Services', 5, 1673),\n" +
            "(1676, 'NAICS', 541613, 'Marketing Consulting Services', 5, 1673),\n" +
            "(1677, 'NAICS', 541614, 'Process, Physical Distribution, and Logistics Consulting Services', 5, 1673),\n" +
            "(1675, 'NAICS', 541612, 'Human Resources Consulting Services', 5, 1673),\n" +
            "(1674, 'NAICS', 541611, 'Administrative Management and General Management Consulting Services', 5, 1673),\n" +
            "(1679, 'NAICS', 541620, 'Environmental Consulting Services', 5, 1680),\n" +
            "(1681, 'NAICS', 541690, 'Other Scientific and Technical Consulting Services', 5, 1682),\n" +
            "(1688, 'NAICS', 54172, 'Research and Development in the Social Sciences and Humanities', 4, 1683),\n" +
            "(1684, 'NAICS', 54171, 'Research and Development in the Physical, Engineering, and Life Sciences', 4, 1683),\n" +
            "(1685, 'NAICS', 541711, 'Research and Development in Biotechnology', 5, 1684),\n" +
            "(1686, 'NAICS', 541712, 'Research and Development in the Physical, Engineering, and Life Sciences (except Biotechnology)', 5, 1684),\n" +
            "(1687, 'NAICS', 541720, 'Research and Development in the Social Sciences and Humanities', 5, 1688),\n" +
            "(1703, 'NAICS', 54187, 'Advertising Material Distribution Services', 4, 1689),\n" +
            "(1705, 'NAICS', 54189, 'Other Services Related to Advertising', 4, 1689),\n" +
            "(1691, 'NAICS', 54181, 'Advertising Agencies', 4, 1689),\n" +
            "(1693, 'NAICS', 54182, 'Public Relations Agencies', 4, 1689),\n" +
            "(1695, 'NAICS', 54183, 'Media Buying Agencies', 4, 1689),\n" +
            "(1697, 'NAICS', 54184, 'Media Representatives', 4, 1689),\n" +
            "(1699, 'NAICS', 54185, 'Outdoor Advertising', 4, 1689),\n" +
            "(1701, 'NAICS', 54186, 'Direct Mail Advertising', 4, 1689),\n" +
            "(1690, 'NAICS', 541810, 'Advertising Agencies', 5, 1691),\n" +
            "(1692, 'NAICS', 541820, 'Public Relations Agencies', 5, 1693),\n" +
            "(1694, 'NAICS', 541830, 'Media Buying Agencies', 5, 1695),\n" +
            "(1696, 'NAICS', 541840, 'Media Representatives', 5, 1697),\n" +
            "(1698, 'NAICS', 541850, 'Outdoor Advertising', 5, 1699),\n" +
            "(1700, 'NAICS', 541860, 'Direct Mail Advertising', 5, 1701),\n" +
            "(1702, 'NAICS', 541870, 'Advertising Material Distribution Services', 5, 1703),\n" +
            "(1704, 'NAICS', 541890, 'Other Services Related to Advertising', 5, 1705),\n" +
            "(1717, 'NAICS', 54199, 'All Other Professional, Scientific, and Technical Services', 4, 1706),\n" +
            "(1708, 'NAICS', 54191, 'Marketing Research and Public Opinion Polling', 4, 1706),\n" +
            "(1709, 'NAICS', 54192, 'Photographic Services', 4, 1706),\n" +
            "(1713, 'NAICS', 54193, 'Translation and Interpretation Services', 4, 1706),\n" +
            "(1715, 'NAICS', 54194, 'Veterinary Services', 4, 1706),\n" +
            "(1707, 'NAICS', 541910, 'Marketing Research and Public Opinion Polling', 5, 1708),\n" +
            "(1710, 'NAICS', 541921, 'Photography Studios, Portrait', 5, 1709),\n" +
            "(1711, 'NAICS', 541922, 'Commercial Photography', 5, 1709),\n" +
            "(1712, 'NAICS', 541930, 'Translation and Interpretation Services', 5, 1713),\n" +
            "(1714, 'NAICS', 541940, 'Veterinary Services', 5, 1715),\n" +
            "(1716, 'NAICS', 541990, 'All Other Professional, Scientific, and Technical Services', 5, 1717),\n" +
            "(1719, 'NAICS', 551, 'Management of Companies and Enterprises', 2, 1718),\n" +
            "(1720, 'NAICS', 5511, 'Management of Companies and Enterprises', 3, 1719),\n" +
            "(1721, 'NAICS', 55111, 'Management of Companies and Enterprises', 4, 1720),\n" +
            "(1722, 'NAICS', 551111, 'Offices of Bank Holding Companies', 5, 1721),\n" +
            "(1723, 'NAICS', 551112, 'Offices of Other Holding Companies', 5, 1721),\n" +
            "(1724, 'NAICS', 551114, 'Corporate, Subsidiary, and Regional Managing Offices', 5, 1721),\n" +
            "(1726, 'NAICS', 561, 'Administrative and Support Services', 2, 1725),\n" +
            "(1792, 'NAICS', 562, 'Waste Management and Remediation Services', 2, 1725),\n" +
            "(1766, 'NAICS', 5616, 'Investigation and Security Services', 3, 1726),\n" +
            "(1785, 'NAICS', 5619, 'Other Support Services', 3, 1726),\n" +
            "(1727, 'NAICS', 5611, 'Office Administrative Services', 3, 1726),\n" +
            "(1758, 'NAICS', 5615, 'Travel Arrangement and Reservation Services', 3, 1726),\n" +
            "(1774, 'NAICS', 5617, 'Services to Buildings and Dwellings', 3, 1726),\n" +
            "(1730, 'NAICS', 5612, 'Facilities Support Services', 3, 1726),\n" +
            "(1733, 'NAICS', 5613, 'Employment Services', 3, 1726),\n" +
            "(1741, 'NAICS', 5614, 'Business Support Services', 3, 1726),\n" +
            "(1729, 'NAICS', 56111, 'Office Administrative Services', 4, 1727),\n" +
            "(1728, 'NAICS', 561110, 'Office Administrative Services', 5, 1729),\n" +
            "(1732, 'NAICS', 56121, 'Facilities Support Services', 4, 1730),\n" +
            "(1731, 'NAICS', 561210, 'Facilities Support Services', 5, 1732),\n" +
            "(1734, 'NAICS', 56131, 'Employment Placement Agencies and Executive Search Services', 4, 1733),\n" +
            "(1740, 'NAICS', 56133, 'Professional Employer Organizations', 4, 1733),\n" +
            "(1738, 'NAICS', 56132, 'Temporary Help Services', 4, 1733),\n" +
            "(1736, 'NAICS', 561312, 'Executive Search Services', 5, 1734),\n" +
            "(1735, 'NAICS', 561311, 'Employment Placement Agencies', 5, 1734),\n" +
            "(1737, 'NAICS', 561320, 'Temporary Help Services', 5, 1738),\n" +
            "(1739, 'NAICS', 561330, 'Professional Employer Organizations', 5, 1740),\n" +
            "(1754, 'NAICS', 56149, 'Other Business Support Services', 4, 1741),\n" +
            "(1743, 'NAICS', 56141, 'Document Preparation Services', 4, 1741),\n" +
            "(1744, 'NAICS', 56142, 'Telephone Call Centers', 4, 1741),\n" +
            "(1747, 'NAICS', 56143, 'Business Service Centers', 4, 1741),\n" +
            "(1751, 'NAICS', 56144, 'Collection Agencies', 4, 1741),\n" +
            "(1753, 'NAICS', 56145, 'Credit Bureaus', 4, 1741),\n" +
            "(1742, 'NAICS', 561410, 'Document Preparation Services', 5, 1743),\n" +
            "(1745, 'NAICS', 561421, 'Telephone Answering Services', 5, 1744),\n" +
            "(1746, 'NAICS', 561422, 'Telemarketing Bureaus and Other Contact Centers', 5, 1744),\n" +
            "(1748, 'NAICS', 561431, 'Private Mail Centers', 5, 1747),\n" +
            "(1749, 'NAICS', 561439, 'Other Business Service Centers (including Copy Shops)', 5, 1747),\n" +
            "(1750, 'NAICS', 561440, 'Collection Agencies', 5, 1751),\n" +
            "(1752, 'NAICS', 561450, 'Credit Bureaus', 5, 1753),\n" +
            "(1757, 'NAICS', 561499, 'All Other Business Support Services', 5, 1754),\n" +
            "(1755, 'NAICS', 561491, 'Repossession Services', 5, 1754),\n" +
            "(1756, 'NAICS', 561492, 'Court Reporting and Stenotype Services', 5, 1754),\n" +
            "(1762, 'NAICS', 56152, 'Tour Operators', 4, 1758),\n" +
            "(1760, 'NAICS', 56151, 'Travel Agencies', 4, 1758),\n" +
            "(1763, 'NAICS', 56159, 'Other Travel Arrangement and Reservation Services', 4, 1758),\n" +
            "(1759, 'NAICS', 561510, 'Travel Agencies', 5, 1760),\n" +
            "(1761, 'NAICS', 561520, 'Tour Operators', 5, 1762),\n" +
            "(1765, 'NAICS', 561599, 'All Other Travel Arrangement and Reservation Services', 5, 1763),\n" +
            "(1764, 'NAICS', 561591, 'Convention and Visitors Bureaus', 5, 1763),\n" +
            "(1767, 'NAICS', 56161, 'Investigation, Guard, and Armored Car Services', 4, 1766),\n" +
            "(1771, 'NAICS', 56162, 'Security Systems Services', 4, 1766),\n" +
            "(1770, 'NAICS', 561613, 'Armored Car Services', 5, 1767),\n" +
            "(1768, 'NAICS', 561611, 'Investigation Services', 5, 1767),\n" +
            "(1769, 'NAICS', 561612, 'Security Guards and Patrol Services', 5, 1767),\n" +
            "(1772, 'NAICS', 561621, 'Security Systems Services (except Locksmiths)', 5, 1771),\n" +
            "(1784, 'NAICS', 56179, 'Other Services to Buildings and Dwellings', 4, 1774),\n" +
            "(1776, 'NAICS', 56171, 'Exterminating and Pest Control Services', 4, 1774),\n" +
            "(1778, 'NAICS', 56172, 'Janitorial Services', 4, 1774),\n" +
            "(1780, 'NAICS', 56173, 'Landscaping Services', 4, 1774),\n" +
            "(1782, 'NAICS', 56174, 'Carpet and Upholstery Cleaning Services', 4, 1774),\n" +
            "(1775, 'NAICS', 561710, 'Exterminating and Pest Control Services', 5, 1776),\n" +
            "(1777, 'NAICS', 561720, 'Janitorial Services', 5, 1778),\n" +
            "(1779, 'NAICS', 561730, 'Landscaping Services', 5, 1780),\n" +
            "(1781, 'NAICS', 561740, 'Carpet and Upholstery Cleaning Services', 5, 1782),\n" +
            "(1783, 'NAICS', 561790, 'Other Services to Buildings and Dwellings', 5, 1784),\n" +
            "(1789, 'NAICS', 56192, 'Convention and Trade Show Organizers', 4, 1785),\n" +
            "(1787, 'NAICS', 56191, 'Packaging and Labeling Services', 4, 1785),\n" +
            "(1791, 'NAICS', 56199, 'All Other Support Services', 4, 1785),\n" +
            "(1786, 'NAICS', 561910, 'Packaging and Labeling Services', 5, 1787),\n" +
            "(1788, 'NAICS', 561920, 'Convention and Trade Show Organizers', 5, 1789),\n" +
            "(1790, 'NAICS', 561990, 'All Other Support Services', 5, 1791),\n" +
            "(1804, 'NAICS', 5629, 'Remediation and Other Waste Management Services', 3, 1792),\n" +
            "(1793, 'NAICS', 5621, 'Waste Collection', 3, 1792),\n" +
            "(1798, 'NAICS', 5622, 'Waste Treatment and Disposal', 3, 1792),\n" +
            "(1794, 'NAICS', 56211, 'Waste Collection', 4, 1793),\n" +
            "(1796, 'NAICS', 562112, 'Hazardous Waste Collection', 5, 1794),\n" +
            "(1797, 'NAICS', 562119, 'Other Waste Collection', 5, 1794),\n" +
            "(1795, 'NAICS', 562111, 'Solid Waste Collection', 5, 1794),\n" +
            "(1799, 'NAICS', 56221, 'Waste Treatment and Disposal', 4, 1798),\n" +
            "(1802, 'NAICS', 562213, 'Solid Waste Combustors and Incinerators', 5, 1799),\n" +
            "(1803, 'NAICS', 562219, 'Other Nonhazardous Waste Treatment and Disposal', 5, 1799),\n" +
            "(1801, 'NAICS', 562212, 'Solid Waste Landfill', 5, 1799),\n" +
            "(1800, 'NAICS', 562211, 'Hazardous Waste Treatment and Disposal', 5, 1799),\n" +
            "(1808, 'NAICS', 56292, 'Materials Recovery Facilities', 4, 1804),\n" +
            "(1809, 'NAICS', 56299, 'All Other Waste Management Services', 4, 1804),\n" +
            "(1805, 'NAICS', 562910, 'Remediation Services', 5, 1806),\n" +
            "(1807, 'NAICS', 562920, 'Materials Recovery Facilities', 5, 1808),\n" +
            "(1811, 'NAICS', 562998, 'All Other Miscellaneous Waste Management Services', 5, 1809),\n" +
            "(1810, 'NAICS', 562991, 'Septic Tank and Related Services', 5, 1809),\n" +
            "(1813, 'NAICS', 611, 'Educational Services', 2, 1812),\n" +
            "(1814, 'NAICS', 6111, 'Elementary and Secondary Schools', 3, 1813),\n" +
            "(1817, 'NAICS', 6112, 'Junior Colleges', 3, 1813),\n" +
            "(1820, 'NAICS', 6113, 'Colleges, Universities, and Professional Schools', 3, 1813),\n" +
            "(1823, 'NAICS', 6114, 'Business Schools and Computer and Management Training', 3, 1813),\n" +
            "(1830, 'NAICS', 6115, 'Technical and Trade Schools', 3, 1813),\n" +
            "(1836, 'NAICS', 6116, 'Other Schools and Instruction', 3, 1813),\n" +
            "(1847, 'NAICS', 6117, 'Educational Support Services', 3, 1813),\n" +
            "(1816, 'NAICS', 61111, 'Elementary and Secondary Schools', 4, 1814),\n" +
            "(1815, 'NAICS', 611110, 'Elementary and Secondary Schools', 5, 1816),\n" +
            "(1819, 'NAICS', 61121, 'Junior Colleges', 4, 1817),\n" +
            "(1818, 'NAICS', 611210, 'Junior Colleges', 5, 1819),\n" +
            "(1822, 'NAICS', 61131, 'Colleges, Universities, and Professional Schools', 4, 1820),\n" +
            "(1821, 'NAICS', 611310, 'Colleges, Universities, and Professional Schools', 5, 1822),\n" +
            "(1827, 'NAICS', 61142, 'Computer Training', 4, 1823),\n" +
            "(1829, 'NAICS', 61143, 'Professional and Management Development Training', 4, 1823),\n" +
            "(1825, 'NAICS', 61141, 'Business and Secretarial Schools', 4, 1823),\n" +
            "(1824, 'NAICS', 611410, 'Business and Secretarial Schools', 5, 1825),\n" +
            "(1826, 'NAICS', 611420, 'Computer Training', 5, 1827),\n" +
            "(1828, 'NAICS', 611430, 'Professional and Management Development Training', 5, 1829),\n" +
            "(1831, 'NAICS', 61151, 'Technical and Trade Schools', 4, 1830),\n" +
            "(1835, 'NAICS', 611519, 'Other Technical and Trade Schools', 5, 1831),\n" +
            "(1834, 'NAICS', 611513, 'Apprenticeship Training', 5, 1831),\n" +
            "(1833, 'NAICS', 611512, 'Flight Training', 5, 1831),\n" +
            "(1832, 'NAICS', 611511, 'Cosmetology and Barber Schools', 5, 1831),\n" +
            "(1838, 'NAICS', 61161, 'Fine Arts Schools', 4, 1836),\n" +
            "(1843, 'NAICS', 61169, 'All Other Schools and Instruction', 4, 1836),\n" +
            "(1842, 'NAICS', 61163, 'Language Schools', 4, 1836),\n" +
            "(1840, 'NAICS', 61162, 'Sports and Recreation Instruction', 4, 1836),\n" +
            "(1837, 'NAICS', 611610, 'Fine Arts Schools', 5, 1838),\n" +
            "(1839, 'NAICS', 611620, 'Sports and Recreation Instruction', 5, 1840),\n" +
            "(1841, 'NAICS', 611630, 'Language Schools', 5, 1842),\n" +
            "(1844, 'NAICS', 611691, 'Exam Preparation and Tutoring', 5, 1843),\n" +
            "(1845, 'NAICS', 611692, 'Automobile Driving Schools', 5, 1843),\n" +
            "(1846, 'NAICS', 611699, 'All Other Miscellaneous Schools and Instruction', 5, 1843),\n" +
            "(1849, 'NAICS', 61171, 'Educational Support Services', 4, 1847),\n" +
            "(1848, 'NAICS', 611710, 'Educational Support Services', 5, 1849),\n" +
            "(1894, 'NAICS', 622, 'Hospitals', 2, 1850),\n" +
            "(1851, 'NAICS', 621, 'Ambulatory Health Care Services', 2, 1850),\n" +
            "(1904, 'NAICS', 623, 'Nursing and Residential Care Facilities', 2, 1850),\n" +
            "(1859, 'NAICS', 6213, 'Offices of Other Health Practitioners', 3, 1851),\n" +
            "(1881, 'NAICS', 6215, 'Medical and Diagnostic Laboratories', 3, 1851),\n" +
            "(1856, 'NAICS', 6212, 'Offices of Dentists', 3, 1851),\n" +
            "(1871, 'NAICS', 6214, 'Outpatient Care Centers', 3, 1851),\n" +
            "(1852, 'NAICS', 6211, 'Offices of Physicians', 3, 1851),\n" +
            "(1885, 'NAICS', 6216, 'Home Health Care Services', 3, 1851),\n" +
            "(1888, 'NAICS', 6219, 'Other Ambulatory Health Care Services', 3, 1851),\n" +
            "(1853, 'NAICS', 62111, 'Offices of Physicians', 4, 1852),\n" +
            "(1855, 'NAICS', 621112, 'Offices of Physicians, Mental Health Specialists', 5, 1853),\n" +
            "(1854, 'NAICS', 621111, 'Offices of Physicians (except Mental Health Specialists)', 5, 1853),\n" +
            "(1858, 'NAICS', 62121, 'Offices of Dentists', 4, 1856),\n" +
            "(1857, 'NAICS', 621210, 'Offices of Dentists', 5, 1858),\n" +
            "(1867, 'NAICS', 62134, 'Offices of Physical, Occupational and Speech Therapists, and Audiologists', 4, 1859),\n" +
            "(1861, 'NAICS', 62131, 'Offices of Chiropractors', 4, 1859),\n" +
            "(1863, 'NAICS', 62132, 'Offices of Optometrists', 4, 1859),\n" +
            "(1865, 'NAICS', 62133, 'Offices of Mental Health Practitioners (except Physicians)', 4, 1859),\n" +
            "(1868, 'NAICS', 62139, 'Offices of All Other Health Practitioners', 4, 1859),\n" +
            "(1860, 'NAICS', 621310, 'Offices of Chiropractors', 5, 1861),\n" +
            "(1862, 'NAICS', 621320, 'Offices of Optometrists', 5, 1863),\n" +
            "(1864, 'NAICS', 621330, 'Offices of Mental Health Practitioners (except Physicians)', 5, 1865),\n" +
            "(1866, 'NAICS', 621340, 'Offices of Physical, Occupational and Speech Therapists, and Audiologists', 5, 1867),\n" +
            "(1870, 'NAICS', 621399, 'Offices of All Other Miscellaneous Health Practitioners', 5, 1868),\n" +
            "(1869, 'NAICS', 621391, 'Offices of Podiatrists', 5, 1868),\n" +
            "(1875, 'NAICS', 62142, 'Outpatient Mental Health and Substance Abuse Centers', 4, 1871),\n" +
            "(1876, 'NAICS', 62149, 'Other Outpatient Care Centers', 4, 1871),\n" +
            "(1873, 'NAICS', 62141, 'Family Planning Centers', 4, 1871),\n" +
            "(1872, 'NAICS', 621410, 'Family Planning Centers', 5, 1873),\n" +
            "(1874, 'NAICS', 621420, 'Outpatient Mental Health and Substance Abuse Centers', 5, 1875),\n" +
            "(1878, 'NAICS', 621492, 'Kidney Dialysis Centers', 5, 1876),\n" +
            "(1880, 'NAICS', 621498, 'All Other Outpatient Care Centers', 5, 1876),\n" +
            "(1877, 'NAICS', 621491, 'HMO Medical Centers', 5, 1876),\n" +
            "(1879, 'NAICS', 621493, 'Freestanding Ambulatory Surgical and Emergency Centers', 5, 1876),\n" +
            "(1882, 'NAICS', 62151, 'Medical and Diagnostic Laboratories', 4, 1881),\n" +
            "(1884, 'NAICS', 621512, 'Diagnostic Imaging Centers', 5, 1882),\n" +
            "(1883, 'NAICS', 621511, 'Medical Laboratories', 5, 1882),\n" +
            "(1887, 'NAICS', 62161, 'Home Health Care Services', 4, 1885),\n" +
            "(1886, 'NAICS', 621610, 'Home Health Care Services', 5, 1887),\n" +
            "(1890, 'NAICS', 62191, 'Ambulance Services', 4, 1888),\n" +
            "(1891, 'NAICS', 62199, 'All Other Ambulatory Health Care Services', 4, 1888),\n" +
            "(1889, 'NAICS', 621910, 'Ambulance Services', 5, 1890),\n" +
            "(1892, 'NAICS', 621991, 'Blood and Organ Banks', 5, 1891),\n" +
            "(1893, 'NAICS', 621999, 'All Other Miscellaneous Ambulatory Health Care Services', 5, 1891),\n" +
            "(1901, 'NAICS', 6223, 'Specialty (except Psychiatric and Substance Abuse) Hospitals', 3, 1894),\n" +
            "(1895, 'NAICS', 6221, 'General Medical and Surgical Hospitals', 3, 1894),\n" +
            "(1898, 'NAICS', 6222, 'Psychiatric and Substance Abuse Hospitals', 3, 1894),\n" +
            "(1897, 'NAICS', 62211, 'General Medical and Surgical Hospitals', 4, 1895),\n" +
            "(1896, 'NAICS', 622110, 'General Medical and Surgical Hospitals', 5, 1897),\n" +
            "(1900, 'NAICS', 62221, 'Psychiatric and Substance Abuse Hospitals', 4, 1898),\n" +
            "(1899, 'NAICS', 622210, 'Psychiatric and Substance Abuse Hospitals', 5, 1900),\n" +
            "(1903, 'NAICS', 62231, 'Specialty (except Psychiatric and Substance Abuse) Hospitals', 4, 1901),\n" +
            "(1902, 'NAICS', 622310, 'Specialty (except Psychiatric and Substance Abuse) Hospitals', 5, 1903),\n" +
            "(1913, 'NAICS', 6233, 'Continuing Care Retirement Communities and Assisted Living Facilities for the Elderly', 3, 1904),\n" +
            "(1908, 'NAICS', 6232, 'Residential Intellectual and Developmental Disability, Mental Health, and Substance Abuse Facilities', 3, 1904),\n" +
            "(1905, 'NAICS', 6231, 'Nursing Care Facilities (Skilled Nursing Facilities)', 3, 1904),\n" +
            "(1917, 'NAICS', 6239, 'Other Residential Care Facilities', 3, 1904),\n" +
            "(1907, 'NAICS', 62311, 'Nursing Care Facilities (Skilled Nursing Facilities)', 4, 1905),\n" +
            "(1906, 'NAICS', 623110, 'Nursing Care Facilities (Skilled Nursing Facilities)', 5, 1907),\n" +
            "(1912, 'NAICS', 62322, 'Residential Mental Health and Substance Abuse Facilities', 4, 1908),\n" +
            "(1910, 'NAICS', 62321, 'Residential Intellectual and Developmental Disability Facilities', 4, 1908),\n" +
            "(1909, 'NAICS', 623210, 'Residential Intellectual and Developmental Disability Facilities', 5, 1910),\n" +
            "(1911, 'NAICS', 623220, 'Residential Mental Health and Substance Abuse Facilities', 5, 1912),\n" +
            "(1914, 'NAICS', 62331, 'Continuing Care Retirement Communities and Assisted Living Facilities for the Elderly', 4, 1913),\n" +
            "(1915, 'NAICS', 623311, 'Continuing Care Retirement Communities', 5, 1914),\n" +
            "(1916, 'NAICS', 623312, 'Assisted Living Facilities for the Elderly', 5, 1914),\n" +
            "(1919, 'NAICS', 62399, 'Other Residential Care Facilities', 4, 1917),\n" +
            "(1918, 'NAICS', 623990, 'Other Residential Care Facilities', 5, 1919),\n" +
            "(1928, 'NAICS', 6242, 'Community Food and Housing, and Emergency and Other Relief Services', 3, 1920),\n" +
            "(1921, 'NAICS', 6241, 'Individual and Family Services', 3, 1920),\n" +
            "(1936, 'NAICS', 6243, 'Vocational Rehabilitation Services', 3, 1920),\n" +
            "(1939, 'NAICS', 6244, 'Child Day Care Services', 3, 1920),\n" +
            "(1927, 'NAICS', 62419, 'Other Individual and Family Services', 4, 1921),\n" +
            "(1923, 'NAICS', 62411, 'Child and Youth Services', 4, 1921),\n" +
            "(2004, 'NAICS', 721, 'Accommodation', 2, 2003),\n" +
            "(1925, 'NAICS', 62412, 'Services for the Elderly and Persons with Disabilities', 4, 1921),\n" +
            "(1922, 'NAICS', 624110, 'Child and Youth Services', 5, 1923),\n" +
            "(1924, 'NAICS', 624120, 'Services for the Elderly and Persons with Disabilities', 5, 1925),\n" +
            "(1926, 'NAICS', 624190, 'Other Individual and Family Services', 5, 1927),\n" +
            "(1931, 'NAICS', 62422, 'Community HoServices', 4, 1928),\n" +
            "(1935, 'NAICS', 62423, 'Emergency and Other Relief Services', 4, 1928),\n" +
            "(1930, 'NAICS', 62421, 'Community Food Services', 4, 1928),\n" +
            "(1929, 'NAICS', 624210, 'Community Food Services', 5, 1930),\n" +
            "(1932, 'NAICS', 624221, 'Temporary Shelters', 5, 1931),\n" +
            "(1933, 'NAICS', 624229, 'Other Community HoServices', 5, 1931),\n" +
            "(1934, 'NAICS', 624230, 'Emergency and Other Relief Services', 5, 1935),\n" +
            "(1938, 'NAICS', 62431, 'Vocational Rehabilitation Services', 4, 1936),\n" +
            "(1937, 'NAICS', 624310, 'Vocational Rehabilitation Services', 5, 1938),\n" +
            "(1941, 'NAICS', 62441, 'Child Day Care Services', 4, 1939),\n" +
            "(1940, 'NAICS', 624410, 'Child Day Care Services', 5, 1941),\n" +
            "(1943, 'NAICS', 711, 'Performing Arts, Spectator Sports, and Related Industries', 2, 1942),\n" +
            "(1969, 'NAICS', 712, 'Museums, Historical Sites, and Similar Institutions', 2, 1942),\n" +
            "(1979, 'NAICS', 713, 'Amusement, Gambling, and Recreation Industries', 2, 1942),\n" +
            "(1958, 'NAICS', 7113, 'Promoters of Performing Arts, Sports, and Similar Events', 3, 1943),\n" +
            "(1953, 'NAICS', 7112, 'Spectator Sports', 3, 1943),\n" +
            "(1966, 'NAICS', 7115, 'Independent Artists, Writers, and Performers', 3, 1943),\n" +
            "(1944, 'NAICS', 7111, 'Performing Arts Companies', 3, 1943),\n" +
            "(1963, 'NAICS', 7114, 'Agents and Managers for Artists, Athletes, Entertainers, and Other Public Figures', 3, 1943),\n" +
            "(1948, 'NAICS', 71112, 'Dance Companies', 4, 1944),\n" +
            "(1950, 'NAICS', 71113, 'Musical Groups and Artists', 4, 1944),\n" +
            "(1952, 'NAICS', 71119, 'Other Performing Arts Companies', 4, 1944),\n" +
            "(1946, 'NAICS', 71111, 'Theater Companies and Dinner Theaters', 4, 1944),\n" +
            "(1945, 'NAICS', 711110, 'Theater Companies and Dinner Theaters', 5, 1946),\n" +
            "(1947, 'NAICS', 711120, 'Dance Companies', 5, 1948),\n" +
            "(1949, 'NAICS', 711130, 'Musical Groups and Artists', 5, 1950),\n" +
            "(1951, 'NAICS', 711190, 'Other Performing Arts Companies', 5, 1952),\n" +
            "(1954, 'NAICS', 71121, 'Spectator Sports', 4, 1953),\n" +
            "(1955, 'NAICS', 711211, 'Sports Teams and Clubs', 5, 1954),\n" +
            "(1957, 'NAICS', 711219, 'Other Spectator Sports', 5, 1954),\n" +
            "(1956, 'NAICS', 711212, 'Racetracks', 5, 1954),\n" +
            "(1962, 'NAICS', 71132, 'Promoters of Performing Arts, Sports, and Similar Events without Facilities', 4, 1958),\n" +
            "(1960, 'NAICS', 71131, 'Promoters of Performing Arts, Sports, and Similar Events with Facilities', 4, 1958),\n" +
            "(1959, 'NAICS', 711310, 'Promoters of Performing Arts, Sports, and Similar Events with Facilities', 5, 1960),\n" +
            "(1961, 'NAICS', 711320, 'Promoters of Performing Arts, Sports, and Similar Events without Facilities', 5, 1962),\n" +
            "(1965, 'NAICS', 71141, 'Agents and Managers for Artists, Athletes, Entertainers, and Other Public Figures', 4, 1963),\n" +
            "(1964, 'NAICS', 711410, 'Agents and Managers for Artists, Athletes, Entertainers, and Other Public Figures', 5, 1965),\n" +
            "(1968, 'NAICS', 71151, 'Independent Artists, Writers, and Performers', 4, 1966),\n" +
            "(1967, 'NAICS', 711510, 'Independent Artists, Writers, and Performers', 5, 1968),\n" +
            "(1970, 'NAICS', 7121, 'Museums, Historical Sites, and Similar Institutions', 3, 1969),\n" +
            "(1974, 'NAICS', 71212, 'Historical Sites', 4, 1970),\n" +
            "(1976, 'NAICS', 71213, 'Zoos and Botanical Gardens', 4, 1970),\n" +
            "(1978, 'NAICS', 71219, 'Nature Parks and Other Similar Institutions', 4, 1970),\n" +
            "(1972, 'NAICS', 71211, 'Museums', 4, 1970),\n" +
            "(1971, 'NAICS', 712110, 'Museums', 5, 1972),\n" +
            "(1973, 'NAICS', 712120, 'Historical Sites', 5, 1974),\n" +
            "(1975, 'NAICS', 712130, 'Zoos and Botanical Gardens', 5, 1976),\n" +
            "(1977, 'NAICS', 712190, 'Nature Parks and Other Similar Institutions', 5, 1978),\n" +
            "(1980, 'NAICS', 7131, 'Amusement Parks and Arcades', 3, 1979),\n" +
            "(1985, 'NAICS', 7132, 'Gambling Industries', 3, 1979),\n" +
            "(1990, 'NAICS', 7139, 'Other Amusement and Recreation Industries', 3, 1979),\n" +
            "(1984, 'NAICS', 71312, 'Amusement Arcades', 4, 1980),\n" +
            "(1982, 'NAICS', 71311, 'Amusement and Theme Parks', 4, 1980),\n" +
            "(1981, 'NAICS', 713110, 'Amusement and Theme Parks', 5, 1982),\n" +
            "(1983, 'NAICS', 713120, 'Amusement Arcades', 5, 1984),\n" +
            "(1987, 'NAICS', 71321, 'Casinos (except Casino Hotels)', 4, 1985),\n" +
            "(1989, 'NAICS', 71329, 'Other Gambling Industries', 4, 1985),\n" +
            "(1986, 'NAICS', 713210, 'Casinos (except Casino Hotels)', 5, 1987),\n" +
            "(1988, 'NAICS', 713290, 'Other Gambling Industries', 5, 1989),\n" +
            "(1992, 'NAICS', 71391, 'Golf Courses and Country Clubs', 4, 1990),\n" +
            "(1994, 'NAICS', 71392, 'Skiing Facilities', 4, 1990),\n" +
            "(1996, 'NAICS', 71393, 'Marinas', 4, 1990),\n" +
            "(1998, 'NAICS', 71394, 'Fitness and Recreational Sports Centers', 4, 1990),\n" +
            "(2000, 'NAICS', 71395, 'Bowling Centers', 4, 1990),\n" +
            "(2002, 'NAICS', 71399, 'All Other Amusement and Recreation Industries', 4, 1990),\n" +
            "(1991, 'NAICS', 713910, 'Golf Courses and Country Clubs', 5, 1992),\n" +
            "(1993, 'NAICS', 713920, 'Skiing Facilities', 5, 1994),\n" +
            "(1995, 'NAICS', 713930, 'Marinas', 5, 1996),\n" +
            "(1997, 'NAICS', 713940, 'Fitness and Recreational Sports Centers', 5, 1998),\n" +
            "(1999, 'NAICS', 713950, 'Bowling Centers', 5, 2000),\n" +
            "(2001, 'NAICS', 713990, 'All Other Amusement and Recreation Industries', 5, 2002),\n" +
            "(2020, 'NAICS', 722, 'Food Services and Drinking Places', 2, 2003),\n" +
            "(2005, 'NAICS', 7211, 'Traveler Accommodation', 3, 2004),\n" +
            "(2013, 'NAICS', 7212, 'RV (Recreational Vehicle) Parks and Recreational Camps', 3, 2004),\n" +
            "(2017, 'NAICS', 7213, 'Rooming and Boarding Houses', 3, 2004),\n" +
            "(2010, 'NAICS', 72119, 'Other Traveler Accommodation', 4, 2005),\n" +
            "(2007, 'NAICS', 72111, 'Hotels (except Casino Hotels) and Motels', 4, 2005),\n" +
            "(2009, 'NAICS', 72112, 'Casino Hotels', 4, 2005),\n" +
            "(2006, 'NAICS', 721110, 'Hotels (except Casino Hotels) and Motels', 5, 2007),\n" +
            "(2008, 'NAICS', 721120, 'Casino Hotels', 5, 2009),\n" +
            "(2011, 'NAICS', 721191, 'Bed-and-Breakfast Inns', 5, 2010),\n" +
            "(2012, 'NAICS', 721199, 'All Other Traveler Accommodation', 5, 2010),\n" +
            "(2014, 'NAICS', 72121, 'RV (Recreational Vehicle) Parks and Recreational Camps', 4, 2013),\n" +
            "(2016, 'NAICS', 721214, 'Recreational and Vacation Camps (except Campgrounds)', 5, 2014),\n" +
            "(2015, 'NAICS', 721211, 'RV (Recreational Vehicle) Parks and Campgrounds', 5, 2014),\n" +
            "(2019, 'NAICS', 72131, 'Rooming and Boarding Houses', 4, 2017),\n" +
            "(2018, 'NAICS', 721310, 'Rooming and Boarding Houses', 5, 2019),\n" +
            "(2021, 'NAICS', 7223, 'Special Food Services', 3, 2020),\n" +
            "(2031, 'NAICS', 7225, 'Restaurants and Other Eating Places', 3, 2020),\n" +
            "(2028, 'NAICS', 7224, 'Drinking Places (Alcoholic Beverages)', 3, 2020),\n" +
            "(2023, 'NAICS', 72231, 'Food Service Contractors', 4, 2021),\n" +
            "(2025, 'NAICS', 72232, 'Caterers', 4, 2021),\n" +
            "(2027, 'NAICS', 72233, 'Mobile Food Services', 4, 2021),\n" +
            "(2022, 'NAICS', 722310, 'Food Service Contractors', 5, 2023),\n" +
            "(2024, 'NAICS', 722320, 'Caterers', 5, 2025),\n" +
            "(2026, 'NAICS', 722330, 'Mobile Food Services', 5, 2027),\n" +
            "(2030, 'NAICS', 72241, 'Drinking Places (Alcoholic Beverages)', 4, 2028),\n" +
            "(2029, 'NAICS', 722410, 'Drinking Places (Alcoholic Beverages)', 5, 2030),\n" +
            "(2032, 'NAICS', 72251, 'Restaurants and Other Eating Places', 4, 2031),\n" +
            "(2036, 'NAICS', 722515, 'Snack and Nonalcoholic Beverage Bars', 5, 2032),\n" +
            "(2033, 'NAICS', 722511, 'Full-Service Restaurants', 5, 2032),\n" +
            "(2034, 'NAICS', 722513, 'Limited-Service Restaurants', 5, 2032),\n" +
            "(2035, 'NAICS', 722514, 'Cafeterias, Grill Buffets, and Buffets', 5, 2032),\n" +
            "(2131, 'NAICS', 814, 'Private Households', 2, 2037),\n" +
            "(2103, 'NAICS', 813, 'Religious, Grantmaking, Civic, Professional, and Similar Organizations', 2, 2037),\n" +
            "(2038, 'NAICS', 811, 'Repair and Maintenance', 2, 2037),\n" +
            "(2061, 'NAICS', 8114, 'Personal and Household Goods Repair and Maintenance', 3, 2038),\n" +
            "(2058, 'NAICS', 8113, 'Commercial and Industrial Machinery and Equipment (except Automotive and Electronic) Repair and Maintenance', 3, 2038),\n" +
            "(2052, 'NAICS', 8112, 'Electronic and Precision Equipment Repair and Maintenance', 3, 2038),\n" +
            "(2039, 'NAICS', 8111, 'Automotive Repair and Maintenance', 3, 2038),\n" +
            "(2045, 'NAICS', 81112, 'Automotive Body, Paint, Interior, and Glass Repair', 4, 2039),\n" +
            "(2040, 'NAICS', 81111, 'Automotive Mechanical and Electrical Repair and Maintenance', 4, 2039),\n" +
            "(2048, 'NAICS', 81119, 'Other Automotive Repair and Maintenance', 4, 2039),\n" +
            "(2042, 'NAICS', 811112, 'Automotive Exhaust System Repair', 5, 2040),\n" +
            "(2043, 'NAICS', 811113, 'Automotive Transmission Repair', 5, 2040),\n" +
            "(2041, 'NAICS', 811111, 'General Automotive Repair', 5, 2040),\n" +
            "(2044, 'NAICS', 811118, 'Other Automotive Mechanical and Electrical Repair and Maintenance', 5, 2040),\n" +
            "(2047, 'NAICS', 811122, 'Automotive Glass Replacement Shops', 5, 2045),\n" +
            "(2046, 'NAICS', 811121, 'Automotive Body, Paint, and Interior Repair and Maintenance', 5, 2045),\n" +
            "(2049, 'NAICS', 811191, 'Automotive Oil Change and Lubrication Shops', 5, 2048),\n" +
            "(2050, 'NAICS', 811192, 'Car Washes', 5, 2048),\n" +
            "(2051, 'NAICS', 811198, 'All Other Automotive Repair and Maintenance', 5, 2048),\n" +
            "(2053, 'NAICS', 81121, 'Electronic and Precision Equipment Repair and Maintenance', 4, 2052),\n" +
            "(2057, 'NAICS', 811219, 'Other Electronic and Precision Equipment Repair and Maintenance', 5, 2053),\n" +
            "(2054, 'NAICS', 811211, 'Consumer Electronics Repair and Maintenance', 5, 2053),\n" +
            "(2055, 'NAICS', 811212, 'Computer and Office Machine Repair and Maintenance', 5, 2053),\n" +
            "(2056, 'NAICS', 811213, 'Communication Equipment Repair and Maintenance', 5, 2053),\n" +
            "(2060, 'NAICS', 81131, 'Commercial and Industrial Machinery and Equipment (except Automotive and Electronic) Repair and Maintenance', 4, 2058),\n" +
            "(2059, 'NAICS', 811310, 'Commercial and Industrial Machinery and Equipment (except Automotive and Electronic) Repair and Maintenance', 5, 2060),\n" +
            "(2062, 'NAICS', 81141, 'Home and Garden Equipment and Appliance Repair and Maintenance', 4, 2061),\n" +
            "(2070, 'NAICS', 81149, 'Other Personal and Household Goods Repair and Maintenance', 4, 2061),\n" +
            "(2068, 'NAICS', 81143, 'Footwear and Leather Goods Repair', 4, 2061),\n" +
            "(2066, 'NAICS', 81142, 'Reupholstery and Furniture Repair', 4, 2061),\n" +
            "(2063, 'NAICS', 811411, 'Home and Garden Equipment Repair and Maintenance', 5, 2062),\n" +
            "(2064, 'NAICS', 811412, 'Appliance Repair and Maintenance', 5, 2062),\n" +
            "(2065, 'NAICS', 811420, 'Reupholstery and Furniture Repair', 5, 2066),\n" +
            "(2067, 'NAICS', 811430, 'Footwear and Leather Goods Repair', 5, 2068),\n" +
            "(2069, 'NAICS', 811490, 'Other Personal and Household Goods Repair and Maintenance', 5, 2070),\n" +
            "(2093, 'NAICS', 8129, 'Other Personal Services', 3, 2071),\n" +
            "(2080, 'NAICS', 8122, 'Death Care Services', 3, 2071),\n" +
            "(2072, 'NAICS', 8121, 'Personal Care Services', 3, 2071),\n" +
            "(2085, 'NAICS', 8123, 'Drycleaning and Laundry Services', 3, 2071),\n" +
            "(2077, 'NAICS', 81219, 'Other Personal Care Services', 4, 2072),\n" +
            "(2073, 'NAICS', 81211, 'Hair, Nail, and Skin Care Services', 4, 2072),\n" +
            "(2076, 'NAICS', 812113, 'Nail Salons', 5, 2073),\n" +
            "(2075, 'NAICS', 812112, 'Beauty Salons', 5, 2073),\n" +
            "(2074, 'NAICS', 812111, 'Barber Shops', 5, 2073),\n" +
            "(2078, 'NAICS', 812191, 'Diet and Weight Reducing Centers', 5, 2077),\n" +
            "(2079, 'NAICS', 812199, 'Other Personal Care Services', 5, 2077),\n" +
            "(2082, 'NAICS', 81221, 'Funeral Homes and Funeral Services', 4, 2080),\n" +
            "(2084, 'NAICS', 81222, 'Cemeteries and Crematories', 4, 2080),\n" +
            "(2081, 'NAICS', 812210, 'Funeral Homes and Funeral Services', 5, 2082),\n" +
            "(2083, 'NAICS', 812220, 'Cemeteries and Crematories', 5, 2084),\n" +
            "(2087, 'NAICS', 81231, 'Coin-Operated Laundries and Drycleaners', 4, 2085),\n" +
            "(2090, 'NAICS', 81233, 'Linen and Uniform Supply', 4, 2085),\n" +
            "(2089, 'NAICS', 81232, 'Drycleaning and Laundry Services (except Coin-Operated)', 4, 2085),\n" +
            "(2086, 'NAICS', 812310, 'Coin-Operated Laundries and Drycleaners', 5, 2087),\n" +
            "(2088, 'NAICS', 812320, 'Drycleaning and Laundry Services (except Coin-Operated)', 5, 2089),\n" +
            "(2092, 'NAICS', 812332, 'Industrial Launderers', 5, 2090),\n" +
            "(2091, 'NAICS', 812331, 'Linen Supply', 5, 2090),\n" +
            "(2102, 'NAICS', 81299, 'All Other Personal Services', 4, 2093),\n" +
            "(2100, 'NAICS', 81293, 'Parking Lots and Garages', 4, 2093),\n" +
            "(2096, 'NAICS', 81292, 'Photofinishing', 4, 2093),\n" +
            "(2095, 'NAICS', 81291, 'Pet Care (except Veterinary) Services', 4, 2093),\n" +
            "(2094, 'NAICS', 812910, 'Pet Care (except Veterinary) Services', 5, 2095),\n" +
            "(2098, 'NAICS', 812922, 'One-Hour Photofinishing', 5, 2096),\n" +
            "(2097, 'NAICS', 812921, 'Photofinishing Laboratories (except One-Hour)', 5, 2096),\n" +
            "(2099, 'NAICS', 812930, 'Parking Lots and Garages', 5, 2100),\n" +
            "(2101, 'NAICS', 812990, 'All Other Personal Services', 5, 2102),\n" +
            "(2120, 'NAICS', 8139, 'Business, Professional, Labor, Political, and Similar Organizations', 3, 2103),\n" +
            "(2107, 'NAICS', 8132, 'Grantmaking and Giving Services', 3, 2103),\n" +
            "(2104, 'NAICS', 8131, 'Religious Organizations', 3, 2103),\n" +
            "(2117, 'NAICS', 8134, 'Civic and Social Organizations', 3, 2103),\n" +
            "(2112, 'NAICS', 8133, 'Social Advocacy Organizations', 3, 2103),\n" +
            "(2106, 'NAICS', 81311, 'Religious Organizations', 4, 2104),\n" +
            "(2105, 'NAICS', 813110, 'Religious Organizations', 5, 2106),\n" +
            "(2108, 'NAICS', 81321, 'Grantmaking and Giving Services', 4, 2107),\n" +
            "(2110, 'NAICS', 813212, 'Voluntary Health Organizations', 5, 2108),\n" +
            "(2111, 'NAICS', 813219, 'Other Grantmaking and Giving Services', 5, 2108),\n" +
            "(2109, 'NAICS', 813211, 'Grantmaking Foundations', 5, 2108),\n" +
            "(2113, 'NAICS', 81331, 'Social Advocacy Organizations', 4, 2112),\n" +
            "(2115, 'NAICS', 813312, 'Environment, Conservation and Wildlife Organizations', 5, 2113),\n" +
            "(2114, 'NAICS', 813311, 'Human Rights Organizations', 5, 2113),\n" +
            "(2116, 'NAICS', 813319, 'Other Social Advocacy Organizations', 5, 2113),\n" +
            "(2119, 'NAICS', 81341, 'Civic and Social Organizations', 4, 2117),\n" +
            "(2118, 'NAICS', 813410, 'Civic and Social Organizations', 5, 2119),\n" +
            "(2124, 'NAICS', 81392, 'Professional Organizations', 4, 2120),\n" +
            "(2122, 'NAICS', 81391, 'Business Associations', 4, 2120),\n" +
            "(2130, 'NAICS', 81399, 'Other Similar Organizations (except Business, Professional, Labor, and Political Organizations)', 4, 2120),\n" +
            "(2126, 'NAICS', 81393, 'Labor Unions and Similar Labor Organizations', 4, 2120),\n" +
            "(2128, 'NAICS', 81394, 'Political Organizations', 4, 2120),\n" +
            "(2121, 'NAICS', 813910, 'Business Associations', 5, 2122),\n" +
            "(2123, 'NAICS', 813920, 'Professional Organizations', 5, 2124),\n" +
            "(2125, 'NAICS', 813930, 'Labor Unions and Similar Labor Organizations', 5, 2126),\n" +
            "(2127, 'NAICS', 813940, 'Political Organizations', 5, 2128),\n" +
            "(2129, 'NAICS', 813990, 'Other Similar Organizations (except Business, Professional, Labor, and Political Organizations)', 5, 2130),\n" +
            "(2132, 'NAICS', 8141, 'Private Households', 3, 2131),\n" +
            "(2134, 'NAICS', 81411, 'Private Households', 4, 2132),\n" +
            "(2133, 'NAICS', 814110, 'Private Households', 5, 2134),\n" +
            "(2182, 'NAICS', 925, 'Administration of HoPrograms, Urban Planning, and Community Development', 2, 2135),\n" +
            "(2204, 'NAICS', 928, 'National Security and International Affairs', 2, 2135),\n" +
            "(2200, 'NAICS', 927, 'Space Research and Technology', 2, 2135),\n" +
            "(2188, 'NAICS', 926, 'Administration of Economic Programs', 2, 2135),\n" +
            "(2176, 'NAICS', 924, 'Administration of Environmental Quality Programs', 2, 2135),\n" +
            "(2166, 'NAICS', 923, 'Administration of Human Resource Programs', 2, 2135);\n";
    static String industryCodeInsert8 =  "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(2136, 'NAICS', 921, 'Executive, Legislative, and Other General Government Support', 2, 2135),\n" +
            "(2150, 'NAICS', 922, 'Justice, Public Order, and Safety Activities', 2, 2135),\n" +
            "(2137, 'NAICS', 9211, 'Executive, Legislative, and Other General Government Support', 3, 2136),\n" +
            "(2149, 'NAICS', 92119, 'Other General Government Support', 4, 2137),\n" +
            "(2143, 'NAICS', 92113, 'Public Finance Activities', 4, 2137),\n" +
            "(2147, 'NAICS', 92115, 'American Indian and Alaska Native Tribal Governments', 4, 2137),\n" +
            "(2141, 'NAICS', 92112, 'Legislative Bodies', 4, 2137),\n" +
            "(2145, 'NAICS', 92114, 'Executive and Legislative Offices, Combined', 4, 2137),\n" +
            "(2139, 'NAICS', 92111, 'Executive Offices', 4, 2137),\n" +
            "(2138, 'NAICS', 921110, 'Executive Offices', 5, 2139),\n" +
            "(2140, 'NAICS', 921120, 'Legislative Bodies', 5, 2141),\n" +
            "(2142, 'NAICS', 921130, 'Public Finance Activities', 5, 2143),\n" +
            "(2144, 'NAICS', 921140, 'Executive and Legislative Offices, Combined', 5, 2145),\n" +
            "(2146, 'NAICS', 921150, 'American Indian and Alaska Native Tribal Governments', 5, 2147),\n" +
            "(2148, 'NAICS', 921190, 'Other General Government Support', 5, 2149),\n" +
            "(2476, 'SEC', 3800, 'INSTRUMENTS & RELATED PRODUCTS', 2, 2791),\n" +
            "(2151, 'NAICS', 9221, 'Justice, Public Order, and Safety Activities', 3, 2150),\n" +
            "(2157, 'NAICS', 92213, 'Legal Counsel and Prosecution', 4, 2151),\n" +
            "(2161, 'NAICS', 92215, 'Parole Offices and Probation Offices', 4, 2151),\n" +
            "(2165, 'NAICS', 92219, 'Other Justice, Public Order, and Safety Activities', 4, 2151),\n" +
            "(2153, 'NAICS', 92211, 'Courts', 4, 2151),\n" +
            "(2155, 'NAICS', 92212, 'Police Protection', 4, 2151),\n" +
            "(2159, 'NAICS', 92214, 'Correctional Institutions', 4, 2151),\n" +
            "(2152, 'NAICS', 922110, 'Courts', 5, 2153),\n" +
            "(2154, 'NAICS', 922120, 'Police Protection', 5, 2155),\n" +
            "(2156, 'NAICS', 922130, 'Legal Counsel and Prosecution', 5, 2157),\n" +
            "(2158, 'NAICS', 922140, 'Correctional Institutions', 5, 2159),\n" +
            "(2160, 'NAICS', 922150, 'Parole Offices and Probation Offices', 5, 2161),\n" +
            "(2162, 'NAICS', 922160, 'Fire Protection', 5, 2163),\n" +
            "(2164, 'NAICS', 922190, 'Other Justice, Public Order, and Safety Activities', 5, 2165),\n" +
            "(2167, 'NAICS', 9231, 'Administration of Human Resource Programs', 3, 2166),\n" +
            "(2173, 'NAICS', 92313, 'Administration of Human Resource Programs (except Education, Public Health, and Veterans'' Affairs Programs)', 4, 2167),\n" +
            "(2169, 'NAICS', 92311, 'Administration of Education Programs', 4, 2167),\n" +
            "(2171, 'NAICS', 92312, 'Administration of Public Health Programs', 4, 2167),\n" +
            "(2175, 'NAICS', 92314, 'Administration of Veterans'' Affairs', 4, 2167),\n" +
            "(2168, 'NAICS', 923110, 'Administration of Education Programs', 5, 2169),\n" +
            "(2170, 'NAICS', 923120, 'Administration of Public Health Programs', 5, 2171),\n" +
            "(2172, 'NAICS', 923130, 'Administration of Human Resource Programs (except Education, Public Health, and Veterans'' Affairs Programs)', 5, 2173),\n" +
            "(2174, 'NAICS', 923140, 'Administration of Veterans'' Affairs', 5, 2175),\n" +
            "(2177, 'NAICS', 9241, 'Administration of Environmental Quality Programs', 3, 2176),\n" +
            "(2179, 'NAICS', 92411, 'Administration of Air and Water Resource and Solid Waste Management Programs', 4, 2177),\n" +
            "(2181, 'NAICS', 92412, 'Administration of Conservation Programs', 4, 2177),\n" +
            "(2178, 'NAICS', 924110, 'Administration of Air and Water Resource and Solid Waste Management Programs', 5, 2179),\n" +
            "(2180, 'NAICS', 924120, 'Administration of Conservation Programs', 5, 2181),\n" +
            "(2183, 'NAICS', 9251, 'Administration of HoPrograms, Urban Planning, and Community Development', 3, 2182),\n" +
            "(2185, 'NAICS', 92511, 'Administration of HoPrograms', 4, 2183),\n" +
            "(2187, 'NAICS', 92512, 'Administration of Urban Planning and Community and Rural Development', 4, 2183),\n" +
            "(2184, 'NAICS', 925110, 'Administration of HoPrograms', 5, 2185),\n" +
            "(2186, 'NAICS', 925120, 'Administration of Urban Planning and Community and Rural Development', 5, 2187),\n" +
            "(2189, 'NAICS', 9261, 'Administration of Economic Program', 3, 2188),\n" +
            "(2193, 'NAICS', 92612, 'Regulation and Administration of Transportation Programs', 4, 2189),\n" +
            "(2199, 'NAICS', 92615, 'Regulation, Licensing, and Inspection of Miscellaneous Commercial Sectors', 4, 2189),\n" +
            "(2197, 'NAICS', 92614, 'Regulation of Agricultural Marketing and Commodities', 4, 2189),\n" +
            "(2195, 'NAICS', 92613, 'Regulation and Administration of Communications, Electric, Gas, and Other Utilities', 4, 2189),\n" +
            "(2191, 'NAICS', 92611, 'Administration of General Economic Programs', 4, 2189),\n" +
            "(2190, 'NAICS', 926110, 'Administration of General Economic Programs', 5, 2191),\n" +
            "(2192, 'NAICS', 926120, 'Regulation and Administration of Transportation Programs', 5, 2193),\n" +
            "(2194, 'NAICS', 926130, 'Regulation and Administration of Communications, Electric, Gas, and Other Utilities', 5, 2195),\n" +
            "(2196, 'NAICS', 926140, 'Regulation of Agricultural Marketing and Commodities', 5, 2197),\n" +
            "(2198, 'NAICS', 926150, 'Regulation, Licensing, and Inspection of Miscellaneous Commercial Sectors', 5, 2199),\n" +
            "(2201, 'NAICS', 9271, 'Space Research and Technology', 3, 2200),\n" +
            "(2203, 'NAICS', 92711, 'Space Research and Technology', 4, 2201),\n" +
            "(2202, 'NAICS', 927110, 'Space Research and Technology', 5, 2203),\n" +
            "(2205, 'NAICS', 9281, 'National Security and International Affairs', 3, 2204),\n" +
            "(2209, 'NAICS', 92812, 'International Affairs', 4, 2205),\n" +
            "(2207, 'NAICS', 92811, 'National Security', 4, 2205),\n" +
            "(2206, 'NAICS', 928110, 'National Security', 5, 2207),\n" +
            "(2208, 'NAICS', 928120, 'International Affairs', 5, 2209),\n" +
            "(2228, 'SEC', 1400, 'NONMETALLIC MINERALS, EXCEPT FUELS', 2, 2789),\n" +
            "(2221, 'SEC', 1300, 'OIL & GAS EXTRACTION', 2, 2789),\n" +
            "(2215, 'SEC', 1000, 'METAL MINING', 2, 2789),\n" +
            "(2918, 'SIC', 1400, 'NONMETALLIC MINERALS, EXCEPT FUELS', 2, 4306),\n" +
            "(2884, 'SIC', 1000, 'METAL MINING', 2, 4306),\n" +
            "(2909, 'SIC', 1300, 'OIL & GAS EXTRACTION', 2, 4306),\n" +
            "(2901, 'SIC', 1200, 'COAL MINING', 2, 4306),\n" +
            "(2234, 'SEC', 1600, 'HEAVY CONSTRUCTION, EXCEPT BUILDING', 2, 2790),\n" +
            "(2229, 'SEC', 1500, 'GENERAL BUILDING CONTRACTORS', 2, 2790),\n" +
            "(2237, 'SEC', 1700, 'SPECIAL TRADE CONTRACTORS', 2, 2790),\n" +
            "(2939, 'SIC', 1500, 'GENERAL BUILDING CONTRACTORS', 2, 4307),\n" +
            "(2955, 'SIC', 1700, 'SPECIAL TRADE CONTRACTORS', 2, 4307),\n" +
            "(2948, 'SIC', 1600, 'HEAVY CONSTRUCTION, EXCEPT BUILDING', 2, 4307),\n" +
            "(2302, 'SEC', 2700, 'PRINTING & PUBLISHING', 2, 2791),\n" +
            "(2292, 'SEC', 2600, 'PAPER & ALLIED PRODUCTS', 2, 2791),\n" +
            "(2283, 'SEC', 2500, 'FURNITURE & FIXTURES', 2, 2791),\n" +
            "(2276, 'SEC', 2400, 'LUMBER & WOOD PRODUCTS', 2, 2791),\n" +
            "(2271, 'SEC', 2300, 'APPAREL & OTHER TEXTILE PRODUCTS', 2, 2791),\n" +
            "(2262, 'SEC', 2200, 'TEXTILE MILL PRODUCTS', 2, 2791),\n" +
            "(2259, 'SEC', 2100, 'TOBACCO PRODUCTS', 2, 2791),\n" +
            "(2240, 'SEC', 2000, 'FOOD & KINDRED PRODUCTS', 2, 2791),\n" +
            "(2500, 'SEC', 3900, 'MISCELLANEOUS MANUFACTURING INDUSTRIES', 2, 2791),\n" +
            "(2337, 'SEC', 2900, 'PETROLEUM & COAL PRODUCTS', 2, 2791),\n" +
            "(2342, 'SEC', 3000, 'RUBBER & MISCELLANEOUS PLASTICS PRODUCTS', 2, 2791),\n" +
            "(2353, 'SEC', 3100, 'LEATHER & ALLIED PRODUCTS', 2, 2791),\n" +
            "(2355, 'SEC', 3200, 'STONE, CLAY & GLASS PRODUCTS', 2, 2791),\n" +
            "(2371, 'SEC', 3300, 'PRIMARY METAL INDUSTRIES', 2, 2791),\n" +
            "(2384, 'SEC', 3400, 'FABRICATED METAL PRODUCTS', 2, 2791),\n" +
            "(2403, 'SEC', 3500, 'INDUSTRIAL MACHINERY & EQUIPMENT', 2, 2791),\n" +
            "(2434, 'SEC', 3600, 'ELECTRONIC & OTHER ELECTRIC INDUSTRIES', 2, 2791),\n" +
            "(2458, 'SEC', 3700, 'TRANSPORTATION EQUIPMENT', 2, 2791),\n" +
            "(2319, 'SEC', 2800, 'CHEMICALS & ALLIED PRODUCTS', 2, 2791),\n" +
            "(3190, 'SIC', 2700, 'PRINTING & PUBLISHING', 2, 4308),\n" +
            "(3124, 'SIC', 2400, 'LUMBER & WOOD PRODUCTS', 2, 4308),\n" +
            "(3083, 'SIC', 2300, 'APPAREL & OTHER TEXTILE PRODUCTS', 2, 4308),\n" +
            "(3050, 'SIC', 2200, 'TEXTILE MILL PRODUCTS', 2, 4308),\n" +
            "(3041, 'SIC', 2100, 'TOBACCO PRODUCTS', 2, 4308),\n" +
            "(2982, 'SIC', 2000, 'FOOD & KINDRED PRODUCTS', 2, 4308),\n" +
            "(3526, 'SIC', 3700, 'TRANSPORTATION EQUIPMENT', 2, 4308),\n" +
            "(3282, 'SIC', 3100, 'LEATHER & ALLIED PRODUCTS', 2, 4308),\n" +
            "(3576, 'SIC', 3900, 'MISCELLANEOUS MANUFACTURING INDUSTRIES', 2, 4308),\n" +
            "(3552, 'SIC', 3800, 'INSTRUMENTS & RELATED PRODUCTS', 2, 4308),\n" +
            "(3480, 'SIC', 3600, 'ELECTRONIC & OTHER ELECTRIC INDUSTRIES', 2, 4308),\n" +
            "(3419, 'SIC', 3500, 'INDUSTRIAL MACHINERY & EQUIPMENT', 2, 4308),\n" +
            "(3371, 'SIC', 3400, 'FABRICATED METAL PRODUCTS', 2, 4308),\n" +
            "(3337, 'SIC', 3300, 'PRIMARY METAL INDUSTRIES', 2, 4308),\n" +
            "(3301, 'SIC', 3200, 'STONE, CLAY & GLASS PRODUCTS', 2, 4308),\n" +
            "(3261, 'SIC', 3000, 'RUBBER & MISCELLANEOUS PLASTICS PRODUCTS', 2, 4308),\n" +
            "(3252, 'SIC', 2900, 'PETROLEUM & COAL PRODUCTS', 2, 4308),\n" +
            "(3214, 'SIC', 2800, 'CHEMICALS & ALLIED PRODUCTS', 2, 4308),\n" +
            "(3167, 'SIC', 2600, 'PAPER & ALLIED PRODUCTS', 2, 4308),\n" +
            "(3148, 'SIC', 2500, 'FURNITURE & FIXTURES', 2, 4308),\n" +
            "(2512, 'SEC', 4000, 'RAILROAD TRANSPORTATION', 2, 2792),\n" +
            "(2516, 'SEC', 4100, 'LOCAL & INTERURBAN PASSENGER TRANSIT', 2, 2792),\n" +
            "(2552, 'SEC', 4900, 'ELECTRIC, GAS & SANITARY SERVICES', 2, 2792),\n" +
            "(2539, 'SEC', 4800, 'COMMUNICATIONS', 2, 2792),\n" +
            "(2536, 'SEC', 4700, 'TRANSPORTATION SERVICES', 2, 2792),\n" +
            "(2534, 'SEC', 4600, 'PIPELINES, EXCEPT NATURAL GAS', 2, 2792),\n" +
            "(2526, 'SEC', 4500, 'TRANSPORT BY AIR', 2, 2792),\n" +
            "(2523, 'SEC', 4400, 'WATER TRANSPORTATION', 2, 2792),\n" +
            "(2517, 'SEC', 4200, 'TRUCKING & WAREHOUSING', 2, 2792),\n" +
            "(3633, 'SIC', 4300, 'US POSTAL SERVICE', 2, 4309),\n" +
            "(3620, 'SIC', 4200, 'TRUCKING & WAREHOUSING', 2, 4309),\n" +
            "(3601, 'SIC', 4000, 'RAILROAD TRANSPORTATION', 2, 4309),\n" +
            "(3605, 'SIC', 4100, 'LOCAL & INTERURBAN PASSENGER TRANSIT', 2, 4309),\n" +
            "(3693, 'SIC', 4900, 'ELECTRIC, GAS & SANITARY SERVICES', 2, 4309),\n" +
            "(3680, 'SIC', 4800, 'COMMUNICATIONS', 2, 4309),\n" +
            "(3667, 'SIC', 4700, 'TRANSPORTATION SERVICES', 2, 4309),\n" +
            "(3662, 'SIC', 4600, 'PIPELINES, EXCEPT NATURAL GAS', 2, 4309),\n" +
            "(3654, 'SIC', 4500, 'TRANSPORT BY AIR', 2, 4309),\n" +
            "(3636, 'SIC', 4400, 'WATER TRANSPORTATION', 2, 4309),\n" +
            "(2568, 'SEC', 5000, 'WHOLESALE TRADE - DURABLE GOODS', 2, 2793),\n" +
            "(2591, 'SEC', 5100, 'WHOLESALE TRADE - NONDURABLE GOODS', 2, 2793),\n" +
            "(3762, 'SIC', 5100, 'WHOLESALE TRADE - NONDURABLE GOODS', 2, 4310),\n" +
            "(3715, 'SIC', 5000, 'WHOLESALE TRADE - DURABLE GOODS', 2, 4310),\n" +
            "(2670, 'SEC', 6200, 'SECURITY & COMMODITY BROKERS', 2, 2795),\n" +
            "(2620, 'SEC', 5500, 'AUTOMOTIVE DEALERS & SERVICE STATIONS', 2, 2794),\n" +
            "(2623, 'SEC', 5600, 'APPAREL & ACCESSORY STORES', 2, 2794),\n" +
            "(2617, 'SEC', 5400, 'FOOD STORES', 2, 2794),\n" +
            "(2605, 'SEC', 5200, 'BUILDING MATERIALS & GARDEN SUPPLIES', 2, 2794),\n" +
            "(2610, 'SEC', 5300, 'GENERAL MERCHANDISE STORES', 2, 2794),\n" +
            "(2630, 'SEC', 5700, 'FURNITURE & HOMEFURNISHING STORES', 2, 2794),\n" +
            "(2637, 'SEC', 5800, 'EATING & DRINKING PLACES', 2, 2794),\n" +
            "(2640, 'SEC', 5900, 'MISCELLANEOUS RETAIL', 2, 2794),\n" +
            "(3837, 'SIC', 5500, 'AUTOMOTIVE DEALERS & SERVICE STATIONS', 2, 4311),\n" +
            "(3854, 'SIC', 5600, 'APPAREL & ACCESSORY STORES', 2, 4311),\n" +
            "(3882, 'SIC', 5800, 'EATING & DRINKING PLACES', 2, 4311),\n" +
            "(3869, 'SIC', 5700, 'FURNITURE & HOMEFURNISHING STORES', 2, 4311),\n" +
            "(3886, 'SIC', 5900, 'MISCELLANEOUS RETAIL', 2, 4311),\n" +
            "(3804, 'SIC', 5200, 'BUILDING MATERIALS & GARDEN SUPPLIES', 2, 4311),\n" +
            "(3815, 'SIC', 5300, 'GENERAL MERCHANDISE STORES', 2, 4311),\n" +
            "(3822, 'SIC', 5400, 'FOOD STORES', 2, 4311),\n" +
            "(2649, 'SEC', 6000, 'DEPOSITORY INSTITUTIONS', 2, 2795),\n" +
            "(2677, 'SEC', 6300, 'INSURANCE CARRIERS', 2, 2795),\n" +
            "(2691, 'SEC', 6400, 'INSURANCE AGENTS, BROKERS & SERVICE', 2, 2795),\n" +
            "(2659, 'SEC', 6100, 'NONDEPOSITORY INSTITUTIONS', 2, 2795),\n" +
            "(2703, 'SEC', 6700, 'HOLDING & OTHER INVESTMENT OFFICES', 2, 2795),\n" +
            "(2694, 'SEC', 6500, 'REAL ESTATE', 2, 2795),\n" +
            "(3948, 'SIC', 6200, 'SECURITY & COMMODITY BROKERS', 2, 4312),\n" +
            "(3937, 'SIC', 6100, 'NONDEPOSITORY INSTITUTIONS', 2, 4312),\n" +
            "(3917, 'SIC', 6000, 'DEPOSITORY INSTITUTIONS', 2, 4312),\n" +
            "(3992, 'SIC', 6700, 'HOLDING & OTHER INVESTMENT OFFICES', 2, 4312),\n" +
            "(3977, 'SIC', 6500, 'REAL ESTATE', 2, 4312),\n" +
            "(3974, 'SIC', 6400, 'INSURANCE AGENTS, BROKERS & SERVICE', 2, 4312),\n" +
            "(3958, 'SIC', 6300, 'INSURANCE CARRIERS', 2, 4312),\n" +
            "(2766, 'SEC', 8100, 'LEGAL SERVICES', 2, 2796),\n" +
            "(2712, 'SEC', 7200, 'PERSONAL SERVICES', 2, 2796),\n" +
            "(2713, 'SEC', 7300, 'BUSINESS SERVICES', 2, 2796),\n" +
            "(2735, 'SEC', 7500, 'AUTO REPAIR, SERVICES & PARKING', 2, 2796),\n" +
            "(2737, 'SEC', 7600, 'MISCELLANEOUS REPAIR SERVICES', 2, 2796),\n" +
            "(2738, 'SEC', 7800, 'MOTION PICTURES', 2, 2796),\n" +
            "(2769, 'SEC', 8200, 'EDUCATIONAL SERVICES', 2, 2796),\n" +
            "(2770, 'SEC', 8300, 'SOCIAL SERVICES', 2, 2796),\n" +
            "(2773, 'SEC', 8600, 'MEMBERSHIP ORGANIZATIONS', 2, 2796),\n" +
            "(2774, 'SEC', 8700, 'ENGINEERING & MANAGEMENT SERVICES', 2, 2796),\n" +
            "(2784, 'SEC', 8900, 'SERVICES, NEC', 2, 2796),\n" +
            "(2748, 'SEC', 7900, 'AMUSEMENT & RECREATIONAL SERVICES', 2, 2796),\n" +
            "(2753, 'SEC', 8000, 'HEALTH SERVICE', 2, 2796),\n" +
            "(2709, 'SEC', 7000, 'HOTELS & OTHER LODGING PLACES', 2, 2796),\n" +
            "(4203, 'SIC', 8400, 'MUSEUMS, BOTANICAL, ZOOLOGICAL GARDENS', 2, 4313),\n" +
            "(4244, 'SIC', 8900, 'SERVICES, NEC', 2, 4313),\n" +
            "(4241, 'SIC', 8800, 'PRIVATE HOUSEHOLDS', 2, 4313),\n" +
            "(4223, 'SIC', 8700, 'ENGINEERING & MANAGEMENT SERVICES', 2, 4313),\n" +
            "(4208, 'SIC', 8600, 'MEMBERSHIP ORGANIZATIONS', 2, 4313),\n" +
            "(4007, 'SIC', 7000, 'HOTELS & OTHER LODGING PLACES', 2, 4313),\n" +
            "(4017, 'SIC', 7200, 'PERSONAL SERVICES', 2, 4313),\n" +
            "(4040, 'SIC', 7300, 'BUSINESS SERVICES', 2, 4313),\n" +
            "(4081, 'SIC', 7500, 'AUTO REPAIR, SERVICES & PARKING', 2, 4313),\n" +
            "(4100, 'SIC', 7600, 'MISCELLANEOUS REPAIR SERVICES', 2, 4313),\n" +
            "(4113, 'SIC', 7800, 'MOTION PICTURES', 2, 4313),\n" +
            "(4125, 'SIC', 7900, 'AMUSEMENT & RECREATIONAL SERVICES', 2, 4313),\n" +
            "(4146, 'SIC', 8000, 'HEALTH SERVICE', 2, 4313),\n" +
            "(4175, 'SIC', 8100, 'LEGAL SERVICES', 2, 4313),\n" +
            "(4178, 'SIC', 8200, 'EDUCATIONAL SERVICES', 2, 4313),\n" +
            "(4192, 'SIC', 8300, 'SOCIAL SERVICES', 2, 4313),\n" +
            "(2785, 'SEC', 9700, 'NATIONAL SECURITY & INTL. AFFAIRS', 2, 2797),\n" +
            "(4256, 'SIC', 9200, 'JUSTICE, PUBLIC ORDER & SAFETY', 2, 4314),\n" +
            "(4277, 'SIC', 9500, 'ENVIRONMENTAL QUALITY & HOUSING', 2, 4314),\n" +
            "(4247, 'SIC', 9100, 'EXECUTIVE, LEGISLATIVE & GENERAL', 2, 4314),\n" +
            "(4265, 'SIC', 9300, 'FINANCE, TAXATION & MONETARY POLICY', 2, 4314),\n" +
            "(4302, 'SIC', 9900, 'NONCLASSIFIABLE ESTABLISHMENTS', 2, 4314),\n" +
            "(4268, 'SIC', 9400, 'ADMINISTRATION OF HUMAN RESOURCES', 2, 4314),\n" +
            "(4297, 'SIC', 9700, 'NATIONAL SECURITY & INTL. AFFAIRS', 2, 4314),\n" +
            "(4284, 'SIC', 9600, 'ADMINISTRATION OF ECONOMIC PROGRAMS', 2, 4314),\n" +
            "(2845, 'SIC', 290, 'General Farms, Primarily Animal', 3, 2825),\n" +
            "(2826, 'SIC', 210, 'Livestock, Except Dairy & Poultry', 3, 2825),\n" +
            "(2840, 'SIC', 270, 'Animal Specialties', 3, 2825),\n" +
            "(2832, 'SIC', 240, 'Dairy Farms', 3, 2825),\n" +
            "(2834, 'SIC', 250, 'Poultry & Eggs', 3, 2825),\n" +
            "(2855, 'SIC', 740, 'Veterinary Services', 3, 2847),\n" +
            "(2864, 'SIC', 780, 'Landscape & Horticultural Services', 3, 2847),\n" +
            "(2861, 'SIC', 760, 'Farm Labor & Management Services', 3, 2847),\n" +
            "(2850, 'SIC', 720, 'Crop Services', 3, 2847),\n" +
            "(2848, 'SIC', 710, 'Soil Preparation Services', 3, 2847),\n" +
            "(2858, 'SIC', 750, 'Animal Services, Except Veterinary', 3, 2847),\n" +
            "(2871, 'SIC', 830, 'Forest Products', 3, 2868),\n" +
            "(2869, 'SIC', 810, 'Timber Tracts', 3, 2868),\n" +
            "(2873, 'SIC', 850, 'Forestry Services', 3, 2868),\n" +
            "(2882, 'SIC', 970, 'Hunting, Trapping & Game Propagation', 3, 2875),\n" +
            "(2880, 'SIC', 920, 'Fish Hatcheries & Preserves', 3, 2875),\n" +
            "(2876, 'SIC', 910, 'Commercial Fishing', 3, 2875),\n" +
            "(2216, 'SEC', 1040, 'Gold & Silver Ores', 3, 2215),\n" +
            "(2217, 'SEC', 1090, 'Miscellaneous Metal Ores', 3, 2215),\n" +
            "(2891, 'SIC', 1040, 'Gold & Silver Ores', 3, 2884),\n" +
            "(2898, 'SIC', 1090, 'Miscellaneous Metal Ores', 3, 2884),\n" +
            "(2889, 'SIC', 1030, 'Lead & Zinc Ores', 3, 2884),\n" +
            "(2885, 'SIC', 1010, 'Iron Ores', 3, 2884),\n" +
            "(2887, 'SIC', 1020, 'Copper Ores', 3, 2884),\n" +
            "(2894, 'SIC', 1060, 'Ferroalloy Ores, Except Vanadium', 3, 2884),\n" +
            "(2896, 'SIC', 1080, 'Metal Mining Services', 3, 2884),\n" +
            "(2219, 'SEC', 1220, 'Bituminous Coal & Lignite Mining', 3, 2218),\n" +
            "(2907, 'SIC', 1240, 'Coal Mining Services', 3, 2901),\n" +
            "(2905, 'SIC', 1230, 'Anthracite Mining', 3, 2901),\n" +
            "(2902, 'SIC', 1220, 'Bituminous Coal & Lignite Mining', 3, 2901),\n" +
            "(2224, 'SEC', 1380, 'Oil & Gas Field Services', 3, 2221),\n" +
            "(2222, 'SEC', 1310, 'Crude Petroleum & Natural Gas', 3, 2221),\n" +
            "(2910, 'SIC', 1310, 'Crude Petroleum & Natural Gas', 3, 2909),\n" +
            "(2914, 'SIC', 1380, 'Oil & Gas Field Services', 3, 2909),\n" +
            "(2912, 'SIC', 1320, 'Natural Gas Liquids', 3, 2909),\n" +
            "(2931, 'SIC', 1470, 'Chemical & Fertilizer Minerals', 3, 2918),\n" +
            "(2935, 'SIC', 1480, 'Nonmetallic Minerals Services', 3, 2918),\n" +
            "(2937, 'SIC', 1490, 'Miscellaneous Nonmetallic Minerals', 3, 2918),\n" +
            "(2919, 'SIC', 1410, 'Dimension Stone', 3, 2918),\n" +
            "(2921, 'SIC', 1420, 'Crushed & Broken Stone', 3, 2918),\n" +
            "(2925, 'SIC', 1440, 'Sand & Gravel', 3, 2918),\n" +
            "(2928, 'SIC', 1450, 'Clay, Ceramic & Refractory Minerals', 3, 2918),\n" +
            "(2230, 'SEC', 1520, 'Residential Building Construction', 3, 2229),\n" +
            "(2231, 'SEC', 1530, 'Operative Builders', 3, 2229),\n" +
            "(2233, 'SEC', 1540, 'Nonresidential Building Construction', 3, 2229),\n" +
            "(2943, 'SIC', 1530, 'Operative Builders', 3, 2939),\n" +
            "(2940, 'SIC', 1520, 'Residential Building Construction', 3, 2939),\n" +
            "(2945, 'SIC', 1540, 'Nonresidential Building Construction', 3, 2939),\n" +
            "(2235, 'SEC', 1620, 'Heavy Construction, Except Highway', 3, 2234),\n" +
            "(2951, 'SIC', 1620, 'Heavy Construction, Except Highway', 3, 2948),\n" +
            "(2949, 'SIC', 1610, 'Highway & Street Construction', 3, 2948),\n" +
            "(2238, 'SEC', 1730, 'Electrical Work', 3, 2237),\n" +
            "(2973, 'SIC', 1780, 'Water Well Drilling', 3, 2955),\n" +
            "(2960, 'SIC', 1730, 'Electrical Work', 3, 2955),\n" +
            "(2966, 'SIC', 1750, 'Carpentry & Floor Work', 3, 2955),\n" +
            "(2969, 'SIC', 1760, 'Roofing, Siding & Sheet Metal Work', 3, 2955),\n" +
            "(2962, 'SIC', 1740, 'Masonry, Stonework & Plastering', 3, 2955),\n" +
            "(2956, 'SIC', 1710, 'Plumbing, Heating, Air-Conditioning', 3, 2955),\n" +
            "(2971, 'SIC', 1770, 'Concrete Work', 3, 2955),\n" +
            "(2975, 'SIC', 1790, 'Miscellaneous Special Trade Contractors', 3, 2955),\n" +
            "(2958, 'SIC', 1720, 'Painting & Paper Hanging', 3, 2955),\n" +
            "(2257, 'SEC', 2090, 'Miscellaneous Food & Kindred Products', 3, 2240),\n" +
            "(2241, 'SEC', 2010, 'Meat Products', 3, 2240),\n" +
            "(2245, 'SEC', 2020, 'Dairy Products', 3, 2240),\n" +
            "(2247, 'SEC', 2030, 'Preserved Fruits & Vegetables', 3, 2240),\n" +
            "(2249, 'SEC', 2040, 'Grain Mill Products', 3, 2240),\n" +
            "(2250, 'SEC', 2050, 'Bakery Products', 3, 2240),\n" +
            "(2252, 'SEC', 2060, 'Sugar & Confectionery Products', 3, 2240),\n" +
            "(2253, 'SEC', 2070, 'Fats & Oils', 3, 2240),\n" +
            "(2254, 'SEC', 2080, 'Beverages', 3, 2240),\n" +
            "(3026, 'SIC', 2080, 'Beverages', 3, 2982),\n" +
            "(3008, 'SIC', 2050, 'Bakery Products', 3, 2982),\n" +
            "(3020, 'SIC', 2070, 'Fats & Oils', 3, 2982),\n" +
            "(2993, 'SIC', 2030, 'Preserved Fruits & Vegetables', 3, 2982),\n" +
            "(2983, 'SIC', 2010, 'Meat Products', 3, 2982),\n" +
            "(2987, 'SIC', 2020, 'Dairy Products', 3, 2982),\n" +
            "(3012, 'SIC', 2060, 'Sugar & Confectionery Products', 3, 2982),\n" +
            "(3033, 'SIC', 2090, 'Miscellaneous Food & Kindred Products', 3, 2982),\n" +
            "(3000, 'SIC', 2040, 'Grain Mill Products', 3, 2982),\n" +
            "(3048, 'SIC', 2140, 'Tobacco Stemming & Redrying', 3, 3041),\n" +
            "(3046, 'SIC', 2130, 'Chewing & Smoking Tobacco', 3, 3041),\n" +
            "(3044, 'SIC', 2120, 'Cigars', 3, 3041),\n" +
            "(3042, 'SIC', 2110, 'Cigarettes', 3, 3041),\n" +
            "(2265, 'SEC', 2220, 'Broadwoven Fabric Mills, Manmade', 3, 2262),\n" +
            "(2267, 'SEC', 2250, 'Knitting Mills', 3, 2262),\n" +
            "(2269, 'SEC', 2270, 'Carpets & Rugs', 3, 2262),\n" +
            "(2263, 'SEC', 2210, 'Broadwoven Fabric Mills, Cotton', 3, 2262),\n" +
            "(3051, 'SIC', 2210, 'Broadwoven Fabric Mills, Cotton', 3, 3050),\n" +
            "(3059, 'SIC', 2250, 'Knitting Mills', 3, 3050),\n" +
            "(3073, 'SIC', 2280, 'Yarn & Thread Mills', 3, 3050),\n" +
            "(3071, 'SIC', 2270, 'Carpets & Rugs', 3, 3050),\n" +
            "(3053, 'SIC', 2220, 'Broadwoven Fabric Mills, Manmade', 3, 3050),\n" +
            "(3057, 'SIC', 2240, 'Narrow Fabric Mills', 3, 3050),\n" +
            "(3077, 'SIC', 2290, 'Miscellaneous TEXTile Goods', 3, 3050),\n" +
            "(3067, 'SIC', 2260, 'TEXTile Finishing, Except Wool', 3, 3050),\n" +
            "(3055, 'SIC', 2230, 'Broadwoven Fabric Mills, Wool', 3, 3050),\n" +
            "(2272, 'SEC', 2320, 'Men''s & Boys'' Furnishings', 3, 2271),\n" +
            "(2275, 'SEC', 2390, 'Miscellaneous Fabricated TEXTile Products', 3, 2271),\n" +
            "(2274, 'SEC', 2340, 'Women''s & Children''s Undergarments', 3, 2271),\n" +
            "(2273, 'SEC', 2330, 'Women''s & Misses'' Outerwear', 3, 2271),\n" +
            "(3115, 'SIC', 2390, 'Miscellaneous Fabricated TEXTile Products', 3, 3083),\n" +
            "(3098, 'SIC', 2340, 'Women''s & Children''s Undergarments', 3, 3083),\n" +
            "(3084, 'SIC', 2310, 'Men''s & Boys'' Suits & Coats', 3, 3083),\n" +
            "(3086, 'SIC', 2320, 'Men''s & Boys'' Furnishings', 3, 3083),\n" +
            "(3093, 'SIC', 2330, 'Women''s & Misses'' Outerwear', 3, 3083),\n" +
            "(3101, 'SIC', 2350, 'Hats, Caps & Millinery', 3, 3083),\n" +
            "(3103, 'SIC', 2360, 'Girl''s & Children''s Outerwear', 3, 3083),\n" +
            "(3108, 'SIC', 2380, 'Miscellaneous Apparel & Accessories', 3, 3083),\n" +
            "(2280, 'SEC', 2450, 'Wood Buildings & Mobile Homes', 3, 2276),\n" +
            "(2277, 'SEC', 2420, 'Sawmills & Planing Mills', 3, 2276),\n" +
            "(2279, 'SEC', 2430, 'Millwork, Plywood, & Structural Members', 3, 2276),\n" +
            "(3144, 'SIC', 2490, 'Miscellaneous Wood Products', 3, 3124),\n" +
            "(3141, 'SIC', 2450, 'Wood Buildings & Mobile Homes', 3, 3124),\n" +
            "(3137, 'SIC', 2440, 'Wood Containers', 3, 3124),\n" +
            "(3125, 'SIC', 2410, 'Logging', 3, 3124),\n" +
            "(3131, 'SIC', 2430, 'Millwork, Plywood, & Structural Members', 3, 3124),\n" +
            "(2291, 'SEC', 2590, 'Miscellaneous Furniture & Fixtures', 3, 2283),\n" +
            "(2288, 'SEC', 2530, 'Public Building & Related Furniture', 3, 2283),\n" +
            "(2286, 'SEC', 2520, 'Office Furniture', 3, 2283),\n" +
            "(2284, 'SEC', 2510, 'Household Furniture', 3, 2283),\n" +
            "(2290, 'SEC', 2540, 'Partitions & Fixtures', 3, 2283),\n" +
            "(3164, 'SIC', 2590, 'Miscellaneous Furniture & Fixtures', 3, 3148),\n" +
            "(3156, 'SIC', 2520, 'Office Furniture', 3, 3148),\n" +
            "(3149, 'SIC', 2510, 'Household Furniture', 3, 3148),\n" +
            "(3159, 'SIC', 2530, 'Public Building & Related Furniture', 3, 3148),\n" +
            "(3161, 'SIC', 2540, 'Partitions & Fixtures', 3, 3148),\n" +
            "(2297, 'SEC', 2630, 'Paperboard Mills', 3, 2292),\n" +
            "(2299, 'SEC', 2650, 'Paperboard Containers & Boxes', 3, 2292),\n" +
            "(2300, 'SEC', 2670, 'Miscellaneous Converted Paper Products', 3, 2292),\n" +
            "(2293, 'SEC', 2610, 'Pulp Mills', 3, 2292),\n" +
            "(2295, 'SEC', 2620, 'Paper Mills', 3, 2292),\n" +
            "(3180, 'SIC', 2670, 'Miscellaneous Converted Paper Products', 3, 3167),\n" +
            "(3168, 'SIC', 2610, 'Pulp Mills', 3, 3167),\n" +
            "(3174, 'SIC', 2650, 'Paperboard Containers & Boxes', 3, 3167),\n" +
            "(3172, 'SIC', 2630, 'Paperboard Mills', 3, 3167),\n" +
            "(3170, 'SIC', 2620, 'Paper Mills', 3, 3167),\n" +
            "(2317, 'SEC', 2780, 'Blankbooks & Bookbinding', 3, 2302),\n" +
            "(2303, 'SEC', 2710, 'Newspapers', 3, 2302),\n" +
            "(2305, 'SEC', 2720, 'Periodicals', 3, 2302),\n" +
            "(2310, 'SEC', 2740, 'Miscellaneous Publishing', 3, 2302),\n" +
            "(2312, 'SEC', 2750, 'Commercial Printing', 3, 2302),\n" +
            "(2307, 'SEC', 2730, 'Books', 3, 2302),\n" +
            "(2313, 'SEC', 2760, 'Manifold Business Forms', 3, 2302),\n" +
            "(2318, 'SEC', 2790, 'Printing Trade Services', 3, 2302),\n" +
            "(3206, 'SIC', 2770, 'Greeting Cards', 3, 3190),\n" +
            "(3211, 'SIC', 2790, 'Printing Trade Services', 3, 3190),\n" +
            "(3195, 'SIC', 2730, 'Books', 3, 3190),\n" +
            "(3208, 'SIC', 2780, 'Blankbooks & Bookbinding', 3, 3190),\n" +
            "(3191, 'SIC', 2710, 'Newspapers', 3, 3190),\n" +
            "(3193, 'SIC', 2720, 'Periodicals', 3, 3190),\n" +
            "(3198, 'SIC', 2740, 'Miscellaneous Publishing', 3, 3190),\n" +
            "(3200, 'SIC', 2750, 'Commercial Printing', 3, 3190),\n" +
            "(3204, 'SIC', 2760, 'Manifold Business Forms', 3, 3190),\n" +
            "(2321, 'SEC', 2820, 'Plastics Materials & Synthetics', 3, 2319),\n" +
            "(2320, 'SEC', 2810, 'Industrial Inorganic Chemicals', 3, 2319),\n" +
            "(2328, 'SEC', 2840, 'Soap, Cleaners & Toilet Goods', 3, 2319),\n" +
            "(2333, 'SEC', 2860, 'Industrial Organic Chemicals', 3, 2319),\n" +
            "(2335, 'SEC', 2890, 'Miscellaneous Chemical Products', 3, 2319),\n" +
            "(2331, 'SEC', 2850, 'Paints & Allied Products', 3, 2319),\n" +
            "(2334, 'SEC', 2870, 'Agricultural Chemicals', 3, 2319),\n" +
            "(2323, 'SEC', 2830, 'Drugs', 3, 2319),\n" +
            "(3241, 'SIC', 2870, 'Agricultural Chemicals', 3, 3214),\n" +
            "(3235, 'SIC', 2850, 'Paints & Allied Products', 3, 3214),\n" +
            "(3230, 'SIC', 2840, 'Soap, Cleaners & Toilet Goods', 3, 3214),\n" +
            "(3225, 'SIC', 2830, 'Drugs', 3, 3214),\n" +
            "(3215, 'SIC', 2810, 'Industrial Inorganic Chemicals', 3, 3214),\n" +
            "(3246, 'SIC', 2890, 'Miscellaneous Chemical Products', 3, 3214),\n" +
            "(3220, 'SIC', 2820, 'Plastics Materials & Synthetics', 3, 3214),\n" +
            "(3237, 'SIC', 2860, 'Industrial Organic Chemicals', 3, 3214),\n" +
            "(2338, 'SEC', 2910, 'Petroleum Refining', 3, 2337),\n" +
            "(2341, 'SEC', 2990, 'Miscellaneous Petroleum & Coal Products', 3, 2337),\n" +
            "(2340, 'SEC', 2950, 'Asphalt Paving & Roofing Materials', 3, 2337),\n" +
            "(3255, 'SIC', 2950, 'Asphalt Paving & Roofing Materials', 3, 3252),\n" +
            "(3258, 'SIC', 2990, 'Miscellaneous Petroleum & Coal Products', 3, 3252),\n" +
            "(3253, 'SIC', 2910, 'Petroleum Refining', 3, 3252),\n" +
            "(2343, 'SEC', 3010, 'Tires & Inner Tubes', 3, 2342),\n" +
            "(2349, 'SEC', 3080, 'Miscellaneous Plastics Products, nec', 3, 2342),\n" +
            "(2347, 'SEC', 3050, 'Hose & Belting & Gaskets & Packing', 3, 2342),\n" +
            "(2345, 'SEC', 3020, 'Rubber & Plastics Footwear', 3, 2342),\n" +
            "(2348, 'SEC', 3060, 'Fabricated Rubber Products, nec', 3, 2342),\n" +
            "(3269, 'SIC', 3060, 'Fabricated Rubber Products, nec', 3, 3261),\n" +
            "(3266, 'SIC', 3050, 'Hose & Belting & Gaskets & Packing', 3, 3261),\n" +
            "(3262, 'SIC', 3010, 'Tires & Inner Tubes', 3, 3261),\n" +
            "(3272, 'SIC', 3080, 'Miscellaneous Plastics Products, nec', 3, 3261),\n" +
            "(3264, 'SIC', 3020, 'Rubber & Plastics Footwear', 3, 3261),\n" +
            "(2354, 'SEC', 3140, 'Footwear, Except Rubber', 3, 2353),\n" +
            "(3292, 'SIC', 3150, 'Leather Gloves & Mittens', 3, 3282),\n" +
            "(3299, 'SIC', 3190, 'Leather Goods, nec', 3, 3282),\n" +
            "(3294, 'SIC', 3160, 'Luggage', 3, 3282),\n" +
            "(3287, 'SIC', 3140, 'Footwear, Except Rubber', 3, 3282),\n" +
            "(3285, 'SIC', 3130, 'Footwear Cut Stock', 3, 3282),\n" +
            "(3283, 'SIC', 3110, 'Leather Tanning & Finishing', 3, 3282),\n" +
            "(3296, 'SIC', 3170, 'Handbags & Personal Leather Goods', 3, 3282),\n" +
            "(2370, 'SEC', 3290, 'Miscellaneous Nonmetallic Mineral Products', 3, 2355),\n" +
            "(2364, 'SEC', 3250, 'Structural Clay Products', 3, 2355),\n" +
            "(2356, 'SEC', 3210, 'Flat Glass', 3, 2355),\n" +
            "(2358, 'SEC', 3220, 'Glass & Glassware, Pressed or Blown', 3, 2355),\n" +
            "(2360, 'SEC', 3230, 'Products of Purchased Glass', 3, 2355),\n" +
            "(2362, 'SEC', 3240, 'Cement, Hydraulic', 3, 2355),\n" +
            "(2365, 'SEC', 3260, 'Pottery & Related Products', 3, 2355),\n" +
            "(2366, 'SEC', 3270, 'Concrete, Gypsum & Plaster Products', 3, 2355),\n" +
            "(2368, 'SEC', 3280, 'Cut Stone & Stone Products', 3, 2355),\n" +
            "(3311, 'SIC', 3250, 'Structural Clay Products', 3, 3301),\n" +
            "(3309, 'SIC', 3240, 'Cement, Hydraulic', 3, 3301),\n" +
            "(3307, 'SIC', 3230, 'Products of Purchased Glass', 3, 3301),\n" +
            "(3302, 'SIC', 3210, 'Flat Glass', 3, 3301),\n" +
            "(3304, 'SIC', 3220, 'Glass & Glassware, Pressed or Blown', 3, 3301),\n" +
            "(3322, 'SIC', 3270, 'Concrete, Gypsum & Plaster Products', 3, 3301),\n" +
            "(3328, 'SIC', 3280, 'Cut Stone & Stone Products', 3, 3301),\n" +
            "(3330, 'SIC', 3290, 'Miscellaneous Nonmetallic Mineral Products', 3, 3301),\n" +
            "(3316, 'SIC', 3260, 'Pottery & Related Products', 3, 3301),\n" +
            "(2382, 'SEC', 3360, 'Nonferrous Foundries (Castings)', 3, 2371),\n" +
            "(2376, 'SEC', 3330, 'Primary Nonferrous Metals', 3, 2371),\n" +
            "(2375, 'SEC', 3320, 'Iron & Steel Foundries', 3, 2371),\n" +
            "(2372, 'SEC', 3310, 'Blast Furnace & Basic Steel Products', 3, 2371),\n" +
            "(2380, 'SEC', 3350, 'Nonferrous Rolling & Drawing', 3, 2371),\n" +
            "(2383, 'SEC', 3390, 'Miscellaneous Primary Metal Industries', 3, 2371),\n" +
            "(2378, 'SEC', 3340, 'Secondary Nonferrous Metals', 3, 2371),\n" +
            "(3368, 'SIC', 3390, 'Miscellaneous Primary Metal Industries', 3, 3337),\n" +
            "(3362, 'SIC', 3360, 'Nonferrous Foundries (Castings)', 3, 3337),\n" +
            "(3355, 'SIC', 3350, 'Nonferrous Rolling & Drawing', 3, 3337),\n" +
            "(3353, 'SIC', 3340, 'Secondary Nonferrous Metals', 3, 3337),\n" +
            "(3349, 'SIC', 3330, 'Primary Nonferrous Metals', 3, 3337),\n" +
            "(3344, 'SIC', 3320, 'Iron & Steel Foundries', 3, 3337),\n" +
            "(3338, 'SIC', 3310, 'Blast Furnace & Basic Steel Products', 3, 3337),\n" +
            "(2402, 'SEC', 3490, 'Miscellaneous Fabricated Metal Products', 3, 2384),\n" +
            "(2399, 'SEC', 3460, 'Metal Forgings & Stampings', 3, 2384),\n" +
            "(2396, 'SEC', 3450, 'Screw Machine Products, Bolts, Etc.', 3, 2384),\n" +
            "(2391, 'SEC', 3440, 'Fabricated Structural Metal Products', 3, 2384),\n" +
            "(2389, 'SEC', 3430, 'Plumbing & Heating, Except Electric', 3, 2384),\n" +
            "(2388, 'SEC', 3420, 'Cutlery, Handtools & Hardware', 3, 2384),\n" +
            "(2401, 'SEC', 3480, 'Ordnance & Accessories, nec', 3, 2384),\n" +
            "(2385, 'SEC', 3410, 'Metal Cans & Shipping Containers', 3, 2384),\n" +
            "(3380, 'SIC', 3430, 'Plumbing & Heating, Except Electric', 3, 3371),\n" +
            "(3395, 'SIC', 3460, 'Metal Forgings & Stampings', 3, 3371),\n" +
            "(3392, 'SIC', 3450, 'Screw Machine Products, Bolts, Etc.', 3, 3371),\n" +
            "(3372, 'SIC', 3410, 'Metal Cans & Shipping Containers', 3, 3371),\n" +
            "(3375, 'SIC', 3420, 'Cutlery, Handtools & Hardware', 3, 3371),\n" +
            "(3404, 'SIC', 3480, 'Ordnance & Accessories, nec', 3, 3371),\n" +
            "(3401, 'SIC', 3470, 'Metal Services, nec', 3, 3371),\n" +
            "(3384, 'SIC', 3440, 'Fabricated Structural Metal Products', 3, 3371),\n" +
            "(3409, 'SIC', 3490, 'Miscellaneous Fabricated Metal Products', 3, 3371),\n" +
            "(2408, 'SEC', 3530, 'Construction & Related Machinery', 3, 2403),\n" +
            "(2405, 'SEC', 3520, 'Farm & Garden Machinery', 3, 2403),\n" +
            "(2404, 'SEC', 3510, 'Engines & Turbines', 3, 2403),\n" +
            "(2418, 'SEC', 3560, 'General Industry Machinery', 3, 2403),\n" +
            "(2415, 'SEC', 3550, 'Special Industry Machinery', 3, 2403),\n" +
            "(2413, 'SEC', 3540, 'Metalworking Machinery', 3, 2403),\n" +
            "(2424, 'SEC', 3570, 'Computer & Office Equipment', 3, 2403),\n" +
            "(2431, 'SEC', 3580, 'Refrigeration & Service Industry', 3, 2403),\n" +
            "(2433, 'SEC', 3590, 'Industrial Machinery, nec', 3, 2403),\n" +
            "(3434, 'SIC', 3540, 'Metalworking Machinery', 3, 3419),\n" +
            "(3426, 'SIC', 3530, 'Construction & Related Machinery', 3, 3419),\n" +
            "(3474, 'SIC', 3590, 'Industrial Machinery, nec', 3, 3419),\n" +
            "(3468, 'SIC', 3580, 'Refrigeration & Service Industry', 3, 3419),\n" +
            "(3461, 'SIC', 3570, 'Computer & Office Equipment', 3, 3419),\n" +
            "(3451, 'SIC', 3560, 'General Industry Machinery', 3, 3419),\n" +
            "(3444, 'SIC', 3550, 'Special Industry Machinery', 3, 3419),\n" +
            "(3423, 'SIC', 3520, 'Farm & Garden Machinery', 3, 3419),\n" +
            "(2442, 'SEC', 3640, 'Electric Lighting & Wiring Equipment', 3, 2434),\n" +
            "(2443, 'SEC', 3650, 'Household Audio & Video Equipment', 3, 2434),\n" +
            "(2446, 'SEC', 3660, 'Communications Equipment', 3, 2434),\n" +
            "(2440, 'SEC', 3630, 'Household Appliances', 3, 2434),\n" +
            "(2435, 'SEC', 3610, 'Electric Distribution Equipment', 3, 2434),\n" +
            "(2450, 'SEC', 3670, 'Electronic Components & Accessories', 3, 2434),\n" +
            "(2438, 'SEC', 3620, 'Electrical Industrial Apparatus', 3, 2434),\n" +
            "(2456, 'SEC', 3690, 'Miscellaneous Electrical Equipment & Supplies', 3, 2434),\n" +
            "(3484, 'SIC', 3620, 'Electrical Industrial Apparatus', 3, 3480),\n" +
            "(3507, 'SIC', 3660, 'Communications Equipment', 3, 3480),\n" +
            "(3504, 'SIC', 3650, 'Household Audio & Video Equipment', 3, 3480),\n" +
            "(3520, 'SIC', 3690, 'Miscellaneous Electrical Equipment & Supplies', 3, 3480),\n" +
            "(3496, 'SIC', 3640, 'Electric Lighting & Wiring Equipment', 3, 3480),\n" +
            "(3489, 'SIC', 3630, 'Household Appliances', 3, 3480),\n" +
            "(3511, 'SIC', 3670, 'Electronic Components & Accessories', 3, 3480),\n" +
            "(3481, 'SIC', 3610, 'Electric Distribution Equipment', 3, 3480),\n" +
            "(2474, 'SEC', 3760, 'Guided Missiles, Space Vehicles, Parts', 3, 2458),\n" +
            "(2475, 'SEC', 3790, 'Miscellaneous Transportation Equipment', 3, 2458),\n" +
            "(2459, 'SEC', 3710, 'Motor Vehicles & Equipment', 3, 2458),\n" +
            "(2465, 'SEC', 3720, 'Aircraft & Parts', 3, 2458),\n" +
            "(2469, 'SEC', 3730, 'Ship & Boat Building & Repairing', 3, 2458),\n" +
            "(2470, 'SEC', 3740, 'Railroad Equipment', 3, 2458),\n" +
            "(2472, 'SEC', 3750, 'Motorcycles, Bicycles & Parts', 3, 2458),\n" +
            "(3544, 'SIC', 3760, 'Guided Missiles, Space Vehicles, Parts', 3, 3526),\n" +
            "(3537, 'SIC', 3730, 'Ship & Boat Building & Repairing', 3, 3526),\n" +
            "(3533, 'SIC', 3720, 'Aircraft & Parts', 3, 3526),\n" +
            "(3548, 'SIC', 3790, 'Miscellaneous Transportation Equipment', 3, 3526);\n";
    static String industryCodeInsert9 = "INSERT INTO industry (industry_id, industry_classification, industry_code, industry_description, depth, parent_id) VALUES\n" +
            "(3527, 'SIC', 3710, 'Motor Vehicles & Equipment', 3, 3526),\n" +
            "(3540, 'SIC', 3740, 'Railroad Equipment', 3, 3526),\n" +
            "(3542, 'SIC', 3750, 'Motorcycles, Bicycles & Parts', 3, 3526),\n" +
            "(2479, 'SEC', 3820, 'Measuring & Controlling Devices', 3, 2476),\n" +
            "(2488, 'SEC', 3840, 'Medical Instruments & Supplies', 3, 2476),\n" +
            "(2477, 'SEC', 3810, 'Search & Navigation Equipment', 3, 2476),\n" +
            "(2498, 'SEC', 3870, 'Watches, Clocks, Watchcases & Parts', 3, 2476),\n" +
            "(2494, 'SEC', 3850, 'Ophthalmic Goods', 3, 2476),\n" +
            "(2496, 'SEC', 3860, 'Photographic Equipment & Supplies', 3, 2476),\n" +
            "(3570, 'SIC', 3850, 'Ophthalmic Goods', 3, 3552),\n" +
            "(3564, 'SIC', 3840, 'Medical Instruments & Supplies', 3, 3552),\n" +
            "(3555, 'SIC', 3820, 'Measuring & Controlling Devices', 3, 3552),\n" +
            "(3553, 'SIC', 3810, 'Search & Navigation Equipment', 3, 3552),\n" +
            "(3572, 'SIC', 3860, 'Photographic Equipment & Supplies', 3, 3552),\n" +
            "(3574, 'SIC', 3870, 'Watches, Clocks, Watchcases & Parts', 3, 3552),\n" +
            "(2505, 'SEC', 3940, 'Toys & Sporting Goods', 3, 2500),\n" +
            "(2503, 'SEC', 3930, 'Musical Instruments', 3, 2500),\n" +
            "(2510, 'SEC', 3960, 'Costume Jewelry & Notions', 3, 2500),\n" +
            "(2511, 'SEC', 3990, 'Miscellaneous Manufacturers', 3, 2500),\n" +
            "(2501, 'SEC', 3910, 'Jewelry, Silverware & Plated Ware', 3, 2500),\n" +
            "(2509, 'SEC', 3950, 'Pens, Pencils, Office & Art Supplies', 3, 2500),\n" +
            "(3595, 'SIC', 3990, 'Miscellaneous Manufacturers', 3, 3576),\n" +
            "(3581, 'SIC', 3930, 'Musical Instruments', 3, 3576),\n" +
            "(3577, 'SIC', 3910, 'Jewelry, Silverware & Plated Ware', 3, 3576),\n" +
            "(3583, 'SIC', 3940, 'Toys & Sporting Goods', 3, 3576),\n" +
            "(3587, 'SIC', 3950, 'Pens, Pencils, Office & Art Supplies', 3, 3576),\n" +
            "(3592, 'SIC', 3960, 'Costume Jewelry & Notions', 3, 3576),\n" +
            "(3602, 'SIC', 4010, 'Railroads', 3, 3601),\n" +
            "(3609, 'SIC', 4120, 'Taxicabs', 3, 3605),\n" +
            "(3606, 'SIC', 4110, 'Local & Suburban Transportation', 3, 3605),\n" +
            "(3613, 'SIC', 4140, 'Bus Charter Service', 3, 3605),\n" +
            "(3618, 'SIC', 4170, 'Bus Terminal & Service Facilities', 3, 3605),\n" +
            "(3616, 'SIC', 4150, 'School Buses', 3, 3605),\n" +
            "(3611, 'SIC', 4130, 'Intercity & Rural Bus Transportation', 3, 3605),\n" +
            "(2521, 'SEC', 4230, 'Trucking Terminal Facilities', 3, 2517),\n" +
            "(2520, 'SEC', 4220, 'Public Wareho& Storage', 3, 2517),\n" +
            "(2518, 'SEC', 4210, 'Trucking & Courier Services, Except Air', 3, 2517),\n" +
            "(3626, 'SIC', 4220, 'Public Wareho& Storage', 3, 3620),\n" +
            "(3631, 'SIC', 4230, 'Trucking Terminal Facilities', 3, 3620),\n" +
            "(3621, 'SIC', 4210, 'Trucking & Courier Services, Except Air', 3, 3620),\n" +
            "(3634, 'SIC', 4310, 'US Postal Service', 3, 3633),\n" +
            "(2524, 'SEC', 4410, 'Deep Sea Foreign Transport of Freight', 3, 2523),\n" +
            "(3637, 'SIC', 4410, 'Deep Sea Foreign Transport of Freight', 3, 3636),\n" +
            "(3639, 'SIC', 4420, 'Deep Sea Domestic Transport of Freight', 3, 3636),\n" +
            "(3641, 'SIC', 4430, 'Freight Transport on The Great Lakes', 3, 3636),\n" +
            "(3645, 'SIC', 4480, 'Water Transportation of Passengers', 3, 3636),\n" +
            "(3649, 'SIC', 4490, 'Water Transportation Services', 3, 3636),\n" +
            "(3643, 'SIC', 4440, 'Water Transportation of Freight, nec', 3, 3636),\n" +
            "(2527, 'SEC', 4510, 'Air Transportation, Scheduled', 3, 2526),\n" +
            "(2530, 'SEC', 4520, 'Air Transportation, Nonscheduled', 3, 2526),\n" +
            "(2532, 'SEC', 4580, 'Airports, Flying Fields & Services', 3, 2526),\n" +
            "(3660, 'SIC', 4580, 'Airports, Flying Fields & Services', 3, 3654),\n" +
            "(3655, 'SIC', 4510, 'Air Transportation, Scheduled', 3, 3654),\n" +
            "(3658, 'SIC', 4520, 'Air Transportation, Nonscheduled', 3, 3654),\n" +
            "(2535, 'SEC', 4610, 'Pipelines, Except Natural Gas', 3, 2534),\n" +
            "(3663, 'SIC', 4610, 'Pipelines, Except Natural Gas', 3, 3662),\n" +
            "(2537, 'SEC', 4730, 'Freight Transportation Arrangement', 3, 2536),\n" +
            "(3668, 'SIC', 4720, 'Passenger Transportation Arrangement', 3, 3667),\n" +
            "(3674, 'SIC', 4740, 'Rental of Railroad Cars', 3, 3667),\n" +
            "(3676, 'SIC', 4780, 'Miscellaneous Transportation Services', 3, 3667),\n" +
            "(3672, 'SIC', 4730, 'Freight Transportation Arrangement', 3, 3667),\n" +
            "(2548, 'SEC', 4840, 'Cable & Other Pay TV Services', 3, 2539),\n" +
            "(2540, 'SEC', 4810, 'Telephone Communications', 3, 2539),\n" +
            "(2550, 'SEC', 4890, 'Communications Services, nec', 3, 2539),\n" +
            "(2543, 'SEC', 4820, 'Telegraph & Other Communications', 3, 2539),\n" +
            "(2545, 'SEC', 4830, 'Radio & Television Broadcasting', 3, 2539),\n" +
            "(3686, 'SIC', 4830, 'Radio & Television Broadcasting', 3, 3680),\n" +
            "(3689, 'SIC', 4840, 'Cable & Other Pay TV Services', 3, 3680),\n" +
            "(3681, 'SIC', 4810, 'Telephone Communications', 3, 3680),\n" +
            "(3691, 'SIC', 4890, 'Communications Services, nec', 3, 3680),\n" +
            "(3684, 'SIC', 4820, 'Telegraph & Other Communications', 3, 3680),\n" +
            "(2566, 'SEC', 4960, 'Steam & Air Conditioning Supply', 3, 2552),\n" +
            "(2564, 'SEC', 4950, 'Sanitary Services', 3, 2552),\n" +
            "(2562, 'SEC', 4940, 'Water Supply', 3, 2552),\n" +
            "(2559, 'SEC', 4930, 'Combination Utility Services', 3, 2552),\n" +
            "(2555, 'SEC', 4920, 'Gas Production & Distribution', 3, 2552),\n" +
            "(2553, 'SEC', 4910, 'Electric Services', 3, 2552),\n" +
            "(3701, 'SIC', 4930, 'Combination Utility Services', 3, 3693),\n" +
            "(3707, 'SIC', 4950, 'Sanitary Services', 3, 3693),\n" +
            "(3711, 'SIC', 4960, 'Steam & Air Conditioning Supply', 3, 3693),\n" +
            "(3696, 'SIC', 4920, 'Gas Production & Distribution', 3, 3693),\n" +
            "(3694, 'SIC', 4910, 'Electric Services', 3, 3693),\n" +
            "(3713, 'SIC', 4970, 'Irrigation Systems', 3, 3693),\n" +
            "(3705, 'SIC', 4940, 'Water Supply', 3, 3693),\n" +
            "(2583, 'SEC', 5070, 'Hardware, Plumbing & Heating Equipment', 3, 2568),\n" +
            "(2588, 'SEC', 5090, 'Miscellaneous Durable Goods', 3, 2568),\n" +
            "(2569, 'SEC', 5010, 'Motor Vehicles, Parts & Supplies', 3, 2568),\n" +
            "(2579, 'SEC', 5060, 'Electrical Goods', 3, 2568),\n" +
            "(2572, 'SEC', 5030, 'Lumber & Construction Materials', 3, 2568),\n" +
            "(2571, 'SEC', 5020, 'Furniture & Home Furnishings', 3, 2568),\n" +
            "(2577, 'SEC', 5050, 'Metals & Minerals, Except Petroleum', 3, 2568),\n" +
            "(2574, 'SEC', 5040, 'Professional & Commercial Equipment', 3, 2568),\n" +
            "(2585, 'SEC', 5080, 'Machinery Equipment & Supplies', 3, 2568),\n" +
            "(3737, 'SIC', 5050, 'Metals & Minerals, Except Petroleum', 3, 3715),\n" +
            "(3729, 'SIC', 5040, 'Professional & Commercial Equipment', 3, 3715),\n" +
            "(3749, 'SIC', 5080, 'Machinery Equipment & Supplies', 3, 3715),\n" +
            "(3740, 'SIC', 5060, 'Electrical Goods', 3, 3715),\n" +
            "(3721, 'SIC', 5020, 'Furniture & Home Furnishings', 3, 3715),\n" +
            "(3716, 'SIC', 5010, 'Motor Vehicles, Parts & Supplies', 3, 3715),\n" +
            "(3744, 'SIC', 5070, 'Hardware, Plumbing & Heating Equipment', 3, 3715),\n" +
            "(3724, 'SIC', 5030, 'Lumber & Construction Materials', 3, 3715),\n" +
            "(3756, 'SIC', 5090, 'Miscellaneous Durable Goods', 3, 3715),\n" +
            "(2600, 'SEC', 5170, 'Petroleum & Petroleum Products', 3, 2591),\n" +
            "(2598, 'SEC', 5150, 'Farm-Product Raw Materials', 3, 2591),\n" +
            "(2592, 'SEC', 5110, 'Paper & Paper Products', 3, 2591),\n" +
            "(2593, 'SEC', 5120, 'Drugs, Proprietaries & Sundries', 3, 2591),\n" +
            "(2595, 'SEC', 5130, 'Apparel, Piece Goods & Notations', 3, 2591),\n" +
            "(2596, 'SEC', 5140, 'Groceries & Related Products', 3, 2591),\n" +
            "(2599, 'SEC', 5160, 'Chemicals & Allied Products', 3, 2591),\n" +
            "(2604, 'SEC', 5190, 'Miscellaneous Nondurable Goods', 3, 2591),\n" +
            "(2603, 'SEC', 5180, 'Beer, Wine & Distilled Beverages', 3, 2591),\n" +
            "(3769, 'SIC', 5130, 'Apparel, Piece Goods & Notations', 3, 3762),\n" +
            "(3797, 'SIC', 5190, 'Miscellaneous Nondurable Goods', 3, 3762),\n" +
            "(3763, 'SIC', 5110, 'Paper & Paper Products', 3, 3762),\n" +
            "(3784, 'SIC', 5150, 'Farm-Product Raw Materials', 3, 3762),\n" +
            "(3788, 'SIC', 5160, 'Chemicals & Allied Products', 3, 3762),\n" +
            "(3767, 'SIC', 5120, 'Drugs, Proprietaries & Sundries', 3, 3762),\n" +
            "(3774, 'SIC', 5140, 'Groceries & Related Products', 3, 3762),\n" +
            "(3791, 'SIC', 5170, 'Petroleum & Petroleum Products', 3, 3762),\n" +
            "(3794, 'SIC', 5180, 'Beer, Wine & Distilled Beverages', 3, 3762),\n" +
            "(2606, 'SEC', 5210, 'Lumber & Other Building Materials', 3, 2605),\n" +
            "(2608, 'SEC', 5270, 'Mobile Homes Dealers', 3, 2605),\n" +
            "(3813, 'SIC', 5270, 'Mobile Homes Dealers', 3, 3804),\n" +
            "(3807, 'SIC', 5230, 'Paint, Glass & Wallpaper Stores', 3, 3804),\n" +
            "(3809, 'SIC', 5250, 'Hardware Stores', 3, 3804),\n" +
            "(3811, 'SIC', 5260, 'Retail Nurseries & Garden Stores', 3, 3804),\n" +
            "(3805, 'SIC', 5210, 'Lumber & Other Building Materials', 3, 3804),\n" +
            "(2615, 'SEC', 5390, 'Miscellaneous General Merchandise Stores', 3, 2610),\n" +
            "(2613, 'SEC', 5330, 'Variety Stores', 3, 2610),\n" +
            "(2611, 'SEC', 5310, 'Department Stores', 3, 2610),\n" +
            "(3820, 'SIC', 5390, 'Miscellaneous General Merchandise Stores', 3, 3815),\n" +
            "(3818, 'SIC', 5330, 'Variety Stores', 3, 3815),\n" +
            "(3816, 'SIC', 5310, 'Department Stores', 3, 3815),\n" +
            "(2618, 'SEC', 5410, 'Grocery Stores', 3, 2617),\n" +
            "(3833, 'SIC', 5460, 'Retail Bakeries', 3, 3822),\n" +
            "(3831, 'SIC', 5450, 'Dairy Products Stores', 3, 3822),\n" +
            "(3827, 'SIC', 5430, 'Fruit & Vegetable Markets', 3, 3822),\n" +
            "(3829, 'SIC', 5440, 'Candy, Nut & Confectionery Stores', 3, 3822),\n" +
            "(3835, 'SIC', 5490, 'Miscellaneous Food Stores', 3, 3822),\n" +
            "(3823, 'SIC', 5410, 'Grocery Stores', 3, 3822),\n" +
            "(3825, 'SIC', 5420, 'Meat & Fish Markets', 3, 3822),\n" +
            "(2621, 'SEC', 5530, 'Auto & Home Supply Stores', 3, 2620),\n" +
            "(3850, 'SIC', 5570, 'Motorcycle Dealers', 3, 3837),\n" +
            "(3852, 'SIC', 5590, 'Automotive Dealers, nec', 3, 3837),\n" +
            "(3838, 'SIC', 5510, 'New & Used Car Dealers', 3, 3837),\n" +
            "(3842, 'SIC', 5530, 'Auto & Home Supply Stores', 3, 3837),\n" +
            "(3844, 'SIC', 5540, 'Gasoline Service Stations', 3, 3837),\n" +
            "(3846, 'SIC', 5550, 'Boat Dealers', 3, 3837),\n" +
            "(3848, 'SIC', 5560, 'Recreational Vehicle Dealers', 3, 3837),\n" +
            "(2624, 'SEC', 5620, 'Women''s Clothing Stores', 3, 2623),\n" +
            "(2626, 'SEC', 5650, 'Family Clothing Stores', 3, 2623),\n" +
            "(2628, 'SEC', 5660, 'Shoe Stores', 3, 2623),\n" +
            "(3865, 'SIC', 5660, 'Shoe Stores', 3, 3854),\n" +
            "(3857, 'SIC', 5620, 'Women''s Clothing Stores', 3, 3854),\n" +
            "(4254, 'SIC', 9190, 'General Government, nec', 3, 4247),\n" +
            "(3859, 'SIC', 5630, 'Women''s Accessory & Specialty Stores', 3, 3854),\n" +
            "(3861, 'SIC', 5640, 'Children''s & Infants'' Wear Stores', 3, 3854),\n" +
            "(3855, 'SIC', 5610, 'Men''s & Boys'' Clothing Stores', 3, 3854),\n" +
            "(3863, 'SIC', 5650, 'Family Clothing Stores', 3, 3854),\n" +
            "(3867, 'SIC', 5690, 'Miscellaneous Apparel & Accessory Stores', 3, 3854),\n" +
            "(2633, 'SEC', 5730, 'Radio, Television & Computer Stores', 3, 2630),\n" +
            "(2631, 'SEC', 5710, 'Furniture & Homefurnishing Stores', 3, 2630),\n" +
            "(3870, 'SIC', 5710, 'Furniture & Homefurnishing Stores', 3, 3869),\n" +
            "(3877, 'SIC', 5730, 'Radio, Television & Computer Stores', 3, 3869),\n" +
            "(3875, 'SIC', 5720, 'Household Appliance Stores', 3, 3869),\n" +
            "(2638, 'SEC', 5810, 'Eating & Drinking Places', 3, 2637),\n" +
            "(3883, 'SIC', 5810, 'Eating & Drinking Places', 3, 3882),\n" +
            "(2641, 'SEC', 5910, 'Drug Stores & Proprietary Stores', 3, 2640),\n" +
            "(2648, 'SEC', 5990, 'Retail Stores, nec', 3, 2640),\n" +
            "(2643, 'SEC', 5940, 'Miscellaneous Shopping Goods Stores', 3, 2640),\n" +
            "(2646, 'SEC', 5960, 'Nonstore Retailers', 3, 2640),\n" +
            "(3907, 'SIC', 5980, 'Fuel Dealers', 3, 3886),\n" +
            "(3911, 'SIC', 5990, 'Retail Stores, nec', 3, 3886),\n" +
            "(3891, 'SIC', 5930, 'Used Merchandise Stores', 3, 3886),\n" +
            "(3887, 'SIC', 5910, 'Drug Stores & Proprietary Stores', 3, 3886),\n" +
            "(3889, 'SIC', 5920, 'Liquor Stores', 3, 3886),\n" +
            "(3893, 'SIC', 5940, 'Miscellaneous Shopping Goods Stores', 3, 3886),\n" +
            "(3903, 'SIC', 5960, 'Nonstore Retailers', 3, 3886),\n" +
            "(2654, 'SEC', 6030, 'Savings Institutions', 3, 2649),\n" +
            "(2650, 'SEC', 6020, 'Commercial Banks', 3, 2649),\n" +
            "(2657, 'SEC', 6090, 'Functions Closely Related to Banking', 3, 2649),\n" +
            "(3925, 'SIC', 6030, 'Savings Institutions', 3, 3917),\n" +
            "(3921, 'SIC', 6020, 'Commercial Banks', 3, 3917),\n" +
            "(3928, 'SIC', 6060, 'Credit Unions', 3, 3917),\n" +
            "(3934, 'SIC', 6090, 'Functions Closely Related to Banking', 3, 3917),\n" +
            "(3918, 'SIC', 6010, 'Central Reserve Depositories', 3, 3917),\n" +
            "(3931, 'SIC', 6080, 'Foreign Bank & Branches & Agencies', 3, 3917),\n" +
            "(2667, 'SEC', 6160, 'Mortgage Bankers & Brokers', 3, 2659),\n" +
            "(2664, 'SEC', 6150, 'Business Credit Institutions', 3, 2659),\n" +
            "(2662, 'SEC', 6140, 'Personal Credit Unions', 3, 2659),\n" +
            "(2660, 'SEC', 6110, 'Federal & Federally Sponsored Credit Agencies', 3, 2659),\n" +
            "(3942, 'SIC', 6150, 'Business Credit Institutions', 3, 3937),\n" +
            "(3945, 'SIC', 6160, 'Mortgage Bankers & Brokers', 3, 3937),\n" +
            "(3940, 'SIC', 6140, 'Personal Credit Unions', 3, 3937),\n" +
            "(3938, 'SIC', 6110, 'Federal & Federally Sponsored Credit Agencies', 3, 3937),\n" +
            "(2675, 'SEC', 6280, 'Security & Commodity Services', 3, 2670),\n" +
            "(2673, 'SEC', 6220, 'Commodity Contracts Brokers, Dealers', 3, 2670),\n" +
            "(2671, 'SEC', 6210, 'Security Brokers & Dealers', 3, 2670),\n" +
            "(3955, 'SIC', 6280, 'Security & Commodity Services', 3, 3948),\n" +
            "(3949, 'SIC', 6210, 'Security Brokers & Dealers', 3, 3948),\n" +
            "(3951, 'SIC', 6220, 'Commodity Contracts Brokers, Dealers', 3, 3948),\n" +
            "(3953, 'SIC', 6230, 'Security & Commodity Exchanges', 3, 3948),\n" +
            "(2689, 'SEC', 6390, 'Insurance Carriers, nec', 3, 2677),\n" +
            "(2683, 'SEC', 6330, 'Fire, Marine & Casualty Insurance', 3, 2677),\n" +
            "(2680, 'SEC', 6320, 'Medical Service & Health Insurance', 3, 2677),\n" +
            "(2678, 'SEC', 6310, 'Life Insurance', 3, 2677),\n" +
            "(2687, 'SEC', 6360, 'Title Insurance', 3, 2677),\n" +
            "(2685, 'SEC', 6350, 'Surety Insurance', 3, 2677),\n" +
            "(3970, 'SIC', 6370, 'Pension, Health & Welfare Funds', 3, 3958),\n" +
            "(3959, 'SIC', 6310, 'Life Insurance', 3, 3958),\n" +
            "(3961, 'SIC', 6320, 'Medical Service & Health Insurance', 3, 3958),\n" +
            "(3964, 'SIC', 6330, 'Fire, Marine & Casualty Insurance', 3, 3958),\n" +
            "(3966, 'SIC', 6350, 'Surety Insurance', 3, 3958),\n" +
            "(3968, 'SIC', 6360, 'Title Insurance', 3, 3958),\n" +
            "(3972, 'SIC', 6390, 'Insurance Carriers, nec', 3, 3958),\n" +
            "(2692, 'SEC', 6410, 'Insurance Agents, Brokers & Service', 3, 2691),\n" +
            "(3975, 'SIC', 6410, 'Insurance Agents, Brokers & Service', 3, 3974),\n" +
            "(2695, 'SEC', 6510, 'Real Estate Operators & Lessors', 3, 2694),\n" +
            "(2699, 'SEC', 6530, 'Real Estate Agents & Managers', 3, 2694),\n" +
            "(2701, 'SEC', 6550, 'Subdividers & Developers', 3, 2694),\n" +
            "(3989, 'SIC', 6550, 'Subdividers & Developers', 3, 3977),\n" +
            "(3985, 'SIC', 6530, 'Real Estate Agents & Managers', 3, 3977),\n" +
            "(3987, 'SIC', 6540, 'Title Abstract Offices', 3, 3977),\n" +
            "(3978, 'SIC', 6510, 'Real Estate Operators & Lessors', 3, 3977),\n" +
            "(2704, 'SEC', 6790, 'Miscellaneous Investing', 3, 2703),\n" +
            "(3993, 'SIC', 6710, 'Holding Offices', 3, 3992),\n" +
            "(3996, 'SIC', 6720, 'Investment Offices', 3, 3992),\n" +
            "(4002, 'SIC', 6790, 'Miscellaneous Investing', 3, 3992),\n" +
            "(3999, 'SIC', 6730, 'Trusts', 3, 3992),\n" +
            "(2710, 'SEC', 7010, 'Hotels & Motels', 3, 2709),\n" +
            "(4012, 'SIC', 7030, 'Camps & Recreational Vehicle Parks', 3, 4007),\n" +
            "(4015, 'SIC', 7040, 'Membership Basis Organization Hotels', 3, 4007),\n" +
            "(4010, 'SIC', 7020, 'Rooming & Boarding Houses', 3, 4007),\n" +
            "(4008, 'SIC', 7010, 'Hotels & Motels', 3, 4007),\n" +
            "(4037, 'SIC', 7290, 'Miscellaneous Personal Services', 3, 4017),\n" +
            "(4029, 'SIC', 7230, 'Beauty Shops', 3, 4017),\n" +
            "(4033, 'SIC', 7250, 'Shoe Repair & Shoeshine Parlors', 3, 4017),\n" +
            "(4031, 'SIC', 7240, 'Barber Shops', 3, 4017),\n" +
            "(4018, 'SIC', 7210, 'Laundry, Cleaning & Garment Services', 3, 4017),\n" +
            "(4035, 'SIC', 7260, 'Funeral Service & Crematories', 3, 4017),\n" +
            "(4027, 'SIC', 7220, 'Photographic Studios, Portrait', 3, 4017),\n" +
            "(2725, 'SEC', 7370, 'Computer & Data Processing Services', 3, 2713),\n" +
            "(2720, 'SEC', 7350, 'Misc. Equipment Rental & Leasing', 3, 2713),\n" +
            "(2719, 'SEC', 7340, 'Services to Buildings', 3, 2713),\n" +
            "(2717, 'SEC', 7330, 'Mailing, Reproductive, Stenographic', 3, 2713),\n" +
            "(2716, 'SEC', 7320, 'Credit Reporting & Collection', 3, 2713),\n" +
            "(2714, 'SEC', 7310, 'Advertising', 3, 2713),\n" +
            "(2731, 'SEC', 7380, 'Miscellaneous Business Services', 3, 2713),\n" +
            "(2722, 'SEC', 7360, 'Personnel Supply Services', 3, 2713),\n" +
            "(4055, 'SIC', 7340, 'Services to Buildings', 3, 4040),\n" +
            "(4075, 'SIC', 7380, 'Miscellaneous Business Services', 3, 4040),\n" +
            "(4058, 'SIC', 7350, 'Misc. Equipment Rental & Leasing', 3, 4040),\n" +
            "(4049, 'SIC', 7330, 'Mailing, Reproductive, Stenographic', 3, 4040),\n" +
            "(4046, 'SIC', 7320, 'Credit Reporting & Collection', 3, 4040),\n" +
            "(4065, 'SIC', 7370, 'Computer & Data Processing Services', 3, 4040),\n" +
            "(4062, 'SIC', 7360, 'Personnel Supply Services', 3, 4040),\n" +
            "(4041, 'SIC', 7310, 'Advertising', 3, 4040),\n" +
            "(2736, 'SEC', 7510, 'Automotive Rentals, No Drivers', 3, 2735),\n" +
            "(4097, 'SIC', 7540, 'Automotive Services, Except Repair', 3, 4081),\n" +
            "(4087, 'SIC', 7520, 'Automobile Parking', 3, 4081),\n" +
            "(4089, 'SIC', 7530, 'Automotive Repair Shops', 3, 4081),\n" +
            "(4082, 'SIC', 7510, 'Automotive Rentals, No Drivers', 3, 4081),\n" +
            "(4101, 'SIC', 7620, 'Electrical Repair Shops', 3, 4100),\n" +
            "(4109, 'SIC', 7690, 'Miscellaneous Repair Shops', 3, 4100),\n" +
            "(4105, 'SIC', 7630, 'Watch, Clock & Jewelry Repair', 3, 4100),\n" +
            "(4107, 'SIC', 7640, 'Reupholstery & Furniture Repair', 3, 4100),\n" +
            "(2745, 'SEC', 7830, 'Motion Picture Theaters', 3, 2738),\n" +
            "(2746, 'SEC', 7840, 'Video Tape Rental', 3, 2738),\n" +
            "(2742, 'SEC', 7820, 'Motion Picture Distribution & Services', 3, 2738),\n" +
            "(2739, 'SEC', 7810, 'Motion Picture Production & Services', 3, 2738),\n" +
            "(4120, 'SIC', 7830, 'Motion Picture Theaters', 3, 4113),\n" +
            "(4117, 'SIC', 7820, 'Motion Picture Distribution & Services', 3, 4113),\n" +
            "(4114, 'SIC', 7810, 'Motion Picture Production & Services', 3, 4113),\n" +
            "(4123, 'SIC', 7840, 'Video Tape Rental', 3, 4113),\n" +
            "(2749, 'SEC', 7940, 'Commercial Sports', 3, 2748),\n" +
            "(2751, 'SEC', 7990, 'Misc. Amusement & Recreation Services', 3, 2748),\n" +
            "(4128, 'SIC', 7920, 'Producers, Orchestras, Entertainers', 3, 4125),\n" +
            "(4131, 'SIC', 7930, 'Bowling Centers', 3, 4125),\n" +
            "(4133, 'SIC', 7940, 'Commercial Sports', 3, 4125),\n" +
            "(4136, 'SIC', 7950, 'Ski Facilities', 3, 4125),\n" +
            "(4139, 'SIC', 7990, 'Misc. Amusement & Recreation Services', 3, 4125),\n" +
            "(4126, 'SIC', 7910, 'Dance Studios, Schools & Halls', 3, 4125),\n" +
            "(2764, 'SEC', 8090, 'Health & Allied Services, nec', 3, 2753),\n" +
            "(2762, 'SEC', 8080, 'Home Health Care Services', 3, 2753),\n" +
            "(2754, 'SEC', 8010, 'Offices & Clinics of Medical Doctors', 3, 2753),\n" +
            "(2756, 'SEC', 8050, 'Nursing & Personal Care Facilities', 3, 2753),\n" +
            "(2758, 'SEC', 8060, 'Hospitals', 3, 2753),\n" +
            "(2760, 'SEC', 8070, 'Medical & Dental Laboratories', 3, 2753),\n" +
            "(4171, 'SIC', 8090, 'Health & Allied Services, nec', 3, 4146),\n" +
            "(4158, 'SIC', 8050, 'Nursing & Personal Care Facilities', 3, 4146),\n" +
            "(4153, 'SIC', 8040, 'Offices of Other Health Practitioners', 3, 4146),\n" +
            "(4169, 'SIC', 8080, 'Home Health Care Services', 3, 4146),\n" +
            "(4151, 'SIC', 8030, 'Offices of Osteopathic Physicians', 3, 4146),\n" +
            "(4149, 'SIC', 8020, 'Offices & Clinics of Dentists', 3, 4146),\n" +
            "(4166, 'SIC', 8070, 'Medical & Dental Laboratories', 3, 4146),\n" +
            "(4147, 'SIC', 8010, 'Offices & Clinics of Medical Doctors', 3, 4146),\n" +
            "(4162, 'SIC', 8060, 'Hospitals', 3, 4146),\n" +
            "(2767, 'SEC', 8110, 'Legal Services', 3, 2766),\n" +
            "(4176, 'SIC', 8110, 'Legal Services', 3, 4175),\n" +
            "(4179, 'SIC', 8210, 'Elementary & Secondary Schools', 3, 4178),\n" +
            "(4186, 'SIC', 8240, 'Vocational Schools', 3, 4178),\n" +
            "(4181, 'SIC', 8220, 'Colleges & Universities', 3, 4178),\n" +
            "(4190, 'SIC', 8290, 'Schools & Educational Services, nec', 3, 4178),\n" +
            "(4184, 'SIC', 8230, 'Libraries', 3, 4178),\n" +
            "(2771, 'SEC', 8350, 'Child Day Care Services', 3, 2770),\n" +
            "(4193, 'SIC', 8320, 'Individual & Family Services', 3, 4192),\n" +
            "(4197, 'SIC', 8350, 'Child Day Care Services', 3, 4192),\n" +
            "(4201, 'SIC', 8390, 'Social Services, nec', 3, 4192),\n" +
            "(4195, 'SIC', 8330, 'Job Training & Related Services', 3, 4192),\n" +
            "(4199, 'SIC', 8360, 'Residential Care', 3, 4192),\n" +
            "(4204, 'SIC', 8410, 'Museums & Art Galleries', 3, 4203),\n" +
            "(4206, 'SIC', 8420, 'Botanical & Zoological Gardens', 3, 4203),\n" +
            "(4217, 'SIC', 8650, 'Political Organizations', 3, 4208),\n" +
            "(4221, 'SIC', 8690, 'Membership Organizations, nec', 3, 4208),\n" +
            "(4213, 'SIC', 8630, 'Labor Organizations', 3, 4208),\n" +
            "(4209, 'SIC', 8610, 'Business Associations', 3, 4208),\n" +
            "(4211, 'SIC', 8620, 'Professional Organizations', 3, 4208),\n" +
            "(4215, 'SIC', 8640, 'Civic & Social Organizations', 3, 4208),\n" +
            "(4219, 'SIC', 8660, 'Religious Organizations', 3, 4208),\n" +
            "(2780, 'SEC', 8740, 'Management & Public Relations', 3, 2774),\n" +
            "(2775, 'SEC', 8710, 'Engineering & Architectural Services', 3, 2774),\n" +
            "(2777, 'SEC', 8730, 'Research & Testing Services', 3, 2774),\n" +
            "(4228, 'SIC', 8720, 'Accounting, Auditing & Bookkeeping', 3, 4223),\n" +
            "(4235, 'SIC', 8740, 'Management & Public Relations', 3, 4223),\n" +
            "(4224, 'SIC', 8710, 'Engineering & Architectural Services', 3, 4223),\n" +
            "(4230, 'SIC', 8730, 'Research & Testing Services', 3, 4223),\n" +
            "(4242, 'SIC', 8810, 'Private Households', 3, 4241),\n" +
            "(4245, 'SIC', 8990, 'Services, nec', 3, 4244),\n" +
            "(4252, 'SIC', 9130, 'Executive & Legislative Combined', 3, 4247),\n" +
            "(4250, 'SIC', 9120, 'Legislative Bodies', 3, 4247),\n" +
            "(4248, 'SIC', 9110, 'Executive Offices', 3, 4247),\n" +
            "(4259, 'SIC', 9220, 'Public Order & Safety', 3, 4256),\n" +
            "(4266, 'SIC', 9310, 'Finance, Taxation & Monetary Policy', 3, 4265),\n" +
            "(4275, 'SIC', 9450, 'Administration of Veteran''s Affairs', 3, 4268),\n" +
            "(4271, 'SIC', 9430, 'Admin. of Public Health Programs', 3, 4268),\n" +
            "(4273, 'SIC', 9440, 'Admin. of Social & Manpower Programs', 3, 4268),\n" +
            "(4269, 'SIC', 9410, 'Admin. of Educational Programs', 3, 4268),\n" +
            "(4278, 'SIC', 9510, 'Environmental Quality', 3, 4277),\n" +
            "(4281, 'SIC', 9530, 'Ho& Urban Development', 3, 4277),\n" +
            "(4289, 'SIC', 9630, 'Regulation, Admin. of Utilities', 3, 4284),\n" +
            "(4293, 'SIC', 9650, 'Regulation Misc. Commercial Sectors', 3, 4284),\n" +
            "(4295, 'SIC', 9660, 'Space Research & Technology', 3, 4284),\n" +
            "(4287, 'SIC', 9620, 'Regulation, Admin. of Transportation', 3, 4284),\n" +
            "(4285, 'SIC', 9610, 'Administration of General Economic Programs', 3, 4284),\n" +
            "(4291, 'SIC', 9640, 'Regulation of Agricultural Marketing', 3, 4284),\n" +
            "(2786, 'SEC', 9720, 'International Affairs', 3, 2785),\n" +
            "(4300, 'SIC', 9720, 'International Affairs', 3, 4297),\n" +
            "(4298, 'SIC', 9710, 'National Security', 3, 4297),\n" +
            "(4303, 'SIC', 9990, 'Nonclassifiable Establishments', 3, 4302);\n";
    static String industryCodeInsert10 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(1, 'SEC', 2677, 6300, 2, 2689, 6390, 3),\n" +
            "(2, 'NAICS', 1666, 5415, 3, 1671, 541519, 5),\n" +
            "(3, 'NAICS', 931, 423, 2, 999, 42384, 4),\n" +
            "(4, 'SEC', 2791, 20, 1, 2362, 3240, 3),\n" +
            "(5, 'SEC', 2792, 40, 1, 2538, 4731, 4),\n" +
            "(6, 'SIC', 3815, 5300, 2, 3820, 5390, 3),\n" +
            "(7, 'NAICS', 1809, 56299, 4, 1810, 562991, 5),\n" +
            "(8, 'SIC', 4314, 90, 1, 4251, 9121, 4),\n" +
            "(9, 'NAICS', 1612, 5324, 3, 1617, 53242, 4),\n" +
            "(10, 'NAICS', 1868, 62139, 4, 1870, 621399, 5),\n" +
            "(11, 'NAICS', 1026, 4243, 3, 1031, 424330, 5),\n" +
            "(12, 'SIC', 4311, 52, 1, 3890, 5921, 4),\n" +
            "(13, 'NAICS', 1942, 71, 1, 1971, 712110, 5),\n" +
            "(14, 'SIC', 4313, 70, 1, 4067, 7372, 4),\n" +
            "(15, 'SIC', 3474, 3590, 3, 3475, 3592, 4),\n" +
            "(16, 'SIC', 4308, 20, 1, 3275, 3083, 4),\n" +
            "(17, 'NAICS', 2037, 81, 1, 2083, 812220, 5),\n" +
            "(18, 'SIC', 4314, 90, 1, 4254, 9190, 3),\n" +
            "(19, 'SIC', 2834, 250, 3, 2838, 254, 4),\n" +
            "(20, 'NAICS', 56, 112, 2, 93, 11292, 4),\n" +
            "(21, 'NAICS', 1555, 5251, 3, 1561, 52519, 4),\n" +
            "(22, 'SEC', 2384, 3400, 2, 2395, 3448, 4),\n" +
            "(23, 'SIC', 3409, 3490, 3, 3418, 3499, 4),\n" +
            "(24, 'NAICS', 1, 11, 1, 130, 115310, 5),\n" +
            "(25, 'NAICS', 1625, 541, 2, 1629, 541120, 5),\n" +
            "(26, 'SIC', 3050, 2200, 2, 3072, 2273, 4),\n" +
            "(27, 'SIC', 4040, 7300, 2, 4054, 7338, 4),\n" +
            "(28, 'SEC', 2795, 60, 1, 2695, 6510, 3),\n" +
            "(29, 'NAICS', 1431, 5122, 3, 1437, 51223, 4),\n" +
            "(30, 'NAICS', 930, 42, 1, 1088, 42499, 4),\n" +
            "(31, 'NAICS', 1684, 54171, 4, 1686, 541712, 5),\n" +
            "(32, 'NAICS', 1726, 561, 2, 1754, 56149, 4),\n" +
            "(33, 'SIC', 4082, 7510, 3, 4086, 7519, 4),\n" +
            "(34, 'SIC', 3744, 5070, 3, 3745, 5072, 4),\n" +
            "(35, 'SEC', 2795, 60, 1, 2680, 6320, 3),\n" +
            "(36, 'NAICS', 930, 42, 1, 1016, 4241, 3),\n" +
            "(37, 'NAICS', 1792, 562, 2, 1804, 5629, 3),\n" +
            "(38, 'NAICS', 236, 2381, 3, 247, 238160, 5),\n" +
            "(39, 'SEC', 2572, 5030, 3, 2573, 5031, 4),\n" +
            "(40, 'NAICS', 1555, 5251, 3, 1556, 525110, 5),\n" +
            "(41, 'NAICS', 1570, 531, 2, 1574, 531120, 5),\n" +
            "(42, 'SIC', 3246, 2890, 3, 3247, 2891, 4),\n" +
            "(43, 'NAICS', 134, 2111, 3, 137, 211112, 5),\n" +
            "(44, 'NAICS', 1725, 56, 1, 1732, 56121, 4),\n" +
            "(45, 'NAICS', 1972, 71211, 4, 1971, 712110, 5),\n" +
            "(46, 'NAICS', 1624, 54, 1, 1654, 54137, 4),\n" +
            "(47, 'NAICS', 2003, 72, 1, 2023, 72231, 4),\n" +
            "(48, 'SEC', 2791, 20, 1, 2407, 3524, 4),\n" +
            "(49, 'NAICS', 1026, 4243, 3, 1033, 424340, 5),\n" +
            "(50, 'NAICS', 1738, 56132, 4, 1737, 561320, 5),\n" +
            "(51, 'NAICS', 1943, 711, 2, 1961, 711320, 5),\n" +
            "(52, 'SIC', 4308, 20, 1, 3486, 3624, 4),\n" +
            "(53, 'NAICS', 1625, 541, 2, 1633, 541199, 5),\n" +
            "(54, 'NAICS', 2131, 814, 2, 2133, 814110, 5),\n" +
            "(55, 'SIC', 4075, 7380, 3, 4080, 7389, 4),\n" +
            "(56, 'SIC', 2982, 2000, 2, 3036, 2095, 4),\n" +
            "(57, 'SIC', 4311, 52, 1, 3905, 5962, 4),\n" +
            "(58, 'NAICS', 68, 1123, 3, 78, 11239, 4),\n" +
            "(59, 'SEC', 2794, 52, 1, 2620, 5500, 2),\n" +
            "(60, 'NAICS', 1402, 51, 1, 1472, 519110, 5),\n" +
            "(61, 'SIC', 4308, 20, 1, 3055, 2230, 3),\n" +
            "(62, 'NAICS', 2189, 9261, 3, 2192, 926120, 5),\n" +
            "(63, 'SIC', 3587, 3950, 3, 3588, 3951, 4),\n" +
            "(64, 'SIC', 4310, 50, 1, 3752, 5084, 4),\n" +
            "(65, 'SIC', 2798, 100, 2, 2821, 181, 4),\n" +
            "(66, 'SIC', 4311, 52, 1, 3832, 5451, 4),\n" +
            "(67, 'NAICS', 132, 21, 1, 177, 213113, 5),\n" +
            "(68, 'NAICS', 1725, 56, 1, 1772, 561621, 5),\n" +
            "(69, 'SIC', 3371, 3400, 2, 3410, 3491, 4),\n" +
            "(70, 'SIC', 4308, 20, 1, 3280, 3088, 4),\n" +
            "(71, 'SIC', 4308, 20, 1, 3182, 2672, 4),\n" +
            "(72, 'NAICS', 1979, 713, 2, 1999, 713950, 5),\n" +
            "(73, 'NAICS', 1850, 62, 1, 1939, 6244, 3),\n" +
            "(74, 'NAICS', 1733, 5613, 3, 1736, 561312, 5),\n" +
            "(75, 'NAICS', 182, 2211, 3, 188, 221115, 5),\n" +
            "(76, 'NAICS', 2135, 92, 1, 2194, 926130, 5),\n" +
            "(77, 'SIC', 3419, 3500, 2, 3468, 3580, 3),\n" +
            "(78, 'NAICS', 138, 212, 2, 170, 212393, 5),\n" +
            "(79, 'SIC', 2811, 160, 3, 2812, 161, 4),\n" +
            "(80, 'SIC', 4308, 20, 1, 3199, 2741, 4),\n" +
            "(81, 'NAICS', 1010, 42393, 4, 1009, 423930, 5),\n" +
            "(82, 'SEC', 2748, 7900, 2, 2752, 7997, 4),\n" +
            "(83, 'SIC', 4306, 10, 1, 2928, 1450, 3),\n" +
            "(84, 'SIC', 3050, 2200, 2, 3078, 2295, 4),\n" +
            "(85, 'NAICS', 930, 42, 1, 951, 423330, 5),\n" +
            "(86, 'NAICS', 2, 111, 2, 8, 111130, 5),\n" +
            "(87, 'SIC', 4308, 20, 1, 3243, 2874, 4),\n" +
            "(88, 'SIC', 2825, 200, 2, 2844, 279, 4),\n" +
            "(89, 'SEC', 2795, 60, 1, 2694, 6500, 2),\n" +
            "(90, 'SIC', 4305, 1, 1, 2834, 250, 3),\n" +
            "(91, 'SEC', 2791, 20, 1, 2326, 2835, 4),\n" +
            "(92, 'SIC', 4002, 6790, 3, 4005, 6798, 4),\n" +
            "(93, 'SIC', 4314, 90, 1, 4252, 9130, 3),\n" +
            "(94, 'NAICS', 1485, 522, 2, 1502, 522292, 5),\n" +
            "(95, 'NAICS', 138, 212, 2, 167, 21239, 4),\n" +
            "(96, 'SIC', 4312, 60, 1, 3968, 6360, 3),\n" +
            "(97, 'NAICS', 1979, 713, 2, 1996, 71393, 4),\n" +
            "(98, 'SIC', 3337, 3300, 2, 3358, 3354, 4),\n" +
            "(99, 'SIC', 3937, 6100, 2, 3938, 6110, 3),\n" +
            "(100, 'NAICS', 1985, 7132, 3, 1988, 713290, 5),\n" +
            "(101, 'NAICS', 1591, 532, 2, 1597, 53212, 4),\n" +
            "(102, 'NAICS', 56, 112, 2, 73, 112330, 5),\n" +
            "(103, 'SIC', 3083, 2300, 2, 3102, 2353, 4),\n" +
            "(104, 'SIC', 4268, 9400, 2, 4274, 9441, 4),\n" +
            "(105, 'NAICS', 931, 423, 2, 1008, 42392, 4),\n" +
            "(106, 'SIC', 4308, 20, 1, 3025, 2079, 4),\n" +
            "(107, 'SIC', 3570, 3850, 3, 3571, 3851, 4),\n" +
            "(108, 'NAICS', 1813, 611, 2, 1825, 61141, 4),\n" +
            "(109, 'SEC', 2689, 6390, 3, 2690, 6399, 4),\n" +
            "(110, 'NAICS', 1943, 711, 2, 1964, 711410, 5),\n" +
            "(111, 'SIC', 3496, 3640, 3, 3503, 3648, 4),\n" +
            "(112, 'SIC', 4308, 20, 1, 3431, 3535, 4),\n" +
            "(113, 'SIC', 4309, 40, 1, 3705, 4940, 3),\n" +
            "(114, 'SIC', 4308, 20, 1, 3240, 2869, 4),\n" +
            "(115, 'SIC', 3480, 3600, 2, 3514, 3674, 4),\n" +
            "(116, 'SIC', 4101, 7620, 3, 4103, 7623, 4),\n" +
            "(117, 'NAICS', 236, 2381, 3, 237, 238110, 5),\n" +
            "(118, 'NAICS', 930, 42, 1, 1010, 42393, 4),\n" +
            "(119, 'NAICS', 1569, 53, 1, 1622, 533110, 5),\n" +
            "(120, 'SIC', 4055, 7340, 3, 4057, 7349, 4),\n" +
            "(121, 'NAICS', 205, 23, 1, 245, 238150, 5),\n" +
            "(122, 'SEC', 2384, 3400, 2, 2385, 3410, 3),\n" +
            "(123, 'SEC', 2526, 4500, 2, 2527, 4510, 3),\n" +
            "(124, 'NAICS', 2, 111, 2, 30, 111332, 5),\n" +
            "(125, 'SIC', 3527, 3710, 3, 3531, 3715, 4),\n" +
            "(126, 'SIC', 3526, 3700, 2, 3544, 3760, 3),\n" +
            "(127, 'SIC', 4018, 7210, 3, 4019, 7211, 4),\n" +
            "(128, 'SEC', 2791, 20, 1, 2361, 3231, 4),\n" +
            "(129, 'SIC', 4040, 7300, 2, 4080, 7389, 4),\n" +
            "(130, 'NAICS', 931, 423, 2, 961, 42343, 4),\n" +
            "(131, 'SIC', 3769, 5130, 3, 3773, 5139, 4),\n" +
            "(132, 'NAICS', 1060, 42459, 4, 1059, 424590, 5),\n" +
            "(133, 'SIC', 2847, 700, 2, 2851, 721, 4),\n" +
            "(134, 'NAICS', 2071, 812, 2, 2102, 81299, 4),\n" +
            "(135, 'NAICS', 931, 423, 2, 978, 423620, 5),\n" +
            "(136, 'NAICS', 1969, 712, 2, 1976, 71213, 4),\n" +
            "(137, 'NAICS', 2021, 7223, 3, 2027, 72233, 4),\n" +
            "(138, 'NAICS', 2080, 8122, 3, 2084, 81222, 4),\n" +
            "(139, 'SIC', 4208, 8600, 2, 4211, 8620, 3),\n" +
            "(140, 'SEC', 2385, 3410, 3, 2387, 3412, 4),\n" +
            "(141, 'SIC', 4309, 40, 1, 3714, 4971, 4),\n" +
            "(142, 'NAICS', 1, 11, 1, 124, 115115, 5),\n" +
            "(143, 'SEC', 2384, 3400, 2, 2402, 3490, 3),\n" +
            "(144, 'SEC', 2796, 70, 1, 2718, 7331, 4),\n" +
            "(145, 'SIC', 3384, 3440, 3, 3390, 3448, 4),\n" +
            "(146, 'NAICS', 2103, 813, 2, 2110, 813212, 5),\n" +
            "(147, 'NAICS', 1920, 624, 2, 1926, 624190, 5),\n" +
            "(148, 'NAICS', 930, 42, 1, 1035, 4244, 3),\n" +
            "(149, 'SIC', 4307, 15, 1, 2981, 1799, 4),\n" +
            "(150, 'NAICS', 1726, 561, 2, 1742, 561410, 5),\n" +
            "(151, 'SIC', 3261, 3000, 2, 3279, 3087, 4),\n" +
            "(152, 'SEC', 2280, 2450, 3, 2282, 2452, 4),\n" +
            "(153, 'SEC', 2738, 7800, 2, 2741, 7819, 4),\n" +
            "(154, 'SIC', 3667, 4700, 2, 3675, 4741, 4),\n" +
            "(155, 'SIC', 4308, 20, 1, 3165, 2591, 4),\n" +
            "(156, 'NAICS', 2037, 81, 1, 2048, 81119, 4),\n" +
            "(157, 'NAICS', 1725, 56, 1, 1739, 561330, 5),\n" +
            "(158, 'SIC', 3384, 3440, 3, 3386, 3442, 4),\n" +
            "(159, 'SIC', 3992, 6700, 2, 4005, 6798, 4),\n" +
            "(160, 'NAICS', 930, 42, 1, 945, 42322, 4),\n" +
            "(161, 'SIC', 3715, 5000, 2, 3718, 5013, 4),\n" +
            "(162, 'NAICS', 1717, 54199, 4, 1716, 541990, 5),\n" +
            "(163, 'SEC', 2337, 2900, 2, 2341, 2990, 3),\n" +
            "(164, 'SIC', 4306, 10, 1, 2894, 1060, 3),\n" +
            "(165, 'NAICS', 931, 423, 2, 998, 423840, 5),\n" +
            "(166, 'NAICS', 1, 11, 1, 111, 114111, 5),\n" +
            "(167, 'NAICS', 2, 111, 2, 29, 111331, 5),\n" +
            "(168, 'SIC', 3721, 5020, 3, 3722, 5021, 4),\n" +
            "(169, 'NAICS', 1774, 5617, 3, 1780, 56173, 4),\n" +
            "(170, 'SIC', 3059, 2250, 3, 3062, 2253, 4),\n" +
            "(171, 'NAICS', 2150, 922, 2, 2156, 922130, 5),\n" +
            "(172, 'NAICS', 1513, 523, 2, 1527, 523910, 5),\n" +
            "(173, 'SIC', 3837, 5500, 2, 3847, 5551, 4),\n" +
            "(174, 'NAICS', 156, 2123, 3, 167, 21239, 4),\n" +
            "(175, 'SIC', 3854, 5600, 2, 3866, 5661, 4),\n" +
            "(176, 'SIC', 4302, 9900, 2, 4303, 9990, 3),\n" +
            "(177, 'NAICS', 1962, 71132, 4, 1961, 711320, 5),\n" +
            "(178, 'NAICS', 2058, 8113, 3, 2060, 81131, 4),\n" +
            "(179, 'SIC', 4308, 20, 1, 3417, 3498, 4),\n" +
            "(180, 'SIC', 4309, 40, 1, 3688, 4833, 4),\n" +
            "(181, 'SIC', 4307, 15, 1, 2975, 1790, 3),\n" +
            "(182, 'NAICS', 1419, 512, 2, 1428, 51219, 4),\n" +
            "(183, 'SIC', 2971, 1770, 3, 2972, 1771, 4),\n" +
            "(184, 'SIC', 3301, 3200, 2, 3309, 3240, 3),\n" +
            "(185, 'NAICS', 1726, 561, 2, 1768, 561611, 5),\n" +
            "(186, 'SIC', 3877, 5730, 3, 3878, 5731, 4),\n" +
            "(187, 'SEC', 2713, 7300, 2, 2730, 7377, 4),\n" +
            "(188, 'SIC', 3190, 2700, 2, 3213, 2796, 4),\n" +
            "(189, 'SIC', 4126, 7910, 3, 4127, 7911, 4),\n" +
            "(190, 'NAICS', 156, 2123, 3, 170, 212393, 5),\n" +
            "(191, 'NAICS', 930, 42, 1, 1012, 42394, 4),\n" +
            "(192, 'NAICS', 132, 21, 1, 153, 21229, 4),\n" +
            "(193, 'SIC', 3526, 3700, 2, 3531, 3715, 4),\n" +
            "(194, 'SEC', 2791, 20, 1, 2329, 2842, 4),\n" +
            "(195, 'NAICS', 1570, 531, 2, 1572, 531110, 5),\n" +
            "(196, 'SIC', 4313, 70, 1, 4164, 8063, 4),\n" +
            "(197, 'NAICS', 219, 2371, 3, 221, 23711, 4),\n" +
            "(198, 'NAICS', 1547, 5242, 3, 1549, 52421, 4),\n" +
            "(199, 'NAICS', 1, 11, 1, 92, 112920, 5),\n" +
            "(200, 'NAICS', 2071, 812, 2, 2094, 812910, 5),\n" +
            "(201, 'NAICS', 930, 42, 1, 1039, 42442, 4),\n" +
            "(202, 'NAICS', 1624, 54, 1, 1689, 5418, 3),\n" +
            "(203, 'NAICS', 1859, 6213, 3, 1870, 621399, 5),\n" +
            "(204, 'SIC', 2884, 1000, 2, 2892, 1041, 4),\n" +
            "(205, 'SIC', 4308, 20, 1, 3440, 3546, 4),\n" +
            "(206, 'SIC', 2798, 100, 2, 2824, 191, 4),\n" +
            "(207, 'NAICS', 1943, 711, 2, 1958, 7113, 3),\n" +
            "(208, 'SIC', 4146, 8000, 2, 4157, 8049, 4),\n" +
            "(209, 'NAICS', 98, 113, 2, 105, 1133, 3),\n" +
            "(210, 'NAICS', 1, 11, 1, 44, 111910, 5),\n" +
            "(211, 'NAICS', 1859, 6213, 3, 1868, 62139, 4),\n" +
            "(212, 'SEC', 2664, 6150, 3, 2665, 6153, 4),\n" +
            "(213, 'SEC', 2791, 20, 1, 2497, 3861, 4),\n" +
            "(214, 'NAICS', 1526, 5239, 3, 1534, 523991, 5),\n" +
            "(215, 'NAICS', 930, 42, 1, 971, 423510, 5),\n" +
            "(216, 'NAICS', 1624, 54, 1, 1661, 54142, 4),\n" +
            "(217, 'NAICS', 56, 112, 2, 96, 112990, 5),\n" +
            "(218, 'SIC', 3815, 5300, 2, 3819, 5331, 4),\n" +
            "(219, 'SIC', 3294, 3160, 3, 3295, 3161, 4),\n" +
            "(220, 'NAICS', 1980, 7131, 3, 1984, 71312, 4),\n" +
            "(221, 'NAICS', 138, 212, 2, 152, 212234, 5),\n" +
            "(222, 'NAICS', 1016, 4241, 3, 1017, 424110, 5),\n" +
            "(223, 'SIC', 4153, 8040, 3, 4156, 8043, 4),\n" +
            "(224, 'SIC', 4308, 20, 1, 3377, 3423, 4),\n" +
            "(225, 'SIC', 3886, 5900, 2, 3915, 5995, 4),\n" +
            "(226, 'SIC', 4312, 60, 1, 3939, 6111, 4),\n" +
            "(227, 'NAICS', 931, 423, 2, 992, 423810, 5),\n" +
            "(228, 'NAICS', 930, 42, 1, 975, 4236, 3),\n" +
            "(229, 'SIC', 4306, 10, 1, 2886, 1011, 4),\n" +
            "(230, 'NAICS', 946, 4233, 3, 950, 42332, 4),\n" +
            "(231, 'SIC', 3774, 5140, 3, 3780, 5146, 4),\n" +
            "(232, 'SIC', 3167, 2600, 2, 3187, 2677, 4),\n" +
            "(233, 'SIC', 3620, 4200, 2, 3625, 4215, 4),\n" +
            "(234, 'SIC', 2955, 1700, 2, 2976, 1791, 4),\n" +
            "(235, 'SEC', 2796, 70, 1, 2758, 8060, 3),\n" +
            "(236, 'NAICS', 1467, 5182, 3, 1468, 518210, 5),\n" +
            "(237, 'NAICS', 2010, 72119, 4, 2012, 721199, 5),\n" +
            "(238, 'SIC', 3552, 3800, 2, 3561, 3826, 4),\n" +
            "(239, 'SIC', 3636, 4400, 2, 3637, 4410, 3),\n" +
            "(240, 'SIC', 3886, 5900, 2, 3906, 5963, 4),\n" +
            "(241, 'NAICS', 1851, 621, 2, 1884, 621512, 5),\n" +
            "(242, 'NAICS', 1, 11, 1, 115, 114210, 5),\n" +
            "(243, 'NAICS', 2135, 92, 1, 2175, 92314, 4),\n" +
            "(244, 'NAICS', 153, 21229, 4, 155, 212299, 5),\n" +
            "(245, 'SIC', 4313, 70, 1, 4021, 7213, 4),\n" +
            "(246, 'SIC', 3214, 2800, 2, 3226, 2833, 4),\n" +
            "(247, 'NAICS', 2137, 9211, 3, 2148, 921190, 5),\n" +
            "(248, 'SEC', 2794, 52, 1, 2625, 5621, 4),\n" +
            "(249, 'NAICS', 1624, 54, 1, 1664, 541490, 5),\n" +
            "(250, 'NAICS', 132, 21, 1, 137, 211112, 5),\n" +
            "(251, 'SIC', 4308, 20, 1, 3317, 3261, 4),\n" +
            "(252, 'NAICS', 1506, 5223, 3, 1512, 52239, 4),\n" +
            "(253, 'NAICS', 1871, 6214, 3, 1874, 621420, 5),\n" +
            "(254, 'SIC', 3067, 2260, 3, 3069, 2262, 4),\n" +
            "(255, 'SIC', 3917, 6000, 2, 3931, 6080, 3),\n" +
            "(256, 'NAICS', 2182, 925, 2, 2186, 925120, 5),\n" +
            "(257, 'SIC', 3576, 3900, 2, 3593, 3961, 4),\n" +
            "(258, 'SIC', 4308, 20, 1, 3137, 2440, 3),\n" +
            "(259, 'NAICS', 1625, 541, 2, 1680, 54162, 4),\n" +
            "(260, 'SIC', 4309, 40, 1, 3622, 4212, 4),\n" +
            "(261, 'NAICS', 1792, 562, 2, 1798, 5622, 3),\n" +
            "(262, 'NAICS', 236, 2381, 3, 246, 23815, 4),\n" +
            "(263, 'SEC', 2224, 1380, 3, 2225, 1381, 4),\n" +
            "(264, 'NAICS', 1, 11, 1, 114, 1142, 3),\n" +
            "(265, 'SIC', 4308, 20, 1, 3327, 3275, 4),\n" +
            "(266, 'SIC', 3371, 3400, 2, 3404, 3480, 3),\n" +
            "(267, 'SIC', 4311, 52, 1, 3866, 5661, 4),\n" +
            "(268, 'NAICS', 1625, 541, 2, 1659, 54141, 4),\n" +
            "(269, 'SIC', 4208, 8600, 2, 4215, 8640, 3),\n" +
            "(270, 'NAICS', 1569, 53, 1, 1599, 532210, 5),\n" +
            "(271, 'NAICS', 1726, 561, 2, 1736, 561312, 5),\n" +
            "(272, 'SIC', 4268, 9400, 2, 4269, 9410, 3),\n" +
            "(273, 'NAICS', 1071, 4248, 3, 1075, 42482, 4),\n" +
            "(274, 'SIC', 3309, 3240, 3, 3310, 3241, 4),\n" +
            "(275, 'SIC', 4308, 20, 1, 3288, 3142, 4),\n" +
            "(276, 'SIC', 4312, 60, 1, 3918, 6010, 3),\n" +
            "(277, 'NAICS', 1, 11, 1, 9, 11113, 4),\n" +
            "(278, 'NAICS', 1740, 56133, 4, 1739, 561330, 5),\n" +
            "(279, 'SEC', 2795, 60, 1, 2699, 6530, 3),\n" +
            "(280, 'SIC', 3762, 5100, 2, 3788, 5160, 3),\n" +
            "(281, 'NAICS', 930, 42, 1, 989, 423740, 5),\n" +
            "(282, 'NAICS', 1420, 5121, 3, 1430, 512199, 5),\n" +
            "(283, 'SEC', 2229, 1500, 2, 2231, 1530, 3),\n" +
            "(284, 'SIC', 2882, 970, 3, 2883, 971, 4),\n" +
            "(285, 'SIC', 3301, 3200, 2, 3336, 3299, 4),\n" +
            "(286, 'SIC', 3605, 4100, 2, 3606, 4110, 3),\n" +
            "(287, 'SEC', 2588, 5090, 3, 2589, 5094, 4),\n" +
            "(288, 'NAICS', 167, 21239, 4, 168, 212391, 5),\n" +
            "(289, 'NAICS', 930, 42, 1, 1004, 4239, 3),\n" +
            "(290, 'SIC', 4305, 1, 1, 2806, 131, 4),\n" +
            "(291, 'SIC', 2858, 750, 3, 2860, 752, 4),\n" +
            "(292, 'NAICS', 205, 23, 1, 229, 2373, 3),\n" +
            "(293, 'SIC', 3468, 3580, 3, 3472, 3586, 4),\n" +
            "(294, 'NAICS', 931, 423, 2, 1013, 423990, 5),\n" +
            "(295, 'SEC', 2434, 3600, 2, 2444, 3651, 4),\n" +
            "(296, 'SIC', 4308, 20, 1, 3184, 2674, 4),\n" +
            "(297, 'SIC', 3083, 2300, 2, 3105, 2369, 4),\n" +
            "(298, 'SIC', 3925, 6030, 3, 3926, 6035, 4),\n" +
            "(299, 'SIC', 3000, 2040, 3, 3002, 2043, 4),\n" +
            "(300, 'SIC', 3371, 3400, 2, 3379, 3429, 4),\n" +
            "(301, 'SEC', 2791, 20, 1, 2390, 3433, 4),\n" +
            "(302, 'SIC', 3886, 5900, 2, 3911, 5990, 3),\n" +
            "(303, 'SIC', 4313, 70, 1, 4122, 7833, 4),\n" +
            "(304, 'SEC', 2795, 60, 1, 2658, 6099, 4),\n" +
            "(305, 'NAICS', 1850, 62, 1, 1891, 62199, 4),\n" +
            "(306, 'SIC', 4308, 20, 1, 3131, 2430, 3),\n" +
            "(307, 'NAICS', 1859, 6213, 3, 1861, 62131, 4),\n" +
            "(308, 'SIC', 3564, 3840, 3, 3565, 3841, 4),\n" +
            "(309, 'SIC', 4055, 7340, 3, 4056, 7342, 4),\n" +
            "(310, 'NAICS', 205, 23, 1, 235, 238, 2),\n" +
            "(311, 'NAICS', 1640, 5413, 3, 1646, 54133, 4),\n" +
            "(312, 'NAICS', 1554, 525, 2, 1568, 52599, 4),\n" +
            "(313, 'SEC', 2791, 20, 1, 2421, 3564, 4),\n" +
            "(314, 'NAICS', 1402, 51, 1, 1411, 511140, 5),\n" +
            "(315, 'SEC', 2683, 6330, 3, 2684, 6331, 4),\n" +
            "(316, 'SIC', 4305, 1, 1, 2801, 112, 4),\n" +
            "(317, 'NAICS', 1813, 611, 2, 1822, 61131, 4),\n" +
            "(318, 'SEC', 2753, 8000, 2, 2762, 8080, 3),\n" +
            "(319, 'NAICS', 2037, 81, 1, 2086, 812310, 5),\n" +
            "(320, 'NAICS', 2003, 72, 1, 2012, 721199, 5),\n" +
            "(321, 'SIC', 4308, 20, 1, 3248, 2892, 4),\n" +
            "(322, 'SIC', 3419, 3500, 2, 3476, 3593, 4),\n" +
            "(323, 'NAICS', 1725, 56, 1, 1804, 5629, 3),\n" +
            "(324, 'SEC', 2791, 20, 1, 2300, 2670, 3),\n" +
            "(325, 'NAICS', 1500, 52229, 4, 1501, 522291, 5),\n" +
            "(326, 'NAICS', 1850, 62, 1, 1883, 621511, 5),\n" +
            "(327, 'SIC', 4308, 20, 1, 3101, 2350, 3),\n" +
            "(328, 'SIC', 4313, 70, 1, 4243, 8811, 4),\n" +
            "(329, 'SIC', 2939, 1500, 2, 2947, 1542, 4),\n" +
            "(330, 'SIC', 3992, 6700, 2, 3993, 6710, 3),\n" +
            "(331, 'NAICS', 1452, 517, 2, 1459, 5174, 3),\n" +
            "(332, 'NAICS', 1015, 424, 2, 1072, 424810, 5),\n" +
            "(333, 'NAICS', 1549, 52421, 4, 1548, 524210, 5),\n" +
            "(334, 'NAICS', 1624, 54, 1, 1645, 541330, 5),\n" +
            "(335, 'SEC', 2539, 4800, 2, 2541, 4812, 4);\n";
    static String industryCodeInsert11 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(336, 'NAICS', 2151, 9221, 3, 2163, 92216, 4),\n" +
            "(337, 'SIC', 3215, 2810, 3, 3217, 2813, 4),\n" +
            "(338, 'NAICS', 1657, 5414, 3, 1658, 541410, 5),\n" +
            "(339, 'NAICS', 1726, 561, 2, 1759, 561510, 5),\n" +
            "(340, 'NAICS', 205, 23, 1, 208, 23611, 4),\n" +
            "(341, 'NAICS', 1089, 425, 2, 1094, 42512, 4),\n" +
            "(342, 'NAICS', 1920, 624, 2, 1936, 6243, 3),\n" +
            "(343, 'NAICS', 2103, 813, 2, 2123, 813920, 5),\n" +
            "(344, 'SIC', 2825, 200, 2, 2840, 270, 3),\n" +
            "(345, 'SEC', 2796, 70, 1, 2744, 7829, 4),\n" +
            "(346, 'SIC', 3419, 3500, 2, 3425, 3524, 4),\n" +
            "(347, 'SEC', 2790, 15, 1, 2230, 1520, 3),\n" +
            "(348, 'SIC', 3012, 2060, 3, 3013, 2061, 4),\n" +
            "(349, 'NAICS', 1065, 42469, 4, 1064, 424690, 5),\n" +
            "(350, 'NAICS', 1804, 5629, 3, 1808, 56292, 4),\n" +
            "(351, 'SIC', 4313, 70, 1, 4044, 7313, 4),\n" +
            "(352, 'NAICS', 2020, 722, 2, 2030, 72241, 4),\n" +
            "(353, 'SIC', 4305, 1, 1, 2882, 970, 3),\n" +
            "(354, 'SIC', 3419, 3500, 2, 3449, 3556, 4),\n" +
            "(355, 'NAICS', 3, 1111, 3, 5, 11111, 4),\n" +
            "(356, 'SIC', 3083, 2300, 2, 3113, 2387, 4),\n" +
            "(357, 'SIC', 3667, 4700, 2, 3670, 4725, 4),\n" +
            "(358, 'NAICS', 218, 237, 2, 228, 23721, 4),\n" +
            "(359, 'NAICS', 1470, 519, 2, 1479, 51919, 4),\n" +
            "(360, 'SIC', 4313, 70, 1, 4231, 8731, 4),\n" +
            "(361, 'NAICS', 2113, 81331, 4, 2115, 813312, 5),\n" +
            "(362, 'SIC', 3762, 5100, 2, 3767, 5120, 3),\n" +
            "(363, 'NAICS', 1725, 56, 1, 1747, 56143, 4),\n" +
            "(364, 'NAICS', 930, 42, 1, 932, 4231, 3),\n" +
            "(365, 'SEC', 2371, 3300, 2, 2379, 3341, 4),\n" +
            "(366, 'NAICS', 273, 2389, 3, 274, 238910, 5),\n" +
            "(367, 'NAICS', 1998, 71394, 4, 1997, 713940, 5),\n" +
            "(368, 'NAICS', 1990, 7139, 3, 1993, 713920, 5),\n" +
            "(369, 'SEC', 2677, 6300, 2, 2682, 6324, 4),\n" +
            "(370, 'NAICS', 102, 1132, 3, 104, 11321, 4),\n" +
            "(371, 'NAICS', 931, 423, 2, 964, 423450, 5),\n" +
            "(372, 'NAICS', 1015, 424, 2, 1030, 42432, 4),\n" +
            "(373, 'NAICS', 180, 22, 1, 199, 221310, 5),\n" +
            "(374, 'SIC', 3891, 5930, 3, 3892, 5932, 4),\n" +
            "(375, 'NAICS', 930, 42, 1, 1032, 42433, 4),\n" +
            "(376, 'NAICS', 1471, 5191, 3, 1478, 519190, 5),\n" +
            "(377, 'NAICS', 982, 4237, 3, 984, 42371, 4),\n" +
            "(378, 'SIC', 3131, 2430, 3, 3132, 2431, 4),\n" +
            "(379, 'SIC', 3489, 3630, 3, 3493, 3634, 4),\n" +
            "(380, 'SIC', 4312, 60, 1, 3994, 6712, 4),\n" +
            "(381, 'SIC', 4313, 70, 1, 4025, 7218, 4),\n" +
            "(382, 'SIC', 3020, 2070, 3, 3023, 2076, 4),\n" +
            "(383, 'SIC', 4040, 7300, 2, 4078, 7383, 4),\n" +
            "(384, 'NAICS', 1076, 4249, 3, 1086, 42495, 4),\n" +
            "(385, 'NAICS', 2108, 81321, 4, 2109, 813211, 5),\n" +
            "(386, 'SIC', 4307, 15, 1, 2974, 1781, 4),\n" +
            "(387, 'SIC', 3050, 2200, 2, 3070, 2269, 4),\n" +
            "(388, 'SIC', 4311, 52, 1, 3876, 5722, 4),\n" +
            "(389, 'SIC', 4309, 40, 1, 3614, 4141, 4),\n" +
            "(390, 'SIC', 4308, 20, 1, 3098, 2340, 3),\n" +
            "(391, 'SIC', 3893, 5940, 3, 3897, 5944, 4),\n" +
            "(392, 'SIC', 2909, 1300, 2, 2913, 1321, 4),\n" +
            "(393, 'NAICS', 1611, 53231, 4, 1610, 532310, 5),\n" +
            "(394, 'NAICS', 2, 111, 2, 53, 111991, 5),\n" +
            "(395, 'SIC', 3048, 2140, 3, 3049, 2141, 4),\n" +
            "(396, 'NAICS', 1812, 61, 1, 1840, 61162, 4),\n" +
            "(397, 'SEC', 2789, 10, 1, 2225, 1381, 4),\n" +
            "(398, 'NAICS', 62, 11212, 4, 61, 112120, 5),\n" +
            "(399, 'SEC', 2791, 20, 1, 2444, 3651, 4),\n" +
            "(400, 'SIC', 4308, 20, 1, 3332, 3292, 4),\n" +
            "(401, 'SIC', 3693, 4900, 2, 3708, 4952, 4),\n" +
            "(402, 'SIC', 3886, 5900, 2, 3903, 5960, 3),\n" +
            "(403, 'SEC', 2355, 3200, 2, 2370, 3290, 3),\n" +
            "(404, 'SIC', 4308, 20, 1, 3181, 2671, 4),\n" +
            "(405, 'SIC', 3083, 2300, 2, 3119, 2394, 4),\n" +
            "(406, 'SEC', 2791, 20, 1, 2499, 3873, 4),\n" +
            "(407, 'NAICS', 1402, 51, 1, 1441, 51229, 4),\n" +
            "(408, 'SIC', 4308, 20, 1, 3306, 3229, 4),\n" +
            "(409, 'SEC', 2262, 2200, 2, 2267, 2250, 3),\n" +
            "(410, 'SEC', 2793, 50, 1, 2603, 5180, 3),\n" +
            "(411, 'SIC', 3576, 3900, 2, 3579, 3914, 4),\n" +
            "(412, 'NAICS', 932, 4231, 3, 935, 423120, 5),\n" +
            "(413, 'NAICS', 1725, 56, 1, 1746, 561422, 5),\n" +
            "(414, 'NAICS', 1452, 517, 2, 1461, 51741, 4),\n" +
            "(415, 'SIC', 4308, 20, 1, 2982, 2000, 2),\n" +
            "(416, 'SIC', 3555, 3820, 3, 3563, 3829, 4),\n" +
            "(417, 'SIC', 3461, 3570, 3, 3463, 3572, 4),\n" +
            "(418, 'SEC', 2795, 60, 1, 2702, 6552, 4),\n" +
            "(419, 'NAICS', 2080, 8122, 3, 2082, 81221, 4),\n" +
            "(420, 'SEC', 2794, 52, 1, 2627, 5651, 4),\n" +
            "(421, 'SIC', 4312, 60, 1, 3952, 6221, 4),\n" +
            "(422, 'SIC', 4313, 70, 1, 4229, 8721, 4),\n" +
            "(423, 'SIC', 3180, 2670, 3, 3189, 2679, 4),\n" +
            "(424, 'SIC', 4040, 7300, 2, 4051, 7334, 4),\n" +
            "(425, 'SIC', 3634, 4310, 3, 3635, 4311, 4),\n" +
            "(426, 'SIC', 4308, 20, 1, 3444, 3550, 3),\n" +
            "(427, 'SIC', 4313, 70, 1, 4023, 7216, 4),\n" +
            "(428, 'NAICS', 1, 11, 1, 49, 11193, 4),\n" +
            "(429, 'SEC', 2791, 20, 1, 2261, 2111, 4),\n" +
            "(430, 'NAICS', 1876, 62149, 4, 1879, 621493, 5),\n" +
            "(431, 'SIC', 3854, 5600, 2, 3857, 5620, 3),\n" +
            "(432, 'SEC', 2659, 6100, 2, 4320, 6170, 3),\n" +
            "(433, 'NAICS', 1084, 42494, 4, 1083, 424940, 5),\n" +
            "(434, 'SIC', 3167, 2600, 2, 3175, 2652, 4),\n" +
            "(435, 'NAICS', 205, 23, 1, 269, 238350, 5),\n" +
            "(436, 'SIC', 2948, 1600, 2, 2954, 1629, 4),\n" +
            "(437, 'NAICS', 1471, 5191, 3, 1477, 51913, 4),\n" +
            "(438, 'NAICS', 1871, 6214, 3, 1877, 621491, 5),\n" +
            "(439, 'NAICS', 1836, 6116, 3, 1839, 611620, 5),\n" +
            "(440, 'NAICS', 1851, 621, 2, 1886, 621610, 5),\n" +
            "(441, 'SIC', 4247, 9100, 2, 4249, 9111, 4),\n" +
            "(442, 'SIC', 3511, 3670, 3, 3513, 3672, 4),\n" +
            "(443, 'SIC', 4308, 20, 1, 3488, 3629, 4),\n" +
            "(444, 'NAICS', 1035, 4244, 3, 1053, 42449, 4),\n" +
            "(445, 'NAICS', 1624, 54, 1, 1683, 5417, 3),\n" +
            "(446, 'SIC', 4312, 60, 1, 3978, 6510, 3),\n" +
            "(447, 'SIC', 2955, 1700, 2, 2957, 1711, 4),\n" +
            "(448, 'SEC', 2794, 52, 1, 2646, 5960, 3),\n" +
            "(449, 'SEC', 2791, 20, 1, 2247, 2030, 3),\n" +
            "(450, 'NAICS', 117, 115, 2, 125, 115116, 5),\n" +
            "(451, 'SIC', 3301, 3200, 2, 3302, 3210, 3),\n" +
            "(452, 'SIC', 4308, 20, 1, 3129, 2426, 4),\n" +
            "(453, 'SIC', 3419, 3500, 2, 3462, 3571, 4),\n" +
            "(454, 'SIC', 3804, 5200, 2, 3812, 5261, 4),\n" +
            "(455, 'NAICS', 1624, 54, 1, 1634, 5412, 3),\n" +
            "(456, 'NAICS', 1, 11, 1, 58, 11211, 4),\n" +
            "(457, 'SIC', 4314, 90, 1, 4255, 9191, 4),\n" +
            "(458, 'SIC', 4082, 7510, 3, 4083, 7513, 4),\n" +
            "(459, 'SEC', 2791, 20, 1, 2397, 3451, 4),\n" +
            "(460, 'NAICS', 1741, 5614, 3, 1750, 561440, 5),\n" +
            "(461, 'SEC', 2403, 3500, 2, 2409, 3531, 4),\n" +
            "(462, 'NAICS', 56, 112, 2, 85, 11251, 4),\n" +
            "(463, 'NAICS', 930, 42, 1, 940, 42314, 4),\n" +
            "(464, 'NAICS', 1547, 5242, 3, 1553, 524298, 5),\n" +
            "(465, 'NAICS', 2093, 8129, 3, 2098, 812922, 5),\n" +
            "(466, 'SIC', 2798, 100, 2, 2804, 119, 4),\n" +
            "(467, 'SIC', 2909, 1300, 2, 2911, 1311, 4),\n" +
            "(468, 'NAICS', 2137, 9211, 3, 2147, 92115, 4),\n" +
            "(469, 'SEC', 2657, 6090, 3, 2658, 6099, 4),\n" +
            "(470, 'SIC', 4308, 20, 1, 3313, 3253, 4),\n" +
            "(471, 'SIC', 4310, 50, 1, 3716, 5010, 3),\n" +
            "(472, 'SIC', 3055, 2230, 3, 3056, 2231, 4),\n" +
            "(473, 'SIC', 4309, 40, 1, 3639, 4420, 3),\n" +
            "(474, 'SIC', 3083, 2300, 2, 3114, 2389, 4),\n" +
            "(475, 'NAICS', 138, 212, 2, 140, 21211, 4),\n" +
            "(476, 'NAICS', 1066, 4247, 3, 1069, 424720, 5),\n" +
            "(477, 'SEC', 2791, 20, 1, 2265, 2220, 3),\n" +
            "(478, 'SIC', 3993, 6710, 3, 3995, 6719, 4),\n" +
            "(479, 'NAICS', 1850, 62, 1, 1859, 6213, 3),\n" +
            "(480, 'SIC', 4269, 9410, 3, 4270, 9411, 4),\n" +
            "(481, 'NAICS', 1569, 53, 1, 1614, 532411, 5),\n" +
            "(482, 'NAICS', 1625, 541, 2, 1705, 54189, 4),\n" +
            "(483, 'SIC', 4228, 8720, 3, 4229, 8721, 4),\n" +
            "(484, 'SEC', 2791, 20, 1, 2476, 3800, 2),\n" +
            "(485, 'SEC', 2680, 6320, 3, 2681, 6321, 4),\n" +
            "(486, 'SIC', 2918, 1400, 2, 2920, 1411, 4),\n" +
            "(487, 'SIC', 3696, 4920, 3, 3700, 4925, 4),\n" +
            "(488, 'NAICS', 1871, 6214, 3, 1873, 62141, 4),\n" +
            "(489, 'SIC', 4308, 20, 1, 3268, 3053, 4),\n" +
            "(490, 'SIC', 4308, 20, 1, 3305, 3221, 4),\n" +
            "(491, 'SIC', 3083, 2300, 2, 3090, 2325, 4),\n" +
            "(492, 'SIC', 3167, 2600, 2, 3183, 2673, 4),\n" +
            "(493, 'NAICS', 1591, 532, 2, 1613, 53241, 4),\n" +
            "(494, 'SIC', 3693, 4900, 2, 3698, 4923, 4),\n" +
            "(495, 'NAICS', 1625, 541, 2, 1662, 541430, 5),\n" +
            "(496, 'NAICS', 2167, 9231, 3, 2172, 923130, 5),\n" +
            "(497, 'SIC', 3266, 3050, 3, 3267, 3052, 4),\n" +
            "(498, 'NAICS', 1443, 5151, 3, 1444, 51511, 4),\n" +
            "(499, 'NAICS', 1928, 6242, 3, 1933, 624229, 5),\n" +
            "(500, 'SIC', 3338, 3310, 3, 3343, 3317, 4),\n" +
            "(501, 'SEC', 2792, 40, 1, 2565, 4953, 4),\n" +
            "(502, 'NAICS', 2037, 81, 1, 2134, 81411, 4),\n" +
            "(503, 'NAICS', 1881, 6215, 3, 1883, 621511, 5),\n" +
            "(504, 'NAICS', 1402, 51, 1, 1418, 51121, 4),\n" +
            "(505, 'SEC', 2791, 20, 1, 2285, 2511, 4),\n" +
            "(506, 'SIC', 3384, 3440, 3, 3385, 3441, 4),\n" +
            "(507, 'NAICS', 1598, 5322, 3, 1599, 532210, 5),\n" +
            "(508, 'SIC', 4308, 20, 1, 3163, 2542, 4),\n" +
            "(509, 'SEC', 2649, 6000, 2, 2652, 6022, 4),\n" +
            "(510, 'SIC', 4100, 7600, 2, 4102, 7622, 4),\n" +
            "(511, 'NAICS', 182, 2211, 3, 185, 221112, 5),\n" +
            "(512, 'NAICS', 1591, 532, 2, 1606, 532291, 5),\n" +
            "(513, 'NAICS', 1943, 711, 2, 1967, 711510, 5),\n" +
            "(514, 'NAICS', 1526, 5239, 3, 1535, 523999, 5),\n" +
            "(515, 'SEC', 2568, 5000, 2, 2574, 5040, 3),\n" +
            "(516, 'SIC', 4314, 90, 1, 4287, 9620, 3),\n" +
            "(517, 'SIC', 4308, 20, 1, 3513, 3672, 4),\n" +
            "(518, 'NAICS', 2135, 92, 1, 2178, 924110, 5),\n" +
            "(519, 'SIC', 4311, 52, 1, 3857, 5620, 3),\n" +
            "(520, 'NAICS', 1554, 525, 2, 1558, 525120, 5),\n" +
            "(521, 'NAICS', 1, 11, 1, 94, 112930, 5),\n" +
            "(522, 'NAICS', 98, 113, 2, 103, 113210, 5),\n" +
            "(523, 'NAICS', 931, 423, 2, 985, 423720, 5),\n" +
            "(524, 'NAICS', 1969, 712, 2, 1972, 71211, 4),\n" +
            "(525, 'SIC', 3985, 6530, 3, 3986, 6531, 4),\n" +
            "(526, 'SIC', 4308, 20, 1, 3554, 3812, 4),\n" +
            "(527, 'SIC', 3077, 2290, 3, 3080, 2297, 4),\n" +
            "(528, 'NAICS', 1485, 522, 2, 1488, 52211, 4),\n" +
            "(529, 'NAICS', 1583, 5313, 3, 1590, 53139, 4),\n" +
            "(530, 'SIC', 4075, 7380, 3, 4078, 7383, 4),\n" +
            "(531, 'SIC', 3137, 2440, 3, 3139, 2448, 4),\n" +
            "(532, 'SIC', 4018, 7210, 3, 4020, 7212, 4),\n" +
            "(533, 'SIC', 3050, 2200, 2, 3079, 2296, 4),\n" +
            "(534, 'SIC', 4311, 52, 1, 3883, 5810, 3),\n" +
            "(535, 'SIC', 2982, 2000, 2, 3001, 2041, 4),\n" +
            "(536, 'SIC', 4309, 40, 1, 3689, 4840, 3),\n" +
            "(537, 'NAICS', 1536, 524, 2, 1538, 52411, 4),\n" +
            "(538, 'SIC', 3480, 3600, 2, 3504, 3650, 3),\n" +
            "(539, 'NAICS', 1852, 6211, 3, 1854, 621111, 5),\n" +
            "(540, 'SIC', 4309, 40, 1, 3658, 4520, 3),\n" +
            "(541, 'NAICS', 1979, 713, 2, 1981, 713110, 5),\n" +
            "(542, 'NAICS', 1812, 61, 1, 1817, 6112, 3),\n" +
            "(543, 'SIC', 4306, 10, 1, 2884, 1000, 2),\n" +
            "(544, 'NAICS', 1725, 56, 1, 1726, 561, 2),\n" +
            "(545, 'SIC', 3282, 3100, 2, 3287, 3140, 3),\n" +
            "(546, 'NAICS', 1640, 5413, 3, 1642, 54131, 4),\n" +
            "(547, 'NAICS', 205, 23, 1, 267, 238340, 5),\n" +
            "(548, 'NAICS', 930, 42, 1, 1038, 424420, 5),\n" +
            "(549, 'SIC', 4308, 20, 1, 3343, 3317, 4),\n" +
            "(550, 'NAICS', 2126, 81393, 4, 2125, 813930, 5),\n" +
            "(551, 'NAICS', 2038, 811, 2, 2048, 81119, 4),\n" +
            "(552, 'NAICS', 1741, 5614, 3, 1753, 56145, 4),\n" +
            "(553, 'NAICS', 1035, 4244, 3, 1040, 424430, 5),\n" +
            "(554, 'NAICS', 1809, 56299, 4, 1811, 562998, 5),\n" +
            "(555, 'NAICS', 1725, 56, 1, 1798, 5622, 3),\n" +
            "(556, 'NAICS', 1882, 62151, 4, 1883, 621511, 5),\n" +
            "(557, 'SEC', 2670, 6200, 2, 2676, 6282, 4),\n" +
            "(558, 'SIC', 3419, 3500, 2, 3460, 3569, 4),\n" +
            "(559, 'NAICS', 1453, 5171, 3, 1454, 517110, 5),\n" +
            "(560, 'SIC', 4308, 20, 1, 3263, 3011, 4),\n" +
            "(561, 'SIC', 3252, 2900, 2, 3258, 2990, 3),\n" +
            "(562, 'SIC', 3680, 4800, 2, 3691, 4890, 3),\n" +
            "(563, 'SIC', 4311, 52, 1, 3844, 5540, 3),\n" +
            "(564, 'NAICS', 1480, 52, 1, 1529, 523920, 5),\n" +
            "(565, 'SEC', 2774, 8700, 2, 2781, 8741, 4),\n" +
            "(566, 'SIC', 3059, 2250, 3, 3064, 2257, 4),\n" +
            "(567, 'NAICS', 2072, 8121, 3, 2075, 812112, 5),\n" +
            "(568, 'NAICS', 1699, 54185, 4, 1698, 541850, 5),\n" +
            "(569, 'NAICS', 1634, 5412, 3, 1637, 541213, 5),\n" +
            "(570, 'NAICS', 235, 238, 2, 251, 238190, 5),\n" +
            "(571, 'NAICS', 982, 4237, 3, 986, 42372, 4),\n" +
            "(572, 'NAICS', 1591, 532, 2, 1612, 5324, 3),\n" +
            "(573, 'SIC', 3330, 3290, 3, 3331, 3291, 4),\n" +
            "(574, 'NAICS', 1015, 424, 2, 1065, 42469, 4),\n" +
            "(575, 'NAICS', 2037, 81, 1, 2114, 813311, 5),\n" +
            "(576, 'SIC', 3654, 4500, 2, 3657, 4513, 4),\n" +
            "(577, 'SEC', 2302, 2700, 2, 2318, 2790, 3),\n" +
            "(578, 'NAICS', 1480, 52, 1, 1488, 52211, 4),\n" +
            "(579, 'SIC', 4310, 50, 1, 3725, 5031, 4),\n" +
            "(580, 'SEC', 2384, 3400, 2, 2389, 3430, 3),\n" +
            "(581, 'SEC', 2791, 20, 1, 2352, 3089, 4),\n" +
            "(582, 'SIC', 3869, 5700, 2, 3874, 5719, 4),\n" +
            "(583, 'SEC', 2240, 2000, 2, 2248, 2033, 4),\n" +
            "(584, 'NAICS', 1625, 541, 2, 1671, 541519, 5),\n" +
            "(585, 'SIC', 3886, 5900, 2, 3904, 5961, 4),\n" +
            "(586, 'NAICS', 1725, 56, 1, 1803, 562219, 5),\n" +
            "(587, 'SIC', 2884, 1000, 2, 2894, 1060, 3),\n" +
            "(588, 'SIC', 4313, 70, 1, 4016, 7041, 4),\n" +
            "(589, 'NAICS', 205, 23, 1, 274, 238910, 5),\n" +
            "(590, 'NAICS', 2108, 81321, 4, 2111, 813219, 5),\n" +
            "(591, 'NAICS', 2037, 81, 1, 2079, 812199, 5),\n" +
            "(592, 'NAICS', 28, 11133, 4, 31, 111333, 5),\n" +
            "(593, 'NAICS', 1734, 56131, 4, 1736, 561312, 5),\n" +
            "(594, 'SIC', 3489, 3630, 3, 3495, 3639, 4),\n" +
            "(595, 'NAICS', 1726, 561, 2, 1755, 561491, 5),\n" +
            "(596, 'NAICS', 2058, 8113, 3, 2059, 811310, 5),\n" +
            "(597, 'SIC', 4309, 40, 1, 3702, 4931, 4),\n" +
            "(598, 'SIC', 4081, 7500, 2, 4098, 7542, 4),\n" +
            "(599, 'NAICS', 1513, 523, 2, 1514, 5231, 3),\n" +
            "(600, 'SIC', 4309, 40, 1, 3672, 4730, 3),\n" +
            "(601, 'NAICS', 2038, 811, 2, 2068, 81143, 4),\n" +
            "(602, 'SEC', 2794, 52, 1, 2606, 5210, 3),\n" +
            "(603, 'SIC', 4313, 70, 1, 4242, 8810, 3),\n" +
            "(604, 'SEC', 4324, 6190, 3, 4325, 6199, 4),\n" +
            "(605, 'SIC', 4308, 20, 1, 3017, 2066, 4),\n" +
            "(606, 'SEC', 2793, 50, 1, 2587, 5084, 4),\n" +
            "(607, 'NAICS', 1725, 56, 1, 1750, 561440, 5),\n" +
            "(608, 'NAICS', 2038, 811, 2, 2058, 8113, 3),\n" +
            "(609, 'SIC', 4308, 20, 1, 3582, 3931, 4),\n" +
            "(610, 'SIC', 3355, 3350, 3, 3358, 3354, 4),\n" +
            "(611, 'SIC', 4308, 20, 1, 3418, 3499, 4),\n" +
            "(612, 'NAICS', 1850, 62, 1, 1885, 6216, 3),\n" +
            "(613, 'SIC', 4308, 20, 1, 3477, 3594, 4),\n" +
            "(614, 'NAICS', 975, 4236, 3, 979, 42362, 4),\n" +
            "(615, 'NAICS', 1015, 424, 2, 1026, 4243, 3),\n" +
            "(616, 'NAICS', 1726, 561, 2, 1764, 561591, 5),\n" +
            "(617, 'SIC', 4305, 1, 1, 2832, 240, 3),\n" +
            "(618, 'SIC', 4311, 52, 1, 3870, 5710, 3),\n" +
            "(619, 'NAICS', 132, 21, 1, 144, 2122, 3),\n" +
            "(620, 'NAICS', 1613, 53241, 4, 1615, 532412, 5),\n" +
            "(621, 'NAICS', 930, 42, 1, 1022, 42413, 4),\n" +
            "(622, 'SIC', 3964, 6330, 3, 3965, 6331, 4),\n" +
            "(623, 'SIC', 3715, 5000, 2, 3744, 5070, 3),\n" +
            "(624, 'SEC', 2791, 20, 1, 2269, 2270, 3),\n" +
            "(625, 'SIC', 4311, 52, 1, 3907, 5980, 3),\n" +
            "(626, 'NAICS', 1, 11, 1, 64, 11213, 4),\n" +
            "(627, 'SEC', 2791, 20, 1, 2431, 3580, 3),\n" +
            "(628, 'SIC', 3822, 5400, 2, 3828, 5431, 4),\n" +
            "(629, 'SIC', 3316, 3260, 3, 3318, 3262, 4),\n" +
            "(630, 'NAICS', 132, 21, 1, 147, 21222, 4),\n" +
            "(631, 'NAICS', 1513, 523, 2, 1515, 523110, 5),\n" +
            "(632, 'SIC', 3371, 3400, 2, 3372, 3410, 3),\n" +
            "(633, 'SEC', 2552, 4900, 2, 2559, 4930, 3),\n" +
            "(634, 'SIC', 4308, 20, 1, 3388, 3444, 4),\n" +
            "(635, 'SIC', 4306, 10, 1, 2923, 1423, 4),\n" +
            "(636, 'SIC', 4308, 20, 1, 3260, 2999, 4),\n" +
            "(637, 'NAICS', 1513, 523, 2, 1523, 5232, 3),\n" +
            "(638, 'SIC', 4306, 10, 1, 2892, 1041, 4),\n" +
            "(639, 'SEC', 2791, 20, 1, 2425, 3571, 4),\n" +
            "(640, 'SIC', 4289, 9630, 3, 4290, 9631, 4),\n" +
            "(641, 'NAICS', 198, 2213, 3, 203, 221330, 5),\n" +
            "(642, 'NAICS', 1462, 5179, 3, 1463, 51791, 4),\n" +
            "(643, 'SIC', 4313, 70, 1, 4027, 7220, 3),\n" +
            "(644, 'SIC', 3762, 5100, 2, 3793, 5172, 4),\n" +
            "(645, 'SIC', 3729, 5040, 3, 3735, 5048, 4),\n" +
            "(646, 'NAICS', 1850, 62, 1, 1896, 622110, 5),\n" +
            "(647, 'NAICS', 2013, 7212, 3, 2016, 721214, 5),\n" +
            "(648, 'NAICS', 931, 423, 2, 1003, 42386, 4),\n" +
            "(649, 'NAICS', 930, 42, 1, 1051, 42448, 4),\n" +
            "(650, 'NAICS', 1942, 71, 1, 1958, 7113, 3),\n" +
            "(651, 'NAICS', 2003, 72, 1, 2036, 722515, 5),\n" +
            "(652, 'SEC', 2796, 70, 1, 2775, 8710, 3),\n" +
            "(653, 'NAICS', 98, 113, 2, 107, 11331, 4),\n" +
            "(654, 'NAICS', 1561, 52519, 4, 1560, 525190, 5),\n" +
            "(655, 'NAICS', 1570, 531, 2, 1575, 53112, 4),\n" +
            "(656, 'NAICS', 1725, 56, 1, 1769, 561612, 5),\n" +
            "(657, 'SEC', 2518, 4210, 3, 2519, 4213, 4),\n" +
            "(658, 'SIC', 3301, 3200, 2, 3304, 3220, 3),\n" +
            "(659, 'SIC', 4203, 8400, 2, 4204, 8410, 3),\n" +
            "(660, 'NAICS', 1635, 54121, 4, 1637, 541213, 5),\n" +
            "(661, 'SIC', 4310, 50, 1, 3794, 5180, 3),\n" +
            "(662, 'NAICS', 1725, 56, 1, 1778, 56172, 4),\n" +
            "(663, 'NAICS', 1850, 62, 1, 1920, 624, 2),\n" +
            "(664, 'NAICS', 2038, 811, 2, 2050, 811192, 5),\n" +
            "(665, 'SIC', 4308, 20, 1, 3126, 2411, 4),\n" +
            "(666, 'SIC', 3451, 3560, 3, 3457, 3566, 4),\n" +
            "(667, 'NAICS', 2, 111, 2, 40, 11142, 4),\n" +
            "(668, 'NAICS', 1403, 511, 2, 1410, 51113, 4),\n" +
            "(669, 'SIC', 3241, 2870, 3, 3245, 2879, 4),\n" +
            "(670, 'SIC', 3564, 3840, 3, 3568, 3844, 4),\n" +
            "(671, 'SIC', 3552, 3800, 2, 3554, 3812, 4),\n" +
            "(672, 'NAICS', 1813, 611, 2, 1831, 61151, 4),\n" +
            "(673, 'NAICS', 132, 21, 1, 159, 212312, 5),\n" +
            "(674, 'NAICS', 2135, 92, 1, 2155, 92212, 4),\n" +
            "(675, 'SEC', 2791, 20, 1, 2377, 3334, 4),\n" +
            "(676, 'SIC', 3968, 6360, 3, 3969, 6361, 4),\n" +
            "(677, 'SEC', 2283, 2500, 2, 2285, 2511, 4),\n" +
            "(678, 'SIC', 3419, 3500, 2, 3436, 3542, 4),\n" +
            "(679, 'NAICS', 1, 11, 1, 11, 11114, 4),\n" +
            "(680, 'NAICS', 1510, 52232, 4, 1509, 522320, 5),\n" +
            "(681, 'NAICS', 1402, 51, 1, 1403, 511, 2),\n" +
            "(682, 'SEC', 2234, 1600, 2, 2235, 1620, 3),\n" +
            "(683, 'SIC', 3833, 5460, 3, 3834, 5461, 4),\n" +
            "(684, 'NAICS', 931, 423, 2, 1011, 423940, 5),\n" +
            "(685, 'NAICS', 931, 423, 2, 994, 423820, 5),\n" +
            "(686, 'NAICS', 1431, 5122, 3, 1436, 512230, 5),\n" +
            "(687, 'SIC', 3083, 2300, 2, 3095, 2335, 4),\n" +
            "(688, 'NAICS', 1979, 713, 2, 2002, 71399, 4),\n" +
            "(689, 'SEC', 2479, 3820, 3, 2486, 3827, 4),\n" +
            "(690, 'SIC', 4313, 70, 1, 4208, 8600, 2),\n" +
            "(691, 'SEC', 2792, 40, 1, 2518, 4210, 3),\n" +
            "(692, 'SIC', 4303, 9990, 3, 4304, 9999, 4),\n" +
            "(693, 'NAICS', 253, 2382, 3, 258, 238290, 5),\n" +
            "(694, 'SIC', 3434, 3540, 3, 3442, 3548, 4),\n" +
            "(695, 'NAICS', 173, 2131, 3, 175, 213111, 5),\n" +
            "(696, 'SEC', 2796, 70, 1, 2737, 7600, 2),\n" +
            "(697, 'SIC', 2884, 1000, 2, 2886, 1011, 4),\n" +
            "(698, 'NAICS', 182, 2211, 3, 184, 221111, 5),\n" +
            "(699, 'NAICS', 1831, 61151, 4, 1833, 611512, 5),\n" +
            "(700, 'SEC', 2749, 7940, 3, 2750, 7948, 4),\n" +
            "(701, 'SIC', 3423, 3520, 3, 3425, 3524, 4),\n" +
            "(702, 'SIC', 4305, 1, 1, 2831, 219, 4),\n" +
            "(703, 'SIC', 2918, 1400, 2, 2934, 1479, 4),\n" +
            "(704, 'SIC', 4311, 52, 1, 3909, 5984, 4),\n" +
            "(705, 'SIC', 3124, 2400, 2, 3147, 2499, 4),\n" +
            "(706, 'SIC', 4308, 20, 1, 3429, 3533, 4),\n" +
            "(707, 'SIC', 4312, 60, 1, 3946, 6162, 4),\n" +
            "(708, 'NAICS', 1813, 611, 2, 1838, 61161, 4),\n" +
            "(709, 'SIC', 3353, 3340, 3, 3354, 3341, 4),\n" +
            "(710, 'SIC', 4312, 60, 1, 3919, 6011, 4),\n" +
            "(711, 'SIC', 4313, 70, 1, 4192, 8300, 2),\n" +
            "(712, 'SEC', 2713, 7300, 2, 2720, 7350, 3),\n" +
            "(713, 'NAICS', 931, 423, 2, 1007, 423920, 5),\n" +
            "(714, 'NAICS', 1419, 512, 2, 1431, 5122, 3),\n" +
            "(715, 'NAICS', 156, 2123, 3, 162, 21232, 4),\n" +
            "(716, 'SEC', 2789, 10, 1, 2223, 1311, 4),\n" +
            "(717, 'NAICS', 1078, 42491, 4, 1077, 424910, 5),\n" +
            "(718, 'SIC', 4313, 70, 1, 4176, 8110, 3),\n" +
            "(719, 'SEC', 2791, 20, 1, 2346, 3021, 4),\n" +
            "(720, 'SIC', 2799, 110, 3, 2801, 112, 4),\n" +
            "(721, 'SIC', 3774, 5140, 3, 3779, 5145, 4),\n" +
            "(722, 'NAICS', 930, 42, 1, 941, 4232, 3),\n" +
            "(723, 'NAICS', 2003, 72, 1, 2008, 721120, 5),\n" +
            "(724, 'SIC', 3840, 5520, 3, 3841, 5521, 4),\n" +
            "(725, 'NAICS', 1970, 7121, 3, 1972, 71211, 4),\n" +
            "(726, 'NAICS', 1402, 51, 1, 1475, 51912, 4),\n" +
            "(727, 'NAICS', 1725, 56, 1, 1730, 5612, 3),\n" +
            "(728, 'SIC', 4308, 20, 1, 3093, 2330, 3),\n" +
            "(729, 'NAICS', 931, 423, 2, 966, 423460, 5),\n" +
            "(730, 'NAICS', 1920, 624, 2, 1923, 62411, 4),\n" +
            "(731, 'SIC', 4308, 20, 1, 3376, 3421, 4),\n" +
            "(732, 'SIC', 3999, 6730, 3, 4001, 6733, 4),\n" +
            "(733, 'NAICS', 85, 11251, 4, 86, 112511, 5),\n" +
            "(734, 'SEC', 2405, 3520, 3, 2407, 3524, 4),\n" +
            "(735, 'NAICS', 1942, 71, 1, 1966, 7115, 3),\n" +
            "(736, 'NAICS', 2135, 92, 1, 2162, 922160, 5),\n" +
            "(737, 'SEC', 2791, 20, 1, 2430, 3579, 4),\n" +
            "(738, 'SIC', 3875, 5720, 3, 3876, 5722, 4),\n" +
            "(739, 'NAICS', 1667, 54151, 4, 1671, 541519, 5),\n" +
            "(740, 'SEC', 2789, 10, 1, 2221, 1300, 2),\n" +
            "(741, 'NAICS', 930, 42, 1, 1085, 424950, 5),\n" +
            "(742, 'SIC', 3715, 5000, 2, 3752, 5084, 4),\n" +
            "(743, 'SEC', 2345, 3020, 3, 2346, 3021, 4),\n" +
            "(744, 'NAICS', 2003, 72, 1, 2014, 72121, 4),\n" +
            "(745, 'SEC', 2450, 3670, 3, 2452, 3674, 4),\n" +
            "(746, 'SEC', 2796, 70, 1, 2769, 8200, 2),\n" +
            "(747, 'SEC', 2791, 20, 1, 2494, 3850, 3),\n" +
            "(748, 'SEC', 2792, 40, 1, 2523, 4400, 2),\n" +
            "(749, 'NAICS', 1725, 56, 1, 1738, 56132, 4),\n" +
            "(750, 'SIC', 3371, 3400, 2, 3412, 3493, 4),\n" +
            "(751, 'SIC', 4284, 9600, 2, 4293, 9650, 3),\n" +
            "(752, 'SIC', 4125, 7900, 2, 4129, 7922, 4),\n" +
            "(753, 'SIC', 3451, 3560, 3, 3459, 3568, 4),\n" +
            "(754, 'SIC', 2798, 100, 2, 2811, 160, 3),\n" +
            "(755, 'SEC', 2221, 1300, 2, 2225, 1381, 4),\n" +
            "(756, 'SIC', 4277, 9500, 2, 4280, 9512, 4),\n" +
            "(757, 'SEC', 2739, 7810, 3, 2740, 7812, 4),\n" +
            "(758, 'NAICS', 43, 1119, 3, 44, 111910, 5),\n" +
            "(759, 'NAICS', 1914, 62331, 4, 1916, 623312, 5),\n" +
            "(760, 'SIC', 3480, 3600, 2, 3502, 3647, 4),\n" +
            "(761, 'SIC', 3855, 5610, 3, 3856, 5611, 4),\n" +
            "(762, 'SIC', 4040, 7300, 2, 4053, 7336, 4),\n" +
            "(763, 'SIC', 2847, 700, 2, 2850, 720, 3),\n" +
            "(764, 'SIC', 3000, 2040, 3, 3007, 2048, 4),\n" +
            "(765, 'SIC', 4309, 40, 1, 3657, 4513, 4),\n" +
            "(766, 'NAICS', 1683, 5417, 3, 1686, 541712, 5),\n" +
            "(767, 'SEC', 2458, 3700, 2, 2461, 3713, 4),\n" +
            "(768, 'SIC', 4309, 40, 1, 3607, 4111, 4),\n" +
            "(769, 'NAICS', 1591, 532, 2, 1601, 532220, 5),\n" +
            "(770, 'SIC', 4313, 70, 1, 4086, 7519, 4),\n" +
            "(771, 'NAICS', 2072, 8121, 3, 2074, 812111, 5),\n" +
            "(772, 'SIC', 3161, 2540, 3, 3163, 2542, 4),\n" +
            "(773, 'SIC', 3663, 4610, 3, 3664, 4612, 4),\n" +
            "(774, 'SEC', 2524, 4410, 3, 2525, 4412, 4),\n" +
            "(775, 'SEC', 2794, 52, 1, 2629, 5661, 4),\n" +
            "(776, 'SIC', 3214, 2800, 2, 3246, 2890, 3),\n" +
            "(777, 'SIC', 3837, 5500, 2, 3843, 5531, 4),\n" +
            "(778, 'SIC', 4277, 9500, 2, 4279, 9511, 4),\n" +
            "(779, 'SIC', 4313, 70, 1, 4173, 8093, 4),\n" +
            "(780, 'SIC', 4309, 40, 1, 3610, 4121, 4),\n" +
            "(781, 'NAICS', 1725, 56, 1, 1753, 56145, 4),\n" +
            "(782, 'SEC', 2791, 20, 1, 2309, 2732, 4),\n" +
            "(783, 'SEC', 2403, 3500, 2, 2431, 3580, 3),\n" +
            "(784, 'NAICS', 1942, 71, 1, 1963, 7114, 3),\n" +
            "(785, 'NAICS', 2183, 9251, 3, 2184, 925110, 5),\n" +
            "(786, 'SIC', 3384, 3440, 3, 3391, 3449, 4),\n" +
            "(787, 'NAICS', 139, 2121, 3, 141, 212111, 5),\n" +
            "(788, 'NAICS', 1850, 62, 1, 1854, 621111, 5),\n" +
            "(789, 'SIC', 3371, 3400, 2, 3407, 3484, 4),\n" +
            "(790, 'NAICS', 246, 23815, 4, 245, 238150, 5),\n" +
            "(791, 'NAICS', 119, 11511, 4, 120, 115111, 5),\n" +
            "(792, 'SIC', 4208, 8600, 2, 4220, 8661, 4),\n" +
            "(793, 'SIC', 3098, 2340, 3, 3099, 2341, 4),\n" +
            "(794, 'SIC', 3301, 3200, 2, 3330, 3290, 3),\n" +
            "(795, 'SIC', 3667, 4700, 2, 3668, 4720, 3),\n" +
            "(796, 'NAICS', 1452, 517, 2, 1463, 51791, 4),\n" +
            "(797, 'NAICS', 1, 11, 1, 21, 111211, 5),\n" +
            "(798, 'NAICS', 2037, 81, 1, 2132, 8141, 3),\n" +
            "(799, 'SIC', 3693, 4900, 2, 3706, 4941, 4),\n" +
            "(800, 'SIC', 3409, 3490, 3, 3417, 3498, 4),\n" +
            "(801, 'NAICS', 1850, 62, 1, 1933, 624229, 5),\n" +
            "(802, 'SIC', 4308, 20, 1, 3018, 2067, 4),\n" +
            "(803, 'NAICS', 1850, 62, 1, 1922, 624110, 5),\n" +
            "(804, 'NAICS', 1015, 424, 2, 1070, 42472, 4),\n" +
            "(805, 'NAICS', 1831, 61151, 4, 1835, 611519, 5),\n" +
            "(806, 'SIC', 3520, 3690, 3, 3522, 3692, 4),\n" +
            "(807, 'NAICS', 941, 4232, 3, 943, 42321, 4),\n" +
            "(808, 'SIC', 2798, 100, 2, 2801, 112, 4),\n" +
            "(809, 'NAICS', 1090, 4251, 3, 1091, 425110, 5),\n" +
            "(810, 'SEC', 2384, 3400, 2, 2396, 3450, 3),\n" +
            "(811, 'SIC', 4040, 7300, 2, 4064, 7363, 4),\n" +
            "(812, 'SIC', 4305, 1, 1, 2819, 179, 4),\n" +
            "(813, 'SIC', 3716, 5010, 3, 3717, 5012, 4),\n" +
            "(814, 'SIC', 4305, 1, 1, 2836, 252, 4),\n" +
            "(815, 'NAICS', 2165, 92219, 4, 2164, 922190, 5),\n" +
            "(816, 'SEC', 2791, 20, 1, 2371, 3300, 2),\n" +
            "(817, 'NAICS', 1536, 524, 2, 1552, 524292, 5),\n" +
            "(818, 'SEC', 2796, 70, 1, 2747, 7841, 4),\n" +
            "(819, 'NAICS', 930, 42, 1, 1049, 42447, 4),\n" +
            "(820, 'SIC', 4308, 20, 1, 3251, 2899, 4),\n" +
            "(821, 'SIC', 4313, 70, 1, 4163, 8062, 4),\n" +
            "(822, 'NAICS', 2, 111, 2, 19, 1112, 3),\n" +
            "(823, 'NAICS', 931, 423, 2, 969, 42349, 4),\n" +
            "(824, 'NAICS', 68, 1123, 3, 70, 11231, 4),\n" +
            "(825, 'SIC', 4308, 20, 1, 2999, 2038, 4),\n" +
            "(826, 'NAICS', 205, 23, 1, 254, 238210, 5),\n" +
            "(827, 'SEC', 2795, 60, 1, 2679, 6311, 4),\n" +
            "(828, 'SIC', 4310, 50, 1, 3784, 5150, 3),\n" +
            "(829, 'NAICS', 2191, 92611, 4, 2190, 926110, 5),\n" +
            "(830, 'SIC', 3301, 3200, 2, 3303, 3211, 4),\n" +
            "(831, 'SIC', 3762, 5100, 2, 3796, 5182, 4),\n" +
            "(832, 'SIC', 2847, 700, 2, 2860, 752, 4);\n";
    static String industryCodeInsert12 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "\n" +
            "(833, 'SIC', 3167, 2600, 2, 3170, 2620, 3),\n" +
            "(834, 'SEC', 2391, 3440, 3, 2392, 3442, 4),\n" +
            "(835, 'SIC', 4308, 20, 1, 3112, 2386, 4),\n" +
            "(836, 'SIC', 4309, 40, 1, 3641, 4430, 3),\n" +
            "(837, 'SIC', 4308, 20, 1, 3525, 3699, 4),\n" +
            "(838, 'SIC', 3609, 4120, 3, 3610, 4121, 4),\n" +
            "(839, 'NAICS', 2, 111, 2, 10, 111140, 5),\n" +
            "(840, 'NAICS', 1823, 6114, 3, 1827, 61142, 4),\n" +
            "(841, 'NAICS', 1813, 611, 2, 1832, 611511, 5),\n" +
            "(842, 'SIC', 4308, 20, 1, 3110, 2384, 4),\n" +
            "(843, 'SIC', 4311, 52, 1, 3913, 5993, 4),\n" +
            "(844, 'NAICS', 1555, 5251, 3, 1559, 52512, 4),\n" +
            "(845, 'SIC', 3769, 5130, 3, 3771, 5136, 4),\n" +
            "(846, 'SIC', 4308, 20, 1, 3403, 3479, 4),\n" +
            "(847, 'NAICS', 930, 42, 1, 1069, 424720, 5),\n" +
            "(848, 'NAICS', 1792, 562, 2, 1807, 562920, 5),\n" +
            "(849, 'NAICS', 2137, 9211, 3, 2146, 921150, 5),\n" +
            "(850, 'SIC', 4203, 8400, 2, 4205, 8412, 4),\n" +
            "(851, 'NAICS', 1816, 61111, 4, 1815, 611110, 5),\n" +
            "(852, 'NAICS', 2112, 8133, 3, 2113, 81331, 4),\n" +
            "(853, 'SIC', 3012, 2060, 3, 3019, 2068, 4),\n" +
            "(854, 'SEC', 2785, 9700, 2, 2787, 9721, 4),\n" +
            "(855, 'NAICS', 2135, 92, 1, 2158, 922140, 5),\n" +
            "(856, 'SIC', 2982, 2000, 2, 3030, 2085, 4),\n" +
            "(857, 'SIC', 2982, 2000, 2, 3037, 2096, 4),\n" +
            "(858, 'SIC', 3693, 4900, 2, 3696, 4920, 3),\n" +
            "(859, 'NAICS', 1850, 62, 1, 1910, 62321, 4),\n" +
            "(860, 'NAICS', 2112, 8133, 3, 2115, 813312, 5),\n" +
            "(861, 'SEC', 2286, 2520, 3, 2287, 2522, 4),\n" +
            "(862, 'SIC', 4314, 90, 1, 4288, 9621, 4),\n" +
            "(863, 'SEC', 2791, 20, 1, 2320, 2810, 3),\n" +
            "(864, 'SEC', 2611, 5310, 3, 2612, 5311, 4),\n" +
            "(865, 'SIC', 4308, 20, 1, 3023, 2076, 4),\n" +
            "(866, 'NAICS', 205, 23, 1, 252, 23819, 4),\n" +
            "(867, 'NAICS', 109, 1141, 3, 110, 11411, 4),\n" +
            "(868, 'NAICS', 223, 23712, 4, 222, 237120, 5),\n" +
            "(869, 'NAICS', 930, 42, 1, 952, 42333, 4),\n" +
            "(870, 'SIC', 2798, 100, 2, 2806, 131, 4),\n" +
            "(871, 'NAICS', 2039, 8111, 3, 2043, 811113, 5),\n" +
            "(872, 'SIC', 3791, 5170, 3, 3792, 5171, 4),\n" +
            "(873, 'SEC', 2526, 4500, 2, 2533, 4581, 4),\n" +
            "(874, 'SEC', 2753, 8000, 2, 2757, 8051, 4),\n" +
            "(875, 'SEC', 2694, 6500, 2, 2701, 6550, 3),\n" +
            "(876, 'SIC', 3937, 6100, 2, 3939, 6111, 4),\n" +
            "(877, 'NAICS', 235, 238, 2, 241, 238130, 5),\n" +
            "(878, 'NAICS', 930, 42, 1, 977, 42361, 4),\n" +
            "(879, 'SIC', 3815, 5300, 2, 3821, 5399, 4),\n" +
            "(880, 'NAICS', 2103, 813, 2, 2109, 813211, 5),\n" +
            "(881, 'NAICS', 1463, 51791, 4, 1465, 517919, 5),\n" +
            "(882, 'NAICS', 16, 11119, 4, 17, 111191, 5),\n" +
            "(883, 'NAICS', 931, 423, 2, 976, 423610, 5),\n" +
            "(884, 'SIC', 3168, 2610, 3, 3169, 2611, 4),\n" +
            "(885, 'NAICS', 1812, 61, 1, 1814, 6111, 3),\n" +
            "(886, 'NAICS', 1625, 541, 2, 1685, 541711, 5),\n" +
            "(887, 'NAICS', 218, 237, 2, 225, 23713, 4),\n" +
            "(888, 'SIC', 4307, 15, 1, 2946, 1541, 4),\n" +
            "(889, 'SIC', 3426, 3530, 3, 3427, 3531, 4),\n" +
            "(890, 'SIC', 3180, 2670, 3, 3187, 2677, 4),\n" +
            "(891, 'SEC', 2791, 20, 1, 2317, 2780, 3),\n" +
            "(892, 'NAICS', 930, 42, 1, 1093, 425120, 5),\n" +
            "(893, 'NAICS', 2135, 92, 1, 2207, 92811, 4),\n" +
            "(894, 'NAICS', 2204, 928, 2, 2206, 928110, 5),\n" +
            "(895, 'NAICS', 85, 11251, 4, 87, 112512, 5),\n" +
            "(896, 'SIC', 2918, 1400, 2, 2930, 1459, 4),\n" +
            "(897, 'NAICS', 138, 212, 2, 162, 21232, 4),\n" +
            "(898, 'SIC', 3474, 3590, 3, 3476, 3593, 4),\n" +
            "(899, 'SIC', 3073, 2280, 3, 3076, 2284, 4),\n" +
            "(900, 'SIC', 3526, 3700, 2, 3547, 3769, 4),\n" +
            "(901, 'SIC', 4308, 20, 1, 3411, 3492, 4),\n" +
            "(902, 'NAICS', 1420, 5121, 3, 1425, 51213, 4),\n" +
            "(903, 'SIC', 4306, 10, 1, 2904, 1222, 4),\n" +
            "(904, 'SIC', 3611, 4130, 3, 3612, 4131, 4),\n" +
            "(905, 'NAICS', 930, 42, 1, 942, 423210, 5),\n" +
            "(906, 'NAICS', 2136, 921, 2, 2142, 921130, 5),\n" +
            "(907, 'SIC', 3211, 2790, 3, 3212, 2791, 4),\n" +
            "(908, 'NAICS', 2037, 81, 1, 2108, 81321, 4),\n" +
            "(909, 'NAICS', 1402, 51, 1, 1476, 519130, 5),\n" +
            "(910, 'SIC', 3958, 6300, 2, 3962, 6321, 4),\n" +
            "(911, 'NAICS', 242, 23813, 4, 241, 238130, 5),\n" +
            "(912, 'SIC', 3338, 3310, 3, 3341, 3315, 4),\n" +
            "(913, 'SIC', 4310, 50, 1, 3718, 5013, 4),\n" +
            "(914, 'NAICS', 132, 21, 1, 174, 21311, 4),\n" +
            "(915, 'SIC', 3921, 6020, 3, 3922, 6021, 4),\n" +
            "(916, 'NAICS', 89, 1129, 3, 97, 11299, 4),\n" +
            "(917, 'SIC', 3220, 2820, 3, 3224, 2824, 4),\n" +
            "(918, 'SIC', 4313, 70, 1, 4189, 8249, 4),\n" +
            "(919, 'NAICS', 2037, 81, 1, 2074, 812111, 5),\n" +
            "(920, 'SIC', 4308, 20, 1, 3224, 2824, 4),\n" +
            "(921, 'SIC', 4313, 70, 1, 4112, 7699, 4),\n" +
            "(922, 'NAICS', 1, 11, 1, 27, 11132, 4),\n" +
            "(923, 'NAICS', 1942, 71, 1, 1961, 711320, 5),\n" +
            "(924, 'SEC', 2552, 4900, 2, 2562, 4940, 3),\n" +
            "(925, 'NAICS', 2177, 9241, 3, 2179, 92411, 4),\n" +
            "(926, 'SIC', 3124, 2400, 2, 3141, 2450, 3),\n" +
            "(927, 'NAICS', 1726, 561, 2, 1745, 561421, 5),\n" +
            "(928, 'NAICS', 2183, 9251, 3, 2186, 925120, 5),\n" +
            "(929, 'SIC', 3911, 5990, 3, 3915, 5995, 4),\n" +
            "(930, 'SIC', 3101, 2350, 3, 3102, 2353, 4),\n" +
            "(931, 'NAICS', 1741, 5614, 3, 1747, 56143, 4),\n" +
            "(932, 'NAICS', 2037, 81, 1, 2075, 812112, 5),\n" +
            "(933, 'SIC', 4178, 8200, 2, 4181, 8220, 3),\n" +
            "(934, 'NAICS', 1051, 42448, 4, 1050, 424480, 5),\n" +
            "(935, 'NAICS', 2135, 92, 1, 2150, 922, 2),\n" +
            "(936, 'SIC', 3797, 5190, 3, 3802, 5198, 4),\n" +
            "(937, 'SIC', 4311, 52, 1, 3848, 5560, 3),\n" +
            "(938, 'SIC', 2955, 1700, 2, 2967, 1751, 4),\n" +
            "(939, 'SIC', 3480, 3600, 2, 3507, 3660, 3),\n" +
            "(940, 'NAICS', 1015, 424, 2, 1060, 42459, 4),\n" +
            "(941, 'NAICS', 1625, 541, 2, 1675, 541612, 5),\n" +
            "(942, 'SIC', 4305, 1, 1, 2818, 175, 4),\n" +
            "(943, 'SIC', 2813, 170, 3, 2816, 173, 4),\n" +
            "(944, 'NAICS', 1402, 51, 1, 1458, 51721, 4),\n" +
            "(945, 'SIC', 4308, 20, 1, 3231, 2841, 4),\n" +
            "(946, 'SIC', 3258, 2990, 3, 3259, 2992, 4),\n" +
            "(947, 'NAICS', 1480, 52, 1, 1509, 522320, 5),\n" +
            "(948, 'NAICS', 1672, 5416, 3, 1673, 54161, 4),\n" +
            "(949, 'SIC', 4146, 8000, 2, 4150, 8021, 4),\n" +
            "(950, 'SEC', 2713, 7300, 2, 2727, 7372, 4),\n" +
            "(951, 'SEC', 2323, 2830, 3, 2324, 2833, 4),\n" +
            "(952, 'NAICS', 1942, 71, 1, 1978, 71219, 4),\n" +
            "(953, 'SIC', 3680, 4800, 2, 3689, 4840, 3),\n" +
            "(954, 'SIC', 3958, 6300, 2, 3968, 6360, 3),\n" +
            "(955, 'NAICS', 930, 42, 1, 1045, 42445, 4),\n" +
            "(956, 'SIC', 2982, 2000, 2, 3015, 2063, 4),\n" +
            "(957, 'NAICS', 181, 221, 2, 203, 221330, 5),\n" +
            "(958, 'SIC', 4305, 1, 1, 2846, 291, 4),\n" +
            "(959, 'SEC', 2789, 10, 1, 2224, 1380, 3),\n" +
            "(960, 'SIC', 3917, 6000, 2, 3936, 6099, 4),\n" +
            "(961, 'NAICS', 2037, 81, 1, 2098, 812922, 5),\n" +
            "(962, 'SIC', 3127, 2420, 3, 3130, 2429, 4),\n" +
            "(963, 'SEC', 2703, 6700, 2, 4327, 6770, 3),\n" +
            "(964, 'NAICS', 963, 42344, 4, 962, 423440, 5),\n" +
            "(965, 'SIC', 3050, 2200, 2, 3064, 2257, 4),\n" +
            "(966, 'SIC', 4081, 7500, 2, 4087, 7520, 3),\n" +
            "(967, 'SIC', 3419, 3500, 2, 3471, 3585, 4),\n" +
            "(968, 'SIC', 4309, 40, 1, 3710, 4959, 4),\n" +
            "(969, 'NAICS', 1806, 56291, 4, 1805, 562910, 5),\n" +
            "(970, 'SIC', 3911, 5990, 3, 3912, 5992, 4),\n" +
            "(971, 'SIC', 4307, 15, 1, 2971, 1770, 3),\n" +
            "(972, 'NAICS', 2183, 9251, 3, 2185, 92511, 4),\n" +
            "(973, 'SEC', 2552, 4900, 2, 2561, 4932, 4),\n" +
            "(974, 'NAICS', 1763, 56159, 4, 1765, 561599, 5),\n" +
            "(975, 'NAICS', 2167, 9231, 3, 2175, 92314, 4),\n" +
            "(976, 'SIC', 3287, 3140, 3, 3289, 3143, 4),\n" +
            "(977, 'NAICS', 1402, 51, 1, 1453, 5171, 3),\n" +
            "(978, 'NAICS', 1944, 7111, 3, 1945, 711110, 5),\n" +
            "(979, 'SIC', 2993, 2030, 3, 2995, 2033, 4),\n" +
            "(980, 'NAICS', 207, 2361, 3, 208, 23611, 4),\n" +
            "(981, 'SIC', 2973, 1780, 3, 2974, 1781, 4),\n" +
            "(982, 'SIC', 4308, 20, 1, 3091, 2326, 4),\n" +
            "(983, 'SIC', 3917, 6000, 2, 3935, 6091, 4),\n" +
            "(984, 'NAICS', 1605, 53229, 4, 1607, 532292, 5),\n" +
            "(985, 'NAICS', 1484, 52111, 4, 1483, 521110, 5),\n" +
            "(986, 'SEC', 2465, 3720, 3, 2468, 3728, 4),\n" +
            "(987, 'NAICS', 1979, 713, 2, 1995, 713930, 5),\n" +
            "(988, 'NAICS', 2188, 926, 2, 2195, 92613, 4),\n" +
            "(989, 'NAICS', 1943, 711, 2, 1949, 711130, 5),\n" +
            "(990, 'SEC', 2796, 70, 1, 2730, 7377, 4),\n" +
            "(991, 'NAICS', 930, 42, 1, 1046, 424460, 5),\n" +
            "(992, 'NAICS', 1850, 62, 1, 1872, 621410, 5),\n" +
            "(993, 'SIC', 4308, 20, 1, 3503, 3648, 4),\n" +
            "(994, 'SIC', 3237, 2860, 3, 3240, 2869, 4),\n" +
            "(995, 'SEC', 2555, 4920, 3, 2558, 4924, 4),\n" +
            "(996, 'SIC', 2982, 2000, 2, 2985, 2013, 4),\n" +
            "(997, 'NAICS', 1569, 53, 1, 1576, 531130, 5),\n" +
            "(998, 'SEC', 2371, 3300, 2, 2375, 3320, 3),\n" +
            "(999, 'SEC', 2758, 8060, 3, 2759, 8062, 4),\n" +
            "(1000, 'SIC', 4277, 9500, 2, 4281, 9530, 3),\n" +
            "(1001, 'SIC', 3621, 4210, 3, 3622, 4212, 4),\n" +
            "(1002, 'NAICS', 56, 112, 2, 76, 11234, 4),\n" +
            "(1003, 'SIC', 4312, 60, 1, 3984, 6519, 4),\n" +
            "(1004, 'NAICS', 1624, 54, 1, 1704, 541890, 5),\n" +
            "(1005, 'NAICS', 1, 11, 1, 77, 112390, 5),\n" +
            "(1006, 'NAICS', 2072, 8121, 3, 2079, 812199, 5),\n" +
            "(1007, 'SIC', 3444, 3550, 3, 3450, 3559, 4),\n" +
            "(1008, 'SIC', 3174, 2650, 3, 3179, 2657, 4),\n" +
            "(1009, 'NAICS', 1, 11, 1, 125, 115116, 5),\n" +
            "(1010, 'NAICS', 1076, 4249, 3, 1080, 42492, 4),\n" +
            "(1011, 'SIC', 3368, 3390, 3, 3370, 3399, 4),\n" +
            "(1012, 'SEC', 2791, 20, 1, 2387, 3412, 4),\n" +
            "(1013, 'SIC', 4309, 40, 1, 3691, 4890, 3),\n" +
            "(1014, 'SIC', 3942, 6150, 3, 3944, 6159, 4),\n" +
            "(1015, 'NAICS', 1466, 518, 2, 1468, 518210, 5),\n" +
            "(1016, 'NAICS', 1851, 621, 2, 1853, 62111, 4),\n" +
            "(1017, 'SIC', 4310, 50, 1, 3738, 5051, 4),\n" +
            "(1018, 'SIC', 4308, 20, 1, 3109, 2381, 4),\n" +
            "(1019, 'NAICS', 1402, 51, 1, 1468, 518210, 5),\n" +
            "(1020, 'SEC', 2792, 40, 1, 2557, 4923, 4),\n" +
            "(1021, 'SIC', 2909, 1300, 2, 2910, 1310, 3),\n" +
            "(1022, 'SIC', 4171, 8090, 3, 4173, 8093, 4),\n" +
            "(1023, 'NAICS', 83, 11242, 4, 82, 112420, 5),\n" +
            "(1024, 'NAICS', 23, 1113, 3, 27, 11132, 4),\n" +
            "(1025, 'SIC', 3837, 5500, 2, 3845, 5541, 4),\n" +
            "(1026, 'SEC', 2459, 3710, 3, 2460, 3711, 4),\n" +
            "(1027, 'SIC', 4305, 1, 1, 2853, 723, 4),\n" +
            "(1028, 'NAICS', 1, 11, 1, 20, 11121, 4),\n" +
            "(1029, 'NAICS', 1942, 71, 1, 1964, 711410, 5),\n" +
            "(1030, 'SIC', 3829, 5440, 3, 3830, 5441, 4),\n" +
            "(1031, 'NAICS', 180, 22, 1, 202, 22132, 4),\n" +
            "(1032, 'SEC', 2753, 8000, 2, 2764, 8090, 3),\n" +
            "(1033, 'SIC', 4312, 60, 1, 3953, 6230, 3),\n" +
            "(1034, 'SEC', 2271, 2300, 2, 2274, 2340, 3),\n" +
            "(1035, 'SIC', 4284, 9600, 2, 4290, 9631, 4),\n" +
            "(1036, 'NAICS', 2039, 8111, 3, 2041, 811111, 5),\n" +
            "(1037, 'SEC', 2713, 7300, 2, 2718, 7331, 4),\n" +
            "(1038, 'NAICS', 2038, 811, 2, 2059, 811310, 5),\n" +
            "(1039, 'NAICS', 2038, 811, 2, 2049, 811191, 5),\n" +
            "(1040, 'SIC', 4305, 1, 1, 2808, 133, 4),\n" +
            "(1041, 'SIC', 4308, 20, 1, 3089, 2323, 4),\n" +
            "(1042, 'SIC', 4313, 70, 1, 4056, 7342, 4),\n" +
            "(1043, 'NAICS', 2169, 92311, 4, 2168, 923110, 5),\n" +
            "(1044, 'SIC', 4175, 8100, 2, 4177, 8111, 4),\n" +
            "(1045, 'NAICS', 2161, 92215, 4, 2160, 922150, 5),\n" +
            "(1046, 'SEC', 2791, 20, 1, 2292, 2600, 2),\n" +
            "(1047, 'NAICS', 1500, 52229, 4, 1505, 522298, 5),\n" +
            "(1048, 'SIC', 3426, 3530, 3, 3432, 3536, 4),\n" +
            "(1049, 'SIC', 2975, 1790, 3, 2976, 1791, 4),\n" +
            "(1050, 'SIC', 4308, 20, 1, 3511, 3670, 3),\n" +
            "(1051, 'SIC', 3167, 2600, 2, 3171, 2621, 4),\n" +
            "(1052, 'NAICS', 1942, 71, 1, 1952, 71119, 4),\n" +
            "(1053, 'SEC', 2500, 3900, 2, 2509, 3950, 3),\n" +
            "(1054, 'NAICS', 2089, 81232, 4, 2088, 812320, 5),\n" +
            "(1055, 'NAICS', 1600, 53221, 4, 1599, 532210, 5),\n" +
            "(1056, 'SEC', 2791, 20, 1, 2464, 3716, 4),\n" +
            "(1057, 'SIC', 3214, 2800, 2, 3221, 2821, 4),\n" +
            "(1058, 'SIC', 4100, 7600, 2, 4104, 7629, 4),\n" +
            "(1059, 'SIC', 3266, 3050, 3, 3268, 3053, 4),\n" +
            "(1060, 'SIC', 4308, 20, 1, 3267, 3052, 4),\n" +
            "(1061, 'SIC', 4311, 52, 1, 3827, 5430, 3),\n" +
            "(1062, 'SEC', 2796, 70, 1, 2724, 7363, 4),\n" +
            "(1063, 'NAICS', 1979, 713, 2, 1994, 71392, 4),\n" +
            "(1064, 'NAICS', 129, 1153, 3, 131, 11531, 4),\n" +
            "(1065, 'NAICS', 1061, 4246, 3, 1063, 42461, 4),\n" +
            "(1066, 'NAICS', 2037, 81, 1, 2090, 81233, 4),\n" +
            "(1067, 'NAICS', 2071, 812, 2, 2101, 812990, 5),\n" +
            "(1068, 'SIC', 4305, 1, 1, 2805, 130, 3),\n" +
            "(1069, 'NAICS', 206, 236, 2, 208, 23611, 4),\n" +
            "(1070, 'SIC', 3825, 5420, 3, 3826, 5421, 4),\n" +
            "(1071, 'NAICS', 2072, 8121, 3, 2078, 812191, 5),\n" +
            "(1072, 'SIC', 4308, 20, 1, 3490, 3631, 4),\n" +
            "(1073, 'SIC', 4308, 20, 1, 3341, 3315, 4),\n" +
            "(1074, 'SEC', 2791, 20, 1, 2253, 2070, 3),\n" +
            "(1075, 'SEC', 2458, 3700, 2, 2467, 3724, 4),\n" +
            "(1076, 'NAICS', 56, 112, 2, 79, 1124, 3),\n" +
            "(1077, 'NAICS', 181, 221, 2, 194, 221122, 5),\n" +
            "(1078, 'SEC', 2418, 3560, 3, 2423, 3569, 4),\n" +
            "(1079, 'NAICS', 2135, 92, 1, 2196, 926140, 5),\n" +
            "(1080, 'SEC', 2435, 3610, 3, 2437, 3613, 4),\n" +
            "(1081, 'SEC', 2633, 5730, 3, 2634, 5731, 4),\n" +
            "(1082, 'SEC', 2791, 20, 1, 2383, 3390, 3),\n" +
            "(1083, 'NAICS', 2, 111, 2, 33, 111335, 5),\n" +
            "(1084, 'NAICS', 1741, 5614, 3, 1746, 561422, 5),\n" +
            "(1085, 'NAICS', 1625, 541, 2, 1643, 541320, 5),\n" +
            "(1086, 'NAICS', 2038, 811, 2, 2040, 81111, 4),\n" +
            "(1087, 'SIC', 3141, 2450, 3, 3142, 2451, 4),\n" +
            "(1088, 'SIC', 4308, 20, 1, 3031, 2086, 4),\n" +
            "(1089, 'NAICS', 1, 11, 1, 71, 112320, 5),\n" +
            "(1090, 'SEC', 2254, 2080, 3, 2255, 2082, 4),\n" +
            "(1091, 'SIC', 4313, 70, 1, 4055, 7340, 3),\n" +
            "(1092, 'NAICS', 1850, 62, 1, 1940, 624410, 5),\n" +
            "(1093, 'NAICS', 1706, 5419, 3, 1711, 541922, 5),\n" +
            "(1094, 'SIC', 4313, 70, 1, 4035, 7260, 3),\n" +
            "(1095, 'NAICS', 132, 21, 1, 134, 2111, 3),\n" +
            "(1096, 'NAICS', 43, 1119, 3, 45, 11191, 4),\n" +
            "(1097, 'NAICS', 2112, 8133, 3, 2114, 813311, 5),\n" +
            "(1098, 'SIC', 4146, 8000, 2, 4151, 8030, 3),\n" +
            "(1099, 'NAICS', 1536, 524, 2, 1545, 524130, 5),\n" +
            "(1100, 'SIC', 4311, 52, 1, 3833, 5460, 3),\n" +
            "(1101, 'SIC', 3392, 3450, 3, 3393, 3451, 4),\n" +
            "(1102, 'SIC', 3371, 3400, 2, 3415, 3496, 4),\n" +
            "(1103, 'SIC', 4312, 60, 1, 3934, 6090, 3),\n" +
            "(1104, 'SIC', 2955, 1700, 2, 2977, 1793, 4),\n" +
            "(1105, 'SEC', 2649, 6000, 2, 2651, 6021, 4),\n" +
            "(1106, 'SIC', 3167, 2600, 2, 3189, 2679, 4),\n" +
            "(1107, 'SIC', 3822, 5400, 2, 3834, 5461, 4),\n" +
            "(1108, 'SIC', 4017, 7200, 2, 4034, 7251, 4),\n" +
            "(1109, 'NAICS', 1428, 51219, 4, 1429, 512191, 5),\n" +
            "(1110, 'SEC', 2791, 20, 1, 2404, 3510, 3),\n" +
            "(1111, 'SIC', 4314, 90, 1, 4271, 9430, 3),\n" +
            "(1112, 'NAICS', 1480, 52, 1, 1513, 523, 2),\n" +
            "(1113, 'SEC', 2796, 70, 1, 2753, 8000, 2),\n" +
            "(1114, 'SEC', 2796, 70, 1, 2767, 8110, 3),\n" +
            "(1115, 'SIC', 3507, 3660, 3, 3508, 3661, 4),\n" +
            "(1116, 'NAICS', 101, 11311, 4, 100, 113110, 5),\n" +
            "(1117, 'SIC', 4308, 20, 1, 3337, 3300, 2),\n" +
            "(1118, 'SIC', 3255, 2950, 3, 3256, 2951, 4),\n" +
            "(1119, 'SIC', 4305, 1, 1, 2879, 919, 4),\n" +
            "(1120, 'SIC', 4308, 20, 1, 3588, 3951, 4),\n" +
            "(1121, 'SIC', 4158, 8050, 3, 4161, 8059, 4),\n" +
            "(1122, 'NAICS', 2031, 7225, 3, 2033, 722511, 5),\n" +
            "(1123, 'SIC', 4125, 7900, 2, 4128, 7920, 3),\n" +
            "(1124, 'SEC', 2791, 20, 1, 2369, 3281, 4),\n" +
            "(1125, 'SIC', 3526, 3700, 2, 3528, 3711, 4),\n" +
            "(1126, 'NAICS', 1667, 54151, 4, 1669, 541512, 5),\n" +
            "(1127, 'NAICS', 1719, 551, 2, 1721, 55111, 4),\n" +
            "(1128, 'SIC', 3917, 6000, 2, 3933, 6082, 4),\n" +
            "(1129, 'SIC', 4081, 7500, 2, 4095, 7538, 4),\n" +
            "(1130, 'SIC', 4113, 7800, 2, 4115, 7812, 4),\n" +
            "(1131, 'NAICS', 1683, 5417, 3, 1688, 54172, 4),\n" +
            "(1132, 'SIC', 4313, 70, 1, 4145, 7999, 4),\n" +
            "(1133, 'SEC', 2791, 20, 1, 2252, 2060, 3),\n" +
            "(1134, 'SIC', 3654, 4500, 2, 3659, 4522, 4),\n" +
            "(1135, 'SIC', 3660, 4580, 3, 3661, 4581, 4),\n" +
            "(1136, 'NAICS', 1706, 5419, 3, 1716, 541990, 5),\n" +
            "(1137, 'SIC', 4311, 52, 1, 3893, 5940, 3),\n" +
            "(1138, 'SIC', 2847, 700, 2, 2852, 722, 4),\n" +
            "(1139, 'SEC', 2559, 4930, 3, 2561, 4932, 4),\n" +
            "(1140, 'SIC', 4312, 60, 1, 3980, 6513, 4),\n" +
            "(1141, 'SIC', 4309, 40, 1, 3662, 4600, 2),\n" +
            "(1142, 'SEC', 2384, 3400, 2, 2391, 3440, 3),\n" +
            "(1143, 'NAICS', 955, 4234, 3, 963, 42344, 4),\n" +
            "(1144, 'NAICS', 1820, 6113, 3, 1821, 611310, 5),\n" +
            "(1145, 'SIC', 3837, 5500, 2, 3839, 5511, 4),\n" +
            "(1146, 'SIC', 2928, 1450, 3, 2930, 1459, 4),\n" +
            "(1147, 'NAICS', 1015, 424, 2, 1085, 424950, 5),\n" +
            "(1148, 'NAICS', 2136, 921, 2, 2141, 92112, 4),\n" +
            "(1149, 'NAICS', 1706, 5419, 3, 1709, 54192, 4),\n" +
            "(1150, 'NAICS', 1792, 562, 2, 1803, 562219, 5),\n" +
            "(1151, 'SIC', 4313, 70, 1, 4146, 8000, 2),\n" +
            "(1152, 'NAICS', 1954, 71121, 4, 1957, 711219, 5),\n" +
            "(1153, 'SIC', 2847, 700, 2, 2861, 760, 3),\n" +
            "(1154, 'NAICS', 931, 423, 2, 949, 423320, 5),\n" +
            "(1155, 'NAICS', 2073, 81211, 4, 2076, 812113, 5),\n" +
            "(1156, 'NAICS', 1625, 541, 2, 1695, 54183, 4),\n" +
            "(1157, 'SEC', 2789, 10, 1, 2216, 1040, 3),\n" +
            "(1158, 'NAICS', 236, 2381, 3, 251, 238190, 5),\n" +
            "(1159, 'NAICS', 1624, 54, 1, 1690, 541810, 5),\n" +
            "(1160, 'NAICS', 1851, 621, 2, 1887, 62161, 4),\n" +
            "(1161, 'NAICS', 2061, 8114, 3, 2068, 81143, 4),\n" +
            "(1162, 'SIC', 2982, 2000, 2, 2994, 2032, 4),\n" +
            "(1163, 'NAICS', 1480, 52, 1, 1486, 5221, 3),\n" +
            "(1164, 'SEC', 2670, 6200, 2, 2674, 6221, 4),\n" +
            "(1165, 'SIC', 4311, 52, 1, 3908, 5983, 4),\n" +
            "(1166, 'NAICS', 2005, 7211, 3, 2006, 721110, 5),\n" +
            "(1167, 'SEC', 2424, 3570, 3, 2426, 3572, 4),\n" +
            "(1168, 'SEC', 2703, 6700, 2, 2707, 6798, 4),\n" +
            "(1169, 'NAICS', 2037, 81, 1, 2050, 811192, 5),\n" +
            "(1170, 'SEC', 2791, 20, 1, 2278, 2421, 4),\n" +
            "(1171, 'NAICS', 138, 212, 2, 144, 2122, 3),\n" +
            "(1172, 'NAICS', 2136, 921, 2, 2143, 92113, 4),\n" +
            "(1173, 'SIC', 4081, 7500, 2, 4091, 7533, 4),\n" +
            "(1174, 'SEC', 2792, 40, 1, 2546, 4832, 4),\n" +
            "(1175, 'NAICS', 2151, 9221, 3, 2154, 922120, 5),\n" +
            "(1176, 'NAICS', 1014, 42399, 4, 1013, 423990, 5),\n" +
            "(1177, 'NAICS', 930, 42, 1, 995, 42382, 4),\n" +
            "(1178, 'SIC', 3012, 2060, 3, 3018, 2067, 4),\n" +
            "(1179, 'SIC', 2820, 180, 3, 2821, 181, 4),\n" +
            "(1180, 'NAICS', 2103, 813, 2, 2119, 81341, 4),\n" +
            "(1181, 'SIC', 3026, 2080, 3, 3031, 2086, 4),\n" +
            "(1182, 'NAICS', 1043, 42444, 4, 1042, 424440, 5),\n" +
            "(1183, 'SIC', 4306, 10, 1, 2893, 1044, 4),\n" +
            "(1184, 'NAICS', 1953, 7112, 3, 1955, 711211, 5),\n" +
            "(1185, 'SEC', 2791, 20, 1, 2487, 3829, 4),\n" +
            "(1186, 'SIC', 4313, 70, 1, 4137, 7951, 4),\n" +
            "(1187, 'NAICS', 89, 1129, 3, 90, 112910, 5),\n" +
            "(1188, 'NAICS', 138, 212, 2, 147, 21222, 4),\n" +
            "(1189, 'SIC', 4308, 20, 1, 3446, 3553, 4),\n" +
            "(1190, 'NAICS', 1, 11, 1, 128, 11521, 4),\n" +
            "(1191, 'NAICS', 205, 23, 1, 214, 236210, 5),\n" +
            "(1192, 'SIC', 4275, 9450, 3, 4276, 9451, 4),\n" +
            "(1193, 'SEC', 2793, 50, 1, 2572, 5030, 3),\n" +
            "(1194, 'SIC', 2987, 2020, 3, 2992, 2026, 4),\n" +
            "(1195, 'NAICS', 1015, 424, 2, 1051, 42448, 4),\n" +
            "(1196, 'SIC', 4308, 20, 1, 3019, 2068, 4),\n" +
            "(1197, 'SEC', 2649, 6000, 2, 2655, 6035, 4),\n" +
            "(1198, 'SIC', 4309, 40, 1, 3635, 4311, 4),\n" +
            "(1199, 'NAICS', 1785, 5619, 3, 1787, 56191, 4),\n" +
            "(1200, 'SIC', 4310, 50, 1, 3803, 5199, 4),\n" +
            "(1201, 'NAICS', 84, 1125, 3, 88, 112519, 5),\n" +
            "(1202, 'NAICS', 183, 22111, 4, 187, 221114, 5),\n" +
            "(1203, 'NAICS', 2096, 81292, 4, 2098, 812922, 5),\n" +
            "(1204, 'NAICS', 1604, 53223, 4, 1603, 532230, 5),\n" +
            "(1205, 'NAICS', 1706, 5419, 3, 1714, 541940, 5),\n" +
            "(1206, 'NAICS', 43, 1119, 3, 49, 11193, 4),\n" +
            "(1207, 'NAICS', 931, 423, 2, 1006, 42391, 4),\n" +
            "(1208, 'NAICS', 2135, 92, 1, 2138, 921110, 5),\n" +
            "(1209, 'SIC', 4245, 8990, 3, 4246, 8999, 4),\n" +
            "(1210, 'NAICS', 1528, 52391, 4, 1527, 523910, 5),\n" +
            "(1211, 'NAICS', 1970, 7121, 3, 1976, 71213, 4),\n" +
            "(1212, 'SIC', 4311, 52, 1, 3880, 5735, 4),\n" +
            "(1213, 'SIC', 4308, 20, 1, 3259, 2992, 4),\n" +
            "(1214, 'NAICS', 7, 11112, 4, 6, 111120, 5),\n" +
            "(1215, 'NAICS', 1990, 7139, 3, 2001, 713990, 5),\n" +
            "(1216, 'SIC', 4308, 20, 1, 3439, 3545, 4),\n" +
            "(1217, 'NAICS', 1894, 622, 2, 1897, 62211, 4),\n" +
            "(1218, 'SEC', 2791, 20, 1, 2303, 2710, 3),\n" +
            "(1219, 'SIC', 4313, 70, 1, 4010, 7020, 3),\n" +
            "(1220, 'NAICS', 1591, 532, 2, 1595, 532112, 5),\n" +
            "(1221, 'NAICS', 1626, 5411, 3, 1631, 54119, 4),\n" +
            "(1222, 'NAICS', 2039, 8111, 3, 2047, 811122, 5),\n" +
            "(1223, 'NAICS', 1480, 52, 1, 1567, 525990, 5),\n" +
            "(1224, 'NAICS', 2003, 72, 1, 2016, 721214, 5),\n" +
            "(1225, 'SIC', 3893, 5940, 3, 3895, 5942, 4),\n" +
            "(1226, 'NAICS', 1431, 5122, 3, 1440, 512290, 5),\n" +
            "(1227, 'SIC', 3667, 4700, 2, 3669, 4724, 4),\n" +
            "(1228, 'NAICS', 2021, 7223, 3, 2025, 72232, 4),\n" +
            "(1229, 'NAICS', 2037, 81, 1, 2058, 8113, 3),\n" +
            "(1230, 'SEC', 2791, 20, 1, 2492, 3844, 4),\n" +
            "(1231, 'NAICS', 1571, 5311, 3, 1578, 531190, 5),\n" +
            "(1232, 'SIC', 4308, 20, 1, 3147, 2499, 4),\n" +
            "(1233, 'SIC', 3917, 6000, 2, 3920, 6019, 4),\n" +
            "(1234, 'SEC', 2791, 20, 1, 2482, 3823, 4),\n" +
            "(1235, 'SIC', 4308, 20, 1, 3149, 2510, 3),\n" +
            "(1236, 'SEC', 2794, 52, 1, 2621, 5530, 3),\n" +
            "(1237, 'SIC', 3225, 2830, 3, 3226, 2833, 4),\n" +
            "(1238, 'NAICS', 1015, 424, 2, 1022, 42413, 4),\n" +
            "(1239, 'SIC', 4313, 70, 1, 4048, 7323, 4),\n" +
            "(1240, 'SIC', 3613, 4140, 3, 3614, 4141, 4),\n" +
            "(1241, 'SIC', 3948, 6200, 2, 3953, 6230, 3),\n" +
            "(1242, 'NAICS', 2037, 81, 1, 2125, 813930, 5),\n" +
            "(1243, 'SIC', 4136, 7950, 3, 4138, 7952, 4),\n" +
            "(1244, 'NAICS', 36, 1114, 3, 37, 11141, 4),\n" +
            "(1245, 'SIC', 3844, 5540, 3, 3845, 5541, 4),\n" +
            "(1246, 'SIC', 4309, 40, 1, 3648, 4489, 4),\n" +
            "(1247, 'NAICS', 1569, 53, 1, 1609, 5323, 3),\n" +
            "(1248, 'SIC', 4308, 20, 1, 3569, 3845, 4),\n" +
            "(1249, 'SIC', 3434, 3540, 3, 3437, 3543, 4),\n" +
            "(1250, 'SIC', 4312, 60, 1, 3921, 6020, 3),\n" +
            "(1251, 'NAICS', 98, 113, 2, 102, 1132, 3),\n" +
            "(1252, 'NAICS', 1865, 62133, 4, 1864, 621330, 5),\n" +
            "(1253, 'SEC', 2794, 52, 1, 2645, 5945, 4),\n" +
            "(1254, 'NAICS', 2037, 81, 1, 2068, 81143, 4),\n" +
            "(1255, 'NAICS', 1725, 56, 1, 1743, 56141, 4),\n" +
            "(1256, 'NAICS', 2150, 922, 2, 2152, 922110, 5),\n" +
            "(1257, 'SIC', 2891, 1040, 3, 2893, 1044, 4),\n" +
            "(1258, 'NAICS', 1402, 51, 1, 1457, 517210, 5),\n" +
            "(1259, 'NAICS', 1850, 62, 1, 1897, 62211, 4),\n" +
            "(1260, 'SIC', 3083, 2300, 2, 3118, 2393, 4),\n" +
            "(1261, 'SIC', 3253, 2910, 3, 3254, 2911, 4),\n" +
            "(1262, 'SEC', 2403, 3500, 2, 2404, 3510, 3),\n" +
            "(1263, 'SIC', 3371, 3400, 2, 3406, 3483, 4),\n" +
            "(1264, 'NAICS', 1569, 53, 1, 1596, 532120, 5),\n" +
            "(1265, 'NAICS', 1689, 5418, 3, 1695, 54183, 4),\n" +
            "(1266, 'SIC', 4046, 7320, 3, 4048, 7323, 4),\n" +
            "(1267, 'NAICS', 1942, 71, 1, 1967, 711510, 5),\n" +
            "(1268, 'SEC', 2431, 3580, 3, 2432, 3585, 4),\n" +
            "(1269, 'SIC', 3626, 4220, 3, 3630, 4226, 4),\n" +
            "(1270, 'SIC', 4128, 7920, 3, 4130, 7929, 4),\n" +
            "(1271, 'NAICS', 982, 4237, 3, 990, 42374, 4),\n" +
            "(1272, 'SIC', 3124, 2400, 2, 3126, 2411, 4),\n" +
            "(1273, 'SIC', 4313, 70, 1, 4157, 8049, 4),\n" +
            "(1274, 'NAICS', 157, 21231, 4, 161, 212319, 5),\n" +
            "(1275, 'SIC', 4313, 70, 1, 4028, 7221, 4),\n" +
            "(1276, 'SIC', 4313, 70, 1, 4175, 8100, 2),\n" +
            "(1277, 'NAICS', 1485, 522, 2, 1492, 52213, 4),\n" +
            "(1278, 'SIC', 3344, 3320, 3, 3348, 3325, 4),\n" +
            "(1279, 'SIC', 3715, 5000, 2, 3741, 5063, 4),\n" +
            "(1280, 'SEC', 2789, 10, 1, 2220, 1221, 4),\n" +
            "(1281, 'NAICS', 1402, 51, 1, 1408, 51112, 4),\n" +
            "(1282, 'NAICS', 2203, 92711, 4, 2202, 927110, 5),\n" +
            "(1283, 'NAICS', 931, 423, 2, 954, 42339, 4),\n" +
            "(1284, 'SIC', 3041, 2100, 2, 3049, 2141, 4),\n" +
            "(1285, 'SIC', 4311, 52, 1, 3841, 5521, 4),\n" +
            "(1286, 'NAICS', 1, 11, 1, 17, 111191, 5),\n" +
            "(1287, 'NAICS', 117, 115, 2, 130, 115310, 5),\n" +
            "(1288, 'NAICS', 984, 42371, 4, 983, 423710, 5),\n" +
            "(1289, 'SIC', 4308, 20, 1, 3391, 3449, 4),\n" +
            "(1290, 'NAICS', 1442, 515, 2, 1444, 51511, 4),\n" +
            "(1291, 'SEC', 2796, 70, 1, 2778, 8731, 4),\n" +
            "(1292, 'NAICS', 138, 212, 2, 159, 212312, 5),\n" +
            "(1293, 'NAICS', 1620, 533, 2, 1623, 53311, 4),\n" +
            "(1294, 'NAICS', 1402, 51, 1, 1416, 5112, 3),\n" +
            "(1295, 'NAICS', 1624, 54, 1, 1665, 54149, 4),\n" +
            "(1296, 'SEC', 2408, 3530, 3, 2409, 3531, 4),\n" +
            "(1297, 'NAICS', 182, 2211, 3, 193, 221121, 5),\n" +
            "(1298, 'NAICS', 930, 42, 1, 1026, 4243, 3),\n" +
            "(1299, 'SIC', 3380, 3430, 3, 3381, 3431, 4),\n" +
            "(1300, 'NAICS', 1812, 61, 1, 1839, 611620, 5),\n" +
            "(1301, 'SEC', 2795, 60, 1, 2675, 6280, 3),\n" +
            "(1302, 'NAICS', 1812, 61, 1, 1815, 611110, 5),\n" +
            "(1303, 'SIC', 4308, 20, 1, 3057, 2240, 3),\n" +
            "(1304, 'SIC', 3371, 3400, 2, 3389, 3446, 4),\n" +
            "(1305, 'NAICS', 2080, 8122, 3, 2083, 812220, 5),\n" +
            "(1306, 'SEC', 2283, 2500, 2, 2288, 2530, 3),\n" +
            "(1307, 'SIC', 3461, 3570, 3, 3462, 3571, 4),\n" +
            "(1308, 'NAICS', 57, 1121, 3, 59, 112111, 5),\n" +
            "(1309, 'NAICS', 1990, 7139, 3, 1991, 713910, 5),\n" +
            "(1310, 'SIC', 2948, 1600, 2, 2949, 1610, 3),\n" +
            "(1311, 'SIC', 4309, 40, 1, 3694, 4910, 3),\n" +
            "(1312, 'SIC', 2826, 210, 3, 2831, 219, 4),\n" +
            "(1313, 'SEC', 2796, 70, 1, 2771, 8350, 3),\n" +
            "(1314, 'SIC', 4146, 8000, 2, 4164, 8063, 4),\n" +
            "(1315, 'SIC', 4305, 1, 1, 2824, 191, 4),\n" +
            "(1316, 'NAICS', 1570, 531, 2, 1582, 53121, 4),\n" +
            "(1317, 'SIC', 4308, 20, 1, 3069, 2262, 4),\n" +
            "(1318, 'NAICS', 2095, 81291, 4, 2094, 812910, 5),\n" +
            "(1319, 'SIC', 3903, 5960, 3, 3906, 5963, 4),\n" +
            "(1320, 'SIC', 3917, 6000, 2, 3927, 6036, 4),\n" +
            "(1321, 'SIC', 3917, 6000, 2, 3928, 6060, 3),\n" +
            "(1322, 'NAICS', 198, 2213, 3, 201, 221320, 5),\n" +
            "(1323, 'NAICS', 1015, 424, 2, 1018, 42411, 4),\n" +
            "(1324, 'SEC', 2496, 3860, 3, 2497, 3861, 4),\n" +
            "(1325, 'SIC', 3999, 6730, 3, 4000, 6732, 4),\n" +
            "(1326, 'NAICS', 1, 11, 1, 37, 11141, 4),\n" +
            "(1327, 'NAICS', 1625, 541, 2, 1669, 541512, 5),\n" +
            "(1328, 'SIC', 4308, 20, 1, 3330, 3290, 3),\n" +
            "(1329, 'SIC', 3174, 2650, 3, 3176, 2653, 4);\n";
    static String industryCodeInsert13 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(1330, 'SEC', 2476, 3800, 2, 2479, 3820, 3),\n" +
            "(1331, 'SIC', 4308, 20, 1, 3350, 3331, 4),\n" +
            "(1332, 'NAICS', 1404, 5111, 3, 1405, 511110, 5),\n" +
            "(1333, 'NAICS', 2013, 7212, 3, 2014, 72121, 4),\n" +
            "(1334, 'NAICS', 1004, 4239, 3, 1010, 42393, 4),\n" +
            "(1335, 'SIC', 3715, 5000, 2, 3756, 5090, 3),\n" +
            "(1336, 'NAICS', 2004, 721, 2, 2011, 721191, 5),\n" +
            "(1337, 'NAICS', 1546, 52413, 4, 1545, 524130, 5),\n" +
            "(1338, 'NAICS', 2102, 81299, 4, 2101, 812990, 5),\n" +
            "(1339, 'SIC', 4309, 40, 1, 3659, 4522, 4),\n" +
            "(1340, 'SIC', 4313, 70, 1, 4198, 8351, 4),\n" +
            "(1341, 'NAICS', 1813, 611, 2, 1842, 61163, 4),\n" +
            "(1342, 'SIC', 4308, 20, 1, 3359, 3355, 4),\n" +
            "(1343, 'SIC', 4313, 70, 1, 4089, 7530, 3),\n" +
            "(1344, 'SIC', 3715, 5000, 2, 3746, 5074, 4),\n" +
            "(1345, 'SIC', 3581, 3930, 3, 3582, 3931, 4),\n" +
            "(1346, 'NAICS', 2037, 81, 1, 2055, 811212, 5),\n" +
            "(1347, 'NAICS', 2151, 9221, 3, 2153, 92211, 4),\n" +
            "(1348, 'SIC', 2982, 2000, 2, 3040, 2099, 4),\n" +
            "(1349, 'NAICS', 930, 42, 1, 974, 42352, 4),\n" +
            "(1350, 'NAICS', 1424, 51212, 4, 1423, 512120, 5),\n" +
            "(1351, 'NAICS', 1634, 5412, 3, 1635, 54121, 4),\n" +
            "(1352, 'SIC', 4312, 60, 1, 3944, 6159, 4),\n" +
            "(1353, 'SIC', 4313, 70, 1, 4129, 7922, 4),\n" +
            "(1354, 'SEC', 2792, 40, 1, 2549, 4841, 4),\n" +
            "(1355, 'SIC', 3762, 5100, 2, 3801, 5194, 4),\n" +
            "(1356, 'NAICS', 182, 2211, 3, 186, 221113, 5),\n" +
            "(1357, 'SEC', 2568, 5000, 2, 2577, 5050, 3),\n" +
            "(1358, 'NAICS', 1592, 5321, 3, 1596, 532120, 5),\n" +
            "(1359, 'NAICS', 2108, 81321, 4, 2110, 813212, 5),\n" +
            "(1360, 'SIC', 2868, 800, 2, 2872, 831, 4),\n" +
            "(1361, 'NAICS', 2037, 81, 1, 2091, 812331, 5),\n" +
            "(1362, 'SIC', 4308, 20, 1, 3561, 3826, 4),\n" +
            "(1363, 'SIC', 3724, 5030, 3, 3725, 5031, 4),\n" +
            "(1364, 'NAICS', 2189, 9261, 3, 2191, 92611, 4),\n" +
            "(1365, 'SEC', 2795, 60, 1, 2690, 6399, 4),\n" +
            "(1366, 'NAICS', 1942, 71, 1, 1955, 711211, 5),\n" +
            "(1367, 'SEC', 2791, 20, 1, 2282, 2452, 4),\n" +
            "(1368, 'SIC', 3349, 3330, 3, 3351, 3334, 4),\n" +
            "(1369, 'SIC', 4203, 8400, 2, 4206, 8420, 3),\n" +
            "(1370, 'NAICS', 181, 221, 2, 190, 221117, 5),\n" +
            "(1371, 'NAICS', 1583, 5313, 3, 1584, 53131, 4),\n" +
            "(1372, 'NAICS', 1532, 52393, 4, 1531, 523930, 5),\n" +
            "(1373, 'SIC', 3544, 3760, 3, 3546, 3764, 4),\n" +
            "(1374, 'NAICS', 1402, 51, 1, 1417, 511210, 5),\n" +
            "(1375, 'NAICS', 208, 23611, 4, 211, 236117, 5),\n" +
            "(1376, 'SIC', 4313, 70, 1, 4105, 7630, 3),\n" +
            "(1377, 'NAICS', 930, 42, 1, 935, 423120, 5),\n" +
            "(1378, 'SEC', 2742, 7820, 3, 2743, 7822, 4),\n" +
            "(1379, 'NAICS', 930, 42, 1, 1065, 42469, 4),\n" +
            "(1380, 'NAICS', 930, 42, 1, 937, 423130, 5),\n" +
            "(1381, 'SIC', 2921, 1420, 3, 2924, 1429, 4),\n" +
            "(1382, 'SIC', 4308, 20, 1, 3303, 3211, 4),\n" +
            "(1383, 'SIC', 4308, 20, 1, 3241, 2870, 3),\n" +
            "(1384, 'SIC', 2876, 910, 3, 2877, 912, 4),\n" +
            "(1385, 'NAICS', 2135, 92, 1, 2172, 923130, 5),\n" +
            "(1386, 'SIC', 3511, 3670, 3, 3516, 3676, 4),\n" +
            "(1387, 'SIC', 3937, 6100, 2, 3940, 6140, 3),\n" +
            "(1388, 'NAICS', 236, 2381, 3, 241, 238130, 5),\n" +
            "(1389, 'NAICS', 2037, 81, 1, 2059, 811310, 5),\n" +
            "(1390, 'NAICS', 2037, 81, 1, 2049, 811191, 5),\n" +
            "(1391, 'NAICS', 56, 112, 2, 90, 112910, 5),\n" +
            "(1392, 'SIC', 4313, 70, 1, 4057, 7349, 4),\n" +
            "(1393, 'SEC', 2403, 3500, 2, 2423, 3569, 4),\n" +
            "(1394, 'SIC', 4308, 20, 1, 3148, 2500, 2),\n" +
            "(1395, 'NAICS', 56, 112, 2, 59, 112111, 5),\n" +
            "(1396, 'NAICS', 205, 23, 1, 221, 23711, 4),\n" +
            "(1397, 'NAICS', 2003, 72, 1, 2013, 7212, 3),\n" +
            "(1398, 'SIC', 3715, 5000, 2, 3716, 5010, 3),\n" +
            "(1399, 'SIC', 3701, 4930, 3, 3703, 4932, 4),\n" +
            "(1400, 'SIC', 3940, 6140, 3, 3941, 6141, 4),\n" +
            "(1401, 'SIC', 4309, 40, 1, 3625, 4215, 4),\n" +
            "(1402, 'SIC', 4311, 52, 1, 3855, 5610, 3),\n" +
            "(1403, 'NAICS', 2037, 81, 1, 2126, 81393, 4),\n" +
            "(1404, 'SEC', 2476, 3800, 2, 2486, 3827, 4),\n" +
            "(1405, 'NAICS', 1536, 524, 2, 1537, 5241, 3),\n" +
            "(1406, 'SIC', 3419, 3500, 2, 3475, 3592, 4),\n" +
            "(1407, 'NAICS', 1470, 519, 2, 1474, 519120, 5),\n" +
            "(1408, 'SIC', 3012, 2060, 3, 3017, 2066, 4),\n" +
            "(1409, 'NAICS', 226, 2372, 3, 228, 23721, 4),\n" +
            "(1410, 'SIC', 3050, 2200, 2, 3058, 2241, 4),\n" +
            "(1411, 'NAICS', 1049, 42447, 4, 1048, 424470, 5),\n" +
            "(1412, 'NAICS', 1908, 6232, 3, 1910, 62321, 4),\n" +
            "(1413, 'NAICS', 2, 111, 2, 24, 111310, 5),\n" +
            "(1414, 'SEC', 2791, 20, 1, 2354, 3140, 3),\n" +
            "(1415, 'NAICS', 180, 22, 1, 181, 221, 2),\n" +
            "(1416, 'SIC', 2813, 170, 3, 2814, 171, 4),\n" +
            "(1417, 'NAICS', 991, 4238, 3, 995, 42382, 4),\n" +
            "(1418, 'NAICS', 931, 423, 2, 970, 4235, 3),\n" +
            "(1419, 'NAICS', 1726, 561, 2, 1756, 561492, 5),\n" +
            "(1420, 'SIC', 2901, 1200, 2, 2907, 1240, 3),\n" +
            "(1421, 'NAICS', 2037, 81, 1, 2115, 813312, 5),\n" +
            "(1422, 'SEC', 2791, 20, 1, 2260, 2110, 3),\n" +
            "(1423, 'SIC', 3020, 2070, 3, 3025, 2079, 4),\n" +
            "(1424, 'NAICS', 931, 423, 2, 996, 423830, 5),\n" +
            "(1425, 'NAICS', 2, 111, 2, 32, 111334, 5),\n" +
            "(1426, 'NAICS', 1725, 56, 1, 1791, 56199, 4),\n" +
            "(1427, 'NAICS', 181, 221, 2, 192, 22112, 4),\n" +
            "(1428, 'NAICS', 2037, 81, 1, 2113, 81331, 4),\n" +
            "(1429, 'NAICS', 1725, 56, 1, 1807, 562920, 5),\n" +
            "(1430, 'SIC', 3526, 3700, 2, 3550, 3795, 4),\n" +
            "(1431, 'SEC', 2685, 6350, 3, 2686, 6351, 4),\n" +
            "(1432, 'NAICS', 2037, 81, 1, 2040, 81111, 4),\n" +
            "(1433, 'SIC', 3680, 4800, 2, 3688, 4833, 4),\n" +
            "(1434, 'NAICS', 1825, 61141, 4, 1824, 611410, 5),\n" +
            "(1435, 'SIC', 3882, 5800, 2, 3883, 5810, 3),\n" +
            "(1436, 'SIC', 4312, 60, 1, 3988, 6541, 4),\n" +
            "(1437, 'SIC', 4306, 10, 1, 2922, 1422, 4),\n" +
            "(1438, 'NAICS', 205, 23, 1, 218, 237, 2),\n" +
            "(1439, 'NAICS', 1082, 42493, 4, 1081, 424930, 5),\n" +
            "(1440, 'SIC', 3468, 3580, 3, 3470, 3582, 4),\n" +
            "(1441, 'SIC', 4312, 60, 1, 4006, 6799, 4),\n" +
            "(1442, 'SIC', 4307, 15, 1, 2964, 1742, 4),\n" +
            "(1443, 'SIC', 4308, 20, 1, 3433, 3537, 4),\n" +
            "(1444, 'NAICS', 1431, 5122, 3, 1438, 512240, 5),\n" +
            "(1445, 'NAICS', 1569, 53, 1, 1583, 5313, 3),\n" +
            "(1446, 'NAICS', 2009, 72112, 4, 2008, 721120, 5),\n" +
            "(1447, 'SIC', 4308, 20, 1, 3355, 3350, 3),\n" +
            "(1448, 'NAICS', 1547, 5242, 3, 1550, 52429, 4),\n" +
            "(1449, 'NAICS', 1402, 51, 1, 1450, 515210, 5),\n" +
            "(1450, 'NAICS', 1787, 56191, 4, 1786, 561910, 5),\n" +
            "(1451, 'SEC', 2583, 5070, 3, 2584, 5072, 4),\n" +
            "(1452, 'SIC', 2982, 2000, 2, 2984, 2011, 4),\n" +
            "(1453, 'SIC', 4308, 20, 1, 3524, 3695, 4),\n" +
            "(1454, 'SIC', 3371, 3400, 2, 3378, 3425, 4),\n" +
            "(1455, 'NAICS', 931, 423, 2, 946, 4233, 3),\n" +
            "(1456, 'SEC', 2796, 70, 1, 2779, 8734, 4),\n" +
            "(1457, 'SIC', 4306, 10, 1, 2929, 1455, 4),\n" +
            "(1458, 'SIC', 3555, 3820, 3, 3556, 3821, 4),\n" +
            "(1459, 'NAICS', 2085, 8123, 3, 2088, 812320, 5),\n" +
            "(1460, 'SEC', 2793, 50, 1, 2579, 5060, 3),\n" +
            "(1461, 'SIC', 3296, 3170, 3, 3297, 3171, 4),\n" +
            "(1462, 'NAICS', 1537, 5241, 3, 1540, 524114, 5),\n" +
            "(1463, 'NAICS', 1015, 424, 2, 1046, 424460, 5),\n" +
            "(1464, 'NAICS', 1004, 4239, 3, 1012, 42394, 4),\n" +
            "(1465, 'NAICS', 2135, 92, 1, 2180, 924120, 5),\n" +
            "(1466, 'SIC', 2902, 1220, 3, 2904, 1222, 4),\n" +
            "(1467, 'SEC', 2380, 3350, 3, 2381, 3357, 4),\n" +
            "(1468, 'SEC', 2434, 3600, 2, 2445, 3652, 4),\n" +
            "(1469, 'SEC', 2704, 6790, 3, 2707, 6798, 4),\n" +
            "(1470, 'NAICS', 1, 11, 1, 5, 11111, 4),\n" +
            "(1471, 'SIC', 3419, 3500, 2, 3478, 3596, 4),\n" +
            "(1472, 'SEC', 2260, 2110, 3, 2261, 2111, 4),\n" +
            "(1473, 'SIC', 3715, 5000, 2, 3735, 5048, 4),\n" +
            "(1474, 'NAICS', 2084, 81222, 4, 2083, 812220, 5),\n" +
            "(1475, 'SIC', 3886, 5900, 2, 3891, 5930, 3),\n" +
            "(1476, 'NAICS', 931, 423, 2, 997, 42383, 4),\n" +
            "(1477, 'SEC', 2670, 6200, 2, 2675, 6280, 3),\n" +
            "(1478, 'SIC', 4308, 20, 1, 3141, 2450, 3),\n" +
            "(1479, 'SIC', 3605, 4100, 2, 3619, 4173, 4),\n" +
            "(1480, 'NAICS', 1480, 52, 1, 1496, 522210, 5),\n" +
            "(1481, 'SIC', 3093, 2330, 3, 3097, 2339, 4),\n" +
            "(1482, 'SIC', 2918, 1400, 2, 2921, 1420, 3),\n" +
            "(1483, 'SIC', 3854, 5600, 2, 3863, 5650, 3),\n" +
            "(1484, 'SIC', 4313, 70, 1, 4029, 7230, 3),\n" +
            "(1485, 'SIC', 3676, 4780, 3, 3679, 4789, 4),\n" +
            "(1486, 'NAICS', 205, 23, 1, 232, 2379, 3),\n" +
            "(1487, 'SIC', 4308, 20, 1, 3304, 3220, 3),\n" +
            "(1488, 'NAICS', 156, 2123, 3, 159, 212312, 5),\n" +
            "(1489, 'NAICS', 1920, 624, 2, 1938, 62431, 4),\n" +
            "(1490, 'NAICS', 1836, 6116, 3, 1840, 61162, 4),\n" +
            "(1491, 'SIC', 4311, 52, 1, 3873, 5714, 4),\n" +
            "(1492, 'SIC', 4308, 20, 1, 3244, 2875, 4),\n" +
            "(1493, 'NAICS', 180, 22, 1, 198, 2213, 3),\n" +
            "(1494, 'NAICS', 118, 1151, 3, 124, 115115, 5),\n" +
            "(1495, 'SIC', 3620, 4200, 2, 3622, 4212, 4),\n" +
            "(1496, 'NAICS', 1569, 53, 1, 1579, 53119, 4),\n" +
            "(1497, 'NAICS', 932, 4231, 3, 940, 42314, 4),\n" +
            "(1498, 'SIC', 3419, 3500, 2, 3450, 3559, 4),\n" +
            "(1499, 'NAICS', 1495, 5222, 3, 1499, 52222, 4),\n" +
            "(1500, 'SIC', 3419, 3500, 2, 3463, 3572, 4),\n" +
            "(1501, 'NAICS', 1480, 52, 1, 1502, 522292, 5),\n" +
            "(1502, 'NAICS', 1516, 52311, 4, 1515, 523110, 5),\n" +
            "(1503, 'NAICS', 2003, 72, 1, 2010, 72119, 4),\n" +
            "(1504, 'NAICS', 930, 42, 1, 1060, 42459, 4),\n" +
            "(1505, 'NAICS', 2037, 81, 1, 2092, 812332, 5),\n" +
            "(1506, 'SEC', 2791, 20, 1, 2271, 2300, 2),\n" +
            "(1507, 'SIC', 3961, 6320, 3, 3963, 6324, 4),\n" +
            "(1508, 'NAICS', 1944, 7111, 3, 1946, 71111, 4),\n" +
            "(1509, 'SIC', 4308, 20, 1, 2997, 2035, 4),\n" +
            "(1510, 'SEC', 2791, 20, 1, 2408, 3530, 3),\n" +
            "(1511, 'SIC', 3693, 4900, 2, 3713, 4970, 3),\n" +
            "(1512, 'SEC', 2654, 6030, 3, 2655, 6035, 4),\n" +
            "(1513, 'SIC', 2982, 2000, 2, 2996, 2034, 4),\n" +
            "(1514, 'NAICS', 132, 21, 1, 162, 21232, 4),\n" +
            "(1515, 'SIC', 4192, 8300, 2, 4197, 8350, 3),\n" +
            "(1516, 'NAICS', 1, 11, 1, 26, 111320, 5),\n" +
            "(1517, 'NAICS', 1518, 52312, 4, 1517, 523120, 5),\n" +
            "(1518, 'SIC', 3480, 3600, 2, 3495, 3639, 4),\n" +
            "(1519, 'SIC', 4017, 7200, 2, 4031, 7240, 3),\n" +
            "(1520, 'SIC', 4204, 8410, 3, 4205, 8412, 4),\n" +
            "(1521, 'SIC', 4305, 1, 1, 2798, 100, 2),\n" +
            "(1522, 'NAICS', 2005, 7211, 3, 2011, 721191, 5),\n" +
            "(1523, 'NAICS', 2150, 922, 2, 2151, 9221, 3),\n" +
            "(1524, 'NAICS', 1015, 424, 2, 1045, 42445, 4),\n" +
            "(1525, 'NAICS', 205, 23, 1, 239, 238120, 5),\n" +
            "(1526, 'NAICS', 1, 11, 1, 2, 111, 2),\n" +
            "(1527, 'NAICS', 1978, 71219, 4, 1977, 712190, 5),\n" +
            "(1528, 'SIC', 4308, 20, 1, 3516, 3676, 4),\n" +
            "(1529, 'NAICS', 2087, 81231, 4, 2086, 812310, 5),\n" +
            "(1530, 'SIC', 4309, 40, 1, 3697, 4922, 4),\n" +
            "(1531, 'SIC', 4308, 20, 1, 3383, 3433, 4),\n" +
            "(1532, 'SIC', 3258, 2990, 3, 3260, 2999, 4),\n" +
            "(1533, 'NAICS', 117, 115, 2, 124, 115115, 5),\n" +
            "(1534, 'SEC', 2791, 20, 1, 2423, 3569, 4),\n" +
            "(1535, 'NAICS', 1402, 51, 1, 1407, 511120, 5),\n" +
            "(1536, 'SIC', 4308, 20, 1, 3500, 3645, 4),\n" +
            "(1537, 'NAICS', 1624, 54, 1, 1653, 541370, 5),\n" +
            "(1538, 'NAICS', 1850, 62, 1, 1878, 621492, 5),\n" +
            "(1539, 'SEC', 2302, 2700, 2, 2316, 2771, 4),\n" +
            "(1540, 'NAICS', 941, 4232, 3, 944, 423220, 5),\n" +
            "(1541, 'SEC', 2568, 5000, 2, 2590, 5099, 4),\n" +
            "(1542, 'SIC', 4313, 70, 1, 4083, 7513, 4),\n" +
            "(1543, 'NAICS', 1418, 51121, 4, 1417, 511210, 5),\n" +
            "(1544, 'NAICS', 2037, 81, 1, 2084, 81222, 4),\n" +
            "(1545, 'SEC', 2791, 20, 1, 2291, 2590, 3),\n" +
            "(1546, 'SIC', 4256, 9200, 2, 4258, 9211, 4),\n" +
            "(1547, 'SIC', 4089, 7530, 3, 4090, 7532, 4),\n" +
            "(1548, 'NAICS', 52, 11199, 4, 54, 111992, 5),\n" +
            "(1549, 'NAICS', 117, 115, 2, 129, 1153, 3),\n" +
            "(1550, 'SIC', 2966, 1750, 3, 2967, 1751, 4),\n" +
            "(1551, 'SIC', 4313, 70, 1, 4191, 8299, 4),\n" +
            "(1552, 'SIC', 3375, 3420, 3, 3377, 3423, 4),\n" +
            "(1553, 'SIC', 4309, 40, 1, 3645, 4480, 3),\n" +
            "(1554, 'SEC', 2527, 4510, 3, 2529, 4513, 4),\n" +
            "(1555, 'SIC', 2914, 1380, 3, 2916, 1382, 4),\n" +
            "(1556, 'SIC', 3083, 2300, 2, 3120, 2395, 4),\n" +
            "(1557, 'NAICS', 1904, 623, 2, 1905, 6231, 3),\n" +
            "(1558, 'SIC', 3180, 2670, 3, 3183, 2673, 4),\n" +
            "(1559, 'SIC', 3869, 5700, 2, 3877, 5730, 3),\n" +
            "(1560, 'SIC', 4139, 7990, 3, 4145, 7999, 4),\n" +
            "(1561, 'NAICS', 1513, 523, 2, 1520, 52313, 4),\n" +
            "(1562, 'NAICS', 173, 2131, 3, 176, 213112, 5),\n" +
            "(1563, 'NAICS', 205, 23, 1, 266, 23833, 4),\n" +
            "(1564, 'SIC', 4308, 20, 1, 3154, 2517, 4),\n" +
            "(1565, 'SIC', 3854, 5600, 2, 3855, 5610, 3),\n" +
            "(1566, 'SIC', 4100, 7600, 2, 4107, 7640, 3),\n" +
            "(1567, 'SIC', 3190, 2700, 2, 3207, 2771, 4),\n" +
            "(1568, 'SEC', 2791, 20, 1, 2445, 3652, 4),\n" +
            "(1569, 'SEC', 2791, 20, 1, 2313, 2760, 3),\n" +
            "(1570, 'SIC', 4314, 90, 1, 4273, 9440, 3),\n" +
            "(1571, 'NAICS', 250, 23817, 4, 249, 238170, 5),\n" +
            "(1572, 'NAICS', 1813, 611, 2, 1816, 61111, 4),\n" +
            "(1573, 'SIC', 4314, 90, 1, 4289, 9630, 3),\n" +
            "(1574, 'SIC', 3115, 2390, 3, 3122, 2397, 4),\n" +
            "(1575, 'SIC', 3527, 3710, 3, 3528, 3711, 4),\n" +
            "(1576, 'SIC', 4308, 20, 1, 3159, 2530, 3),\n" +
            "(1577, 'SIC', 4314, 90, 1, 4303, 9990, 3),\n" +
            "(1578, 'SIC', 2982, 2000, 2, 2990, 2023, 4),\n" +
            "(1579, 'SIC', 3749, 5080, 3, 3752, 5084, 4),\n" +
            "(1580, 'NAICS', 1725, 56, 1, 1760, 56151, 4),\n" +
            "(1581, 'SEC', 2568, 5000, 2, 2570, 5013, 4),\n" +
            "(1582, 'SIC', 3083, 2300, 2, 3085, 2311, 4),\n" +
            "(1583, 'SIC', 3000, 2040, 3, 3003, 2044, 4),\n" +
            "(1584, 'SIC', 3797, 5190, 3, 3799, 5192, 4),\n" +
            "(1585, 'SEC', 2500, 3900, 2, 2502, 3911, 4),\n" +
            "(1586, 'NAICS', 1569, 53, 1, 1593, 53211, 4),\n" +
            "(1587, 'SEC', 2795, 60, 1, 2674, 6221, 4),\n" +
            "(1588, 'SIC', 4007, 7000, 2, 4009, 7011, 4),\n" +
            "(1589, 'SIC', 4313, 70, 1, 4059, 7352, 4),\n" +
            "(1590, 'SEC', 2552, 4900, 2, 2563, 4941, 4),\n" +
            "(1591, 'NAICS', 1942, 71, 1, 1986, 713210, 5),\n" +
            "(1592, 'SIC', 4305, 1, 1, 2839, 259, 4),\n" +
            "(1593, 'NAICS', 2153, 92211, 4, 2152, 922110, 5),\n" +
            "(1594, 'NAICS', 3, 1111, 3, 9, 11113, 4),\n" +
            "(1595, 'NAICS', 218, 237, 2, 227, 237210, 5),\n" +
            "(1596, 'NAICS', 23, 1113, 3, 26, 111320, 5),\n" +
            "(1597, 'NAICS', 1592, 5321, 3, 1593, 53211, 4),\n" +
            "(1598, 'NAICS', 2135, 92, 1, 2167, 9231, 3),\n" +
            "(1599, 'SEC', 2458, 3700, 2, 2473, 3751, 4),\n" +
            "(1600, 'SEC', 2793, 50, 1, 2592, 5110, 3),\n" +
            "(1601, 'NAICS', 3, 1111, 3, 6, 111120, 5),\n" +
            "(1602, 'SIC', 4311, 52, 1, 3869, 5700, 2),\n" +
            "(1603, 'SIC', 4308, 20, 1, 3484, 3620, 3),\n" +
            "(1604, 'SIC', 3033, 2090, 3, 3035, 2092, 4),\n" +
            "(1605, 'SIC', 2955, 1700, 2, 2956, 1710, 3),\n" +
            "(1606, 'SIC', 4308, 20, 1, 3178, 2656, 4),\n" +
            "(1607, 'SEC', 2319, 2800, 2, 2330, 2844, 4),\n" +
            "(1608, 'SIC', 3131, 2430, 3, 3134, 2435, 4),\n" +
            "(1609, 'SIC', 3148, 2500, 2, 3161, 2540, 3),\n" +
            "(1610, 'SEC', 2795, 60, 1, 2688, 6361, 4),\n" +
            "(1611, 'SIC', 4307, 15, 1, 2969, 1760, 3),\n" +
            "(1612, 'SIC', 2982, 2000, 2, 3022, 2075, 4),\n" +
            "(1613, 'NAICS', 1419, 512, 2, 1422, 51211, 4),\n" +
            "(1614, 'SEC', 2465, 3720, 3, 2466, 3721, 4),\n" +
            "(1615, 'SEC', 2753, 8000, 2, 2758, 8060, 3),\n" +
            "(1616, 'SIC', 3384, 3440, 3, 3388, 3444, 4),\n" +
            "(1617, 'NAICS', 52, 11199, 4, 53, 111991, 5),\n" +
            "(1618, 'NAICS', 1015, 424, 2, 1069, 424720, 5),\n" +
            "(1619, 'NAICS', 1568, 52599, 4, 1567, 525990, 5),\n" +
            "(1620, 'NAICS', 2151, 9221, 3, 2165, 92219, 4),\n" +
            "(1621, 'SEC', 2240, 2000, 2, 2256, 2086, 4),\n" +
            "(1622, 'SIC', 3419, 3500, 2, 3434, 3540, 3),\n" +
            "(1623, 'SIC', 3322, 3270, 3, 3323, 3271, 4),\n" +
            "(1624, 'SIC', 2940, 1520, 3, 2941, 1521, 4),\n" +
            "(1625, 'NAICS', 1942, 71, 1, 1982, 71311, 4),\n" +
            "(1626, 'SIC', 4305, 1, 1, 2821, 181, 4),\n" +
            "(1627, 'NAICS', 1431, 5122, 3, 1432, 512210, 5),\n" +
            "(1628, 'NAICS', 181, 221, 2, 201, 221320, 5),\n" +
            "(1629, 'NAICS', 1480, 52, 1, 1528, 52391, 4),\n" +
            "(1630, 'SEC', 2637, 5800, 2, 2638, 5810, 3),\n" +
            "(1631, 'SEC', 2403, 3500, 2, 2408, 3530, 3),\n" +
            "(1632, 'SIC', 3526, 3700, 2, 3542, 3750, 3),\n" +
            "(1633, 'SIC', 4158, 8050, 3, 4159, 8051, 4),\n" +
            "(1634, 'SEC', 2791, 20, 1, 2299, 2650, 3),\n" +
            "(1635, 'SIC', 3548, 3790, 3, 3550, 3795, 4),\n" +
            "(1636, 'SIC', 3480, 3600, 2, 3509, 3663, 4),\n" +
            "(1637, 'SEC', 2780, 8740, 3, 2782, 8742, 4),\n" +
            "(1638, 'NAICS', 56, 112, 2, 69, 112310, 5),\n" +
            "(1639, 'NAICS', 2003, 72, 1, 2029, 722410, 5),\n" +
            "(1640, 'SIC', 2875, 900, 2, 2877, 912, 4),\n" +
            "(1641, 'NAICS', 1843, 61169, 4, 1845, 611692, 5),\n" +
            "(1642, 'SIC', 3552, 3800, 2, 3558, 3823, 4),\n" +
            "(1643, 'SIC', 3762, 5100, 2, 3795, 5181, 4),\n" +
            "(1644, 'SIC', 2868, 800, 2, 2871, 830, 3),\n" +
            "(1645, 'NAICS', 1402, 51, 1, 1452, 517, 2),\n" +
            "(1646, 'NAICS', 1480, 52, 1, 1539, 524113, 5),\n" +
            "(1647, 'NAICS', 1741, 5614, 3, 1748, 561431, 5),\n" +
            "(1648, 'SEC', 2605, 5200, 2, 2609, 5271, 4),\n" +
            "(1649, 'NAICS', 2004, 721, 2, 2006, 721110, 5),\n" +
            "(1650, 'SEC', 2795, 60, 1, 2684, 6331, 4),\n" +
            "(1651, 'NAICS', 2135, 92, 1, 2202, 927110, 5),\n" +
            "(1652, 'SEC', 2774, 8700, 2, 2777, 8730, 3),\n" +
            "(1653, 'SIC', 3636, 4400, 2, 3646, 4481, 4),\n" +
            "(1654, 'SIC', 4309, 40, 1, 3676, 4780, 3),\n" +
            "(1655, 'SEC', 2791, 20, 1, 2344, 3011, 4),\n" +
            "(1656, 'SIC', 4311, 52, 1, 3816, 5310, 3),\n" +
            "(1657, 'NAICS', 1495, 5222, 3, 1498, 522220, 5),\n" +
            "(1658, 'SIC', 4312, 60, 1, 3983, 6517, 4),\n" +
            "(1659, 'NAICS', 1015, 424, 2, 1049, 42447, 4),\n" +
            "(1660, 'NAICS', 2028, 7224, 3, 2030, 72241, 4),\n" +
            "(1661, 'SIC', 4308, 20, 1, 3207, 2771, 4),\n" +
            "(1662, 'NAICS', 1, 11, 1, 83, 11242, 4),\n" +
            "(1663, 'SIC', 3419, 3500, 2, 3452, 3561, 4),\n" +
            "(1664, 'SIC', 4311, 52, 1, 3863, 5650, 3),\n" +
            "(1665, 'SEC', 2500, 3900, 2, 2508, 3949, 4),\n" +
            "(1666, 'NAICS', 930, 42, 1, 1070, 42472, 4),\n" +
            "(1667, 'SIC', 3083, 2300, 2, 3103, 2360, 3),\n" +
            "(1668, 'SIC', 4309, 40, 1, 3628, 4222, 4),\n" +
            "(1669, 'SIC', 3083, 2300, 2, 3117, 2392, 4),\n" +
            "(1670, 'SIC', 4230, 8730, 3, 4234, 8734, 4),\n" +
            "(1671, 'NAICS', 1968, 71151, 4, 1967, 711510, 5),\n" +
            "(1672, 'SIC', 4310, 50, 1, 3723, 5023, 4),\n" +
            "(1673, 'NAICS', 1706, 5419, 3, 1708, 54191, 4),\n" +
            "(1674, 'SEC', 2791, 20, 1, 2466, 3721, 4),\n" +
            "(1675, 'SIC', 3511, 3670, 3, 3518, 3678, 4),\n" +
            "(1676, 'SIC', 4314, 90, 1, 4300, 9720, 3),\n" +
            "(1677, 'SIC', 3124, 2400, 2, 3138, 2441, 4),\n" +
            "(1678, 'SIC', 4311, 52, 1, 3882, 5800, 2),\n" +
            "(1679, 'SIC', 4313, 70, 1, 4234, 8734, 4),\n" +
            "(1680, 'NAICS', 2, 111, 2, 36, 1114, 3),\n" +
            "(1681, 'NAICS', 205, 23, 1, 247, 238160, 5),\n" +
            "(1682, 'SEC', 2371, 3300, 2, 2377, 3334, 4),\n" +
            "(1683, 'SIC', 4313, 70, 1, 4162, 8060, 3),\n" +
            "(1684, 'NAICS', 2136, 921, 2, 2138, 921110, 5),\n" +
            "(1685, 'SEC', 2791, 20, 1, 2511, 3990, 3),\n" +
            "(1686, 'SIC', 4268, 9400, 2, 4273, 9440, 3),\n" +
            "(1687, 'SIC', 4313, 70, 1, 4156, 8043, 4),\n" +
            "(1688, 'NAICS', 1726, 561, 2, 1734, 56131, 4),\n" +
            "(1689, 'NAICS', 109, 1141, 3, 112, 114112, 5),\n" +
            "(1690, 'SIC', 3282, 3100, 2, 3291, 3149, 4),\n" +
            "(1691, 'SIC', 3715, 5000, 2, 3733, 5046, 4),\n" +
            "(1692, 'SIC', 4223, 8700, 2, 4225, 8711, 4),\n" +
            "(1693, 'NAICS', 1706, 5419, 3, 1715, 54194, 4),\n" +
            "(1694, 'NAICS', 1942, 71, 1, 1951, 711190, 5),\n" +
            "(1695, 'NAICS', 1626, 5411, 3, 1630, 54112, 4),\n" +
            "(1696, 'NAICS', 1, 11, 1, 126, 1152, 3),\n" +
            "(1697, 'NAICS', 1920, 624, 2, 1929, 624210, 5),\n" +
            "(1698, 'NAICS', 2038, 811, 2, 2057, 811219, 5),\n" +
            "(1699, 'SEC', 2791, 20, 1, 2411, 3533, 4),\n" +
            "(1700, 'SIC', 4308, 20, 1, 3406, 3483, 4),\n" +
            "(1701, 'SEC', 2237, 1700, 2, 2238, 1730, 3),\n" +
            "(1702, 'SEC', 2349, 3080, 3, 2350, 3081, 4),\n" +
            "(1703, 'SIC', 2825, 200, 2, 2836, 252, 4),\n" +
            "(1704, 'SEC', 2791, 20, 1, 2504, 3931, 4),\n" +
            "(1705, 'NAICS', 2189, 9261, 3, 2195, 92613, 4),\n" +
            "(1706, 'SEC', 2794, 52, 1, 2631, 5710, 3),\n" +
            "(1707, 'SIC', 4308, 20, 1, 3571, 3851, 4),\n" +
            "(1708, 'SIC', 4018, 7210, 3, 4022, 7215, 4),\n" +
            "(1709, 'NAICS', 931, 423, 2, 933, 423110, 5),\n" +
            "(1710, 'NAICS', 132, 21, 1, 142, 212112, 5),\n" +
            "(1711, 'NAICS', 1, 11, 1, 88, 112519, 5),\n" +
            "(1712, 'NAICS', 1882, 62151, 4, 1884, 621512, 5),\n" +
            "(1713, 'SIC', 3762, 5100, 2, 3786, 5154, 4),\n" +
            "(1714, 'SIC', 3371, 3400, 2, 3391, 3449, 4),\n" +
            "(1715, 'SIC', 3886, 5900, 2, 3890, 5921, 4),\n" +
            "(1716, 'SEC', 2615, 5390, 3, 2616, 5399, 4),\n" +
            "(1717, 'NAICS', 1942, 71, 1, 1948, 71112, 4),\n" +
            "(1718, 'SIC', 4308, 20, 1, 3389, 3446, 4),\n" +
            "(1719, 'NAICS', 2135, 92, 1, 2143, 92113, 4),\n" +
            "(1720, 'SEC', 2791, 20, 1, 2279, 2430, 3),\n" +
            "(1721, 'NAICS', 1942, 71, 1, 1995, 713930, 5),\n" +
            "(1722, 'NAICS', 2071, 812, 2, 2089, 81232, 4),\n" +
            "(1723, 'NAICS', 2037, 81, 1, 2071, 812, 2),\n" +
            "(1724, 'SIC', 4313, 70, 1, 4245, 8990, 3),\n" +
            "(1725, 'NAICS', 930, 42, 1, 1084, 42494, 4),\n" +
            "(1726, 'NAICS', 2038, 811, 2, 2052, 8112, 3),\n" +
            "(1727, 'NAICS', 150, 21223, 4, 152, 212234, 5),\n" +
            "(1728, 'NAICS', 1726, 561, 2, 1747, 56143, 4),\n" +
            "(1729, 'SEC', 2791, 20, 1, 2336, 2891, 4),\n" +
            "(1730, 'SIC', 3252, 2900, 2, 3254, 2911, 4),\n" +
            "(1731, 'NAICS', 2, 111, 2, 23, 1113, 3),\n" +
            "(1732, 'SIC', 4312, 60, 1, 3993, 6710, 3),\n" +
            "(1733, 'NAICS', 195, 2212, 3, 197, 22121, 4),\n" +
            "(1734, 'SIC', 2875, 900, 2, 2879, 919, 4),\n" +
            "(1735, 'SEC', 2523, 4400, 2, 2524, 4410, 3),\n" +
            "(1736, 'SIC', 4312, 60, 1, 3943, 6153, 4),\n" +
            "(1737, 'SIC', 3012, 2060, 3, 3014, 2062, 4),\n" +
            "(1738, 'NAICS', 2209, 92812, 4, 2208, 928120, 5),\n" +
            "(1739, 'SIC', 4309, 40, 1, 3626, 4220, 3),\n" +
            "(1740, 'SIC', 4313, 70, 1, 4161, 8059, 4),\n" +
            "(1741, 'NAICS', 930, 42, 1, 972, 42351, 4),\n" +
            "(1742, 'SIC', 3174, 2650, 3, 3175, 2652, 4),\n" +
            "(1743, 'SIC', 3886, 5900, 2, 3905, 5962, 4),\n" +
            "(1744, 'SIC', 4313, 70, 1, 4220, 8661, 4),\n" +
            "(1745, 'SIC', 4310, 50, 1, 3731, 5044, 4),\n" +
            "(1746, 'SIC', 4310, 50, 1, 3761, 5099, 4),\n" +
            "(1747, 'SIC', 4308, 20, 1, 3238, 2861, 4),\n" +
            "(1748, 'SEC', 2791, 20, 1, 2459, 3710, 3),\n" +
            "(1749, 'NAICS', 2062, 81141, 4, 2063, 811411, 5),\n" +
            "(1750, 'NAICS', 1726, 561, 2, 1746, 561422, 5),\n" +
            "(1751, 'SIC', 3419, 3500, 2, 3420, 3510, 3),\n" +
            "(1752, 'NAICS', 1912, 62322, 4, 1911, 623220, 5),\n" +
            "(1753, 'NAICS', 2071, 812, 2, 2100, 81293, 4),\n" +
            "(1754, 'SEC', 2771, 8350, 3, 2772, 8351, 4),\n" +
            "(1755, 'SIC', 2868, 800, 2, 2874, 851, 4),\n" +
            "(1756, 'NAICS', 1470, 519, 2, 1475, 51912, 4),\n" +
            "(1757, 'NAICS', 2135, 92, 1, 2141, 92112, 4),\n" +
            "(1758, 'SIC', 3842, 5530, 3, 3843, 5531, 4),\n" +
            "(1759, 'SIC', 4040, 7300, 2, 4074, 7379, 4),\n" +
            "(1760, 'SEC', 2795, 60, 1, 4324, 6190, 3),\n" +
            "(1761, 'SIC', 3033, 2090, 3, 3034, 2091, 4),\n" +
            "(1762, 'SIC', 4312, 60, 1, 4004, 6794, 4),\n" +
            "(1763, 'NAICS', 1456, 5172, 3, 1458, 51721, 4),\n" +
            "(1764, 'SIC', 4308, 20, 1, 3498, 3643, 4),\n" +
            "(1765, 'SEC', 2545, 4830, 3, 2546, 4832, 4),\n" +
            "(1766, 'SIC', 4312, 60, 1, 3965, 6331, 4),\n" +
            "(1767, 'SIC', 2798, 100, 2, 2799, 110, 3),\n" +
            "(1768, 'SIC', 4213, 8630, 3, 4214, 8631, 4),\n" +
            "(1769, 'NAICS', 1881, 6215, 3, 1884, 621512, 5),\n" +
            "(1770, 'NAICS', 156, 2123, 3, 165, 212324, 5),\n" +
            "(1771, 'SIC', 4308, 20, 1, 3000, 2040, 3),\n" +
            "(1772, 'SIC', 4309, 40, 1, 3605, 4100, 2),\n" +
            "(1773, 'SIC', 3715, 5000, 2, 3724, 5030, 3),\n" +
            "(1774, 'NAICS', 1625, 541, 2, 1653, 541370, 5),\n" +
            "(1775, 'NAICS', 2150, 922, 2, 2158, 922140, 5),\n" +
            "(1776, 'NAICS', 2151, 9221, 3, 2157, 92213, 4),\n" +
            "(1777, 'SIC', 2982, 2000, 2, 3020, 2070, 3),\n" +
            "(1778, 'NAICS', 180, 22, 1, 200, 22131, 4),\n" +
            "(1779, 'SEC', 2391, 3440, 3, 2395, 3448, 4),\n" +
            "(1780, 'NAICS', 134, 2111, 3, 136, 211111, 5),\n" +
            "(1781, 'NAICS', 181, 221, 2, 182, 2211, 3),\n" +
            "(1782, 'NAICS', 2038, 811, 2, 2051, 811198, 5),\n" +
            "(1783, 'SIC', 3304, 3220, 3, 3306, 3229, 4),\n" +
            "(1784, 'NAICS', 2090, 81233, 4, 2091, 812331, 5),\n" +
            "(1785, 'SIC', 3992, 6700, 2, 3998, 6726, 4),\n" +
            "(1786, 'NAICS', 205, 23, 1, 222, 237120, 5),\n" +
            "(1787, 'SEC', 2796, 70, 1, 2760, 8070, 3),\n" +
            "(1788, 'NAICS', 2038, 811, 2, 2062, 81141, 4),\n" +
            "(1789, 'NAICS', 1, 11, 1, 74, 11233, 4),\n" +
            "(1790, 'NAICS', 1942, 71, 1, 1969, 712, 2),\n" +
            "(1791, 'NAICS', 2093, 8129, 3, 2096, 81292, 4),\n" +
            "(1792, 'SEC', 2319, 2800, 2, 2326, 2835, 4),\n" +
            "(1793, 'SEC', 2680, 6320, 3, 2682, 6324, 4),\n" +
            "(1794, 'NAICS', 40, 11142, 4, 42, 111422, 5),\n" +
            "(1795, 'NAICS', 1620, 533, 2, 1621, 5331, 3),\n" +
            "(1796, 'SIC', 3148, 2500, 2, 3163, 2542, 4),\n" +
            "(1797, 'SEC', 2738, 7800, 2, 2743, 7822, 4),\n" +
            "(1798, 'SIC', 4314, 90, 1, 4248, 9110, 3),\n" +
            "(1799, 'NAICS', 1942, 71, 1, 1994, 71392, 4),\n" +
            "(1800, 'SIC', 4311, 52, 1, 3825, 5420, 3),\n" +
            "(1801, 'SIC', 4313, 70, 1, 4014, 7033, 4),\n" +
            "(1802, 'NAICS', 1928, 6242, 3, 1934, 624230, 5),\n" +
            "(1803, 'NAICS', 1480, 52, 1, 1534, 523991, 5),\n" +
            "(1804, 'SEC', 2292, 2600, 2, 2299, 2650, 3),\n" +
            "(1805, 'SEC', 2513, 4010, 3, 2514, 4011, 4),\n" +
            "(1806, 'NAICS', 1990, 7139, 3, 1997, 713940, 5),\n" +
            "(1807, 'SIC', 2945, 1540, 3, 2946, 1541, 4),\n" +
            "(1808, 'SIC', 4308, 20, 1, 3279, 3087, 4),\n" +
            "(1809, 'SIC', 4308, 20, 1, 3518, 3678, 4),\n" +
            "(1810, 'SIC', 3616, 4150, 3, 3617, 4151, 4),\n" +
            "(1811, 'SEC', 2269, 2270, 3, 2270, 2273, 4),\n" +
            "(1812, 'SIC', 4308, 20, 1, 3245, 2879, 4),\n" +
            "(1813, 'NAICS', 273, 2389, 3, 276, 238990, 5),\n" +
            "(1814, 'NAICS', 37, 11141, 4, 39, 111419, 5),\n" +
            "(1815, 'NAICS', 1485, 522, 2, 1487, 522110, 5),\n" +
            "(1816, 'NAICS', 1621, 5331, 3, 1622, 533110, 5),\n" +
            "(1817, 'SIC', 3059, 2250, 3, 3060, 2251, 4),\n" +
            "(1818, 'SIC', 4308, 20, 1, 3197, 2732, 4),\n" +
            "(1819, 'SIC', 4113, 7800, 2, 4123, 7840, 3),\n" +
            "(1820, 'SIC', 4308, 20, 1, 3415, 3496, 4),\n" +
            "(1821, 'SIC', 3419, 3500, 2, 3421, 3511, 4),\n" +
            "(1822, 'SIC', 3261, 3000, 2, 3278, 3086, 4),\n" +
            "(1823, 'NAICS', 1725, 56, 1, 1793, 5621, 3),\n" +
            "(1824, 'SEC', 2792, 40, 1, 2559, 4930, 3),\n" +
            "(1825, 'SIC', 4146, 8000, 2, 4171, 8090, 3),\n" +
            "(1826, 'SEC', 2543, 4820, 3, 2544, 4822, 4),\n" +
            "(1827, 'SIC', 4012, 7030, 3, 4013, 7032, 4),\n" +
            "(1828, 'NAICS', 1969, 712, 2, 1973, 712120, 5);\n";
    static String industryCodeInsert14 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(1829, 'SIC', 3124, 2400, 2, 3136, 2439, 4),\n" +
            "(1830, 'SIC', 4308, 20, 1, 3016, 2064, 4),\n" +
            "(1831, 'SIC', 4308, 20, 1, 3526, 3700, 2),\n" +
            "(1832, 'SIC', 4235, 8740, 3, 4237, 8742, 4),\n" +
            "(1833, 'SIC', 4309, 40, 1, 3703, 4932, 4),\n" +
            "(1834, 'NAICS', 1428, 51219, 4, 1430, 512199, 5),\n" +
            "(1835, 'NAICS', 180, 22, 1, 187, 221114, 5),\n" +
            "(1836, 'NAICS', 930, 42, 1, 968, 423490, 5),\n" +
            "(1837, 'SIC', 4309, 40, 1, 3608, 4119, 4),\n" +
            "(1838, 'NAICS', 58, 11211, 4, 60, 112112, 5),\n" +
            "(1839, 'SEC', 2403, 3500, 2, 2411, 3533, 4),\n" +
            "(1840, 'NAICS', 1554, 525, 2, 1559, 52512, 4),\n" +
            "(1841, 'SEC', 2512, 4000, 2, 2514, 4011, 4),\n" +
            "(1842, 'SIC', 3636, 4400, 2, 3639, 4420, 3),\n" +
            "(1843, 'SIC', 4018, 7210, 3, 4026, 7219, 4),\n" +
            "(1844, 'NAICS', 1626, 5411, 3, 1628, 54111, 4),\n" +
            "(1845, 'NAICS', 2037, 81, 1, 2111, 813219, 5),\n" +
            "(1846, 'NAICS', 172, 213, 2, 173, 2131, 3),\n" +
            "(1847, 'SIC', 2825, 200, 2, 2846, 291, 4),\n" +
            "(1848, 'SIC', 4308, 20, 1, 3497, 3641, 4),\n" +
            "(1849, 'SIC', 3484, 3620, 3, 3486, 3624, 4),\n" +
            "(1850, 'SEC', 2579, 5060, 3, 2580, 5063, 4),\n" +
            "(1851, 'NAICS', 1402, 51, 1, 1440, 512290, 5),\n" +
            "(1852, 'SIC', 4308, 20, 1, 3548, 3790, 3),\n" +
            "(1853, 'NAICS', 205, 23, 1, 237, 238110, 5),\n" +
            "(1854, 'SIC', 3337, 3300, 2, 3355, 3350, 3),\n" +
            "(1855, 'SIC', 3667, 4700, 2, 3672, 4730, 3),\n" +
            "(1856, 'NAICS', 1942, 71, 1, 1976, 71213, 4),\n" +
            "(1857, 'NAICS', 2037, 81, 1, 2053, 81121, 4),\n" +
            "(1858, 'SEC', 2548, 4840, 3, 2549, 4841, 4),\n" +
            "(1859, 'NAICS', 2176, 924, 2, 2179, 92411, 4),\n" +
            "(1860, 'SEC', 2791, 20, 1, 2246, 2024, 4),\n" +
            "(1861, 'SIC', 4308, 20, 1, 3469, 3581, 4),\n" +
            "(1862, 'NAICS', 965, 42345, 4, 964, 423450, 5),\n" +
            "(1863, 'SEC', 2476, 3800, 2, 2484, 3825, 4),\n" +
            "(1864, 'SIC', 3480, 3600, 2, 3494, 3635, 4),\n" +
            "(1865, 'SIC', 3763, 5110, 3, 3766, 5113, 4),\n" +
            "(1866, 'SIC', 4308, 20, 1, 3331, 3291, 4),\n" +
            "(1867, 'NAICS', 1537, 5241, 3, 1545, 524130, 5),\n" +
            "(1868, 'NAICS', 206, 236, 2, 215, 23621, 4),\n" +
            "(1869, 'SIC', 3480, 3600, 2, 3512, 3671, 4),\n" +
            "(1870, 'SEC', 2372, 3310, 3, 2374, 3317, 4),\n" +
            "(1871, 'NAICS', 79, 1124, 3, 83, 11242, 4),\n" +
            "(1872, 'SIC', 4308, 20, 1, 3543, 3751, 4),\n" +
            "(1873, 'SIC', 4018, 7210, 3, 4024, 7217, 4),\n" +
            "(1874, 'NAICS', 1015, 424, 2, 1068, 42471, 4),\n" +
            "(1875, 'NAICS', 236, 2381, 3, 245, 238150, 5),\n" +
            "(1876, 'SEC', 2725, 7370, 3, 2726, 7371, 4),\n" +
            "(1877, 'SIC', 2955, 1700, 2, 2960, 1730, 3),\n" +
            "(1878, 'SIC', 4310, 50, 1, 3770, 5131, 4),\n" +
            "(1879, 'NAICS', 1015, 424, 2, 1027, 424310, 5),\n" +
            "(1880, 'SIC', 2949, 1610, 3, 2950, 1611, 4),\n" +
            "(1881, 'SIC', 4065, 7370, 3, 4072, 7377, 4),\n" +
            "(1882, 'NAICS', 1, 11, 1, 84, 1125, 3),\n" +
            "(1883, 'NAICS', 1554, 525, 2, 1563, 525910, 5),\n" +
            "(1884, 'NAICS', 1942, 71, 1, 1950, 71113, 4),\n" +
            "(1885, 'SEC', 2792, 40, 1, 2548, 4840, 3),\n" +
            "(1886, 'SEC', 2793, 50, 1, 2588, 5090, 3),\n" +
            "(1887, 'SIC', 4306, 10, 1, 2901, 1200, 2),\n" +
            "(1888, 'SIC', 3124, 2400, 2, 3144, 2490, 3),\n" +
            "(1889, 'SIC', 4040, 7300, 2, 4066, 7371, 4),\n" +
            "(1890, 'SEC', 2795, 60, 1, 2668, 6162, 4),\n" +
            "(1891, 'SIC', 3419, 3500, 2, 3466, 3578, 4),\n" +
            "(1892, 'NAICS', 1420, 5121, 3, 1422, 51211, 4),\n" +
            "(1893, 'SIC', 4312, 60, 1, 3923, 6022, 4),\n" +
            "(1894, 'NAICS', 1741, 5614, 3, 1745, 561421, 5),\n" +
            "(1895, 'NAICS', 1904, 623, 2, 1913, 6233, 3),\n" +
            "(1896, 'SIC', 3301, 3200, 2, 3316, 3260, 3),\n" +
            "(1897, 'NAICS', 1851, 621, 2, 1861, 62131, 4),\n" +
            "(1898, 'SIC', 2805, 130, 3, 2808, 133, 4),\n" +
            "(1899, 'NAICS', 1725, 56, 1, 1759, 561510, 5),\n" +
            "(1900, 'SEC', 2288, 2530, 3, 2289, 2531, 4),\n" +
            "(1901, 'NAICS', 930, 42, 1, 973, 423520, 5),\n" +
            "(1902, 'SIC', 2955, 1700, 2, 2965, 1743, 4),\n" +
            "(1903, 'SIC', 4125, 7900, 2, 4144, 7997, 4),\n" +
            "(1904, 'NAICS', 1, 11, 1, 61, 112120, 5),\n" +
            "(1905, 'NAICS', 1402, 51, 1, 1423, 512120, 5),\n" +
            "(1906, 'SEC', 2792, 40, 1, 2545, 4830, 3),\n" +
            "(1907, 'NAICS', 140, 21211, 4, 141, 212111, 5),\n" +
            "(1908, 'SIC', 4306, 10, 1, 2914, 1380, 3),\n" +
            "(1909, 'SIC', 3190, 2700, 2, 3197, 2732, 4),\n" +
            "(1910, 'SIC', 4308, 20, 1, 3442, 3548, 4),\n" +
            "(1911, 'NAICS', 182, 2211, 3, 192, 22112, 4),\n" +
            "(1912, 'NAICS', 1626, 5411, 3, 1627, 541110, 5),\n" +
            "(1913, 'SIC', 4105, 7630, 3, 4106, 7631, 4),\n" +
            "(1914, 'NAICS', 2120, 8139, 3, 2127, 813940, 5),\n" +
            "(1915, 'SEC', 2794, 52, 1, 2643, 5940, 3),\n" +
            "(1916, 'SEC', 2418, 3560, 3, 2420, 3562, 4),\n" +
            "(1917, 'SIC', 4235, 8740, 3, 4239, 8744, 4),\n" +
            "(1918, 'SIC', 2876, 910, 3, 2879, 919, 4),\n" +
            "(1919, 'NAICS', 931, 423, 2, 944, 423220, 5),\n" +
            "(1920, 'SIC', 4308, 20, 1, 3506, 3652, 4),\n" +
            "(1921, 'SIC', 4310, 50, 1, 3774, 5140, 3),\n" +
            "(1922, 'SIC', 3992, 6700, 2, 3999, 6730, 3),\n" +
            "(1923, 'SIC', 3989, 6550, 3, 3991, 6553, 4),\n" +
            "(1924, 'SEC', 2479, 3820, 3, 2483, 3824, 4),\n" +
            "(1925, 'NAICS', 1927, 62419, 4, 1926, 624190, 5),\n" +
            "(1926, 'NAICS', 2071, 812, 2, 2077, 81219, 4),\n" +
            "(1927, 'NAICS', 1480, 52, 1, 1550, 52429, 4),\n" +
            "(1928, 'SEC', 2791, 20, 1, 2507, 3944, 4),\n" +
            "(1929, 'SIC', 3762, 5100, 2, 3766, 5113, 4),\n" +
            "(1930, 'SEC', 2795, 60, 1, 2650, 6020, 3),\n" +
            "(1931, 'NAICS', 1015, 424, 2, 1066, 4247, 3),\n" +
            "(1932, 'SEC', 2796, 70, 1, 2721, 7359, 4),\n" +
            "(1933, 'SEC', 2748, 7900, 2, 2749, 7940, 3),\n" +
            "(1934, 'NAICS', 1571, 5311, 3, 1576, 531130, 5),\n" +
            "(1935, 'SIC', 3992, 6700, 2, 3994, 6712, 4),\n" +
            "(1936, 'SIC', 3762, 5100, 2, 3802, 5198, 4),\n" +
            "(1937, 'SIC', 4308, 20, 1, 3574, 3870, 3),\n" +
            "(1938, 'NAICS', 1591, 532, 2, 1600, 53221, 4),\n" +
            "(1939, 'NAICS', 1766, 5616, 3, 1772, 561621, 5),\n" +
            "(1940, 'NAICS', 1774, 5617, 3, 1776, 56171, 4),\n" +
            "(1941, 'SIC', 4307, 15, 1, 2966, 1750, 3),\n" +
            "(1942, 'SIC', 4308, 20, 1, 3527, 3710, 3),\n" +
            "(1943, 'NAICS', 1023, 4242, 3, 1024, 424210, 5),\n" +
            "(1944, 'SIC', 4306, 10, 1, 2920, 1411, 4),\n" +
            "(1945, 'NAICS', 2003, 72, 1, 2024, 722320, 5),\n" +
            "(1946, 'SEC', 2355, 3200, 2, 2364, 3250, 3),\n" +
            "(1947, 'SIC', 3552, 3800, 2, 3565, 3841, 4),\n" +
            "(1948, 'NAICS', 1774, 5617, 3, 1777, 561720, 5),\n" +
            "(1949, 'SIC', 2847, 700, 2, 2848, 710, 3),\n" +
            "(1950, 'NAICS', 1076, 4249, 3, 1077, 424910, 5),\n" +
            "(1951, 'SIC', 2955, 1700, 2, 2970, 1761, 4),\n" +
            "(1952, 'SIC', 3705, 4940, 3, 3706, 4941, 4),\n" +
            "(1953, 'SIC', 4307, 15, 1, 2959, 1721, 4),\n" +
            "(1954, 'NAICS', 1402, 51, 1, 1470, 519, 2),\n" +
            "(1955, 'NAICS', 1850, 62, 1, 1880, 621498, 5),\n" +
            "(1956, 'SEC', 2796, 70, 1, 2711, 7011, 4),\n" +
            "(1957, 'SIC', 2982, 2000, 2, 3002, 2043, 4),\n" +
            "(1958, 'NAICS', 1931, 62422, 4, 1933, 624229, 5),\n" +
            "(1959, 'NAICS', 1850, 62, 1, 1888, 6219, 3),\n" +
            "(1960, 'NAICS', 2003, 72, 1, 2026, 722330, 5),\n" +
            "(1961, 'SEC', 2476, 3800, 2, 2493, 3845, 4),\n" +
            "(1962, 'SIC', 4309, 40, 1, 3690, 4841, 4),\n" +
            "(1963, 'SIC', 4081, 7500, 2, 4090, 7532, 4),\n" +
            "(1964, 'NAICS', 931, 423, 2, 934, 42311, 4),\n" +
            "(1965, 'SIC', 4311, 52, 1, 3853, 5599, 4),\n" +
            "(1966, 'NAICS', 1672, 5416, 3, 1677, 541614, 5),\n" +
            "(1967, 'SEC', 2568, 5000, 2, 2578, 5051, 4),\n" +
            "(1968, 'SIC', 3371, 3400, 2, 3383, 3433, 4),\n" +
            "(1969, 'SIC', 3645, 4480, 3, 3646, 4481, 4),\n" +
            "(1970, 'SIC', 3419, 3500, 2, 3448, 3555, 4),\n" +
            "(1971, 'NAICS', 205, 23, 1, 220, 237110, 5),\n" +
            "(1972, 'NAICS', 1624, 54, 1, 1669, 541512, 5),\n" +
            "(1973, 'NAICS', 2020, 722, 2, 2021, 7223, 3),\n" +
            "(1974, 'SIC', 4308, 20, 1, 3451, 3560, 3),\n" +
            "(1975, 'SIC', 4125, 7900, 2, 4135, 7948, 4),\n" +
            "(1976, 'SIC', 3724, 5030, 3, 3726, 5032, 4),\n" +
            "(1977, 'NAICS', 2, 111, 2, 7, 11112, 4),\n" +
            "(1978, 'NAICS', 1908, 6232, 3, 1909, 623210, 5),\n" +
            "(1979, 'SIC', 3301, 3200, 2, 3329, 3281, 4),\n" +
            "(1980, 'SIC', 4311, 52, 1, 3862, 5641, 4),\n" +
            "(1981, 'NAICS', 182, 2211, 3, 190, 221117, 5),\n" +
            "(1982, 'SEC', 2796, 70, 1, 2752, 7997, 4),\n" +
            "(1983, 'SEC', 2539, 4800, 2, 2550, 4890, 3),\n" +
            "(1984, 'SIC', 4244, 8900, 2, 4245, 8990, 3),\n" +
            "(1985, 'NAICS', 1613, 53241, 4, 1614, 532411, 5),\n" +
            "(1986, 'SIC', 4100, 7600, 2, 4112, 7699, 4),\n" +
            "(1987, 'NAICS', 930, 42, 1, 1057, 424520, 5),\n" +
            "(1988, 'SIC', 4040, 7300, 2, 4047, 7322, 4),\n" +
            "(1989, 'NAICS', 930, 42, 1, 1053, 42449, 4),\n" +
            "(1990, 'NAICS', 1402, 51, 1, 1438, 512240, 5),\n" +
            "(1991, 'NAICS', 1706, 5419, 3, 1712, 541930, 5),\n" +
            "(1992, 'SEC', 2791, 20, 1, 2401, 3480, 3),\n" +
            "(1993, 'SIC', 4311, 52, 1, 3847, 5551, 4),\n" +
            "(1994, 'NAICS', 2135, 92, 1, 2209, 92812, 4),\n" +
            "(1995, 'SIC', 3000, 2040, 3, 3001, 2041, 4),\n" +
            "(1996, 'SIC', 3848, 5560, 3, 3849, 5561, 4),\n" +
            "(1997, 'SIC', 3576, 3900, 2, 3581, 3930, 3),\n" +
            "(1998, 'NAICS', 181, 221, 2, 186, 221113, 5),\n" +
            "(1999, 'SIC', 3762, 5100, 2, 3764, 5111, 4),\n" +
            "(2000, 'SIC', 3989, 6550, 3, 3990, 6552, 4),\n" +
            "(2001, 'NAICS', 235, 238, 2, 269, 238350, 5),\n" +
            "(2002, 'NAICS', 1930, 62421, 4, 1929, 624210, 5),\n" +
            "(2003, 'SIC', 3050, 2200, 2, 3060, 2251, 4),\n" +
            "(2004, 'SIC', 3167, 2600, 2, 3177, 2655, 4),\n" +
            "(2005, 'SEC', 2792, 40, 1, 4318, 4991, 3),\n" +
            "(2006, 'SEC', 2780, 8740, 3, 2781, 8741, 4),\n" +
            "(2007, 'SEC', 2568, 5000, 2, 2569, 5010, 3),\n" +
            "(2008, 'NAICS', 930, 42, 1, 1058, 42452, 4),\n" +
            "(2009, 'SEC', 2793, 50, 1, 2594, 5122, 4),\n" +
            "(2010, 'SIC', 4089, 7530, 3, 4091, 7533, 4),\n" +
            "(2011, 'SEC', 2605, 5200, 2, 2607, 5211, 4),\n" +
            "(2012, 'NAICS', 56, 112, 2, 72, 11232, 4),\n" +
            "(2013, 'NAICS', 2037, 81, 1, 2097, 812921, 5),\n" +
            "(2014, 'SIC', 4311, 52, 1, 3812, 5261, 4),\n" +
            "(2015, 'SEC', 2791, 20, 1, 2375, 3320, 3),\n" +
            "(2016, 'NAICS', 1725, 56, 1, 1784, 56179, 4),\n" +
            "(2017, 'SIC', 3362, 3360, 3, 3367, 3369, 4),\n" +
            "(2018, 'SIC', 3167, 2600, 2, 3169, 2611, 4),\n" +
            "(2019, 'NAICS', 56, 112, 2, 89, 1129, 3),\n" +
            "(2020, 'NAICS', 1640, 5413, 3, 1641, 541310, 5),\n" +
            "(2021, 'SEC', 2476, 3800, 2, 2488, 3840, 3),\n" +
            "(2022, 'SIC', 3261, 3000, 2, 3280, 3088, 4),\n" +
            "(2023, 'NAICS', 1480, 52, 1, 1557, 52511, 4),\n" +
            "(2024, 'SIC', 2850, 720, 3, 2853, 723, 4),\n" +
            "(2025, 'SIC', 4308, 20, 1, 3584, 3942, 4),\n" +
            "(2026, 'SIC', 4310, 50, 1, 3751, 5083, 4),\n" +
            "(2027, 'NAICS', 931, 423, 2, 950, 42332, 4),\n" +
            "(2028, 'NAICS', 1499, 52222, 4, 1498, 522220, 5),\n" +
            "(2029, 'NAICS', 2, 111, 2, 42, 111422, 5),\n" +
            "(2030, 'NAICS', 1513, 523, 2, 1532, 52393, 4),\n" +
            "(2031, 'NAICS', 1843, 61169, 4, 1846, 611699, 5),\n" +
            "(2032, 'SEC', 2552, 4900, 2, 2557, 4923, 4),\n" +
            "(2033, 'SIC', 3451, 3560, 3, 3460, 3569, 4),\n" +
            "(2034, 'SIC', 4313, 70, 1, 4130, 7929, 4),\n" +
            "(2035, 'NAICS', 1689, 5418, 3, 1690, 541810, 5),\n" +
            "(2036, 'SEC', 2791, 20, 1, 2302, 2700, 2),\n" +
            "(2037, 'SIC', 3816, 5310, 3, 3817, 5311, 4),\n" +
            "(2038, 'NAICS', 1942, 71, 1, 2002, 71399, 4),\n" +
            "(2039, 'NAICS', 1, 11, 1, 60, 112112, 5),\n" +
            "(2040, 'NAICS', 2037, 81, 1, 2123, 813920, 5),\n" +
            "(2041, 'SIC', 4017, 7200, 2, 4022, 7215, 4),\n" +
            "(2042, 'NAICS', 931, 423, 2, 960, 423430, 5),\n" +
            "(2043, 'SIC', 4312, 60, 1, 3929, 6061, 4),\n" +
            "(2044, 'NAICS', 129, 1153, 3, 130, 115310, 5),\n" +
            "(2045, 'SIC', 3707, 4950, 3, 3709, 4953, 4),\n" +
            "(2046, 'NAICS', 1920, 624, 2, 1930, 62421, 4),\n" +
            "(2047, 'SIC', 3337, 3300, 2, 3359, 3355, 4),\n" +
            "(2048, 'NAICS', 2167, 9231, 3, 2168, 923110, 5),\n" +
            "(2049, 'NAICS', 1, 11, 1, 99, 1131, 3),\n" +
            "(2050, 'SEC', 2302, 2700, 2, 2307, 2730, 3),\n" +
            "(2051, 'SIC', 3921, 6020, 3, 3924, 6029, 4),\n" +
            "(2052, 'SEC', 2791, 20, 1, 2481, 3822, 4),\n" +
            "(2053, 'SIC', 4089, 7530, 3, 4095, 7538, 4),\n" +
            "(2054, 'NAICS', 2, 111, 2, 43, 1119, 3),\n" +
            "(2055, 'NAICS', 181, 221, 2, 193, 221121, 5),\n" +
            "(2056, 'SIC', 3948, 6200, 2, 3951, 6220, 3),\n" +
            "(2057, 'SIC', 4128, 7920, 3, 4129, 7922, 4),\n" +
            "(2058, 'SIC', 4308, 20, 1, 3298, 3172, 4),\n" +
            "(2059, 'SIC', 3337, 3300, 2, 3350, 3331, 4),\n" +
            "(2060, 'SEC', 2760, 8070, 3, 2761, 8071, 4),\n" +
            "(2061, 'SIC', 3214, 2800, 2, 3220, 2820, 3),\n" +
            "(2062, 'SIC', 3763, 5110, 3, 3764, 5111, 4),\n" +
            "(2063, 'SIC', 4310, 50, 1, 3747, 5075, 4),\n" +
            "(2064, 'NAICS', 1850, 62, 1, 1937, 624310, 5),\n" +
            "(2065, 'SIC', 2825, 200, 2, 2832, 240, 3),\n" +
            "(2066, 'NAICS', 1403, 511, 2, 1412, 51114, 4),\n" +
            "(2067, 'SEC', 2791, 20, 1, 2398, 3452, 4),\n" +
            "(2068, 'SEC', 2792, 40, 1, 2561, 4932, 4),\n" +
            "(2069, 'NAICS', 95, 11293, 4, 94, 112930, 5),\n" +
            "(2070, 'SEC', 2319, 2800, 2, 2329, 2842, 4),\n" +
            "(2071, 'NAICS', 43, 1119, 3, 55, 111998, 5),\n" +
            "(2072, 'NAICS', 1943, 711, 2, 1944, 7111, 3),\n" +
            "(2073, 'SIC', 2956, 1710, 3, 2957, 1711, 4),\n" +
            "(2074, 'NAICS', 213, 2362, 3, 217, 23622, 4),\n" +
            "(2075, 'SIC', 3576, 3900, 2, 3594, 3965, 4),\n" +
            "(2076, 'NAICS', 1, 11, 1, 22, 111219, 5),\n" +
            "(2077, 'NAICS', 1086, 42495, 4, 1085, 424950, 5),\n" +
            "(2078, 'SIC', 4305, 1, 1, 2870, 811, 4),\n" +
            "(2079, 'SIC', 4308, 20, 1, 3473, 3589, 4),\n" +
            "(2080, 'NAICS', 173, 2131, 3, 177, 213113, 5),\n" +
            "(2081, 'SEC', 2371, 3300, 2, 2383, 3390, 3),\n" +
            "(2082, 'SIC', 4311, 52, 1, 3912, 5992, 4),\n" +
            "(2083, 'NAICS', 119, 11511, 4, 122, 115113, 5),\n" +
            "(2084, 'SEC', 2283, 2500, 2, 2284, 2510, 3),\n" +
            "(2085, 'SIC', 3958, 6300, 2, 3966, 6350, 3),\n" +
            "(2086, 'SIC', 2861, 760, 3, 2862, 761, 4),\n" +
            "(2087, 'NAICS', 1733, 5613, 3, 1734, 56131, 4),\n" +
            "(2088, 'NAICS', 2062, 81141, 4, 2064, 811412, 5),\n" +
            "(2089, 'NAICS', 1514, 5231, 3, 1518, 52312, 4),\n" +
            "(2090, 'NAICS', 1625, 541, 2, 1665, 54149, 4),\n" +
            "(2091, 'NAICS', 1944, 7111, 3, 1947, 711120, 5),\n" +
            "(2092, 'SEC', 2791, 20, 1, 2286, 2520, 3),\n" +
            "(2093, 'SIC', 3282, 3100, 2, 3293, 3151, 4),\n" +
            "(2094, 'SIC', 3827, 5430, 3, 3828, 5431, 4),\n" +
            "(2095, 'NAICS', 144, 2122, 3, 153, 21229, 4),\n" +
            "(2096, 'NAICS', 1513, 523, 2, 1531, 523930, 5),\n" +
            "(2097, 'SEC', 2319, 2800, 2, 2323, 2830, 3),\n" +
            "(2098, 'SIC', 4313, 70, 1, 4148, 8011, 4),\n" +
            "(2099, 'SIC', 4113, 7800, 2, 4114, 7810, 3),\n" +
            "(2100, 'SEC', 2313, 2760, 3, 2314, 2761, 4),\n" +
            "(2101, 'SIC', 4314, 90, 1, 4297, 9700, 2),\n" +
            "(2102, 'SIC', 3214, 2800, 2, 3236, 2851, 4),\n" +
            "(2103, 'NAICS', 2166, 923, 2, 2174, 923140, 5),\n" +
            "(2104, 'SEC', 2791, 20, 1, 2416, 3555, 4),\n" +
            "(2105, 'SIC', 4308, 20, 1, 3568, 3844, 4),\n" +
            "(2106, 'SIC', 4313, 70, 1, 4049, 7330, 3),\n" +
            "(2107, 'SIC', 3715, 5000, 2, 3759, 5093, 4),\n" +
            "(2108, 'SIC', 3886, 5900, 2, 3901, 5948, 4),\n" +
            "(2109, 'SEC', 2262, 2200, 2, 2270, 2273, 4),\n" +
            "(2110, 'NAICS', 1920, 624, 2, 1941, 62441, 4),\n" +
            "(2111, 'NAICS', 2128, 81394, 4, 2127, 813940, 5),\n" +
            "(2112, 'SEC', 2307, 2730, 3, 2309, 2732, 4),\n" +
            "(2113, 'SEC', 2792, 40, 1, 2528, 4512, 4),\n" +
            "(2114, 'NAICS', 1480, 52, 1, 1521, 523140, 5),\n" +
            "(2115, 'SEC', 2355, 3200, 2, 2358, 3220, 3),\n" +
            "(2116, 'SIC', 3893, 5940, 3, 3896, 5943, 4),\n" +
            "(2117, 'SIC', 4313, 70, 1, 4217, 8650, 3),\n" +
            "(2118, 'NAICS', 1850, 62, 1, 1884, 621512, 5),\n" +
            "(2119, 'SIC', 3676, 4780, 3, 3678, 4785, 4),\n" +
            "(2120, 'SEC', 2792, 40, 1, 2562, 4940, 3),\n" +
            "(2121, 'SEC', 2677, 6300, 2, 2681, 6321, 4),\n" +
            "(2122, 'SIC', 4311, 52, 1, 3915, 5995, 4),\n" +
            "(2123, 'SIC', 4313, 70, 1, 4104, 7629, 4),\n" +
            "(2124, 'NAICS', 1495, 5222, 3, 1503, 522293, 5),\n" +
            "(2125, 'NAICS', 1836, 6116, 3, 1843, 61169, 4),\n" +
            "(2126, 'SIC', 4017, 7200, 2, 4026, 7219, 4),\n" +
            "(2127, 'SIC', 4313, 70, 1, 4147, 8010, 3),\n" +
            "(2128, 'SEC', 2795, 60, 1, 2686, 6351, 4),\n" +
            "(2129, 'SEC', 2795, 60, 1, 2692, 6410, 3),\n" +
            "(2130, 'NAICS', 930, 42, 1, 948, 42331, 4),\n" +
            "(2131, 'SIC', 3301, 3200, 2, 3324, 3272, 4),\n" +
            "(2132, 'SIC', 4310, 50, 1, 3765, 5112, 4),\n" +
            "(2133, 'NAICS', 1741, 5614, 3, 1755, 561491, 5),\n" +
            "(2134, 'SEC', 2791, 20, 1, 2388, 3420, 3),\n" +
            "(2135, 'NAICS', 1762, 56152, 4, 1761, 561520, 5),\n" +
            "(2136, 'SIC', 3601, 4000, 2, 3603, 4011, 4),\n" +
            "(2137, 'SIC', 4310, 50, 1, 3783, 5149, 4),\n" +
            "(2138, 'SIC', 3426, 3530, 3, 3431, 3535, 4),\n" +
            "(2139, 'NAICS', 2037, 81, 1, 2131, 814, 2),\n" +
            "(2140, 'NAICS', 975, 4236, 3, 981, 42369, 4),\n" +
            "(2141, 'NAICS', 1625, 541, 2, 1690, 541810, 5),\n" +
            "(2142, 'NAICS', 1402, 51, 1, 1426, 512131, 5),\n" +
            "(2143, 'SIC', 3552, 3800, 2, 3560, 3825, 4),\n" +
            "(2144, 'SIC', 4040, 7300, 2, 4060, 7353, 4),\n" +
            "(2145, 'NAICS', 132, 21, 1, 149, 212222, 5),\n" +
            "(2146, 'NAICS', 930, 42, 1, 990, 42374, 4),\n" +
            "(2147, 'SIC', 3767, 5120, 3, 3768, 5122, 4),\n" +
            "(2148, 'NAICS', 1015, 424, 2, 1044, 424450, 5),\n" +
            "(2149, 'SEC', 2789, 10, 1, 2222, 1310, 3),\n" +
            "(2150, 'NAICS', 11, 11114, 4, 10, 111140, 5),\n" +
            "(2151, 'SIC', 3537, 3730, 3, 3539, 3732, 4),\n" +
            "(2152, 'SIC', 4311, 52, 1, 3840, 5520, 3),\n" +
            "(2153, 'NAICS', 931, 423, 2, 967, 42346, 4),\n" +
            "(2154, 'SIC', 3854, 5600, 2, 3862, 5641, 4),\n" +
            "(2155, 'SIC', 2825, 200, 2, 2831, 219, 4),\n" +
            "(2156, 'SEC', 2791, 20, 1, 2325, 2834, 4),\n" +
            "(2157, 'SIC', 4184, 8230, 3, 4185, 8231, 4),\n" +
            "(2158, 'NAICS', 1448, 51512, 4, 1447, 515120, 5),\n" +
            "(2159, 'SEC', 2713, 7300, 2, 2723, 7361, 4),\n" +
            "(2160, 'SIC', 3214, 2800, 2, 3235, 2850, 3),\n" +
            "(2161, 'SEC', 2797, 90, 1, 2786, 9720, 3),\n" +
            "(2162, 'SEC', 2618, 5410, 3, 2619, 5411, 4),\n" +
            "(2163, 'SIC', 3214, 2800, 2, 3234, 2844, 4),\n" +
            "(2164, 'SIC', 3214, 2800, 2, 3227, 2834, 4),\n" +
            "(2165, 'NAICS', 1513, 523, 2, 1524, 523210, 5),\n" +
            "(2166, 'SIC', 3349, 3330, 3, 3352, 3339, 4),\n" +
            "(2167, 'SIC', 4017, 7200, 2, 4024, 7217, 4),\n" +
            "(2168, 'SEC', 2476, 3800, 2, 2478, 3812, 4),\n" +
            "(2169, 'NAICS', 2038, 811, 2, 2039, 8111, 3),\n" +
            "(2170, 'SIC', 3552, 3800, 2, 3564, 3840, 3),\n" +
            "(2171, 'SIC', 4309, 40, 1, 3633, 4300, 2),\n" +
            "(2172, 'NAICS', 2135, 92, 1, 2170, 923120, 5),\n" +
            "(2173, 'SIC', 3311, 3250, 3, 3313, 3253, 4),\n" +
            "(2174, 'SIC', 3444, 3550, 3, 3447, 3554, 4),\n" +
            "(2175, 'SIC', 4310, 50, 1, 3800, 5193, 4),\n" +
            "(2176, 'NAICS', 2150, 922, 2, 2162, 922160, 5),\n" +
            "(2177, 'NAICS', 1958, 7113, 3, 1960, 71131, 4),\n" +
            "(2178, 'SIC', 4268, 9400, 2, 4271, 9430, 3),\n" +
            "(2179, 'SIC', 3762, 5100, 2, 3780, 5146, 4),\n" +
            "(2180, 'SIC', 4308, 20, 1, 3378, 3425, 4),\n" +
            "(2181, 'NAICS', 138, 212, 2, 165, 212324, 5),\n" +
            "(2182, 'SIC', 4049, 7330, 3, 4054, 7338, 4),\n" +
            "(2183, 'NAICS', 1624, 54, 1, 1625, 541, 2),\n" +
            "(2184, 'SIC', 2982, 2000, 2, 3005, 2046, 4),\n" +
            "(2185, 'NAICS', 1969, 712, 2, 1971, 712110, 5),\n" +
            "(2186, 'SIC', 3261, 3000, 2, 3275, 3083, 4),\n" +
            "(2187, 'NAICS', 205, 23, 1, 246, 23815, 4),\n" +
            "(2188, 'SIC', 4308, 20, 1, 3315, 3259, 4),\n" +
            "(2189, 'SIC', 4313, 70, 1, 4159, 8051, 4),\n" +
            "(2190, 'NAICS', 260, 2383, 3, 266, 23833, 4),\n" +
            "(2191, 'NAICS', 1812, 61, 1, 1847, 6117, 3),\n" +
            "(2192, 'SIC', 3322, 3270, 3, 3327, 3275, 4),\n" +
            "(2193, 'SIC', 4305, 1, 1, 2877, 912, 4),\n" +
            "(2194, 'SIC', 4309, 40, 1, 3611, 4130, 3),\n" +
            "(2195, 'SIC', 3740, 5060, 3, 3743, 5065, 4),\n" +
            "(2196, 'SIC', 4311, 52, 1, 3900, 5947, 4),\n" +
            "(2197, 'NAICS', 931, 423, 2, 959, 42342, 4),\n" +
            "(2198, 'NAICS', 1480, 52, 1, 1493, 522190, 5),\n" +
            "(2199, 'NAICS', 1904, 623, 2, 1915, 623311, 5),\n" +
            "(2200, 'SIC', 3050, 2200, 2, 3056, 2231, 4),\n" +
            "(2201, 'NAICS', 1453, 5171, 3, 1455, 51711, 4),\n" +
            "(2202, 'SIC', 3928, 6060, 3, 3930, 6062, 4),\n" +
            "(2203, 'SIC', 4181, 8220, 3, 4183, 8222, 4),\n" +
            "(2204, 'NAICS', 930, 42, 1, 1028, 42431, 4),\n" +
            "(2205, 'SIC', 3304, 3220, 3, 3305, 3221, 4),\n" +
            "(2206, 'NAICS', 1570, 531, 2, 1580, 5312, 3),\n" +
            "(2207, 'NAICS', 1725, 56, 1, 1790, 561990, 5),\n" +
            "(2208, 'NAICS', 1812, 61, 1, 1829, 61143, 4),\n" +
            "(2209, 'NAICS', 931, 423, 2, 991, 4238, 3),\n" +
            "(2210, 'NAICS', 1422, 51211, 4, 1421, 512110, 5),\n" +
            "(2211, 'NAICS', 2179, 92411, 4, 2178, 924110, 5),\n" +
            "(2212, 'SIC', 4309, 40, 1, 3682, 4812, 4),\n" +
            "(2213, 'SIC', 3911, 5990, 3, 3913, 5993, 4),\n" +
            "(2214, 'SIC', 4310, 50, 1, 3778, 5144, 4),\n" +
            "(2215, 'NAICS', 1813, 611, 2, 1823, 6114, 3),\n" +
            "(2216, 'NAICS', 1, 11, 1, 62, 11212, 4),\n" +
            "(2217, 'NAICS', 5, 11111, 4, 4, 111110, 5),\n" +
            "(2218, 'SIC', 4313, 70, 1, 4126, 7910, 3),\n" +
            "(2219, 'NAICS', 1035, 4244, 3, 1038, 424420, 5),\n" +
            "(2220, 'SEC', 2795, 60, 1, 2696, 6512, 4),\n" +
            "(2221, 'NAICS', 132, 21, 1, 136, 211111, 5),\n" +
            "(2222, 'SIC', 4313, 70, 1, 4236, 8741, 4),\n" +
            "(2223, 'NAICS', 1813, 611, 2, 1837, 611610, 5),\n" +
            "(2224, 'NAICS', 2004, 721, 2, 2005, 7211, 3),\n" +
            "(2225, 'NAICS', 1402, 51, 1, 1415, 511199, 5),\n" +
            "(2226, 'SIC', 4308, 20, 1, 3127, 2420, 3),\n" +
            "(2227, 'SIC', 4311, 52, 1, 3910, 5989, 4),\n" +
            "(2228, 'SIC', 2951, 1620, 3, 2954, 1629, 4),\n" +
            "(2229, 'SIC', 3083, 2300, 2, 3092, 2329, 4),\n" +
            "(2230, 'NAICS', 930, 42, 1, 1040, 424430, 5),\n" +
            "(2231, 'NAICS', 2103, 813, 2, 2120, 8139, 3),\n" +
            "(2232, 'SEC', 2342, 3000, 2, 2343, 3010, 3),\n" +
            "(2233, 'SIC', 3083, 2300, 2, 3121, 2396, 4),\n" +
            "(2234, 'SIC', 4309, 40, 1, 3668, 4720, 3),\n" +
            "(2235, 'SEC', 2713, 7300, 2, 2732, 7381, 4),\n" +
            "(2236, 'SIC', 3124, 2400, 2, 3135, 2436, 4),\n" +
            "(2237, 'NAICS', 235, 238, 2, 267, 238340, 5),\n" +
            "(2238, 'NAICS', 2037, 81, 1, 2095, 81291, 4),\n" +
            "(2239, 'SIC', 4311, 52, 1, 3906, 5963, 4),\n" +
            "(2240, 'SEC', 2512, 4000, 2, 2513, 4010, 3),\n" +
            "(2241, 'SEC', 2694, 6500, 2, 2697, 6513, 4),\n" +
            "(2242, 'NAICS', 1480, 52, 1, 1544, 524128, 5),\n" +
            "(2243, 'NAICS', 2090, 81233, 4, 2092, 812332, 5),\n" +
            "(2244, 'SIC', 4265, 9300, 2, 4267, 9311, 4),\n" +
            "(2245, 'NAICS', 205, 23, 1, 212, 236118, 5),\n" +
            "(2246, 'SIC', 3282, 3100, 2, 3292, 3150, 3),\n" +
            "(2247, 'NAICS', 932, 4231, 3, 938, 42313, 4),\n" +
            "(2248, 'NAICS', 1470, 519, 2, 1476, 519130, 5),\n" +
            "(2249, 'NAICS', 1598, 5322, 3, 1605, 53229, 4),\n" +
            "(2250, 'NAICS', 1624, 54, 1, 1695, 54183, 4),\n" +
            "(2251, 'SEC', 2753, 8000, 2, 2765, 8093, 4),\n" +
            "(2252, 'SEC', 2476, 3800, 2, 2477, 3810, 3),\n" +
            "(2253, 'SIC', 4314, 90, 1, 4291, 9640, 3),\n" +
            "(2254, 'SIC', 2975, 1790, 3, 2978, 1794, 4),\n" +
            "(2255, 'SIC', 2975, 1790, 3, 2979, 1795, 4),\n" +
            "(2256, 'SEC', 2342, 3000, 2, 2349, 3080, 3),\n" +
            "(2257, 'SEC', 2795, 60, 1, 2687, 6360, 3),\n" +
            "(2258, 'NAICS', 930, 42, 1, 1005, 423910, 5),\n" +
            "(2259, 'SIC', 3041, 2100, 2, 3045, 2121, 4),\n" +
            "(2260, 'SEC', 2791, 20, 1, 2245, 2020, 3),\n" +
            "(2261, 'NAICS', 1536, 524, 2, 1540, 524114, 5),\n" +
            "(2262, 'NAICS', 1402, 51, 1, 1432, 512210, 5),\n" +
            "(2263, 'NAICS', 1871, 6214, 3, 1875, 62142, 4),\n" +
            "(2264, 'NAICS', 1569, 53, 1, 1607, 532292, 5),\n" +
            "(2265, 'NAICS', 2150, 922, 2, 2155, 92212, 4),\n" +
            "(2266, 'SEC', 2403, 3500, 2, 2416, 3555, 4),\n" +
            "(2267, 'SEC', 2568, 5000, 2, 2575, 5045, 4),\n" +
            "(2268, 'SEC', 2796, 70, 1, 2725, 7370, 3),\n" +
            "(2269, 'SIC', 3886, 5900, 2, 3914, 5994, 4),\n" +
            "(2270, 'NAICS', 2, 111, 2, 50, 111940, 5),\n" +
            "(2271, 'NAICS', 1920, 624, 2, 1924, 624120, 5),\n" +
            "(2272, 'SIC', 4308, 20, 1, 3423, 3520, 3),\n" +
            "(2273, 'SIC', 3461, 3570, 3, 3465, 3577, 4),\n" +
            "(2274, 'SIC', 3636, 4400, 2, 3640, 4424, 4),\n" +
            "(2275, 'NAICS', 930, 42, 1, 955, 4234, 3),\n" +
            "(2276, 'NAICS', 1571, 5311, 3, 1579, 53119, 4),\n" +
            "(2277, 'SIC', 3434, 3540, 3, 3439, 3545, 4),\n" +
            "(2278, 'SIC', 4311, 52, 1, 3911, 5990, 3),\n" +
            "(2279, 'SIC', 4058, 7350, 3, 4059, 7352, 4),\n" +
            "(2280, 'NAICS', 117, 115, 2, 131, 11531, 4),\n" +
            "(2281, 'NAICS', 1480, 52, 1, 1497, 52221, 4),\n" +
            "(2282, 'SIC', 4309, 40, 1, 3637, 4410, 3),\n" +
            "(2283, 'NAICS', 182, 2211, 3, 194, 221122, 5),\n" +
            "(2284, 'NAICS', 930, 42, 1, 1066, 4247, 3),\n" +
            "(2285, 'NAICS', 65, 1122, 3, 66, 112210, 5),\n" +
            "(2286, 'NAICS', 1774, 5617, 3, 1781, 561740, 5),\n" +
            "(2287, 'SEC', 2796, 70, 1, 2740, 7812, 4),\n" +
            "(2288, 'SIC', 4306, 10, 1, 2917, 1389, 4),\n" +
            "(2289, 'SIC', 4312, 60, 1, 3951, 6220, 3),\n" +
            "(2290, 'NAICS', 1851, 621, 2, 1883, 621511, 5),\n" +
            "(2291, 'NAICS', 138, 212, 2, 142, 212112, 5),\n" +
            "(2292, 'SIC', 4308, 20, 1, 3047, 2131, 4),\n" +
            "(2293, 'NAICS', 1495, 5222, 3, 1501, 522291, 5),\n" +
            "(2294, 'SIC', 4308, 20, 1, 3291, 3149, 4),\n" +
            "(2295, 'NAICS', 15, 11116, 4, 14, 111160, 5),\n" +
            "(2296, 'NAICS', 1513, 523, 2, 1516, 52311, 4),\n" +
            "(2297, 'NAICS', 56, 112, 2, 82, 112420, 5),\n" +
            "(2298, 'NAICS', 1942, 71, 1, 1972, 71211, 4),\n" +
            "(2299, 'SIC', 3576, 3900, 2, 3589, 3952, 4),\n" +
            "(2300, 'NAICS', 943, 42321, 4, 942, 423210, 5),\n" +
            "(2301, 'SIC', 4178, 8200, 2, 4184, 8230, 3),\n" +
            "(2302, 'SEC', 2796, 70, 1, 2784, 8900, 2),\n" +
            "(2303, 'SIC', 3190, 2700, 2, 3210, 2789, 4),\n" +
            "(2304, 'NAICS', 2135, 92, 1, 2151, 9221, 3),\n" +
            "(2305, 'NAICS', 1593, 53211, 4, 1594, 532111, 5),\n" +
            "(2306, 'NAICS', 1402, 51, 1, 1434, 512220, 5),\n" +
            "(2307, 'NAICS', 110, 11411, 4, 111, 114111, 5),\n" +
            "(2308, 'SIC', 4308, 20, 1, 3599, 3996, 4),\n" +
            "(2309, 'SIC', 3480, 3600, 2, 3487, 3625, 4),\n" +
            "(2310, 'SIC', 4308, 20, 1, 3250, 2895, 4),\n" +
            "(2311, 'SIC', 4313, 70, 1, 4238, 8743, 4),\n" +
            "(2312, 'NAICS', 1562, 5259, 3, 1567, 525990, 5),\n" +
            "(2313, 'NAICS', 1404, 5111, 3, 1411, 511140, 5),\n" +
            "(2314, 'NAICS', 1733, 5613, 3, 1735, 561311, 5),\n" +
            "(2315, 'NAICS', 1850, 62, 1, 1918, 623990, 5),\n" +
            "(2316, 'SIC', 4313, 70, 1, 4088, 7521, 4),\n" +
            "(2317, 'NAICS', 162, 21232, 4, 166, 212325, 5),\n" +
            "(2318, 'SIC', 3200, 2750, 3, 3203, 2759, 4),\n" +
            "(2319, 'NAICS', 1526, 5239, 3, 1529, 523920, 5),\n" +
            "(2320, 'NAICS', 990, 42374, 4, 989, 423740, 5),\n" +
            "(2321, 'SIC', 4308, 20, 1, 3549, 3792, 4),\n" +
            "(2322, 'SIC', 3711, 4960, 3, 3712, 4961, 4),\n" +
            "(2323, 'SIC', 4308, 20, 1, 3464, 3575, 4),\n" +
            "(2324, 'SIC', 3762, 5100, 2, 3785, 5153, 4),\n" +
            "(2325, 'SIC', 4311, 52, 1, 3823, 5410, 3);\n";
    static String industryCodeInsert15 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(2326, 'NAICS', 1624, 54, 1, 1643, 541320, 5),\n" +
            "(2327, 'SEC', 2796, 70, 1, 2736, 7510, 3),\n" +
            "(2328, 'SEC', 2403, 3500, 2, 2420, 3562, 4),\n" +
            "(2329, 'NAICS', 930, 42, 1, 1027, 424310, 5),\n" +
            "(2330, 'NAICS', 1726, 561, 2, 1772, 561621, 5),\n" +
            "(2331, 'NAICS', 205, 23, 1, 275, 23891, 4),\n" +
            "(2332, 'NAICS', 3, 1111, 3, 15, 11116, 4),\n" +
            "(2333, 'SIC', 4017, 7200, 2, 4033, 7250, 3),\n" +
            "(2334, 'NAICS', 1406, 51111, 4, 1405, 511110, 5),\n" +
            "(2335, 'NAICS', 1089, 425, 2, 1090, 4251, 3),\n" +
            "(2336, 'SIC', 4308, 20, 1, 3138, 2441, 4),\n" +
            "(2337, 'SIC', 3214, 2800, 2, 3247, 2891, 4),\n" +
            "(2338, 'NAICS', 260, 2383, 3, 264, 23832, 4),\n" +
            "(2339, 'SIC', 3067, 2260, 3, 3068, 2261, 4),\n" +
            "(2340, 'SIC', 4186, 8240, 3, 4188, 8244, 4),\n" +
            "(2341, 'NAICS', 2135, 92, 1, 2189, 9261, 3),\n" +
            "(2342, 'NAICS', 2004, 721, 2, 2017, 7213, 3),\n" +
            "(2343, 'NAICS', 1812, 61, 1, 1836, 6116, 3),\n" +
            "(2344, 'NAICS', 1480, 52, 1, 1562, 5259, 3),\n" +
            "(2345, 'SIC', 2912, 1320, 3, 2913, 1321, 4),\n" +
            "(2346, 'NAICS', 1550, 52429, 4, 1551, 524291, 5),\n" +
            "(2347, 'SIC', 3419, 3500, 2, 3472, 3586, 4),\n" +
            "(2348, 'SIC', 3680, 4800, 2, 3684, 4820, 3),\n" +
            "(2349, 'NAICS', 930, 42, 1, 962, 423440, 5),\n" +
            "(2350, 'NAICS', 931, 423, 2, 943, 42321, 4),\n" +
            "(2351, 'NAICS', 1402, 51, 1, 1421, 512110, 5),\n" +
            "(2352, 'NAICS', 1812, 61, 1, 1835, 611519, 5),\n" +
            "(2353, 'SIC', 4313, 70, 1, 4197, 8350, 3),\n" +
            "(2354, 'NAICS', 930, 42, 1, 953, 423390, 5),\n" +
            "(2355, 'SIC', 4308, 20, 1, 3210, 2789, 4),\n" +
            "(2356, 'SIC', 4308, 20, 1, 3520, 3690, 3),\n" +
            "(2357, 'NAICS', 1979, 713, 2, 1982, 71311, 4),\n" +
            "(2358, 'SEC', 2579, 5060, 3, 2581, 5064, 4),\n" +
            "(2359, 'SIC', 4314, 90, 1, 4258, 9211, 4),\n" +
            "(2360, 'NAICS', 1480, 52, 1, 1535, 523999, 5),\n" +
            "(2361, 'NAICS', 1753, 56145, 4, 1752, 561450, 5),\n" +
            "(2362, 'NAICS', 1725, 56, 1, 1758, 5615, 3),\n" +
            "(2363, 'NAICS', 2003, 72, 1, 2032, 72251, 4),\n" +
            "(2364, 'NAICS', 1402, 51, 1, 1442, 515, 2),\n" +
            "(2365, 'NAICS', 2201, 9271, 3, 2203, 92711, 4),\n" +
            "(2366, 'NAICS', 931, 423, 2, 982, 4237, 3),\n" +
            "(2367, 'NAICS', 1624, 54, 1, 1675, 541612, 5),\n" +
            "(2368, 'SEC', 2703, 6700, 2, 2704, 6790, 3),\n" +
            "(2369, 'SIC', 4308, 20, 1, 3324, 3272, 4),\n" +
            "(2370, 'SIC', 4313, 70, 1, 4223, 8700, 2),\n" +
            "(2371, 'NAICS', 2037, 81, 1, 2110, 813212, 5),\n" +
            "(2372, 'SIC', 3371, 3400, 2, 3376, 3421, 4),\n" +
            "(2373, 'SIC', 4308, 20, 1, 3164, 2590, 3),\n" +
            "(2374, 'NAICS', 930, 42, 1, 1068, 42471, 4),\n" +
            "(2375, 'SIC', 3693, 4900, 2, 3695, 4911, 4),\n" +
            "(2376, 'SIC', 3261, 3000, 2, 3263, 3011, 4),\n" +
            "(2377, 'NAICS', 2135, 92, 1, 2198, 926150, 5),\n" +
            "(2378, 'NAICS', 119, 11511, 4, 121, 115112, 5),\n" +
            "(2379, 'NAICS', 1813, 611, 2, 1844, 611691, 5),\n" +
            "(2380, 'SEC', 2391, 3440, 3, 2393, 3443, 4),\n" +
            "(2381, 'NAICS', 1726, 561, 2, 1748, 561431, 5),\n" +
            "(2382, 'NAICS', 240, 23812, 4, 239, 238120, 5),\n" +
            "(2383, 'NAICS', 1979, 713, 2, 1986, 713210, 5),\n" +
            "(2384, 'NAICS', 1625, 541, 2, 1704, 541890, 5),\n" +
            "(2385, 'SEC', 2240, 2000, 2, 2249, 2040, 3),\n" +
            "(2386, 'NAICS', 1871, 6214, 3, 1879, 621493, 5),\n" +
            "(2387, 'SEC', 2795, 60, 1, 4323, 6189, 4),\n" +
            "(2388, 'NAICS', 1851, 621, 2, 1891, 62199, 4),\n" +
            "(2389, 'SIC', 2962, 1740, 3, 2965, 1743, 4),\n" +
            "(2390, 'SIC', 3301, 3200, 2, 3315, 3259, 4),\n" +
            "(2391, 'SIC', 4308, 20, 1, 3412, 3493, 4),\n" +
            "(2392, 'SIC', 4313, 70, 1, 4203, 8400, 2),\n" +
            "(2393, 'SEC', 2434, 3600, 2, 2455, 3679, 4),\n" +
            "(2394, 'SIC', 4309, 40, 1, 3669, 4724, 4),\n" +
            "(2395, 'SIC', 3149, 2510, 3, 3154, 2517, 4),\n" +
            "(2396, 'NAICS', 1850, 62, 1, 1928, 6242, 3),\n" +
            "(2397, 'SIC', 4313, 70, 1, 4052, 7335, 4),\n" +
            "(2398, 'SIC', 3337, 3300, 2, 3341, 3315, 4),\n" +
            "(2399, 'SIC', 4309, 40, 1, 3686, 4830, 3),\n" +
            "(2400, 'NAICS', 2061, 8114, 3, 2062, 81141, 4),\n" +
            "(2401, 'SIC', 3409, 3490, 3, 3410, 3491, 4),\n" +
            "(2402, 'NAICS', 180, 22, 1, 204, 22133, 4),\n" +
            "(2403, 'SEC', 2305, 2720, 3, 2306, 2721, 4),\n" +
            "(2404, 'SEC', 2791, 20, 1, 2267, 2250, 3),\n" +
            "(2405, 'SEC', 2791, 20, 1, 2468, 3728, 4),\n" +
            "(2406, 'SIC', 3769, 5130, 3, 3772, 5137, 4),\n" +
            "(2407, 'SEC', 2703, 6700, 2, 2705, 6792, 4),\n" +
            "(2408, 'SIC', 4308, 20, 1, 3222, 2822, 4),\n" +
            "(2409, 'NAICS', 1876, 62149, 4, 1877, 621491, 5),\n" +
            "(2410, 'SIC', 3220, 2820, 3, 3222, 2822, 4),\n" +
            "(2411, 'SIC', 3272, 3080, 3, 3275, 3083, 4),\n" +
            "(2412, 'NAICS', 56, 112, 2, 91, 11291, 4),\n" +
            "(2413, 'SIC', 3870, 5710, 3, 3874, 5719, 4),\n" +
            "(2414, 'NAICS', 946, 4233, 3, 947, 423310, 5),\n" +
            "(2415, 'SIC', 3822, 5400, 2, 3836, 5499, 4),\n" +
            "(2416, 'NAICS', 1419, 512, 2, 1425, 51213, 4),\n" +
            "(2417, 'NAICS', 1830, 6115, 3, 1835, 611519, 5),\n" +
            "(2418, 'NAICS', 1794, 56211, 4, 1795, 562111, 5),\n" +
            "(2419, 'SIC', 3740, 5060, 3, 3742, 5064, 4),\n" +
            "(2420, 'NAICS', 2038, 811, 2, 2053, 81121, 4),\n" +
            "(2421, 'SEC', 2650, 6020, 3, 2651, 6021, 4),\n" +
            "(2422, 'SIC', 4308, 20, 1, 3424, 3523, 4),\n" +
            "(2423, 'NAICS', 180, 22, 1, 195, 2212, 3),\n" +
            "(2424, 'NAICS', 1624, 54, 1, 1685, 541711, 5),\n" +
            "(2425, 'NAICS', 114, 1142, 3, 116, 11421, 4),\n" +
            "(2426, 'NAICS', 1936, 6243, 3, 1938, 62431, 4),\n" +
            "(2427, 'SIC', 3148, 2500, 2, 3150, 2511, 4),\n" +
            "(2428, 'SIC', 4049, 7330, 3, 4051, 7334, 4),\n" +
            "(2429, 'SIC', 4313, 70, 1, 4121, 7832, 4),\n" +
            "(2430, 'NAICS', 1402, 51, 1, 1436, 512230, 5),\n" +
            "(2431, 'SIC', 4308, 20, 1, 3559, 3824, 4),\n" +
            "(2432, 'SEC', 2791, 20, 1, 2455, 3679, 4),\n" +
            "(2433, 'NAICS', 1480, 52, 1, 1504, 522294, 5),\n" +
            "(2434, 'SIC', 3041, 2100, 2, 3048, 2140, 3),\n" +
            "(2435, 'NAICS', 1812, 61, 1, 1848, 611710, 5),\n" +
            "(2436, 'SEC', 2505, 3940, 3, 2508, 3949, 4),\n" +
            "(2437, 'SEC', 2385, 3410, 3, 2386, 3411, 4),\n" +
            "(2438, 'SIC', 4313, 70, 1, 4045, 7319, 4),\n" +
            "(2439, 'SEC', 4336, 99, 1, 4337, 8880, 2),\n" +
            "(2440, 'SIC', 3375, 3420, 3, 3379, 3429, 4),\n" +
            "(2441, 'SIC', 4314, 90, 1, 4292, 9641, 4),\n" +
            "(2442, 'NAICS', 1774, 5617, 3, 1779, 561730, 5),\n" +
            "(2443, 'SEC', 2591, 5100, 2, 2599, 5160, 3),\n" +
            "(2444, 'SIC', 4284, 9600, 2, 4294, 9651, 4),\n" +
            "(2445, 'NAICS', 1792, 562, 2, 1793, 5621, 3),\n" +
            "(2446, 'SEC', 2792, 40, 1, 2514, 4011, 4),\n" +
            "(2447, 'SIC', 4100, 7600, 2, 4105, 7630, 3),\n" +
            "(2448, 'SEC', 2271, 2300, 2, 2275, 2390, 3),\n" +
            "(2449, 'SIC', 2918, 1400, 2, 2925, 1440, 3),\n" +
            "(2450, 'SIC', 4308, 20, 1, 3038, 2097, 4),\n" +
            "(2451, 'SIC', 4223, 8700, 2, 4230, 8730, 3),\n" +
            "(2452, 'NAICS', 955, 4234, 3, 958, 423420, 5),\n" +
            "(2453, 'SEC', 2794, 52, 1, 2636, 5735, 4),\n" +
            "(2454, 'SEC', 2791, 20, 1, 2420, 3562, 4),\n" +
            "(2455, 'SIC', 4308, 20, 1, 3136, 2439, 4),\n" +
            "(2456, 'SIC', 2918, 1400, 2, 2936, 1481, 4),\n" +
            "(2457, 'NAICS', 1741, 5614, 3, 1756, 561492, 5),\n" +
            "(2458, 'SIC', 4146, 8000, 2, 4153, 8040, 3),\n" +
            "(2459, 'NAICS', 1913, 6233, 3, 1916, 623312, 5),\n" +
            "(2460, 'SIC', 2982, 2000, 2, 3010, 2052, 4),\n" +
            "(2461, 'NAICS', 1853, 62111, 4, 1855, 621112, 5),\n" +
            "(2462, 'NAICS', 1730, 5612, 3, 1731, 561210, 5),\n" +
            "(2463, 'SIC', 4308, 20, 1, 3009, 2051, 4),\n" +
            "(2464, 'SIC', 3887, 5910, 3, 3888, 5912, 4),\n" +
            "(2465, 'NAICS', 1850, 62, 1, 1921, 6241, 3),\n" +
            "(2466, 'NAICS', 2037, 81, 1, 2051, 811198, 5),\n" +
            "(2467, 'SEC', 2257, 2090, 3, 2258, 2092, 4),\n" +
            "(2468, 'NAICS', 1471, 5191, 3, 1476, 519130, 5),\n" +
            "(2469, 'SEC', 2796, 70, 1, 2728, 7373, 4),\n" +
            "(2470, 'SIC', 2871, 830, 3, 2872, 831, 4),\n" +
            "(2471, 'SEC', 2450, 3670, 3, 2454, 3678, 4),\n" +
            "(2472, 'SIC', 3977, 6500, 2, 3986, 6531, 4),\n" +
            "(2473, 'NAICS', 2037, 81, 1, 2062, 81141, 4),\n" +
            "(2474, 'SIC', 4010, 7020, 3, 4011, 7021, 4),\n" +
            "(2475, 'NAICS', 2005, 7211, 3, 2007, 72111, 4),\n" +
            "(2476, 'NAICS', 2, 111, 2, 28, 11133, 4),\n" +
            "(2477, 'NAICS', 1433, 51221, 4, 1432, 512210, 5),\n" +
            "(2478, 'NAICS', 1612, 5324, 3, 1618, 532490, 5),\n" +
            "(2479, 'SIC', 4178, 8200, 2, 4180, 8211, 4),\n" +
            "(2480, 'NAICS', 49, 11193, 4, 48, 111930, 5),\n" +
            "(2481, 'SIC', 3419, 3500, 2, 3422, 3519, 4),\n" +
            "(2482, 'NAICS', 2037, 81, 1, 2057, 811219, 5),\n" +
            "(2483, 'NAICS', 1689, 5418, 3, 1704, 541890, 5),\n" +
            "(2484, 'NAICS', 180, 22, 1, 197, 22121, 4),\n" +
            "(2485, 'SEC', 2774, 8700, 2, 2782, 8742, 4),\n" +
            "(2486, 'SIC', 2873, 850, 3, 2874, 851, 4),\n" +
            "(2487, 'SIC', 2884, 1000, 2, 2885, 1010, 3),\n" +
            "(2488, 'SEC', 2241, 2010, 3, 2244, 2015, 4),\n" +
            "(2489, 'SEC', 2667, 6160, 3, 2669, 6163, 4),\n" +
            "(2490, 'SIC', 2825, 200, 2, 2839, 259, 4),\n" +
            "(2491, 'SIC', 4308, 20, 1, 3557, 3822, 4),\n" +
            "(2492, 'NAICS', 1725, 56, 1, 1782, 56174, 4),\n" +
            "(2493, 'SIC', 4308, 20, 1, 3329, 3281, 4),\n" +
            "(2494, 'SIC', 3371, 3400, 2, 3418, 3499, 4),\n" +
            "(2495, 'SIC', 3261, 3000, 2, 3268, 3053, 4),\n" +
            "(2496, 'SIC', 4199, 8360, 3, 4200, 8361, 4),\n" +
            "(2497, 'NAICS', 1480, 52, 1, 1547, 5242, 3),\n" +
            "(2498, 'NAICS', 2096, 81292, 4, 2097, 812921, 5),\n" +
            "(2499, 'SIC', 3762, 5100, 2, 3799, 5192, 4),\n" +
            "(2500, 'NAICS', 1452, 517, 2, 1454, 517110, 5),\n" +
            "(2501, 'SEC', 2659, 6100, 2, 4340, 6172, 4),\n" +
            "(2502, 'SIC', 2939, 1500, 2, 2940, 1520, 3),\n" +
            "(2503, 'SEC', 2443, 3650, 3, 2445, 3652, 4),\n" +
            "(2504, 'SIC', 3636, 4400, 2, 3638, 4412, 4),\n" +
            "(2505, 'SIC', 4308, 20, 1, 3050, 2200, 2),\n" +
            "(2506, 'SIC', 3148, 2500, 2, 3165, 2591, 4),\n" +
            "(2507, 'SIC', 3237, 2860, 3, 3239, 2865, 4),\n" +
            "(2508, 'NAICS', 1015, 424, 2, 1084, 42494, 4),\n" +
            "(2509, 'NAICS', 2205, 9281, 3, 2206, 928110, 5),\n" +
            "(2510, 'SIC', 2909, 1300, 2, 2915, 1381, 4),\n" +
            "(2511, 'NAICS', 1402, 51, 1, 1464, 517911, 5),\n" +
            "(2512, 'NAICS', 1725, 56, 1, 1754, 56149, 4),\n" +
            "(2513, 'NAICS', 2037, 81, 1, 2052, 8112, 3),\n" +
            "(2514, 'SIC', 3520, 3690, 3, 3523, 3694, 4),\n" +
            "(2515, 'NAICS', 43, 1119, 3, 47, 11192, 4),\n" +
            "(2516, 'NAICS', 1726, 561, 2, 1727, 5611, 3),\n" +
            "(2517, 'SIC', 4278, 9510, 3, 4280, 9512, 4),\n" +
            "(2518, 'SIC', 4311, 52, 1, 3808, 5231, 4),\n" +
            "(2519, 'NAICS', 1850, 62, 1, 1857, 621210, 5),\n" +
            "(2520, 'SEC', 2262, 2200, 2, 2266, 2221, 4),\n" +
            "(2521, 'SIC', 2840, 270, 3, 2844, 279, 4),\n" +
            "(2522, 'SIC', 3272, 3080, 3, 3280, 3088, 4),\n" +
            "(2523, 'NAICS', 1591, 532, 2, 1611, 53231, 4),\n" +
            "(2524, 'SIC', 4313, 70, 1, 4144, 7997, 4),\n" +
            "(2525, 'SEC', 2300, 2670, 3, 2301, 2673, 4),\n" +
            "(2526, 'SIC', 4308, 20, 1, 3437, 3543, 4),\n" +
            "(2527, 'SEC', 2335, 2890, 3, 2336, 2891, 4),\n" +
            "(2528, 'SIC', 4311, 52, 1, 3903, 5960, 3),\n" +
            "(2529, 'SIC', 4310, 50, 1, 3754, 5087, 4),\n" +
            "(2530, 'SIC', 4305, 1, 1, 2864, 780, 3),\n" +
            "(2531, 'SIC', 4305, 1, 1, 2847, 700, 2),\n" +
            "(2532, 'SIC', 4308, 20, 1, 3144, 2490, 3),\n" +
            "(2533, 'NAICS', 235, 238, 2, 245, 238150, 5),\n" +
            "(2534, 'NAICS', 2, 111, 2, 4, 111110, 5),\n" +
            "(2535, 'NAICS', 232, 2379, 3, 233, 237990, 5),\n" +
            "(2536, 'SIC', 4265, 9300, 2, 4266, 9310, 3),\n" +
            "(2537, 'NAICS', 1733, 5613, 3, 1739, 561330, 5),\n" +
            "(2538, 'SIC', 4278, 9510, 3, 4279, 9511, 4),\n" +
            "(2539, 'NAICS', 1726, 561, 2, 1732, 56121, 4),\n" +
            "(2540, 'NAICS', 2037, 81, 1, 2128, 81394, 4),\n" +
            "(2541, 'SIC', 4308, 20, 1, 3372, 3410, 3),\n" +
            "(2542, 'SIC', 3371, 3400, 2, 3388, 3444, 4),\n" +
            "(2543, 'SEC', 2630, 5700, 2, 2635, 5734, 4),\n" +
            "(2544, 'NAICS', 1718, 55, 1, 1723, 551112, 5),\n" +
            "(2545, 'SIC', 3576, 3900, 2, 3586, 3949, 4),\n" +
            "(2546, 'SIC', 4308, 20, 1, 3225, 2830, 3),\n" +
            "(2547, 'SEC', 2593, 5120, 3, 2594, 5122, 4),\n" +
            "(2548, 'SIC', 4308, 20, 1, 3456, 3565, 4),\n" +
            "(2549, 'SIC', 3893, 5940, 3, 3902, 5949, 4),\n" +
            "(2550, 'NAICS', 1016, 4241, 3, 1022, 42413, 4),\n" +
            "(2551, 'SEC', 2479, 3820, 3, 2484, 3825, 4),\n" +
            "(2552, 'SEC', 2794, 52, 1, 2637, 5800, 2),\n" +
            "(2553, 'SIC', 4125, 7900, 2, 4130, 7929, 4),\n" +
            "(2554, 'NAICS', 1480, 52, 1, 1511, 522390, 5),\n" +
            "(2555, 'NAICS', 1851, 621, 2, 1859, 6213, 3),\n" +
            "(2556, 'SIC', 2898, 1090, 3, 2899, 1094, 4),\n" +
            "(2557, 'SIC', 3526, 3700, 2, 3533, 3720, 3),\n" +
            "(2558, 'NAICS', 91, 11291, 4, 90, 112910, 5),\n" +
            "(2559, 'NAICS', 1471, 5191, 3, 1475, 51912, 4),\n" +
            "(2560, 'NAICS', 2004, 721, 2, 2007, 72111, 4),\n" +
            "(2561, 'SEC', 2569, 5010, 3, 2570, 5013, 4),\n" +
            "(2562, 'NAICS', 266, 23833, 4, 265, 238330, 5),\n" +
            "(2563, 'NAICS', 1904, 623, 2, 1912, 62322, 4),\n" +
            "(2564, 'SIC', 4308, 20, 1, 3316, 3260, 3),\n" +
            "(2565, 'NAICS', 2137, 9211, 3, 2140, 921120, 5),\n" +
            "(2566, 'SEC', 2476, 3800, 2, 2489, 3841, 4),\n" +
            "(2567, 'SIC', 3583, 3940, 3, 3585, 3944, 4),\n" +
            "(2568, 'SIC', 3667, 4700, 2, 3676, 4780, 3),\n" +
            "(2569, 'SIC', 3086, 2320, 3, 3091, 2326, 4),\n" +
            "(2570, 'SIC', 4271, 9430, 3, 4272, 9431, 4),\n" +
            "(2571, 'SIC', 2982, 2000, 2, 3021, 2074, 4),\n" +
            "(2572, 'NAICS', 2135, 92, 1, 2142, 921130, 5),\n" +
            "(2573, 'SIC', 4308, 20, 1, 3008, 2050, 3),\n" +
            "(2574, 'SIC', 3255, 2950, 3, 3257, 2952, 4),\n" +
            "(2575, 'SIC', 3886, 5900, 2, 3899, 5946, 4),\n" +
            "(2576, 'NAICS', 89, 1129, 3, 91, 11291, 4),\n" +
            "(2577, 'SEC', 2791, 20, 1, 2427, 3575, 4),\n" +
            "(2578, 'NAICS', 1015, 424, 2, 1028, 42431, 4),\n" +
            "(2579, 'SIC', 3854, 5600, 2, 3859, 5630, 3),\n" +
            "(2580, 'NAICS', 1706, 5419, 3, 1707, 541910, 5),\n" +
            "(2581, 'SIC', 4284, 9600, 2, 4285, 9610, 3),\n" +
            "(2582, 'SIC', 4308, 20, 1, 3185, 2675, 4),\n" +
            "(2583, 'NAICS', 1850, 62, 1, 1909, 623210, 5),\n" +
            "(2584, 'SIC', 4308, 20, 1, 3228, 2835, 4),\n" +
            "(2585, 'NAICS', 930, 42, 1, 986, 42372, 4),\n" +
            "(2586, 'NAICS', 1015, 424, 2, 1040, 424430, 5),\n" +
            "(2587, 'SIC', 4308, 20, 1, 3219, 2819, 4),\n" +
            "(2588, 'NAICS', 1513, 523, 2, 1519, 523130, 5),\n" +
            "(2589, 'SIC', 2931, 1470, 3, 2934, 1479, 4),\n" +
            "(2590, 'SEC', 2568, 5000, 2, 2586, 5082, 4),\n" +
            "(2591, 'NAICS', 1852, 6211, 3, 1853, 62111, 4),\n" +
            "(2592, 'SIC', 2918, 1400, 2, 2928, 1450, 3),\n" +
            "(2593, 'SEC', 2319, 2800, 2, 2328, 2840, 3),\n" +
            "(2594, 'SIC', 4313, 70, 1, 4135, 7948, 4),\n" +
            "(2595, 'SIC', 4305, 1, 1, 2858, 750, 3),\n" +
            "(2596, 'SIC', 4310, 50, 1, 3789, 5162, 4),\n" +
            "(2597, 'SIC', 4308, 20, 1, 3505, 3651, 4),\n" +
            "(2598, 'NAICS', 1016, 4241, 3, 1018, 42411, 4),\n" +
            "(2599, 'NAICS', 1871, 6214, 3, 1876, 62149, 4),\n" +
            "(2600, 'SIC', 2982, 2000, 2, 3032, 2087, 4),\n" +
            "(2601, 'SIC', 3838, 5510, 3, 3839, 5511, 4),\n" +
            "(2602, 'NAICS', 1813, 611, 2, 1827, 61142, 4),\n" +
            "(2603, 'SIC', 3167, 2600, 2, 3186, 2676, 4),\n" +
            "(2604, 'SEC', 2791, 20, 1, 2437, 3613, 4),\n" +
            "(2605, 'NAICS', 205, 23, 1, 259, 23829, 4),\n" +
            "(2606, 'SIC', 4306, 10, 1, 2890, 1031, 4),\n" +
            "(2607, 'SIC', 4040, 7300, 2, 4072, 7377, 4),\n" +
            "(2608, 'NAICS', 1758, 5615, 3, 1760, 56151, 4),\n" +
            "(2609, 'SEC', 2792, 40, 1, 2563, 4941, 4),\n" +
            "(2610, 'SEC', 2643, 5940, 3, 2644, 5944, 4),\n" +
            "(2611, 'NAICS', 1726, 561, 2, 1735, 561311, 5),\n" +
            "(2612, 'NAICS', 930, 42, 1, 1044, 424450, 5),\n" +
            "(2613, 'NAICS', 1456, 5172, 3, 1457, 517210, 5),\n" +
            "(2614, 'SIC', 3282, 3100, 2, 3298, 3172, 4),\n" +
            "(2615, 'SIC', 3272, 3080, 3, 3278, 3086, 4),\n" +
            "(2616, 'SIC', 3241, 2870, 3, 3244, 2875, 4),\n" +
            "(2617, 'SIC', 4065, 7370, 3, 4066, 7371, 4),\n" +
            "(2618, 'SEC', 2793, 50, 1, 2576, 5047, 4),\n" +
            "(2619, 'SIC', 4314, 90, 1, 4256, 9200, 2),\n" +
            "(2620, 'SIC', 3419, 3500, 2, 3428, 3532, 4),\n" +
            "(2621, 'NAICS', 1970, 7121, 3, 1978, 71219, 4),\n" +
            "(2622, 'NAICS', 181, 221, 2, 184, 221111, 5),\n" +
            "(2623, 'NAICS', 1480, 52, 1, 1526, 5239, 3),\n" +
            "(2624, 'SIC', 4027, 7220, 3, 4028, 7221, 4),\n" +
            "(2625, 'SEC', 2476, 3800, 2, 2483, 3824, 4),\n" +
            "(2626, 'SIC', 4312, 60, 1, 3972, 6390, 3),\n" +
            "(2627, 'SIC', 3663, 4610, 3, 3666, 4619, 4),\n" +
            "(2628, 'SIC', 4139, 7990, 3, 4144, 7997, 4),\n" +
            "(2629, 'SIC', 4146, 8000, 2, 4158, 8050, 3),\n" +
            "(2630, 'NAICS', 1812, 61, 1, 1830, 6115, 3),\n" +
            "(2631, 'NAICS', 2135, 92, 1, 2166, 923, 2),\n" +
            "(2632, 'SEC', 2791, 20, 1, 2337, 2900, 2),\n" +
            "(2633, 'SIC', 4277, 9500, 2, 4282, 9531, 4),\n" +
            "(2634, 'SIC', 4146, 8000, 2, 4160, 8052, 4),\n" +
            "(2635, 'SEC', 2283, 2500, 2, 2290, 2540, 3),\n" +
            "(2636, 'NAICS', 56, 112, 2, 78, 11239, 4),\n" +
            "(2637, 'NAICS', 114, 1142, 3, 115, 114210, 5),\n" +
            "(2638, 'NAICS', 1725, 56, 1, 1736, 561312, 5),\n" +
            "(2639, 'SIC', 3942, 6150, 3, 3943, 6153, 4),\n" +
            "(2640, 'NAICS', 2188, 926, 2, 2191, 92611, 4),\n" +
            "(2641, 'NAICS', 1851, 621, 2, 1870, 621399, 5),\n" +
            "(2642, 'SIC', 4307, 15, 1, 2972, 1771, 4),\n" +
            "(2643, 'SIC', 3693, 4900, 2, 3709, 4953, 4),\n" +
            "(2644, 'SEC', 2229, 1500, 2, 2232, 1531, 4),\n" +
            "(2645, 'SIC', 4308, 20, 1, 3004, 2045, 4),\n" +
            "(2646, 'SIC', 4308, 20, 1, 3014, 2062, 4),\n" +
            "(2647, 'NAICS', 218, 237, 2, 233, 237990, 5),\n" +
            "(2648, 'SEC', 2796, 70, 1, 2735, 7500, 2),\n" +
            "(2649, 'NAICS', 1812, 61, 1, 1826, 611420, 5),\n" +
            "(2650, 'NAICS', 2037, 81, 1, 2099, 812930, 5),\n" +
            "(2651, 'SIC', 4308, 20, 1, 3024, 2077, 4),\n" +
            "(2652, 'SEC', 2263, 2210, 3, 2264, 2211, 4),\n" +
            "(2653, 'SEC', 2434, 3600, 2, 2447, 3661, 4),\n" +
            "(2654, 'SIC', 4308, 20, 1, 3293, 3151, 4),\n" +
            "(2655, 'SIC', 3419, 3500, 2, 3447, 3554, 4),\n" +
            "(2656, 'SIC', 3301, 3200, 2, 3331, 3291, 4),\n" +
            "(2657, 'SIC', 4312, 60, 1, 4005, 6798, 4),\n" +
            "(2658, 'NAICS', 1851, 621, 2, 1868, 62139, 4),\n" +
            "(2659, 'NAICS', 1850, 62, 1, 1907, 62311, 4),\n" +
            "(2660, 'SIC', 3086, 2320, 3, 3089, 2323, 4),\n" +
            "(2661, 'NAICS', 2020, 722, 2, 2027, 72233, 4),\n" +
            "(2662, 'NAICS', 1004, 4239, 3, 1009, 423930, 5),\n" +
            "(2663, 'NAICS', 126, 1152, 3, 128, 11521, 4),\n" +
            "(2664, 'SIC', 4308, 20, 1, 3075, 2282, 4),\n" +
            "(2665, 'SIC', 3564, 3840, 3, 3569, 3845, 4),\n" +
            "(2666, 'SEC', 2791, 20, 1, 2414, 3541, 4),\n" +
            "(2667, 'NAICS', 1850, 62, 1, 1886, 621610, 5),\n" +
            "(2668, 'NAICS', 2135, 92, 1, 2205, 9281, 3),\n" +
            "(2669, 'SEC', 2791, 20, 1, 2334, 2870, 3),\n" +
            "(2670, 'NAICS', 2037, 81, 1, 2039, 8111, 3),\n" +
            "(2671, 'NAICS', 1920, 624, 2, 1927, 62419, 4),\n" +
            "(2672, 'SEC', 2704, 6790, 3, 2705, 6792, 4),\n" +
            "(2673, 'SEC', 2633, 5730, 3, 2636, 5735, 4),\n" +
            "(2674, 'NAICS', 1850, 62, 1, 1908, 6232, 3),\n" +
            "(2675, 'NAICS', 1598, 5322, 3, 1607, 532292, 5),\n" +
            "(2676, 'SIC', 4311, 52, 1, 3859, 5630, 3),\n" +
            "(2677, 'SEC', 2795, 60, 1, 2703, 6700, 2),\n" +
            "(2678, 'SIC', 2847, 700, 2, 2856, 741, 4),\n" +
            "(2679, 'NAICS', 1725, 56, 1, 1742, 561410, 5),\n" +
            "(2680, 'SEC', 2621, 5530, 3, 2622, 5531, 4),\n" +
            "(2681, 'NAICS', 1570, 531, 2, 1590, 53139, 4),\n" +
            "(2682, 'SIC', 4310, 50, 1, 3798, 5191, 4),\n" +
            "(2683, 'SIC', 4310, 50, 1, 3787, 5159, 4),\n" +
            "(2684, 'SIC', 3762, 5100, 2, 3763, 5110, 3),\n" +
            "(2685, 'NAICS', 207, 2361, 3, 211, 236117, 5),\n" +
            "(2686, 'SEC', 2791, 20, 1, 2447, 3661, 4),\n" +
            "(2687, 'SIC', 4308, 20, 1, 3407, 3484, 4),\n" +
            "(2688, 'SIC', 4314, 90, 1, 4295, 9660, 3),\n" +
            "(2689, 'NAICS', 1939, 6244, 3, 1940, 624410, 5),\n" +
            "(2690, 'SIC', 3797, 5190, 3, 3801, 5194, 4),\n" +
            "(2691, 'SEC', 2795, 60, 1, 2693, 6411, 4),\n" +
            "(2692, 'NAICS', 1550, 52429, 4, 1553, 524298, 5),\n" +
            "(2693, 'SIC', 4308, 20, 1, 3172, 2630, 3),\n" +
            "(2694, 'NAICS', 1814, 6111, 3, 1816, 61111, 4),\n" +
            "(2695, 'NAICS', 1726, 561, 2, 1739, 561330, 5),\n" +
            "(2696, 'SIC', 3937, 6100, 2, 3942, 6150, 3),\n" +
            "(2697, 'NAICS', 1625, 541, 2, 1676, 541613, 5),\n" +
            "(2698, 'SIC', 4305, 1, 1, 2863, 762, 4),\n" +
            "(2699, 'NAICS', 931, 423, 2, 936, 42312, 4),\n" +
            "(2700, 'NAICS', 1402, 51, 1, 1474, 519120, 5),\n" +
            "(2701, 'NAICS', 1569, 53, 1, 1605, 53229, 4),\n" +
            "(2702, 'SIC', 4224, 8710, 3, 4226, 8712, 4),\n" +
            "(2703, 'NAICS', 132, 21, 1, 165, 212324, 5),\n" +
            "(2704, 'NAICS', 144, 2122, 3, 152, 212234, 5),\n" +
            "(2705, 'NAICS', 1513, 523, 2, 1530, 52392, 4),\n" +
            "(2706, 'SEC', 2517, 4200, 2, 2519, 4213, 4),\n" +
            "(2707, 'SIC', 4313, 70, 1, 4099, 7549, 4),\n" +
            "(2708, 'SIC', 4230, 8730, 3, 4233, 8733, 4),\n" +
            "(2709, 'NAICS', 1684, 54171, 4, 1685, 541711, 5),\n" +
            "(2710, 'SIC', 3384, 3440, 3, 3389, 3446, 4),\n" +
            "(2711, 'NAICS', 1812, 61, 1, 1821, 611310, 5),\n" +
            "(2712, 'NAICS', 1442, 515, 2, 1451, 51521, 4),\n" +
            "(2713, 'SIC', 4151, 8030, 3, 4152, 8031, 4),\n" +
            "(2714, 'NAICS', 1, 11, 1, 48, 111930, 5),\n" +
            "(2715, 'SEC', 2790, 15, 1, 2238, 1730, 3),\n" +
            "(2716, 'SEC', 2695, 6510, 3, 2697, 6513, 4),\n" +
            "(2717, 'SIC', 3744, 5070, 3, 3748, 5078, 4),\n" +
            "(2718, 'NAICS', 3, 1111, 3, 12, 111150, 5),\n" +
            "(2719, 'NAICS', 1035, 4244, 3, 1039, 42442, 4),\n" +
            "(2720, 'NAICS', 2085, 8123, 3, 2087, 81231, 4),\n" +
            "(2721, 'SEC', 2568, 5000, 2, 2582, 5065, 4),\n" +
            "(2722, 'SIC', 3480, 3600, 2, 3501, 3646, 4),\n" +
            "(2723, 'NAICS', 1680, 54162, 4, 1679, 541620, 5),\n" +
            "(2724, 'SEC', 2770, 8300, 2, 2772, 8351, 4),\n" +
            "(2725, 'SIC', 3526, 3700, 2, 3541, 3743, 4),\n" +
            "(2726, 'SIC', 4313, 70, 1, 4068, 7373, 4),\n" +
            "(2727, 'NAICS', 1950, 71113, 4, 1949, 711130, 5),\n" +
            "(2728, 'SIC', 4307, 15, 1, 2949, 1610, 3),\n" +
            "(2729, 'NAICS', 264, 23832, 4, 263, 238320, 5),\n" +
            "(2730, 'NAICS', 1804, 5629, 3, 1807, 562920, 5),\n" +
            "(2731, 'NAICS', 1813, 611, 2, 1849, 61171, 4),\n" +
            "(2732, 'SIC', 3701, 4930, 3, 3702, 4931, 4),\n" +
            "(2733, 'NAICS', 1785, 5619, 3, 1789, 56192, 4),\n" +
            "(2734, 'SIC', 3592, 3960, 3, 3594, 3965, 4),\n" +
            "(2735, 'SEC', 2434, 3600, 2, 2437, 3613, 4),\n" +
            "(2736, 'SIC', 3996, 6720, 3, 3998, 6726, 4),\n" +
            "(2737, 'NAICS', 1673, 54161, 4, 1677, 541614, 5),\n" +
            "(2738, 'SEC', 2403, 3500, 2, 2427, 3575, 4),\n" +
            "(2739, 'SIC', 4305, 1, 1, 2859, 751, 4),\n" +
            "(2740, 'SIC', 4313, 70, 1, 4167, 8071, 4),\n" +
            "(2741, 'NAICS', 1850, 62, 1, 1925, 62412, 4),\n" +
            "(2742, 'SIC', 4312, 60, 1, 3982, 6515, 4),\n" +
            "(2743, 'SIC', 3371, 3400, 2, 3403, 3479, 4),\n" +
            "(2744, 'SIC', 4287, 9620, 3, 4288, 9621, 4),\n" +
            "(2745, 'SIC', 4307, 15, 1, 2980, 1796, 4),\n" +
            "(2746, 'SIC', 3837, 5500, 2, 3844, 5540, 3),\n" +
            "(2747, 'NAICS', 138, 212, 2, 149, 212222, 5),\n" +
            "(2748, 'SIC', 4312, 60, 1, 3932, 6081, 4),\n" +
            "(2749, 'SEC', 2795, 60, 1, 2654, 6030, 3),\n" +
            "(2750, 'NAICS', 1625, 541, 2, 1717, 54199, 4),\n" +
            "(2751, 'NAICS', 1538, 52411, 4, 1539, 524113, 5),\n" +
            "(2752, 'SIC', 4310, 50, 1, 3790, 5169, 4),\n" +
            "(2753, 'NAICS', 1497, 52221, 4, 1496, 522210, 5),\n" +
            "(2754, 'SIC', 4308, 20, 1, 3480, 3600, 2),\n" +
            "(2755, 'NAICS', 1569, 53, 1, 1587, 531320, 5),\n" +
            "(2756, 'NAICS', 1720, 5511, 3, 1721, 55111, 4),\n" +
            "(2757, 'NAICS', 1830, 6115, 3, 1833, 611512, 5),\n" +
            "(2758, 'SIC', 3729, 5040, 3, 3733, 5046, 4),\n" +
            "(2759, 'NAICS', 1725, 56, 1, 1749, 561439, 5),\n" +
            "(2760, 'NAICS', 146, 21221, 4, 145, 212210, 5),\n" +
            "(2761, 'NAICS', 253, 2382, 3, 257, 23822, 4),\n" +
            "(2762, 'NAICS', 2120, 8139, 3, 2129, 813990, 5),\n" +
            "(2763, 'SIC', 4065, 7370, 3, 4074, 7379, 4),\n" +
            "(2764, 'SIC', 4313, 70, 1, 4107, 7640, 3),\n" +
            "(2765, 'NAICS', 206, 236, 2, 211, 236117, 5),\n" +
            "(2766, 'NAICS', 1015, 424, 2, 1058, 42452, 4),\n" +
            "(2767, 'NAICS', 1609, 5323, 3, 1611, 53231, 4),\n" +
            "(2768, 'NAICS', 1904, 623, 2, 1919, 62399, 4),\n" +
            "(2769, 'SIC', 4308, 20, 1, 3122, 2397, 4),\n" +
            "(2770, 'NAICS', 1419, 512, 2, 1420, 5121, 3),\n" +
            "(2771, 'SEC', 2262, 2200, 2, 2265, 2220, 3),\n" +
            "(2772, 'NAICS', 1480, 52, 1, 1481, 521, 2),\n" +
            "(2773, 'NAICS', 2134, 81411, 4, 2133, 814110, 5),\n" +
            "(2774, 'SIC', 3012, 2060, 3, 3016, 2064, 4),\n" +
            "(2775, 'NAICS', 2014, 72121, 4, 2016, 721214, 5),\n" +
            "(2776, 'SIC', 4311, 52, 1, 3835, 5490, 3),\n" +
            "(2777, 'NAICS', 1725, 56, 1, 1768, 561611, 5),\n" +
            "(2778, 'SIC', 3552, 3800, 2, 3572, 3860, 3),\n" +
            "(2779, 'SIC', 4314, 90, 1, 4268, 9400, 2),\n" +
            "(2780, 'SIC', 4308, 20, 1, 3135, 2436, 4),\n" +
            "(2781, 'SIC', 4305, 1, 1, 2800, 111, 4),\n" +
            "(2782, 'SEC', 2753, 8000, 2, 2754, 8010, 3),\n" +
            "(2783, 'SIC', 2884, 1000, 2, 2895, 1061, 4),\n" +
            "(2784, 'SEC', 2458, 3700, 2, 2474, 3760, 3),\n" +
            "(2785, 'SIC', 3444, 3550, 3, 3448, 3555, 4),\n" +
            "(2786, 'NAICS', 1583, 5313, 3, 1588, 53132, 4),\n" +
            "(2787, 'SEC', 2623, 5600, 2, 2629, 5661, 4),\n" +
            "(2788, 'NAICS', 1569, 53, 1, 1571, 5311, 3),\n" +
            "(2789, 'SIC', 3822, 5400, 2, 3831, 5450, 3),\n" +
            "(2790, 'NAICS', 1767, 56161, 4, 1770, 561613, 5),\n" +
            "(2791, 'NAICS', 200, 22131, 4, 199, 221310, 5),\n" +
            "(2792, 'NAICS', 1569, 53, 1, 1578, 531190, 5),\n" +
            "(2793, 'SIC', 3131, 2430, 3, 3133, 2434, 4),\n" +
            "(2794, 'SIC', 4305, 1, 1, 2873, 850, 3),\n" +
            "(2795, 'NAICS', 2, 111, 2, 14, 111160, 5),\n" +
            "(2796, 'SEC', 2459, 3710, 3, 2462, 3714, 4),\n" +
            "(2797, 'SIC', 4313, 70, 1, 4120, 7830, 3),\n" +
            "(2798, 'SIC', 3484, 3620, 3, 3488, 3629, 4),\n" +
            "(2799, 'SIC', 4312, 60, 1, 3976, 6411, 4),\n" +
            "(2800, 'SIC', 3371, 3400, 2, 3411, 3492, 4),\n" +
            "(2801, 'SEC', 2792, 40, 1, 2513, 4010, 3),\n" +
            "(2802, 'SIC', 4125, 7900, 2, 4126, 7910, 3),\n" +
            "(2803, 'SIC', 4192, 8300, 2, 4198, 8351, 4),\n" +
            "(2804, 'SIC', 3124, 2400, 2, 3127, 2420, 3),\n" +
            "(2805, 'NAICS', 68, 1123, 3, 73, 112330, 5),\n" +
            "(2806, 'SIC', 3537, 3730, 3, 3538, 3731, 4),\n" +
            "(2807, 'SIC', 4308, 20, 1, 3292, 3150, 3),\n" +
            "(2808, 'NAICS', 2003, 72, 1, 2031, 7225, 3),\n" +
            "(2809, 'SIC', 4308, 20, 1, 3253, 2910, 3),\n" +
            "(2810, 'NAICS', 1039, 42442, 4, 1038, 424420, 5),\n" +
            "(2811, 'NAICS', 1624, 54, 1, 1671, 541519, 5),\n" +
            "(2812, 'NAICS', 2135, 92, 1, 2190, 926110, 5),\n" +
            "(2813, 'NAICS', 931, 423, 2, 1002, 423860, 5),\n" +
            "(2814, 'NAICS', 2135, 92, 1, 2152, 922110, 5),\n" +
            "(2815, 'SIC', 4308, 20, 1, 3173, 2631, 4),\n" +
            "(2816, 'SIC', 4224, 8710, 3, 4227, 8713, 4),\n" +
            "(2817, 'SIC', 3489, 3630, 3, 3494, 3635, 4),\n" +
            "(2818, 'SEC', 2241, 2010, 3, 2243, 2013, 4),\n" +
            "(2819, 'SIC', 3762, 5100, 2, 3773, 5139, 4),\n" +
            "(2820, 'SIC', 4310, 50, 1, 3726, 5032, 4),\n" +
            "(2821, 'SIC', 4313, 70, 1, 4065, 7370, 3),\n" +
            "(2822, 'SEC', 2722, 7360, 3, 2723, 7361, 4),\n" +
            "(2823, 'NAICS', 1015, 424, 2, 1053, 42449, 4);\n";
    static String industryCodeInsert16 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(2824, 'NAICS', 1812, 61, 1, 1833, 611512, 5),\n" +
            "(2825, 'NAICS', 1015, 424, 2, 1057, 424520, 5),\n" +
            "(2826, 'SEC', 2391, 3440, 3, 2394, 3444, 4),\n" +
            "(2827, 'SEC', 2403, 3500, 2, 2414, 3541, 4),\n" +
            "(2828, 'SIC', 3480, 3600, 2, 3489, 3630, 3),\n" +
            "(2829, 'NAICS', 1442, 515, 2, 1449, 5152, 3),\n" +
            "(2830, 'SEC', 2795, 60, 1, 2649, 6000, 2),\n" +
            "(2831, 'SEC', 2717, 7330, 3, 2718, 7331, 4),\n" +
            "(2832, 'SIC', 4310, 50, 1, 3724, 5030, 3),\n" +
            "(2833, 'NAICS', 931, 423, 2, 1014, 42399, 4),\n" +
            "(2834, 'SIC', 4309, 40, 1, 3684, 4820, 3),\n" +
            "(2835, 'NAICS', 1766, 5616, 3, 1767, 56161, 4),\n" +
            "(2836, 'SEC', 2791, 20, 1, 2319, 2800, 2),\n" +
            "(2837, 'NAICS', 1015, 424, 2, 1073, 42481, 4),\n" +
            "(2838, 'SEC', 2219, 1220, 3, 2220, 1221, 4),\n" +
            "(2839, 'SIC', 4087, 7520, 3, 4088, 7521, 4),\n" +
            "(2840, 'SIC', 3507, 3660, 3, 3510, 3669, 4),\n" +
            "(2841, 'SIC', 3774, 5140, 3, 3782, 5148, 4),\n" +
            "(2842, 'SIC', 3822, 5400, 2, 3830, 5441, 4),\n" +
            "(2843, 'NAICS', 1851, 621, 2, 1885, 6216, 3),\n" +
            "(2844, 'SIC', 2901, 1200, 2, 2904, 1222, 4),\n" +
            "(2845, 'NAICS', 1812, 61, 1, 1843, 61169, 4),\n" +
            "(2846, 'SIC', 4311, 52, 1, 3904, 5961, 4),\n" +
            "(2847, 'SEC', 2788, 1, 1, 2214, 900, 2),\n" +
            "(2848, 'SEC', 2526, 4500, 2, 2530, 4520, 3),\n" +
            "(2849, 'SIC', 3208, 2780, 3, 3209, 2782, 4),\n" +
            "(2850, 'NAICS', 955, 4234, 3, 962, 423440, 5),\n" +
            "(2851, 'SIC', 4208, 8600, 2, 4216, 8641, 4),\n" +
            "(2852, 'SIC', 3818, 5330, 3, 3819, 5331, 4),\n" +
            "(2853, 'NAICS', 1015, 424, 2, 1029, 424320, 5),\n" +
            "(2854, 'NAICS', 1582, 53121, 4, 1581, 531210, 5),\n" +
            "(2855, 'SEC', 4320, 6170, 3, 4340, 6172, 4),\n" +
            "(2856, 'NAICS', 2003, 72, 1, 2035, 722514, 5),\n" +
            "(2857, 'SIC', 4308, 20, 1, 3041, 2100, 2),\n" +
            "(2858, 'SIC', 3371, 3400, 2, 3386, 3442, 4),\n" +
            "(2859, 'SIC', 3715, 5000, 2, 3761, 5099, 4),\n" +
            "(2860, 'SEC', 2704, 6790, 3, 4328, 6795, 4),\n" +
            "(2861, 'SIC', 3715, 5000, 2, 3731, 5044, 4),\n" +
            "(2862, 'NAICS', 1, 11, 1, 55, 111998, 5),\n" +
            "(2863, 'NAICS', 253, 2382, 3, 256, 238220, 5),\n" +
            "(2864, 'NAICS', 1403, 511, 2, 1404, 5111, 3),\n" +
            "(2865, 'SIC', 4307, 15, 1, 2963, 1741, 4),\n" +
            "(2866, 'SIC', 4309, 40, 1, 3646, 4481, 4),\n" +
            "(2867, 'SEC', 2794, 52, 1, 2623, 5600, 2),\n" +
            "(2868, 'NAICS', 56, 112, 2, 86, 112511, 5),\n" +
            "(2869, 'NAICS', 1015, 424, 2, 1017, 424110, 5),\n" +
            "(2870, 'NAICS', 1569, 53, 1, 1585, 531311, 5),\n" +
            "(2871, 'SEC', 2738, 7800, 2, 2745, 7830, 3),\n" +
            "(2872, 'NAICS', 1625, 541, 2, 1648, 54134, 4),\n" +
            "(2873, 'SEC', 2725, 7370, 3, 2729, 7374, 4),\n" +
            "(2874, 'NAICS', 1813, 611, 2, 1820, 6113, 3),\n" +
            "(2875, 'SIC', 2993, 2030, 3, 2994, 2032, 4),\n" +
            "(2876, 'SIC', 4308, 20, 1, 3161, 2540, 3),\n" +
            "(2877, 'SEC', 2796, 70, 1, 2739, 7810, 3),\n" +
            "(2878, 'SIC', 3419, 3500, 2, 3441, 3547, 4),\n" +
            "(2879, 'SIC', 4308, 20, 1, 3061, 2252, 4),\n" +
            "(2880, 'SIC', 3108, 2380, 3, 3113, 2387, 4),\n" +
            "(2881, 'NAICS', 1850, 62, 1, 1915, 623311, 5),\n" +
            "(2882, 'SIC', 3540, 3740, 3, 3541, 3743, 4),\n" +
            "(2883, 'NAICS', 977, 42361, 4, 976, 423610, 5),\n" +
            "(2884, 'NAICS', 1969, 712, 2, 1978, 71219, 4),\n" +
            "(2885, 'SIC', 3301, 3200, 2, 3322, 3270, 3),\n" +
            "(2886, 'SIC', 3680, 4800, 2, 3686, 4830, 3),\n" +
            "(2887, 'SIC', 4309, 40, 1, 3636, 4400, 2),\n" +
            "(2888, 'SIC', 2982, 2000, 2, 2993, 2030, 3),\n" +
            "(2889, 'SIC', 3762, 5100, 2, 3792, 5171, 4),\n" +
            "(2890, 'NAICS', 157, 21231, 4, 159, 212312, 5),\n" +
            "(2891, 'NAICS', 2038, 811, 2, 2056, 811213, 5),\n" +
            "(2892, 'NAICS', 1066, 4247, 3, 1068, 42471, 4),\n" +
            "(2893, 'NAICS', 1726, 561, 2, 1743, 56141, 4),\n" +
            "(2894, 'NAICS', 1, 11, 1, 38, 111411, 5),\n" +
            "(2895, 'SEC', 2240, 2000, 2, 2255, 2082, 4),\n" +
            "(2896, 'SEC', 2384, 3400, 2, 2399, 3460, 3),\n" +
            "(2897, 'SIC', 3059, 2250, 3, 3063, 2254, 4),\n" +
            "(2898, 'NAICS', 2135, 92, 1, 2156, 922130, 5),\n" +
            "(2899, 'SEC', 2795, 60, 1, 4326, 6532, 3),\n" +
            "(2900, 'NAICS', 1984, 71312, 4, 1983, 713120, 5),\n" +
            "(2901, 'NAICS', 1462, 5179, 3, 1465, 517919, 5),\n" +
            "(2902, 'SIC', 3480, 3600, 2, 3499, 3644, 4),\n" +
            "(2903, 'SIC', 4308, 20, 1, 3427, 3531, 4),\n" +
            "(2904, 'SIC', 2861, 760, 3, 2863, 762, 4),\n" +
            "(2905, 'NAICS', 138, 212, 2, 161, 212319, 5),\n" +
            "(2906, 'SEC', 2713, 7300, 2, 2721, 7359, 4),\n" +
            "(2907, 'SIC', 2825, 200, 2, 2837, 253, 4),\n" +
            "(2908, 'SIC', 4314, 90, 1, 4278, 9510, 3),\n" +
            "(2909, 'SIC', 3371, 3400, 2, 3390, 3448, 4),\n" +
            "(2910, 'SIC', 3854, 5600, 2, 3864, 5651, 4),\n" +
            "(2911, 'SIC', 4190, 8290, 3, 4191, 8299, 4),\n" +
            "(2912, 'SIC', 3301, 3200, 2, 3323, 3271, 4),\n" +
            "(2913, 'SIC', 4065, 7370, 3, 4070, 7375, 4),\n" +
            "(2914, 'SIC', 4308, 20, 1, 3443, 3549, 4),\n" +
            "(2915, 'NAICS', 218, 237, 2, 223, 23712, 4),\n" +
            "(2916, 'SEC', 2536, 4700, 2, 2537, 4730, 3),\n" +
            "(2917, 'SIC', 4215, 8640, 3, 4216, 8641, 4),\n" +
            "(2918, 'SIC', 4308, 20, 1, 3530, 3714, 4),\n" +
            "(2919, 'SIC', 3148, 2500, 2, 3159, 2530, 3),\n" +
            "(2920, 'SEC', 2791, 20, 1, 2290, 2540, 3),\n" +
            "(2921, 'SIC', 3261, 3000, 2, 3267, 3052, 4),\n" +
            "(2922, 'SEC', 2791, 20, 1, 2258, 2092, 4),\n" +
            "(2923, 'SIC', 3774, 5140, 3, 3776, 5142, 4),\n" +
            "(2924, 'NAICS', 1625, 541, 2, 1688, 54172, 4),\n" +
            "(2925, 'SIC', 4313, 70, 1, 4211, 8620, 3),\n" +
            "(2926, 'NAICS', 132, 21, 1, 157, 21231, 4),\n" +
            "(2927, 'NAICS', 138, 212, 2, 166, 212325, 5),\n" +
            "(2928, 'NAICS', 1942, 71, 1, 1944, 7111, 3),\n" +
            "(2929, 'SIC', 4040, 7300, 2, 4046, 7320, 3),\n" +
            "(2930, 'NAICS', 205, 23, 1, 211, 236117, 5),\n" +
            "(2931, 'NAICS', 218, 237, 2, 231, 23731, 4),\n" +
            "(2932, 'NAICS', 2013, 7212, 3, 2015, 721211, 5),\n" +
            "(2933, 'SEC', 2434, 3600, 2, 2454, 3678, 4),\n" +
            "(2934, 'NAICS', 982, 4237, 3, 988, 42373, 4),\n" +
            "(2935, 'SEC', 2302, 2700, 2, 2305, 2720, 3),\n" +
            "(2936, 'NAICS', 2141, 92112, 4, 2140, 921120, 5),\n" +
            "(2937, 'NAICS', 1785, 5619, 3, 1788, 561920, 5),\n" +
            "(2938, 'SIC', 3148, 2500, 2, 3154, 2517, 4),\n" +
            "(2939, 'SIC', 4312, 60, 1, 3966, 6350, 3),\n" +
            "(2940, 'NAICS', 1985, 7132, 3, 1987, 71321, 4),\n" +
            "(2941, 'SIC', 3050, 2200, 2, 3066, 2259, 4),\n" +
            "(2942, 'SIC', 4310, 50, 1, 3733, 5046, 4),\n" +
            "(2943, 'SIC', 3636, 4400, 2, 3645, 4480, 3),\n" +
            "(2944, 'SIC', 4040, 7300, 2, 4073, 7378, 4),\n" +
            "(2945, 'SEC', 2302, 2700, 2, 2312, 2750, 3),\n" +
            "(2946, 'SIC', 3886, 5900, 2, 3907, 5980, 3),\n" +
            "(2947, 'SIC', 3921, 6020, 3, 3923, 6022, 4),\n" +
            "(2948, 'NAICS', 2103, 813, 2, 2126, 81393, 4),\n" +
            "(2949, 'SEC', 2792, 40, 1, 2556, 4922, 4),\n" +
            "(2950, 'SIC', 4308, 20, 1, 3146, 2493, 4),\n" +
            "(2951, 'NAICS', 1569, 53, 1, 1616, 532420, 5),\n" +
            "(2952, 'NAICS', 1, 11, 1, 109, 1141, 3),\n" +
            "(2953, 'NAICS', 1794, 56211, 4, 1796, 562112, 5),\n" +
            "(2954, 'NAICS', 2187, 92512, 4, 2186, 925120, 5),\n" +
            "(2955, 'SIC', 3662, 4600, 2, 3665, 4613, 4),\n" +
            "(2956, 'SIC', 4313, 70, 1, 4160, 8052, 4),\n" +
            "(2957, 'SIC', 4307, 15, 1, 2948, 1600, 2),\n" +
            "(2958, 'SIC', 4313, 70, 1, 4042, 7311, 4),\n" +
            "(2959, 'NAICS', 144, 2122, 3, 147, 21222, 4),\n" +
            "(2960, 'SEC', 2667, 6160, 3, 2668, 6162, 4),\n" +
            "(2961, 'SIC', 4081, 7500, 2, 4083, 7513, 4),\n" +
            "(2962, 'NAICS', 36, 1114, 3, 38, 111411, 5),\n" +
            "(2963, 'NAICS', 2103, 813, 2, 2113, 81331, 4),\n" +
            "(2964, 'SIC', 4314, 90, 1, 4276, 9451, 4),\n" +
            "(2965, 'SIC', 4308, 20, 1, 3545, 3761, 4),\n" +
            "(2966, 'NAICS', 2103, 813, 2, 2115, 813312, 5),\n" +
            "(2967, 'SEC', 2791, 20, 1, 2433, 3590, 3),\n" +
            "(2968, 'SIC', 2907, 1240, 3, 2908, 1241, 4),\n" +
            "(2969, 'NAICS', 2181, 92412, 4, 2180, 924120, 5),\n" +
            "(2970, 'SIC', 4313, 70, 1, 4158, 8050, 3),\n" +
            "(2971, 'NAICS', 181, 221, 2, 185, 221112, 5),\n" +
            "(2972, 'NAICS', 2120, 8139, 3, 2122, 81391, 4),\n" +
            "(2973, 'SEC', 2526, 4500, 2, 2529, 4513, 4),\n" +
            "(2974, 'SEC', 2458, 3700, 2, 2471, 3743, 4),\n" +
            "(2975, 'SIC', 3316, 3260, 3, 3320, 3264, 4),\n" +
            "(2976, 'SIC', 3886, 5900, 2, 3887, 5910, 3),\n" +
            "(2977, 'SEC', 2664, 6150, 3, 2666, 6159, 4),\n" +
            "(2978, 'NAICS', 2038, 811, 2, 2054, 811211, 5),\n" +
            "(2979, 'NAICS', 2166, 923, 2, 2173, 92313, 4),\n" +
            "(2980, 'SIC', 3371, 3400, 2, 3396, 3462, 4),\n" +
            "(2981, 'SIC', 3337, 3300, 2, 3343, 3317, 4),\n" +
            "(2982, 'NAICS', 1813, 611, 2, 1828, 611430, 5),\n" +
            "(2983, 'SEC', 2434, 3600, 2, 2446, 3660, 3),\n" +
            "(2984, 'SIC', 4309, 40, 1, 3655, 4510, 3),\n" +
            "(2985, 'SIC', 3654, 4500, 2, 3655, 4510, 3),\n" +
            "(2986, 'NAICS', 2039, 8111, 3, 2046, 811121, 5),\n" +
            "(2987, 'SEC', 2659, 6100, 2, 4322, 6180, 3),\n" +
            "(2988, 'SIC', 4308, 20, 1, 3458, 3567, 4),\n" +
            "(2989, 'SIC', 3886, 5900, 2, 3909, 5984, 4),\n" +
            "(2990, 'NAICS', 202, 22132, 4, 201, 221320, 5),\n" +
            "(2991, 'SIC', 2798, 100, 2, 2800, 111, 4),\n" +
            "(2992, 'NAICS', 273, 2389, 3, 275, 23891, 4),\n" +
            "(2993, 'SIC', 4313, 70, 1, 4061, 7359, 4),\n" +
            "(2994, 'SIC', 3252, 2900, 2, 3256, 2951, 4),\n" +
            "(2995, 'SIC', 3576, 3900, 2, 3595, 3990, 3),\n" +
            "(2996, 'NAICS', 173, 2131, 3, 174, 21311, 4),\n" +
            "(2997, 'SEC', 2476, 3800, 2, 2498, 3870, 3),\n" +
            "(2998, 'SIC', 3282, 3100, 2, 3300, 3199, 4),\n" +
            "(2999, 'SIC', 3301, 3200, 2, 3319, 3263, 4),\n" +
            "(3000, 'NAICS', 1569, 53, 1, 1608, 532299, 5),\n" +
            "(3001, 'NAICS', 1441, 51229, 4, 1440, 512290, 5),\n" +
            "(3002, 'NAICS', 1480, 52, 1, 1553, 524298, 5),\n" +
            "(3003, 'SIC', 4146, 8000, 2, 4167, 8071, 4),\n" +
            "(3004, 'SIC', 4311, 52, 1, 3864, 5651, 4),\n" +
            "(3005, 'NAICS', 218, 237, 2, 224, 237130, 5),\n" +
            "(3006, 'NAICS', 1420, 5121, 3, 1429, 512191, 5),\n" +
            "(3007, 'SIC', 3020, 2070, 3, 3024, 2077, 4),\n" +
            "(3008, 'NAICS', 1741, 5614, 3, 1742, 561410, 5),\n" +
            "(3009, 'NAICS', 2037, 81, 1, 2103, 813, 2),\n" +
            "(3010, 'SEC', 2355, 3200, 2, 2366, 3270, 3),\n" +
            "(3011, 'SEC', 2450, 3670, 3, 2455, 3679, 4),\n" +
            "(3012, 'NAICS', 57, 1121, 3, 63, 112130, 5),\n" +
            "(3013, 'SIC', 4247, 9100, 2, 4250, 9120, 3),\n" +
            "(3014, 'NAICS', 1, 11, 1, 131, 11531, 4),\n" +
            "(3015, 'SEC', 2791, 20, 1, 2446, 3660, 3),\n" +
            "(3016, 'SEC', 2523, 4400, 2, 2525, 4412, 4),\n" +
            "(3017, 'SEC', 2791, 20, 1, 2242, 2011, 4),\n" +
            "(3018, 'SIC', 4308, 20, 1, 3479, 3599, 4),\n" +
            "(3019, 'NAICS', 1804, 5629, 3, 1810, 562991, 5),\n" +
            "(3020, 'SIC', 4308, 20, 1, 3034, 2091, 4),\n" +
            "(3021, 'NAICS', 1624, 54, 1, 1662, 541430, 5),\n" +
            "(3022, 'SIC', 3975, 6410, 3, 3976, 6411, 4),\n" +
            "(3023, 'NAICS', 1569, 53, 1, 1619, 53249, 4),\n" +
            "(3024, 'SIC', 3555, 3820, 3, 3562, 3827, 4),\n" +
            "(3025, 'SIC', 4308, 20, 1, 3249, 2893, 4),\n" +
            "(3026, 'SIC', 4040, 7300, 2, 4076, 7381, 4),\n" +
            "(3027, 'SIC', 2875, 900, 2, 2882, 970, 3),\n" +
            "(3028, 'NAICS', 174, 21311, 4, 177, 213113, 5),\n" +
            "(3029, 'SEC', 2378, 3340, 3, 2379, 3341, 4),\n" +
            "(3030, 'SIC', 4308, 20, 1, 3496, 3640, 3),\n" +
            "(3031, 'NAICS', 931, 423, 2, 983, 423710, 5),\n" +
            "(3032, 'SIC', 4308, 20, 1, 3521, 3691, 4),\n" +
            "(3033, 'SIC', 4308, 20, 1, 3237, 2860, 3),\n" +
            "(3034, 'SIC', 4308, 20, 1, 3379, 3429, 4),\n" +
            "(3035, 'SIC', 4313, 70, 1, 4011, 7021, 4),\n" +
            "(3036, 'SIC', 3026, 2080, 3, 3029, 2084, 4),\n" +
            "(3037, 'SEC', 2791, 20, 1, 2454, 3678, 4),\n" +
            "(3038, 'SEC', 2568, 5000, 2, 2581, 5064, 4),\n" +
            "(3039, 'SIC', 4308, 20, 1, 3065, 2258, 4),\n" +
            "(3040, 'SIC', 4242, 8810, 3, 4243, 8811, 4),\n" +
            "(3041, 'NAICS', 140, 21211, 4, 143, 212113, 5),\n" +
            "(3042, 'NAICS', 167, 21239, 4, 171, 212399, 5),\n" +
            "(3043, 'NAICS', 1413, 51119, 4, 1415, 511199, 5),\n" +
            "(3044, 'NAICS', 1419, 512, 2, 1424, 51212, 4),\n" +
            "(3045, 'SIC', 2864, 780, 3, 2867, 783, 4),\n" +
            "(3046, 'NAICS', 116, 11421, 4, 115, 114210, 5),\n" +
            "(3047, 'SEC', 2791, 20, 1, 2463, 3715, 4),\n" +
            "(3048, 'SIC', 2918, 1400, 2, 2922, 1422, 4),\n" +
            "(3049, 'SIC', 4308, 20, 1, 3432, 3536, 4),\n" +
            "(3050, 'NAICS', 1709, 54192, 4, 1710, 541921, 5),\n" +
            "(3051, 'SIC', 4311, 52, 1, 3843, 5531, 4),\n" +
            "(3052, 'NAICS', 1624, 54, 1, 1705, 54189, 4),\n" +
            "(3053, 'SEC', 2797, 90, 1, 2785, 9700, 2),\n" +
            "(3054, 'SIC', 3241, 2870, 3, 3243, 2874, 4),\n" +
            "(3055, 'SIC', 4313, 70, 1, 4215, 8640, 3),\n" +
            "(3056, 'SIC', 2847, 700, 2, 2867, 783, 4),\n" +
            "(3057, 'NAICS', 79, 1124, 3, 80, 112410, 5),\n" +
            "(3058, 'SIC', 3149, 2510, 3, 3150, 2511, 4),\n" +
            "(3059, 'SEC', 2591, 5100, 2, 2602, 5172, 4),\n" +
            "(3060, 'NAICS', 1569, 53, 1, 1604, 53223, 4),\n" +
            "(3061, 'SEC', 2796, 70, 1, 2772, 8351, 4),\n" +
            "(3062, 'NAICS', 68, 1123, 3, 69, 112310, 5),\n" +
            "(3063, 'NAICS', 1402, 51, 1, 1477, 51913, 4),\n" +
            "(3064, 'SIC', 4305, 1, 1, 2827, 211, 4),\n" +
            "(3065, 'NAICS', 1744, 56142, 4, 1745, 561421, 5),\n" +
            "(3066, 'SIC', 4308, 20, 1, 3033, 2090, 3),\n" +
            "(3067, 'SIC', 3937, 6100, 2, 3943, 6153, 4),\n" +
            "(3068, 'NAICS', 1569, 53, 1, 1589, 531390, 5),\n" +
            "(3069, 'SIC', 4230, 8730, 3, 4232, 8732, 4),\n" +
            "(3070, 'SIC', 4162, 8060, 3, 4165, 8069, 4),\n" +
            "(3071, 'NAICS', 1490, 52212, 4, 1489, 522120, 5),\n" +
            "(3072, 'NAICS', 172, 213, 2, 178, 213114, 5),\n" +
            "(3073, 'NAICS', 1625, 541, 2, 1635, 54121, 4),\n" +
            "(3074, 'NAICS', 1625, 541, 2, 1710, 541921, 5),\n" +
            "(3075, 'SIC', 4306, 10, 1, 2921, 1420, 3),\n" +
            "(3076, 'SIC', 3762, 5100, 2, 3779, 5145, 4),\n" +
            "(3077, 'SIC', 4313, 70, 1, 4062, 7360, 3),\n" +
            "(3078, 'SEC', 2795, 60, 1, 2667, 6160, 3),\n" +
            "(3079, 'NAICS', 1485, 522, 2, 1511, 522390, 5),\n" +
            "(3080, 'SIC', 4311, 52, 1, 3829, 5440, 3),\n" +
            "(3081, 'SIC', 3693, 4900, 2, 3704, 4939, 4),\n" +
            "(3082, 'NAICS', 1741, 5614, 3, 1749, 561439, 5),\n" +
            "(3083, 'SIC', 4309, 40, 1, 3617, 4151, 4),\n" +
            "(3084, 'NAICS', 64, 11213, 4, 63, 112130, 5),\n" +
            "(3085, 'NAICS', 253, 2382, 3, 255, 23821, 4),\n" +
            "(3086, 'NAICS', 930, 42, 1, 1079, 424920, 5),\n" +
            "(3087, 'SIC', 2918, 1400, 2, 2929, 1455, 4),\n" +
            "(3088, 'NAICS', 1908, 6232, 3, 1912, 62322, 4),\n" +
            "(3089, 'SIC', 4313, 70, 1, 4106, 7631, 4),\n" +
            "(3090, 'NAICS', 180, 22, 1, 196, 221210, 5),\n" +
            "(3091, 'NAICS', 2003, 72, 1, 2034, 722513, 5),\n" +
            "(3092, 'SIC', 4310, 50, 1, 3775, 5141, 4),\n" +
            "(3093, 'NAICS', 1402, 51, 1, 1419, 512, 2),\n" +
            "(3094, 'SEC', 2459, 3710, 3, 2461, 3713, 4),\n" +
            "(3095, 'SIC', 4002, 6790, 3, 4006, 6799, 4),\n" +
            "(3096, 'SEC', 2403, 3500, 2, 2433, 3590, 3),\n" +
            "(3097, 'SEC', 2780, 8740, 3, 2783, 8744, 4),\n" +
            "(3098, 'NAICS', 1792, 562, 2, 1808, 56292, 4),\n" +
            "(3099, 'SIC', 3344, 3320, 3, 3347, 3324, 4),\n" +
            "(3100, 'SEC', 2552, 4900, 2, 2566, 4960, 3),\n" +
            "(3101, 'SIC', 3124, 2400, 2, 3128, 2421, 4),\n" +
            "(3102, 'NAICS', 2020, 722, 2, 2025, 72232, 4),\n" +
            "(3103, 'NAICS', 1856, 6212, 3, 1857, 621210, 5),\n" +
            "(3104, 'SEC', 2792, 40, 1, 2526, 4500, 2),\n" +
            "(3105, 'NAICS', 1895, 6221, 3, 1896, 622110, 5),\n" +
            "(3106, 'NAICS', 1089, 425, 2, 1092, 42511, 4),\n" +
            "(3107, 'NAICS', 1766, 5616, 3, 1769, 561612, 5),\n" +
            "(3108, 'SIC', 3409, 3490, 3, 3415, 3496, 4),\n" +
            "(3109, 'NAICS', 1026, 4243, 3, 1034, 42434, 4),\n" +
            "(3110, 'NAICS', 1625, 541, 2, 1634, 5412, 3),\n" +
            "(3111, 'NAICS', 1901, 6223, 3, 1903, 62231, 4),\n" +
            "(3112, 'SIC', 4305, 1, 1, 2855, 740, 3),\n" +
            "(3113, 'NAICS', 1625, 541, 2, 1683, 5417, 3),\n" +
            "(3114, 'SEC', 2234, 1600, 2, 2236, 1623, 4),\n" +
            "(3115, 'NAICS', 930, 42, 1, 958, 423420, 5),\n" +
            "(3116, 'NAICS', 1785, 5619, 3, 1786, 561910, 5),\n" +
            "(3117, 'SIC', 4308, 20, 1, 3029, 2084, 4),\n" +
            "(3118, 'SIC', 2847, 700, 2, 2865, 781, 4),\n" +
            "(3119, 'NAICS', 1555, 5251, 3, 1560, 525190, 5),\n" +
            "(3120, 'NAICS', 1431, 5122, 3, 1441, 51229, 4),\n" +
            "(3121, 'NAICS', 2120, 8139, 3, 2124, 81392, 4),\n" +
            "(3122, 'SEC', 2262, 2200, 2, 2269, 2270, 3),\n" +
            "(3123, 'SIC', 2864, 780, 3, 2865, 781, 4),\n" +
            "(3124, 'SIC', 3480, 3600, 2, 3523, 3694, 4),\n" +
            "(3125, 'NAICS', 930, 42, 1, 979, 42362, 4),\n" +
            "(3126, 'NAICS', 930, 42, 1, 1021, 424130, 5),\n" +
            "(3127, 'NAICS', 1470, 519, 2, 1472, 519110, 5),\n" +
            "(3128, 'SIC', 2982, 2000, 2, 3039, 2098, 4),\n" +
            "(3129, 'SIC', 4308, 20, 1, 3572, 3860, 3),\n" +
            "(3130, 'SIC', 2847, 700, 2, 2857, 742, 4),\n" +
            "(3131, 'NAICS', 1943, 711, 2, 1951, 711190, 5),\n" +
            "(3132, 'SIC', 4308, 20, 1, 3048, 2140, 3),\n" +
            "(3133, 'SIC', 3337, 3300, 2, 3344, 3320, 3),\n" +
            "(3134, 'NAICS', 1942, 71, 1, 2000, 71395, 4),\n" +
            "(3135, 'NAICS', 1640, 5413, 3, 1644, 54132, 4),\n" +
            "(3136, 'SEC', 2424, 3570, 3, 2428, 3577, 4),\n" +
            "(3137, 'SIC', 3237, 2860, 3, 3238, 2861, 4),\n" +
            "(3138, 'NAICS', 1419, 512, 2, 1430, 512199, 5),\n" +
            "(3139, 'SIC', 3822, 5400, 2, 3824, 5411, 4),\n" +
            "(3140, 'NAICS', 2135, 92, 1, 2164, 922190, 5),\n" +
            "(3141, 'NAICS', 236, 2381, 3, 252, 23819, 4),\n" +
            "(3142, 'NAICS', 1071, 4248, 3, 1074, 424820, 5),\n" +
            "(3143, 'SEC', 2791, 20, 1, 2475, 3790, 3),\n" +
            "(3144, 'NAICS', 1942, 71, 1, 1999, 713950, 5),\n" +
            "(3145, 'SIC', 4312, 60, 1, 3989, 6550, 3),\n" +
            "(3146, 'SEC', 2703, 6700, 2, 4328, 6795, 4),\n" +
            "(3147, 'SIC', 4308, 20, 1, 3384, 3440, 3),\n" +
            "(3148, 'SIC', 4312, 60, 1, 3949, 6210, 3),\n" +
            "(3149, 'SEC', 2794, 52, 1, 2613, 5330, 3),\n" +
            "(3150, 'SIC', 2993, 2030, 3, 2996, 2034, 4),\n" +
            "(3151, 'SIC', 3715, 5000, 2, 3747, 5075, 4),\n" +
            "(3152, 'SIC', 3124, 2400, 2, 3142, 2451, 4),\n" +
            "(3153, 'SIC', 3496, 3640, 3, 3498, 3643, 4),\n" +
            "(3154, 'SIC', 3886, 5900, 2, 3913, 5993, 4),\n" +
            "(3155, 'NAICS', 2037, 81, 1, 2119, 81341, 4),\n" +
            "(3156, 'SIC', 2887, 1020, 3, 2888, 1021, 4),\n" +
            "(3157, 'NAICS', 1718, 55, 1, 1720, 5511, 3),\n" +
            "(3158, 'NAICS', 1726, 561, 2, 1760, 56151, 4),\n" +
            "(3159, 'SEC', 2610, 5300, 2, 2611, 5310, 3),\n" +
            "(3160, 'SIC', 4308, 20, 1, 3068, 2261, 4),\n" +
            "(3161, 'NAICS', 1920, 624, 2, 1931, 62422, 4),\n" +
            "(3162, 'SIC', 4268, 9400, 2, 4275, 9450, 3),\n" +
            "(3163, 'NAICS', 2, 111, 2, 34, 111336, 5),\n" +
            "(3164, 'SEC', 2789, 10, 1, 2217, 1090, 3),\n" +
            "(3165, 'NAICS', 1850, 62, 1, 1913, 6233, 3),\n" +
            "(3166, 'SEC', 2713, 7300, 2, 2725, 7370, 3),\n" +
            "(3167, 'SIC', 2955, 1700, 2, 2958, 1720, 3),\n" +
            "(3168, 'SIC', 3214, 2800, 2, 3215, 2810, 3),\n" +
            "(3169, 'SEC', 2794, 52, 1, 2632, 5712, 4),\n" +
            "(3170, 'SIC', 3050, 2200, 2, 3080, 2297, 4),\n" +
            "(3171, 'SIC', 4166, 8070, 3, 4167, 8071, 4),\n" +
            "(3172, 'NAICS', 56, 112, 2, 63, 112130, 5),\n" +
            "(3173, 'NAICS', 1431, 5122, 3, 1433, 51221, 4),\n" +
            "(3174, 'NAICS', 982, 4237, 3, 989, 423740, 5),\n" +
            "(3175, 'NAICS', 2020, 722, 2, 2033, 722511, 5),\n" +
            "(3176, 'SIC', 4309, 40, 1, 3661, 4581, 4),\n" +
            "(3177, 'SEC', 2276, 2400, 2, 2277, 2420, 3),\n" +
            "(3178, 'SIC', 4310, 50, 1, 3759, 5093, 4),\n" +
            "(3179, 'SIC', 4308, 20, 1, 3012, 2060, 3),\n" +
            "(3180, 'SIC', 4178, 8200, 2, 4183, 8222, 4),\n" +
            "(3181, 'SIC', 4081, 7500, 2, 4089, 7530, 3),\n" +
            "(3182, 'NAICS', 1954, 71121, 4, 1956, 711212, 5),\n" +
            "(3183, 'NAICS', 2135, 92, 1, 2168, 923110, 5),\n" +
            "(3184, 'SIC', 4313, 70, 1, 4182, 8221, 4),\n" +
            "(3185, 'NAICS', 2, 111, 2, 18, 111199, 5),\n" +
            "(3186, 'NAICS', 1513, 523, 2, 1525, 52321, 4),\n" +
            "(3187, 'SEC', 2371, 3300, 2, 2373, 3312, 4),\n" +
            "(3188, 'SIC', 4309, 40, 1, 3678, 4785, 4),\n" +
            "(3189, 'NAICS', 1, 11, 1, 25, 11131, 4),\n" +
            "(3190, 'SIC', 4308, 20, 1, 3203, 2759, 4),\n" +
            "(3191, 'SIC', 3911, 5990, 3, 3914, 5994, 4),\n" +
            "(3192, 'NAICS', 105, 1133, 3, 106, 113310, 5),\n" +
            "(3193, 'SEC', 2796, 70, 1, 2732, 7381, 4),\n" +
            "(3194, 'SIC', 4309, 40, 1, 3701, 4930, 3),\n" +
            "(3195, 'SIC', 3451, 3560, 3, 3452, 3561, 4),\n" +
            "(3196, 'NAICS', 104, 11321, 4, 103, 113210, 5),\n" +
            "(3197, 'SIC', 4313, 70, 1, 4119, 7829, 4),\n" +
            "(3198, 'NAICS', 1506, 5223, 3, 1510, 52232, 4),\n" +
            "(3199, 'NAICS', 1943, 711, 2, 1948, 71112, 4),\n" +
            "(3200, 'SIC', 3230, 2840, 3, 3231, 2841, 4),\n" +
            "(3201, 'NAICS', 1480, 52, 1, 1542, 524126, 5),\n" +
            "(3202, 'NAICS', 248, 23816, 4, 247, 238160, 5),\n" +
            "(3203, 'SEC', 2649, 6000, 2, 2653, 6029, 4),\n" +
            "(3204, 'NAICS', 930, 42, 1, 1082, 42493, 4),\n" +
            "(3205, 'NAICS', 2135, 92, 1, 2136, 921, 2),\n" +
            "(3206, 'SEC', 2579, 5060, 3, 2582, 5065, 4),\n" +
            "(3207, 'SEC', 2550, 4890, 3, 2551, 4899, 4),\n" +
            "(3208, 'SIC', 3461, 3570, 3, 3466, 3578, 4),\n" +
            "(3209, 'SEC', 2415, 3550, 3, 2417, 3559, 4),\n" +
            "(3210, 'NAICS', 132, 21, 1, 175, 213111, 5),\n" +
            "(3211, 'NAICS', 930, 42, 1, 1009, 423930, 5),\n" +
            "(3212, 'SEC', 2791, 20, 1, 2365, 3260, 3),\n" +
            "(3213, 'SIC', 3480, 3600, 2, 3481, 3610, 3),\n" +
            "(3214, 'NAICS', 1942, 71, 1, 1990, 7139, 3),\n" +
            "(3215, 'SIC', 4297, 9700, 2, 4300, 9720, 3),\n" +
            "(3216, 'NAICS', 2085, 8123, 3, 2089, 81232, 4),\n" +
            "(3217, 'SIC', 3077, 2290, 3, 3079, 2296, 4),\n" +
            "(3218, 'NAICS', 2038, 811, 2, 2045, 81112, 4),\n" +
            "(3219, 'NAICS', 1485, 522, 2, 1504, 522294, 5),\n" +
            "(3220, 'NAICS', 1851, 621, 2, 1854, 621111, 5),\n" +
            "(3221, 'SEC', 2267, 2250, 3, 2268, 2253, 4),\n" +
            "(3222, 'NAICS', 1480, 52, 1, 1551, 524291, 5),\n" +
            "(3223, 'NAICS', 1672, 5416, 3, 1674, 541611, 5),\n" +
            "(3224, 'NAICS', 1813, 611, 2, 1824, 611410, 5),\n" +
            "(3225, 'SIC', 4017, 7200, 2, 4018, 7210, 3),\n" +
            "(3226, 'SIC', 2799, 110, 3, 2800, 111, 4),\n" +
            "(3227, 'NAICS', 1480, 52, 1, 1536, 524, 2),\n" +
            "(3228, 'NAICS', 1942, 71, 1, 1996, 71393, 4),\n" +
            "(3229, 'SIC', 3636, 4400, 2, 3648, 4489, 4),\n" +
            "(3230, 'SIC', 4310, 50, 1, 3777, 5143, 4),\n" +
            "(3231, 'SEC', 2408, 3530, 3, 2411, 3533, 4),\n" +
            "(3232, 'SEC', 2792, 40, 1, 2540, 4810, 3),\n" +
            "(3233, 'SEC', 2677, 6300, 2, 2678, 6310, 3),\n" +
            "(3234, 'SIC', 3958, 6300, 2, 3965, 6331, 4),\n" +
            "(3235, 'SEC', 2791, 20, 1, 2340, 2950, 3),\n" +
            "(3236, 'SIC', 4308, 20, 1, 2992, 2026, 4),\n" +
            "(3237, 'NAICS', 1480, 52, 1, 1546, 52413, 4),\n" +
            "(3238, 'NAICS', 1905, 6231, 3, 1907, 62311, 4),\n" +
            "(3239, 'SIC', 3190, 2700, 2, 3203, 2759, 4),\n" +
            "(3240, 'SIC', 3854, 5600, 2, 3865, 5660, 3),\n" +
            "(3241, 'SIC', 3992, 6700, 2, 4006, 6799, 4),\n" +
            "(3242, 'SIC', 3715, 5000, 2, 3751, 5083, 4),\n" +
            "(3243, 'SIC', 2982, 2000, 2, 2991, 2024, 4),\n" +
            "(3244, 'NAICS', 1673, 54161, 4, 1678, 541618, 5),\n" +
            "(3245, 'NAICS', 2007, 72111, 4, 2006, 721110, 5),\n" +
            "(3246, 'SIC', 4049, 7330, 3, 4053, 7336, 4),\n" +
            "(3247, 'SEC', 2794, 52, 1, 2639, 5812, 4),\n" +
            "(3248, 'SIC', 2982, 2000, 2, 3003, 2044, 4),\n" +
            "(3249, 'SIC', 3008, 2050, 3, 3010, 2052, 4),\n" +
            "(3250, 'SIC', 3330, 3290, 3, 3336, 3299, 4),\n" +
            "(3251, 'SIC', 4017, 7200, 2, 4038, 7291, 4),\n" +
            "(3252, 'NAICS', 1537, 5241, 3, 1538, 52411, 4),\n" +
            "(3253, 'SIC', 4230, 8730, 3, 4231, 8731, 4),\n" +
            "(3254, 'SIC', 3553, 3810, 3, 3554, 3812, 4),\n" +
            "(3255, 'SIC', 4040, 7300, 2, 4069, 7374, 4),\n" +
            "(3256, 'SEC', 2791, 20, 1, 2315, 2770, 3),\n" +
            "(3257, 'NAICS', 931, 423, 2, 957, 42341, 4),\n" +
            "(3258, 'SEC', 2384, 3400, 2, 2392, 3442, 4),\n" +
            "(3259, 'NAICS', 235, 238, 2, 239, 238120, 5),\n" +
            "(3260, 'NAICS', 260, 2383, 3, 269, 238350, 5),\n" +
            "(3261, 'NAICS', 2003, 72, 1, 2018, 721310, 5),\n" +
            "(3262, 'SIC', 4308, 20, 1, 3082, 2299, 4),\n" +
            "(3263, 'NAICS', 1402, 51, 1, 1478, 519190, 5),\n" +
            "(3264, 'SEC', 2796, 70, 1, 2723, 7361, 4),\n" +
            "(3265, 'SEC', 2434, 3600, 2, 2435, 3610, 3),\n" +
            "(3266, 'SIC', 2825, 200, 2, 2835, 251, 4),\n" +
            "(3267, 'NAICS', 2185, 92511, 4, 2184, 925110, 5),\n" +
            "(3268, 'SIC', 3148, 2500, 2, 3149, 2510, 3),\n" +
            "(3269, 'NAICS', 2, 111, 2, 52, 11199, 4),\n" +
            "(3270, 'NAICS', 1938, 62431, 4, 1937, 624310, 5),\n" +
            "(3271, 'SIC', 3846, 5550, 3, 3847, 5551, 4),\n" +
            "(3272, 'SIC', 3041, 2100, 2, 3047, 2131, 4),\n" +
            "(3273, 'NAICS', 260, 2383, 3, 267, 238340, 5),\n" +
            "(3274, 'NAICS', 1569, 53, 1, 1586, 531312, 5),\n" +
            "(3275, 'SIC', 3167, 2600, 2, 3176, 2653, 4),\n" +
            "(3276, 'NAICS', 23, 1113, 3, 25, 11131, 4),\n" +
            "(3277, 'NAICS', 959, 42342, 4, 958, 423420, 5),\n" +
            "(3278, 'SIC', 4109, 7690, 3, 4111, 7694, 4),\n" +
            "(3279, 'NAICS', 1726, 561, 2, 1791, 56199, 4),\n" +
            "(3280, 'NAICS', 167, 21239, 4, 169, 212392, 5),\n" +
            "(3281, 'NAICS', 1628, 54111, 4, 1627, 541110, 5),\n" +
            "(3282, 'SEC', 2568, 5000, 2, 2583, 5070, 3),\n" +
            "(3283, 'NAICS', 1813, 611, 2, 1834, 611513, 5),\n" +
            "(3284, 'SEC', 2774, 8700, 2, 2780, 8740, 3),\n" +
            "(3285, 'SIC', 4311, 52, 1, 3845, 5541, 4),\n" +
            "(3286, 'SIC', 3301, 3200, 2, 3335, 3297, 4),\n" +
            "(3287, 'NAICS', 1495, 5222, 3, 1505, 522298, 5),\n" +
            "(3288, 'SIC', 3124, 2400, 2, 3140, 2449, 4),\n" +
            "(3289, 'NAICS', 930, 42, 1, 1083, 424940, 5),\n" +
            "(3290, 'SIC', 4308, 20, 1, 3027, 2082, 4),\n" +
            "(3291, 'NAICS', 1562, 5259, 3, 1564, 52591, 4),\n" +
            "(3292, 'NAICS', 2137, 9211, 3, 2144, 921140, 5),\n" +
            "(3293, 'SIC', 4313, 70, 1, 4153, 8040, 3),\n" +
            "(3294, 'SIC', 3344, 3320, 3, 3345, 3321, 4),\n" +
            "(3295, 'NAICS', 930, 42, 1, 984, 42371, 4),\n" +
            "(3296, 'SIC', 4308, 20, 1, 3598, 3995, 4),\n" +
            "(3297, 'NAICS', 1612, 5324, 3, 1613, 53241, 4),\n" +
            "(3298, 'SIC', 3526, 3700, 2, 3538, 3731, 4),\n" +
            "(3299, 'SIC', 3372, 3410, 3, 3374, 3412, 4),\n" +
            "(3300, 'SEC', 2319, 2800, 2, 2320, 2810, 3),\n" +
            "(3301, 'NAICS', 1554, 525, 2, 1561, 52519, 4),\n" +
            "(3302, 'NAICS', 1792, 562, 2, 1805, 562910, 5),\n" +
            "(3303, 'SEC', 2628, 5660, 3, 2629, 5661, 4),\n" +
            "(3304, 'SIC', 3419, 3500, 2, 3430, 3534, 4),\n" +
            "(3305, 'SIC', 2869, 810, 3, 2870, 811, 4),\n" +
            "(3306, 'SIC', 2845, 290, 3, 2846, 291, 4),\n" +
            "(3307, 'SEC', 2791, 20, 1, 2435, 3610, 3),\n" +
            "(3308, 'NAICS', 108, 114, 2, 112, 114112, 5),\n" +
            "(3309, 'NAICS', 1979, 713, 2, 1992, 71391, 4),\n" +
            "(3310, 'SEC', 2240, 2000, 2, 2251, 2052, 4),\n" +
            "(3311, 'SIC', 4305, 1, 1, 2844, 279, 4),\n" +
            "(3312, 'NAICS', 2120, 8139, 3, 2121, 813910, 5),\n" +
            "(3313, 'SIC', 2825, 200, 2, 2834, 250, 3),\n" +
            "(3314, 'SIC', 4313, 70, 1, 4091, 7533, 4),\n" +
            "(3315, 'NAICS', 235, 238, 2, 266, 23833, 4),\n" +
            "(3316, 'SIC', 3807, 5230, 3, 3808, 5231, 4),\n" +
            "(3317, 'NAICS', 2150, 922, 2, 2159, 92214, 4),\n" +
            "(3318, 'SIC', 3552, 3800, 2, 3559, 3824, 4),\n" +
            "(3319, 'SIC', 3083, 2300, 2, 3116, 2391, 4),\n" +
            "(3320, 'SIC', 3434, 3540, 3, 3438, 3544, 4);\n";
    static String industryCodeInsert17 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(3321, 'NAICS', 1003, 42386, 4, 1002, 423860, 5),\n" +
            "(3322, 'NAICS', 205, 23, 1, 234, 23799, 4),\n" +
            "(3323, 'SIC', 2955, 1700, 2, 2968, 1752, 4),\n" +
            "(3324, 'SIC', 3083, 2300, 2, 3088, 2322, 4),\n" +
            "(3325, 'SIC', 4125, 7900, 2, 4139, 7990, 3),\n" +
            "(3326, 'NAICS', 56, 112, 2, 87, 112512, 5),\n" +
            "(3327, 'NAICS', 156, 2123, 3, 166, 212325, 5),\n" +
            "(3328, 'SIC', 3050, 2200, 2, 3063, 2254, 4),\n" +
            "(3329, 'SIC', 3762, 5100, 2, 3768, 5122, 4),\n" +
            "(3330, 'NAICS', 1480, 52, 1, 1541, 52412, 4),\n" +
            "(3331, 'NAICS', 1402, 51, 1, 1451, 51521, 4),\n" +
            "(3332, 'NAICS', 1625, 541, 2, 1645, 541330, 5),\n" +
            "(3333, 'SIC', 3576, 3900, 2, 3580, 3915, 4),\n" +
            "(3334, 'NAICS', 1452, 517, 2, 1465, 517919, 5),\n" +
            "(3335, 'SIC', 4308, 20, 1, 3491, 3632, 4),\n" +
            "(3336, 'NAICS', 1619, 53249, 4, 1618, 532490, 5),\n" +
            "(3337, 'SEC', 2795, 60, 1, 2663, 6141, 4),\n" +
            "(3338, 'SIC', 4176, 8110, 3, 4177, 8111, 4),\n" +
            "(3339, 'NAICS', 1624, 54, 1, 1663, 54143, 4),\n" +
            "(3340, 'SIC', 3050, 2200, 2, 3051, 2210, 3),\n" +
            "(3341, 'SEC', 2794, 52, 1, 2647, 5961, 4),\n" +
            "(3342, 'SIC', 4017, 7200, 2, 4036, 7261, 4),\n" +
            "(3343, 'NAICS', 2, 111, 2, 39, 111419, 5),\n" +
            "(3344, 'NAICS', 1725, 56, 1, 1756, 561492, 5),\n" +
            "(3345, 'NAICS', 2093, 8129, 3, 2099, 812930, 5),\n" +
            "(3346, 'SEC', 2640, 5900, 2, 2644, 5944, 4),\n" +
            "(3347, 'SEC', 2795, 60, 1, 2657, 6090, 3),\n" +
            "(3348, 'SEC', 2796, 70, 1, 2754, 8010, 3),\n" +
            "(3349, 'SIC', 4311, 52, 1, 3865, 5660, 3),\n" +
            "(3350, 'SIC', 4291, 9640, 3, 4292, 9641, 4),\n" +
            "(3351, 'NAICS', 2103, 813, 2, 2125, 813930, 5),\n" +
            "(3352, 'NAICS', 2039, 8111, 3, 2042, 811112, 5),\n" +
            "(3353, 'NAICS', 1958, 7113, 3, 1959, 711310, 5),\n" +
            "(3354, 'NAICS', 25, 11131, 4, 24, 111310, 5),\n" +
            "(3355, 'SEC', 2292, 2600, 2, 2300, 2670, 3),\n" +
            "(3356, 'SEC', 2791, 20, 1, 2465, 3720, 3),\n" +
            "(3357, 'SIC', 4308, 20, 1, 3492, 3633, 4),\n" +
            "(3358, 'SIC', 4309, 40, 1, 3675, 4741, 4),\n" +
            "(3359, 'SIC', 3749, 5080, 3, 3754, 5087, 4),\n" +
            "(3360, 'SEC', 2458, 3700, 2, 2460, 3711, 4),\n" +
            "(3361, 'SIC', 3337, 3300, 2, 3346, 3322, 4),\n" +
            "(3362, 'SEC', 2793, 50, 1, 2584, 5072, 4),\n" +
            "(3363, 'SIC', 4313, 70, 1, 4095, 7538, 4),\n" +
            "(3364, 'SIC', 3059, 2250, 3, 3066, 2259, 4),\n" +
            "(3365, 'SIC', 3626, 4220, 3, 3629, 4225, 4),\n" +
            "(3366, 'SIC', 3837, 5500, 2, 3848, 5560, 3),\n" +
            "(3367, 'NAICS', 1402, 51, 1, 1449, 5152, 3),\n" +
            "(3368, 'NAICS', 1943, 711, 2, 1950, 71113, 4),\n" +
            "(3369, 'SIC', 3355, 3350, 3, 3359, 3355, 4),\n" +
            "(3370, 'SIC', 3496, 3640, 3, 3497, 3641, 4),\n" +
            "(3371, 'SIC', 3654, 4500, 2, 3661, 4581, 4),\n" +
            "(3372, 'SIC', 4314, 90, 1, 4267, 9311, 4),\n" +
            "(3373, 'SIC', 3605, 4100, 2, 3616, 4150, 3),\n" +
            "(3374, 'SIC', 3026, 2080, 3, 3027, 2082, 4),\n" +
            "(3375, 'SIC', 3576, 3900, 2, 3583, 3940, 3),\n" +
            "(3376, 'SIC', 4075, 7380, 3, 4076, 7381, 4),\n" +
            "(3377, 'SEC', 2623, 5600, 2, 2627, 5651, 4),\n" +
            "(3378, 'NAICS', 1631, 54119, 4, 1633, 541199, 5),\n" +
            "(3379, 'SIC', 4312, 60, 1, 3924, 6029, 4),\n" +
            "(3380, 'NAICS', 988, 42373, 4, 987, 423730, 5),\n" +
            "(3381, 'NAICS', 2167, 9231, 3, 2170, 923120, 5),\n" +
            "(3382, 'SEC', 2292, 2600, 2, 2293, 2610, 3),\n" +
            "(3383, 'SEC', 2240, 2000, 2, 2241, 2010, 3),\n" +
            "(3384, 'SIC', 3426, 3530, 3, 3429, 3533, 4),\n" +
            "(3385, 'SEC', 2458, 3700, 2, 2472, 3750, 3),\n" +
            "(3386, 'SEC', 2591, 5100, 2, 2601, 5171, 4),\n" +
            "(3387, 'NAICS', 156, 2123, 3, 161, 212319, 5),\n" +
            "(3388, 'NAICS', 1485, 522, 2, 1497, 52221, 4),\n" +
            "(3389, 'SEC', 2796, 70, 1, 2766, 8100, 2),\n" +
            "(3390, 'SIC', 3552, 3800, 2, 3557, 3822, 4),\n" +
            "(3391, 'SIC', 3083, 2300, 2, 3104, 2361, 4),\n" +
            "(3392, 'SEC', 2254, 2080, 3, 2256, 2086, 4),\n" +
            "(3393, 'NAICS', 1554, 525, 2, 1556, 525110, 5),\n" +
            "(3394, 'SEC', 2795, 60, 1, 2708, 6799, 4),\n" +
            "(3395, 'SIC', 3693, 4900, 2, 3700, 4925, 4),\n" +
            "(3396, 'SIC', 4309, 40, 1, 3667, 4700, 2),\n" +
            "(3397, 'NAICS', 1913, 6233, 3, 1914, 62331, 4),\n" +
            "(3398, 'NAICS', 1850, 62, 1, 1853, 62111, 4),\n" +
            "(3399, 'SEC', 2659, 6100, 2, 2664, 6150, 3),\n" +
            "(3400, 'NAICS', 975, 4236, 3, 977, 42361, 4),\n" +
            "(3401, 'SIC', 2955, 1700, 2, 2979, 1795, 4),\n" +
            "(3402, 'SIC', 2955, 1700, 2, 2978, 1794, 4),\n" +
            "(3403, 'SIC', 3434, 3540, 3, 3440, 3546, 4),\n" +
            "(3404, 'NAICS', 1015, 424, 2, 1076, 4249, 3),\n" +
            "(3405, 'SIC', 4308, 20, 1, 3026, 2080, 3),\n" +
            "(3406, 'SIC', 4308, 20, 1, 3190, 2700, 2),\n" +
            "(3407, 'SIC', 3215, 2810, 3, 3218, 2816, 4),\n" +
            "(3408, 'SEC', 2792, 40, 1, 2536, 4700, 2),\n" +
            "(3409, 'SIC', 3791, 5170, 3, 3793, 5172, 4),\n" +
            "(3410, 'SIC', 3050, 2200, 2, 3077, 2290, 3),\n" +
            "(3411, 'NAICS', 1946, 71111, 4, 1945, 711110, 5),\n" +
            "(3412, 'SEC', 2231, 1530, 3, 2232, 1531, 4),\n" +
            "(3413, 'SIC', 3419, 3500, 2, 3435, 3541, 4),\n" +
            "(3414, 'SEC', 2476, 3800, 2, 2495, 3851, 4),\n" +
            "(3415, 'SIC', 3108, 2380, 3, 3114, 2389, 4),\n" +
            "(3416, 'SIC', 3784, 5150, 3, 3787, 5159, 4),\n" +
            "(3417, 'NAICS', 1741, 5614, 3, 1754, 56149, 4),\n" +
            "(3418, 'NAICS', 2188, 926, 2, 2192, 926120, 5),\n" +
            "(3419, 'NAICS', 930, 42, 1, 938, 42313, 4),\n" +
            "(3420, 'NAICS', 930, 42, 1, 1063, 42461, 4),\n" +
            "(3421, 'SIC', 3468, 3580, 3, 3471, 3585, 4),\n" +
            "(3422, 'SIC', 3696, 4920, 3, 3698, 4923, 4),\n" +
            "(3423, 'NAICS', 1851, 621, 2, 1872, 621410, 5),\n" +
            "(3424, 'SEC', 2534, 4600, 2, 2535, 4610, 3),\n" +
            "(3425, 'SIC', 4307, 15, 1, 2954, 1629, 4),\n" +
            "(3426, 'NAICS', 2037, 81, 1, 2109, 813211, 5),\n" +
            "(3427, 'NAICS', 2071, 812, 2, 2093, 8129, 3),\n" +
            "(3428, 'SIC', 3409, 3490, 3, 3412, 3493, 4),\n" +
            "(3429, 'NAICS', 1591, 532, 2, 1603, 532230, 5),\n" +
            "(3430, 'NAICS', 56, 112, 2, 70, 11231, 4),\n" +
            "(3431, 'NAICS', 228, 23721, 4, 227, 237210, 5),\n" +
            "(3432, 'SIC', 3749, 5080, 3, 3751, 5083, 4),\n" +
            "(3433, 'NAICS', 1526, 5239, 3, 1528, 52391, 4),\n" +
            "(3434, 'SEC', 2355, 3200, 2, 2359, 3221, 4),\n" +
            "(3435, 'SIC', 3481, 3610, 3, 3483, 3613, 4),\n" +
            "(3436, 'SIC', 4308, 20, 1, 3410, 3491, 4),\n" +
            "(3437, 'NAICS', 1452, 517, 2, 1460, 517410, 5),\n" +
            "(3438, 'NAICS', 1625, 541, 2, 1664, 541490, 5),\n" +
            "(3439, 'SIC', 4310, 50, 1, 3781, 5147, 4),\n" +
            "(3440, 'SEC', 2791, 20, 1, 2379, 3341, 4),\n" +
            "(3441, 'NAICS', 1850, 62, 1, 1934, 624230, 5),\n" +
            "(3442, 'SEC', 2794, 52, 1, 2622, 5531, 4),\n" +
            "(3443, 'NAICS', 930, 42, 1, 1091, 425110, 5),\n" +
            "(3444, 'NAICS', 1402, 51, 1, 1479, 51919, 4),\n" +
            "(3445, 'NAICS', 1555, 5251, 3, 1558, 525120, 5),\n" +
            "(3446, 'NAICS', 1673, 54161, 4, 1674, 541611, 5),\n" +
            "(3447, 'NAICS', 205, 23, 1, 251, 238190, 5),\n" +
            "(3448, 'NAICS', 1980, 7131, 3, 1983, 713120, 5),\n" +
            "(3449, 'NAICS', 2137, 9211, 3, 2139, 92111, 4),\n" +
            "(3450, 'NAICS', 132, 21, 1, 161, 212319, 5),\n" +
            "(3451, 'NAICS', 1569, 53, 1, 1615, 532412, 5),\n" +
            "(3452, 'SEC', 2476, 3800, 2, 2491, 3843, 4),\n" +
            "(3453, 'NAICS', 1015, 424, 2, 1021, 424130, 5),\n" +
            "(3454, 'NAICS', 2071, 812, 2, 2080, 8122, 3),\n" +
            "(3455, 'SEC', 2791, 20, 1, 2403, 3500, 2),\n" +
            "(3456, 'NAICS', 98, 113, 2, 104, 11321, 4),\n" +
            "(3457, 'SEC', 2659, 6100, 2, 2660, 6110, 3),\n" +
            "(3458, 'SIC', 4313, 70, 1, 4071, 7376, 4),\n" +
            "(3459, 'NAICS', 1850, 62, 1, 1887, 62161, 4),\n" +
            "(3460, 'SIC', 3693, 4900, 2, 3707, 4950, 3),\n" +
            "(3461, 'NAICS', 1506, 5223, 3, 1507, 522310, 5),\n" +
            "(3462, 'SIC', 3164, 2590, 3, 3166, 2599, 4),\n" +
            "(3463, 'SIC', 3696, 4920, 3, 3699, 4924, 4),\n" +
            "(3464, 'NAICS', 182, 2211, 3, 191, 221118, 5),\n" +
            "(3465, 'NAICS', 1485, 522, 2, 1493, 522190, 5),\n" +
            "(3466, 'SIC', 4314, 90, 1, 4260, 9221, 4),\n" +
            "(3467, 'SIC', 3893, 5940, 3, 3894, 5941, 4),\n" +
            "(3468, 'SIC', 3886, 5900, 2, 3893, 5940, 3),\n" +
            "(3469, 'NAICS', 1625, 541, 2, 1637, 541213, 5),\n" +
            "(3470, 'NAICS', 1888, 6219, 3, 1891, 62199, 4),\n" +
            "(3471, 'NAICS', 1659, 54141, 4, 1658, 541410, 5),\n" +
            "(3472, 'SEC', 2238, 1730, 3, 2239, 1731, 4),\n" +
            "(3473, 'SEC', 2791, 20, 1, 2250, 2050, 3),\n" +
            "(3474, 'SIC', 3945, 6160, 3, 3947, 6163, 4),\n" +
            "(3475, 'NAICS', 1402, 51, 1, 1437, 51223, 4),\n" +
            "(3476, 'SEC', 2793, 50, 1, 2589, 5094, 4),\n" +
            "(3477, 'NAICS', 195, 2212, 3, 196, 221210, 5),\n" +
            "(3478, 'NAICS', 207, 2361, 3, 212, 236118, 5),\n" +
            "(3479, 'SIC', 3419, 3500, 2, 3459, 3568, 4),\n" +
            "(3480, 'SIC', 4309, 40, 1, 3671, 4729, 4),\n" +
            "(3481, 'NAICS', 1624, 54, 1, 1659, 54141, 4),\n" +
            "(3482, 'SIC', 4308, 20, 1, 3242, 2873, 4),\n" +
            "(3483, 'SIC', 4311, 52, 1, 3818, 5330, 3),\n" +
            "(3484, 'SIC', 4313, 70, 1, 4226, 8712, 4),\n" +
            "(3485, 'NAICS', 1850, 62, 1, 1919, 62399, 4),\n" +
            "(3486, 'NAICS', 23, 1113, 3, 31, 111333, 5),\n" +
            "(3487, 'NAICS', 946, 4233, 3, 954, 42339, 4),\n" +
            "(3488, 'NAICS', 2135, 92, 1, 2185, 92511, 4),\n" +
            "(3489, 'SIC', 3576, 3900, 2, 3591, 3955, 4),\n" +
            "(3490, 'SEC', 2618, 5410, 3, 4319, 5412, 4),\n" +
            "(3491, 'SIC', 4308, 20, 1, 3408, 3489, 4),\n" +
            "(3492, 'SIC', 4305, 1, 1, 2826, 210, 3),\n" +
            "(3493, 'NAICS', 235, 238, 2, 274, 238910, 5),\n" +
            "(3494, 'NAICS', 2103, 813, 2, 2108, 81321, 4),\n" +
            "(3495, 'NAICS', 1965, 71141, 4, 1964, 711410, 5),\n" +
            "(3496, 'NAICS', 2037, 81, 1, 2072, 8121, 3),\n" +
            "(3497, 'NAICS', 1726, 561, 2, 1769, 561612, 5),\n" +
            "(3498, 'SEC', 2605, 5200, 2, 2608, 5270, 3),\n" +
            "(3499, 'NAICS', 1076, 4249, 3, 1081, 424930, 5),\n" +
            "(3500, 'NAICS', 1798, 5622, 3, 1803, 562219, 5),\n" +
            "(3501, 'SIC', 3077, 2290, 3, 3078, 2295, 4),\n" +
            "(3502, 'NAICS', 1726, 561, 2, 1778, 56172, 4),\n" +
            "(3503, 'SIC', 3050, 2200, 2, 3059, 2250, 3),\n" +
            "(3504, 'NAICS', 98, 113, 2, 100, 113110, 5),\n" +
            "(3505, 'SEC', 2458, 3700, 2, 2470, 3740, 3),\n" +
            "(3506, 'SIC', 3595, 3990, 3, 3597, 3993, 4),\n" +
            "(3507, 'NAICS', 1015, 424, 2, 1079, 424920, 5),\n" +
            "(3508, 'SIC', 3380, 3430, 3, 3383, 3433, 4),\n" +
            "(3509, 'NAICS', 1672, 5416, 3, 1678, 541618, 5),\n" +
            "(3510, 'NAICS', 1813, 611, 2, 1818, 611210, 5),\n" +
            "(3511, 'SEC', 2791, 20, 1, 2386, 3411, 4),\n" +
            "(3512, 'SEC', 2591, 5100, 2, 2596, 5140, 3),\n" +
            "(3513, 'NAICS', 1624, 54, 1, 1680, 54162, 4),\n" +
            "(3514, 'SEC', 2791, 20, 1, 2469, 3730, 3),\n" +
            "(3515, 'NAICS', 205, 23, 1, 276, 238990, 5),\n" +
            "(3516, 'SEC', 2774, 8700, 2, 2776, 8711, 4),\n" +
            "(3517, 'SIC', 2982, 2000, 2, 3007, 2048, 4),\n" +
            "(3518, 'NAICS', 1625, 541, 2, 1689, 5418, 3),\n" +
            "(3519, 'SEC', 2342, 3000, 2, 2345, 3020, 3),\n" +
            "(3520, 'NAICS', 1718, 55, 1, 1722, 551111, 5),\n" +
            "(3521, 'SIC', 2825, 200, 2, 2842, 272, 4),\n" +
            "(3522, 'NAICS', 132, 21, 1, 176, 213112, 5),\n" +
            "(3523, 'NAICS', 1726, 561, 2, 1738, 56132, 4),\n" +
            "(3524, 'SEC', 2791, 20, 1, 2347, 3050, 3),\n" +
            "(3525, 'SIC', 4313, 70, 1, 4227, 8713, 4),\n" +
            "(3526, 'NAICS', 1090, 4251, 3, 1093, 425120, 5),\n" +
            "(3527, 'NAICS', 2003, 72, 1, 2015, 721211, 5),\n" +
            "(3528, 'SIC', 2825, 200, 2, 2828, 212, 4),\n" +
            "(3529, 'SEC', 2791, 20, 1, 2429, 3578, 4),\n" +
            "(3530, 'SEC', 2568, 5000, 2, 2580, 5063, 4),\n" +
            "(3531, 'NAICS', 930, 42, 1, 987, 423730, 5),\n" +
            "(3532, 'NAICS', 1942, 71, 1, 1981, 713110, 5),\n" +
            "(3533, 'SEC', 2795, 60, 1, 2685, 6350, 3),\n" +
            "(3534, 'SIC', 3083, 2300, 2, 3096, 2337, 4),\n" +
            "(3535, 'SIC', 3419, 3500, 2, 3457, 3566, 4),\n" +
            "(3536, 'SIC', 3948, 6200, 2, 3949, 6210, 3),\n" +
            "(3537, 'SEC', 2751, 7990, 3, 2752, 7997, 4),\n" +
            "(3538, 'SIC', 4313, 70, 1, 4032, 7241, 4),\n" +
            "(3539, 'SIC', 4146, 8000, 2, 4148, 8011, 4),\n" +
            "(3540, 'NAICS', 235, 238, 2, 264, 23832, 4),\n" +
            "(3541, 'NAICS', 1076, 4249, 3, 1078, 42491, 4),\n" +
            "(3542, 'SIC', 4308, 20, 1, 3086, 2320, 3),\n" +
            "(3543, 'SIC', 4308, 20, 1, 3335, 3297, 4),\n" +
            "(3544, 'SIC', 4314, 90, 1, 4269, 9410, 3),\n" +
            "(3545, 'SIC', 4308, 20, 1, 3510, 3669, 4),\n" +
            "(3546, 'SIC', 3426, 3530, 3, 3433, 3537, 4),\n" +
            "(3547, 'SIC', 3083, 2300, 2, 3107, 2371, 4),\n" +
            "(3548, 'SIC', 3552, 3800, 2, 3568, 3844, 4),\n" +
            "(3549, 'SIC', 4308, 20, 1, 3371, 3400, 2),\n" +
            "(3550, 'NAICS', 1812, 61, 1, 1813, 611, 2),\n" +
            "(3551, 'NAICS', 1726, 561, 2, 1753, 56145, 4),\n" +
            "(3552, 'SIC', 2884, 1000, 2, 2890, 1031, 4),\n" +
            "(3553, 'NAICS', 1480, 52, 1, 1549, 52421, 4),\n" +
            "(3554, 'SIC', 3526, 3700, 2, 3532, 3716, 4),\n" +
            "(3555, 'NAICS', 81, 11241, 4, 80, 112410, 5),\n" +
            "(3556, 'NAICS', 132, 21, 1, 166, 212325, 5),\n" +
            "(3557, 'NAICS', 138, 212, 2, 157, 21231, 4),\n" +
            "(3558, 'SIC', 3214, 2800, 2, 3233, 2843, 4),\n" +
            "(3559, 'SIC', 4309, 40, 1, 3670, 4725, 4),\n" +
            "(3560, 'NAICS', 997, 42383, 4, 996, 423830, 5),\n" +
            "(3561, 'SIC', 3958, 6300, 2, 3972, 6390, 3),\n" +
            "(3562, 'SIC', 3917, 6000, 2, 3930, 6062, 4),\n" +
            "(3563, 'NAICS', 1403, 511, 2, 1409, 511130, 5),\n" +
            "(3564, 'SIC', 3330, 3290, 3, 3332, 3292, 4),\n" +
            "(3565, 'NAICS', 1536, 524, 2, 1548, 524210, 5),\n" +
            "(3566, 'SEC', 2795, 60, 1, 2669, 6163, 4),\n" +
            "(3567, 'SIC', 3124, 2400, 2, 3146, 2493, 4),\n" +
            "(3568, 'SEC', 2713, 7300, 2, 2728, 7373, 4),\n" +
            "(3569, 'SIC', 3083, 2300, 2, 3087, 2321, 4),\n" +
            "(3570, 'SIC', 3033, 2090, 3, 3038, 2097, 4),\n" +
            "(3571, 'NAICS', 1726, 561, 2, 1730, 5612, 3),\n" +
            "(3572, 'SIC', 3548, 3790, 3, 3551, 3799, 4),\n" +
            "(3573, 'SIC', 4209, 8610, 3, 4210, 8611, 4),\n" +
            "(3574, 'NAICS', 206, 236, 2, 212, 236118, 5),\n" +
            "(3575, 'NAICS', 1, 11, 1, 12, 111150, 5),\n" +
            "(3576, 'SIC', 3655, 4510, 3, 3657, 4513, 4),\n" +
            "(3577, 'NAICS', 1625, 541, 2, 1700, 541860, 5),\n" +
            "(3578, 'SIC', 4313, 70, 1, 4087, 7520, 3),\n" +
            "(3579, 'NAICS', 2204, 928, 2, 2208, 928120, 5),\n" +
            "(3580, 'SEC', 2753, 8000, 2, 2760, 8070, 3),\n" +
            "(3581, 'NAICS', 1420, 5121, 3, 1428, 51219, 4),\n" +
            "(3582, 'SEC', 2791, 20, 1, 2367, 3272, 4),\n" +
            "(3583, 'SIC', 4306, 10, 1, 2907, 1240, 3),\n" +
            "(3584, 'SIC', 3886, 5900, 2, 3908, 5983, 4),\n" +
            "(3585, 'NAICS', 931, 423, 2, 956, 423410, 5),\n" +
            "(3586, 'NAICS', 1625, 541, 2, 1661, 54142, 4),\n" +
            "(3587, 'SIC', 3481, 3610, 3, 3482, 3612, 4),\n" +
            "(3588, 'SIC', 4313, 70, 1, 4110, 7692, 4),\n" +
            "(3589, 'SIC', 3392, 3450, 3, 3394, 3452, 4),\n" +
            "(3590, 'SIC', 4308, 20, 1, 3045, 2121, 4),\n" +
            "(3591, 'NAICS', 2132, 8141, 3, 2134, 81411, 4),\n" +
            "(3592, 'SEC', 2283, 2500, 2, 2286, 2520, 3),\n" +
            "(3593, 'SIC', 4178, 8200, 2, 4186, 8240, 3),\n" +
            "(3594, 'SEC', 2791, 20, 1, 2284, 2510, 3),\n" +
            "(3595, 'NAICS', 1, 11, 1, 65, 1122, 3),\n" +
            "(3596, 'NAICS', 2124, 81392, 4, 2123, 813920, 5),\n" +
            "(3597, 'NAICS', 2176, 924, 2, 2177, 9241, 3),\n" +
            "(3598, 'SEC', 2526, 4500, 2, 2532, 4580, 3),\n" +
            "(3599, 'SIC', 4311, 52, 1, 3839, 5511, 4),\n" +
            "(3600, 'SIC', 4308, 20, 1, 3564, 3840, 3),\n" +
            "(3601, 'SIC', 4223, 8700, 2, 4237, 8742, 4),\n" +
            "(3602, 'SIC', 4017, 7200, 2, 4030, 7231, 4),\n" +
            "(3603, 'NAICS', 1904, 623, 2, 1907, 62311, 4),\n" +
            "(3604, 'NAICS', 2135, 92, 1, 2184, 925110, 5),\n" +
            "(3605, 'SIC', 4146, 8000, 2, 4159, 8051, 4),\n" +
            "(3606, 'SIC', 4312, 60, 1, 3937, 6100, 2),\n" +
            "(3607, 'NAICS', 2135, 92, 1, 2203, 92711, 4),\n" +
            "(3608, 'NAICS', 931, 423, 2, 1001, 42385, 4),\n" +
            "(3609, 'NAICS', 117, 115, 2, 126, 1152, 3),\n" +
            "(3610, 'NAICS', 1625, 541, 2, 1686, 541712, 5),\n" +
            "(3611, 'NAICS', 1734, 56131, 4, 1735, 561311, 5),\n" +
            "(3612, 'SIC', 3083, 2300, 2, 3123, 2399, 4),\n" +
            "(3613, 'SEC', 2302, 2700, 2, 2304, 2711, 4),\n" +
            "(3614, 'NAICS', 1904, 623, 2, 1908, 6232, 3),\n" +
            "(3615, 'SIC', 4308, 20, 1, 3300, 3199, 4),\n" +
            "(3616, 'SIC', 3419, 3500, 2, 3426, 3530, 3),\n" +
            "(3617, 'SIC', 3264, 3020, 3, 3265, 3021, 4),\n" +
            "(3618, 'NAICS', 1, 11, 1, 31, 111333, 5),\n" +
            "(3619, 'SIC', 4308, 20, 1, 3229, 2836, 4),\n" +
            "(3620, 'SIC', 4313, 70, 1, 4224, 8710, 3),\n" +
            "(3621, 'NAICS', 68, 1123, 3, 76, 11234, 4),\n" +
            "(3622, 'NAICS', 47, 11192, 4, 46, 111920, 5),\n" +
            "(3623, 'NAICS', 1640, 5413, 3, 1647, 541340, 5),\n" +
            "(3624, 'NAICS', 2166, 923, 2, 2171, 92312, 4),\n" +
            "(3625, 'NAICS', 1584, 53131, 4, 1585, 531311, 5),\n" +
            "(3626, 'NAICS', 1725, 56, 1, 1755, 561491, 5),\n" +
            "(3627, 'NAICS', 1920, 624, 2, 1932, 624221, 5),\n" +
            "(3628, 'SEC', 2293, 2610, 3, 2294, 2611, 4),\n" +
            "(3629, 'SEC', 2500, 3900, 2, 2501, 3910, 3),\n" +
            "(3630, 'NAICS', 1625, 541, 2, 1650, 54135, 4),\n" +
            "(3631, 'NAICS', 1625, 541, 2, 1655, 541380, 5),\n" +
            "(3632, 'SEC', 2247, 2030, 3, 2248, 2033, 4),\n" +
            "(3633, 'SIC', 3715, 5000, 2, 3754, 5087, 4),\n" +
            "(3634, 'NAICS', 218, 237, 2, 219, 2371, 3),\n" +
            "(3635, 'SEC', 2796, 70, 1, 2713, 7300, 2),\n" +
            "(3636, 'SIC', 4309, 40, 1, 3609, 4120, 3),\n" +
            "(3637, 'SIC', 3526, 3700, 2, 3551, 3799, 4),\n" +
            "(3638, 'SIC', 3371, 3400, 2, 3385, 3441, 4),\n" +
            "(3639, 'NAICS', 2037, 81, 1, 2054, 811211, 5),\n" +
            "(3640, 'SIC', 3716, 5010, 3, 3719, 5014, 4),\n" +
            "(3641, 'SIC', 3576, 3900, 2, 3597, 3993, 4),\n" +
            "(3642, 'NAICS', 1402, 51, 1, 1405, 511110, 5),\n" +
            "(3643, 'SIC', 4306, 10, 1, 2916, 1382, 4),\n" +
            "(3644, 'SIC', 4308, 20, 1, 3560, 3825, 4),\n" +
            "(3645, 'NAICS', 979, 42362, 4, 978, 423620, 5),\n" +
            "(3646, 'NAICS', 1921, 6241, 3, 1925, 62412, 4),\n" +
            "(3647, 'NAICS', 2037, 81, 1, 2096, 81292, 4),\n" +
            "(3648, 'NAICS', 1570, 531, 2, 1584, 53131, 4),\n" +
            "(3649, 'NAICS', 946, 4233, 3, 949, 423320, 5),\n" +
            "(3650, 'SEC', 2791, 20, 1, 2298, 2631, 4),\n" +
            "(3651, 'SIC', 3262, 3010, 3, 3263, 3011, 4),\n" +
            "(3652, 'SEC', 2342, 3000, 2, 2350, 3081, 4),\n" +
            "(3653, 'NAICS', 1598, 5322, 3, 1604, 53223, 4),\n" +
            "(3654, 'SIC', 3680, 4800, 2, 3690, 4841, 4),\n" +
            "(3655, 'NAICS', 1035, 4244, 3, 1051, 42448, 4),\n" +
            "(3656, 'NAICS', 1823, 6114, 3, 1825, 61141, 4),\n" +
            "(3657, 'SIC', 4314, 90, 1, 4286, 9611, 4),\n" +
            "(3658, 'SIC', 4308, 20, 1, 3191, 2710, 3),\n" +
            "(3659, 'SIC', 4146, 8000, 2, 4147, 8010, 3),\n" +
            "(3660, 'NAICS', 955, 4234, 3, 968, 423490, 5),\n" +
            "(3661, 'NAICS', 1904, 623, 2, 1909, 623210, 5),\n" +
            "(3662, 'NAICS', 1970, 7121, 3, 1971, 712110, 5),\n" +
            "(3663, 'NAICS', 1, 11, 1, 68, 1123, 3),\n" +
            "(3664, 'NAICS', 1726, 561, 2, 1767, 56161, 4),\n" +
            "(3665, 'NAICS', 1495, 5222, 3, 1500, 52229, 4),\n" +
            "(3666, 'NAICS', 2071, 812, 2, 2087, 81231, 4),\n" +
            "(3667, 'SIC', 4306, 10, 1, 2930, 1459, 4),\n" +
            "(3668, 'SIC', 4306, 10, 1, 2895, 1061, 4),\n" +
            "(3669, 'NAICS', 1715, 54194, 4, 1714, 541940, 5),\n" +
            "(3670, 'SEC', 2403, 3500, 2, 2429, 3578, 4),\n" +
            "(3671, 'SIC', 3544, 3760, 3, 3545, 3761, 4),\n" +
            "(3672, 'SIC', 4305, 1, 1, 2862, 761, 4),\n" +
            "(3673, 'NAICS', 133, 211, 2, 135, 21111, 4),\n" +
            "(3674, 'SIC', 4314, 90, 1, 4266, 9310, 3),\n" +
            "(3675, 'SEC', 2796, 70, 1, 2712, 7200, 2),\n" +
            "(3676, 'SIC', 4223, 8700, 2, 4239, 8744, 4),\n" +
            "(3677, 'NAICS', 1404, 5111, 3, 1408, 51112, 4),\n" +
            "(3678, 'NAICS', 930, 42, 1, 1017, 424110, 5),\n" +
            "(3679, 'SEC', 2704, 6790, 3, 2706, 6794, 4),\n" +
            "(3680, 'SIC', 4308, 20, 1, 3054, 2221, 4),\n" +
            "(3681, 'SIC', 3395, 3460, 3, 3396, 3462, 4),\n" +
            "(3682, 'NAICS', 1689, 5418, 3, 1700, 541860, 5),\n" +
            "(3683, 'SIC', 4308, 20, 1, 3128, 2421, 4),\n" +
            "(3684, 'SIC', 4307, 15, 1, 2951, 1620, 3),\n" +
            "(3685, 'SIC', 2826, 210, 3, 2827, 211, 4),\n" +
            "(3686, 'NAICS', 991, 4238, 3, 1000, 423850, 5),\n" +
            "(3687, 'NAICS', 43, 1119, 3, 48, 111930, 5),\n" +
            "(3688, 'SIC', 2847, 700, 2, 2849, 711, 4),\n" +
            "(3689, 'SIC', 3576, 3900, 2, 3578, 3911, 4),\n" +
            "(3690, 'SIC', 3451, 3560, 3, 3454, 3563, 4),\n" +
            "(3691, 'NAICS', 1569, 53, 1, 1610, 532310, 5),\n" +
            "(3692, 'NAICS', 1813, 611, 2, 1845, 611692, 5),\n" +
            "(3693, 'NAICS', 936, 42312, 4, 935, 423120, 5),\n" +
            "(3694, 'NAICS', 1570, 531, 2, 1573, 53111, 4),\n" +
            "(3695, 'NAICS', 1706, 5419, 3, 1713, 54193, 4),\n" +
            "(3696, 'SIC', 3190, 2700, 2, 3191, 2710, 3),\n" +
            "(3697, 'SIC', 3583, 3940, 3, 3586, 3949, 4),\n" +
            "(3698, 'SIC', 3167, 2600, 2, 3179, 2657, 4),\n" +
            "(3699, 'NAICS', 972, 42351, 4, 971, 423510, 5),\n" +
            "(3700, 'SIC', 4308, 20, 1, 3115, 2390, 3),\n" +
            "(3701, 'SIC', 3837, 5500, 2, 3841, 5521, 4),\n" +
            "(3702, 'NAICS', 2037, 81, 1, 2056, 811213, 5),\n" +
            "(3703, 'NAICS', 930, 42, 1, 1073, 42481, 4),\n" +
            "(3704, 'SIC', 3636, 4400, 2, 3641, 4430, 3),\n" +
            "(3705, 'SIC', 2813, 170, 3, 2815, 172, 4),\n" +
            "(3706, 'NAICS', 2, 111, 2, 46, 111920, 5),\n" +
            "(3707, 'NAICS', 219, 2371, 3, 222, 237120, 5),\n" +
            "(3708, 'NAICS', 1061, 4246, 3, 1065, 42469, 4),\n" +
            "(3709, 'NAICS', 1598, 5322, 3, 1608, 532299, 5),\n" +
            "(3710, 'NAICS', 931, 423, 2, 980, 423690, 5),\n" +
            "(3711, 'SEC', 2623, 5600, 2, 2625, 5621, 4),\n" +
            "(3712, 'SIC', 4308, 20, 1, 3445, 3552, 4),\n" +
            "(3713, 'NAICS', 1726, 561, 2, 1750, 561440, 5),\n" +
            "(3714, 'SIC', 3620, 4200, 2, 3626, 4220, 3),\n" +
            "(3715, 'SIC', 3861, 5640, 3, 3862, 5641, 4),\n" +
            "(3716, 'NAICS', 1591, 532, 2, 1617, 53242, 4),\n" +
            "(3717, 'SEC', 4317, 4990, 2, 4318, 4991, 3),\n" +
            "(3718, 'SEC', 2540, 4810, 3, 2541, 4812, 4),\n" +
            "(3719, 'NAICS', 1895, 6221, 3, 1897, 62211, 4),\n" +
            "(3720, 'NAICS', 180, 22, 1, 189, 221116, 5),\n" +
            "(3721, 'NAICS', 1850, 62, 1, 1912, 62322, 4),\n" +
            "(3722, 'SIC', 3576, 3900, 2, 3585, 3944, 4),\n" +
            "(3723, 'SIC', 4065, 7370, 3, 4069, 7374, 4),\n" +
            "(3724, 'NAICS', 930, 42, 1, 1029, 424320, 5),\n" +
            "(3725, 'NAICS', 1725, 56, 1, 1808, 56292, 4),\n" +
            "(3726, 'SIC', 2982, 2000, 2, 2986, 2015, 4),\n" +
            "(3727, 'NAICS', 1725, 56, 1, 1764, 561591, 5),\n" +
            "(3728, 'NAICS', 2037, 81, 1, 2038, 811, 2),\n" +
            "(3729, 'NAICS', 2135, 92, 1, 2186, 925120, 5),\n" +
            "(3730, 'SIC', 3225, 2830, 3, 3227, 2834, 4),\n" +
            "(3731, 'NAICS', 1718, 55, 1, 1724, 551114, 5),\n" +
            "(3732, 'NAICS', 110, 11411, 4, 113, 114119, 5),\n" +
            "(3733, 'NAICS', 930, 42, 1, 1076, 4249, 3),\n" +
            "(3734, 'SIC', 4153, 8040, 3, 4157, 8049, 4),\n" +
            "(3735, 'SIC', 2805, 130, 3, 2806, 131, 4),\n" +
            "(3736, 'SEC', 2791, 20, 1, 2330, 2844, 4),\n" +
            "(3737, 'NAICS', 1640, 5413, 3, 1656, 54138, 4),\n" +
            "(3738, 'NAICS', 1894, 622, 2, 1902, 622310, 5),\n" +
            "(3739, 'SIC', 4308, 20, 1, 3381, 3431, 4),\n" +
            "(3740, 'NAICS', 1672, 5416, 3, 1681, 541690, 5),\n" +
            "(3741, 'SIC', 3083, 2300, 2, 3106, 2370, 3),\n" +
            "(3742, 'SIC', 3552, 3800, 2, 3571, 3851, 4),\n" +
            "(3743, 'SIC', 3667, 4700, 2, 3679, 4789, 4),\n" +
            "(3744, 'SIC', 3869, 5700, 2, 3878, 5731, 4),\n" +
            "(3745, 'SIC', 4305, 1, 1, 2799, 110, 3),\n" +
            "(3746, 'NAICS', 930, 42, 1, 931, 423, 2),\n" +
            "(3747, 'NAICS', 1015, 424, 2, 1063, 42461, 4),\n" +
            "(3748, 'SIC', 4308, 20, 1, 3482, 3612, 4),\n" +
            "(3749, 'SEC', 2438, 3620, 3, 2439, 3621, 4),\n" +
            "(3750, 'NAICS', 1403, 511, 2, 1406, 51111, 4),\n" +
            "(3751, 'NAICS', 1580, 5312, 3, 1582, 53121, 4),\n" +
            "(3752, 'SIC', 3511, 3670, 3, 3519, 3679, 4),\n" +
            "(3753, 'SIC', 4081, 7500, 2, 4086, 7519, 4),\n" +
            "(3754, 'NAICS', 2189, 9261, 3, 2199, 92615, 4),\n" +
            "(3755, 'SEC', 2791, 20, 1, 2314, 2761, 4),\n" +
            "(3756, 'NAICS', 1480, 52, 1, 1543, 524127, 5),\n" +
            "(3757, 'SIC', 3083, 2300, 2, 3094, 2331, 4),\n" +
            "(3758, 'SIC', 4308, 20, 1, 3142, 2451, 4),\n" +
            "(3759, 'SIC', 4040, 7300, 2, 4058, 7350, 3),\n" +
            "(3760, 'NAICS', 213, 2362, 3, 216, 236220, 5),\n" +
            "(3761, 'SIC', 4308, 20, 1, 3071, 2270, 3),\n" +
            "(3762, 'NAICS', 235, 238, 2, 254, 238210, 5),\n" +
            "(3763, 'SEC', 2218, 1200, 2, 2219, 1220, 3),\n" +
            "(3764, 'SEC', 2403, 3500, 2, 2432, 3585, 4),\n" +
            "(3765, 'SIC', 4306, 10, 1, 2934, 1479, 4),\n" +
            "(3766, 'NAICS', 1733, 5613, 3, 1738, 56132, 4),\n" +
            "(3767, 'NAICS', 1035, 4244, 3, 1049, 42447, 4),\n" +
            "(3768, 'SEC', 2792, 40, 1, 2522, 4231, 4),\n" +
            "(3769, 'SIC', 3050, 2200, 2, 3076, 2284, 4),\n" +
            "(3770, 'NAICS', 1657, 5414, 3, 1660, 541420, 5),\n" +
            "(3771, 'NAICS', 236, 2381, 3, 239, 238120, 5),\n" +
            "(3772, 'SIC', 4313, 70, 1, 4118, 7822, 4),\n" +
            "(3773, 'SIC', 3574, 3870, 3, 3575, 3873, 4),\n" +
            "(3774, 'SIC', 4195, 8330, 3, 4196, 8331, 4),\n" +
            "(3775, 'SIC', 3083, 2300, 2, 3084, 2310, 3),\n" +
            "(3776, 'NAICS', 197, 22121, 4, 196, 221210, 5),\n" +
            "(3777, 'SIC', 3918, 6010, 3, 3920, 6019, 4),\n" +
            "(3778, 'SIC', 4146, 8000, 2, 4156, 8043, 4),\n" +
            "(3779, 'NAICS', 1683, 5417, 3, 1685, 541711, 5),\n" +
            "(3780, 'NAICS', 205, 23, 1, 215, 23621, 4),\n" +
            "(3781, 'SIC', 4308, 20, 1, 3204, 2760, 3),\n" +
            "(3782, 'SIC', 3371, 3400, 2, 3377, 3423, 4),\n" +
            "(3783, 'SIC', 3480, 3600, 2, 3485, 3621, 4),\n" +
            "(3784, 'NAICS', 102, 1132, 3, 103, 113210, 5),\n" +
            "(3785, 'SIC', 4307, 15, 1, 2943, 1530, 3),\n" +
            "(3786, 'SIC', 4309, 40, 1, 3618, 4170, 3),\n" +
            "(3787, 'SIC', 4309, 40, 1, 3712, 4961, 4),\n" +
            "(3788, 'NAICS', 1584, 53131, 4, 1586, 531312, 5),\n" +
            "(3789, 'NAICS', 2093, 8129, 3, 2095, 81291, 4),\n" +
            "(3790, 'SIC', 4146, 8000, 2, 4162, 8060, 3),\n" +
            "(3791, 'SIC', 4313, 70, 1, 4185, 8231, 4),\n" +
            "(3792, 'NAICS', 235, 238, 2, 252, 23819, 4),\n" +
            "(3793, 'SEC', 2675, 6280, 3, 2676, 6282, 4),\n" +
            "(3794, 'NAICS', 76, 11234, 4, 75, 112340, 5),\n" +
            "(3795, 'SIC', 3595, 3990, 3, 3596, 3991, 4),\n" +
            "(3796, 'NAICS', 205, 23, 1, 241, 238130, 5),\n" +
            "(3797, 'SIC', 4308, 20, 1, 3319, 3263, 4),\n" +
            "(3798, 'SIC', 2955, 1700, 2, 2961, 1731, 4),\n" +
            "(3799, 'SIC', 4308, 20, 1, 3367, 3369, 4),\n" +
            "(3800, 'SIC', 2939, 1500, 2, 2942, 1522, 4),\n" +
            "(3801, 'SIC', 4309, 40, 1, 3680, 4800, 2),\n" +
            "(3802, 'NAICS', 1813, 611, 2, 1819, 61121, 4),\n" +
            "(3803, 'SEC', 2302, 2700, 2, 2308, 2731, 4),\n" +
            "(3804, 'NAICS', 1094, 42512, 4, 1093, 425120, 5),\n" +
            "(3805, 'SEC', 2792, 40, 1, 2521, 4230, 3),\n" +
            "(3806, 'SIC', 3419, 3500, 2, 3470, 3582, 4),\n" +
            "(3807, 'NAICS', 1402, 51, 1, 1427, 512132, 5),\n" +
            "(3808, 'NAICS', 2103, 813, 2, 2130, 81399, 4),\n" +
            "(3809, 'SEC', 2792, 40, 1, 2542, 4813, 4),\n" +
            "(3810, 'SIC', 3903, 5960, 3, 3905, 5962, 4),\n" +
            "(3811, 'NAICS', 1804, 5629, 3, 1811, 562998, 5),\n" +
            "(3812, 'NAICS', 2103, 813, 2, 2114, 813311, 5),\n" +
            "(3813, 'NAICS', 1813, 611, 2, 1841, 611630, 5),\n" +
            "(3814, 'NAICS', 128, 11521, 4, 127, 115210, 5),\n" +
            "(3815, 'NAICS', 1480, 52, 1, 1487, 522110, 5),\n" +
            "(3816, 'SIC', 4308, 20, 1, 3358, 3354, 4),\n" +
            "(3817, 'NAICS', 1015, 424, 2, 1083, 424940, 5);\n";
    static String industryCodeInsert18 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(3818, 'NAICS', 1403, 511, 2, 1413, 51119, 4),\n" +
            "(3819, 'NAICS', 181, 221, 2, 188, 221115, 5),\n" +
            "(3820, 'SIC', 3756, 5090, 3, 3758, 5092, 4),\n" +
            "(3821, 'SIC', 4312, 60, 1, 3948, 6200, 2),\n" +
            "(3822, 'SIC', 3190, 2700, 2, 3204, 2760, 3),\n" +
            "(3823, 'SIC', 3577, 3910, 3, 3579, 3914, 4),\n" +
            "(3824, 'SIC', 4308, 20, 1, 3483, 3613, 4),\n" +
            "(3825, 'NAICS', 119, 11511, 4, 123, 115114, 5),\n" +
            "(3826, 'SIC', 4007, 7000, 2, 4013, 7032, 4),\n" +
            "(3827, 'SEC', 2794, 52, 1, 2648, 5990, 3),\n" +
            "(3828, 'SIC', 4312, 60, 1, 3942, 6150, 3),\n" +
            "(3829, 'SEC', 2791, 20, 1, 2356, 3210, 3),\n" +
            "(3830, 'SIC', 4312, 60, 1, 3926, 6035, 4),\n" +
            "(3831, 'SEC', 2795, 60, 1, 2665, 6153, 4),\n" +
            "(3832, 'SIC', 4308, 20, 1, 3404, 3480, 3),\n" +
            "(3833, 'NAICS', 1747, 56143, 4, 1748, 561431, 5),\n" +
            "(3834, 'NAICS', 1985, 7132, 3, 1989, 71329, 4),\n" +
            "(3835, 'NAICS', 2003, 72, 1, 2009, 72112, 4),\n" +
            "(3836, 'SEC', 2424, 3570, 3, 4315, 3576, 4),\n" +
            "(3837, 'SIC', 4311, 52, 1, 3881, 5736, 4),\n" +
            "(3838, 'SIC', 4313, 70, 1, 4079, 7384, 4),\n" +
            "(3839, 'SIC', 3287, 3140, 3, 3290, 3144, 4),\n" +
            "(3840, 'SIC', 4314, 90, 1, 4274, 9441, 4),\n" +
            "(3841, 'SIC', 4313, 70, 1, 4125, 7900, 2),\n" +
            "(3842, 'NAICS', 1799, 56221, 4, 1803, 562219, 5),\n" +
            "(3843, 'NAICS', 79, 1124, 3, 81, 11241, 4),\n" +
            "(3844, 'SIC', 4146, 8000, 2, 4161, 8059, 4),\n" +
            "(3845, 'SIC', 4311, 52, 1, 3891, 5930, 3),\n" +
            "(3846, 'SIC', 3214, 2800, 2, 3217, 2813, 4),\n" +
            "(3847, 'SIC', 3972, 6390, 3, 3973, 6399, 4),\n" +
            "(3848, 'SIC', 4247, 9100, 2, 4253, 9131, 4),\n" +
            "(3849, 'NAICS', 1569, 53, 1, 1581, 531210, 5),\n" +
            "(3850, 'SIC', 3401, 3470, 3, 3403, 3479, 4),\n" +
            "(3851, 'SIC', 4305, 1, 1, 2840, 270, 3),\n" +
            "(3852, 'SIC', 4309, 40, 1, 3634, 4310, 3),\n" +
            "(3853, 'NAICS', 1554, 525, 2, 1555, 5251, 3),\n" +
            "(3854, 'NAICS', 2037, 81, 1, 2045, 81112, 4),\n" +
            "(3855, 'SIC', 4062, 7360, 3, 4063, 7361, 4),\n" +
            "(3856, 'NAICS', 156, 2123, 3, 157, 21231, 4),\n" +
            "(3857, 'NAICS', 1725, 56, 1, 1805, 562910, 5),\n" +
            "(3858, 'SEC', 2221, 1300, 2, 2222, 1310, 3),\n" +
            "(3859, 'SIC', 3026, 2080, 3, 3028, 2083, 4),\n" +
            "(3860, 'SEC', 2574, 5040, 3, 2575, 5045, 4),\n" +
            "(3861, 'NAICS', 1625, 541, 2, 1654, 54137, 4),\n" +
            "(3862, 'SEC', 2552, 4900, 2, 2565, 4953, 4),\n" +
            "(3863, 'SIC', 3869, 5700, 2, 3879, 5734, 4),\n" +
            "(3864, 'NAICS', 1794, 56211, 4, 1797, 562119, 5),\n" +
            "(3865, 'SIC', 3419, 3500, 2, 3465, 3577, 4),\n" +
            "(3866, 'NAICS', 219, 2371, 3, 220, 237110, 5),\n" +
            "(3867, 'NAICS', 1402, 51, 1, 1462, 5179, 3),\n" +
            "(3868, 'SIC', 3680, 4800, 2, 3682, 4812, 4),\n" +
            "(3869, 'SEC', 2488, 3840, 3, 2492, 3844, 4),\n" +
            "(3870, 'NAICS', 1063, 42461, 4, 1062, 424610, 5),\n" +
            "(3871, 'SIC', 4308, 20, 1, 3239, 2865, 4),\n" +
            "(3872, 'SIC', 4313, 70, 1, 4139, 7990, 3),\n" +
            "(3873, 'NAICS', 931, 423, 2, 965, 42345, 4),\n" +
            "(3874, 'SIC', 3938, 6110, 3, 3939, 6111, 4),\n" +
            "(3875, 'NAICS', 930, 42, 1, 1000, 423850, 5),\n" +
            "(3876, 'NAICS', 1569, 53, 1, 1577, 53113, 4),\n" +
            "(3877, 'SIC', 4309, 40, 1, 3711, 4960, 3),\n" +
            "(3878, 'SIC', 4308, 20, 1, 3519, 3679, 4),\n" +
            "(3879, 'NAICS', 1591, 532, 2, 1594, 532111, 5),\n" +
            "(3880, 'SIC', 3375, 3420, 3, 3378, 3425, 4),\n" +
            "(3881, 'SIC', 4305, 1, 1, 2869, 810, 3),\n" +
            "(3882, 'SIC', 3756, 5090, 3, 3760, 5094, 4),\n" +
            "(3883, 'NAICS', 1, 11, 1, 47, 11192, 4),\n" +
            "(3884, 'SEC', 2794, 52, 1, 2633, 5730, 3),\n" +
            "(3885, 'NAICS', 1035, 4244, 3, 1046, 424460, 5),\n" +
            "(3886, 'SIC', 4313, 70, 1, 4228, 8720, 3),\n" +
            "(3887, 'SIC', 3125, 2410, 3, 3126, 2411, 4),\n" +
            "(3888, 'NAICS', 1471, 5191, 3, 1472, 519110, 5),\n" +
            "(3889, 'NAICS', 1035, 4244, 3, 1045, 42445, 4),\n" +
            "(3890, 'SEC', 2791, 20, 1, 2432, 3585, 4),\n" +
            "(3891, 'SIC', 4309, 40, 1, 3665, 4613, 4),\n" +
            "(3892, 'NAICS', 2025, 72232, 4, 2024, 722320, 5),\n" +
            "(3893, 'SEC', 2539, 4800, 2, 2547, 4833, 4),\n" +
            "(3894, 'SEC', 2355, 3200, 2, 2368, 3280, 3),\n" +
            "(3895, 'SIC', 4312, 60, 1, 3979, 6512, 4),\n" +
            "(3896, 'SIC', 4313, 70, 1, 4098, 7542, 4),\n" +
            "(3897, 'NAICS', 1015, 424, 2, 1082, 42493, 4),\n" +
            "(3898, 'SIC', 3715, 5000, 2, 3726, 5032, 4),\n" +
            "(3899, 'SIC', 3180, 2670, 3, 3186, 2676, 4),\n" +
            "(3900, 'SIC', 4313, 70, 1, 4244, 8900, 2),\n" +
            "(3901, 'SIC', 4313, 70, 1, 4037, 7290, 3),\n" +
            "(3902, 'SIC', 2928, 1450, 3, 2929, 1455, 4),\n" +
            "(3903, 'SIC', 4314, 90, 1, 4296, 9661, 4),\n" +
            "(3904, 'SIC', 4313, 70, 1, 4171, 8090, 3),\n" +
            "(3905, 'SIC', 4040, 7300, 2, 4070, 7375, 4),\n" +
            "(3906, 'SEC', 2443, 3650, 3, 2444, 3651, 4),\n" +
            "(3907, 'NAICS', 1624, 54, 1, 1633, 541199, 5),\n" +
            "(3908, 'SIC', 4308, 20, 1, 3140, 2449, 4),\n" +
            "(3909, 'NAICS', 98, 113, 2, 101, 11311, 4),\n" +
            "(3910, 'SIC', 2966, 1750, 3, 2968, 1752, 4),\n" +
            "(3911, 'SIC', 3605, 4100, 2, 3615, 4142, 4),\n" +
            "(3912, 'NAICS', 1774, 5617, 3, 1775, 561710, 5),\n" +
            "(3913, 'SEC', 2709, 7000, 2, 2711, 7011, 4),\n" +
            "(3914, 'SIC', 3576, 3900, 2, 3596, 3991, 4),\n" +
            "(3915, 'SIC', 3762, 5100, 2, 3771, 5136, 4),\n" +
            "(3916, 'SEC', 2703, 6700, 2, 2706, 6794, 4),\n" +
            "(3917, 'SIC', 3552, 3800, 2, 3574, 3870, 3),\n" +
            "(3918, 'SIC', 3626, 4220, 3, 3627, 4221, 4),\n" +
            "(3919, 'SIC', 2982, 2000, 2, 2995, 2033, 4),\n" +
            "(3920, 'SIC', 2918, 1400, 2, 2933, 1475, 4),\n" +
            "(3921, 'SIC', 4308, 20, 1, 3081, 2298, 4),\n" +
            "(3922, 'SEC', 2568, 5000, 2, 2571, 5020, 3),\n" +
            "(3923, 'SIC', 3480, 3600, 2, 3515, 3675, 4),\n" +
            "(3924, 'NAICS', 1923, 62411, 4, 1922, 624110, 5),\n" +
            "(3925, 'NAICS', 1004, 4239, 3, 1005, 423910, 5),\n" +
            "(3926, 'SIC', 3576, 3900, 2, 3577, 3910, 3),\n" +
            "(3927, 'SIC', 4308, 20, 1, 3370, 3399, 4),\n" +
            "(3928, 'NAICS', 1904, 623, 2, 1918, 623990, 5),\n" +
            "(3929, 'NAICS', 1, 11, 1, 98, 113, 2),\n" +
            "(3930, 'NAICS', 162, 21232, 4, 165, 212324, 5),\n" +
            "(3931, 'SIC', 4065, 7370, 3, 4073, 7378, 4),\n" +
            "(3932, 'SIC', 3729, 5040, 3, 3731, 5044, 4),\n" +
            "(3933, 'SIC', 4309, 40, 1, 3613, 4140, 3),\n" +
            "(3934, 'SEC', 2355, 3200, 2, 2357, 3211, 4),\n" +
            "(3935, 'SIC', 3970, 6370, 3, 3971, 6371, 4),\n" +
            "(3936, 'SIC', 4313, 70, 1, 4200, 8361, 4),\n" +
            "(3937, 'SIC', 3931, 6080, 3, 3932, 6081, 4),\n" +
            "(3938, 'NAICS', 1725, 56, 1, 1745, 561421, 5),\n" +
            "(3939, 'NAICS', 1054, 4245, 3, 1060, 42459, 4),\n" +
            "(3940, 'NAICS', 1076, 4249, 3, 1087, 424990, 5),\n" +
            "(3941, 'SIC', 4308, 20, 1, 3565, 3841, 4),\n" +
            "(3942, 'NAICS', 1851, 621, 2, 1878, 621492, 5),\n" +
            "(3943, 'NAICS', 1654, 54137, 4, 1653, 541370, 5),\n" +
            "(3944, 'SIC', 4306, 10, 1, 2885, 1010, 3),\n" +
            "(3945, 'SIC', 3526, 3700, 2, 3539, 3732, 4),\n" +
            "(3946, 'NAICS', 957, 42341, 4, 956, 423410, 5),\n" +
            "(3947, 'SIC', 4308, 20, 1, 3028, 2083, 4),\n" +
            "(3948, 'SIC', 2918, 1400, 2, 2923, 1423, 4),\n" +
            "(3949, 'NAICS', 1562, 5259, 3, 1566, 52592, 4),\n" +
            "(3950, 'SEC', 2650, 6020, 3, 2652, 6022, 4),\n" +
            "(3951, 'NAICS', 1, 11, 1, 106, 113310, 5),\n" +
            "(3952, 'SIC', 4308, 20, 1, 3323, 3271, 4),\n" +
            "(3953, 'NAICS', 1041, 42443, 4, 1040, 424430, 5),\n" +
            "(3954, 'NAICS', 1480, 52, 1, 1554, 525, 2),\n" +
            "(3955, 'NAICS', 1850, 62, 1, 1902, 622310, 5),\n" +
            "(3956, 'SIC', 4308, 20, 1, 3535, 3724, 4),\n" +
            "(3957, 'SEC', 2791, 20, 1, 2348, 3060, 3),\n" +
            "(3958, 'SEC', 2791, 20, 1, 2496, 3860, 3),\n" +
            "(3959, 'SEC', 2766, 8100, 2, 2767, 8110, 3),\n" +
            "(3960, 'NAICS', 1970, 7121, 3, 1973, 712120, 5),\n" +
            "(3961, 'SIC', 4313, 70, 1, 4102, 7622, 4),\n" +
            "(3962, 'NAICS', 1404, 5111, 3, 1407, 511120, 5),\n" +
            "(3963, 'NAICS', 1624, 54, 1, 1629, 541120, 5),\n" +
            "(3964, 'NAICS', 275, 23891, 4, 274, 238910, 5),\n" +
            "(3965, 'NAICS', 2135, 92, 1, 2201, 9271, 3),\n" +
            "(3966, 'SIC', 3527, 3710, 3, 3532, 3716, 4),\n" +
            "(3967, 'SIC', 3371, 3400, 2, 3417, 3498, 4),\n" +
            "(3968, 'NAICS', 1514, 5231, 3, 1521, 523140, 5),\n" +
            "(3969, 'NAICS', 2093, 8129, 3, 2097, 812921, 5),\n" +
            "(3970, 'SEC', 2302, 2700, 2, 2306, 2721, 4),\n" +
            "(3971, 'NAICS', 1480, 52, 1, 1518, 52312, 4),\n" +
            "(3972, 'SIC', 4308, 20, 1, 3322, 3270, 3),\n" +
            "(3973, 'SEC', 2791, 20, 1, 2283, 2500, 2),\n" +
            "(3974, 'SEC', 2793, 50, 1, 2597, 5141, 4),\n" +
            "(3975, 'SIC', 3870, 5710, 3, 3871, 5712, 4),\n" +
            "(3976, 'NAICS', 2135, 92, 1, 2193, 92612, 4),\n" +
            "(3977, 'NAICS', 1, 11, 1, 15, 11116, 4),\n" +
            "(3978, 'SEC', 2791, 20, 1, 2275, 2390, 3),\n" +
            "(3979, 'SEC', 2796, 70, 1, 2765, 8093, 4),\n" +
            "(3980, 'SIC', 4007, 7000, 2, 4008, 7010, 3),\n" +
            "(3981, 'SIC', 3371, 3400, 2, 3402, 3471, 4),\n" +
            "(3982, 'NAICS', 235, 238, 2, 257, 23822, 4),\n" +
            "(3983, 'SIC', 4307, 15, 1, 2939, 1500, 2),\n" +
            "(3984, 'SIC', 4313, 70, 1, 4094, 7537, 4),\n" +
            "(3985, 'NAICS', 1018, 42411, 4, 1017, 424110, 5),\n" +
            "(3986, 'SIC', 4308, 20, 1, 3264, 3020, 3),\n" +
            "(3987, 'NAICS', 270, 23835, 4, 269, 238350, 5),\n" +
            "(3988, 'NAICS', 1910, 62321, 4, 1909, 623210, 5),\n" +
            "(3989, 'SIC', 4309, 40, 1, 3706, 4941, 4),\n" +
            "(3990, 'SIC', 4305, 1, 1, 2866, 782, 4),\n" +
            "(3991, 'SIC', 4310, 50, 1, 3722, 5021, 4),\n" +
            "(3992, 'NAICS', 1990, 7139, 3, 1996, 71393, 4),\n" +
            "(3993, 'NAICS', 1015, 424, 2, 1059, 424590, 5),\n" +
            "(3994, 'SEC', 2553, 4910, 3, 2554, 4911, 4),\n" +
            "(3995, 'SIC', 4308, 20, 1, 3345, 3321, 4),\n" +
            "(3996, 'NAICS', 1969, 712, 2, 1977, 712190, 5),\n" +
            "(3997, 'SIC', 3480, 3600, 2, 3506, 3652, 4),\n" +
            "(3998, 'SIC', 3552, 3800, 2, 3562, 3827, 4),\n" +
            "(3999, 'NAICS', 931, 423, 2, 1004, 4239, 3),\n" +
            "(4000, 'NAICS', 40, 11142, 4, 41, 111421, 5),\n" +
            "(4001, 'NAICS', 205, 23, 1, 262, 23831, 4),\n" +
            "(4002, 'SIC', 3214, 2800, 2, 3249, 2893, 4),\n" +
            "(4003, 'SIC', 3576, 3900, 2, 3582, 3931, 4),\n" +
            "(4004, 'NAICS', 1625, 541, 2, 1639, 541219, 5),\n" +
            "(4005, 'NAICS', 2071, 812, 2, 2095, 81291, 4),\n" +
            "(4006, 'NAICS', 931, 423, 2, 989, 423740, 5),\n" +
            "(4007, 'SIC', 3214, 2800, 2, 3237, 2860, 3),\n" +
            "(4008, 'SIC', 4307, 15, 1, 2958, 1720, 3),\n" +
            "(4009, 'NAICS', 132, 21, 1, 160, 212313, 5),\n" +
            "(4010, 'SEC', 2271, 2300, 2, 2272, 2320, 3),\n" +
            "(4011, 'SIC', 4065, 7370, 3, 4067, 7372, 4),\n" +
            "(4012, 'SIC', 3050, 2200, 2, 3065, 2258, 4),\n" +
            "(4013, 'SEC', 2791, 20, 1, 2436, 3612, 4),\n" +
            "(4014, 'NAICS', 23, 1113, 3, 35, 111339, 5),\n" +
            "(4015, 'SEC', 2789, 10, 1, 2227, 1389, 4),\n" +
            "(4016, 'SIC', 2918, 1400, 2, 2932, 1474, 4),\n" +
            "(4017, 'SIC', 3504, 3650, 3, 3505, 3651, 4),\n" +
            "(4018, 'NAICS', 1617, 53242, 4, 1616, 532420, 5),\n" +
            "(4019, 'NAICS', 2204, 928, 2, 2209, 92812, 4),\n" +
            "(4020, 'NAICS', 2189, 9261, 3, 2197, 92614, 4),\n" +
            "(4021, 'SIC', 4153, 8040, 3, 4154, 8041, 4),\n" +
            "(4022, 'NAICS', 930, 42, 1, 1013, 423990, 5),\n" +
            "(4023, 'SIC', 3148, 2500, 2, 3162, 2541, 4),\n" +
            "(4024, 'NAICS', 2197, 92614, 4, 2196, 926140, 5),\n" +
            "(4025, 'NAICS', 204, 22133, 4, 203, 221330, 5),\n" +
            "(4026, 'SEC', 2794, 52, 1, 2624, 5620, 3),\n" +
            "(4027, 'NAICS', 1402, 51, 1, 1471, 5191, 3),\n" +
            "(4028, 'NAICS', 268, 23834, 4, 267, 238340, 5),\n" +
            "(4029, 'NAICS', 1625, 541, 2, 1656, 54138, 4),\n" +
            "(4030, 'SIC', 4197, 8350, 3, 4198, 8351, 4),\n" +
            "(4031, 'SIC', 4308, 20, 1, 3448, 3555, 4),\n" +
            "(4032, 'SIC', 4313, 70, 1, 4085, 7515, 4),\n" +
            "(4033, 'NAICS', 1071, 4248, 3, 1072, 424810, 5),\n" +
            "(4034, 'NAICS', 2136, 921, 2, 2147, 92115, 4),\n" +
            "(4035, 'SIC', 3419, 3500, 2, 3451, 3560, 3),\n" +
            "(4036, 'NAICS', 2, 111, 2, 45, 11191, 4),\n" +
            "(4037, 'SIC', 3917, 6000, 2, 3926, 6035, 4),\n" +
            "(4038, 'NAICS', 1402, 51, 1, 1455, 51711, 4),\n" +
            "(4039, 'NAICS', 1793, 5621, 3, 1796, 562112, 5),\n" +
            "(4040, 'SIC', 3837, 5500, 2, 3838, 5510, 3),\n" +
            "(4041, 'SIC', 2925, 1440, 3, 2926, 1442, 4),\n" +
            "(4042, 'SIC', 4309, 40, 1, 3696, 4920, 3),\n" +
            "(4043, 'SIC', 4309, 40, 1, 3650, 4491, 4),\n" +
            "(4044, 'NAICS', 1580, 5312, 3, 1581, 531210, 5),\n" +
            "(4045, 'NAICS', 945, 42322, 4, 944, 423220, 5),\n" +
            "(4046, 'NAICS', 1054, 4245, 3, 1055, 424510, 5),\n" +
            "(4047, 'NAICS', 1537, 5241, 3, 1543, 524127, 5),\n" +
            "(4048, 'NAICS', 2171, 92312, 4, 2170, 923120, 5),\n" +
            "(4049, 'NAICS', 1514, 5231, 3, 1516, 52311, 4),\n" +
            "(4050, 'NAICS', 1673, 54161, 4, 1675, 541612, 5),\n" +
            "(4051, 'SEC', 2791, 20, 1, 2312, 2750, 3),\n" +
            "(4052, 'NAICS', 1792, 562, 2, 1802, 562213, 5),\n" +
            "(4053, 'SEC', 2552, 4900, 2, 2554, 4911, 4),\n" +
            "(4054, 'SEC', 2791, 20, 1, 4315, 3576, 4),\n" +
            "(4055, 'SIC', 4308, 20, 1, 3352, 3339, 4),\n" +
            "(4056, 'SIC', 4308, 20, 1, 3177, 2655, 4),\n" +
            "(4057, 'SEC', 2501, 3910, 3, 2502, 3911, 4),\n" +
            "(4058, 'SIC', 3837, 5500, 2, 3842, 5530, 3),\n" +
            "(4059, 'SIC', 4313, 70, 1, 4113, 7800, 2),\n" +
            "(4060, 'NAICS', 235, 238, 2, 242, 23813, 4),\n" +
            "(4061, 'NAICS', 1442, 515, 2, 1447, 515120, 5),\n" +
            "(4062, 'NAICS', 2, 111, 2, 49, 11193, 4),\n" +
            "(4063, 'NAICS', 1566, 52592, 4, 1565, 525920, 5),\n" +
            "(4064, 'SEC', 2796, 70, 1, 2781, 8741, 4),\n" +
            "(4065, 'SIC', 4314, 90, 1, 4250, 9120, 3),\n" +
            "(4066, 'SIC', 3837, 5500, 2, 3846, 5550, 3),\n" +
            "(4067, 'NAICS', 1547, 5242, 3, 1548, 524210, 5),\n" +
            "(4068, 'SIC', 3419, 3500, 2, 3473, 3589, 4),\n" +
            "(4069, 'NAICS', 68, 1123, 3, 71, 112320, 5),\n" +
            "(4070, 'SIC', 4313, 70, 1, 4241, 8800, 2),\n" +
            "(4071, 'NAICS', 1990, 7139, 3, 2000, 71395, 4),\n" +
            "(4072, 'NAICS', 1015, 424, 2, 1075, 42482, 4),\n" +
            "(4073, 'SEC', 2791, 20, 1, 2305, 2720, 3),\n" +
            "(4074, 'SIC', 3355, 3350, 3, 3357, 3353, 4),\n" +
            "(4075, 'SIC', 4313, 70, 1, 4031, 7240, 3),\n" +
            "(4076, 'SIC', 4305, 1, 1, 2871, 830, 3),\n" +
            "(4077, 'NAICS', 1942, 71, 1, 1947, 711120, 5),\n" +
            "(4078, 'NAICS', 1990, 7139, 3, 1999, 713950, 5),\n" +
            "(4079, 'SIC', 3337, 3300, 2, 3356, 3351, 4),\n" +
            "(4080, 'NAICS', 1032, 42433, 4, 1031, 424330, 5),\n" +
            "(4081, 'NAICS', 1402, 51, 1, 1424, 51212, 4),\n" +
            "(4082, 'NAICS', 2135, 92, 1, 2160, 922150, 5),\n" +
            "(4083, 'SEC', 2620, 5500, 2, 2622, 5531, 4),\n" +
            "(4084, 'NAICS', 1569, 53, 1, 1582, 53121, 4),\n" +
            "(4085, 'NAICS', 198, 2213, 3, 202, 22132, 4),\n" +
            "(4086, 'NAICS', 1850, 62, 1, 1900, 62221, 4),\n" +
            "(4087, 'NAICS', 78, 11239, 4, 77, 112390, 5),\n" +
            "(4088, 'NAICS', 1, 11, 1, 63, 112130, 5),\n" +
            "(4089, 'SEC', 2791, 20, 1, 2406, 3523, 4),\n" +
            "(4090, 'SIC', 3108, 2380, 3, 3109, 2381, 4),\n" +
            "(4091, 'SIC', 4308, 20, 1, 3494, 3635, 4),\n" +
            "(4092, 'SIC', 4308, 20, 1, 3512, 3671, 4),\n" +
            "(4093, 'SIC', 4049, 7330, 3, 4052, 7335, 4),\n" +
            "(4094, 'NAICS', 930, 42, 1, 1037, 42441, 4),\n" +
            "(4095, 'NAICS', 1625, 541, 2, 1658, 541410, 5),\n" +
            "(4096, 'SIC', 4308, 20, 1, 3405, 3482, 4),\n" +
            "(4097, 'SEC', 2479, 3820, 3, 2482, 3823, 4),\n" +
            "(4098, 'SIC', 3654, 4500, 2, 3656, 4512, 4),\n" +
            "(4099, 'SIC', 4312, 60, 1, 3961, 6320, 3),\n" +
            "(4100, 'SIC', 4312, 60, 1, 3917, 6000, 2),\n" +
            "(4101, 'NAICS', 1657, 5414, 3, 1663, 54143, 4),\n" +
            "(4102, 'NAICS', 2038, 811, 2, 2047, 811122, 5),\n" +
            "(4103, 'SEC', 2795, 60, 1, 2701, 6550, 3),\n" +
            "(4104, 'SIC', 4313, 70, 1, 4101, 7620, 3),\n" +
            "(4105, 'SIC', 3480, 3600, 2, 3518, 3678, 4),\n" +
            "(4106, 'SIC', 4040, 7300, 2, 4041, 7310, 3),\n" +
            "(4107, 'SEC', 2792, 40, 1, 2552, 4900, 2),\n" +
            "(4108, 'SIC', 4310, 50, 1, 3764, 5111, 4),\n" +
            "(4109, 'SEC', 2396, 3450, 3, 2397, 3451, 4),\n" +
            "(4110, 'SEC', 2792, 40, 1, 2544, 4822, 4),\n" +
            "(4111, 'SEC', 2791, 20, 1, 2457, 3695, 4),\n" +
            "(4112, 'SIC', 3480, 3600, 2, 3497, 3641, 4),\n" +
            "(4113, 'SIC', 4308, 20, 1, 2993, 2030, 3),\n" +
            "(4114, 'NAICS', 84, 1125, 3, 85, 11251, 4),\n" +
            "(4115, 'NAICS', 2038, 811, 2, 2069, 811490, 5),\n" +
            "(4116, 'SIC', 4311, 52, 1, 3819, 5331, 4),\n" +
            "(4117, 'SIC', 4305, 1, 1, 2851, 721, 4),\n" +
            "(4118, 'SIC', 3144, 2490, 3, 3146, 2493, 4),\n" +
            "(4119, 'SIC', 4308, 20, 1, 3169, 2611, 4),\n" +
            "(4120, 'SIC', 4235, 8740, 3, 4240, 8748, 4),\n" +
            "(4121, 'NAICS', 1856, 6212, 3, 1858, 62121, 4),\n" +
            "(4122, 'SIC', 4017, 7200, 2, 4029, 7230, 3),\n" +
            "(4123, 'SEC', 2792, 40, 1, 2553, 4910, 3),\n" +
            "(4124, 'SIC', 4313, 70, 1, 4168, 8072, 4),\n" +
            "(4125, 'NAICS', 1725, 56, 1, 1789, 56192, 4),\n" +
            "(4126, 'SEC', 2793, 50, 1, 2595, 5130, 3),\n" +
            "(4127, 'SEC', 2649, 6000, 2, 2650, 6020, 3),\n" +
            "(4128, 'SIC', 3215, 2810, 3, 3216, 2812, 4),\n" +
            "(4129, 'NAICS', 1726, 561, 2, 1780, 56173, 4),\n" +
            "(4130, 'SEC', 2591, 5100, 2, 2593, 5120, 3),\n" +
            "(4131, 'NAICS', 1791, 56199, 4, 1790, 561990, 5),\n" +
            "(4132, 'NAICS', 955, 4234, 3, 966, 423460, 5),\n" +
            "(4133, 'SIC', 4313, 70, 1, 4206, 8420, 3),\n" +
            "(4134, 'NAICS', 1004, 4239, 3, 1007, 423920, 5),\n" +
            "(4135, 'SIC', 3252, 2900, 2, 3259, 2992, 4),\n" +
            "(4136, 'SIC', 4310, 50, 1, 3740, 5060, 3),\n" +
            "(4137, 'NAICS', 1850, 62, 1, 1931, 62422, 4),\n" +
            "(4138, 'SIC', 3756, 5090, 3, 3761, 5099, 4),\n" +
            "(4139, 'NAICS', 991, 4238, 3, 993, 42381, 4),\n" +
            "(4140, 'NAICS', 1812, 61, 1, 1831, 61151, 4),\n" +
            "(4141, 'NAICS', 2135, 92, 1, 2144, 921140, 5),\n" +
            "(4142, 'NAICS', 135, 21111, 4, 137, 211112, 5),\n" +
            "(4143, 'NAICS', 138, 212, 2, 146, 21221, 4),\n" +
            "(4144, 'SEC', 2434, 3600, 2, 2457, 3695, 4),\n" +
            "(4145, 'SIC', 4307, 15, 1, 2968, 1752, 4),\n" +
            "(4146, 'SIC', 4147, 8010, 3, 4148, 8011, 4),\n" +
            "(4147, 'SIC', 3804, 5200, 2, 3805, 5210, 3),\n" +
            "(4148, 'NAICS', 930, 42, 1, 964, 423450, 5),\n" +
            "(4149, 'SIC', 3337, 3300, 2, 3351, 3334, 4),\n" +
            "(4150, 'SIC', 4308, 20, 1, 3328, 3280, 3),\n" +
            "(4151, 'SIC', 4192, 8300, 2, 4202, 8399, 4),\n" +
            "(4152, 'NAICS', 1, 11, 1, 35, 111339, 5),\n" +
            "(4153, 'NAICS', 1591, 532, 2, 1607, 532292, 5),\n" +
            "(4154, 'NAICS', 2167, 9231, 3, 2169, 92311, 4),\n" +
            "(4155, 'NAICS', 1004, 4239, 3, 1011, 423940, 5),\n" +
            "(4156, 'SIC', 3451, 3560, 3, 3453, 3562, 4),\n" +
            "(4157, 'NAICS', 2072, 8121, 3, 2077, 81219, 4),\n" +
            "(4158, 'SIC', 4309, 40, 1, 3656, 4512, 4),\n" +
            "(4159, 'NAICS', 931, 423, 2, 932, 4231, 3),\n" +
            "(4160, 'SIC', 2820, 180, 3, 2822, 182, 4),\n" +
            "(4161, 'SEC', 2792, 40, 1, 2532, 4580, 3),\n" +
            "(4162, 'NAICS', 1564, 52591, 4, 1563, 525910, 5),\n" +
            "(4163, 'SIC', 2982, 2000, 2, 3033, 2090, 3),\n" +
            "(4164, 'SIC', 3301, 3200, 2, 3333, 3295, 4),\n" +
            "(4165, 'SIC', 3693, 4900, 2, 3710, 4959, 4),\n" +
            "(4166, 'SIC', 4311, 52, 1, 3885, 5813, 4),\n" +
            "(4167, 'SIC', 3762, 5100, 2, 3778, 5144, 4),\n" +
            "(4168, 'SIC', 3115, 2390, 3, 3117, 2392, 4),\n" +
            "(4169, 'SIC', 4308, 20, 1, 3039, 2098, 4),\n" +
            "(4170, 'SIC', 4125, 7900, 2, 4136, 7950, 3),\n" +
            "(4171, 'SIC', 2805, 130, 3, 2810, 139, 4),\n" +
            "(4172, 'NAICS', 1812, 61, 1, 1838, 61161, 4),\n" +
            "(4173, 'NAICS', 2037, 81, 1, 2107, 8132, 3),\n" +
            "(4174, 'SEC', 2713, 7300, 2, 2719, 7340, 3),\n" +
            "(4175, 'SIC', 3050, 2200, 2, 3061, 2252, 4),\n" +
            "(4176, 'NAICS', 144, 2122, 3, 145, 212210, 5),\n" +
            "(4177, 'SIC', 4308, 20, 1, 3166, 2599, 4),\n" +
            "(4178, 'NAICS', 1871, 6214, 3, 1878, 621492, 5),\n" +
            "(4179, 'SIC', 3763, 5110, 3, 3765, 5112, 4),\n" +
            "(4180, 'SIC', 4313, 70, 1, 4152, 8031, 4),\n" +
            "(4181, 'NAICS', 1640, 5413, 3, 1654, 54137, 4),\n" +
            "(4182, 'SIC', 4284, 9600, 2, 4296, 9661, 4),\n" +
            "(4183, 'NAICS', 1402, 51, 1, 1456, 5172, 3),\n" +
            "(4184, 'NAICS', 1885, 6216, 3, 1887, 62161, 4),\n" +
            "(4185, 'NAICS', 1789, 56192, 4, 1788, 561920, 5),\n" +
            "(4186, 'SIC', 2982, 2000, 2, 3029, 2084, 4),\n" +
            "(4187, 'NAICS', 2143, 92113, 4, 2142, 921130, 5),\n" +
            "(4188, 'SEC', 2753, 8000, 2, 2761, 8071, 4),\n" +
            "(4189, 'SIC', 2823, 190, 3, 2824, 191, 4),\n" +
            "(4190, 'SIC', 3108, 2380, 3, 3110, 2384, 4),\n" +
            "(4191, 'NAICS', 1725, 56, 1, 1741, 5614, 3),\n" +
            "(4192, 'NAICS', 1917, 6239, 3, 1918, 623990, 5),\n" +
            "(4193, 'NAICS', 1830, 6115, 3, 1831, 61151, 4),\n" +
            "(4194, 'SEC', 2785, 9700, 2, 2786, 9720, 3),\n" +
            "(4195, 'SIC', 3020, 2070, 3, 3021, 2074, 4),\n" +
            "(4196, 'SEC', 2479, 3820, 3, 2487, 3829, 4),\n" +
            "(4197, 'SIC', 4313, 70, 1, 4051, 7334, 4),\n" +
            "(4198, 'SIC', 3108, 2380, 3, 3112, 2386, 4),\n" +
            "(4199, 'SEC', 2791, 20, 1, 2322, 2821, 4),\n" +
            "(4200, 'SIC', 3744, 5070, 3, 3746, 5074, 4),\n" +
            "(4201, 'NAICS', 2021, 7223, 3, 2023, 72231, 4),\n" +
            "(4202, 'NAICS', 1894, 622, 2, 1900, 62221, 4),\n" +
            "(4203, 'SEC', 2795, 60, 1, 4320, 6170, 3),\n" +
            "(4204, 'NAICS', 1, 11, 1, 121, 115112, 5),\n" +
            "(4205, 'NAICS', 1624, 54, 1, 1651, 541360, 5),\n" +
            "(4206, 'NAICS', 1904, 623, 2, 1917, 6239, 3),\n" +
            "(4207, 'SEC', 2568, 5000, 2, 2587, 5084, 4),\n" +
            "(4208, 'SIC', 3480, 3600, 2, 3498, 3643, 4),\n" +
            "(4209, 'SIC', 3762, 5100, 2, 3800, 5193, 4),\n" +
            "(4210, 'NAICS', 946, 4233, 3, 953, 423390, 5),\n" +
            "(4211, 'SEC', 2774, 8700, 2, 2775, 8710, 3),\n" +
            "(4212, 'SEC', 2434, 3600, 2, 2436, 3612, 4),\n" +
            "(4213, 'SIC', 4308, 20, 1, 3547, 3769, 4),\n" +
            "(4214, 'SIC', 3261, 3000, 2, 3265, 3021, 4),\n" +
            "(4215, 'SIC', 4310, 50, 1, 3780, 5146, 4),\n" +
            "(4216, 'NAICS', 1767, 56161, 4, 1769, 561612, 5),\n" +
            "(4217, 'NAICS', 2004, 721, 2, 2012, 721199, 5),\n" +
            "(4218, 'SEC', 2403, 3500, 2, 4315, 3576, 4),\n" +
            "(4219, 'SIC', 4313, 70, 1, 4108, 7641, 4),\n" +
            "(4220, 'SIC', 4309, 40, 1, 3632, 4231, 4),\n" +
            "(4221, 'NAICS', 2021, 7223, 3, 2022, 722310, 5),\n" +
            "(4222, 'SIC', 3115, 2390, 3, 3120, 2395, 4),\n" +
            "(4223, 'NAICS', 138, 212, 2, 164, 212322, 5),\n" +
            "(4224, 'SIC', 4307, 15, 1, 2978, 1794, 4),\n" +
            "(4225, 'SIC', 4307, 15, 1, 2979, 1795, 4),\n" +
            "(4226, 'SIC', 3225, 2830, 3, 3228, 2835, 4),\n" +
            "(4227, 'SEC', 2403, 3500, 2, 2406, 3523, 4),\n" +
            "(4228, 'SEC', 2371, 3300, 2, 2381, 3357, 4),\n" +
            "(4229, 'NAICS', 2071, 812, 2, 2097, 812921, 5),\n" +
            "(4230, 'NAICS', 235, 238, 2, 236, 2381, 3),\n" +
            "(4231, 'SEC', 2292, 2600, 2, 2294, 2611, 4),\n" +
            "(4232, 'NAICS', 1, 11, 1, 87, 112512, 5),\n" +
            "(4233, 'SIC', 4308, 20, 1, 3066, 2259, 4),\n" +
            "(4234, 'SIC', 4308, 20, 1, 3573, 3861, 4),\n" +
            "(4235, 'SEC', 2413, 3540, 3, 2414, 3541, 4),\n" +
            "(4236, 'NAICS', 1, 11, 1, 51, 11194, 4),\n" +
            "(4237, 'SIC', 3511, 3670, 3, 3512, 3671, 4),\n" +
            "(4238, 'NAICS', 1035, 4244, 3, 1036, 424410, 5),\n" +
            "(4239, 'SIC', 3672, 4730, 3, 3673, 4731, 4),\n" +
            "(4240, 'SIC', 4040, 7300, 2, 4063, 7361, 4),\n" +
            "(4241, 'SEC', 2408, 3530, 3, 2410, 3532, 4),\n" +
            "(4242, 'NAICS', 132, 21, 1, 143, 212113, 5),\n" +
            "(4243, 'SEC', 2767, 8110, 3, 2768, 8111, 4),\n" +
            "(4244, 'SIC', 3552, 3800, 2, 3570, 3850, 3),\n" +
            "(4245, 'SIC', 4311, 52, 1, 3807, 5230, 3),\n" +
            "(4246, 'SIC', 4312, 60, 1, 4001, 6733, 4),\n" +
            "(4247, 'NAICS', 1976, 71213, 4, 1975, 712130, 5),\n" +
            "(4248, 'SEC', 2240, 2000, 2, 2250, 2050, 3),\n" +
            "(4249, 'SIC', 4031, 7240, 3, 4032, 7241, 4),\n" +
            "(4250, 'NAICS', 138, 212, 2, 158, 212311, 5),\n" +
            "(4251, 'NAICS', 217, 23622, 4, 216, 236220, 5),\n" +
            "(4252, 'SIC', 2987, 2020, 3, 2990, 2023, 4),\n" +
            "(4253, 'SIC', 4313, 70, 1, 4178, 8200, 2),\n" +
            "(4254, 'SIC', 3850, 5570, 3, 3851, 5571, 4),\n" +
            "(4255, 'SIC', 4310, 50, 1, 3721, 5020, 3),\n" +
            "(4256, 'SIC', 4311, 52, 1, 3813, 5270, 3),\n" +
            "(4257, 'NAICS', 930, 42, 1, 1086, 42495, 4),\n" +
            "(4258, 'SEC', 2617, 5400, 2, 4319, 5412, 4),\n" +
            "(4259, 'NAICS', 1015, 424, 2, 1041, 42443, 4),\n" +
            "(4260, 'SIC', 3083, 2300, 2, 3122, 2397, 4),\n" +
            "(4261, 'NAICS', 2020, 722, 2, 2032, 72251, 4),\n" +
            "(4262, 'NAICS', 2103, 813, 2, 2127, 813940, 5),\n" +
            "(4263, 'SIC', 3093, 2330, 3, 3094, 2331, 4),\n" +
            "(4264, 'NAICS', 1402, 51, 1, 1446, 515112, 5),\n" +
            "(4265, 'SEC', 2271, 2300, 2, 2273, 2330, 3),\n" +
            "(4266, 'SIC', 4002, 6790, 3, 4003, 6792, 4),\n" +
            "(4267, 'SIC', 3762, 5100, 2, 3765, 5112, 4),\n" +
            "(4268, 'SIC', 2982, 2000, 2, 3034, 2091, 4),\n" +
            "(4269, 'NAICS', 1047, 42446, 4, 1046, 424460, 5),\n" +
            "(4270, 'SIC', 3362, 3360, 3, 3363, 3363, 4),\n" +
            "(4271, 'NAICS', 930, 42, 1, 947, 423310, 5),\n" +
            "(4272, 'NAICS', 139, 2121, 3, 140, 21211, 4),\n" +
            "(4273, 'SIC', 3395, 3460, 3, 3400, 3469, 4),\n" +
            "(4274, 'SIC', 3762, 5100, 2, 3783, 5149, 4),\n" +
            "(4275, 'SIC', 4040, 7300, 2, 4075, 7380, 3),\n" +
            "(4276, 'NAICS', 1481, 521, 2, 1483, 521110, 5),\n" +
            "(4277, 'NAICS', 1726, 561, 2, 1757, 561499, 5),\n" +
            "(4278, 'NAICS', 2037, 81, 1, 2041, 811111, 5),\n" +
            "(4279, 'SIC', 3621, 4210, 3, 3623, 4213, 4),\n" +
            "(4280, 'SIC', 4310, 50, 1, 3719, 5014, 4),\n" +
            "(4281, 'NAICS', 1830, 6115, 3, 1832, 611511, 5),\n" +
            "(4282, 'SIC', 4313, 70, 1, 4078, 7383, 4),\n" +
            "(4283, 'NAICS', 1766, 5616, 3, 1771, 56162, 4),\n" +
            "(4284, 'SIC', 3620, 4200, 2, 3629, 4225, 4),\n" +
            "(4285, 'NAICS', 1624, 54, 1, 1670, 541513, 5),\n" +
            "(4286, 'SEC', 2795, 60, 1, 2659, 6100, 2),\n" +
            "(4287, 'NAICS', 1894, 622, 2, 1895, 6221, 3),\n" +
            "(4288, 'SIC', 3555, 3820, 3, 3559, 3824, 4),\n" +
            "(4289, 'NAICS', 156, 2123, 3, 158, 212311, 5),\n" +
            "(4290, 'SEC', 2731, 7380, 3, 2733, 7384, 4),\n" +
            "(4291, 'SIC', 4308, 20, 1, 3286, 3131, 4),\n" +
            "(4292, 'SEC', 2259, 2100, 2, 2261, 2111, 4),\n" +
            "(4293, 'SEC', 2795, 60, 1, 2678, 6310, 3),\n" +
            "(4294, 'SIC', 4308, 20, 1, 3308, 3231, 4),\n" +
            "(4295, 'NAICS', 19, 1112, 3, 20, 11121, 4),\n" +
            "(4296, 'NAICS', 1404, 5111, 3, 1410, 51113, 4),\n" +
            "(4297, 'SIC', 3371, 3400, 2, 3380, 3430, 3),\n" +
            "(4298, 'SIC', 4311, 52, 1, 3854, 5600, 2),\n" +
            "(4299, 'SIC', 4305, 1, 1, 2822, 182, 4),\n" +
            "(4300, 'NAICS', 930, 42, 1, 1094, 42512, 4),\n" +
            "(4301, 'SIC', 3409, 3490, 3, 3416, 3497, 4),\n" +
            "(4302, 'NAICS', 180, 22, 1, 203, 221330, 5),\n" +
            "(4303, 'NAICS', 2000, 71395, 4, 1999, 713950, 5),\n" +
            "(4304, 'NAICS', 1823, 6114, 3, 1826, 611420, 5),\n" +
            "(4305, 'SIC', 2955, 1700, 2, 2963, 1741, 4),\n" +
            "(4306, 'NAICS', 1625, 541, 2, 1698, 541850, 5),\n" +
            "(4307, 'SIC', 4308, 20, 1, 3044, 2120, 3),\n" +
            "(4308, 'NAICS', 2037, 81, 1, 2077, 81219, 4),\n" +
            "(4309, 'NAICS', 2082, 81221, 4, 2081, 812210, 5),\n" +
            "(4310, 'SEC', 2756, 8050, 3, 2757, 8051, 4),\n" +
            "(4311, 'NAICS', 1944, 7111, 3, 1948, 71112, 4),\n" +
            "(4312, 'SEC', 2762, 8080, 3, 2763, 8082, 4),\n" +
            "(4313, 'SIC', 4308, 20, 1, 3063, 2254, 4),\n" +
            "(4314, 'NAICS', 1944, 7111, 3, 1951, 711190, 5),\n" +
            "(4315, 'SIC', 3911, 5990, 3, 3916, 5999, 4),\n" +
            "(4316, 'SIC', 3945, 6160, 3, 3946, 6162, 4);\n";
    static String industryCodeInsert19 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(4317, 'SIC', 4312, 60, 1, 3930, 6062, 4),\n" +
            "(4318, 'SEC', 2659, 6100, 2, 2666, 6159, 4),\n" +
            "(4319, 'NAICS', 205, 23, 1, 206, 236, 2),\n" +
            "(4320, 'NAICS', 2139, 92111, 4, 2138, 921110, 5),\n" +
            "(4321, 'SIC', 4017, 7200, 2, 4035, 7260, 3),\n" +
            "(4322, 'NAICS', 156, 2123, 3, 164, 212322, 5),\n" +
            "(4323, 'NAICS', 1485, 522, 2, 1499, 52222, 4),\n" +
            "(4324, 'SEC', 2353, 3100, 2, 2354, 3140, 3),\n" +
            "(4325, 'SIC', 3272, 3080, 3, 3276, 3084, 4),\n" +
            "(4326, 'SEC', 2591, 5100, 2, 2603, 5180, 3),\n" +
            "(4327, 'SIC', 3715, 5000, 2, 3749, 5080, 3),\n" +
            "(4328, 'SIC', 4097, 7540, 3, 4099, 7549, 4),\n" +
            "(4329, 'SIC', 4273, 9440, 3, 4274, 9441, 4),\n" +
            "(4330, 'SIC', 4125, 7900, 2, 4138, 7952, 4),\n" +
            "(4331, 'NAICS', 183, 22111, 4, 184, 221111, 5),\n" +
            "(4332, 'NAICS', 1522, 52314, 4, 1521, 523140, 5),\n" +
            "(4333, 'SIC', 4308, 20, 1, 2991, 2024, 4),\n" +
            "(4334, 'SEC', 2796, 70, 1, 2726, 7371, 4),\n" +
            "(4335, 'SIC', 4308, 20, 1, 3051, 2210, 3),\n" +
            "(4336, 'NAICS', 1897, 62211, 4, 1896, 622110, 5),\n" +
            "(4337, 'NAICS', 144, 2122, 3, 151, 212231, 5),\n" +
            "(4338, 'NAICS', 1554, 525, 2, 1562, 5259, 3),\n" +
            "(4339, 'SIC', 4308, 20, 1, 3003, 2044, 4),\n" +
            "(4340, 'SIC', 3008, 2050, 3, 3009, 2051, 4),\n" +
            "(4341, 'SIC', 4307, 15, 1, 2952, 1622, 4),\n" +
            "(4342, 'SIC', 4308, 20, 1, 3353, 3340, 3),\n" +
            "(4343, 'SIC', 3857, 5620, 3, 3858, 5621, 4),\n" +
            "(4344, 'NAICS', 1812, 61, 1, 1832, 611511, 5),\n" +
            "(4345, 'SIC', 4309, 40, 1, 3644, 4449, 4),\n" +
            "(4346, 'NAICS', 2166, 923, 2, 2172, 923130, 5),\n" +
            "(4347, 'SIC', 2982, 2000, 2, 2992, 2026, 4),\n" +
            "(4348, 'SIC', 3693, 4900, 2, 3702, 4931, 4),\n" +
            "(4349, 'SIC', 3059, 2250, 3, 3061, 2252, 4),\n" +
            "(4350, 'SIC', 4313, 70, 1, 4034, 7251, 4),\n" +
            "(4351, 'NAICS', 1850, 62, 1, 1906, 623110, 5),\n" +
            "(4352, 'NAICS', 2, 111, 2, 6, 111120, 5),\n" +
            "(4353, 'NAICS', 931, 423, 2, 940, 42314, 4),\n" +
            "(4354, 'NAICS', 2053, 81121, 4, 2057, 811219, 5),\n" +
            "(4355, 'NAICS', 2136, 921, 2, 2145, 92114, 4),\n" +
            "(4356, 'SEC', 2355, 3200, 2, 2369, 3281, 4),\n" +
            "(4357, 'SEC', 2791, 20, 1, 2333, 2860, 3),\n" +
            "(4358, 'NAICS', 1813, 611, 2, 1814, 6111, 3),\n" +
            "(4359, 'NAICS', 2, 111, 2, 9, 11113, 4),\n" +
            "(4360, 'NAICS', 930, 42, 1, 1067, 424710, 5),\n" +
            "(4361, 'SEC', 2786, 9720, 3, 2787, 9721, 4),\n" +
            "(4362, 'SIC', 3555, 3820, 3, 3557, 3822, 4),\n" +
            "(4363, 'SIC', 4305, 1, 1, 2881, 921, 4),\n" +
            "(4364, 'SIC', 4310, 50, 1, 3750, 5082, 4),\n" +
            "(4365, 'NAICS', 74, 11233, 4, 73, 112330, 5),\n" +
            "(4366, 'NAICS', 181, 221, 2, 202, 22132, 4),\n" +
            "(4367, 'NAICS', 2020, 722, 2, 2031, 7225, 3),\n" +
            "(4368, 'SIC', 2993, 2030, 3, 2997, 2035, 4),\n" +
            "(4369, 'NAICS', 2, 111, 2, 41, 111421, 5),\n" +
            "(4370, 'NAICS', 1726, 561, 2, 1783, 561790, 5),\n" +
            "(4371, 'NAICS', 1, 11, 1, 86, 112511, 5),\n" +
            "(4372, 'SIC', 3636, 4400, 2, 3653, 4499, 4),\n" +
            "(4373, 'SIC', 4305, 1, 1, 2872, 831, 4),\n" +
            "(4374, 'SIC', 3674, 4740, 3, 3675, 4741, 4),\n" +
            "(4375, 'SIC', 4310, 50, 1, 3786, 5154, 4),\n" +
            "(4376, 'NAICS', 1980, 7131, 3, 1982, 71311, 4),\n" +
            "(4377, 'NAICS', 205, 23, 1, 219, 2371, 3),\n" +
            "(4378, 'NAICS', 1514, 5231, 3, 1519, 523130, 5),\n" +
            "(4379, 'SIC', 4146, 8000, 2, 4166, 8070, 3),\n" +
            "(4380, 'SEC', 2794, 52, 1, 2640, 5900, 2),\n" +
            "(4381, 'SIC', 4308, 20, 1, 3413, 3494, 4),\n" +
            "(4382, 'NAICS', 1942, 71, 1, 1979, 713, 2),\n" +
            "(4383, 'NAICS', 2005, 7211, 3, 2012, 721199, 5),\n" +
            "(4384, 'NAICS', 2135, 92, 1, 2163, 92216, 4),\n" +
            "(4385, 'SEC', 2408, 3530, 3, 2412, 3537, 4),\n" +
            "(4386, 'NAICS', 1725, 56, 1, 1781, 561740, 5),\n" +
            "(4387, 'SIC', 4178, 8200, 2, 4182, 8221, 4),\n" +
            "(4388, 'SIC', 4040, 7300, 2, 4043, 7312, 4),\n" +
            "(4389, 'NAICS', 2182, 925, 2, 2187, 92512, 4),\n" +
            "(4390, 'SIC', 3149, 2510, 3, 3155, 2519, 4),\n" +
            "(4391, 'NAICS', 205, 23, 1, 273, 2389, 3),\n" +
            "(4392, 'SEC', 2302, 2700, 2, 2315, 2770, 3),\n" +
            "(4393, 'NAICS', 1758, 5615, 3, 1763, 56159, 4),\n" +
            "(4394, 'SIC', 3729, 5040, 3, 3732, 5045, 4),\n" +
            "(4395, 'NAICS', 205, 23, 1, 210, 236116, 5),\n" +
            "(4396, 'NAICS', 1480, 52, 1, 1510, 52232, 4),\n" +
            "(4397, 'NAICS', 1979, 713, 2, 1985, 7132, 3),\n" +
            "(4398, 'SEC', 2713, 7300, 2, 2729, 7374, 4),\n" +
            "(4399, 'SIC', 4259, 9220, 3, 4262, 9223, 4),\n" +
            "(4400, 'SEC', 2424, 3570, 3, 2429, 3578, 4),\n" +
            "(4401, 'NAICS', 180, 22, 1, 194, 221122, 5),\n" +
            "(4402, 'SIC', 3804, 5200, 2, 3810, 5251, 4),\n" +
            "(4403, 'NAICS', 1624, 54, 1, 1713, 54193, 4),\n" +
            "(4404, 'NAICS', 167, 21239, 4, 170, 212393, 5),\n" +
            "(4405, 'SIC', 2982, 2000, 2, 3012, 2060, 3),\n" +
            "(4406, 'NAICS', 955, 4234, 3, 969, 42349, 4),\n" +
            "(4407, 'SIC', 3191, 2710, 3, 3192, 2711, 4),\n" +
            "(4408, 'SIC', 4308, 20, 1, 3420, 3510, 3),\n" +
            "(4409, 'SIC', 4308, 20, 1, 3347, 3324, 4),\n" +
            "(4410, 'SIC', 3301, 3200, 2, 3314, 3255, 4),\n" +
            "(4411, 'SIC', 4313, 70, 1, 4183, 8222, 4),\n" +
            "(4412, 'NAICS', 931, 423, 2, 988, 42373, 4),\n" +
            "(4413, 'NAICS', 1657, 5414, 3, 1662, 541430, 5),\n" +
            "(4414, 'SIC', 4308, 20, 1, 3077, 2290, 3),\n" +
            "(4415, 'NAICS', 1020, 42412, 4, 1019, 424120, 5),\n" +
            "(4416, 'SIC', 3992, 6700, 2, 4003, 6792, 4),\n" +
            "(4417, 'SIC', 3854, 5600, 2, 3867, 5690, 3),\n" +
            "(4418, 'NAICS', 1640, 5413, 3, 1650, 54135, 4),\n" +
            "(4419, 'NAICS', 2004, 721, 2, 2019, 72131, 4),\n" +
            "(4420, 'SIC', 4314, 90, 1, 4302, 9900, 2),\n" +
            "(4421, 'NAICS', 1640, 5413, 3, 1655, 541380, 5),\n" +
            "(4422, 'NAICS', 1, 11, 1, 53, 111991, 5),\n" +
            "(4423, 'SEC', 2791, 20, 1, 2349, 3080, 3),\n" +
            "(4424, 'NAICS', 1569, 53, 1, 1600, 53221, 4),\n" +
            "(4425, 'NAICS', 1836, 6116, 3, 1846, 611699, 5),\n" +
            "(4426, 'SEC', 2476, 3800, 2, 2494, 3850, 3),\n" +
            "(4427, 'NAICS', 2037, 81, 1, 2043, 811113, 5),\n" +
            "(4428, 'NAICS', 1625, 541, 2, 1632, 541191, 5),\n" +
            "(4429, 'SIC', 4308, 20, 1, 3374, 3412, 4),\n" +
            "(4430, 'SIC', 4017, 7200, 2, 4028, 7221, 4),\n" +
            "(4431, 'SIC', 3958, 6300, 2, 3964, 6330, 3),\n" +
            "(4432, 'NAICS', 235, 238, 2, 240, 23812, 4),\n" +
            "(4433, 'NAICS', 2027, 72233, 4, 2026, 722330, 5),\n" +
            "(4434, 'SEC', 2792, 40, 1, 2520, 4220, 3),\n" +
            "(4435, 'SIC', 4310, 50, 1, 3766, 5113, 4),\n" +
            "(4436, 'SEC', 2283, 2500, 2, 2289, 2531, 4),\n" +
            "(4437, 'SIC', 3050, 2200, 2, 3068, 2261, 4),\n" +
            "(4438, 'SEC', 2794, 52, 1, 2626, 5650, 3),\n" +
            "(4439, 'SIC', 4308, 20, 1, 3215, 2810, 3),\n" +
            "(4440, 'SIC', 3762, 5100, 2, 3774, 5140, 3),\n" +
            "(4441, 'SIC', 3613, 4140, 3, 3615, 4142, 4),\n" +
            "(4442, 'NAICS', 1851, 621, 2, 1869, 621391, 5),\n" +
            "(4443, 'SEC', 2791, 20, 1, 2343, 3010, 3),\n" +
            "(4444, 'NAICS', 2070, 81149, 4, 2069, 811490, 5),\n" +
            "(4445, 'SIC', 4310, 50, 1, 3802, 5198, 4),\n" +
            "(4446, 'NAICS', 982, 4237, 3, 983, 423710, 5),\n" +
            "(4447, 'SEC', 2659, 6100, 2, 2662, 6140, 3),\n" +
            "(4448, 'SIC', 3419, 3500, 2, 3469, 3581, 4),\n" +
            "(4449, 'SIC', 4109, 7690, 3, 4110, 7692, 4),\n" +
            "(4450, 'NAICS', 2135, 92, 1, 2137, 9211, 3),\n" +
            "(4451, 'SIC', 3496, 3640, 3, 3499, 3644, 4),\n" +
            "(4452, 'SEC', 2796, 70, 1, 4329, 7385, 4),\n" +
            "(4453, 'SIC', 4007, 7000, 2, 4014, 7033, 4),\n" +
            "(4454, 'SEC', 2788, 1, 1, 2213, 800, 2),\n" +
            "(4455, 'SIC', 2825, 200, 2, 2845, 290, 3),\n" +
            "(4456, 'SEC', 2791, 20, 1, 2338, 2910, 3),\n" +
            "(4457, 'SIC', 4308, 20, 1, 3080, 2297, 4),\n" +
            "(4458, 'SIC', 4284, 9600, 2, 4286, 9611, 4),\n" +
            "(4459, 'SIC', 3928, 6060, 3, 3929, 6061, 4),\n" +
            "(4460, 'SIC', 3093, 2330, 3, 3096, 2337, 4),\n" +
            "(4461, 'NAICS', 173, 2131, 3, 178, 213114, 5),\n" +
            "(4462, 'NAICS', 1741, 5614, 3, 1751, 56144, 4),\n" +
            "(4463, 'NAICS', 1859, 6213, 3, 1867, 62134, 4),\n" +
            "(4464, 'SEC', 2791, 20, 1, 2372, 3310, 3),\n" +
            "(4465, 'SEC', 2753, 8000, 2, 2755, 8011, 4),\n" +
            "(4466, 'NAICS', 1015, 424, 2, 1024, 424210, 5),\n" +
            "(4467, 'SIC', 3337, 3300, 2, 3342, 3316, 4),\n" +
            "(4468, 'SIC', 4101, 7620, 3, 4102, 7622, 4),\n" +
            "(4469, 'NAICS', 235, 238, 2, 271, 238390, 5),\n" +
            "(4470, 'NAICS', 1570, 531, 2, 1583, 5313, 3),\n" +
            "(4471, 'SIC', 3715, 5000, 2, 3730, 5043, 4),\n" +
            "(4472, 'SIC', 4252, 9130, 3, 4253, 9131, 4),\n" +
            "(4473, 'NAICS', 1942, 71, 1, 1970, 7121, 3),\n" +
            "(4474, 'NAICS', 2037, 81, 1, 2100, 81293, 4),\n" +
            "(4475, 'SIC', 3124, 2400, 2, 3139, 2448, 4),\n" +
            "(4476, 'SIC', 2982, 2000, 2, 3026, 2080, 3),\n" +
            "(4477, 'NAICS', 1624, 54, 1, 1677, 541614, 5),\n" +
            "(4478, 'NAICS', 1725, 56, 1, 1740, 56133, 4),\n" +
            "(4479, 'SIC', 4308, 20, 1, 3421, 3511, 4),\n" +
            "(4480, 'NAICS', 1798, 5622, 3, 1799, 56221, 4),\n" +
            "(4481, 'NAICS', 930, 42, 1, 985, 423720, 5),\n" +
            "(4482, 'SIC', 3059, 2250, 3, 3065, 2258, 4),\n" +
            "(4483, 'NAICS', 1485, 522, 2, 1498, 522220, 5),\n" +
            "(4484, 'NAICS', 1666, 5415, 3, 1668, 541511, 5),\n" +
            "(4485, 'NAICS', 1774, 5617, 3, 1782, 56174, 4),\n" +
            "(4486, 'NAICS', 2038, 811, 2, 2065, 811420, 5),\n" +
            "(4487, 'SIC', 4312, 60, 1, 3977, 6500, 2),\n" +
            "(4488, 'NAICS', 1689, 5418, 3, 1698, 541850, 5),\n" +
            "(4489, 'NAICS', 1625, 541, 2, 1647, 541340, 5),\n" +
            "(4490, 'NAICS', 1851, 621, 2, 1862, 621320, 5),\n" +
            "(4491, 'SIC', 3115, 2390, 3, 3118, 2393, 4),\n" +
            "(4492, 'NAICS', 1402, 51, 1, 1404, 5111, 3),\n" +
            "(4493, 'NAICS', 930, 42, 1, 993, 42381, 4),\n" +
            "(4494, 'NAICS', 1960, 71131, 4, 1959, 711310, 5),\n" +
            "(4495, 'SEC', 2446, 3660, 3, 2448, 3663, 4),\n" +
            "(4496, 'NAICS', 1, 11, 1, 54, 111992, 5),\n" +
            "(4497, 'NAICS', 1570, 531, 2, 1579, 53119, 4),\n" +
            "(4498, 'SIC', 4256, 9200, 2, 4262, 9223, 4),\n" +
            "(4499, 'NAICS', 67, 11221, 4, 66, 112210, 5),\n" +
            "(4500, 'NAICS', 930, 42, 1, 939, 423140, 5),\n" +
            "(4501, 'NAICS', 1, 11, 1, 103, 113210, 5),\n" +
            "(4502, 'SEC', 2789, 10, 1, 2226, 1382, 4),\n" +
            "(4503, 'SIC', 4040, 7300, 2, 4044, 7313, 4),\n" +
            "(4504, 'SIC', 2825, 200, 2, 2841, 271, 4),\n" +
            "(4505, 'NAICS', 2037, 81, 1, 2089, 81232, 4),\n" +
            "(4506, 'NAICS', 2017, 7213, 3, 2018, 721310, 5),\n" +
            "(4507, 'NAICS', 1726, 561, 2, 1766, 5616, 3),\n" +
            "(4508, 'NAICS', 2037, 81, 1, 2117, 8134, 3),\n" +
            "(4509, 'SIC', 2805, 130, 3, 2809, 134, 4),\n" +
            "(4510, 'NAICS', 1725, 56, 1, 1795, 562111, 5),\n" +
            "(4511, 'SIC', 4308, 20, 1, 3295, 3161, 4),\n" +
            "(4512, 'SIC', 3762, 5100, 2, 3770, 5131, 4),\n" +
            "(4513, 'SIC', 4311, 52, 1, 3820, 5390, 3),\n" +
            "(4514, 'SIC', 3587, 3950, 3, 3590, 3953, 4),\n" +
            "(4515, 'NAICS', 1850, 62, 1, 1890, 62191, 4),\n" +
            "(4516, 'NAICS', 2003, 72, 1, 2027, 72233, 4),\n" +
            "(4517, 'SIC', 2982, 2000, 2, 3027, 2082, 4),\n" +
            "(4518, 'SIC', 3206, 2770, 3, 3207, 2771, 4),\n" +
            "(4519, 'SIC', 4312, 60, 1, 3967, 6351, 4),\n" +
            "(4520, 'SIC', 4311, 52, 1, 3867, 5690, 3),\n" +
            "(4521, 'NAICS', 1431, 5122, 3, 1439, 51224, 4),\n" +
            "(4522, 'SEC', 2793, 50, 1, 2600, 5170, 3),\n" +
            "(4523, 'NAICS', 132, 21, 1, 168, 212391, 5),\n" +
            "(4524, 'NAICS', 236, 2381, 3, 248, 23816, 4),\n" +
            "(4525, 'NAICS', 19, 1112, 3, 21, 111211, 5),\n" +
            "(4526, 'NAICS', 1851, 621, 2, 1860, 621310, 5),\n" +
            "(4527, 'SIC', 3870, 5710, 3, 3872, 5713, 4),\n" +
            "(4528, 'SEC', 2791, 20, 1, 2391, 3440, 3),\n" +
            "(4529, 'SIC', 3124, 2400, 2, 3143, 2452, 4),\n" +
            "(4530, 'NAICS', 2107, 8132, 3, 2110, 813212, 5),\n" +
            "(4531, 'NAICS', 1402, 51, 1, 1430, 512199, 5),\n" +
            "(4532, 'NAICS', 2040, 81111, 4, 2044, 811118, 5),\n" +
            "(4533, 'NAICS', 2135, 92, 1, 2176, 924, 2),\n" +
            "(4534, 'SIC', 4308, 20, 1, 3294, 3160, 3),\n" +
            "(4535, 'SIC', 3419, 3500, 2, 3442, 3548, 4),\n" +
            "(4536, 'NAICS', 172, 213, 2, 174, 21311, 4),\n" +
            "(4537, 'SIC', 3371, 3400, 2, 3401, 3470, 3),\n" +
            "(4538, 'NAICS', 1850, 62, 1, 1895, 6221, 3),\n" +
            "(4539, 'SIC', 3907, 5980, 3, 3909, 5984, 4),\n" +
            "(4540, 'NAICS', 1792, 562, 2, 1806, 56291, 4),\n" +
            "(4541, 'SIC', 3434, 3540, 3, 3436, 3542, 4),\n" +
            "(4542, 'NAICS', 1725, 56, 1, 1792, 562, 2),\n" +
            "(4543, 'NAICS', 2188, 926, 2, 2193, 92612, 4),\n" +
            "(4544, 'NAICS', 1944, 7111, 3, 1950, 71113, 4),\n" +
            "(4545, 'SIC', 3261, 3000, 2, 3281, 3089, 4),\n" +
            "(4546, 'NAICS', 2130, 81399, 4, 2129, 813990, 5),\n" +
            "(4547, 'NAICS', 1480, 52, 1, 1525, 52321, 4),\n" +
            "(4548, 'SIC', 3526, 3700, 2, 3546, 3764, 4),\n" +
            "(4549, 'SIC', 3050, 2200, 2, 3082, 2299, 4),\n" +
            "(4550, 'SIC', 4308, 20, 1, 3466, 3578, 4),\n" +
            "(4551, 'NAICS', 1987, 71321, 4, 1986, 713210, 5),\n" +
            "(4552, 'SIC', 4309, 40, 1, 3674, 4740, 3),\n" +
            "(4553, 'NAICS', 2166, 923, 2, 2167, 9231, 3),\n" +
            "(4554, 'SEC', 2713, 7300, 2, 2717, 7330, 3),\n" +
            "(4555, 'SIC', 4146, 8000, 2, 4170, 8082, 4),\n" +
            "(4556, 'NAICS', 1850, 62, 1, 1916, 623312, 5),\n" +
            "(4557, 'SIC', 4310, 50, 1, 3728, 5039, 4),\n" +
            "(4558, 'SIC', 4113, 7800, 2, 4118, 7822, 4),\n" +
            "(4559, 'NAICS', 1725, 56, 1, 1779, 561730, 5),\n" +
            "(4560, 'NAICS', 1620, 533, 2, 1622, 533110, 5),\n" +
            "(4561, 'SEC', 2791, 20, 1, 2462, 3714, 4),\n" +
            "(4562, 'SIC', 4311, 52, 1, 3817, 5311, 4),\n" +
            "(4563, 'SEC', 2714, 7310, 3, 2715, 7311, 4),\n" +
            "(4564, 'NAICS', 236, 2381, 3, 242, 23813, 4),\n" +
            "(4565, 'SIC', 4146, 8000, 2, 4174, 8099, 4),\n" +
            "(4566, 'NAICS', 138, 212, 2, 160, 212313, 5),\n" +
            "(4567, 'NAICS', 1, 11, 1, 29, 111331, 5),\n" +
            "(4568, 'NAICS', 1624, 54, 1, 1684, 54171, 4),\n" +
            "(4569, 'SEC', 2631, 5710, 3, 2632, 5712, 4),\n" +
            "(4570, 'SIC', 4308, 20, 1, 3186, 2676, 4),\n" +
            "(4571, 'SIC', 4306, 10, 1, 2927, 1446, 4),\n" +
            "(4572, 'SEC', 2539, 4800, 2, 2546, 4832, 4),\n" +
            "(4573, 'SEC', 2793, 50, 1, 2577, 5050, 3),\n" +
            "(4574, 'NAICS', 1583, 5313, 3, 1589, 531390, 5),\n" +
            "(4575, 'SEC', 2738, 7800, 2, 2747, 7841, 4),\n" +
            "(4576, 'SIC', 4298, 9710, 3, 4299, 9711, 4),\n" +
            "(4577, 'NAICS', 156, 2123, 3, 168, 212391, 5),\n" +
            "(4578, 'NAICS', 1569, 53, 1, 1575, 53112, 4),\n" +
            "(4579, 'SEC', 2276, 2400, 2, 2282, 2452, 4),\n" +
            "(4580, 'SIC', 4306, 10, 1, 2902, 1220, 3),\n" +
            "(4581, 'SIC', 3148, 2500, 2, 3151, 2512, 4),\n" +
            "(4582, 'SIC', 3865, 5660, 3, 3866, 5661, 4),\n" +
            "(4583, 'NAICS', 1015, 424, 2, 1086, 42495, 4),\n" +
            "(4584, 'NAICS', 930, 42, 1, 999, 42384, 4),\n" +
            "(4585, 'NAICS', 1537, 5241, 3, 1542, 524126, 5),\n" +
            "(4586, 'NAICS', 2132, 8141, 3, 2133, 814110, 5),\n" +
            "(4587, 'SIC', 4089, 7530, 3, 4096, 7539, 4),\n" +
            "(4588, 'NAICS', 930, 42, 1, 1041, 42443, 4),\n" +
            "(4589, 'NAICS', 1625, 541, 2, 1644, 54132, 4),\n" +
            "(4590, 'SEC', 2677, 6300, 2, 2685, 6350, 3),\n" +
            "(4591, 'SIC', 4186, 8240, 3, 4189, 8249, 4),\n" +
            "(4592, 'NAICS', 1, 11, 1, 3, 1111, 3),\n" +
            "(4593, 'NAICS', 1851, 621, 2, 1856, 6212, 3),\n" +
            "(4594, 'SIC', 3214, 2800, 2, 3229, 2836, 4),\n" +
            "(4595, 'NAICS', 1554, 525, 2, 1557, 52511, 4),\n" +
            "(4596, 'NAICS', 1829, 61143, 4, 1828, 611430, 5),\n" +
            "(4597, 'SIC', 4277, 9500, 2, 4278, 9510, 3),\n" +
            "(4598, 'SIC', 3172, 2630, 3, 3173, 2631, 4),\n" +
            "(4599, 'SIC', 3740, 5060, 3, 3741, 5063, 4),\n" +
            "(4600, 'SEC', 2591, 5100, 2, 2604, 5190, 3),\n" +
            "(4601, 'SIC', 3949, 6210, 3, 3950, 6211, 4),\n" +
            "(4602, 'SIC', 4313, 70, 1, 4186, 8240, 3),\n" +
            "(4603, 'NAICS', 2037, 81, 1, 2106, 81311, 4),\n" +
            "(4604, 'NAICS', 1838, 61161, 4, 1837, 611610, 5),\n" +
            "(4605, 'NAICS', 1480, 52, 1, 1538, 52411, 4),\n" +
            "(4606, 'SIC', 2918, 1400, 2, 2937, 1490, 3),\n" +
            "(4607, 'NAICS', 1402, 51, 1, 1461, 51741, 4),\n" +
            "(4608, 'NAICS', 1665, 54149, 4, 1664, 541490, 5),\n" +
            "(4609, 'SIC', 3272, 3080, 3, 3281, 3089, 4),\n" +
            "(4610, 'NAICS', 1537, 5241, 3, 1546, 52413, 4),\n" +
            "(4611, 'SIC', 3419, 3500, 2, 3456, 3565, 4),\n" +
            "(4612, 'NAICS', 1979, 713, 2, 1980, 7131, 3),\n" +
            "(4613, 'NAICS', 1725, 56, 1, 1729, 56111, 4),\n" +
            "(4614, 'SEC', 2791, 20, 1, 2428, 3577, 4),\n" +
            "(4615, 'SIC', 3103, 2360, 3, 3104, 2361, 4),\n" +
            "(4616, 'SIC', 3269, 3060, 3, 3271, 3069, 4),\n" +
            "(4617, 'NAICS', 1888, 6219, 3, 1893, 621999, 5),\n" +
            "(4618, 'NAICS', 2020, 722, 2, 2026, 722330, 5),\n" +
            "(4619, 'NAICS', 1004, 4239, 3, 1006, 42391, 4),\n" +
            "(4620, 'NAICS', 970, 4235, 3, 972, 42351, 4),\n" +
            "(4621, 'NAICS', 1850, 62, 1, 1852, 6211, 3),\n" +
            "(4622, 'SIC', 3050, 2200, 2, 3054, 2221, 4),\n" +
            "(4623, 'NAICS', 2204, 928, 2, 2205, 9281, 3),\n" +
            "(4624, 'SIC', 4311, 52, 1, 3894, 5941, 4),\n" +
            "(4625, 'NAICS', 255, 23821, 4, 254, 238210, 5),\n" +
            "(4626, 'NAICS', 1774, 5617, 3, 1784, 56179, 4),\n" +
            "(4627, 'SIC', 4308, 20, 1, 3542, 3750, 3),\n" +
            "(4628, 'SIC', 3918, 6010, 3, 3919, 6011, 4),\n" +
            "(4629, 'NAICS', 1480, 52, 1, 1507, 522310, 5),\n" +
            "(4630, 'SEC', 2791, 20, 1, 2486, 3827, 4),\n" +
            "(4631, 'SEC', 2791, 20, 1, 2458, 3700, 2),\n" +
            "(4632, 'SIC', 3106, 2370, 3, 3107, 2371, 4),\n" +
            "(4633, 'SIC', 3633, 4300, 2, 3634, 4310, 3),\n" +
            "(4634, 'SIC', 3371, 3400, 2, 3400, 3469, 4),\n" +
            "(4635, 'SIC', 3762, 5100, 2, 3789, 5162, 4),\n" +
            "(4636, 'NAICS', 1408, 51112, 4, 1407, 511120, 5),\n" +
            "(4637, 'NAICS', 2020, 722, 2, 2024, 722320, 5),\n" +
            "(4638, 'SIC', 3156, 2520, 3, 3158, 2522, 4),\n" +
            "(4639, 'NAICS', 1979, 713, 2, 1993, 713920, 5),\n" +
            "(4640, 'SIC', 4308, 20, 1, 3271, 3069, 4),\n" +
            "(4641, 'NAICS', 260, 2383, 3, 268, 23834, 4),\n" +
            "(4642, 'SEC', 2384, 3400, 2, 2387, 3412, 4),\n" +
            "(4643, 'SIC', 4308, 20, 1, 3046, 2130, 3),\n" +
            "(4644, 'SIC', 4308, 20, 1, 3447, 3554, 4),\n" +
            "(4645, 'SIC', 3809, 5250, 3, 3810, 5251, 4),\n" +
            "(4646, 'SEC', 2659, 6100, 2, 2661, 6111, 4),\n" +
            "(4647, 'SIC', 3576, 3900, 2, 3588, 3951, 4),\n" +
            "(4648, 'SIC', 3520, 3690, 3, 3521, 3691, 4),\n" +
            "(4649, 'NAICS', 1725, 56, 1, 1802, 562213, 5),\n" +
            "(4650, 'SIC', 4313, 70, 1, 4219, 8660, 3),\n" +
            "(4651, 'SIC', 4041, 7310, 3, 4043, 7312, 4),\n" +
            "(4652, 'SEC', 2488, 3840, 3, 2491, 3843, 4),\n" +
            "(4653, 'SEC', 2792, 40, 1, 2525, 4412, 4),\n" +
            "(4654, 'SEC', 2796, 70, 1, 2738, 7800, 2),\n" +
            "(4655, 'SIC', 3837, 5500, 2, 3851, 5571, 4),\n" +
            "(4656, 'SIC', 4120, 7830, 3, 4122, 7833, 4),\n" +
            "(4657, 'NAICS', 218, 237, 2, 234, 23799, 4),\n" +
            "(4658, 'SIC', 4311, 52, 1, 3830, 5441, 4),\n" +
            "(4659, 'NAICS', 2119, 81341, 4, 2118, 813410, 5),\n" +
            "(4660, 'SIC', 3544, 3760, 3, 3547, 3769, 4),\n" +
            "(4661, 'SIC', 3729, 5040, 3, 3730, 5043, 4),\n" +
            "(4662, 'NAICS', 2207, 92811, 4, 2206, 928110, 5),\n" +
            "(4663, 'SIC', 4308, 20, 1, 3007, 2048, 4),\n" +
            "(4664, 'SEC', 2796, 70, 1, 2734, 7389, 4),\n" +
            "(4665, 'SIC', 2825, 200, 2, 2829, 213, 4),\n" +
            "(4666, 'NAICS', 931, 423, 2, 963, 42344, 4),\n" +
            "(4667, 'SEC', 2240, 2000, 2, 2242, 2011, 4),\n" +
            "(4668, 'SIC', 4313, 70, 1, 4111, 7694, 4),\n" +
            "(4669, 'SIC', 4309, 40, 1, 3713, 4970, 3),\n" +
            "(4670, 'SIC', 4192, 8300, 2, 4193, 8320, 3),\n" +
            "(4671, 'SIC', 3797, 5190, 3, 3803, 5199, 4),\n" +
            "(4672, 'NAICS', 1979, 713, 2, 1998, 71394, 4),\n" +
            "(4673, 'NAICS', 1559, 52512, 4, 1558, 525120, 5),\n" +
            "(4674, 'NAICS', 2061, 8114, 3, 2069, 811490, 5),\n" +
            "(4675, 'SIC', 3637, 4410, 3, 3638, 4412, 4),\n" +
            "(4676, 'NAICS', 180, 22, 1, 190, 221117, 5),\n" +
            "(4677, 'SIC', 4307, 15, 1, 2961, 1731, 4),\n" +
            "(4678, 'SIC', 3200, 2750, 3, 3202, 2754, 4),\n" +
            "(4679, 'NAICS', 1076, 4249, 3, 1088, 42499, 4),\n" +
            "(4680, 'SIC', 3167, 2600, 2, 3185, 2675, 4),\n" +
            "(4681, 'SIC', 4308, 20, 1, 3428, 3532, 4),\n" +
            "(4682, 'NAICS', 991, 4238, 3, 998, 423840, 5),\n" +
            "(4683, 'SIC', 4308, 20, 1, 3360, 3356, 4),\n" +
            "(4684, 'SIC', 4310, 50, 1, 3745, 5072, 4),\n" +
            "(4685, 'NAICS', 1469, 51821, 4, 1468, 518210, 5),\n" +
            "(4686, 'NAICS', 1666, 5415, 3, 1667, 54151, 4),\n" +
            "(4687, 'NAICS', 1402, 51, 1, 1413, 51119, 4),\n" +
            "(4688, 'SIC', 4308, 20, 1, 3550, 3795, 4),\n" +
            "(4689, 'SIC', 4040, 7300, 2, 4050, 7331, 4),\n" +
            "(4690, 'SEC', 2662, 6140, 3, 2663, 6141, 4),\n" +
            "(4691, 'SIC', 4015, 7040, 3, 4016, 7041, 4),\n" +
            "(4692, 'SIC', 4313, 70, 1, 4195, 8330, 3),\n" +
            "(4693, 'NAICS', 1431, 5122, 3, 1435, 51222, 4),\n" +
            "(4694, 'SIC', 4310, 50, 1, 3773, 5139, 4),\n" +
            "(4695, 'SIC', 3252, 2900, 2, 3260, 2999, 4),\n" +
            "(4696, 'SIC', 3693, 4900, 2, 3697, 4922, 4),\n" +
            "(4697, 'SIC', 3605, 4100, 2, 3608, 4119, 4),\n" +
            "(4698, 'NAICS', 2039, 8111, 3, 2050, 811192, 5),\n" +
            "(4699, 'NAICS', 1921, 6241, 3, 1924, 624120, 5),\n" +
            "(4700, 'NAICS', 1015, 424, 2, 1037, 42441, 4),\n" +
            "(4701, 'NAICS', 1871, 6214, 3, 1872, 621410, 5),\n" +
            "(4702, 'SEC', 2796, 70, 1, 2774, 8700, 2),\n" +
            "(4703, 'SIC', 3287, 3140, 3, 3288, 3142, 4),\n" +
            "(4704, 'SIC', 2975, 1790, 3, 2980, 1796, 4),\n" +
            "(4705, 'SEC', 2568, 5000, 2, 2572, 5030, 3),\n" +
            "(4706, 'NAICS', 2200, 927, 2, 2201, 9271, 3),\n" +
            "(4707, 'SIC', 3214, 2800, 2, 3242, 2873, 4),\n" +
            "(4708, 'SIC', 3668, 4720, 3, 3670, 4725, 4),\n" +
            "(4709, 'NAICS', 150, 21223, 4, 151, 212231, 5),\n" +
            "(4710, 'SEC', 2791, 20, 1, 2304, 2711, 4),\n" +
            "(4711, 'SEC', 2792, 40, 1, 2529, 4513, 4),\n" +
            "(4712, 'NAICS', 1640, 5413, 3, 1645, 541330, 5),\n" +
            "(4713, 'NAICS', 2135, 92, 1, 2177, 9241, 3),\n" +
            "(4714, 'SIC', 4313, 70, 1, 4136, 7950, 3),\n" +
            "(4715, 'NAICS', 2071, 812, 2, 2099, 812930, 5),\n" +
            "(4716, 'SIC', 2875, 900, 2, 2880, 920, 3),\n" +
            "(4717, 'NAICS', 2177, 9241, 3, 2178, 924110, 5),\n" +
            "(4718, 'SIC', 3917, 6000, 2, 3924, 6029, 4),\n" +
            "(4719, 'SIC', 4312, 60, 1, 3986, 6531, 4),\n" +
            "(4720, 'SIC', 3474, 3590, 3, 3479, 3599, 4),\n" +
            "(4721, 'NAICS', 1813, 611, 2, 1839, 611620, 5),\n" +
            "(4722, 'SIC', 4308, 20, 1, 3314, 3255, 4),\n" +
            "(4723, 'SIC', 3715, 5000, 2, 3732, 5045, 4),\n" +
            "(4724, 'NAICS', 1813, 611, 2, 1815, 611110, 5),\n" +
            "(4725, 'NAICS', 2037, 81, 1, 2069, 811490, 5),\n" +
            "(4726, 'NAICS', 1928, 6242, 3, 1930, 62421, 4),\n" +
            "(4727, 'SEC', 2792, 40, 1, 4317, 4990, 2),\n" +
            "(4728, 'SIC', 4308, 20, 1, 2986, 2015, 4),\n" +
            "(4729, 'SIC', 3167, 2600, 2, 3173, 2631, 4),\n" +
            "(4730, 'SEC', 2630, 5700, 2, 2634, 5731, 4),\n" +
            "(4731, 'SIC', 3355, 3350, 3, 3361, 3357, 4),\n" +
            "(4732, 'NAICS', 931, 423, 2, 951, 423330, 5),\n" +
            "(4733, 'SIC', 3636, 4400, 2, 3647, 4482, 4),\n" +
            "(4734, 'SIC', 4305, 1, 1, 2883, 971, 4),\n" +
            "(4735, 'SIC', 3480, 3600, 2, 3520, 3690, 3),\n" +
            "(4736, 'SEC', 2789, 10, 1, 2215, 1000, 2),\n" +
            "(4737, 'NAICS', 940, 42314, 4, 939, 423140, 5),\n" +
            "(4738, 'NAICS', 2037, 81, 1, 2047, 811122, 5),\n" +
            "(4739, 'SEC', 2240, 2000, 2, 2258, 2092, 4),\n" +
            "(4740, 'SEC', 2403, 3500, 2, 2428, 3577, 4),\n" +
            "(4741, 'NAICS', 1624, 54, 1, 1646, 54133, 4),\n" +
            "(4742, 'NAICS', 1625, 541, 2, 1626, 5411, 3),\n" +
            "(4743, 'SIC', 4313, 70, 1, 4080, 7389, 4),\n" +
            "(4744, 'SIC', 3302, 3210, 3, 3303, 3211, 4),\n" +
            "(4745, 'NAICS', 2136, 921, 2, 2148, 921190, 5),\n" +
            "(4746, 'NAICS', 1402, 51, 1, 1459, 5174, 3),\n" +
            "(4747, 'NAICS', 132, 21, 1, 146, 21221, 4),\n" +
            "(4748, 'NAICS', 930, 42, 1, 1075, 42482, 4),\n" +
            "(4749, 'NAICS', 1851, 621, 2, 1866, 621340, 5),\n" +
            "(4750, 'SIC', 3707, 4950, 3, 3710, 4959, 4),\n" +
            "(4751, 'SIC', 4081, 7500, 2, 4097, 7540, 3),\n" +
            "(4752, 'SIC', 3601, 4000, 2, 3604, 4013, 4),\n" +
            "(4753, 'SIC', 3822, 5400, 2, 3829, 5440, 3),\n" +
            "(4754, 'SEC', 2276, 2400, 2, 2278, 2421, 4),\n" +
            "(4755, 'SEC', 2539, 4800, 2, 2549, 4841, 4),\n" +
            "(4756, 'NAICS', 23, 1113, 3, 29, 111331, 5),\n" +
            "(4757, 'SIC', 4308, 20, 1, 3059, 2250, 3),\n" +
            "(4758, 'SIC', 3831, 5450, 3, 3832, 5451, 4),\n" +
            "(4759, 'NAICS', 132, 21, 1, 158, 212311, 5),\n" +
            "(4760, 'NAICS', 1758, 5615, 3, 1761, 561520, 5),\n" +
            "(4761, 'SIC', 3042, 2110, 3, 3043, 2111, 4),\n" +
            "(4762, 'SIC', 4223, 8700, 2, 4233, 8733, 4),\n" +
            "(4763, 'SEC', 2791, 20, 1, 2255, 2082, 4),\n" +
            "(4764, 'NAICS', 138, 212, 2, 143, 212113, 5),\n" +
            "(4765, 'NAICS', 1486, 5221, 3, 1487, 522110, 5),\n" +
            "(4766, 'NAICS', 3, 1111, 3, 13, 11115, 4),\n" +
            "(4767, 'SIC', 4100, 7600, 2, 4103, 7623, 4),\n" +
            "(4768, 'SIC', 3870, 5710, 3, 3873, 5714, 4),\n" +
            "(4769, 'NAICS', 1812, 61, 1, 1842, 61163, 4),\n" +
            "(4770, 'SIC', 3762, 5100, 2, 3790, 5169, 4),\n" +
            "(4771, 'NAICS', 1480, 52, 1, 1482, 5211, 3),\n" +
            "(4772, 'NAICS', 1850, 62, 1, 1855, 621112, 5),\n" +
            "(4773, 'SIC', 4306, 10, 1, 2896, 1080, 3),\n" +
            "(4774, 'NAICS', 970, 4235, 3, 973, 423520, 5),\n" +
            "(4775, 'SIC', 4312, 60, 1, 3945, 6160, 3),\n" +
            "(4776, 'SIC', 3301, 3200, 2, 3308, 3231, 4),\n" +
            "(4777, 'SIC', 4308, 20, 1, 3233, 2843, 4),\n" +
            "(4778, 'SIC', 3937, 6100, 2, 3941, 6141, 4),\n" +
            "(4779, 'SIC', 3668, 4720, 3, 3671, 4729, 4),\n" +
            "(4780, 'NAICS', 1798, 5622, 3, 1800, 562211, 5),\n" +
            "(4781, 'NAICS', 1463, 51791, 4, 1464, 517911, 5),\n" +
            "(4782, 'SIC', 3167, 2600, 2, 3172, 2630, 3),\n" +
            "(4783, 'NAICS', 2, 111, 2, 44, 111910, 5),\n" +
            "(4784, 'NAICS', 930, 42, 1, 1008, 42392, 4),\n" +
            "(4785, 'SIC', 4308, 20, 1, 3121, 2396, 4),\n" +
            "(4786, 'SIC', 3684, 4820, 3, 3685, 4822, 4),\n" +
            "(4787, 'NAICS', 1725, 56, 1, 1728, 561110, 5),\n" +
            "(4788, 'NAICS', 2037, 81, 1, 2105, 813110, 5),\n" +
            "(4789, 'NAICS', 930, 42, 1, 1059, 424590, 5),\n" +
            "(4790, 'SIC', 4308, 20, 1, 3092, 2329, 4),\n" +
            "(4791, 'SIC', 4308, 20, 1, 3255, 2950, 3),\n" +
            "(4792, 'SEC', 2215, 1000, 2, 2217, 1090, 3),\n" +
            "(4793, 'SEC', 2795, 60, 1, 4325, 6199, 4),\n" +
            "(4794, 'SEC', 2774, 8700, 2, 2778, 8731, 4),\n" +
            "(4795, 'NAICS', 931, 423, 2, 1010, 42393, 4),\n" +
            "(4796, 'NAICS', 132, 21, 1, 164, 212322, 5),\n" +
            "(4797, 'NAICS', 1624, 54, 1, 1638, 541214, 5),\n" +
            "(4798, 'SIC', 4040, 7300, 2, 4077, 7382, 4),\n" +
            "(4799, 'SIC', 3283, 3110, 3, 3284, 3111, 4),\n" +
            "(4800, 'SIC', 3636, 4400, 2, 3652, 4493, 4),\n" +
            "(4801, 'SIC', 3886, 5900, 2, 3895, 5942, 4),\n" +
            "(4802, 'NAICS', 1625, 541, 2, 1657, 5414, 3),\n" +
            "(4803, 'SIC', 3371, 3400, 2, 3373, 3411, 4),\n" +
            "(4804, 'NAICS', 1785, 5619, 3, 1790, 561990, 5),\n" +
            "(4805, 'NAICS', 1943, 711, 2, 1959, 711310, 5),\n" +
            "(4806, 'SIC', 3261, 3000, 2, 3276, 3084, 4),\n" +
            "(4807, 'SIC', 4133, 7940, 3, 4135, 7948, 4),\n" +
            "(4808, 'NAICS', 1537, 5241, 3, 1541, 52412, 4),\n" +
            "(4809, 'SIC', 4306, 10, 1, 2910, 1310, 3),\n" +
            "(4810, 'SIC', 4146, 8000, 2, 4155, 8042, 4),\n" +
            "(4811, 'SEC', 2792, 40, 1, 2530, 4520, 3),\n" +
            "(4812, 'NAICS', 1624, 54, 1, 1660, 541420, 5),\n" +
            "(4813, 'SEC', 2791, 20, 1, 2376, 3330, 3),\n" +
            "(4814, 'SIC', 4308, 20, 1, 3487, 3625, 4);\n";
    static String industryCodeInsert20 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(4815, 'NAICS', 1419, 512, 2, 1437, 51223, 4),\n" +
            "(4816, 'SIC', 3658, 4520, 3, 3659, 4522, 4),\n" +
            "(4817, 'SIC', 4308, 20, 1, 3152, 2514, 4),\n" +
            "(4818, 'SIC', 4041, 7310, 3, 4044, 7313, 4),\n" +
            "(4819, 'NAICS', 1, 11, 1, 117, 115, 2),\n" +
            "(4820, 'NAICS', 991, 4238, 3, 992, 423810, 5),\n" +
            "(4821, 'NAICS', 1720, 5511, 3, 1722, 551111, 5),\n" +
            "(4822, 'SIC', 4313, 70, 1, 4204, 8410, 3),\n" +
            "(4823, 'SIC', 4310, 50, 1, 3763, 5110, 3),\n" +
            "(4824, 'SIC', 3762, 5100, 2, 3798, 5191, 4),\n" +
            "(4825, 'SIC', 3762, 5100, 2, 3787, 5159, 4),\n" +
            "(4826, 'SIC', 4312, 60, 1, 4000, 6732, 4),\n" +
            "(4827, 'NAICS', 1402, 51, 1, 1406, 51111, 4),\n" +
            "(4828, 'SEC', 2224, 1380, 3, 2226, 1382, 4),\n" +
            "(4829, 'SEC', 2796, 70, 1, 2716, 7320, 3),\n" +
            "(4830, 'NAICS', 133, 211, 2, 134, 2111, 3),\n" +
            "(4831, 'SEC', 2791, 20, 1, 2396, 3450, 3),\n" +
            "(4832, 'SEC', 2640, 5900, 2, 2643, 5940, 3),\n" +
            "(4833, 'NAICS', 1591, 532, 2, 1605, 53229, 4),\n" +
            "(4834, 'NAICS', 1583, 5313, 3, 1585, 531311, 5),\n" +
            "(4835, 'SIC', 2798, 100, 2, 2803, 116, 4),\n" +
            "(4836, 'NAICS', 20, 11121, 4, 22, 111219, 5),\n" +
            "(4837, 'SIC', 3724, 5030, 3, 3728, 5039, 4),\n" +
            "(4838, 'NAICS', 1640, 5413, 3, 1648, 54134, 4),\n" +
            "(4839, 'NAICS', 23, 1113, 3, 30, 111332, 5),\n" +
            "(4840, 'SEC', 2476, 3800, 2, 2487, 3829, 4),\n" +
            "(4841, 'NAICS', 2117, 8134, 3, 2119, 81341, 4),\n" +
            "(4842, 'SEC', 2302, 2700, 2, 2314, 2761, 4),\n" +
            "(4843, 'SEC', 2794, 52, 1, 2605, 5200, 2),\n" +
            "(4844, 'SIC', 3978, 6510, 3, 3981, 6514, 4),\n" +
            "(4845, 'NAICS', 1523, 5232, 3, 1524, 523210, 5),\n" +
            "(4846, 'NAICS', 1850, 62, 1, 1932, 624221, 5),\n" +
            "(4847, 'NAICS', 1850, 62, 1, 1867, 62134, 4),\n" +
            "(4848, 'SIC', 3620, 4200, 2, 3627, 4221, 4),\n" +
            "(4849, 'NAICS', 56, 112, 2, 65, 1122, 3),\n" +
            "(4850, 'NAICS', 930, 42, 1, 978, 423620, 5),\n" +
            "(4851, 'NAICS', 1992, 71391, 4, 1991, 713910, 5),\n" +
            "(4852, 'SIC', 4192, 8300, 2, 4194, 8322, 4),\n" +
            "(4853, 'SIC', 3715, 5000, 2, 3760, 5094, 4),\n" +
            "(4854, 'NAICS', 2135, 92, 1, 2139, 92111, 4),\n" +
            "(4855, 'NAICS', 946, 4233, 3, 948, 42331, 4),\n" +
            "(4856, 'NAICS', 1443, 5151, 3, 1446, 515112, 5),\n" +
            "(4857, 'SEC', 2796, 70, 1, 2756, 8050, 3),\n" +
            "(4858, 'NAICS', 930, 42, 1, 961, 42343, 4),\n" +
            "(4859, 'SIC', 3282, 3100, 2, 3286, 3131, 4),\n" +
            "(4860, 'NAICS', 1624, 54, 1, 1642, 54131, 4),\n" +
            "(4861, 'SIC', 4308, 20, 1, 3489, 3630, 3),\n" +
            "(4862, 'SIC', 3691, 4890, 3, 3692, 4899, 4),\n" +
            "(4863, 'SIC', 4313, 70, 1, 4138, 7952, 4),\n" +
            "(4864, 'NAICS', 1726, 561, 2, 1744, 56142, 4),\n" +
            "(4865, 'SEC', 2494, 3850, 3, 2495, 3851, 4),\n" +
            "(4866, 'NAICS', 1624, 54, 1, 1652, 54136, 4),\n" +
            "(4867, 'NAICS', 117, 115, 2, 123, 115114, 5),\n" +
            "(4868, 'NAICS', 1626, 5411, 3, 1633, 541199, 5),\n" +
            "(4869, 'SEC', 2224, 1380, 3, 2227, 1389, 4),\n" +
            "(4870, 'SIC', 4178, 8200, 2, 4185, 8231, 4),\n" +
            "(4871, 'SIC', 4308, 20, 1, 3392, 3450, 3),\n" +
            "(4872, 'SIC', 4313, 70, 1, 4040, 7300, 2),\n" +
            "(4873, 'SIC', 3193, 2720, 3, 3194, 2721, 4),\n" +
            "(4874, 'NAICS', 1672, 5416, 3, 1675, 541612, 5),\n" +
            "(4875, 'NAICS', 205, 23, 1, 249, 238170, 5),\n" +
            "(4876, 'NAICS', 1625, 541, 2, 1673, 54161, 4),\n" +
            "(4877, 'SIC', 3322, 3270, 3, 3325, 3273, 4),\n" +
            "(4878, 'SIC', 4308, 20, 1, 3555, 3820, 3),\n" +
            "(4879, 'SIC', 3419, 3500, 2, 3464, 3575, 4),\n" +
            "(4880, 'NAICS', 2189, 9261, 3, 2194, 926130, 5),\n" +
            "(4881, 'SIC', 3907, 5980, 3, 3908, 5983, 4),\n" +
            "(4882, 'SIC', 2993, 2030, 3, 2999, 2038, 4),\n" +
            "(4883, 'NAICS', 1088, 42499, 4, 1087, 424990, 5),\n" +
            "(4884, 'SIC', 3292, 3150, 3, 3293, 3151, 4),\n" +
            "(4885, 'SIC', 3214, 2800, 2, 3239, 2865, 4),\n" +
            "(4886, 'NAICS', 1022, 42413, 4, 1021, 424130, 5),\n" +
            "(4887, 'SIC', 4308, 20, 1, 3567, 3843, 4),\n" +
            "(4888, 'NAICS', 2003, 72, 1, 2004, 721, 2),\n" +
            "(4889, 'SIC', 4311, 52, 1, 3837, 5500, 2),\n" +
            "(4890, 'NAICS', 1570, 531, 2, 1576, 531130, 5),\n" +
            "(4891, 'SEC', 2791, 20, 1, 2241, 2010, 3),\n" +
            "(4892, 'SIC', 2799, 110, 3, 2803, 116, 4),\n" +
            "(4893, 'SEC', 2791, 20, 1, 2442, 3640, 3),\n" +
            "(4894, 'NAICS', 2107, 8132, 3, 2111, 813219, 5),\n" +
            "(4895, 'SIC', 2876, 910, 3, 2878, 913, 4),\n" +
            "(4896, 'NAICS', 930, 42, 1, 998, 423840, 5),\n" +
            "(4897, 'SEC', 2792, 40, 1, 2564, 4950, 3),\n" +
            "(4898, 'SIC', 3337, 3300, 2, 3340, 3313, 4),\n" +
            "(4899, 'SIC', 3419, 3500, 2, 3423, 3520, 3),\n" +
            "(4900, 'SEC', 2552, 4900, 2, 4316, 4955, 3),\n" +
            "(4901, 'SIC', 4313, 70, 1, 4165, 8069, 4),\n" +
            "(4902, 'NAICS', 1513, 523, 2, 1518, 52312, 4),\n" +
            "(4903, 'SIC', 4308, 20, 1, 3194, 2721, 4),\n" +
            "(4904, 'NAICS', 986, 42372, 4, 985, 423720, 5),\n" +
            "(4905, 'NAICS', 1907, 62311, 4, 1906, 623110, 5),\n" +
            "(4906, 'SIC', 3371, 3400, 2, 3393, 3451, 4),\n" +
            "(4907, 'SIC', 2875, 900, 2, 2876, 910, 3),\n" +
            "(4908, 'NAICS', 931, 423, 2, 945, 42322, 4),\n" +
            "(4909, 'SEC', 2555, 4920, 3, 2556, 4922, 4),\n" +
            "(4910, 'NAICS', 931, 423, 2, 981, 42369, 4),\n" +
            "(4911, 'SIC', 2983, 2010, 3, 2986, 2015, 4),\n" +
            "(4912, 'SEC', 2725, 7370, 3, 2728, 7373, 4),\n" +
            "(4913, 'NAICS', 1626, 5411, 3, 1629, 541120, 5),\n" +
            "(4914, 'SIC', 4313, 70, 1, 4205, 8412, 4),\n" +
            "(4915, 'SEC', 2794, 52, 1, 4319, 5412, 4),\n" +
            "(4916, 'SIC', 4308, 20, 1, 3333, 3295, 4),\n" +
            "(4917, 'NAICS', 930, 42, 1, 1024, 424210, 5),\n" +
            "(4918, 'NAICS', 1500, 52229, 4, 1504, 522294, 5),\n" +
            "(4919, 'NAICS', 1888, 6219, 3, 1892, 621991, 5),\n" +
            "(4920, 'NAICS', 1045, 42445, 4, 1044, 424450, 5),\n" +
            "(4921, 'SEC', 2791, 20, 1, 2308, 2731, 4),\n" +
            "(4922, 'SEC', 2793, 50, 1, 2570, 5013, 4),\n" +
            "(4923, 'SIC', 3050, 2200, 2, 3081, 2298, 4),\n" +
            "(4924, 'SIC', 3301, 3200, 2, 3328, 3280, 3),\n" +
            "(4925, 'NAICS', 1969, 712, 2, 1974, 71212, 4),\n" +
            "(4926, 'SIC', 3051, 2210, 3, 3052, 2211, 4),\n" +
            "(4927, 'SIC', 4308, 20, 1, 3501, 3646, 4),\n" +
            "(4928, 'SIC', 3419, 3500, 2, 3424, 3523, 4),\n" +
            "(4929, 'NAICS', 1624, 54, 1, 1649, 541350, 5),\n" +
            "(4930, 'SEC', 2434, 3600, 2, 2439, 3621, 4),\n" +
            "(4931, 'NAICS', 991, 4238, 3, 999, 42384, 4),\n" +
            "(4932, 'NAICS', 1403, 511, 2, 1405, 511110, 5),\n" +
            "(4933, 'NAICS', 1416, 5112, 3, 1417, 511210, 5),\n" +
            "(4934, 'SEC', 2791, 20, 1, 2251, 2052, 4),\n" +
            "(4935, 'NAICS', 180, 22, 1, 201, 221320, 5),\n" +
            "(4936, 'NAICS', 205, 23, 1, 260, 2383, 3),\n" +
            "(4937, 'SIC', 4310, 50, 1, 3785, 5153, 4),\n" +
            "(4938, 'NAICS', 205, 23, 1, 224, 237130, 5),\n" +
            "(4939, 'NAICS', 2038, 811, 2, 2043, 811113, 5),\n" +
            "(4940, 'SEC', 2791, 20, 1, 2263, 2210, 3),\n" +
            "(4941, 'SIC', 3337, 3300, 2, 3364, 3364, 4),\n" +
            "(4942, 'SIC', 3953, 6230, 3, 3954, 6231, 4),\n" +
            "(4943, 'NAICS', 1583, 5313, 3, 1586, 531312, 5),\n" +
            "(4944, 'NAICS', 1904, 623, 2, 1914, 62331, 4),\n" +
            "(4945, 'NAICS', 183, 22111, 4, 186, 221113, 5),\n" +
            "(4946, 'SEC', 2791, 20, 1, 2415, 3550, 3),\n" +
            "(4947, 'NAICS', 1663, 54143, 4, 1662, 541430, 5),\n" +
            "(4948, 'SIC', 4310, 50, 1, 3737, 5050, 3),\n" +
            "(4949, 'SIC', 4311, 52, 1, 3824, 5411, 4),\n" +
            "(4950, 'NAICS', 1625, 541, 2, 1691, 54181, 4),\n" +
            "(4951, 'NAICS', 1624, 54, 1, 1694, 541830, 5),\n" +
            "(4952, 'SIC', 3190, 2700, 2, 3194, 2721, 4),\n" +
            "(4953, 'NAICS', 2037, 81, 1, 2065, 811420, 5),\n" +
            "(4954, 'NAICS', 2136, 921, 2, 2149, 92119, 4),\n" +
            "(4955, 'SIC', 4308, 20, 1, 3160, 2531, 4),\n" +
            "(4956, 'SEC', 2319, 2800, 2, 2324, 2833, 4),\n" +
            "(4957, 'SIC', 3987, 6540, 3, 3988, 6541, 4),\n" +
            "(4958, 'SEC', 2500, 3900, 2, 2507, 3944, 4),\n" +
            "(4959, 'SEC', 2610, 5300, 2, 2612, 5311, 4),\n" +
            "(4960, 'NAICS', 1, 11, 1, 70, 11231, 4),\n" +
            "(4961, 'SEC', 2774, 8700, 2, 2779, 8734, 4),\n" +
            "(4962, 'SIC', 4308, 20, 1, 3472, 3586, 4),\n" +
            "(4963, 'SIC', 4311, 52, 1, 3809, 5250, 3),\n" +
            "(4964, 'NAICS', 931, 423, 2, 1012, 42394, 4),\n" +
            "(4965, 'NAICS', 1942, 71, 1, 1957, 711219, 5),\n" +
            "(4966, 'SEC', 2790, 15, 1, 2232, 1531, 4),\n" +
            "(4967, 'SIC', 2884, 1000, 2, 2888, 1021, 4),\n" +
            "(4968, 'SIC', 4311, 52, 1, 3852, 5590, 3),\n" +
            "(4969, 'SIC', 4306, 10, 1, 2900, 1099, 4),\n" +
            "(4970, 'SEC', 2793, 50, 1, 2590, 5099, 4),\n" +
            "(4971, 'NAICS', 1725, 56, 1, 1776, 56171, 4),\n" +
            "(4972, 'SIC', 4308, 20, 1, 3139, 2448, 4),\n" +
            "(4973, 'NAICS', 1008, 42392, 4, 1007, 423920, 5),\n" +
            "(4974, 'NAICS', 1725, 56, 1, 1733, 5613, 3),\n" +
            "(4975, 'SIC', 2982, 2000, 2, 3028, 2083, 4),\n" +
            "(4976, 'SIC', 4311, 52, 1, 3850, 5570, 3),\n" +
            "(4977, 'NAICS', 1402, 51, 1, 1409, 511130, 5),\n" +
            "(4978, 'SEC', 2500, 3900, 2, 2511, 3990, 3),\n" +
            "(4979, 'NAICS', 1623, 53311, 4, 1622, 533110, 5),\n" +
            "(4980, 'SIC', 4308, 20, 1, 3528, 3711, 4),\n" +
            "(4981, 'NAICS', 1, 11, 1, 122, 115113, 5),\n" +
            "(4982, 'NAICS', 205, 23, 1, 231, 23731, 4),\n" +
            "(4983, 'NAICS', 1569, 53, 1, 1611, 53231, 4),\n" +
            "(4984, 'NAICS', 205, 23, 1, 272, 23839, 4),\n" +
            "(4985, 'SIC', 4192, 8300, 2, 4199, 8360, 3),\n" +
            "(4986, 'NAICS', 1942, 71, 1, 1960, 71131, 4),\n" +
            "(4987, 'NAICS', 205, 23, 1, 223, 23712, 4),\n" +
            "(4988, 'SEC', 2791, 20, 1, 2479, 3820, 3),\n" +
            "(4989, 'SIC', 4313, 70, 1, 4054, 7338, 4),\n" +
            "(4990, 'SIC', 2884, 1000, 2, 2898, 1090, 3),\n" +
            "(4991, 'NAICS', 1480, 52, 1, 1559, 52512, 4),\n" +
            "(4992, 'SEC', 2500, 3900, 2, 2504, 3931, 4),\n" +
            "(4993, 'SIC', 3886, 5900, 2, 3892, 5932, 4),\n" +
            "(4994, 'NAICS', 235, 238, 2, 248, 23816, 4),\n" +
            "(4995, 'SIC', 4075, 7380, 3, 4077, 7382, 4),\n" +
            "(4996, 'SIC', 3977, 6500, 2, 3982, 6515, 4),\n" +
            "(4997, 'SIC', 4308, 20, 1, 2995, 2033, 4),\n" +
            "(4998, 'SIC', 4306, 10, 1, 2931, 1470, 3),\n" +
            "(4999, 'NAICS', 1920, 624, 2, 1934, 624230, 5),\n" +
            "(5000, 'NAICS', 1725, 56, 1, 1777, 561720, 5),\n" +
            "(5001, 'NAICS', 1799, 56221, 4, 1800, 562211, 5),\n" +
            "(5002, 'NAICS', 2032, 72251, 4, 2036, 722515, 5),\n" +
            "(5003, 'SIC', 4310, 50, 1, 3799, 5192, 4),\n" +
            "(5004, 'NAICS', 1954, 71121, 4, 1955, 711211, 5),\n" +
            "(5005, 'NAICS', 180, 22, 1, 192, 22112, 4),\n" +
            "(5006, 'SEC', 2796, 70, 1, 2777, 8730, 3),\n" +
            "(5007, 'SIC', 2939, 1500, 2, 2943, 1530, 3),\n" +
            "(5008, 'SIC', 4308, 20, 1, 3076, 2284, 4),\n" +
            "(5009, 'SIC', 3676, 4780, 3, 3677, 4783, 4),\n" +
            "(5010, 'NAICS', 3, 1111, 3, 10, 111140, 5),\n" +
            "(5011, 'SEC', 2303, 2710, 3, 2304, 2711, 4),\n" +
            "(5012, 'NAICS', 1015, 424, 2, 1067, 424710, 5),\n" +
            "(5013, 'SIC', 3686, 4830, 3, 3688, 4833, 4),\n" +
            "(5014, 'SIC', 3050, 2200, 2, 3071, 2270, 3),\n" +
            "(5015, 'SIC', 3127, 2420, 3, 3129, 2426, 4),\n" +
            "(5016, 'SIC', 4017, 7200, 2, 4027, 7220, 3),\n" +
            "(5017, 'SIC', 3041, 2100, 2, 3043, 2111, 4),\n" +
            "(5018, 'SIC', 4040, 7300, 2, 4067, 7372, 4),\n" +
            "(5019, 'NAICS', 931, 423, 2, 971, 423510, 5),\n" +
            "(5020, 'SIC', 2962, 1740, 3, 2963, 1741, 4),\n" +
            "(5021, 'NAICS', 1, 11, 1, 16, 11119, 4),\n" +
            "(5022, 'SEC', 2791, 20, 1, 2439, 3621, 4),\n" +
            "(5023, 'SIC', 4314, 90, 1, 4253, 9131, 4),\n" +
            "(5024, 'NAICS', 1, 11, 1, 30, 111332, 5),\n" +
            "(5025, 'NAICS', 56, 112, 2, 68, 1123, 3),\n" +
            "(5026, 'SEC', 2568, 5000, 2, 2579, 5060, 3),\n" +
            "(5027, 'SIC', 4313, 70, 1, 4084, 7514, 4),\n" +
            "(5028, 'SIC', 2798, 100, 2, 2812, 161, 4),\n" +
            "(5029, 'NAICS', 1823, 6114, 3, 1829, 61143, 4),\n" +
            "(5030, 'NAICS', 931, 423, 2, 975, 4236, 3),\n" +
            "(5031, 'NAICS', 1720, 5511, 3, 1724, 551114, 5),\n" +
            "(5032, 'SIC', 4308, 20, 1, 3398, 3465, 4),\n" +
            "(5033, 'NAICS', 1419, 512, 2, 1427, 512132, 5),\n" +
            "(5034, 'NAICS', 2003, 72, 1, 2021, 7223, 3),\n" +
            "(5035, 'NAICS', 930, 42, 1, 992, 423810, 5),\n" +
            "(5036, 'NAICS', 1812, 61, 1, 1816, 61111, 4),\n" +
            "(5037, 'NAICS', 2135, 92, 1, 2161, 92215, 4),\n" +
            "(5038, 'SIC', 4314, 90, 1, 4272, 9431, 4),\n" +
            "(5039, 'NAICS', 2061, 8114, 3, 2065, 811420, 5),\n" +
            "(5040, 'SEC', 2791, 20, 1, 2353, 3100, 2),\n" +
            "(5041, 'SIC', 3837, 5500, 2, 3849, 5561, 4),\n" +
            "(5042, 'SIC', 3693, 4900, 2, 3694, 4910, 3),\n" +
            "(5043, 'SIC', 3337, 3300, 2, 3339, 3312, 4),\n" +
            "(5044, 'NAICS', 118, 1151, 3, 123, 115114, 5),\n" +
            "(5045, 'SEC', 2795, 60, 1, 2704, 6790, 3),\n" +
            "(5046, 'SIC', 3552, 3800, 2, 3566, 3842, 4),\n" +
            "(5047, 'NAICS', 1953, 7112, 3, 1957, 711219, 5),\n" +
            "(5048, 'NAICS', 236, 2381, 3, 240, 23812, 4),\n" +
            "(5049, 'NAICS', 1689, 5418, 3, 1691, 54181, 4),\n" +
            "(5050, 'NAICS', 1726, 561, 2, 1771, 56162, 4),\n" +
            "(5051, 'SIC', 3877, 5730, 3, 3880, 5735, 4),\n" +
            "(5052, 'SIC', 3606, 4110, 3, 3608, 4119, 4),\n" +
            "(5053, 'NAICS', 2151, 9221, 3, 2159, 92214, 4),\n" +
            "(5054, 'SEC', 2446, 3660, 3, 2449, 3669, 4),\n" +
            "(5055, 'NAICS', 1480, 52, 1, 1563, 525910, 5),\n" +
            "(5056, 'NAICS', 1851, 621, 2, 1882, 62151, 4),\n" +
            "(5057, 'NAICS', 2039, 8111, 3, 2049, 811191, 5),\n" +
            "(5058, 'SEC', 2791, 20, 1, 2384, 3400, 2),\n" +
            "(5059, 'SIC', 4308, 20, 1, 3217, 2813, 4),\n" +
            "(5060, 'SIC', 3246, 2890, 3, 3251, 2899, 4),\n" +
            "(5061, 'NAICS', 1001, 42385, 4, 1000, 423850, 5),\n" +
            "(5062, 'SEC', 2434, 3600, 2, 2442, 3640, 3),\n" +
            "(5063, 'SIC', 3282, 3100, 2, 3295, 3161, 4),\n" +
            "(5064, 'SEC', 2476, 3800, 2, 2482, 3823, 4),\n" +
            "(5065, 'SEC', 2792, 40, 1, 2512, 4000, 2),\n" +
            "(5066, 'NAICS', 1792, 562, 2, 1795, 562111, 5),\n" +
            "(5067, 'SIC', 3480, 3600, 2, 3505, 3651, 4),\n" +
            "(5068, 'SEC', 2792, 40, 1, 2560, 4931, 4),\n" +
            "(5069, 'NAICS', 231, 23731, 4, 230, 237310, 5),\n" +
            "(5070, 'NAICS', 1851, 621, 2, 1881, 6215, 3),\n" +
            "(5071, 'NAICS', 2038, 811, 2, 2041, 811111, 5),\n" +
            "(5072, 'NAICS', 1793, 5621, 3, 1797, 562119, 5),\n" +
            "(5073, 'SIC', 4307, 15, 1, 2942, 1522, 4),\n" +
            "(5074, 'SIC', 2875, 900, 2, 2878, 913, 4),\n" +
            "(5075, 'NAICS', 1035, 4244, 3, 1050, 424480, 5),\n" +
            "(5076, 'SEC', 2476, 3800, 2, 2492, 3844, 4),\n" +
            "(5077, 'SEC', 2649, 6000, 2, 2654, 6030, 3),\n" +
            "(5078, 'SIC', 3419, 3500, 2, 3437, 3543, 4),\n" +
            "(5079, 'SIC', 4136, 7950, 3, 4137, 7951, 4),\n" +
            "(5080, 'SIC', 3713, 4970, 3, 3714, 4971, 4),\n" +
            "(5081, 'NAICS', 181, 221, 2, 198, 2213, 3),\n" +
            "(5082, 'SIC', 3605, 4100, 2, 3611, 4130, 3),\n" +
            "(5083, 'SIC', 3282, 3100, 2, 3294, 3160, 3),\n" +
            "(5084, 'NAICS', 68, 1123, 3, 77, 112390, 5),\n" +
            "(5085, 'NAICS', 2039, 8111, 3, 2040, 81111, 4),\n" +
            "(5086, 'SIC', 2798, 100, 2, 2807, 132, 4),\n" +
            "(5087, 'SIC', 2918, 1400, 2, 2938, 1499, 4),\n" +
            "(5088, 'SEC', 2795, 60, 1, 2705, 6792, 4),\n" +
            "(5089, 'SIC', 3451, 3560, 3, 3455, 3564, 4),\n" +
            "(5090, 'NAICS', 1, 11, 1, 105, 1133, 3),\n" +
            "(5091, 'SEC', 2280, 2450, 3, 2281, 2451, 4),\n" +
            "(5092, 'SIC', 4308, 20, 1, 3143, 2452, 4),\n" +
            "(5093, 'SEC', 2791, 20, 1, 2355, 3200, 2),\n" +
            "(5094, 'SIC', 4310, 50, 1, 3755, 5088, 4),\n" +
            "(5095, 'NAICS', 2103, 813, 2, 2129, 813990, 5),\n" +
            "(5096, 'SEC', 2791, 20, 1, 2306, 2721, 4),\n" +
            "(5097, 'NAICS', 1550, 52429, 4, 1552, 524292, 5),\n" +
            "(5098, 'NAICS', 2205, 9281, 3, 2207, 92811, 4),\n" +
            "(5099, 'SEC', 2250, 2050, 3, 2251, 2052, 4),\n" +
            "(5100, 'SIC', 2945, 1540, 3, 2947, 1542, 4),\n" +
            "(5101, 'NAICS', 182, 2211, 3, 187, 221114, 5),\n" +
            "(5102, 'SIC', 3620, 4200, 2, 3623, 4213, 4),\n" +
            "(5103, 'NAICS', 1, 11, 1, 8, 111130, 5),\n" +
            "(5104, 'SEC', 2403, 3500, 2, 2415, 3550, 3),\n" +
            "(5105, 'NAICS', 156, 2123, 3, 160, 212313, 5),\n" +
            "(5106, 'NAICS', 138, 212, 2, 168, 212391, 5),\n" +
            "(5107, 'NAICS', 1725, 56, 1, 1806, 56291, 4),\n" +
            "(5108, 'SIC', 4113, 7800, 2, 4119, 7829, 4),\n" +
            "(5109, 'NAICS', 206, 236, 2, 213, 2362, 3),\n" +
            "(5110, 'SIC', 3715, 5000, 2, 3758, 5092, 4),\n" +
            "(5111, 'SIC', 2855, 740, 3, 2856, 741, 4),\n" +
            "(5112, 'NAICS', 232, 2379, 3, 234, 23799, 4),\n" +
            "(5113, 'NAICS', 2200, 927, 2, 2203, 92711, 4),\n" +
            "(5114, 'SIC', 4308, 20, 1, 3422, 3519, 4),\n" +
            "(5115, 'NAICS', 1969, 712, 2, 1975, 712130, 5),\n" +
            "(5116, 'NAICS', 2149, 92119, 4, 2148, 921190, 5),\n" +
            "(5117, 'SEC', 2791, 20, 1, 2389, 3430, 3),\n" +
            "(5118, 'NAICS', 1928, 6242, 3, 1929, 624210, 5),\n" +
            "(5119, 'NAICS', 1921, 6241, 3, 1927, 62419, 4),\n" +
            "(5120, 'NAICS', 1760, 56151, 4, 1759, 561510, 5),\n" +
            "(5121, 'SIC', 4305, 1, 1, 2815, 172, 4),\n" +
            "(5122, 'SIC', 3504, 3650, 3, 3506, 3652, 4),\n" +
            "(5123, 'NAICS', 1598, 5322, 3, 1600, 53221, 4),\n" +
            "(5124, 'NAICS', 2135, 92, 1, 2192, 926120, 5),\n" +
            "(5125, 'NAICS', 1657, 5414, 3, 1659, 54141, 4),\n" +
            "(5126, 'SIC', 4309, 40, 1, 3687, 4832, 4),\n" +
            "(5127, 'SIC', 4312, 60, 1, 3971, 6371, 4),\n" +
            "(5128, 'NAICS', 235, 238, 2, 263, 238320, 5),\n" +
            "(5129, 'SIC', 3951, 6220, 3, 3952, 6221, 4),\n" +
            "(5130, 'NAICS', 1852, 6211, 3, 1855, 621112, 5),\n" +
            "(5131, 'NAICS', 172, 213, 2, 177, 213113, 5),\n" +
            "(5132, 'SIC', 2982, 2000, 2, 3000, 2040, 3),\n" +
            "(5133, 'NAICS', 1743, 56141, 4, 1742, 561410, 5),\n" +
            "(5134, 'NAICS', 205, 23, 1, 270, 23835, 4),\n" +
            "(5135, 'SIC', 4308, 20, 1, 3020, 2070, 3),\n" +
            "(5136, 'NAICS', 1573, 53111, 4, 1572, 531110, 5),\n" +
            "(5137, 'SIC', 4208, 8600, 2, 4221, 8690, 3),\n" +
            "(5138, 'SEC', 2591, 5100, 2, 2592, 5110, 3),\n" +
            "(5139, 'SIC', 3552, 3800, 2, 3567, 3843, 4),\n" +
            "(5140, 'SIC', 4171, 8090, 3, 4174, 8099, 4),\n" +
            "(5141, 'SIC', 4040, 7300, 2, 4059, 7352, 4),\n" +
            "(5142, 'NAICS', 2, 111, 2, 5, 11111, 4),\n" +
            "(5143, 'NAICS', 991, 4238, 3, 997, 42383, 4),\n" +
            "(5144, 'SEC', 2458, 3700, 2, 2464, 3716, 4),\n" +
            "(5145, 'SIC', 4308, 20, 1, 3084, 2310, 3),\n" +
            "(5146, 'SIC', 4146, 8000, 2, 4165, 8069, 4),\n" +
            "(5147, 'NAICS', 2040, 81111, 4, 2043, 811113, 5),\n" +
            "(5148, 'SIC', 3601, 4000, 2, 3602, 4010, 3),\n" +
            "(5149, 'SIC', 3576, 3900, 2, 3592, 3960, 3),\n" +
            "(5150, 'SIC', 4308, 20, 1, 3523, 3694, 4),\n" +
            "(5151, 'SIC', 3693, 4900, 2, 3714, 4971, 4),\n" +
            "(5152, 'NAICS', 1812, 61, 1, 1846, 611699, 5),\n" +
            "(5153, 'NAICS', 1904, 623, 2, 1916, 623312, 5),\n" +
            "(5154, 'SIC', 3762, 5100, 2, 3777, 5143, 4),\n" +
            "(5155, 'SEC', 2791, 20, 1, 2262, 2200, 2),\n" +
            "(5156, 'NAICS', 57, 1121, 3, 61, 112120, 5),\n" +
            "(5157, 'SIC', 2958, 1720, 3, 2959, 1721, 4),\n" +
            "(5158, 'SIC', 4308, 20, 1, 3156, 2520, 3),\n" +
            "(5159, 'SEC', 2424, 3570, 3, 2427, 3575, 4),\n" +
            "(5160, 'SIC', 4311, 52, 1, 3836, 5499, 4),\n" +
            "(5161, 'NAICS', 2004, 721, 2, 2016, 721214, 5),\n" +
            "(5162, 'NAICS', 1624, 54, 1, 1672, 5416, 3),\n" +
            "(5163, 'SEC', 2791, 20, 1, 2412, 3537, 4),\n" +
            "(5164, 'SIC', 3301, 3200, 2, 3320, 3264, 4),\n" +
            "(5165, 'NAICS', 1624, 54, 1, 1674, 541611, 5),\n" +
            "(5166, 'SIC', 3337, 3300, 2, 3349, 3330, 3),\n" +
            "(5167, 'SIC', 4309, 40, 1, 3660, 4580, 3),\n" +
            "(5168, 'SEC', 2791, 20, 1, 2467, 3724, 4),\n" +
            "(5169, 'SIC', 4308, 20, 1, 3094, 2331, 4),\n" +
            "(5170, 'SIC', 4308, 20, 1, 3153, 2515, 4),\n" +
            "(5171, 'SIC', 3149, 2510, 3, 3151, 2512, 4),\n" +
            "(5172, 'SIC', 4308, 20, 1, 3043, 2111, 4),\n" +
            "(5173, 'SIC', 4259, 9220, 3, 4264, 9229, 4),\n" +
            "(5174, 'SIC', 4223, 8700, 2, 4231, 8731, 4),\n" +
            "(5175, 'SEC', 2791, 20, 1, 2281, 2451, 4),\n" +
            "(5176, 'NAICS', 105, 1133, 3, 107, 11331, 4),\n" +
            "(5177, 'NAICS', 99, 1131, 3, 100, 113110, 5),\n" +
            "(5178, 'SIC', 4017, 7200, 2, 4023, 7216, 4),\n" +
            "(5179, 'SIC', 4308, 20, 1, 3369, 3398, 4),\n" +
            "(5180, 'NAICS', 1851, 621, 2, 1876, 62149, 4),\n" +
            "(5181, 'SIC', 4314, 90, 1, 4285, 9610, 3),\n" +
            "(5182, 'NAICS', 1970, 7121, 3, 1974, 71212, 4),\n" +
            "(5183, 'SIC', 4308, 20, 1, 3106, 2370, 3),\n" +
            "(5184, 'SIC', 4308, 20, 1, 3552, 3800, 2),\n" +
            "(5185, 'NAICS', 65, 1122, 3, 67, 11221, 4),\n" +
            "(5186, 'NAICS', 930, 42, 1, 949, 423320, 5),\n" +
            "(5187, 'NAICS', 1630, 54112, 4, 1629, 541120, 5),\n" +
            "(5188, 'NAICS', 1861, 62131, 4, 1860, 621310, 5),\n" +
            "(5189, 'SIC', 2918, 1400, 2, 2924, 1429, 4),\n" +
            "(5190, 'NAICS', 2, 111, 2, 26, 111320, 5),\n" +
            "(5191, 'NAICS', 2188, 926, 2, 2189, 9261, 3),\n" +
            "(5192, 'SIC', 3552, 3800, 2, 3555, 3820, 3),\n" +
            "(5193, 'SIC', 3214, 2800, 2, 3245, 2879, 4),\n" +
            "(5194, 'SIC', 3788, 5160, 3, 3789, 5162, 4),\n" +
            "(5195, 'NAICS', 235, 238, 2, 277, 23899, 4),\n" +
            "(5196, 'NAICS', 1624, 54, 1, 1628, 54111, 4),\n" +
            "(5197, 'SIC', 4208, 8600, 2, 4218, 8651, 4),\n" +
            "(5198, 'NAICS', 1771, 56162, 4, 1773, 561622, 5),\n" +
            "(5199, 'NAICS', 1850, 62, 1, 1877, 621491, 5),\n" +
            "(5200, 'NAICS', 2135, 92, 1, 2183, 9251, 3),\n" +
            "(5201, 'NAICS', 1725, 56, 1, 1797, 562119, 5),\n" +
            "(5202, 'SEC', 2606, 5210, 3, 2607, 5211, 4),\n" +
            "(5203, 'NAICS', 1403, 511, 2, 1415, 511199, 5),\n" +
            "(5204, 'NAICS', 1419, 512, 2, 1423, 512120, 5),\n" +
            "(5205, 'SIC', 3804, 5200, 2, 3814, 5271, 4),\n" +
            "(5206, 'SIC', 4081, 7500, 2, 4093, 7536, 4),\n" +
            "(5207, 'NAICS', 1526, 5239, 3, 1527, 523910, 5),\n" +
            "(5208, 'NAICS', 1935, 62423, 4, 1934, 624230, 5),\n" +
            "(5209, 'NAICS', 2135, 92, 1, 2179, 92411, 4),\n" +
            "(5210, 'SIC', 3480, 3600, 2, 3521, 3691, 4),\n" +
            "(5211, 'SIC', 3480, 3600, 2, 3496, 3640, 3),\n" +
            "(5212, 'SIC', 4311, 52, 1, 3879, 5734, 4),\n" +
            "(5213, 'SIC', 3822, 5400, 2, 3823, 5410, 3),\n" +
            "(5214, 'NAICS', 975, 4236, 3, 980, 423690, 5),\n" +
            "(5215, 'SEC', 2791, 20, 1, 2394, 3444, 4),\n" +
            "(5216, 'NAICS', 1419, 512, 2, 1440, 512290, 5),\n" +
            "(5217, 'NAICS', 1538, 52411, 4, 1540, 524114, 5),\n" +
            "(5218, 'NAICS', 56, 112, 2, 60, 112112, 5),\n" +
            "(5219, 'NAICS', 1894, 622, 2, 1899, 622210, 5),\n" +
            "(5220, 'SIC', 4113, 7800, 2, 4121, 7832, 4),\n" +
            "(5221, 'NAICS', 1850, 62, 1, 1873, 62141, 4),\n" +
            "(5222, 'SIC', 3882, 5800, 2, 3885, 5813, 4),\n" +
            "(5223, 'SEC', 2791, 20, 1, 2382, 3360, 3),\n" +
            "(5224, 'SIC', 3636, 4400, 2, 3649, 4490, 3),\n" +
            "(5225, 'NAICS', 1053, 42449, 4, 1052, 424490, 5),\n" +
            "(5226, 'NAICS', 2003, 72, 1, 2011, 721191, 5),\n" +
            "(5227, 'NAICS', 2038, 811, 2, 2070, 81149, 4),\n" +
            "(5228, 'NAICS', 1624, 54, 1, 1692, 541820, 5),\n" +
            "(5229, 'SIC', 3715, 5000, 2, 3722, 5021, 4),\n" +
            "(5230, 'SIC', 3033, 2090, 3, 3039, 2098, 4),\n" +
            "(5231, 'NAICS', 2188, 926, 2, 2198, 926150, 5),\n" +
            "(5232, 'NAICS', 1625, 541, 2, 1687, 541720, 5),\n" +
            "(5233, 'NAICS', 1, 11, 1, 24, 111310, 5),\n" +
            "(5234, 'SIC', 4305, 1, 1, 2860, 752, 4),\n" +
            "(5235, 'NAICS', 2005, 7211, 3, 2010, 72119, 4),\n" +
            "(5236, 'SEC', 2517, 4200, 2, 2518, 4210, 3),\n" +
            "(5237, 'NAICS', 1, 11, 1, 89, 1129, 3),\n" +
            "(5238, 'NAICS', 1569, 53, 1, 1623, 53311, 4),\n" +
            "(5239, 'NAICS', 2103, 813, 2, 2122, 81391, 4),\n" +
            "(5240, 'SIC', 4308, 20, 1, 3587, 3950, 3),\n" +
            "(5241, 'NAICS', 1, 11, 1, 72, 11232, 4),\n" +
            "(5242, 'NAICS', 931, 423, 2, 995, 42382, 4),\n" +
            "(5243, 'NAICS', 1486, 5221, 3, 1493, 522190, 5),\n" +
            "(5244, 'SEC', 2794, 52, 1, 2609, 5271, 4),\n" +
            "(5245, 'SIC', 4308, 20, 1, 3266, 3050, 3),\n" +
            "(5246, 'SIC', 4223, 8700, 2, 4229, 8721, 4),\n" +
            "(5247, 'SEC', 2794, 52, 1, 2638, 5810, 3),\n" +
            "(5248, 'NAICS', 1, 11, 1, 32, 111334, 5),\n" +
            "(5249, 'NAICS', 1035, 4244, 3, 1052, 424490, 5),\n" +
            "(5250, 'SIC', 4306, 10, 1, 2911, 1311, 4),\n" +
            "(5251, 'SIC', 4100, 7600, 2, 4109, 7690, 3),\n" +
            "(5252, 'NAICS', 991, 4238, 3, 996, 423830, 5),\n" +
            "(5253, 'SIC', 4308, 20, 1, 3362, 3360, 3),\n" +
            "(5254, 'NAICS', 205, 23, 1, 261, 238310, 5),\n" +
            "(5255, 'NAICS', 2037, 81, 1, 2044, 811118, 5),\n" +
            "(5256, 'SIC', 3636, 4400, 2, 3651, 4492, 4),\n" +
            "(5257, 'SIC', 3978, 6510, 3, 3980, 6513, 4),\n" +
            "(5258, 'SEC', 2695, 6510, 3, 2698, 6519, 4),\n" +
            "(5259, 'SEC', 2371, 3300, 2, 2380, 3350, 3),\n" +
            "(5260, 'NAICS', 174, 21311, 4, 178, 213114, 5),\n" +
            "(5261, 'NAICS', 1990, 7139, 3, 2002, 71399, 4),\n" +
            "(5262, 'NAICS', 1602, 53222, 4, 1601, 532220, 5),\n" +
            "(5263, 'NAICS', 2103, 813, 2, 2118, 813410, 5),\n" +
            "(5264, 'SIC', 4281, 9530, 3, 4283, 9532, 4),\n" +
            "(5265, 'SIC', 2935, 1480, 3, 2936, 1481, 4),\n" +
            "(5266, 'NAICS', 2120, 8139, 3, 2126, 81393, 4),\n" +
            "(5267, 'SIC', 3108, 2380, 3, 3111, 2385, 4),\n" +
            "(5268, 'SIC', 4081, 7500, 2, 4092, 7534, 4),\n" +
            "(5269, 'SIC', 4308, 20, 1, 3375, 3420, 3),\n" +
            "(5270, 'NAICS', 1624, 54, 1, 1627, 541110, 5),\n" +
            "(5271, 'SEC', 2703, 6700, 2, 2708, 6799, 4),\n" +
            "(5272, 'NAICS', 205, 23, 1, 213, 2362, 3),\n" +
            "(5273, 'NAICS', 1725, 56, 1, 1773, 561622, 5),\n" +
            "(5274, 'NAICS', 2052, 8112, 3, 2055, 811212, 5),\n" +
            "(5275, 'SEC', 2796, 70, 1, 2719, 7340, 3),\n" +
            "(5276, 'NAICS', 930, 42, 1, 1006, 42391, 4),\n" +
            "(5277, 'SEC', 2434, 3600, 2, 2441, 3634, 4),\n" +
            "(5278, 'SIC', 3301, 3200, 2, 3307, 3230, 3),\n" +
            "(5279, 'NAICS', 140, 21211, 4, 142, 212112, 5),\n" +
            "(5280, 'NAICS', 2100, 81293, 4, 2099, 812930, 5),\n" +
            "(5281, 'SIC', 4082, 7510, 3, 4085, 7515, 4),\n" +
            "(5282, 'SEC', 2795, 60, 1, 4328, 6795, 4),\n" +
            "(5283, 'SIC', 4308, 20, 1, 3382, 3432, 4),\n" +
            "(5284, 'SIC', 4018, 7210, 3, 4025, 7218, 4),\n" +
            "(5285, 'SIC', 4089, 7530, 3, 4094, 7537, 4),\n" +
            "(5286, 'NAICS', 51, 11194, 4, 50, 111940, 5),\n" +
            "(5287, 'NAICS', 2040, 81111, 4, 2041, 811111, 5),\n" +
            "(5288, 'SIC', 3246, 2890, 3, 3248, 2892, 4),\n" +
            "(5289, 'SEC', 2792, 40, 1, 2555, 4920, 3),\n" +
            "(5290, 'NAICS', 1970, 7121, 3, 1975, 712130, 5),\n" +
            "(5291, 'NAICS', 1070, 42472, 4, 1069, 424720, 5),\n" +
            "(5292, 'NAICS', 930, 42, 1, 1031, 424330, 5),\n" +
            "(5293, 'SIC', 2855, 740, 3, 2857, 742, 4),\n" +
            "(5294, 'NAICS', 1480, 52, 1, 1555, 5251, 3),\n" +
            "(5295, 'NAICS', 132, 21, 1, 141, 212111, 5),\n" +
            "(5296, 'NAICS', 1726, 561, 2, 1761, 561520, 5),\n" +
            "(5297, 'SIC', 4311, 52, 1, 3821, 5399, 4),\n" +
            "(5298, 'NAICS', 1090, 4251, 3, 1092, 42511, 4),\n" +
            "(5299, 'SIC', 4256, 9200, 2, 4264, 9229, 4),\n" +
            "(5300, 'SIC', 4284, 9600, 2, 4295, 9660, 3),\n" +
            "(5301, 'NAICS', 208, 23611, 4, 209, 236115, 5),\n" +
            "(5302, 'SEC', 2791, 20, 1, 2249, 2040, 3),\n" +
            "(5303, 'SEC', 2403, 3500, 2, 2412, 3537, 4),\n" +
            "(5304, 'NAICS', 144, 2122, 3, 150, 21223, 4),\n" +
            "(5305, 'SEC', 2532, 4580, 3, 2533, 4581, 4),\n" +
            "(5306, 'NAICS', 1725, 56, 1, 1762, 56152, 4),\n" +
            "(5307, 'SEC', 2791, 20, 1, 2341, 2990, 3),\n" +
            "(5308, 'SIC', 4314, 90, 1, 4263, 9224, 4),\n" +
            "(5309, 'SEC', 2791, 20, 1, 2441, 3634, 4),\n" +
            "(5310, 'SIC', 4247, 9100, 2, 4248, 9110, 3);\n";
    static String industryCodeInsert21 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(5311, 'SIC', 4308, 20, 1, 3002, 2043, 4),\n" +
            "(5312, 'NAICS', 56, 112, 2, 62, 11212, 4),\n" +
            "(5313, 'SIC', 3204, 2760, 3, 3205, 2761, 4),\n" +
            "(5314, 'NAICS', 930, 42, 1, 954, 42339, 4),\n" +
            "(5315, 'SIC', 3384, 3440, 3, 3387, 3443, 4),\n" +
            "(5316, 'SIC', 3337, 3300, 2, 3348, 3325, 4),\n" +
            "(5317, 'NAICS', 1579, 53119, 4, 1578, 531190, 5),\n" +
            "(5318, 'NAICS', 1850, 62, 1, 1899, 622210, 5),\n" +
            "(5319, 'SEC', 2792, 40, 1, 2567, 4961, 4),\n" +
            "(5320, 'SIC', 2937, 1490, 3, 2938, 1499, 4),\n" +
            "(5321, 'SIC', 4308, 20, 1, 3430, 3534, 4),\n" +
            "(5322, 'SIC', 3526, 3700, 2, 3537, 3730, 3),\n" +
            "(5323, 'NAICS', 1942, 71, 1, 1989, 71329, 4),\n" +
            "(5324, 'NAICS', 1725, 56, 1, 1775, 561710, 5),\n" +
            "(5325, 'SIC', 2798, 100, 2, 2815, 172, 4),\n" +
            "(5326, 'NAICS', 1904, 623, 2, 1906, 623110, 5),\n" +
            "(5327, 'SEC', 2384, 3400, 2, 2397, 3451, 4),\n" +
            "(5328, 'NAICS', 205, 23, 1, 233, 237990, 5),\n" +
            "(5329, 'NAICS', 1402, 51, 1, 1412, 51114, 4),\n" +
            "(5330, 'SEC', 2488, 3840, 3, 2493, 3845, 4),\n" +
            "(5331, 'SIC', 2885, 1010, 3, 2886, 1011, 4),\n" +
            "(5332, 'NAICS', 205, 23, 1, 253, 2382, 3),\n" +
            "(5333, 'SIC', 3046, 2130, 3, 3047, 2131, 4),\n" +
            "(5334, 'SIC', 4040, 7300, 2, 4057, 7349, 4),\n" +
            "(5335, 'NAICS', 1917, 6239, 3, 1919, 62399, 4),\n" +
            "(5336, 'SIC', 3788, 5160, 3, 3790, 5169, 4),\n" +
            "(5337, 'SIC', 3605, 4100, 2, 3609, 4120, 3),\n" +
            "(5338, 'SIC', 3715, 5000, 2, 3721, 5020, 3),\n" +
            "(5339, 'NAICS', 1513, 523, 2, 1534, 523991, 5),\n" +
            "(5340, 'SIC', 4312, 60, 1, 3964, 6330, 3),\n" +
            "(5341, 'SIC', 2847, 700, 2, 2853, 723, 4),\n" +
            "(5342, 'NAICS', 43, 1119, 3, 54, 111992, 5),\n" +
            "(5343, 'NAICS', 213, 2362, 3, 214, 236210, 5),\n" +
            "(5344, 'NAICS', 1624, 54, 1, 1707, 541910, 5),\n" +
            "(5345, 'SIC', 3869, 5700, 2, 3881, 5736, 4),\n" +
            "(5346, 'SIC', 4305, 1, 1, 2807, 132, 4),\n" +
            "(5347, 'NAICS', 1624, 54, 1, 1630, 54112, 4),\n" +
            "(5348, 'SIC', 3337, 3300, 2, 3365, 3365, 4),\n" +
            "(5349, 'NAICS', 1812, 61, 1, 1825, 61141, 4),\n" +
            "(5350, 'SEC', 2794, 52, 1, 2619, 5411, 4),\n" +
            "(5351, 'SIC', 3337, 3300, 2, 3357, 3353, 4),\n" +
            "(5352, 'NAICS', 28, 11133, 4, 34, 111336, 5),\n" +
            "(5353, 'SIC', 4308, 20, 1, 3435, 3541, 4),\n" +
            "(5354, 'SIC', 4311, 52, 1, 3878, 5731, 4),\n" +
            "(5355, 'NAICS', 1920, 624, 2, 1937, 624310, 5),\n" +
            "(5356, 'SEC', 2262, 2200, 2, 2268, 2253, 4),\n" +
            "(5357, 'SIC', 2982, 2000, 2, 3016, 2064, 4),\n" +
            "(5358, 'NAICS', 1, 11, 1, 112, 114112, 5),\n" +
            "(5359, 'SIC', 3572, 3860, 3, 3573, 3861, 4),\n" +
            "(5360, 'SIC', 3886, 5900, 2, 3889, 5920, 3),\n" +
            "(5361, 'SEC', 2793, 50, 1, 2585, 5080, 3),\n" +
            "(5362, 'SIC', 3401, 3470, 3, 3402, 3471, 4),\n" +
            "(5363, 'SIC', 3355, 3350, 3, 3356, 3351, 4),\n" +
            "(5364, 'NAICS', 931, 423, 2, 974, 42352, 4),\n" +
            "(5365, 'SIC', 3715, 5000, 2, 3740, 5060, 3),\n" +
            "(5366, 'NAICS', 1850, 62, 1, 1930, 62421, 4),\n" +
            "(5367, 'SEC', 2292, 2600, 2, 2301, 2673, 4),\n" +
            "(5368, 'SIC', 3925, 6030, 3, 3927, 6036, 4),\n" +
            "(5369, 'NAICS', 23, 1113, 3, 32, 111334, 5),\n" +
            "(5370, 'SIC', 4308, 20, 1, 3176, 2653, 4),\n" +
            "(5371, 'NAICS', 1015, 424, 2, 1062, 424610, 5),\n" +
            "(5372, 'SEC', 2701, 6550, 3, 2702, 6552, 4),\n" +
            "(5373, 'SIC', 2914, 1380, 3, 2915, 1381, 4),\n" +
            "(5374, 'SIC', 4308, 20, 1, 3499, 3644, 4),\n" +
            "(5375, 'NAICS', 236, 2381, 3, 238, 23811, 4),\n" +
            "(5376, 'SIC', 2901, 1200, 2, 2905, 1230, 3),\n" +
            "(5377, 'NAICS', 2103, 813, 2, 2124, 81392, 4),\n" +
            "(5378, 'SIC', 3526, 3700, 2, 3540, 3740, 3),\n" +
            "(5379, 'SIC', 3131, 2430, 3, 3135, 2436, 4),\n" +
            "(5380, 'NAICS', 1026, 4243, 3, 1030, 42432, 4),\n" +
            "(5381, 'SIC', 4308, 20, 1, 3531, 3715, 4),\n" +
            "(5382, 'NAICS', 2135, 92, 1, 2165, 92219, 4),\n" +
            "(5383, 'SIC', 4310, 50, 1, 3768, 5122, 4),\n" +
            "(5384, 'NAICS', 1644, 54132, 4, 1643, 541320, 5),\n" +
            "(5385, 'SIC', 3749, 5080, 3, 3755, 5088, 4),\n" +
            "(5386, 'NAICS', 2135, 92, 1, 2169, 92311, 4),\n" +
            "(5387, 'SIC', 3654, 4500, 2, 3660, 4580, 3),\n" +
            "(5388, 'NAICS', 253, 2382, 3, 254, 238210, 5),\n" +
            "(5389, 'NAICS', 1004, 4239, 3, 1008, 42392, 4),\n" +
            "(5390, 'SIC', 4308, 20, 1, 3409, 3490, 3),\n" +
            "(5391, 'SIC', 3958, 6300, 2, 3967, 6351, 4),\n" +
            "(5392, 'NAICS', 97, 11299, 4, 96, 112990, 5),\n" +
            "(5393, 'NAICS', 23, 1113, 3, 24, 111310, 5),\n" +
            "(5394, 'SEC', 2405, 3520, 3, 2406, 3523, 4),\n" +
            "(5395, 'NAICS', 1612, 5324, 3, 1614, 532411, 5),\n" +
            "(5396, 'SIC', 4308, 20, 1, 3133, 2434, 4),\n" +
            "(5397, 'NAICS', 1, 11, 1, 102, 1132, 3),\n" +
            "(5398, 'NAICS', 1850, 62, 1, 1941, 62441, 4),\n" +
            "(5399, 'SIC', 4308, 20, 1, 3566, 3842, 4),\n" +
            "(5400, 'SIC', 4305, 1, 1, 2812, 161, 4),\n" +
            "(5401, 'NAICS', 930, 42, 1, 1033, 424340, 5),\n" +
            "(5402, 'NAICS', 1035, 4244, 3, 1047, 42446, 4),\n" +
            "(5403, 'SEC', 2337, 2900, 2, 2339, 2911, 4),\n" +
            "(5404, 'SIC', 3214, 2800, 2, 3238, 2861, 4),\n" +
            "(5405, 'SIC', 3917, 6000, 2, 3932, 6081, 4),\n" +
            "(5406, 'NAICS', 931, 423, 2, 937, 423130, 5),\n" +
            "(5407, 'NAICS', 931, 423, 2, 935, 423120, 5),\n" +
            "(5408, 'SIC', 4208, 8600, 2, 4222, 8699, 4),\n" +
            "(5409, 'NAICS', 1480, 52, 1, 1552, 524292, 5),\n" +
            "(5410, 'NAICS', 930, 42, 1, 1019, 424120, 5),\n" +
            "(5411, 'SEC', 2476, 3800, 2, 2497, 3861, 4),\n" +
            "(5412, 'NAICS', 1624, 54, 1, 1699, 54185, 4),\n" +
            "(5413, 'NAICS', 43, 1119, 3, 53, 111991, 5),\n" +
            "(5414, 'SIC', 3316, 3260, 3, 3319, 3263, 4),\n" +
            "(5415, 'NAICS', 219, 2371, 3, 223, 23712, 4),\n" +
            "(5416, 'SIC', 3124, 2400, 2, 3125, 2410, 3),\n" +
            "(5417, 'SIC', 4125, 7900, 2, 4131, 7930, 3),\n" +
            "(5418, 'SIC', 4313, 70, 1, 4081, 7500, 2),\n" +
            "(5419, 'SEC', 2791, 20, 1, 2461, 3713, 4),\n" +
            "(5420, 'NAICS', 181, 221, 2, 183, 22111, 4),\n" +
            "(5421, 'NAICS', 1625, 541, 2, 1631, 54119, 4),\n" +
            "(5422, 'SIC', 4308, 20, 1, 3258, 2990, 3),\n" +
            "(5423, 'NAICS', 2031, 7225, 3, 2036, 722515, 5),\n" +
            "(5424, 'SIC', 3409, 3490, 3, 3413, 3494, 4),\n" +
            "(5425, 'SEC', 2319, 2800, 2, 2331, 2850, 3),\n" +
            "(5426, 'NAICS', 1569, 53, 1, 1588, 53132, 4),\n" +
            "(5427, 'NAICS', 2103, 813, 2, 2116, 813319, 5),\n" +
            "(5428, 'SIC', 4308, 20, 1, 3130, 2429, 4),\n" +
            "(5429, 'NAICS', 1979, 713, 2, 1983, 713120, 5),\n" +
            "(5430, 'SIC', 3419, 3500, 2, 3427, 3531, 4),\n" +
            "(5431, 'SIC', 4311, 52, 1, 3811, 5260, 3),\n" +
            "(5432, 'SIC', 3419, 3500, 2, 3443, 3549, 4),\n" +
            "(5433, 'NAICS', 1726, 561, 2, 1774, 5617, 3),\n" +
            "(5434, 'NAICS', 999, 42384, 4, 998, 423840, 5),\n" +
            "(5435, 'NAICS', 1850, 62, 1, 1865, 62133, 4),\n" +
            "(5436, 'NAICS', 1851, 621, 2, 1879, 621493, 5),\n" +
            "(5437, 'SIC', 4308, 20, 1, 3234, 2844, 4),\n" +
            "(5438, 'NAICS', 930, 42, 1, 970, 4235, 3),\n" +
            "(5439, 'NAICS', 1037, 42441, 4, 1036, 424410, 5),\n" +
            "(5440, 'NAICS', 1598, 5322, 3, 1603, 532230, 5),\n" +
            "(5441, 'SIC', 4308, 20, 1, 3235, 2850, 3),\n" +
            "(5442, 'NAICS', 133, 211, 2, 137, 211112, 5),\n" +
            "(5443, 'SEC', 2403, 3500, 2, 2410, 3532, 4),\n" +
            "(5444, 'NAICS', 930, 42, 1, 1056, 42451, 4),\n" +
            "(5445, 'NAICS', 57, 1121, 3, 62, 11212, 4),\n" +
            "(5446, 'SIC', 3444, 3550, 3, 3445, 3552, 4),\n" +
            "(5447, 'NAICS', 1015, 424, 2, 1080, 42492, 4),\n" +
            "(5448, 'NAICS', 1419, 512, 2, 1432, 512210, 5),\n" +
            "(5449, 'SIC', 3715, 5000, 2, 3750, 5082, 4),\n" +
            "(5450, 'NAICS', 183, 22111, 4, 188, 221115, 5),\n" +
            "(5451, 'SIC', 4308, 20, 1, 3441, 3547, 4),\n" +
            "(5452, 'NAICS', 56, 112, 2, 74, 11233, 4),\n" +
            "(5453, 'SIC', 4097, 7540, 3, 4098, 7542, 4),\n" +
            "(5454, 'NAICS', 2135, 92, 1, 2182, 925, 2),\n" +
            "(5455, 'SEC', 2694, 6500, 2, 2695, 6510, 3),\n" +
            "(5456, 'NAICS', 1571, 5311, 3, 1573, 53111, 4),\n" +
            "(5457, 'NAICS', 1583, 5313, 3, 1587, 531320, 5),\n" +
            "(5458, 'SEC', 2753, 8000, 2, 2756, 8050, 3),\n" +
            "(5459, 'SIC', 4308, 20, 1, 3227, 2834, 4),\n" +
            "(5460, 'NAICS', 117, 115, 2, 122, 115113, 5),\n" +
            "(5461, 'SEC', 2389, 3430, 3, 2390, 3433, 4),\n" +
            "(5462, 'SEC', 2795, 60, 1, 2653, 6029, 4),\n" +
            "(5463, 'SIC', 4311, 52, 1, 3896, 5943, 4),\n" +
            "(5464, 'SIC', 4312, 60, 1, 3992, 6700, 2),\n" +
            "(5465, 'NAICS', 1990, 7139, 3, 1994, 71392, 4),\n" +
            "(5466, 'NAICS', 1015, 424, 2, 1064, 424690, 5),\n" +
            "(5467, 'NAICS', 1569, 53, 1, 1570, 531, 2),\n" +
            "(5468, 'NAICS', 1894, 622, 2, 1903, 62231, 4),\n" +
            "(5469, 'SEC', 2259, 2100, 2, 2260, 2110, 3),\n" +
            "(5470, 'SIC', 2825, 200, 2, 2838, 254, 4),\n" +
            "(5471, 'SEC', 2796, 70, 1, 2717, 7330, 3),\n" +
            "(5472, 'SIC', 3605, 4100, 2, 3618, 4170, 3),\n" +
            "(5473, 'NAICS', 1942, 71, 1, 1997, 713940, 5),\n" +
            "(5474, 'SIC', 4308, 20, 1, 3297, 3171, 4),\n" +
            "(5475, 'SIC', 3480, 3600, 2, 3492, 3633, 4),\n" +
            "(5476, 'SIC', 3977, 6500, 2, 3989, 6550, 3),\n" +
            "(5477, 'SIC', 3784, 5150, 3, 3785, 5153, 4),\n" +
            "(5478, 'NAICS', 930, 42, 1, 996, 423830, 5),\n" +
            "(5479, 'NAICS', 2053, 81121, 4, 2054, 811211, 5),\n" +
            "(5480, 'NAICS', 1562, 5259, 3, 1568, 52599, 4),\n" +
            "(5481, 'NAICS', 2177, 9241, 3, 2181, 92412, 4),\n" +
            "(5482, 'NAICS', 2137, 9211, 3, 2143, 92113, 4),\n" +
            "(5483, 'SEC', 2791, 20, 1, 2501, 3910, 3),\n" +
            "(5484, 'SIC', 4113, 7800, 2, 4120, 7830, 3),\n" +
            "(5485, 'NAICS', 930, 42, 1, 946, 4233, 3),\n" +
            "(5486, 'SIC', 4313, 70, 1, 4174, 8099, 4),\n" +
            "(5487, 'SIC', 4018, 7210, 3, 4023, 7216, 4),\n" +
            "(5488, 'NAICS', 1836, 6116, 3, 1838, 61161, 4),\n" +
            "(5489, 'SIC', 4308, 20, 1, 3289, 3143, 4),\n" +
            "(5490, 'SIC', 3190, 2700, 2, 3202, 2754, 4),\n" +
            "(5491, 'NAICS', 108, 114, 2, 109, 1141, 3),\n" +
            "(5492, 'NAICS', 1473, 51911, 4, 1472, 519110, 5),\n" +
            "(5493, 'SIC', 3555, 3820, 3, 3560, 3825, 4),\n" +
            "(5494, 'NAICS', 1591, 532, 2, 1616, 532420, 5),\n" +
            "(5495, 'NAICS', 2038, 811, 2, 2066, 81142, 4),\n" +
            "(5496, 'NAICS', 1726, 561, 2, 1770, 561613, 5),\n" +
            "(5497, 'SIC', 4040, 7300, 2, 4048, 7323, 4),\n" +
            "(5498, 'SIC', 4314, 90, 1, 4282, 9531, 4),\n" +
            "(5499, 'NAICS', 930, 42, 1, 997, 42383, 4),\n" +
            "(5500, 'SIC', 4312, 60, 1, 4002, 6790, 3),\n" +
            "(5501, 'NAICS', 1943, 711, 2, 1947, 711120, 5),\n" +
            "(5502, 'NAICS', 2135, 92, 1, 2154, 922120, 5),\n" +
            "(5503, 'SEC', 2791, 20, 1, 2272, 2320, 3),\n" +
            "(5504, 'SIC', 4268, 9400, 2, 4270, 9411, 4),\n" +
            "(5505, 'SIC', 4208, 8600, 2, 4210, 8611, 4),\n" +
            "(5506, 'SIC', 4308, 20, 1, 3056, 2231, 4),\n" +
            "(5507, 'SIC', 3311, 3250, 3, 3312, 3251, 4),\n" +
            "(5508, 'SEC', 2792, 40, 1, 2551, 4899, 4),\n" +
            "(5509, 'SEC', 2640, 5900, 2, 2648, 5990, 3),\n" +
            "(5510, 'SIC', 3649, 4490, 3, 3650, 4491, 4),\n" +
            "(5511, 'SIC', 4311, 52, 1, 3815, 5300, 2),\n" +
            "(5512, 'NAICS', 2137, 9211, 3, 2141, 92112, 4),\n" +
            "(5513, 'SEC', 2791, 20, 1, 2307, 2730, 3),\n" +
            "(5514, 'NAICS', 1850, 62, 1, 1917, 6239, 3),\n" +
            "(5515, 'NAICS', 1015, 424, 2, 1071, 4248, 3),\n" +
            "(5516, 'SIC', 4308, 20, 1, 3087, 2321, 4),\n" +
            "(5517, 'SIC', 4308, 20, 1, 3544, 3760, 3),\n" +
            "(5518, 'NAICS', 1996, 71393, 4, 1995, 713930, 5),\n" +
            "(5519, 'SEC', 2791, 20, 1, 2332, 2851, 4),\n" +
            "(5520, 'SIC', 3958, 6300, 2, 3961, 6320, 3),\n" +
            "(5521, 'SEC', 2459, 3710, 3, 2463, 3715, 4),\n" +
            "(5522, 'NAICS', 1073, 42481, 4, 1072, 424810, 5),\n" +
            "(5523, 'NAICS', 955, 4234, 3, 961, 42343, 4),\n" +
            "(5524, 'NAICS', 1452, 517, 2, 1458, 51721, 4),\n" +
            "(5525, 'NAICS', 1851, 621, 2, 1864, 621330, 5),\n" +
            "(5526, 'SIC', 3715, 5000, 2, 3719, 5014, 4),\n" +
            "(5527, 'SIC', 3480, 3600, 2, 3491, 3632, 4),\n" +
            "(5528, 'NAICS', 1624, 54, 1, 1701, 54186, 4),\n" +
            "(5529, 'SIC', 4310, 50, 1, 3792, 5171, 4),\n" +
            "(5530, 'NAICS', 56, 112, 2, 88, 112519, 5),\n" +
            "(5531, 'SIC', 4309, 40, 1, 3623, 4213, 4),\n" +
            "(5532, 'NAICS', 1851, 621, 2, 1863, 62132, 4),\n" +
            "(5533, 'NAICS', 180, 22, 1, 191, 221118, 5),\n" +
            "(5534, 'NAICS', 1990, 7139, 3, 1995, 713930, 5),\n" +
            "(5535, 'NAICS', 1667, 54151, 4, 1668, 541511, 5),\n" +
            "(5536, 'NAICS', 2053, 81121, 4, 2056, 811213, 5),\n" +
            "(5537, 'SIC', 4308, 20, 1, 3107, 2371, 4),\n" +
            "(5538, 'SEC', 2297, 2630, 3, 2298, 2631, 4),\n" +
            "(5539, 'NAICS', 1625, 541, 2, 1697, 54184, 4),\n" +
            "(5540, 'NAICS', 2195, 92613, 4, 2194, 926130, 5),\n" +
            "(5541, 'SEC', 2792, 40, 1, 2543, 4820, 3),\n" +
            "(5542, 'NAICS', 132, 21, 1, 179, 213115, 5),\n" +
            "(5543, 'NAICS', 138, 212, 2, 148, 212221, 5),\n" +
            "(5544, 'NAICS', 1725, 56, 1, 1801, 562212, 5),\n" +
            "(5545, 'NAICS', 205, 23, 1, 258, 238290, 5),\n" +
            "(5546, 'NAICS', 1480, 52, 1, 1524, 523210, 5),\n" +
            "(5547, 'SIC', 4308, 20, 1, 3202, 2754, 4),\n" +
            "(5548, 'SIC', 3083, 2300, 2, 3086, 2320, 3),\n" +
            "(5549, 'NAICS', 2135, 92, 1, 2191, 92611, 4),\n" +
            "(5550, 'NAICS', 2173, 92313, 4, 2172, 923130, 5),\n" +
            "(5551, 'SIC', 4305, 1, 1, 2854, 724, 4),\n" +
            "(5552, 'SIC', 4308, 20, 1, 3096, 2337, 4),\n" +
            "(5553, 'SIC', 3886, 5900, 2, 3898, 5945, 4),\n" +
            "(5554, 'SIC', 4310, 50, 1, 3749, 5080, 3),\n" +
            "(5555, 'SIC', 4223, 8700, 2, 4235, 8740, 3),\n" +
            "(5556, 'SIC', 2901, 1200, 2, 2906, 1231, 4),\n" +
            "(5557, 'SIC', 4306, 10, 1, 2912, 1320, 3),\n" +
            "(5558, 'SIC', 4308, 20, 1, 3416, 3497, 4),\n" +
            "(5559, 'SIC', 3225, 2830, 3, 3229, 2836, 4),\n" +
            "(5560, 'NAICS', 2003, 72, 1, 2006, 721110, 5),\n" +
            "(5561, 'NAICS', 1482, 5211, 3, 1483, 521110, 5),\n" +
            "(5562, 'SEC', 2738, 7800, 2, 2744, 7829, 4),\n" +
            "(5563, 'SIC', 4203, 8400, 2, 4207, 8422, 4),\n" +
            "(5564, 'SEC', 2704, 6790, 3, 2708, 6799, 4),\n" +
            "(5565, 'SIC', 2993, 2030, 3, 2998, 2037, 4),\n" +
            "(5566, 'NAICS', 1452, 517, 2, 1453, 5171, 3),\n" +
            "(5567, 'SIC', 3261, 3000, 2, 3273, 3081, 4),\n" +
            "(5568, 'NAICS', 1419, 512, 2, 1426, 512131, 5),\n" +
            "(5569, 'NAICS', 1928, 6242, 3, 1932, 624221, 5),\n" +
            "(5570, 'SEC', 2713, 7300, 2, 4329, 7385, 4),\n" +
            "(5571, 'SIC', 4007, 7000, 2, 4011, 7021, 4),\n" +
            "(5572, 'NAICS', 2103, 813, 2, 2112, 8133, 3),\n" +
            "(5573, 'SEC', 2479, 3820, 3, 2485, 3826, 4),\n" +
            "(5574, 'NAICS', 182, 2211, 3, 189, 221116, 5),\n" +
            "(5575, 'NAICS', 1850, 62, 1, 1929, 624210, 5),\n" +
            "(5576, 'NAICS', 2045, 81112, 4, 2047, 811122, 5),\n" +
            "(5577, 'NAICS', 1455, 51711, 4, 1454, 517110, 5),\n" +
            "(5578, 'SIC', 3282, 3100, 2, 3283, 3110, 3),\n" +
            "(5579, 'SIC', 3230, 2840, 3, 3232, 2842, 4),\n" +
            "(5580, 'SIC', 4307, 15, 1, 2960, 1730, 3),\n" +
            "(5581, 'SIC', 3419, 3500, 2, 3432, 3536, 4),\n" +
            "(5582, 'SEC', 2237, 1700, 2, 2239, 1731, 4),\n" +
            "(5583, 'SIC', 3395, 3460, 3, 3397, 3463, 4),\n" +
            "(5584, 'SIC', 4314, 90, 1, 4294, 9651, 4),\n" +
            "(5585, 'NAICS', 2, 111, 2, 37, 11141, 4),\n" +
            "(5586, 'SIC', 4284, 9600, 2, 4292, 9641, 4),\n" +
            "(5587, 'NAICS', 1, 11, 1, 123, 115114, 5),\n" +
            "(5588, 'SEC', 2796, 70, 1, 2783, 8744, 4),\n" +
            "(5589, 'SIC', 4181, 8220, 3, 4182, 8221, 4),\n" +
            "(5590, 'NAICS', 1015, 424, 2, 1043, 42444, 4),\n" +
            "(5591, 'NAICS', 2103, 813, 2, 2121, 813910, 5),\n" +
            "(5592, 'SIC', 4308, 20, 1, 3529, 3713, 4),\n" +
            "(5593, 'NAICS', 1016, 4241, 3, 1020, 42412, 4),\n" +
            "(5594, 'NAICS', 235, 238, 2, 244, 23814, 4),\n" +
            "(5595, 'NAICS', 930, 42, 1, 1042, 424440, 5),\n" +
            "(5596, 'SIC', 4223, 8700, 2, 4232, 8732, 4),\n" +
            "(5597, 'SIC', 4308, 20, 1, 3060, 2251, 4),\n" +
            "(5598, 'SEC', 2791, 20, 1, 2273, 2330, 3),\n" +
            "(5599, 'SIC', 4306, 10, 1, 2913, 1321, 4),\n" +
            "(5600, 'SIC', 3762, 5100, 2, 3775, 5141, 4),\n" +
            "(5601, 'NAICS', 2004, 721, 2, 2013, 7212, 3),\n" +
            "(5602, 'SIC', 3992, 6700, 2, 3997, 6722, 4),\n" +
            "(5603, 'NAICS', 1625, 541, 2, 1668, 541511, 5),\n" +
            "(5604, 'SIC', 3115, 2390, 3, 3119, 2394, 4),\n" +
            "(5605, 'SIC', 3423, 3520, 3, 3424, 3523, 4),\n" +
            "(5606, 'SIC', 4305, 1, 1, 2850, 720, 3),\n" +
            "(5607, 'SEC', 2795, 60, 1, 2670, 6200, 2),\n" +
            "(5608, 'NAICS', 1443, 5151, 3, 1447, 515120, 5),\n" +
            "(5609, 'NAICS', 1533, 52399, 4, 1534, 523991, 5),\n" +
            "(5610, 'SEC', 2791, 20, 1, 2410, 3532, 4),\n" +
            "(5611, 'SIC', 4309, 40, 1, 3699, 4924, 4),\n" +
            "(5612, 'NAICS', 1485, 522, 2, 1507, 522310, 5),\n" +
            "(5613, 'SEC', 2677, 6300, 2, 2687, 6360, 3),\n" +
            "(5614, 'SIC', 3893, 5940, 3, 3900, 5947, 4),\n" +
            "(5615, 'NAICS', 1449, 5152, 3, 1451, 51521, 4),\n" +
            "(5616, 'SIC', 4017, 7200, 2, 4025, 7218, 4),\n" +
            "(5617, 'NAICS', 236, 2381, 3, 250, 23817, 4),\n" +
            "(5618, 'SIC', 4309, 40, 1, 3615, 4142, 4),\n" +
            "(5619, 'NAICS', 56, 112, 2, 61, 112120, 5),\n" +
            "(5620, 'SEC', 2791, 20, 1, 2370, 3290, 3),\n" +
            "(5621, 'SIC', 2910, 1310, 3, 2911, 1311, 4),\n" +
            "(5622, 'SIC', 4308, 20, 1, 3481, 3610, 3),\n" +
            "(5623, 'NAICS', 99, 1131, 3, 101, 11311, 4),\n" +
            "(5624, 'SIC', 3715, 5000, 2, 3728, 5039, 4),\n" +
            "(5625, 'SIC', 4305, 1, 1, 2803, 116, 4),\n" +
            "(5626, 'NAICS', 43, 1119, 3, 51, 11194, 4),\n" +
            "(5627, 'NAICS', 235, 238, 2, 243, 238140, 5),\n" +
            "(5628, 'SIC', 4305, 1, 1, 2833, 241, 4),\n" +
            "(5629, 'NAICS', 1591, 532, 2, 1604, 53223, 4),\n" +
            "(5630, 'NAICS', 1480, 52, 1, 1531, 523930, 5),\n" +
            "(5631, 'SEC', 2476, 3800, 2, 2480, 3821, 4),\n" +
            "(5632, 'SEC', 2791, 20, 1, 2321, 2820, 3),\n" +
            "(5633, 'NAICS', 1624, 54, 1, 1706, 5419, 3),\n" +
            "(5634, 'SEC', 2796, 70, 1, 2729, 7374, 4),\n" +
            "(5635, 'SIC', 3131, 2430, 3, 3136, 2439, 4),\n" +
            "(5636, 'SIC', 4308, 20, 1, 3593, 3961, 4),\n" +
            "(5637, 'SIC', 3419, 3500, 2, 3479, 3599, 4),\n" +
            "(5638, 'NAICS', 144, 2122, 3, 155, 212299, 5),\n" +
            "(5639, 'SEC', 2794, 52, 1, 2628, 5660, 3),\n" +
            "(5640, 'SIC', 4308, 20, 1, 3123, 2399, 4),\n" +
            "(5641, 'SEC', 2790, 15, 1, 2235, 1620, 3),\n" +
            "(5642, 'SIC', 4311, 52, 1, 3831, 5450, 3),\n" +
            "(5643, 'SIC', 4040, 7300, 2, 4055, 7340, 3),\n" +
            "(5644, 'NAICS', 2107, 8132, 3, 2109, 813211, 5),\n" +
            "(5645, 'NAICS', 56, 112, 2, 84, 1125, 3),\n" +
            "(5646, 'NAICS', 229, 2373, 3, 230, 237310, 5),\n" +
            "(5647, 'SIC', 3419, 3500, 2, 3458, 3567, 4),\n" +
            "(5648, 'NAICS', 1025, 42421, 4, 1024, 424210, 5),\n" +
            "(5649, 'NAICS', 1625, 541, 2, 1679, 541620, 5),\n" +
            "(5650, 'SIC', 4309, 40, 1, 3627, 4221, 4),\n" +
            "(5651, 'NAICS', 1513, 523, 2, 1521, 523140, 5),\n" +
            "(5652, 'SIC', 3680, 4800, 2, 3687, 4832, 4),\n" +
            "(5653, 'SIC', 3822, 5400, 2, 3835, 5490, 3),\n" +
            "(5654, 'SIC', 4310, 50, 1, 3779, 5145, 4),\n" +
            "(5655, 'SIC', 3978, 6510, 3, 3983, 6517, 4),\n" +
            "(5656, 'SIC', 2955, 1700, 2, 2959, 1721, 4),\n" +
            "(5657, 'SIC', 4307, 15, 1, 2970, 1761, 4),\n" +
            "(5658, 'NAICS', 1689, 5418, 3, 1697, 54184, 4),\n" +
            "(5659, 'SIC', 4308, 20, 1, 3394, 3452, 4),\n" +
            "(5660, 'NAICS', 1850, 62, 1, 1903, 62231, 4),\n" +
            "(5661, 'SIC', 4308, 20, 1, 3236, 2851, 4),\n" +
            "(5662, 'NAICS', 118, 1151, 3, 122, 115113, 5),\n" +
            "(5663, 'NAICS', 260, 2383, 3, 271, 238390, 5),\n" +
            "(5664, 'NAICS', 1591, 532, 2, 1619, 53249, 4),\n" +
            "(5665, 'NAICS', 1792, 562, 2, 1796, 562112, 5),\n" +
            "(5666, 'SIC', 3605, 4100, 2, 3613, 4140, 3),\n" +
            "(5667, 'NAICS', 1885, 6216, 3, 1886, 621610, 5),\n" +
            "(5668, 'SIC', 3174, 2650, 3, 3178, 2656, 4),\n" +
            "(5669, 'NAICS', 1652, 54136, 4, 1651, 541360, 5),\n" +
            "(5670, 'SIC', 4312, 60, 1, 3996, 6720, 3),\n" +
            "(5671, 'NAICS', 1847, 6117, 3, 1849, 61171, 4),\n" +
            "(5672, 'NAICS', 2135, 92, 1, 2153, 92211, 4),\n" +
            "(5673, 'SIC', 2955, 1700, 2, 2966, 1750, 3),\n" +
            "(5674, 'NAICS', 932, 4231, 3, 939, 423140, 5),\n" +
            "(5675, 'NAICS', 1402, 51, 1, 1463, 51791, 4),\n" +
            "(5676, 'NAICS', 219, 2371, 3, 224, 237130, 5),\n" +
            "(5677, 'SIC', 3371, 3400, 2, 3399, 3466, 4),\n" +
            "(5678, 'SIC', 4313, 70, 1, 4155, 8042, 4),\n" +
            "(5679, 'SIC', 2918, 1400, 2, 2926, 1442, 4),\n" +
            "(5680, 'SIC', 3041, 2100, 2, 3046, 2130, 3),\n" +
            "(5681, 'SEC', 2649, 6000, 2, 2657, 6090, 3),\n" +
            "(5682, 'SIC', 3083, 2300, 2, 3115, 2390, 3),\n" +
            "(5683, 'SEC', 2384, 3400, 2, 2390, 3433, 4),\n" +
            "(5684, 'SIC', 4308, 20, 1, 3338, 3310, 3),\n" +
            "(5685, 'SIC', 3693, 4900, 2, 3705, 4940, 3),\n" +
            "(5686, 'SEC', 2545, 4830, 3, 2547, 4833, 4),\n" +
            "(5687, 'SIC', 4308, 20, 1, 3269, 3060, 3),\n" +
            "(5688, 'SIC', 3756, 5090, 3, 3759, 5093, 4),\n" +
            "(5689, 'SIC', 4308, 20, 1, 3005, 2046, 4),\n" +
            "(5690, 'NAICS', 1625, 541, 2, 1636, 541211, 5),\n" +
            "(5691, 'SEC', 2791, 20, 1, 2393, 3443, 4),\n" +
            "(5692, 'SIC', 4307, 15, 1, 2965, 1743, 4),\n" +
            "(5693, 'SIC', 2948, 1600, 2, 2953, 1623, 4),\n" +
            "(5694, 'SIC', 3886, 5900, 2, 3916, 5999, 4),\n" +
            "(5695, 'SEC', 2713, 7300, 2, 2726, 7371, 4),\n" +
            "(5696, 'NAICS', 2, 111, 2, 17, 111191, 5),\n" +
            "(5697, 'SEC', 2677, 6300, 2, 2686, 6351, 4),\n" +
            "(5698, 'SEC', 2795, 60, 1, 2681, 6321, 4),\n" +
            "(5699, 'SIC', 4305, 1, 1, 2825, 200, 2),\n" +
            "(5700, 'NAICS', 2120, 8139, 3, 2125, 813930, 5),\n" +
            "(5701, 'NAICS', 1754, 56149, 4, 1757, 561499, 5),\n" +
            "(5702, 'NAICS', 2004, 721, 2, 2010, 72119, 4),\n" +
            "(5703, 'SIC', 4308, 20, 1, 3158, 2522, 4),\n" +
            "(5704, 'SIC', 4313, 70, 1, 4020, 7212, 4),\n" +
            "(5705, 'NAICS', 1480, 52, 1, 1532, 52393, 4),\n" +
            "(5706, 'SEC', 2292, 2600, 2, 2296, 2621, 4),\n" +
            "(5707, 'NAICS', 277, 23899, 4, 276, 238990, 5),\n" +
            "(5708, 'SIC', 3148, 2500, 2, 3157, 2521, 4),\n" +
            "(5709, 'SIC', 4310, 50, 1, 3730, 5043, 4),\n" +
            "(5710, 'NAICS', 1804, 5629, 3, 1809, 56299, 4),\n" +
            "(5711, 'SIC', 4314, 90, 1, 4261, 9222, 4),\n" +
            "(5712, 'SIC', 3261, 3000, 2, 3277, 3085, 4),\n" +
            "(5713, 'NAICS', 1591, 532, 2, 1608, 532299, 5),\n" +
            "(5714, 'SIC', 4308, 20, 1, 3220, 2820, 3),\n" +
            "(5715, 'NAICS', 2183, 9251, 3, 2187, 92512, 4),\n" +
            "(5716, 'NAICS', 1419, 512, 2, 1438, 512240, 5),\n" +
            "(5717, 'NAICS', 57, 1121, 3, 60, 112112, 5),\n" +
            "(5718, 'NAICS', 2066, 81142, 4, 2065, 811420, 5),\n" +
            "(5719, 'NAICS', 2188, 926, 2, 2190, 926110, 5),\n" +
            "(5720, 'NAICS', 2039, 8111, 3, 2048, 81119, 4),\n" +
            "(5721, 'SIC', 3662, 4600, 2, 3664, 4612, 4),\n" +
            "(5722, 'SEC', 2221, 1300, 2, 2227, 1389, 4),\n" +
            "(5723, 'NAICS', 2137, 9211, 3, 2142, 921130, 5),\n" +
            "(5724, 'NAICS', 2135, 92, 1, 2140, 921120, 5),\n" +
            "(5725, 'NAICS', 1725, 56, 1, 1765, 561599, 5),\n" +
            "(5726, 'SIC', 3917, 6000, 2, 3929, 6061, 4),\n" +
            "(5727, 'SIC', 3496, 3640, 3, 3501, 3646, 4),\n" +
            "(5728, 'NAICS', 1625, 541, 2, 1641, 541310, 5),\n" +
            "(5729, 'SEC', 2791, 20, 1, 2434, 3600, 2),\n" +
            "(5730, 'NAICS', 23, 1113, 3, 33, 111335, 5),\n" +
            "(5731, 'NAICS', 1994, 71392, 4, 1993, 713920, 5),\n" +
            "(5732, 'NAICS', 144, 2122, 3, 154, 212291, 5),\n" +
            "(5733, 'NAICS', 183, 22111, 4, 185, 221112, 5),\n" +
            "(5734, 'NAICS', 1536, 524, 2, 1539, 524113, 5),\n" +
            "(5735, 'NAICS', 1625, 541, 2, 1682, 54169, 4),\n" +
            "(5736, 'SIC', 4266, 9310, 3, 4267, 9311, 4),\n" +
            "(5737, 'SIC', 2969, 1760, 3, 2970, 1761, 4),\n" +
            "(5738, 'NAICS', 1004, 4239, 3, 1013, 423990, 5),\n" +
            "(5739, 'NAICS', 1727, 5611, 3, 1728, 561110, 5),\n" +
            "(5740, 'SIC', 3489, 3630, 3, 3491, 3632, 4),\n" +
            "(5741, 'SIC', 3822, 5400, 2, 3825, 5420, 3),\n" +
            "(5742, 'SIC', 4017, 7200, 2, 4039, 7299, 4),\n" +
            "(5743, 'NAICS', 1015, 424, 2, 1019, 424120, 5),\n" +
            "(5744, 'NAICS', 1015, 424, 2, 1033, 424340, 5),\n" +
            "(5745, 'SEC', 2479, 3820, 3, 2480, 3821, 4),\n" +
            "(5746, 'NAICS', 3, 1111, 3, 8, 111130, 5),\n" +
            "(5747, 'SIC', 3195, 2730, 3, 3196, 2731, 4),\n" +
            "(5748, 'NAICS', 1792, 562, 2, 1797, 562119, 5),\n" +
            "(5749, 'SEC', 2694, 6500, 2, 2698, 6519, 4),\n" +
            "(5750, 'NAICS', 2104, 8131, 3, 2105, 813110, 5),\n" +
            "(5751, 'NAICS', 117, 115, 2, 121, 115112, 5),\n" +
            "(5752, 'NAICS', 1793, 5621, 3, 1795, 562111, 5),\n" +
            "(5753, 'NAICS', 1624, 54, 1, 1702, 541870, 5),\n" +
            "(5754, 'NAICS', 181, 221, 2, 199, 221310, 5),\n" +
            "(5755, 'NAICS', 1416, 5112, 3, 1418, 51121, 4),\n" +
            "(5756, 'NAICS', 1525, 52321, 4, 1524, 523210, 5),\n" +
            "(5757, 'SEC', 2713, 7300, 2, 2716, 7320, 3),\n" +
            "(5758, 'SEC', 2796, 70, 1, 2741, 7819, 4),\n" +
            "(5759, 'SIC', 3715, 5000, 2, 3745, 5072, 4),\n" +
            "(5760, 'SIC', 4312, 60, 1, 3941, 6141, 4),\n" +
            "(5761, 'SIC', 4313, 70, 1, 4008, 7010, 3),\n" +
            "(5762, 'NAICS', 1, 11, 1, 78, 11239, 4),\n" +
            "(5763, 'SEC', 2791, 20, 1, 2473, 3751, 4),\n" +
            "(5764, 'SIC', 3815, 5300, 2, 3816, 5310, 3),\n" +
            "(5765, 'SIC', 4313, 70, 1, 4212, 8621, 4),\n" +
            "(5766, 'NAICS', 967, 42346, 4, 966, 423460, 5),\n" +
            "(5767, 'SIC', 4308, 20, 1, 3536, 3728, 4),\n" +
            "(5768, 'NAICS', 1625, 541, 2, 1714, 541940, 5),\n" +
            "(5769, 'SIC', 3937, 6100, 2, 3945, 6160, 3),\n" +
            "(5770, 'SIC', 4208, 8600, 2, 4213, 8630, 3),\n" +
            "(5771, 'NAICS', 1026, 4243, 3, 1032, 42433, 4),\n" +
            "(5772, 'SIC', 3337, 3300, 2, 3361, 3357, 4),\n" +
            "(5773, 'NAICS', 2, 111, 2, 27, 11132, 4),\n" +
            "(5774, 'NAICS', 2150, 922, 2, 2157, 92213, 4),\n" +
            "(5775, 'SEC', 2476, 3800, 2, 2485, 3826, 4),\n" +
            "(5776, 'NAICS', 2151, 9221, 3, 2158, 922140, 5),\n" +
            "(5777, 'SEC', 2342, 3000, 2, 2347, 3050, 3),\n" +
            "(5778, 'SEC', 2791, 20, 1, 2345, 3020, 3),\n" +
            "(5779, 'NAICS', 235, 238, 2, 268, 23834, 4),\n" +
            "(5780, 'SIC', 3330, 3290, 3, 3334, 3296, 4),\n" +
            "(5781, 'NAICS', 1725, 56, 1, 1737, 561320, 5),\n" +
            "(5782, 'NAICS', 1920, 624, 2, 1925, 62412, 4),\n" +
            "(5783, 'SEC', 2791, 20, 1, 2400, 3470, 3),\n" +
            "(5784, 'SEC', 2552, 4900, 2, 2558, 4924, 4),\n" +
            "(5785, 'NAICS', 930, 42, 1, 1062, 424610, 5),\n" +
            "(5786, 'NAICS', 1709, 54192, 4, 1711, 541922, 5),\n" +
            "(5787, 'SEC', 2792, 40, 1, 2541, 4812, 4),\n" +
            "(5788, 'SEC', 2775, 8710, 3, 2776, 8711, 4),\n" +
            "(5789, 'NAICS', 1089, 425, 2, 1093, 425120, 5),\n" +
            "(5790, 'SIC', 4309, 40, 1, 3664, 4612, 4),\n" +
            "(5791, 'NAICS', 221, 23711, 4, 220, 237110, 5),\n" +
            "(5792, 'SIC', 3681, 4810, 3, 3683, 4813, 4),\n" +
            "(5793, 'SEC', 2790, 15, 1, 2239, 1731, 4),\n" +
            "(5794, 'SIC', 3272, 3080, 3, 3277, 3085, 4),\n" +
            "(5795, 'NAICS', 1850, 62, 1, 1871, 6214, 3),\n" +
            "(5796, 'NAICS', 1851, 621, 2, 1893, 621999, 5),\n" +
            "(5797, 'SIC', 4313, 70, 1, 4184, 8230, 3),\n" +
            "(5798, 'SEC', 2262, 2200, 2, 2264, 2211, 4),\n" +
            "(5799, 'SIC', 4313, 70, 1, 4123, 7840, 3),\n" +
            "(5800, 'NAICS', 2004, 721, 2, 2014, 72121, 4),\n" +
            "(5801, 'SIC', 3542, 3750, 3, 3543, 3751, 4),\n" +
            "(5802, 'NAICS', 1452, 517, 2, 1457, 517210, 5),\n" +
            "(5803, 'NAICS', 1850, 62, 1, 1889, 621910, 5),\n" +
            "(5804, 'NAICS', 1625, 541, 2, 1711, 541922, 5),\n" +
            "(5805, 'SEC', 2792, 40, 1, 2539, 4800, 2),\n" +
            "(5806, 'NAICS', 1006, 42391, 4, 1005, 423910, 5),\n" +
            "(5807, 'NAICS', 1624, 54, 1, 1681, 541690, 5);\n";
    static String industryCodeInsert22 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(5808, 'SIC', 2798, 100, 2, 2822, 182, 4),\n" +
            "(5809, 'SIC', 4307, 15, 1, 2940, 1520, 3),\n" +
            "(5810, 'NAICS', 2, 111, 2, 21, 111211, 5),\n" +
            "(5811, 'SIC', 2987, 2020, 3, 2988, 2021, 4),\n" +
            "(5812, 'SIC', 3701, 4930, 3, 3704, 4939, 4),\n" +
            "(5813, 'SEC', 2795, 60, 1, 2706, 6794, 4),\n" +
            "(5814, 'SEC', 2796, 70, 1, 2709, 7000, 2),\n" +
            "(5815, 'NAICS', 2061, 8114, 3, 2070, 81149, 4),\n" +
            "(5816, 'NAICS', 1068, 42471, 4, 1067, 424710, 5),\n" +
            "(5817, 'NAICS', 1625, 541, 2, 1667, 54151, 4),\n" +
            "(5818, 'SEC', 2777, 8730, 3, 2778, 8731, 4),\n" +
            "(5819, 'SEC', 2505, 3940, 3, 2506, 3942, 4),\n" +
            "(5820, 'SEC', 2240, 2000, 2, 2246, 2024, 4),\n" +
            "(5821, 'SIC', 4313, 70, 1, 4166, 8070, 3),\n" +
            "(5822, 'SIC', 2955, 1700, 2, 2972, 1771, 4),\n" +
            "(5823, 'NAICS', 2003, 72, 1, 2025, 72232, 4),\n" +
            "(5824, 'SIC', 3996, 6720, 3, 3997, 6722, 4),\n" +
            "(5825, 'NAICS', 2136, 921, 2, 2146, 921150, 5),\n" +
            "(5826, 'SIC', 4012, 7030, 3, 4014, 7033, 4),\n" +
            "(5827, 'NAICS', 1812, 61, 1, 1822, 61131, 4),\n" +
            "(5828, 'NAICS', 2004, 721, 2, 2008, 721120, 5),\n" +
            "(5829, 'SEC', 2791, 20, 1, 2490, 3842, 4),\n" +
            "(5830, 'SEC', 2600, 5170, 3, 2601, 5171, 4),\n" +
            "(5831, 'NAICS', 3, 1111, 3, 16, 11119, 4),\n" +
            "(5832, 'NAICS', 1015, 424, 2, 1031, 424330, 5),\n" +
            "(5833, 'SIC', 4040, 7300, 2, 4056, 7342, 4),\n" +
            "(5834, 'NAICS', 1402, 51, 1, 1447, 515120, 5),\n" +
            "(5835, 'NAICS', 1718, 55, 1, 1719, 551, 2),\n" +
            "(5836, 'NAICS', 2020, 722, 2, 2034, 722513, 5),\n" +
            "(5837, 'SIC', 4308, 20, 1, 3470, 3582, 4),\n" +
            "(5838, 'SIC', 4186, 8240, 3, 4187, 8243, 4),\n" +
            "(5839, 'NAICS', 1480, 52, 1, 1498, 522220, 5),\n" +
            "(5840, 'NAICS', 1, 11, 1, 19, 1112, 3),\n" +
            "(5841, 'SIC', 4312, 60, 1, 3975, 6410, 3),\n" +
            "(5842, 'NAICS', 1943, 711, 2, 1957, 711219, 5),\n" +
            "(5843, 'NAICS', 1, 11, 1, 10, 111140, 5),\n" +
            "(5844, 'NAICS', 981, 42369, 4, 980, 423690, 5),\n" +
            "(5845, 'SIC', 3235, 2850, 3, 3236, 2851, 4),\n" +
            "(5846, 'NAICS', 1689, 5418, 3, 1693, 54182, 4),\n" +
            "(5847, 'NAICS', 1625, 541, 2, 1716, 541990, 5),\n" +
            "(5848, 'SIC', 3489, 3630, 3, 3492, 3633, 4),\n" +
            "(5849, 'SIC', 4223, 8700, 2, 4240, 8748, 4),\n" +
            "(5850, 'NAICS', 1419, 512, 2, 1436, 512230, 5),\n" +
            "(5851, 'SIC', 4306, 10, 1, 2888, 1021, 4),\n" +
            "(5852, 'SEC', 2748, 7900, 2, 2750, 7948, 4),\n" +
            "(5853, 'SIC', 2884, 1000, 2, 2900, 1099, 4),\n" +
            "(5854, 'NAICS', 1624, 54, 1, 1640, 5413, 3),\n" +
            "(5855, 'SEC', 2218, 1200, 2, 2220, 1221, 4),\n" +
            "(5856, 'SIC', 2940, 1520, 3, 2942, 1522, 4),\n" +
            "(5857, 'NAICS', 1625, 541, 2, 1709, 54192, 4),\n" +
            "(5858, 'NAICS', 1979, 713, 2, 1991, 713910, 5),\n" +
            "(5859, 'SIC', 4309, 40, 1, 3698, 4923, 4),\n" +
            "(5860, 'SIC', 3749, 5080, 3, 3750, 5082, 4),\n" +
            "(5861, 'SIC', 3620, 4200, 2, 3632, 4231, 4),\n" +
            "(5862, 'NAICS', 2177, 9241, 3, 2180, 924120, 5),\n" +
            "(5863, 'NAICS', 1850, 62, 1, 1858, 62121, 4),\n" +
            "(5864, 'NAICS', 2189, 9261, 3, 2196, 926140, 5),\n" +
            "(5865, 'SIC', 3667, 4700, 2, 3673, 4731, 4),\n" +
            "(5866, 'SEC', 2791, 20, 1, 2335, 2890, 3),\n" +
            "(5867, 'SIC', 4308, 20, 1, 3247, 2891, 4),\n" +
            "(5868, 'NAICS', 2, 111, 2, 20, 11121, 4),\n" +
            "(5869, 'NAICS', 1624, 54, 1, 1712, 541930, 5),\n" +
            "(5870, 'SEC', 2315, 2770, 3, 2316, 2771, 4),\n" +
            "(5871, 'NAICS', 126, 1152, 3, 127, 115210, 5),\n" +
            "(5872, 'NAICS', 930, 42, 1, 1003, 42386, 4),\n" +
            "(5873, 'NAICS', 2037, 81, 1, 2070, 81149, 4),\n" +
            "(5874, 'SEC', 2355, 3200, 2, 2363, 3241, 4),\n" +
            "(5875, 'SEC', 2678, 6310, 3, 2679, 6311, 4),\n" +
            "(5876, 'SIC', 4306, 10, 1, 2898, 1090, 3),\n" +
            "(5877, 'NAICS', 272, 23839, 4, 271, 238390, 5),\n" +
            "(5878, 'NAICS', 1979, 713, 2, 1988, 713290, 5),\n" +
            "(5879, 'NAICS', 1513, 523, 2, 1535, 523999, 5),\n" +
            "(5880, 'SIC', 2955, 1700, 2, 2980, 1796, 4),\n" +
            "(5881, 'NAICS', 1402, 51, 1, 1473, 51911, 4),\n" +
            "(5882, 'SIC', 2825, 200, 2, 2830, 214, 4),\n" +
            "(5883, 'NAICS', 950, 42332, 4, 949, 423320, 5),\n" +
            "(5884, 'NAICS', 1592, 5321, 3, 1594, 532111, 5),\n" +
            "(5885, 'NAICS', 1851, 621, 2, 1875, 62142, 4),\n" +
            "(5886, 'SEC', 2791, 20, 1, 2289, 2531, 4),\n" +
            "(5887, 'NAICS', 954, 42339, 4, 953, 423390, 5),\n" +
            "(5888, 'NAICS', 1609, 5323, 3, 1610, 532310, 5),\n" +
            "(5889, 'SEC', 2694, 6500, 2, 2700, 6531, 4),\n" +
            "(5890, 'NAICS', 205, 23, 1, 265, 238330, 5),\n" +
            "(5891, 'SEC', 2796, 70, 1, 2746, 7840, 3),\n" +
            "(5892, 'NAICS', 1480, 52, 1, 1561, 52519, 4),\n" +
            "(5893, 'SIC', 3041, 2100, 2, 3044, 2120, 3),\n" +
            "(5894, 'SIC', 2901, 1200, 2, 2903, 1221, 4),\n" +
            "(5895, 'SIC', 4308, 20, 1, 3088, 2322, 4),\n" +
            "(5896, 'SIC', 3461, 3570, 3, 3464, 3575, 4),\n" +
            "(5897, 'SIC', 4308, 20, 1, 3116, 2391, 4),\n" +
            "(5898, 'SIC', 3180, 2670, 3, 3185, 2675, 4),\n" +
            "(5899, 'NAICS', 1402, 51, 1, 1425, 51213, 4),\n" +
            "(5900, 'SIC', 4313, 70, 1, 4096, 7539, 4),\n" +
            "(5901, 'SEC', 2791, 20, 1, 2378, 3340, 3),\n" +
            "(5902, 'NAICS', 1076, 4249, 3, 1085, 424950, 5),\n" +
            "(5903, 'NAICS', 1943, 711, 2, 1960, 71131, 4),\n" +
            "(5904, 'SIC', 4308, 20, 1, 3363, 3363, 4),\n" +
            "(5905, 'NAICS', 9, 11113, 4, 8, 111130, 5),\n" +
            "(5906, 'NAICS', 235, 238, 2, 238, 23811, 4),\n" +
            "(5907, 'SIC', 3668, 4720, 3, 3669, 4724, 4),\n" +
            "(5908, 'NAICS', 162, 21232, 4, 164, 212322, 5),\n" +
            "(5909, 'SEC', 2610, 5300, 2, 2616, 5399, 4),\n" +
            "(5910, 'SEC', 2796, 70, 1, 2761, 8071, 4),\n" +
            "(5911, 'SIC', 4308, 20, 1, 3579, 3914, 4),\n" +
            "(5912, 'NAICS', 207, 2361, 3, 210, 236116, 5),\n" +
            "(5913, 'NAICS', 2020, 722, 2, 2035, 722514, 5),\n" +
            "(5914, 'NAICS', 138, 212, 2, 141, 212111, 5),\n" +
            "(5915, 'SIC', 4313, 70, 1, 4064, 7363, 4),\n" +
            "(5916, 'NAICS', 1444, 51511, 4, 1445, 515111, 5),\n" +
            "(5917, 'SIC', 3057, 2240, 3, 3058, 2241, 4),\n" +
            "(5918, 'SIC', 3322, 3270, 3, 3326, 3274, 4),\n" +
            "(5919, 'NAICS', 930, 42, 1, 1011, 423940, 5),\n" +
            "(5920, 'NAICS', 930, 42, 1, 994, 423820, 5),\n" +
            "(5921, 'SIC', 2901, 1200, 2, 2908, 1241, 4),\n" +
            "(5922, 'SIC', 3214, 2800, 2, 3250, 2895, 4),\n" +
            "(5923, 'SIC', 4306, 10, 1, 2919, 1410, 3),\n" +
            "(5924, 'SIC', 4309, 40, 1, 3642, 4432, 4),\n" +
            "(5925, 'NAICS', 1419, 512, 2, 1421, 512110, 5),\n" +
            "(5926, 'NAICS', 1850, 62, 1, 1914, 62331, 4),\n" +
            "(5927, 'NAICS', 2038, 811, 2, 2044, 811118, 5),\n" +
            "(5928, 'SIC', 4310, 50, 1, 3771, 5136, 4),\n" +
            "(5929, 'NAICS', 1979, 713, 2, 2001, 713990, 5),\n" +
            "(5930, 'NAICS', 1876, 62149, 4, 1880, 621498, 5),\n" +
            "(5931, 'SEC', 2713, 7300, 2, 2734, 7389, 4),\n" +
            "(5932, 'SIC', 3480, 3600, 2, 3510, 3669, 4),\n" +
            "(5933, 'NAICS', 930, 42, 1, 1007, 423920, 5),\n" +
            "(5934, 'NAICS', 1485, 522, 2, 1510, 52232, 4),\n" +
            "(5935, 'NAICS', 1562, 5259, 3, 1565, 525920, 5),\n" +
            "(5936, 'SIC', 4256, 9200, 2, 4259, 9220, 3),\n" +
            "(5937, 'NAICS', 1537, 5241, 3, 1544, 524128, 5),\n" +
            "(5938, 'NAICS', 1, 11, 1, 33, 111335, 5),\n" +
            "(5939, 'SEC', 2355, 3200, 2, 2360, 3230, 3),\n" +
            "(5940, 'SEC', 2456, 3690, 3, 2457, 3695, 4),\n" +
            "(5941, 'SIC', 4313, 70, 1, 4013, 7032, 4),\n" +
            "(5942, 'NAICS', 1730, 5612, 3, 1732, 56121, 4),\n" +
            "(5943, 'NAICS', 1605, 53229, 4, 1606, 532291, 5),\n" +
            "(5944, 'SIC', 4308, 20, 1, 3465, 3577, 4),\n" +
            "(5945, 'NAICS', 1725, 56, 1, 1751, 56144, 4),\n" +
            "(5946, 'SIC', 3272, 3080, 3, 3273, 3081, 4),\n" +
            "(5947, 'SIC', 3721, 5020, 3, 3723, 5023, 4),\n" +
            "(5948, 'SEC', 2792, 40, 1, 2537, 4730, 3),\n" +
            "(5949, 'NAICS', 1901, 6223, 3, 1902, 622310, 5),\n" +
            "(5950, 'SIC', 3214, 2800, 2, 3222, 2822, 4),\n" +
            "(5951, 'SEC', 2319, 2800, 2, 2327, 2836, 4),\n" +
            "(5952, 'SIC', 4313, 70, 1, 4170, 8082, 4),\n" +
            "(5953, 'SIC', 3261, 3000, 2, 3272, 3080, 3),\n" +
            "(5954, 'SIC', 3859, 5630, 3, 3860, 5632, 4),\n" +
            "(5955, 'NAICS', 955, 4234, 3, 964, 423450, 5),\n" +
            "(5956, 'SIC', 4313, 70, 1, 4019, 7211, 4),\n" +
            "(5957, 'SIC', 2982, 2000, 2, 3038, 2097, 4),\n" +
            "(5958, 'NAICS', 1557, 52511, 4, 1556, 525110, 5),\n" +
            "(5959, 'NAICS', 931, 423, 2, 941, 4232, 3),\n" +
            "(5960, 'NAICS', 1726, 561, 2, 1752, 561450, 5),\n" +
            "(5961, 'SEC', 2793, 50, 1, 2573, 5031, 4),\n" +
            "(5962, 'SIC', 3605, 4100, 2, 3617, 4151, 4),\n" +
            "(5963, 'NAICS', 1625, 541, 2, 1693, 54182, 4),\n" +
            "(5964, 'NAICS', 1831, 61151, 4, 1834, 611513, 5),\n" +
            "(5965, 'SEC', 2791, 20, 1, 2350, 3081, 4),\n" +
            "(5966, 'SIC', 3285, 3130, 3, 3286, 3131, 4),\n" +
            "(5967, 'NAICS', 1850, 62, 1, 1874, 621420, 5),\n" +
            "(5968, 'SIC', 3958, 6300, 2, 3971, 6371, 4),\n" +
            "(5969, 'NAICS', 1569, 53, 1, 1574, 531120, 5),\n" +
            "(5970, 'NAICS', 218, 237, 2, 220, 237110, 5),\n" +
            "(5971, 'NAICS', 1480, 52, 1, 1516, 52311, 4),\n" +
            "(5972, 'SEC', 2791, 20, 1, 2374, 3317, 4),\n" +
            "(5973, 'SIC', 3886, 5900, 2, 3897, 5944, 4),\n" +
            "(5974, 'SIC', 4313, 70, 1, 4082, 7510, 3),\n" +
            "(5975, 'NAICS', 1813, 611, 2, 1840, 61162, 4),\n" +
            "(5976, 'NAICS', 1442, 515, 2, 1446, 515112, 5),\n" +
            "(5977, 'NAICS', 1569, 53, 1, 1591, 532, 2),\n" +
            "(5978, 'NAICS', 1495, 5222, 3, 1496, 522210, 5),\n" +
            "(5979, 'SIC', 3124, 2400, 2, 3133, 2434, 4),\n" +
            "(5980, 'NAICS', 930, 42, 1, 966, 423460, 5),\n" +
            "(5981, 'SIC', 4308, 20, 1, 3104, 2361, 4),\n" +
            "(5982, 'SIC', 4309, 40, 1, 3654, 4500, 2),\n" +
            "(5983, 'NAICS', 1480, 52, 1, 1484, 52111, 4),\n" +
            "(5984, 'SIC', 2951, 1620, 3, 2952, 1622, 4),\n" +
            "(5985, 'SIC', 4311, 52, 1, 3806, 5211, 4),\n" +
            "(5986, 'SIC', 4313, 70, 1, 4180, 8211, 4),\n" +
            "(5987, 'NAICS', 206, 236, 2, 210, 236116, 5),\n" +
            "(5988, 'NAICS', 1726, 561, 2, 1731, 561210, 5),\n" +
            "(5989, 'SIC', 4257, 9210, 3, 4258, 9211, 4),\n" +
            "(5990, 'NAICS', 1850, 62, 1, 1927, 62419, 4),\n" +
            "(5991, 'NAICS', 2104, 8131, 3, 2106, 81311, 4),\n" +
            "(5992, 'NAICS', 1480, 52, 1, 1556, 525110, 5),\n" +
            "(5993, 'SEC', 2477, 3810, 3, 2478, 3812, 4),\n" +
            "(5994, 'NAICS', 1480, 52, 1, 1499, 52222, 4),\n" +
            "(5995, 'SIC', 2982, 2000, 2, 3009, 2051, 4),\n" +
            "(5996, 'NAICS', 118, 1151, 3, 121, 115112, 5),\n" +
            "(5997, 'SIC', 3261, 3000, 2, 3270, 3061, 4),\n" +
            "(5998, 'NAICS', 1480, 52, 1, 1537, 5241, 3),\n" +
            "(5999, 'NAICS', 1925, 62412, 4, 1924, 624120, 5),\n" +
            "(6000, 'SIC', 4308, 20, 1, 3010, 2052, 4),\n" +
            "(6001, 'SEC', 2328, 2840, 3, 2329, 2842, 4),\n" +
            "(6002, 'SIC', 3086, 2320, 3, 3090, 2325, 4),\n" +
            "(6003, 'NAICS', 1569, 53, 1, 1594, 532111, 5),\n" +
            "(6004, 'NAICS', 1727, 5611, 3, 1729, 56111, 4),\n" +
            "(6005, 'SIC', 4284, 9600, 2, 4291, 9640, 3),\n" +
            "(6006, 'NAICS', 1, 11, 1, 107, 11331, 4),\n" +
            "(6007, 'NAICS', 1419, 512, 2, 1434, 512220, 5),\n" +
            "(6008, 'NAICS', 1495, 5222, 3, 1502, 522292, 5),\n" +
            "(6009, 'SIC', 2825, 200, 2, 2843, 273, 4),\n" +
            "(6010, 'SIC', 4308, 20, 1, 3395, 3460, 3),\n" +
            "(6011, 'SIC', 4017, 7200, 2, 4021, 7213, 4),\n" +
            "(6012, 'SIC', 4310, 50, 1, 3732, 5045, 4),\n" +
            "(6013, 'SEC', 2792, 40, 1, 2524, 4410, 3),\n" +
            "(6014, 'SIC', 3643, 4440, 3, 3644, 4449, 4),\n" +
            "(6015, 'NAICS', 257, 23822, 4, 256, 238220, 5),\n" +
            "(6016, 'SIC', 4312, 60, 1, 3958, 6300, 2),\n" +
            "(6017, 'SIC', 4166, 8070, 3, 4168, 8072, 4),\n" +
            "(6018, 'SEC', 2796, 70, 1, 2768, 8111, 4),\n" +
            "(6019, 'SEC', 2738, 7800, 2, 2742, 7820, 3),\n" +
            "(6020, 'SEC', 2791, 20, 1, 2402, 3490, 3),\n" +
            "(6021, 'NAICS', 1928, 6242, 3, 1931, 62422, 4),\n" +
            "(6022, 'NAICS', 1035, 4244, 3, 1048, 424470, 5),\n" +
            "(6023, 'SEC', 2600, 5170, 3, 2602, 5172, 4),\n" +
            "(6024, 'SEC', 2240, 2000, 2, 2245, 2020, 3),\n" +
            "(6025, 'SIC', 4082, 7510, 3, 4084, 7514, 4),\n" +
            "(6026, 'SEC', 2794, 52, 1, 2617, 5400, 2),\n" +
            "(6027, 'SIC', 3889, 5920, 3, 3890, 5921, 4),\n" +
            "(6028, 'NAICS', 192, 22112, 4, 194, 221122, 5),\n" +
            "(6029, 'NAICS', 1, 11, 1, 13, 11115, 4),\n" +
            "(6030, 'SIC', 4308, 20, 1, 3387, 3443, 4),\n" +
            "(6031, 'SIC', 3261, 3000, 2, 3262, 3010, 3),\n" +
            "(6032, 'NAICS', 1, 11, 1, 91, 11291, 4),\n" +
            "(6033, 'SIC', 4314, 90, 1, 4257, 9210, 3),\n" +
            "(6034, 'SIC', 4308, 20, 1, 3459, 3568, 4),\n" +
            "(6035, 'SIC', 4309, 40, 1, 3677, 4783, 4),\n" +
            "(6036, 'NAICS', 1569, 53, 1, 1572, 531110, 5),\n" +
            "(6037, 'SIC', 4308, 20, 1, 3032, 2087, 4),\n" +
            "(6038, 'NAICS', 2145, 92114, 4, 2144, 921140, 5),\n" +
            "(6039, 'NAICS', 235, 238, 2, 255, 23821, 4),\n" +
            "(6040, 'SEC', 2791, 20, 1, 2385, 3410, 3),\n" +
            "(6041, 'SIC', 4208, 8600, 2, 4214, 8631, 4),\n" +
            "(6042, 'SIC', 4308, 20, 1, 3562, 3827, 4),\n" +
            "(6043, 'NAICS', 262, 23831, 4, 261, 238310, 5),\n" +
            "(6044, 'SIC', 4208, 8600, 2, 4209, 8610, 3),\n" +
            "(6045, 'SEC', 2792, 40, 1, 2516, 4100, 2),\n" +
            "(6046, 'SIC', 4308, 20, 1, 3515, 3675, 4),\n" +
            "(6047, 'NAICS', 1402, 51, 1, 1420, 5121, 3),\n" +
            "(6048, 'NAICS', 1634, 5412, 3, 1638, 541214, 5),\n" +
            "(6049, 'NAICS', 1920, 624, 2, 1921, 6241, 3),\n" +
            "(6050, 'SIC', 3282, 3100, 2, 3297, 3171, 4),\n" +
            "(6051, 'SIC', 3784, 5150, 3, 3786, 5154, 4),\n" +
            "(6052, 'NAICS', 1903, 62231, 4, 1902, 622310, 5),\n" +
            "(6053, 'NAICS', 1942, 71, 1, 1984, 71312, 4),\n" +
            "(6054, 'SEC', 2694, 6500, 2, 2699, 6530, 3),\n" +
            "(6055, 'SIC', 3053, 2220, 3, 3054, 2221, 4),\n" +
            "(6056, 'NAICS', 930, 42, 1, 969, 42349, 4),\n" +
            "(6057, 'NAICS', 1066, 4247, 3, 1067, 424710, 5),\n" +
            "(6058, 'SIC', 4309, 40, 1, 3643, 4440, 3),\n" +
            "(6059, 'SEC', 2310, 2740, 3, 2311, 2741, 4),\n" +
            "(6060, 'SEC', 2596, 5140, 3, 2597, 5141, 4),\n" +
            "(6061, 'NAICS', 198, 2213, 3, 199, 221310, 5),\n" +
            "(6062, 'SEC', 2610, 5300, 2, 2615, 5390, 3),\n" +
            "(6063, 'SIC', 4308, 20, 1, 3274, 3082, 4),\n" +
            "(6064, 'SIC', 3282, 3100, 2, 3289, 3143, 4),\n" +
            "(6065, 'SIC', 3371, 3400, 2, 3397, 3463, 4),\n" +
            "(6066, 'NAICS', 1851, 621, 2, 1892, 621991, 5),\n" +
            "(6067, 'SIC', 4308, 20, 1, 3125, 2410, 3),\n" +
            "(6068, 'NAICS', 2037, 81, 1, 2087, 81231, 4),\n" +
            "(6069, 'NAICS', 2061, 8114, 3, 2066, 81142, 4),\n" +
            "(6070, 'SIC', 2982, 2000, 2, 3014, 2062, 4),\n" +
            "(6071, 'SIC', 2982, 2000, 2, 3004, 2045, 4),\n" +
            "(6072, 'SEC', 2720, 7350, 3, 2721, 7359, 4),\n" +
            "(6073, 'NAICS', 1726, 561, 2, 1763, 56159, 4),\n" +
            "(6074, 'SIC', 3715, 5000, 2, 3737, 5050, 3),\n" +
            "(6075, 'SIC', 3992, 6700, 2, 3995, 6719, 4),\n" +
            "(6076, 'SIC', 4313, 70, 1, 4131, 7930, 3),\n" +
            "(6077, 'SIC', 3124, 2400, 2, 3130, 2429, 4),\n" +
            "(6078, 'SIC', 2982, 2000, 2, 3024, 2077, 4),\n" +
            "(6079, 'SIC', 4308, 20, 1, 3534, 3721, 4),\n" +
            "(6080, 'SIC', 4308, 20, 1, 3600, 3999, 4),\n" +
            "(6081, 'NAICS', 132, 21, 1, 148, 212221, 5),\n" +
            "(6082, 'NAICS', 1905, 6231, 3, 1906, 623110, 5),\n" +
            "(6083, 'SEC', 2222, 1310, 3, 2223, 1311, 4),\n" +
            "(6084, 'SIC', 3026, 2080, 3, 3032, 2087, 4),\n" +
            "(6085, 'NAICS', 931, 423, 2, 977, 42361, 4),\n" +
            "(6086, 'NAICS', 2135, 92, 1, 2208, 928120, 5),\n" +
            "(6087, 'SIC', 3820, 5390, 3, 3821, 5399, 4),\n" +
            "(6088, 'SIC', 2982, 2000, 2, 3008, 2050, 3),\n" +
            "(6089, 'SIC', 4146, 8000, 2, 4168, 8072, 4),\n" +
            "(6090, 'SIC', 4305, 1, 1, 2861, 760, 3),\n" +
            "(6091, 'NAICS', 68, 1123, 3, 75, 112340, 5),\n" +
            "(6092, 'SIC', 4308, 20, 1, 3021, 2074, 4),\n" +
            "(6093, 'NAICS', 930, 42, 1, 1089, 425, 2),\n" +
            "(6094, 'NAICS', 2071, 812, 2, 2096, 81292, 4),\n" +
            "(6095, 'NAICS', 1689, 5418, 3, 1703, 54187, 4),\n" +
            "(6096, 'NAICS', 931, 423, 2, 952, 42333, 4),\n" +
            "(6097, 'SIC', 4308, 20, 1, 3590, 3953, 4),\n" +
            "(6098, 'SIC', 4305, 1, 1, 2852, 722, 4),\n" +
            "(6099, 'SIC', 3148, 2500, 2, 3155, 2519, 4),\n" +
            "(6100, 'SIC', 4310, 50, 1, 3760, 5094, 4),\n" +
            "(6101, 'SEC', 2488, 3840, 3, 2489, 3841, 4),\n" +
            "(6102, 'SEC', 2434, 3600, 2, 2450, 3670, 3),\n" +
            "(6103, 'SIC', 4306, 10, 1, 2909, 1300, 2),\n" +
            "(6104, 'NAICS', 1480, 52, 1, 1530, 52392, 4),\n" +
            "(6105, 'NAICS', 1506, 5223, 3, 1511, 522390, 5),\n" +
            "(6106, 'NAICS', 1836, 6116, 3, 1842, 61163, 4),\n" +
            "(6107, 'NAICS', 2048, 81119, 4, 2051, 811198, 5),\n" +
            "(6108, 'SEC', 2292, 2600, 2, 2297, 2630, 3),\n" +
            "(6109, 'SIC', 4311, 52, 1, 3902, 5949, 4),\n" +
            "(6110, 'NAICS', 930, 42, 1, 976, 423610, 5),\n" +
            "(6111, 'SIC', 4313, 70, 1, 4053, 7336, 4),\n" +
            "(6112, 'NAICS', 2060, 81131, 4, 2059, 811310, 5),\n" +
            "(6113, 'NAICS', 1625, 541, 2, 1666, 5415, 3),\n" +
            "(6114, 'SIC', 4308, 20, 1, 3457, 3566, 4),\n" +
            "(6115, 'NAICS', 930, 42, 1, 1043, 42444, 4),\n" +
            "(6116, 'NAICS', 1, 11, 1, 82, 112420, 5),\n" +
            "(6117, 'SEC', 2793, 50, 1, 2574, 5040, 3),\n" +
            "(6118, 'SIC', 3395, 3460, 3, 3399, 3466, 4),\n" +
            "(6119, 'SIC', 4308, 20, 1, 3368, 3390, 3),\n" +
            "(6120, 'NAICS', 2093, 8129, 3, 2100, 81293, 4),\n" +
            "(6121, 'NAICS', 2193, 92612, 4, 2192, 926120, 5),\n" +
            "(6122, 'NAICS', 931, 423, 2, 942, 423210, 5),\n" +
            "(6123, 'NAICS', 1569, 53, 1, 1603, 532230, 5),\n" +
            "(6124, 'SEC', 2792, 40, 1, 2517, 4200, 2),\n" +
            "(6125, 'NAICS', 1625, 541, 2, 1696, 541840, 5),\n" +
            "(6126, 'SIC', 3883, 5810, 3, 3884, 5812, 4),\n" +
            "(6127, 'NAICS', 1970, 7121, 3, 1977, 712190, 5),\n" +
            "(6128, 'SEC', 2617, 5400, 2, 2619, 5411, 4),\n" +
            "(6129, 'SIC', 4309, 40, 1, 3620, 4200, 2),\n" +
            "(6130, 'SIC', 4308, 20, 1, 3257, 2952, 4),\n" +
            "(6131, 'SEC', 2355, 3200, 2, 2362, 3240, 3),\n" +
            "(6132, 'NAICS', 1718, 55, 1, 1721, 55111, 4),\n" +
            "(6133, 'NAICS', 1792, 562, 2, 1801, 562212, 5),\n" +
            "(6134, 'SIC', 3480, 3600, 2, 3519, 3679, 4),\n" +
            "(6135, 'SIC', 3886, 5900, 2, 3888, 5912, 4),\n" +
            "(6136, 'NAICS', 1725, 56, 1, 1788, 561920, 5),\n" +
            "(6137, 'NAICS', 1591, 532, 2, 1615, 532412, 5),\n" +
            "(6138, 'SIC', 3762, 5100, 2, 3781, 5147, 4),\n" +
            "(6139, 'NAICS', 1913, 6233, 3, 1915, 623311, 5),\n" +
            "(6140, 'NAICS', 2037, 81, 1, 2104, 8131, 3),\n" +
            "(6141, 'NAICS', 1015, 424, 2, 1042, 424440, 5),\n" +
            "(6142, 'NAICS', 1952, 71119, 4, 1951, 711190, 5),\n" +
            "(6143, 'NAICS', 1672, 5416, 3, 1680, 54162, 4),\n" +
            "(6144, 'NAICS', 1640, 5413, 3, 1653, 541370, 5),\n" +
            "(6145, 'NAICS', 2120, 8139, 3, 2130, 81399, 4),\n" +
            "(6146, 'NAICS', 1624, 54, 1, 1678, 541618, 5),\n" +
            "(6147, 'SEC', 2687, 6360, 3, 2688, 6361, 4),\n" +
            "(6148, 'SIC', 3977, 6500, 2, 3979, 6512, 4),\n" +
            "(6149, 'SIC', 3371, 3400, 2, 3414, 3495, 4),\n" +
            "(6150, 'NAICS', 1624, 54, 1, 1715, 54194, 4),\n" +
            "(6151, 'NAICS', 1526, 5239, 3, 1533, 52399, 4),\n" +
            "(6152, 'SIC', 4308, 20, 1, 3283, 3110, 3),\n" +
            "(6153, 'SIC', 3480, 3600, 2, 3483, 3613, 4),\n" +
            "(6154, 'SIC', 3214, 2800, 2, 3219, 2819, 4),\n" +
            "(6155, 'SEC', 2792, 40, 1, 2534, 4600, 2),\n" +
            "(6156, 'SIC', 3214, 2800, 2, 3228, 2835, 4),\n" +
            "(6157, 'SEC', 2794, 52, 1, 2614, 5331, 4),\n" +
            "(6158, 'NAICS', 1942, 71, 1, 1987, 71321, 4),\n" +
            "(6159, 'SEC', 2476, 3800, 2, 2499, 3873, 4),\n" +
            "(6160, 'SIC', 3917, 6000, 2, 3923, 6022, 4),\n" +
            "(6161, 'NAICS', 36, 1114, 3, 40, 11142, 4),\n" +
            "(6162, 'SEC', 2323, 2830, 3, 2325, 2834, 4),\n" +
            "(6163, 'SIC', 4308, 20, 1, 3261, 3000, 2),\n" +
            "(6164, 'SIC', 4058, 7350, 3, 4060, 7353, 4),\n" +
            "(6165, 'NAICS', 1513, 523, 2, 1526, 5239, 3),\n" +
            "(6166, 'NAICS', 2151, 9221, 3, 2155, 92212, 4),\n" +
            "(6167, 'SIC', 4146, 8000, 2, 4152, 8031, 4),\n" +
            "(6168, 'NAICS', 1523, 5232, 3, 1525, 52321, 4),\n" +
            "(6169, 'NAICS', 1624, 54, 1, 1708, 54191, 4),\n" +
            "(6170, 'NAICS', 1850, 62, 1, 1924, 624120, 5),\n" +
            "(6171, 'NAICS', 2003, 72, 1, 2033, 722511, 5),\n" +
            "(6172, 'SEC', 2355, 3200, 2, 2361, 3231, 4),\n" +
            "(6173, 'SEC', 2526, 4500, 2, 2528, 4512, 4),\n" +
            "(6174, 'NAICS', 260, 2383, 3, 263, 238320, 5),\n" +
            "(6175, 'SEC', 2376, 3330, 3, 2377, 3334, 4),\n" +
            "(6176, 'SEC', 2640, 5900, 2, 2647, 5961, 4),\n" +
            "(6177, 'SEC', 2540, 4810, 3, 2542, 4813, 4),\n" +
            "(6178, 'SIC', 4179, 8210, 3, 4180, 8211, 4),\n" +
            "(6179, 'SEC', 2342, 3000, 2, 2348, 3060, 3),\n" +
            "(6180, 'NAICS', 1569, 53, 1, 1617, 53242, 4),\n" +
            "(6181, 'SIC', 3863, 5650, 3, 3864, 5651, 4),\n" +
            "(6182, 'SEC', 2794, 52, 1, 2644, 5944, 4),\n" +
            "(6183, 'SIC', 3073, 2280, 3, 3074, 2281, 4),\n" +
            "(6184, 'SIC', 4308, 20, 1, 3426, 3530, 3),\n" +
            "(6185, 'SIC', 3000, 2040, 3, 3006, 2047, 4),\n" +
            "(6186, 'SIC', 4313, 70, 1, 4114, 7810, 3),\n" +
            "(6187, 'SIC', 3511, 3670, 3, 3515, 3675, 4),\n" +
            "(6188, 'SIC', 3337, 3300, 2, 3366, 3366, 4),\n" +
            "(6189, 'SIC', 4308, 20, 1, 3307, 3230, 3),\n" +
            "(6190, 'SIC', 4310, 50, 1, 3758, 5092, 4),\n" +
            "(6191, 'NAICS', 1533, 52399, 4, 1535, 523999, 5),\n" +
            "(6192, 'SIC', 2987, 2020, 3, 2989, 2022, 4),\n" +
            "(6193, 'SEC', 2537, 4730, 3, 2538, 4731, 4),\n" +
            "(6194, 'NAICS', 218, 237, 2, 222, 237120, 5),\n" +
            "(6195, 'SEC', 2793, 50, 1, 2598, 5150, 3),\n" +
            "(6196, 'SIC', 3715, 5000, 2, 3755, 5088, 4),\n" +
            "(6197, 'NAICS', 1656, 54138, 4, 1655, 541380, 5),\n" +
            "(6198, 'NAICS', 1859, 6213, 3, 1865, 62133, 4),\n" +
            "(6199, 'NAICS', 1459, 5174, 3, 1461, 51741, 4),\n" +
            "(6200, 'NAICS', 1591, 532, 2, 1610, 532310, 5),\n" +
            "(6201, 'SEC', 2245, 2020, 3, 2246, 2024, 4),\n" +
            "(6202, 'SEC', 2791, 20, 1, 2450, 3670, 3),\n" +
            "(6203, 'SIC', 3214, 2800, 2, 3225, 2830, 3),\n" +
            "(6204, 'NAICS', 1720, 5511, 3, 1723, 551112, 5),\n" +
            "(6205, 'SIC', 4308, 20, 1, 3179, 2657, 4),\n" +
            "(6206, 'SIC', 4309, 40, 1, 3629, 4225, 4),\n" +
            "(6207, 'NAICS', 1683, 5417, 3, 1684, 54171, 4),\n" +
            "(6208, 'SEC', 2796, 70, 1, 2755, 8011, 4),\n" +
            "(6209, 'SIC', 4308, 20, 1, 3354, 3341, 4),\n" +
            "(6210, 'NAICS', 930, 42, 1, 1071, 4248, 3),\n" +
            "(6211, 'NAICS', 1635, 54121, 4, 1638, 541214, 5),\n" +
            "(6212, 'NAICS', 1725, 56, 1, 1785, 5619, 3),\n" +
            "(6213, 'SIC', 3419, 3500, 2, 3445, 3552, 4),\n" +
            "(6214, 'SIC', 4308, 20, 1, 3320, 3264, 4),\n" +
            "(6215, 'NAICS', 1475, 51912, 4, 1474, 519120, 5),\n" +
            "(6216, 'SEC', 2791, 20, 1, 2280, 2450, 3),\n" +
            "(6217, 'SIC', 4101, 7620, 3, 4104, 7629, 4),\n" +
            "(6218, 'SEC', 2777, 8730, 3, 2779, 8734, 4),\n" +
            "(6219, 'SIC', 4309, 40, 1, 3708, 4952, 4),\n" +
            "(6220, 'SIC', 2884, 1000, 2, 2896, 1080, 3),\n" +
            "(6221, 'SIC', 4308, 20, 1, 3570, 3850, 3),\n" +
            "(6222, 'SIC', 4306, 10, 1, 2935, 1480, 3),\n" +
            "(6223, 'NAICS', 991, 4238, 3, 1003, 42386, 4),\n" +
            "(6224, 'NAICS', 930, 42, 1, 1064, 424690, 5),\n" +
            "(6225, 'SIC', 4309, 40, 1, 3616, 4150, 3),\n" +
            "(6226, 'NAICS', 1689, 5418, 3, 1696, 541840, 5),\n" +
            "(6227, 'SEC', 2265, 2220, 3, 2266, 2221, 4),\n" +
            "(6228, 'SEC', 2694, 6500, 2, 2702, 6552, 4),\n" +
            "(6229, 'SIC', 3071, 2270, 3, 3072, 2273, 4),\n" +
            "(6230, 'NAICS', 1813, 611, 2, 1817, 6112, 3),\n" +
            "(6231, 'NAICS', 1, 11, 1, 40, 11142, 4),\n" +
            "(6232, 'NAICS', 1725, 56, 1, 1786, 561910, 5),\n" +
            "(6233, 'NAICS', 1725, 56, 1, 1796, 562112, 5),\n" +
            "(6234, 'NAICS', 2002, 71399, 4, 2001, 713990, 5),\n" +
            "(6235, 'SIC', 4313, 70, 1, 4201, 8390, 3),\n" +
            "(6236, 'NAICS', 2071, 812, 2, 2072, 8121, 3),\n" +
            "(6237, 'SIC', 4308, 20, 1, 3485, 3621, 4),\n" +
            "(6238, 'NAICS', 2010, 72119, 4, 2011, 721191, 5),\n" +
            "(6239, 'NAICS', 236, 2381, 3, 244, 23814, 4),\n" +
            "(6240, 'SIC', 2948, 1600, 2, 2950, 1611, 4),\n" +
            "(6241, 'SEC', 2292, 2600, 2, 2295, 2620, 3),\n" +
            "(6242, 'SEC', 2791, 20, 1, 2395, 3448, 4),\n" +
            "(6243, 'NAICS', 2151, 9221, 3, 2162, 922160, 5),\n" +
            "(6244, 'NAICS', 1435, 51222, 4, 1434, 512220, 5),\n" +
            "(6245, 'SEC', 2748, 7900, 2, 2751, 7990, 3),\n" +
            "(6246, 'NAICS', 1404, 5111, 3, 1414, 511191, 5),\n" +
            "(6247, 'NAICS', 2, 111, 2, 11, 11114, 4),\n" +
            "(6248, 'NAICS', 235, 238, 2, 256, 238220, 5),\n" +
            "(6249, 'NAICS', 991, 4238, 3, 994, 423820, 5),\n" +
            "(6250, 'NAICS', 235, 238, 2, 250, 23817, 4),\n" +
            "(6251, 'NAICS', 2166, 923, 2, 2175, 92314, 4),\n" +
            "(6252, 'SIC', 4018, 7210, 3, 4021, 7213, 4),\n" +
            "(6253, 'NAICS', 1480, 52, 1, 1545, 524130, 5),\n" +
            "(6254, 'NAICS', 2037, 81, 1, 2080, 8122, 3),\n" +
            "(6255, 'SIC', 3639, 4420, 3, 3640, 4424, 4),\n" +
            "(6256, 'NAICS', 236, 2381, 3, 243, 238140, 5),\n" +
            "(6257, 'SEC', 2221, 1300, 2, 2226, 1382, 4),\n" +
            "(6258, 'NAICS', 1625, 541, 2, 1703, 54187, 4),\n" +
            "(6259, 'NAICS', 1726, 561, 2, 1787, 56191, 4),\n" +
            "(6260, 'NAICS', 2037, 81, 1, 2066, 81142, 4),\n" +
            "(6261, 'SIC', 4192, 8300, 2, 4196, 8331, 4),\n" +
            "(6262, 'SEC', 2605, 5200, 2, 2606, 5210, 3),\n" +
            "(6263, 'NAICS', 1480, 52, 1, 1519, 523130, 5),\n" +
            "(6264, 'NAICS', 2005, 7211, 3, 2008, 721120, 5),\n" +
            "(6265, 'SIC', 3552, 3800, 2, 3573, 3861, 4),\n" +
            "(6266, 'NAICS', 1015, 424, 2, 1056, 42451, 4),\n" +
            "(6267, 'NAICS', 930, 42, 1, 1080, 42492, 4),\n" +
            "(6268, 'SIC', 3480, 3600, 2, 3482, 3612, 4),\n" +
            "(6269, 'SIC', 3978, 6510, 3, 3984, 6519, 4),\n" +
            "(6270, 'NAICS', 1920, 624, 2, 1928, 6242, 3),\n" +
            "(6271, 'NAICS', 2037, 81, 1, 2093, 8129, 3),\n" +
            "(6272, 'NAICS', 1766, 5616, 3, 1770, 561613, 5),\n" +
            "(6273, 'NAICS', 1942, 71, 1, 1959, 711310, 5),\n" +
            "(6274, 'SIC', 4314, 90, 1, 4284, 9600, 2),\n" +
            "(6275, 'SIC', 3050, 2200, 2, 3075, 2282, 4),\n" +
            "(6276, 'SIC', 2813, 170, 3, 2819, 179, 4),\n" +
            "(6277, 'SEC', 2500, 3900, 2, 2505, 3940, 3),\n" +
            "(6278, 'SIC', 3419, 3500, 2, 3467, 3579, 4),\n" +
            "(6279, 'SIC', 4313, 70, 1, 4109, 7690, 3),\n" +
            "(6280, 'SIC', 2918, 1400, 2, 2931, 1470, 3),\n" +
            "(6281, 'NAICS', 1813, 611, 2, 1843, 61169, 4),\n" +
            "(6282, 'SIC', 4311, 52, 1, 3842, 5530, 3),\n" +
            "(6283, 'NAICS', 1536, 524, 2, 1544, 524128, 5),\n" +
            "(6284, 'NAICS', 205, 23, 1, 227, 237210, 5),\n" +
            "(6285, 'SEC', 2791, 20, 1, 2417, 3559, 4),\n" +
            "(6286, 'NAICS', 931, 423, 2, 955, 4234, 3),\n" +
            "(6287, 'SEC', 2355, 3200, 2, 2356, 3210, 3),\n" +
            "(6288, 'SIC', 4308, 20, 1, 3099, 2341, 4),\n" +
            "(6289, 'SIC', 4308, 20, 1, 3514, 3674, 4),\n" +
            "(6290, 'SIC', 4309, 40, 1, 3606, 4110, 3),\n" +
            "(6291, 'SIC', 4313, 70, 1, 4210, 8611, 4),\n" +
            "(6292, 'NAICS', 252, 23819, 4, 251, 238190, 5),\n" +
            "(6293, 'SEC', 2791, 20, 1, 2318, 2790, 3),\n" +
            "(6294, 'SEC', 2500, 3900, 2, 2503, 3930, 3),\n" +
            "(6295, 'SIC', 4310, 50, 1, 3727, 5033, 4),\n" +
            "(6296, 'NAICS', 1969, 712, 2, 1970, 7121, 3),\n" +
            "(6297, 'SIC', 2982, 2000, 2, 3017, 2066, 4),\n" +
            "(6298, 'SIC', 4040, 7300, 2, 4068, 7373, 4),\n" +
            "(6299, 'NAICS', 1480, 52, 1, 1503, 522293, 5),\n" +
            "(6300, 'NAICS', 108, 114, 2, 111, 114111, 5),\n" +
            "(6301, 'SIC', 2798, 100, 2, 2817, 174, 4),\n" +
            "(6302, 'NAICS', 1480, 52, 1, 1540, 524114, 5),\n" +
            "(6303, 'NAICS', 1015, 424, 2, 1020, 42412, 4),\n" +
            "(6304, 'SIC', 4311, 52, 1, 3846, 5550, 3);\n";
    static String industryCodeInsert23 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(6305, 'NAICS', 1569, 53, 1, 1598, 5322, 3),\n" +
            "(6306, 'NAICS', 2150, 922, 2, 2154, 922120, 5),\n" +
            "(6307, 'SIC', 2919, 1410, 3, 2920, 1411, 4),\n" +
            "(6308, 'SIC', 4312, 60, 1, 3963, 6324, 4),\n" +
            "(6309, 'SIC', 4313, 70, 1, 4149, 8020, 3),\n" +
            "(6310, 'SIC', 2868, 800, 2, 2869, 810, 3),\n" +
            "(6311, 'SEC', 2753, 8000, 2, 2763, 8082, 4),\n" +
            "(6312, 'NAICS', 2021, 7223, 3, 2026, 722330, 5),\n" +
            "(6313, 'NAICS', 2135, 92, 1, 2146, 921150, 5),\n" +
            "(6314, 'SIC', 3337, 3300, 2, 3354, 3341, 4),\n" +
            "(6315, 'SIC', 4313, 70, 1, 4237, 8742, 4),\n" +
            "(6316, 'NAICS', 1817, 6112, 3, 1818, 611210, 5),\n" +
            "(6317, 'NAICS', 79, 1124, 3, 82, 112420, 5),\n" +
            "(6318, 'SIC', 4305, 1, 1, 2838, 254, 4),\n" +
            "(6319, 'NAICS', 1035, 4244, 3, 1041, 42443, 4),\n" +
            "(6320, 'NAICS', 2021, 7223, 3, 2024, 722320, 5),\n" +
            "(6321, 'SIC', 3086, 2320, 3, 3088, 2322, 4),\n" +
            "(6322, 'NAICS', 138, 212, 2, 139, 2121, 3),\n" +
            "(6323, 'NAICS', 2028, 7224, 3, 2029, 722410, 5),\n" +
            "(6324, 'SEC', 2791, 20, 1, 2342, 3000, 2),\n" +
            "(6325, 'SIC', 4256, 9200, 2, 4261, 9222, 4),\n" +
            "(6326, 'SIC', 3190, 2700, 2, 3206, 2770, 3),\n" +
            "(6327, 'NAICS', 1569, 53, 1, 1584, 53131, 4),\n" +
            "(6328, 'NAICS', 1004, 4239, 3, 1014, 42399, 4),\n" +
            "(6329, 'NAICS', 1443, 5151, 3, 1445, 515111, 5),\n" +
            "(6330, 'NAICS', 1812, 61, 1, 1820, 6113, 3),\n" +
            "(6331, 'SIC', 4308, 20, 1, 3538, 3731, 4),\n" +
            "(6332, 'SIC', 3468, 3580, 3, 3473, 3589, 4),\n" +
            "(6333, 'SIC', 4223, 8700, 2, 4224, 8710, 3),\n" +
            "(6334, 'SIC', 3805, 5210, 3, 3806, 5211, 4),\n" +
            "(6335, 'NAICS', 1015, 424, 2, 1036, 424410, 5),\n" +
            "(6336, 'NAICS', 941, 4232, 3, 942, 423210, 5),\n" +
            "(6337, 'NAICS', 1624, 54, 1, 1703, 54187, 4),\n" +
            "(6338, 'SIC', 4308, 20, 1, 3366, 3366, 4),\n" +
            "(6339, 'SIC', 3693, 4900, 2, 3701, 4930, 3),\n" +
            "(6340, 'NAICS', 2003, 72, 1, 2030, 72241, 4),\n" +
            "(6341, 'SIC', 2975, 1790, 3, 2981, 1799, 4),\n" +
            "(6342, 'NAICS', 1625, 541, 2, 1708, 54191, 4),\n" +
            "(6343, 'SEC', 2791, 20, 1, 2295, 2620, 3),\n" +
            "(6344, 'SIC', 4040, 7300, 2, 4065, 7370, 3),\n" +
            "(6345, 'NAICS', 1798, 5622, 3, 1802, 562213, 5),\n" +
            "(6346, 'SIC', 4308, 20, 1, 3252, 2900, 2),\n" +
            "(6347, 'NAICS', 1569, 53, 1, 1573, 53111, 4),\n" +
            "(6348, 'NAICS', 931, 423, 2, 953, 423390, 5),\n" +
            "(6349, 'SIC', 4171, 8090, 3, 4172, 8092, 4),\n" +
            "(6350, 'NAICS', 132, 21, 1, 178, 213114, 5),\n" +
            "(6351, 'SIC', 4308, 20, 1, 3090, 2325, 4),\n" +
            "(6352, 'NAICS', 931, 423, 2, 962, 423440, 5),\n" +
            "(6353, 'NAICS', 2037, 81, 1, 2046, 811121, 5),\n" +
            "(6354, 'NAICS', 930, 42, 1, 943, 42321, 4),\n" +
            "(6355, 'SIC', 4309, 40, 1, 3604, 4013, 4),\n" +
            "(6356, 'NAICS', 1859, 6213, 3, 1866, 621340, 5),\n" +
            "(6357, 'SIC', 4308, 20, 1, 3246, 2890, 3),\n" +
            "(6358, 'NAICS', 1625, 541, 2, 1715, 54194, 4),\n" +
            "(6359, 'NAICS', 1402, 51, 1, 1431, 5122, 3),\n" +
            "(6360, 'SIC', 4308, 20, 1, 3281, 3089, 4),\n" +
            "(6361, 'SEC', 2403, 3500, 2, 2413, 3540, 3),\n" +
            "(6362, 'NAICS', 1015, 424, 2, 1077, 424910, 5),\n" +
            "(6363, 'NAICS', 181, 221, 2, 196, 221210, 5),\n" +
            "(6364, 'NAICS', 1836, 6116, 3, 1837, 611610, 5),\n" +
            "(6365, 'SIC', 4081, 7500, 2, 4084, 7514, 4),\n" +
            "(6366, 'SIC', 4125, 7900, 2, 4142, 7993, 4),\n" +
            "(6367, 'SEC', 2552, 4900, 2, 2567, 4961, 4),\n" +
            "(6368, 'NAICS', 930, 42, 1, 982, 4237, 3),\n" +
            "(6369, 'SEC', 2793, 50, 1, 2581, 5064, 4),\n" +
            "(6370, 'SIC', 3311, 3250, 3, 3314, 3255, 4),\n" +
            "(6371, 'SIC', 4244, 8900, 2, 4246, 8999, 4),\n" +
            "(6372, 'SEC', 2440, 3630, 3, 2441, 3634, 4),\n" +
            "(6373, 'SIC', 3822, 5400, 2, 3833, 5460, 3),\n" +
            "(6374, 'SEC', 2791, 20, 1, 2287, 2522, 4),\n" +
            "(6375, 'NAICS', 1891, 62199, 4, 1892, 621991, 5),\n" +
            "(6376, 'NAICS', 2052, 8112, 3, 2057, 811219, 5),\n" +
            "(6377, 'SIC', 4308, 20, 1, 3114, 2389, 4),\n" +
            "(6378, 'NAICS', 1812, 61, 1, 1828, 611430, 5),\n" +
            "(6379, 'SIC', 4307, 15, 1, 2955, 1700, 2),\n" +
            "(6380, 'SIC', 4313, 70, 1, 4239, 8744, 4),\n" +
            "(6381, 'NAICS', 1758, 5615, 3, 1762, 56152, 4),\n" +
            "(6382, 'SIC', 2983, 2010, 3, 2985, 2013, 4),\n" +
            "(6383, 'SEC', 2585, 5080, 3, 2587, 5084, 4),\n" +
            "(6384, 'SIC', 3527, 3710, 3, 3530, 3714, 4),\n" +
            "(6385, 'SEC', 2319, 2800, 2, 2322, 2821, 4),\n" +
            "(6386, 'NAICS', 1793, 5621, 3, 1794, 56211, 4),\n" +
            "(6387, 'SIC', 3307, 3230, 3, 3308, 3231, 4),\n" +
            "(6388, 'NAICS', 2037, 81, 1, 2094, 812910, 5),\n" +
            "(6389, 'SIC', 4308, 20, 1, 3206, 2770, 3),\n" +
            "(6390, 'SIC', 4313, 70, 1, 4012, 7030, 3),\n" +
            "(6391, 'SEC', 2328, 2840, 3, 2330, 2844, 4),\n" +
            "(6392, 'SIC', 3371, 3400, 2, 3395, 3460, 3),\n" +
            "(6393, 'NAICS', 2189, 9261, 3, 2190, 926110, 5),\n" +
            "(6394, 'SIC', 4311, 52, 1, 3838, 5510, 3),\n" +
            "(6395, 'SIC', 3882, 5800, 2, 3884, 5812, 4),\n" +
            "(6396, 'NAICS', 930, 42, 1, 1034, 42434, 4),\n" +
            "(6397, 'NAICS', 1726, 561, 2, 1728, 561110, 5),\n" +
            "(6398, 'NAICS', 2136, 921, 2, 2140, 921120, 5),\n" +
            "(6399, 'SEC', 2791, 20, 1, 2451, 3672, 4),\n" +
            "(6400, 'SEC', 2552, 4900, 2, 2555, 4920, 3),\n" +
            "(6401, 'SIC', 4311, 52, 1, 3834, 5461, 4),\n" +
            "(6402, 'NAICS', 1942, 71, 1, 1956, 711212, 5),\n" +
            "(6403, 'SIC', 2834, 250, 3, 2835, 251, 4),\n" +
            "(6404, 'NAICS', 1682, 54169, 4, 1681, 541690, 5),\n" +
            "(6405, 'NAICS', 2038, 811, 2, 2064, 811412, 5),\n" +
            "(6406, 'SIC', 4306, 10, 1, 2938, 1499, 4),\n" +
            "(6407, 'SIC', 4133, 7940, 3, 4134, 7941, 4),\n" +
            "(6408, 'NAICS', 108, 114, 2, 115, 114210, 5),\n" +
            "(6409, 'NAICS', 1480, 52, 1, 1514, 5231, 3),\n" +
            "(6410, 'NAICS', 1, 11, 1, 79, 1124, 3),\n" +
            "(6411, 'SIC', 4223, 8700, 2, 4226, 8712, 4),\n" +
            "(6412, 'SEC', 2403, 3500, 2, 2417, 3559, 4),\n" +
            "(6413, 'NAICS', 1554, 525, 2, 1566, 52592, 4),\n" +
            "(6414, 'SEC', 2713, 7300, 2, 2715, 7311, 4),\n" +
            "(6415, 'SEC', 2795, 60, 1, 2656, 6036, 4),\n" +
            "(6416, 'SIC', 3480, 3600, 2, 3486, 3624, 4),\n" +
            "(6417, 'NAICS', 273, 2389, 3, 277, 23899, 4),\n" +
            "(6418, 'SIC', 3511, 3670, 3, 3514, 3674, 4),\n" +
            "(6419, 'NAICS', 1485, 522, 2, 1500, 52229, 4),\n" +
            "(6420, 'NAICS', 1648, 54134, 4, 1647, 541340, 5),\n" +
            "(6421, 'NAICS', 1591, 532, 2, 1599, 532210, 5),\n" +
            "(6422, 'SIC', 3583, 3940, 3, 3584, 3942, 4),\n" +
            "(6423, 'NAICS', 157, 21231, 4, 160, 212313, 5),\n" +
            "(6424, 'NAICS', 1942, 71, 1, 1983, 713120, 5),\n" +
            "(6425, 'SIC', 4305, 1, 1, 2816, 173, 4),\n" +
            "(6426, 'SIC', 2813, 170, 3, 2818, 175, 4),\n" +
            "(6427, 'NAICS', 1920, 624, 2, 1922, 624110, 5),\n" +
            "(6428, 'SIC', 4259, 9220, 3, 4261, 9222, 4),\n" +
            "(6429, 'NAICS', 948, 42331, 4, 947, 423310, 5),\n" +
            "(6430, 'NAICS', 1920, 624, 2, 1933, 624229, 5),\n" +
            "(6431, 'NAICS', 1598, 5322, 3, 1606, 532291, 5),\n" +
            "(6432, 'NAICS', 109, 1141, 3, 113, 114119, 5),\n" +
            "(6433, 'SIC', 2955, 1700, 2, 2971, 1770, 3),\n" +
            "(6434, 'SIC', 3148, 2500, 2, 3160, 2531, 4),\n" +
            "(6435, 'SIC', 4017, 7200, 2, 4037, 7290, 3),\n" +
            "(6436, 'SIC', 3008, 2050, 3, 3011, 2053, 4),\n" +
            "(6437, 'SEC', 2434, 3600, 2, 2451, 3672, 4),\n" +
            "(6438, 'NAICS', 1726, 561, 2, 1729, 56111, 4),\n" +
            "(6439, 'NAICS', 218, 237, 2, 232, 2379, 3),\n" +
            "(6440, 'NAICS', 1569, 53, 1, 1592, 5321, 3),\n" +
            "(6441, 'NAICS', 2003, 72, 1, 2017, 7213, 3),\n" +
            "(6442, 'NAICS', 2135, 92, 1, 2171, 92312, 4),\n" +
            "(6443, 'SIC', 4311, 52, 1, 3875, 5720, 3),\n" +
            "(6444, 'SEC', 4336, 99, 1, 4339, 9995, 2),\n" +
            "(6445, 'NAICS', 1, 11, 1, 14, 111160, 5),\n" +
            "(6446, 'SEC', 2794, 52, 1, 2641, 5910, 3),\n" +
            "(6447, 'SIC', 4308, 20, 1, 3299, 3190, 3),\n" +
            "(6448, 'SIC', 2825, 200, 2, 2833, 241, 4),\n" +
            "(6449, 'NAICS', 108, 114, 2, 114, 1142, 3),\n" +
            "(6450, 'SIC', 3419, 3500, 2, 3440, 3546, 4),\n" +
            "(6451, 'NAICS', 2037, 81, 1, 2129, 813990, 5),\n" +
            "(6452, 'SIC', 3083, 2300, 2, 3097, 2339, 4),\n" +
            "(6453, 'SIC', 3605, 4100, 2, 3614, 4141, 4),\n" +
            "(6454, 'NAICS', 132, 21, 1, 163, 212321, 5),\n" +
            "(6455, 'NAICS', 1625, 541, 2, 1678, 541618, 5),\n" +
            "(6456, 'NAICS', 135, 21111, 4, 136, 211111, 5),\n" +
            "(6457, 'NAICS', 28, 11133, 4, 29, 111331, 5),\n" +
            "(6458, 'NAICS', 1480, 52, 1, 1558, 525120, 5),\n" +
            "(6459, 'SIC', 3774, 5140, 3, 3778, 5144, 4),\n" +
            "(6460, 'SEC', 2791, 20, 1, 2495, 3851, 4),\n" +
            "(6461, 'SIC', 3992, 6700, 2, 4000, 6732, 4),\n" +
            "(6462, 'NAICS', 57, 1121, 3, 64, 11213, 4),\n" +
            "(6463, 'NAICS', 991, 4238, 3, 1002, 423860, 5),\n" +
            "(6464, 'SEC', 2794, 52, 1, 2618, 5410, 3),\n" +
            "(6465, 'SIC', 4308, 20, 1, 3168, 2610, 3),\n" +
            "(6466, 'SEC', 2791, 20, 1, 2357, 3211, 4),\n" +
            "(6467, 'SIC', 4169, 8080, 3, 4170, 8082, 4),\n" +
            "(6468, 'NAICS', 1537, 5241, 3, 1539, 524113, 5),\n" +
            "(6469, 'NAICS', 2150, 922, 2, 2153, 92211, 4),\n" +
            "(6470, 'SIC', 4284, 9600, 2, 4289, 9630, 3),\n" +
            "(6471, 'SIC', 4312, 60, 1, 3950, 6211, 4),\n" +
            "(6472, 'NAICS', 1979, 713, 2, 1997, 713940, 5),\n" +
            "(6473, 'NAICS', 1480, 52, 1, 1515, 523110, 5),\n" +
            "(6474, 'NAICS', 1624, 54, 1, 1666, 5415, 3),\n" +
            "(6475, 'NAICS', 132, 21, 1, 145, 212210, 5),\n" +
            "(6476, 'SIC', 4307, 15, 1, 2967, 1751, 4),\n" +
            "(6477, 'SIC', 2962, 1740, 3, 2964, 1742, 4),\n" +
            "(6478, 'SIC', 4310, 50, 1, 3791, 5170, 3),\n" +
            "(6479, 'NAICS', 1624, 54, 1, 1696, 541840, 5),\n" +
            "(6480, 'SIC', 3434, 3540, 3, 3435, 3541, 4),\n" +
            "(6481, 'NAICS', 2037, 81, 1, 2073, 81211, 4),\n" +
            "(6482, 'NAICS', 1480, 52, 1, 1523, 5232, 3),\n" +
            "(6483, 'SIC', 4312, 60, 1, 3970, 6370, 3),\n" +
            "(6484, 'SIC', 4312, 60, 1, 3969, 6361, 4),\n" +
            "(6485, 'NAICS', 56, 112, 2, 77, 112390, 5),\n" +
            "(6486, 'SEC', 2791, 20, 1, 2368, 3280, 3),\n" +
            "(6487, 'NAICS', 1015, 424, 2, 1025, 42421, 4),\n" +
            "(6488, 'NAICS', 1, 11, 1, 76, 11234, 4),\n" +
            "(6489, 'SIC', 3602, 4010, 3, 3604, 4013, 4),\n" +
            "(6490, 'NAICS', 218, 237, 2, 221, 23711, 4),\n" +
            "(6491, 'SEC', 2791, 20, 1, 2297, 2630, 3),\n" +
            "(6492, 'SEC', 2337, 2900, 2, 2340, 2950, 3),\n" +
            "(6493, 'SIC', 3680, 4800, 2, 3692, 4899, 4),\n" +
            "(6494, 'NAICS', 1953, 7112, 3, 1956, 711212, 5),\n" +
            "(6495, 'SIC', 4308, 20, 1, 3595, 3990, 3),\n" +
            "(6496, 'SIC', 3762, 5100, 2, 3797, 5190, 3),\n" +
            "(6497, 'SEC', 2739, 7810, 3, 2741, 7819, 4),\n" +
            "(6498, 'NAICS', 1980, 7131, 3, 1981, 713110, 5),\n" +
            "(6499, 'NAICS', 1725, 56, 1, 1800, 562211, 5),\n" +
            "(6500, 'SIC', 3587, 3950, 3, 3589, 3952, 4),\n" +
            "(6501, 'SEC', 2790, 15, 1, 2233, 1540, 3),\n" +
            "(6502, 'SEC', 2342, 3000, 2, 2351, 3086, 4),\n" +
            "(6503, 'SEC', 2240, 2000, 2, 2252, 2060, 3),\n" +
            "(6504, 'SEC', 2791, 20, 1, 2500, 3900, 2),\n" +
            "(6505, 'SEC', 2371, 3300, 2, 2382, 3360, 3),\n" +
            "(6506, 'SIC', 3621, 4210, 3, 3624, 4214, 4),\n" +
            "(6507, 'SEC', 2725, 7370, 3, 2727, 7372, 4),\n" +
            "(6508, 'SEC', 2791, 20, 1, 2413, 3540, 3),\n" +
            "(6509, 'NAICS', 43, 1119, 3, 46, 111920, 5),\n" +
            "(6510, 'SIC', 4308, 20, 1, 3134, 2435, 4),\n" +
            "(6511, 'SIC', 3033, 2090, 3, 3036, 2095, 4),\n" +
            "(6512, 'SEC', 2620, 5500, 2, 2621, 5530, 3),\n" +
            "(6513, 'SIC', 4223, 8700, 2, 4227, 8713, 4),\n" +
            "(6514, 'NAICS', 2, 111, 2, 48, 111930, 5),\n" +
            "(6515, 'SEC', 2640, 5900, 2, 2642, 5912, 4),\n" +
            "(6516, 'SIC', 4309, 40, 1, 3700, 4925, 4),\n" +
            "(6517, 'SEC', 2302, 2700, 2, 2309, 2732, 4),\n" +
            "(6518, 'SIC', 3419, 3500, 2, 3438, 3544, 4),\n" +
            "(6519, 'SIC', 4310, 50, 1, 3736, 5049, 4),\n" +
            "(6520, 'SIC', 4313, 70, 1, 4115, 7812, 4),\n" +
            "(6521, 'SIC', 4306, 10, 1, 2889, 1030, 3),\n" +
            "(6522, 'SIC', 4308, 20, 1, 3576, 3900, 2),\n" +
            "(6523, 'SIC', 4308, 20, 1, 3187, 2677, 4),\n" +
            "(6524, 'SIC', 4211, 8620, 3, 4212, 8621, 4),\n" +
            "(6525, 'NAICS', 229, 2373, 3, 231, 23731, 4),\n" +
            "(6526, 'SIC', 3301, 3200, 2, 3325, 3273, 4),\n" +
            "(6527, 'SEC', 2791, 20, 1, 2380, 3350, 3),\n" +
            "(6528, 'SIC', 4307, 15, 1, 2953, 1623, 4),\n" +
            "(6529, 'SIC', 3774, 5140, 3, 3783, 5149, 4),\n" +
            "(6530, 'NAICS', 930, 42, 1, 1055, 424510, 5),\n" +
            "(6531, 'NAICS', 260, 2383, 3, 265, 238330, 5),\n" +
            "(6532, 'NAICS', 180, 22, 1, 185, 221112, 5),\n" +
            "(6533, 'SIC', 3451, 3560, 3, 3456, 3565, 4),\n" +
            "(6534, 'NAICS', 1732, 56121, 4, 1731, 561210, 5),\n" +
            "(6535, 'SIC', 4123, 7840, 3, 4124, 7841, 4),\n" +
            "(6536, 'SIC', 3337, 3300, 2, 3368, 3390, 3),\n" +
            "(6537, 'NAICS', 2037, 81, 1, 2102, 81299, 4),\n" +
            "(6538, 'NAICS', 2151, 9221, 3, 2152, 922110, 5),\n" +
            "(6539, 'SEC', 2241, 2010, 3, 2242, 2011, 4),\n" +
            "(6540, 'SIC', 3301, 3200, 2, 3321, 3269, 4),\n" +
            "(6541, 'NAICS', 2176, 924, 2, 2181, 92412, 4),\n" +
            "(6542, 'SIC', 2960, 1730, 3, 2961, 1731, 4),\n" +
            "(6543, 'NAICS', 1948, 71112, 4, 1947, 711120, 5),\n" +
            "(6544, 'NAICS', 1942, 71, 1, 1965, 71141, 4),\n" +
            "(6545, 'SIC', 4313, 70, 1, 4072, 7377, 4),\n" +
            "(6546, 'NAICS', 1536, 524, 2, 1550, 52429, 4),\n" +
            "(6547, 'NAICS', 1570, 531, 2, 1577, 53113, 4),\n" +
            "(6548, 'SIC', 3148, 2500, 2, 3152, 2514, 4),\n" +
            "(6549, 'SIC', 3715, 5000, 2, 3729, 5040, 3),\n" +
            "(6550, 'SIC', 3337, 3300, 2, 3363, 3363, 4),\n" +
            "(6551, 'NAICS', 2061, 8114, 3, 2067, 811430, 5),\n" +
            "(6552, 'SIC', 4308, 20, 1, 3414, 3495, 4),\n" +
            "(6553, 'SIC', 4308, 20, 1, 3493, 3634, 4),\n" +
            "(6554, 'NAICS', 56, 112, 2, 64, 11213, 4),\n" +
            "(6555, 'NAICS', 1477, 51913, 4, 1476, 519130, 5),\n" +
            "(6556, 'SIC', 2880, 920, 3, 2881, 921, 4),\n" +
            "(6557, 'NAICS', 1799, 56221, 4, 1802, 562213, 5),\n" +
            "(6558, 'SEC', 2640, 5900, 2, 2646, 5960, 3),\n" +
            "(6559, 'NAICS', 2037, 81, 1, 2042, 811112, 5),\n" +
            "(6560, 'NAICS', 1693, 54182, 4, 1692, 541820, 5),\n" +
            "(6561, 'NAICS', 1808, 56292, 4, 1807, 562920, 5),\n" +
            "(6562, 'SIC', 3564, 3840, 3, 3566, 3842, 4),\n" +
            "(6563, 'NAICS', 28, 11133, 4, 30, 111332, 5),\n" +
            "(6564, 'SEC', 2355, 3200, 2, 2367, 3272, 4),\n" +
            "(6565, 'NAICS', 1891, 62199, 4, 1893, 621999, 5),\n" +
            "(6566, 'SIC', 3067, 2260, 3, 3070, 2269, 4),\n" +
            "(6567, 'SIC', 4308, 20, 1, 3105, 2369, 4),\n" +
            "(6568, 'NAICS', 56, 112, 2, 57, 1121, 3),\n" +
            "(6569, 'NAICS', 1867, 62134, 4, 1866, 621340, 5),\n" +
            "(6570, 'NAICS', 1936, 6243, 3, 1937, 624310, 5),\n" +
            "(6571, 'SEC', 2694, 6500, 2, 4326, 6532, 3),\n" +
            "(6572, 'SIC', 4308, 20, 1, 3064, 2257, 4),\n" +
            "(6573, 'SIC', 4310, 50, 1, 3743, 5065, 4),\n" +
            "(6574, 'NAICS', 1075, 42482, 4, 1074, 424820, 5),\n" +
            "(6575, 'SIC', 3282, 3100, 2, 3284, 3111, 4),\n" +
            "(6576, 'SIC', 2982, 2000, 2, 3023, 2076, 4),\n" +
            "(6577, 'SIC', 4309, 40, 1, 3612, 4131, 4),\n" +
            "(6578, 'NAICS', 235, 238, 2, 249, 238170, 5),\n" +
            "(6579, 'NAICS', 1624, 54, 1, 1693, 54182, 4),\n" +
            "(6580, 'SEC', 2630, 5700, 2, 2633, 5730, 3),\n" +
            "(6581, 'NAICS', 1726, 561, 2, 1776, 56171, 4),\n" +
            "(6582, 'SEC', 2791, 20, 1, 2256, 2086, 4),\n" +
            "(6583, 'SIC', 3419, 3500, 2, 3455, 3564, 4),\n" +
            "(6584, 'NAICS', 132, 21, 1, 151, 212231, 5),\n" +
            "(6585, 'NAICS', 1726, 561, 2, 1733, 5613, 3),\n" +
            "(6586, 'SIC', 4178, 8200, 2, 4189, 8249, 4),\n" +
            "(6587, 'SIC', 4309, 40, 1, 3652, 4493, 4),\n" +
            "(6588, 'SIC', 4008, 7010, 3, 4009, 7011, 4),\n" +
            "(6589, 'NAICS', 1485, 522, 2, 1489, 522120, 5),\n" +
            "(6590, 'NAICS', 2030, 72241, 4, 2029, 722410, 5),\n" +
            "(6591, 'SIC', 3762, 5100, 2, 3769, 5130, 3),\n" +
            "(6592, 'NAICS', 955, 4234, 3, 957, 42341, 4),\n" +
            "(6593, 'NAICS', 1849, 61171, 4, 1848, 611710, 5),\n" +
            "(6594, 'NAICS', 205, 23, 1, 207, 2361, 3),\n" +
            "(6595, 'NAICS', 1410, 51113, 4, 1409, 511130, 5),\n" +
            "(6596, 'SIC', 3214, 2800, 2, 3231, 2841, 4),\n" +
            "(6597, 'NAICS', 1979, 713, 2, 1989, 71329, 4),\n" +
            "(6598, 'NAICS', 1482, 5211, 3, 1484, 52111, 4),\n" +
            "(6599, 'SIC', 4314, 90, 1, 4265, 9300, 2),\n" +
            "(6600, 'NAICS', 1982, 71311, 4, 1981, 713110, 5),\n" +
            "(6601, 'NAICS', 2077, 81219, 4, 2078, 812191, 5),\n" +
            "(6602, 'SIC', 3141, 2450, 3, 3143, 2452, 4),\n" +
            "(6603, 'NAICS', 1914, 62331, 4, 1915, 623311, 5),\n" +
            "(6604, 'NAICS', 1726, 561, 2, 1777, 561720, 5),\n" +
            "(6605, 'NAICS', 2072, 8121, 3, 2073, 81211, 4),\n" +
            "(6606, 'SIC', 4040, 7300, 2, 4045, 7319, 4),\n" +
            "(6607, 'SIC', 4223, 8700, 2, 4228, 8720, 3),\n" +
            "(6608, 'SIC', 2834, 250, 3, 2837, 253, 4),\n" +
            "(6609, 'SEC', 2568, 5000, 2, 2584, 5072, 4),\n" +
            "(6610, 'NAICS', 931, 423, 2, 986, 42372, 4),\n" +
            "(6611, 'SEC', 2539, 4800, 2, 2540, 4810, 3),\n" +
            "(6612, 'SIC', 3026, 2080, 3, 3030, 2085, 4),\n" +
            "(6613, 'NAICS', 1508, 52231, 4, 1507, 522310, 5),\n" +
            "(6614, 'SIC', 3496, 3640, 3, 3502, 3647, 4),\n" +
            "(6615, 'SIC', 4313, 70, 1, 4221, 8690, 3),\n" +
            "(6616, 'SIC', 4313, 70, 1, 4246, 8999, 4),\n" +
            "(6617, 'NAICS', 1512, 52239, 4, 1511, 522390, 5),\n" +
            "(6618, 'NAICS', 1850, 62, 1, 1923, 62411, 4),\n" +
            "(6619, 'SIC', 4314, 90, 1, 4264, 9229, 4),\n" +
            "(6620, 'SIC', 3715, 5000, 2, 3739, 5052, 4),\n" +
            "(6621, 'NAICS', 961, 42343, 4, 960, 423430, 5),\n" +
            "(6622, 'SIC', 3917, 6000, 2, 3934, 6090, 3),\n" +
            "(6623, 'NAICS', 23, 1113, 3, 28, 11133, 4),\n" +
            "(6624, 'SIC', 4256, 9200, 2, 4263, 9224, 4),\n" +
            "(6625, 'NAICS', 1817, 6112, 3, 1819, 61121, 4),\n" +
            "(6626, 'SEC', 2366, 3270, 3, 2367, 3272, 4),\n" +
            "(6627, 'SIC', 3301, 3200, 2, 3334, 3296, 4),\n" +
            "(6628, 'SEC', 2302, 2700, 2, 2317, 2780, 3),\n" +
            "(6629, 'NAICS', 174, 21311, 4, 179, 213115, 5),\n" +
            "(6630, 'NAICS', 1480, 52, 1, 1568, 52599, 4),\n" +
            "(6631, 'NAICS', 1812, 61, 1, 1824, 611410, 5),\n" +
            "(6632, 'SEC', 2677, 6300, 2, 2679, 6311, 4),\n" +
            "(6633, 'NAICS', 1689, 5418, 3, 1702, 541870, 5),\n" +
            "(6634, 'NAICS', 2038, 811, 2, 2063, 811411, 5),\n" +
            "(6635, 'SIC', 4313, 70, 1, 4097, 7540, 3),\n" +
            "(6636, 'SIC', 2982, 2000, 2, 3018, 2067, 4),\n" +
            "(6637, 'NAICS', 930, 42, 1, 1090, 4251, 3),\n" +
            "(6638, 'NAICS', 1625, 541, 2, 1712, 541930, 5),\n" +
            "(6639, 'SIC', 3595, 3990, 3, 3598, 3995, 4),\n" +
            "(6640, 'SIC', 4308, 20, 1, 3221, 2821, 4),\n" +
            "(6641, 'NAICS', 1471, 5191, 3, 1473, 51911, 4),\n" +
            "(6642, 'SIC', 2884, 1000, 2, 2887, 1020, 3),\n" +
            "(6643, 'SIC', 3220, 2820, 3, 3221, 2821, 4),\n" +
            "(6644, 'NAICS', 2135, 92, 1, 2188, 926, 2),\n" +
            "(6645, 'NAICS', 235, 238, 2, 260, 2383, 3),\n" +
            "(6646, 'SEC', 2450, 3670, 3, 2453, 3677, 4),\n" +
            "(6647, 'SEC', 2793, 50, 1, 2599, 5160, 3),\n" +
            "(6648, 'NAICS', 1, 11, 1, 97, 11299, 4),\n" +
            "(6649, 'NAICS', 108, 114, 2, 116, 11421, 4),\n" +
            "(6650, 'SEC', 2795, 60, 1, 4340, 6172, 4),\n" +
            "(6651, 'SIC', 4308, 20, 1, 3296, 3170, 3),\n" +
            "(6652, 'SEC', 2791, 20, 1, 2359, 3221, 4),\n" +
            "(6653, 'NAICS', 1939, 6244, 3, 1941, 62441, 4),\n" +
            "(6654, 'NAICS', 2103, 813, 2, 2106, 81311, 4),\n" +
            "(6655, 'SIC', 4312, 60, 1, 3933, 6082, 4),\n" +
            "(6656, 'SIC', 4308, 20, 1, 3037, 2096, 4),\n" +
            "(6657, 'NAICS', 1725, 56, 1, 1771, 56162, 4),\n" +
            "(6658, 'SEC', 2362, 3240, 3, 2363, 3241, 4),\n" +
            "(6659, 'SIC', 3083, 2300, 2, 3101, 2350, 3),\n" +
            "(6660, 'SIC', 4308, 20, 1, 3030, 2085, 4),\n" +
            "(6661, 'SIC', 3434, 3540, 3, 3441, 3547, 4),\n" +
            "(6662, 'SIC', 4309, 40, 1, 3647, 4482, 4),\n" +
            "(6663, 'SIC', 3552, 3800, 2, 3553, 3810, 3),\n" +
            "(6664, 'SIC', 4308, 20, 1, 3265, 3021, 4),\n" +
            "(6665, 'SIC', 3977, 6500, 2, 3981, 6514, 4),\n" +
            "(6666, 'SEC', 2789, 10, 1, 2218, 1200, 2),\n" +
            "(6667, 'SIC', 4308, 20, 1, 3563, 3829, 4),\n" +
            "(6668, 'SIC', 3804, 5200, 2, 3809, 5250, 3),\n" +
            "(6669, 'NAICS', 2037, 81, 1, 2085, 8123, 3),\n" +
            "(6670, 'SEC', 2343, 3010, 3, 2344, 3011, 4),\n" +
            "(6671, 'NAICS', 2077, 81219, 4, 2079, 812199, 5),\n" +
            "(6672, 'SIC', 4235, 8740, 3, 4236, 8741, 4),\n" +
            "(6673, 'NAICS', 1461, 51741, 4, 1460, 517410, 5),\n" +
            "(6674, 'SIC', 4313, 70, 1, 4172, 8092, 4),\n" +
            "(6675, 'NAICS', 1481, 521, 2, 1482, 5211, 3),\n" +
            "(6676, 'SEC', 2791, 20, 1, 2426, 3572, 4),\n" +
            "(6677, 'SIC', 3813, 5270, 3, 3814, 5271, 4),\n" +
            "(6678, 'SEC', 2403, 3500, 2, 2424, 3570, 3),\n" +
            "(6679, 'NAICS', 2085, 8123, 3, 2090, 81233, 4),\n" +
            "(6680, 'SEC', 2791, 20, 1, 2449, 3669, 4),\n" +
            "(6681, 'SIC', 4313, 70, 1, 4218, 8651, 4),\n" +
            "(6682, 'SIC', 3355, 3350, 3, 3360, 3356, 4),\n" +
            "(6683, 'NAICS', 1402, 51, 1, 1410, 51113, 4),\n" +
            "(6684, 'SEC', 2793, 50, 1, 2583, 5070, 3),\n" +
            "(6685, 'SIC', 2982, 2000, 2, 2999, 2038, 4),\n" +
            "(6686, 'NAICS', 117, 115, 2, 120, 115111, 5),\n" +
            "(6687, 'NAICS', 1725, 56, 1, 1809, 56299, 4),\n" +
            "(6688, 'SIC', 4300, 9720, 3, 4301, 9721, 4),\n" +
            "(6689, 'SIC', 4308, 20, 1, 3174, 2650, 3),\n" +
            "(6690, 'SIC', 3959, 6310, 3, 3960, 6311, 4),\n" +
            "(6691, 'SIC', 3620, 4200, 2, 3621, 4210, 3),\n" +
            "(6692, 'SIC', 4017, 7200, 2, 4032, 7241, 4),\n" +
            "(6693, 'NAICS', 107, 11331, 4, 106, 113310, 5),\n" +
            "(6694, 'SIC', 3641, 4430, 3, 3642, 4432, 4),\n" +
            "(6695, 'SIC', 3869, 5700, 2, 3876, 5722, 4),\n" +
            "(6696, 'NAICS', 1624, 54, 1, 1667, 54151, 4),\n" +
            "(6697, 'SIC', 4114, 7810, 3, 4115, 7812, 4),\n" +
            "(6698, 'SIC', 2850, 720, 3, 2854, 724, 4),\n" +
            "(6699, 'NAICS', 1486, 5221, 3, 1488, 52211, 4),\n" +
            "(6700, 'NAICS', 1943, 711, 2, 1945, 711110, 5),\n" +
            "(6701, 'SIC', 3083, 2300, 2, 3098, 2340, 3),\n" +
            "(6702, 'NAICS', 2135, 92, 1, 2200, 927, 2),\n" +
            "(6703, 'NAICS', 1, 11, 1, 110, 11411, 4),\n" +
            "(6704, 'NAICS', 1851, 621, 2, 1890, 62191, 4),\n" +
            "(6705, 'NAICS', 1850, 62, 1, 1860, 621310, 5),\n" +
            "(6706, 'NAICS', 2003, 72, 1, 2007, 72111, 4),\n" +
            "(6707, 'SIC', 2918, 1400, 2, 2927, 1446, 4),\n" +
            "(6708, 'NAICS', 1944, 7111, 3, 1949, 711130, 5),\n" +
            "(6709, 'SIC', 4305, 1, 1, 2848, 710, 3),\n" +
            "(6710, 'SIC', 3371, 3400, 2, 3387, 3443, 4),\n" +
            "(6711, 'SEC', 2791, 20, 1, 2240, 2000, 2),\n" +
            "(6712, 'SIC', 4313, 70, 1, 4007, 7000, 2),\n" +
            "(6713, 'SIC', 4313, 70, 1, 4133, 7940, 3),\n" +
            "(6714, 'SIC', 4313, 70, 1, 4154, 8041, 4),\n" +
            "(6715, 'SIC', 4312, 60, 1, 3928, 6060, 3),\n" +
            "(6716, 'NAICS', 235, 238, 2, 272, 23839, 4),\n" +
            "(6717, 'SIC', 4312, 60, 1, 3927, 6036, 4),\n" +
            "(6718, 'NAICS', 1624, 54, 1, 1711, 541922, 5),\n" +
            "(6719, 'SEC', 2434, 3600, 2, 2449, 3669, 4),\n" +
            "(6720, 'NAICS', 205, 23, 1, 248, 23816, 4),\n" +
            "(6721, 'NAICS', 2037, 81, 1, 2081, 812210, 5),\n" +
            "(6722, 'SEC', 2319, 2800, 2, 2333, 2860, 3),\n" +
            "(6723, 'SIC', 4314, 90, 1, 4301, 9721, 4),\n" +
            "(6724, 'SIC', 4308, 20, 1, 3583, 3940, 3),\n" +
            "(6725, 'SIC', 2826, 210, 3, 2830, 214, 4),\n" +
            "(6726, 'NAICS', 930, 42, 1, 1061, 4246, 3),\n" +
            "(6727, 'NAICS', 1850, 62, 1, 1862, 621320, 5),\n" +
            "(6728, 'SIC', 2798, 100, 2, 2820, 180, 3),\n" +
            "(6729, 'NAICS', 1921, 6241, 3, 1926, 624190, 5),\n" +
            "(6730, 'NAICS', 930, 42, 1, 936, 42312, 4),\n" +
            "(6731, 'NAICS', 1612, 5324, 3, 1615, 532412, 5),\n" +
            "(6732, 'NAICS', 2120, 8139, 3, 2128, 81394, 4),\n" +
            "(6733, 'SIC', 4309, 40, 1, 3666, 4619, 4),\n" +
            "(6734, 'SIC', 4310, 50, 1, 3748, 5078, 4),\n" +
            "(6735, 'NAICS', 1904, 623, 2, 1911, 623220, 5),\n" +
            "(6736, 'NAICS', 1439, 51224, 4, 1438, 512240, 5),\n" +
            "(6737, 'NAICS', 1625, 541, 2, 1681, 541690, 5),\n" +
            "(6738, 'NAICS', 1812, 61, 1, 1834, 611513, 5),\n" +
            "(6739, 'SIC', 2909, 1300, 2, 2916, 1382, 4),\n" +
            "(6740, 'NAICS', 1625, 541, 2, 1640, 5413, 3),\n" +
            "(6741, 'SIC', 4309, 40, 1, 3685, 4822, 4),\n" +
            "(6742, 'NAICS', 1514, 5231, 3, 1522, 52314, 4),\n" +
            "(6743, 'NAICS', 1624, 54, 1, 1709, 54192, 4),\n" +
            "(6744, 'SIC', 2805, 130, 3, 2807, 132, 4),\n" +
            "(6745, 'NAICS', 1569, 53, 1, 1597, 53212, 4),\n" +
            "(6746, 'NAICS', 206, 236, 2, 209, 236115, 5),\n" +
            "(6747, 'SEC', 2458, 3700, 2, 2459, 3710, 3),\n" +
            "(6748, 'NAICS', 1830, 6115, 3, 1834, 611513, 5),\n" +
            "(6749, 'NAICS', 93, 11292, 4, 92, 112920, 5),\n" +
            "(6750, 'SIC', 3190, 2700, 2, 3212, 2791, 4),\n" +
            "(6751, 'SIC', 3261, 3000, 2, 3264, 3020, 3),\n" +
            "(6752, 'SIC', 4308, 20, 1, 3188, 2678, 4),\n" +
            "(6753, 'SIC', 3662, 4600, 2, 3663, 4610, 3),\n" +
            "(6754, 'NAICS', 139, 2121, 3, 142, 212112, 5),\n" +
            "(6755, 'SIC', 4306, 10, 1, 2937, 1490, 3),\n" +
            "(6756, 'SIC', 3214, 2800, 2, 3251, 2899, 4),\n" +
            "(6757, 'NAICS', 2103, 813, 2, 2105, 813110, 5),\n" +
            "(6758, 'SEC', 2566, 4960, 3, 2567, 4961, 4),\n" +
            "(6759, 'SIC', 4308, 20, 1, 3361, 3357, 4),\n" +
            "(6760, 'SIC', 4313, 70, 1, 4030, 7231, 4),\n" +
            "(6761, 'NAICS', 1942, 71, 1, 1977, 712190, 5),\n" +
            "(6762, 'SIC', 4308, 20, 1, 3468, 3580, 3),\n" +
            "(6763, 'NAICS', 118, 1151, 3, 120, 115111, 5),\n" +
            "(6764, 'NAICS', 1, 11, 1, 4, 111110, 5),\n" +
            "(6765, 'SIC', 4313, 70, 1, 4222, 8699, 4),\n" +
            "(6766, 'NAICS', 1725, 56, 1, 1744, 56142, 4),\n" +
            "(6767, 'SIC', 4308, 20, 1, 3397, 3463, 4),\n" +
            "(6768, 'SEC', 2530, 4520, 3, 2531, 4522, 4),\n" +
            "(6769, 'NAICS', 215, 23621, 4, 214, 236210, 5),\n" +
            "(6770, 'SIC', 4308, 20, 1, 3113, 2387, 4),\n" +
            "(6771, 'NAICS', 1420, 5121, 3, 1421, 512110, 5),\n" +
            "(6772, 'NAICS', 2150, 922, 2, 2165, 92219, 4),\n" +
            "(6773, 'SIC', 4308, 20, 1, 3208, 2780, 3),\n" +
            "(6774, 'SIC', 3156, 2520, 3, 3157, 2521, 4),\n" +
            "(6775, 'NAICS', 930, 42, 1, 1054, 4245, 3),\n" +
            "(6776, 'NAICS', 1792, 562, 2, 1799, 56221, 4),\n" +
            "(6777, 'NAICS', 1624, 54, 1, 1716, 541990, 5),\n" +
            "(6778, 'NAICS', 1850, 62, 1, 1869, 621391, 5),\n" +
            "(6779, 'NAICS', 1876, 62149, 4, 1878, 621492, 5),\n" +
            "(6780, 'SIC', 4313, 70, 1, 4127, 7911, 4),\n" +
            "(6781, 'SIC', 4312, 60, 1, 3920, 6019, 4),\n" +
            "(6782, 'NAICS', 1624, 54, 1, 1682, 54169, 4),\n" +
            "(6783, 'SIC', 3167, 2600, 2, 3182, 2672, 4),\n" +
            "(6784, 'SIC', 3214, 2800, 2, 3224, 2824, 4),\n" +
            "(6785, 'SIC', 3958, 6300, 2, 3973, 6399, 4),\n" +
            "(6786, 'NAICS', 238, 23811, 4, 237, 238110, 5),\n" +
            "(6787, 'SEC', 2796, 70, 1, 2780, 8740, 3),\n" +
            "(6788, 'SEC', 2735, 7500, 2, 2736, 7510, 3),\n" +
            "(6789, 'SEC', 2574, 5040, 3, 2576, 5047, 4),\n" +
            "(6790, 'SIC', 4308, 20, 1, 3015, 2063, 4),\n" +
            "(6791, 'SIC', 3526, 3700, 2, 3545, 3761, 4),\n" +
            "(6792, 'SEC', 2358, 3220, 3, 2359, 3221, 4),\n" +
            "(6793, 'SIC', 3520, 3690, 3, 3524, 3695, 4),\n" +
            "(6794, 'NAICS', 172, 213, 2, 175, 213111, 5),\n" +
            "(6795, 'SIC', 2939, 1500, 2, 2946, 1541, 4),\n" +
            "(6796, 'SIC', 3576, 3900, 2, 3598, 3995, 4),\n" +
            "(6797, 'NAICS', 2037, 81, 1, 2067, 811430, 5),\n" +
            "(6798, 'SEC', 2277, 2420, 3, 2278, 2421, 4),\n" +
            "(6799, 'SIC', 3419, 3500, 2, 3431, 3535, 4),\n" +
            "(6800, 'SIC', 4309, 40, 1, 3704, 4939, 4),\n" +
            "(6801, 'SIC', 3917, 6000, 2, 3921, 6020, 3),\n" +
            "(6802, 'SEC', 2791, 20, 1, 2277, 2420, 3),\n" +
            "(6803, 'SEC', 2659, 6100, 2, 4323, 6189, 4);\n";
    static String industryCodeInsert24 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(6804, 'SIC', 3115, 2390, 3, 3123, 2399, 4),\n" +
            "(6805, 'SEC', 2384, 3400, 2, 2386, 3411, 4),\n" +
            "(6806, 'SEC', 2791, 20, 1, 2498, 3870, 3),\n" +
            "(6807, 'SIC', 4313, 70, 1, 4181, 8220, 3),\n" +
            "(6808, 'NAICS', 1577, 53113, 4, 1576, 531130, 5),\n" +
            "(6809, 'SIC', 4040, 7300, 2, 4052, 7335, 4),\n" +
            "(6810, 'NAICS', 1506, 5223, 3, 1509, 522320, 5),\n" +
            "(6811, 'NAICS', 2189, 9261, 3, 2198, 926150, 5),\n" +
            "(6812, 'NAICS', 1592, 5321, 3, 1597, 53212, 4),\n" +
            "(6813, 'NAICS', 1624, 54, 1, 1641, 541310, 5),\n" +
            "(6814, 'NAICS', 2071, 812, 2, 2083, 812220, 5),\n" +
            "(6815, 'SIC', 3526, 3700, 2, 3530, 3714, 4),\n" +
            "(6816, 'NAICS', 1570, 531, 2, 1581, 531210, 5),\n" +
            "(6817, 'SIC', 3190, 2700, 2, 3208, 2780, 3),\n" +
            "(6818, 'NAICS', 1485, 522, 2, 1506, 5223, 3),\n" +
            "(6819, 'SIC', 4305, 1, 1, 2813, 170, 3),\n" +
            "(6820, 'NAICS', 207, 2361, 3, 209, 236115, 5),\n" +
            "(6821, 'SEC', 2691, 6400, 2, 2693, 6411, 4),\n" +
            "(6822, 'SEC', 2458, 3700, 2, 2466, 3721, 4),\n" +
            "(6823, 'NAICS', 930, 42, 1, 1050, 424480, 5),\n" +
            "(6824, 'SEC', 2790, 15, 1, 2234, 1600, 2),\n" +
            "(6825, 'SIC', 3149, 2510, 3, 3153, 2515, 4),\n" +
            "(6826, 'SIC', 4308, 20, 1, 3151, 2512, 4),\n" +
            "(6827, 'SEC', 2788, 1, 1, 2210, 100, 2),\n" +
            "(6828, 'NAICS', 1625, 541, 2, 1702, 541870, 5),\n" +
            "(6829, 'SIC', 4312, 60, 1, 3957, 6289, 4),\n" +
            "(6830, 'SIC', 3948, 6200, 2, 3954, 6231, 4),\n" +
            "(6831, 'SIC', 4308, 20, 1, 3119, 2394, 4),\n" +
            "(6832, 'SIC', 4310, 50, 1, 3772, 5137, 4),\n" +
            "(6833, 'SIC', 4308, 20, 1, 2985, 2013, 4),\n" +
            "(6834, 'SIC', 4308, 20, 1, 3580, 3915, 4),\n" +
            "(6835, 'SIC', 3811, 5260, 3, 3812, 5261, 4),\n" +
            "(6836, 'NAICS', 1, 11, 1, 28, 11133, 4),\n" +
            "(6837, 'SIC', 4308, 20, 1, 3212, 2791, 4),\n" +
            "(6838, 'SIC', 3978, 6510, 3, 3982, 6515, 4),\n" +
            "(6839, 'NAICS', 205, 23, 1, 263, 238320, 5),\n" +
            "(6840, 'NAICS', 1624, 54, 1, 1714, 541940, 5),\n" +
            "(6841, 'SEC', 2791, 20, 1, 2424, 3570, 3),\n" +
            "(6842, 'SIC', 3468, 3580, 3, 3469, 3581, 4),\n" +
            "(6843, 'SEC', 2215, 1000, 2, 2216, 1040, 3),\n" +
            "(6844, 'SEC', 2403, 3500, 2, 2426, 3572, 4),\n" +
            "(6845, 'SIC', 4259, 9220, 3, 4263, 9224, 4),\n" +
            "(6846, 'NAICS', 930, 42, 1, 1002, 423860, 5),\n" +
            "(6847, 'NAICS', 2157, 92213, 4, 2156, 922130, 5),\n" +
            "(6848, 'SEC', 2371, 3300, 2, 2378, 3340, 3),\n" +
            "(6849, 'NAICS', 1634, 5412, 3, 1639, 541219, 5),\n" +
            "(6850, 'NAICS', 205, 23, 1, 257, 23822, 4),\n" +
            "(6851, 'NAICS', 1442, 515, 2, 1448, 51512, 4),\n" +
            "(6852, 'SIC', 3371, 3400, 2, 3382, 3432, 4),\n" +
            "(6853, 'SIC', 4041, 7310, 3, 4045, 7319, 4),\n" +
            "(6854, 'NAICS', 260, 2383, 3, 261, 238310, 5),\n" +
            "(6855, 'SIC', 4308, 20, 1, 3462, 3571, 4),\n" +
            "(6856, 'NAICS', 132, 21, 1, 139, 2121, 3),\n" +
            "(6857, 'NAICS', 1470, 519, 2, 1473, 51911, 4),\n" +
            "(6858, 'NAICS', 1402, 51, 1, 1454, 517110, 5),\n" +
            "(6859, 'SEC', 2692, 6410, 3, 2693, 6411, 4),\n" +
            "(6860, 'NAICS', 1591, 532, 2, 1614, 532411, 5),\n" +
            "(6861, 'SEC', 2790, 15, 1, 2231, 1530, 3),\n" +
            "(6862, 'SIC', 4305, 1, 1, 2814, 171, 4),\n" +
            "(6863, 'SEC', 2670, 6200, 2, 2673, 6220, 3),\n" +
            "(6864, 'NAICS', 1, 11, 1, 43, 1119, 3),\n" +
            "(6865, 'NAICS', 1090, 4251, 3, 1094, 42512, 4),\n" +
            "(6866, 'NAICS', 1721, 55111, 4, 1724, 551114, 5),\n" +
            "(6867, 'SIC', 2955, 1700, 2, 2964, 1742, 4),\n" +
            "(6868, 'NAICS', 2052, 8112, 3, 2053, 81121, 4),\n" +
            "(6869, 'NAICS', 1726, 561, 2, 1741, 5614, 3),\n" +
            "(6870, 'NAICS', 70, 11231, 4, 69, 112310, 5),\n" +
            "(6871, 'SIC', 4311, 52, 1, 3851, 5571, 4),\n" +
            "(6872, 'NAICS', 235, 238, 2, 262, 23831, 4),\n" +
            "(6873, 'NAICS', 1979, 713, 2, 1987, 71321, 4),\n" +
            "(6874, 'NAICS', 1851, 621, 2, 1852, 6211, 3),\n" +
            "(6875, 'NAICS', 2, 111, 2, 22, 111219, 5),\n" +
            "(6876, 'SIC', 4308, 20, 1, 2994, 2032, 4),\n" +
            "(6877, 'NAICS', 1569, 53, 1, 1613, 53241, 4),\n" +
            "(6878, 'SIC', 4311, 52, 1, 3828, 5431, 4),\n" +
            "(6879, 'SIC', 3655, 4510, 3, 3656, 4512, 4),\n" +
            "(6880, 'NAICS', 1015, 424, 2, 1055, 424510, 5),\n" +
            "(6881, 'NAICS', 1900, 62221, 4, 1899, 622210, 5),\n" +
            "(6882, 'NAICS', 1725, 56, 1, 1780, 56173, 4),\n" +
            "(6883, 'SIC', 4314, 90, 1, 4283, 9532, 4),\n" +
            "(6884, 'NAICS', 946, 4233, 3, 951, 423330, 5),\n" +
            "(6885, 'NAICS', 1726, 561, 2, 1789, 56192, 4),\n" +
            "(6886, 'SIC', 4308, 20, 1, 3183, 2673, 4),\n" +
            "(6887, 'SIC', 3977, 6500, 2, 3991, 6553, 4),\n" +
            "(6888, 'SIC', 4284, 9600, 2, 4288, 9621, 4),\n" +
            "(6889, 'NAICS', 1942, 71, 1, 1953, 7112, 3),\n" +
            "(6890, 'NAICS', 36, 1114, 3, 42, 111422, 5),\n" +
            "(6891, 'NAICS', 1689, 5418, 3, 1701, 54186, 4),\n" +
            "(6892, 'SIC', 4313, 70, 1, 4060, 7353, 4),\n" +
            "(6893, 'NAICS', 930, 42, 1, 933, 423110, 5),\n" +
            "(6894, 'SEC', 2355, 3200, 2, 2365, 3260, 3),\n" +
            "(6895, 'NAICS', 1479, 51919, 4, 1478, 519190, 5),\n" +
            "(6896, 'NAICS', 225, 23713, 4, 224, 237130, 5),\n" +
            "(6897, 'NAICS', 1812, 61, 1, 1818, 611210, 5),\n" +
            "(6898, 'NAICS', 955, 4234, 3, 956, 423410, 5),\n" +
            "(6899, 'NAICS', 930, 42, 1, 1025, 42421, 4),\n" +
            "(6900, 'SIC', 3419, 3500, 2, 3444, 3550, 3),\n" +
            "(6901, 'NAICS', 1624, 54, 1, 1636, 541211, 5),\n" +
            "(6902, 'SIC', 2987, 2020, 3, 2991, 2024, 4),\n" +
            "(6903, 'NAICS', 1530, 52392, 4, 1529, 523920, 5),\n" +
            "(6904, 'SIC', 3484, 3620, 3, 3487, 3625, 4),\n" +
            "(6905, 'NAICS', 28, 11133, 4, 35, 111339, 5),\n" +
            "(6906, 'SIC', 3190, 2700, 2, 3198, 2740, 3),\n" +
            "(6907, 'SIC', 3083, 2300, 2, 3100, 2342, 4),\n" +
            "(6908, 'NAICS', 132, 21, 1, 135, 21111, 4),\n" +
            "(6909, 'SEC', 2791, 20, 1, 2474, 3760, 3),\n" +
            "(6910, 'SIC', 3693, 4900, 2, 3712, 4961, 4),\n" +
            "(6911, 'SEC', 2470, 3740, 3, 2471, 3743, 4),\n" +
            "(6912, 'SIC', 3620, 4200, 2, 3624, 4214, 4),\n" +
            "(6913, 'NAICS', 72, 11232, 4, 71, 112320, 5),\n" +
            "(6914, 'SIC', 3050, 2200, 2, 3057, 2240, 3),\n" +
            "(6915, 'NAICS', 1467, 5182, 3, 1469, 51821, 4),\n" +
            "(6916, 'SIC', 2982, 2000, 2, 3019, 2068, 4),\n" +
            "(6917, 'SIC', 4312, 60, 1, 3960, 6311, 4),\n" +
            "(6918, 'NAICS', 2163, 92216, 4, 2162, 922160, 5),\n" +
            "(6919, 'NAICS', 1452, 517, 2, 1464, 517911, 5),\n" +
            "(6920, 'SEC', 2643, 5940, 3, 2645, 5945, 4),\n" +
            "(6921, 'SIC', 4308, 20, 1, 3175, 2652, 4),\n" +
            "(6922, 'NAICS', 1571, 5311, 3, 1572, 531110, 5),\n" +
            "(6923, 'SIC', 4313, 70, 1, 4038, 7291, 4),\n" +
            "(6924, 'SIC', 2847, 700, 2, 2858, 750, 3),\n" +
            "(6925, 'SIC', 3337, 3300, 2, 3338, 3310, 3),\n" +
            "(6926, 'NAICS', 1624, 54, 1, 1668, 541511, 5),\n" +
            "(6927, 'NAICS', 2135, 92, 1, 2173, 92313, 4),\n" +
            "(6928, 'NAICS', 1881, 6215, 3, 1882, 62151, 4),\n" +
            "(6929, 'NAICS', 1943, 711, 2, 1954, 71121, 4),\n" +
            "(6930, 'SIC', 3214, 2800, 2, 3241, 2870, 3),\n" +
            "(6931, 'SEC', 2371, 3300, 2, 2374, 3317, 4),\n" +
            "(6932, 'NAICS', 205, 23, 1, 242, 23813, 4),\n" +
            "(6933, 'NAICS', 37, 11141, 4, 38, 111411, 5),\n" +
            "(6934, 'SIC', 3159, 2530, 3, 3160, 2531, 4),\n" +
            "(6935, 'SIC', 3050, 2200, 2, 3069, 2262, 4),\n" +
            "(6936, 'SIC', 3526, 3700, 2, 3535, 3724, 4),\n" +
            "(6937, 'NAICS', 1, 11, 1, 7, 11112, 4),\n" +
            "(6938, 'NAICS', 931, 423, 2, 972, 42351, 4),\n" +
            "(6939, 'SIC', 3404, 3480, 3, 3405, 3482, 4),\n" +
            "(6940, 'SEC', 2649, 6000, 2, 2658, 6099, 4),\n" +
            "(6941, 'NAICS', 1570, 531, 2, 1589, 531390, 5),\n" +
            "(6942, 'NAICS', 1054, 4245, 3, 1059, 424590, 5),\n" +
            "(6943, 'SIC', 4313, 70, 1, 4015, 7040, 3),\n" +
            "(6944, 'NAICS', 1035, 4244, 3, 1037, 42441, 4),\n" +
            "(6945, 'NAICS', 1480, 52, 1, 1560, 525190, 5),\n" +
            "(6946, 'SIC', 3419, 3500, 2, 3453, 3562, 4),\n" +
            "(6947, 'NAICS', 1719, 551, 2, 1723, 551112, 5),\n" +
            "(6948, 'SIC', 3958, 6300, 2, 3959, 6310, 3),\n" +
            "(6949, 'NAICS', 1942, 71, 1, 1975, 712130, 5),\n" +
            "(6950, 'SIC', 3316, 3260, 3, 3317, 3261, 4),\n" +
            "(6951, 'NAICS', 1819, 61121, 4, 1818, 611210, 5),\n" +
            "(6952, 'SIC', 2982, 2000, 2, 3031, 2086, 4),\n" +
            "(6953, 'NAICS', 2120, 8139, 3, 2123, 813920, 5),\n" +
            "(6954, 'NAICS', 1942, 71, 1, 1968, 71151, 4),\n" +
            "(6955, 'SIC', 3662, 4600, 2, 3666, 4619, 4),\n" +
            "(6956, 'SIC', 4313, 70, 1, 4209, 8610, 3),\n" +
            "(6957, 'NAICS', 2131, 814, 2, 2132, 8141, 3),\n" +
            "(6958, 'SIC', 4308, 20, 1, 3591, 3955, 4),\n" +
            "(6959, 'NAICS', 1425, 51213, 4, 1427, 512132, 5),\n" +
            "(6960, 'SEC', 2396, 3450, 3, 2398, 3452, 4),\n" +
            "(6961, 'NAICS', 260, 2383, 3, 270, 23835, 4),\n" +
            "(6962, 'NAICS', 1420, 5121, 3, 1426, 512131, 5),\n" +
            "(6963, 'SIC', 4313, 70, 1, 4214, 8631, 4),\n" +
            "(6964, 'SEC', 2302, 2700, 2, 2303, 2710, 3),\n" +
            "(6965, 'SIC', 4313, 70, 1, 4142, 7993, 4),\n" +
            "(6966, 'SIC', 3474, 3590, 3, 3477, 3594, 4),\n" +
            "(6967, 'SIC', 3371, 3400, 2, 3409, 3490, 3),\n" +
            "(6968, 'NAICS', 969, 42349, 4, 968, 423490, 5),\n" +
            "(6969, 'NAICS', 1403, 511, 2, 1407, 511120, 5),\n" +
            "(6970, 'NAICS', 1941, 62441, 4, 1940, 624410, 5),\n" +
            "(6971, 'SEC', 2791, 20, 1, 2296, 2621, 4),\n" +
            "(6972, 'SIC', 4308, 20, 1, 3198, 2740, 3),\n" +
            "(6973, 'SIC', 3620, 4200, 2, 3630, 4226, 4),\n" +
            "(6974, 'SIC', 4311, 52, 1, 3871, 5712, 4),\n" +
            "(6975, 'SEC', 2229, 1500, 2, 2230, 1520, 3),\n" +
            "(6976, 'SIC', 3230, 2840, 3, 3233, 2843, 4),\n" +
            "(6977, 'NAICS', 1026, 4243, 3, 1029, 424320, 5),\n" +
            "(6978, 'NAICS', 1888, 6219, 3, 1889, 621910, 5),\n" +
            "(6979, 'SIC', 4309, 40, 1, 3663, 4610, 3),\n" +
            "(6980, 'NAICS', 1485, 522, 2, 1512, 52239, 4),\n" +
            "(6981, 'NAICS', 1624, 54, 1, 1679, 541620, 5),\n" +
            "(6982, 'SIC', 4062, 7360, 3, 4064, 7363, 4),\n" +
            "(6983, 'NAICS', 52, 11199, 4, 55, 111998, 5),\n" +
            "(6984, 'SIC', 4308, 20, 1, 3256, 2951, 4),\n" +
            "(6985, 'NAICS', 1485, 522, 2, 1490, 52212, 4),\n" +
            "(6986, 'NAICS', 1713, 54193, 4, 1712, 541930, 5),\n" +
            "(6987, 'NAICS', 1, 11, 1, 90, 112910, 5),\n" +
            "(6988, 'NAICS', 1733, 5613, 3, 1740, 56133, 4),\n" +
            "(6989, 'SEC', 2796, 70, 1, 2776, 8711, 4),\n" +
            "(6990, 'SIC', 3246, 2890, 3, 3249, 2893, 4),\n" +
            "(6991, 'SIC', 3886, 5900, 2, 3894, 5941, 4),\n" +
            "(6992, 'NAICS', 157, 21231, 4, 158, 212311, 5),\n" +
            "(6993, 'SIC', 4313, 70, 1, 4018, 7210, 3),\n" +
            "(6994, 'NAICS', 1076, 4249, 3, 1084, 42494, 4),\n" +
            "(6995, 'SIC', 4308, 20, 1, 3474, 3590, 3),\n" +
            "(6996, 'NAICS', 1850, 62, 1, 1856, 6212, 3),\n" +
            "(6997, 'NAICS', 2147, 92115, 4, 2146, 921150, 5),\n" +
            "(6998, 'SIC', 3137, 2440, 3, 3138, 2441, 4),\n" +
            "(6999, 'NAICS', 1, 11, 1, 42, 111422, 5),\n" +
            "(7000, 'NAICS', 206, 236, 2, 216, 236220, 5),\n" +
            "(7001, 'NAICS', 1625, 541, 2, 1706, 5419, 3),\n" +
            "(7002, 'SIC', 4308, 20, 1, 3539, 3732, 4),\n" +
            "(7003, 'SIC', 3533, 3720, 3, 3534, 3721, 4),\n" +
            "(7004, 'NAICS', 181, 221, 2, 189, 221116, 5),\n" +
            "(7005, 'NAICS', 1, 11, 1, 59, 112111, 5),\n" +
            "(7006, 'NAICS', 2061, 8114, 3, 2064, 811412, 5),\n" +
            "(7007, 'NAICS', 2085, 8123, 3, 2091, 812331, 5),\n" +
            "(7008, 'NAICS', 2103, 813, 2, 2117, 8134, 3),\n" +
            "(7009, 'SEC', 2677, 6300, 2, 2690, 6399, 4),\n" +
            "(7010, 'SIC', 3190, 2700, 2, 3211, 2790, 3),\n" +
            "(7011, 'SEC', 2788, 1, 1, 2211, 200, 2),\n" +
            "(7012, 'NAICS', 138, 212, 2, 163, 212321, 5),\n" +
            "(7013, 'NAICS', 1784, 56179, 4, 1783, 561790, 5),\n" +
            "(7014, 'NAICS', 1851, 621, 2, 1855, 621112, 5),\n" +
            "(7015, 'SIC', 4293, 9650, 3, 4294, 9651, 4),\n" +
            "(7016, 'SIC', 4308, 20, 1, 3040, 2099, 4),\n" +
            "(7017, 'NAICS', 253, 2382, 3, 259, 23829, 4),\n" +
            "(7018, 'NAICS', 1625, 541, 2, 1701, 54186, 4),\n" +
            "(7019, 'NAICS', 56, 112, 2, 83, 11242, 4),\n" +
            "(7020, 'SIC', 4311, 52, 1, 3805, 5210, 3),\n" +
            "(7021, 'NAICS', 1, 11, 1, 69, 112310, 5),\n" +
            "(7022, 'NAICS', 138, 212, 2, 145, 212210, 5),\n" +
            "(7023, 'NAICS', 2200, 927, 2, 2202, 927110, 5),\n" +
            "(7024, 'SEC', 2794, 52, 1, 2607, 5211, 4),\n" +
            "(7025, 'SIC', 3215, 2810, 3, 3219, 2819, 4),\n" +
            "(7026, 'SIC', 4313, 70, 1, 4036, 7261, 4),\n" +
            "(7027, 'SIC', 3012, 2060, 3, 3015, 2063, 4),\n" +
            "(7028, 'NAICS', 1015, 424, 2, 1034, 42434, 4),\n" +
            "(7029, 'SIC', 4308, 20, 1, 3334, 3296, 4),\n" +
            "(7030, 'SIC', 4309, 40, 1, 3673, 4731, 4),\n" +
            "(7031, 'SEC', 2791, 20, 1, 2392, 3442, 4),\n" +
            "(7032, 'SIC', 4314, 90, 1, 4304, 9999, 4),\n" +
            "(7033, 'NAICS', 931, 423, 2, 968, 423490, 5),\n" +
            "(7034, 'NAICS', 1485, 522, 2, 1495, 5222, 3),\n" +
            "(7035, 'SIC', 3287, 3140, 3, 3291, 3149, 4),\n" +
            "(7036, 'SIC', 3693, 4900, 2, 3711, 4960, 3),\n" +
            "(7037, 'NAICS', 2038, 811, 2, 2046, 811121, 5),\n" +
            "(7038, 'SIC', 4309, 40, 1, 3653, 4499, 4),\n" +
            "(7039, 'NAICS', 1635, 54121, 4, 1639, 541219, 5),\n" +
            "(7040, 'NAICS', 1569, 53, 1, 1621, 5331, 3),\n" +
            "(7041, 'SIC', 4109, 7690, 3, 4112, 7699, 4),\n" +
            "(7042, 'SEC', 2623, 5600, 2, 2628, 5660, 3),\n" +
            "(7043, 'NAICS', 1404, 5111, 3, 1406, 51111, 4),\n" +
            "(7044, 'SIC', 4308, 20, 1, 3578, 3911, 4),\n" +
            "(7045, 'NAICS', 205, 23, 1, 225, 23713, 4),\n" +
            "(7046, 'SIC', 3170, 2620, 3, 3171, 2621, 4),\n" +
            "(7047, 'SEC', 2555, 4920, 3, 2557, 4923, 4),\n" +
            "(7048, 'SIC', 3144, 2490, 3, 3147, 2499, 4),\n" +
            "(7049, 'SIC', 4313, 70, 1, 4047, 7322, 4),\n" +
            "(7050, 'NAICS', 1480, 52, 1, 1483, 521110, 5),\n" +
            "(7051, 'NAICS', 2068, 81143, 4, 2067, 811430, 5),\n" +
            "(7052, 'NAICS', 1466, 518, 2, 1467, 5182, 3),\n" +
            "(7053, 'SIC', 3620, 4200, 2, 3631, 4230, 3),\n" +
            "(7054, 'SIC', 3282, 3100, 2, 3299, 3190, 3),\n" +
            "(7055, 'SIC', 3362, 3360, 3, 3364, 3364, 4),\n" +
            "(7056, 'NAICS', 1514, 5231, 3, 1517, 523120, 5),\n" +
            "(7057, 'SIC', 4310, 50, 1, 3742, 5064, 4),\n" +
            "(7058, 'SIC', 4312, 60, 1, 3987, 6540, 3),\n" +
            "(7059, 'NAICS', 2020, 722, 2, 2022, 722310, 5),\n" +
            "(7060, 'SEC', 2577, 5050, 3, 2578, 5051, 4),\n" +
            "(7061, 'SIC', 4235, 8740, 3, 4238, 8743, 4),\n" +
            "(7062, 'NAICS', 2037, 81, 1, 2064, 811412, 5),\n" +
            "(7063, 'NAICS', 144, 2122, 3, 146, 21221, 4),\n" +
            "(7064, 'SIC', 4306, 10, 1, 2897, 1081, 4),\n" +
            "(7065, 'SIC', 4033, 7250, 3, 4034, 7251, 4),\n" +
            "(7066, 'SIC', 4306, 10, 1, 2891, 1040, 3),\n" +
            "(7067, 'NAICS', 1979, 713, 2, 1984, 71312, 4),\n" +
            "(7068, 'SIC', 3992, 6700, 2, 4001, 6733, 4),\n" +
            "(7069, 'SEC', 2791, 20, 1, 2259, 2100, 2),\n" +
            "(7070, 'SIC', 4312, 60, 1, 3954, 6231, 4),\n" +
            "(7071, 'SIC', 3948, 6200, 2, 3957, 6289, 4),\n" +
            "(7072, 'NAICS', 1624, 54, 1, 1697, 54184, 4),\n" +
            "(7073, 'SEC', 2476, 3800, 2, 2496, 3860, 3),\n" +
            "(7074, 'SIC', 4046, 7320, 3, 4047, 7322, 4),\n" +
            "(7075, 'SEC', 2793, 50, 1, 2580, 5063, 4),\n" +
            "(7076, 'NAICS', 1, 11, 1, 50, 111940, 5),\n" +
            "(7077, 'NAICS', 1570, 531, 2, 1585, 531311, 5),\n" +
            "(7078, 'NAICS', 930, 42, 1, 1077, 424910, 5),\n" +
            "(7079, 'SIC', 4310, 50, 1, 3717, 5012, 4),\n" +
            "(7080, 'NAICS', 1590, 53139, 4, 1589, 531390, 5),\n" +
            "(7081, 'SIC', 4308, 20, 1, 3585, 3944, 4),\n" +
            "(7082, 'NAICS', 2020, 722, 2, 2028, 7224, 3),\n" +
            "(7083, 'SIC', 4313, 70, 1, 4196, 8331, 4),\n" +
            "(7084, 'NAICS', 1850, 62, 1, 1938, 62431, 4),\n" +
            "(7085, 'SIC', 4307, 15, 1, 2950, 1611, 4),\n" +
            "(7086, 'SIC', 4040, 7300, 2, 4049, 7330, 3),\n" +
            "(7087, 'NAICS', 1, 11, 1, 118, 1151, 3),\n" +
            "(7088, 'NAICS', 172, 213, 2, 176, 213112, 5),\n" +
            "(7089, 'SEC', 2709, 7000, 2, 2710, 7010, 3),\n" +
            "(7090, 'SIC', 3716, 5010, 3, 3718, 5013, 4),\n" +
            "(7091, 'SIC', 4256, 9200, 2, 4257, 9210, 3),\n" +
            "(7092, 'SIC', 4308, 20, 1, 3460, 3569, 4),\n" +
            "(7093, 'SEC', 2794, 52, 1, 2616, 5399, 4),\n" +
            "(7094, 'SIC', 4305, 1, 1, 2802, 115, 4),\n" +
            "(7095, 'SIC', 3877, 5730, 3, 3881, 5736, 4),\n" +
            "(7096, 'NAICS', 1812, 61, 1, 1845, 611692, 5),\n" +
            "(7097, 'NAICS', 2093, 8129, 3, 2101, 812990, 5),\n" +
            "(7098, 'SEC', 2792, 40, 1, 2558, 4924, 4),\n" +
            "(7099, 'SEC', 2753, 8000, 2, 2759, 8062, 4),\n" +
            "(7100, 'SIC', 3618, 4170, 3, 3619, 4173, 4),\n" +
            "(7101, 'SIC', 3955, 6280, 3, 3957, 6289, 4),\n" +
            "(7102, 'SEC', 2349, 3080, 3, 2352, 3089, 4),\n" +
            "(7103, 'NAICS', 930, 42, 1, 944, 423220, 5),\n" +
            "(7104, 'NAICS', 1624, 54, 1, 1631, 54119, 4),\n" +
            "(7105, 'NAICS', 1792, 562, 2, 1800, 562211, 5),\n" +
            "(7106, 'SIC', 3083, 2300, 2, 3111, 2385, 4),\n" +
            "(7107, 'NAICS', 205, 23, 1, 236, 2381, 3),\n" +
            "(7108, 'SIC', 2847, 700, 2, 2859, 751, 4),\n" +
            "(7109, 'NAICS', 930, 42, 1, 1036, 424410, 5),\n" +
            "(7110, 'SIC', 4314, 90, 1, 4290, 9631, 4),\n" +
            "(7111, 'SEC', 2791, 20, 1, 2248, 2033, 4),\n" +
            "(7112, 'SIC', 4308, 20, 1, 3461, 3570, 3),\n" +
            "(7113, 'SIC', 4312, 60, 1, 3936, 6099, 4),\n" +
            "(7114, 'NAICS', 1480, 52, 1, 1565, 525920, 5),\n" +
            "(7115, 'SIC', 3737, 5050, 3, 3738, 5051, 4),\n" +
            "(7116, 'SIC', 4308, 20, 1, 3214, 2800, 2),\n" +
            "(7117, 'SIC', 3649, 4490, 3, 3651, 4492, 4),\n" +
            "(7118, 'NAICS', 1402, 51, 1, 1467, 5182, 3),\n" +
            "(7119, 'SEC', 2670, 6200, 2, 2671, 6210, 3),\n" +
            "(7120, 'NAICS', 1640, 5413, 3, 1643, 541320, 5),\n" +
            "(7121, 'NAICS', 931, 423, 2, 973, 423520, 5),\n" +
            "(7122, 'NAICS', 2020, 722, 2, 2023, 72231, 4),\n" +
            "(7123, 'SIC', 4308, 20, 1, 3211, 2790, 3),\n" +
            "(7124, 'SIC', 4311, 52, 1, 3895, 5942, 4),\n" +
            "(7125, 'NAICS', 1868, 62139, 4, 1869, 621391, 5),\n" +
            "(7126, 'SEC', 2713, 7300, 2, 2722, 7360, 3),\n" +
            "(7127, 'SIC', 4314, 90, 1, 4279, 9511, 4),\n" +
            "(7128, 'SIC', 4312, 60, 1, 3935, 6091, 4),\n" +
            "(7129, 'SIC', 4162, 8060, 3, 4163, 8062, 4),\n" +
            "(7130, 'SIC', 4192, 8300, 2, 4201, 8390, 3),\n" +
            "(7131, 'SIC', 2798, 100, 2, 2810, 139, 4),\n" +
            "(7132, 'NAICS', 1404, 5111, 3, 1413, 51119, 4),\n" +
            "(7133, 'NAICS', 1569, 53, 1, 1606, 532291, 5),\n" +
            "(7134, 'SIC', 2847, 700, 2, 2863, 762, 4),\n" +
            "(7135, 'SEC', 2331, 2850, 3, 2332, 2851, 4),\n" +
            "(7136, 'SIC', 2955, 1700, 2, 2969, 1760, 3),\n" +
            "(7137, 'SEC', 2591, 5100, 2, 2594, 5122, 4),\n" +
            "(7138, 'SIC', 4120, 7830, 3, 4121, 7832, 4),\n" +
            "(7139, 'SIC', 3124, 2400, 2, 3134, 2435, 4),\n" +
            "(7140, 'NAICS', 1850, 62, 1, 1866, 621340, 5),\n" +
            "(7141, 'NAICS', 2048, 81119, 4, 2049, 811191, 5),\n" +
            "(7142, 'SEC', 2536, 4700, 2, 2538, 4731, 4),\n" +
            "(7143, 'SEC', 2568, 5000, 2, 2589, 5094, 4),\n" +
            "(7144, 'NAICS', 1413, 51119, 4, 1414, 511191, 5),\n" +
            "(7145, 'NAICS', 1942, 71, 1, 1974, 71212, 4),\n" +
            "(7146, 'SIC', 4314, 90, 1, 4270, 9411, 4),\n" +
            "(7147, 'NAICS', 930, 42, 1, 934, 42311, 4),\n" +
            "(7148, 'SIC', 3804, 5200, 2, 3813, 5270, 3),\n" +
            "(7149, 'NAICS', 993, 42381, 4, 992, 423810, 5),\n" +
            "(7150, 'SIC', 3115, 2390, 3, 3116, 2391, 4),\n" +
            "(7151, 'SIC', 4241, 8800, 2, 4242, 8810, 3),\n" +
            "(7152, 'NAICS', 930, 42, 1, 1020, 42412, 4),\n" +
            "(7153, 'SIC', 3724, 5030, 3, 3727, 5033, 4),\n" +
            "(7154, 'NAICS', 1758, 5615, 3, 1765, 561599, 5),\n" +
            "(7155, 'SIC', 4308, 20, 1, 3597, 3993, 4),\n" +
            "(7156, 'SIC', 3636, 4400, 2, 3644, 4449, 4),\n" +
            "(7157, 'NAICS', 1666, 5415, 3, 1670, 541513, 5),\n" +
            "(7158, 'SIC', 4307, 15, 1, 2956, 1710, 3),\n" +
            "(7159, 'SIC', 3804, 5200, 2, 3807, 5230, 3),\n" +
            "(7160, 'SIC', 3371, 3400, 2, 3375, 3420, 3),\n" +
            "(7161, 'NAICS', 182, 2211, 3, 183, 22111, 4),\n" +
            "(7162, 'NAICS', 1554, 525, 2, 1564, 52591, 4),\n" +
            "(7163, 'SEC', 2795, 60, 1, 2677, 6300, 2),\n" +
            "(7164, 'SIC', 4314, 90, 1, 4280, 9512, 4),\n" +
            "(7165, 'SEC', 2795, 60, 1, 2672, 6211, 4),\n" +
            "(7166, 'SIC', 2983, 2010, 3, 2984, 2011, 4),\n" +
            "(7167, 'SIC', 4305, 1, 1, 2856, 741, 4),\n" +
            "(7168, 'NAICS', 1015, 424, 2, 1050, 424480, 5),\n" +
            "(7169, 'NAICS', 1942, 71, 1, 1962, 71132, 4),\n" +
            "(7170, 'SIC', 3977, 6500, 2, 3978, 6510, 3),\n" +
            "(7171, 'SEC', 2617, 5400, 2, 2618, 5410, 3),\n" +
            "(7172, 'SIC', 4049, 7330, 3, 4050, 7331, 4),\n" +
            "(7173, 'SEC', 2670, 6200, 2, 2672, 6211, 4),\n" +
            "(7174, 'NAICS', 2038, 811, 2, 2067, 811430, 5),\n" +
            "(7175, 'SEC', 2240, 2000, 2, 2253, 2070, 3),\n" +
            "(7176, 'NAICS', 2032, 72251, 4, 2035, 722514, 5),\n" +
            "(7177, 'SEC', 2539, 4800, 2, 2542, 4813, 4),\n" +
            "(7178, 'SIC', 4308, 20, 1, 3551, 3799, 4),\n" +
            "(7179, 'SIC', 4029, 7230, 3, 4030, 7231, 4),\n" +
            "(7180, 'SIC', 4281, 9530, 3, 4282, 9531, 4),\n" +
            "(7181, 'NAICS', 138, 212, 2, 151, 212231, 5),\n" +
            "(7182, 'NAICS', 2166, 923, 2, 2168, 923110, 5),\n" +
            "(7183, 'SEC', 2791, 20, 1, 2276, 2400, 2),\n" +
            "(7184, 'NAICS', 1485, 522, 2, 1491, 522130, 5),\n" +
            "(7185, 'NAICS', 1928, 6242, 3, 1935, 62423, 4),\n" +
            "(7186, 'SIC', 3426, 3530, 3, 3428, 3532, 4),\n" +
            "(7187, 'SIC', 4297, 9700, 2, 4299, 9711, 4),\n" +
            "(7188, 'NAICS', 1403, 511, 2, 1417, 511210, 5),\n" +
            "(7189, 'SIC', 4309, 40, 1, 3707, 4950, 3),\n" +
            "(7190, 'SEC', 2713, 7300, 2, 2733, 7384, 4),\n" +
            "(7191, 'SIC', 4308, 20, 1, 3284, 3111, 4),\n" +
            "(7192, 'NAICS', 1570, 531, 2, 1586, 531312, 5),\n" +
            "(7193, 'NAICS', 1726, 561, 2, 1740, 56133, 4),\n" +
            "(7194, 'NAICS', 1942, 71, 1, 1988, 713290, 5),\n" +
            "(7195, 'SEC', 2626, 5650, 3, 2627, 5651, 4),\n" +
            "(7196, 'SIC', 4089, 7530, 3, 4092, 7534, 4),\n" +
            "(7197, 'SIC', 4310, 50, 1, 3757, 5091, 4),\n" +
            "(7198, 'SIC', 4224, 8710, 3, 4225, 8711, 4),\n" +
            "(7199, 'NAICS', 1495, 5222, 3, 1504, 522294, 5),\n" +
            "(7200, 'NAICS', 1513, 523, 2, 1528, 52391, 4),\n" +
            "(7201, 'SEC', 2796, 70, 1, 2745, 7830, 3),\n" +
            "(7202, 'SIC', 3296, 3170, 3, 3298, 3172, 4),\n" +
            "(7203, 'SEC', 2795, 60, 1, 2671, 6210, 3),\n" +
            "(7204, 'SIC', 4308, 20, 1, 3321, 3269, 4),\n" +
            "(7205, 'SEC', 2500, 3900, 2, 2506, 3942, 4),\n" +
            "(7206, 'NAICS', 1689, 5418, 3, 1692, 541820, 5),\n" +
            "(7207, 'SEC', 2738, 7800, 2, 2739, 7810, 3),\n" +
            "(7208, 'NAICS', 1402, 51, 1, 1443, 5151, 3),\n" +
            "(7209, 'NAICS', 1420, 5121, 3, 1423, 512120, 5),\n" +
            "(7210, 'SIC', 4312, 60, 1, 4003, 6792, 4),\n" +
            "(7211, 'SIC', 4308, 20, 1, 2996, 2034, 4),\n" +
            "(7212, 'NAICS', 1859, 6213, 3, 1860, 621310, 5),\n" +
            "(7213, 'NAICS', 930, 42, 1, 1015, 424, 2),\n" +
            "(7214, 'NAICS', 1612, 5324, 3, 1619, 53249, 4),\n" +
            "(7215, 'SIC', 4308, 20, 1, 3325, 3273, 4),\n" +
            "(7216, 'NAICS', 1625, 541, 2, 1699, 54185, 4),\n" +
            "(7217, 'NAICS', 1942, 71, 1, 2001, 713990, 5),\n" +
            "(7218, 'SIC', 4314, 90, 1, 4298, 9710, 3),\n" +
            "(7219, 'NAICS', 1547, 5242, 3, 1552, 524292, 5),\n" +
            "(7220, 'NAICS', 2182, 925, 2, 2183, 9251, 3),\n" +
            "(7221, 'NAICS', 98, 113, 2, 99, 1131, 3),\n" +
            "(7222, 'NAICS', 930, 42, 1, 960, 423430, 5),\n" +
            "(7223, 'SIC', 4305, 1, 1, 2823, 190, 3),\n" +
            "(7224, 'NAICS', 1536, 524, 2, 1547, 5242, 3),\n" +
            "(7225, 'NAICS', 1859, 6213, 3, 1862, 621320, 5),\n" +
            "(7226, 'SIC', 4307, 15, 1, 2977, 1793, 4),\n" +
            "(7227, 'SIC', 2982, 2000, 2, 2997, 2035, 4),\n" +
            "(7228, 'SIC', 3837, 5500, 2, 3852, 5590, 3),\n" +
            "(7229, 'NAICS', 1402, 51, 1, 1422, 51211, 4),\n" +
            "(7230, 'SEC', 2793, 50, 1, 2571, 5020, 3),\n" +
            "(7231, 'SIC', 4308, 20, 1, 3348, 3325, 4),\n" +
            "(7232, 'SIC', 3769, 5130, 3, 3770, 5131, 4),\n" +
            "(7233, 'NAICS', 2167, 9231, 3, 2174, 923140, 5),\n" +
            "(7234, 'SIC', 4308, 20, 1, 3504, 3650, 3),\n" +
            "(7235, 'NAICS', 930, 42, 1, 950, 42332, 4),\n" +
            "(7236, 'SIC', 3371, 3400, 2, 3394, 3452, 4),\n" +
            "(7237, 'NAICS', 1942, 71, 1, 1943, 711, 2),\n" +
            "(7238, 'SIC', 4311, 52, 1, 3858, 5621, 4),\n" +
            "(7239, 'NAICS', 2003, 72, 1, 2005, 7211, 3),\n" +
            "(7240, 'SIC', 4305, 1, 1, 2868, 800, 2),\n" +
            "(7241, 'SIC', 3555, 3820, 3, 3558, 3823, 4),\n" +
            "(7242, 'NAICS', 132, 21, 1, 172, 213, 2),\n" +
            "(7243, 'NAICS', 1812, 61, 1, 1819, 61121, 4),\n" +
            "(7244, 'NAICS', 1, 11, 1, 36, 1114, 3),\n" +
            "(7245, 'NAICS', 259, 23829, 4, 258, 238290, 5),\n" +
            "(7246, 'SIC', 4308, 20, 1, 3425, 3524, 4),\n" +
            "(7247, 'NAICS', 1403, 511, 2, 1408, 51112, 4),\n" +
            "(7248, 'SEC', 2791, 20, 1, 2510, 3960, 3),\n" +
            "(7249, 'NAICS', 1827, 61142, 4, 1826, 611420, 5),\n" +
            "(7250, 'NAICS', 2039, 8111, 3, 2045, 81112, 4),\n" +
            "(7251, 'SEC', 2791, 20, 1, 2491, 3843, 4),\n" +
            "(7252, 'SIC', 3208, 2780, 3, 3210, 2789, 4),\n" +
            "(7253, 'NAICS', 1943, 711, 2, 1946, 71111, 4),\n" +
            "(7254, 'SEC', 2791, 20, 1, 2301, 2673, 4),\n" +
            "(7255, 'SIC', 4308, 20, 1, 3276, 3084, 4),\n" +
            "(7256, 'SIC', 3480, 3600, 2, 3513, 3672, 4),\n" +
            "(7257, 'NAICS', 1812, 61, 1, 1841, 611630, 5),\n" +
            "(7258, 'NAICS', 1721, 55111, 4, 1722, 551111, 5),\n" +
            "(7259, 'SIC', 3093, 2330, 3, 3095, 2335, 4),\n" +
            "(7260, 'NAICS', 1015, 424, 2, 1054, 4245, 3),\n" +
            "(7261, 'NAICS', 1403, 511, 2, 1416, 5112, 3),\n" +
            "(7262, 'NAICS', 1697, 54184, 4, 1696, 541840, 5),\n" +
            "(7263, 'NAICS', 2061, 8114, 3, 2063, 811411, 5),\n" +
            "(7264, 'SIC', 4089, 7530, 3, 4093, 7536, 4),\n" +
            "(7265, 'NAICS', 1459, 5174, 3, 1460, 517410, 5),\n" +
            "(7266, 'SEC', 2794, 52, 1, 2615, 5390, 3),\n" +
            "(7267, 'SIC', 4308, 20, 1, 3399, 3466, 4),\n" +
            "(7268, 'SIC', 3883, 5810, 3, 3885, 5813, 4),\n" +
            "(7269, 'NAICS', 2135, 92, 1, 2157, 92213, 4),\n" +
            "(7270, 'NAICS', 236, 2381, 3, 249, 238170, 5),\n" +
            "(7271, 'NAICS', 132, 21, 1, 133, 211, 2),\n" +
            "(7272, 'SIC', 3084, 2310, 3, 3085, 2311, 4),\n" +
            "(7273, 'NAICS', 1034, 42434, 4, 1033, 424340, 5),\n" +
            "(7274, 'NAICS', 1726, 561, 2, 1779, 561730, 5),\n" +
            "(7275, 'NAICS', 1873, 62141, 4, 1872, 621410, 5),\n" +
            "(7276, 'SIC', 4308, 20, 1, 3357, 3353, 4),\n" +
            "(7277, 'NAICS', 1851, 621, 2, 1867, 62134, 4),\n" +
            "(7278, 'SIC', 4146, 8000, 2, 4169, 8080, 3),\n" +
            "(7279, 'SIC', 3148, 2500, 2, 3166, 2599, 4),\n" +
            "(7280, 'NAICS', 1480, 52, 1, 1520, 52313, 4),\n" +
            "(7281, 'SIC', 4308, 20, 1, 3365, 3365, 4),\n" +
            "(7282, 'SIC', 3282, 3100, 2, 3296, 3170, 3),\n" +
            "(7283, 'NAICS', 1859, 6213, 3, 1869, 621391, 5),\n" +
            "(7284, 'SIC', 4306, 10, 1, 2899, 1094, 4),\n" +
            "(7285, 'SIC', 4308, 20, 1, 3476, 3593, 4),\n" +
            "(7286, 'SIC', 4314, 90, 1, 4259, 9220, 3),\n" +
            "(7287, 'NAICS', 1792, 562, 2, 1809, 56299, 4),\n" +
            "(7288, 'NAICS', 156, 2123, 3, 163, 212321, 5),\n" +
            "(7289, 'SIC', 4308, 20, 1, 2984, 2011, 4),\n" +
            "(7290, 'SEC', 2792, 40, 1, 2519, 4213, 4),\n" +
            "(7291, 'NAICS', 1625, 541, 2, 1707, 541910, 5),\n" +
            "(7292, 'SIC', 3533, 3720, 3, 3536, 3728, 4),\n" +
            "(7293, 'SIC', 4208, 8600, 2, 4212, 8621, 4),\n" +
            "(7294, 'NAICS', 235, 238, 2, 273, 2389, 3),\n" +
            "(7295, 'NAICS', 1625, 541, 2, 1630, 54112, 4),\n" +
            "(7296, 'NAICS', 1657, 5414, 3, 1665, 54149, 4),\n" +
            "(7297, 'NAICS', 2137, 9211, 3, 2138, 921110, 5),\n" +
            "(7298, 'SIC', 4308, 20, 1, 3575, 3873, 4),\n" +
            "(7299, 'SIC', 4311, 52, 1, 3810, 5251, 4);\n";
    static String industryCodeInsert25 =  "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(7300, 'NAICS', 1725, 56, 1, 1766, 5616, 3),\n" +
            "(7301, 'NAICS', 117, 115, 2, 119, 11511, 4),\n" +
            "(7302, 'SEC', 2659, 6100, 2, 2668, 6162, 4),\n" +
            "(7303, 'SIC', 4313, 70, 1, 4066, 7371, 4),\n" +
            "(7304, 'SIC', 4037, 7290, 3, 4038, 7291, 4),\n" +
            "(7305, 'SIC', 3744, 5070, 3, 3747, 5075, 4),\n" +
            "(7306, 'SIC', 4313, 70, 1, 4213, 8630, 3),\n" +
            "(7307, 'NAICS', 56, 112, 2, 71, 112320, 5),\n" +
            "(7308, 'NAICS', 1015, 424, 2, 1061, 4246, 3),\n" +
            "(7309, 'SEC', 2791, 20, 1, 2448, 3663, 4),\n" +
            "(7310, 'NAICS', 1, 11, 1, 23, 1113, 3),\n" +
            "(7311, 'SIC', 2901, 1200, 2, 2902, 1220, 3),\n" +
            "(7312, 'NAICS', 1751, 56144, 4, 1750, 561440, 5),\n" +
            "(7313, 'SIC', 4310, 50, 1, 3788, 5160, 3),\n" +
            "(7314, 'SIC', 3167, 2600, 2, 3184, 2674, 4),\n" +
            "(7315, 'NAICS', 1741, 5614, 3, 1752, 561450, 5),\n" +
            "(7316, 'NAICS', 1850, 62, 1, 1881, 6215, 3),\n" +
            "(7317, 'SIC', 4309, 40, 1, 3683, 4813, 4),\n" +
            "(7318, 'SEC', 2677, 6300, 2, 2684, 6331, 4),\n" +
            "(7319, 'SIC', 4308, 20, 1, 3349, 3330, 3),\n" +
            "(7320, 'NAICS', 134, 2111, 3, 135, 21111, 4),\n" +
            "(7321, 'NAICS', 1624, 54, 1, 1687, 541720, 5),\n" +
            "(7322, 'SIC', 4308, 20, 1, 3596, 3991, 4),\n" +
            "(7323, 'SIC', 4305, 1, 1, 2830, 214, 4),\n" +
            "(7324, 'NAICS', 931, 423, 2, 948, 42331, 4),\n" +
            "(7325, 'NAICS', 2037, 81, 1, 2063, 811411, 5),\n" +
            "(7326, 'NAICS', 205, 23, 1, 217, 23622, 4),\n" +
            "(7327, 'NAICS', 1625, 541, 2, 1692, 541820, 5),\n" +
            "(7328, 'SIC', 4308, 20, 1, 3577, 3910, 3),\n" +
            "(7329, 'SIC', 3822, 5400, 2, 3827, 5430, 3),\n" +
            "(7330, 'NAICS', 205, 23, 1, 240, 23812, 4),\n" +
            "(7331, 'SIC', 4308, 20, 1, 3022, 2075, 4),\n" +
            "(7332, 'SIC', 2798, 100, 2, 2809, 134, 4),\n" +
            "(7333, 'SIC', 2847, 700, 2, 2864, 780, 3),\n" +
            "(7334, 'NAICS', 1689, 5418, 3, 1699, 54185, 4),\n" +
            "(7335, 'SIC', 4312, 60, 1, 3947, 6163, 4),\n" +
            "(7336, 'SIC', 2840, 270, 3, 2841, 271, 4),\n" +
            "(7337, 'SIC', 3167, 2600, 2, 3181, 2671, 4),\n" +
            "(7338, 'NAICS', 931, 423, 2, 990, 42374, 4),\n" +
            "(7339, 'NAICS', 1920, 624, 2, 1940, 624410, 5),\n" +
            "(7340, 'NAICS', 1, 11, 1, 127, 115210, 5),\n" +
            "(7341, 'NAICS', 1016, 4241, 3, 1019, 424120, 5),\n" +
            "(7342, 'NAICS', 1495, 5222, 3, 1497, 52221, 4),\n" +
            "(7343, 'NAICS', 1591, 532, 2, 1602, 53222, 4),\n" +
            "(7344, 'NAICS', 1571, 5311, 3, 1574, 531120, 5),\n" +
            "(7345, 'SIC', 4308, 20, 1, 3058, 2241, 4),\n" +
            "(7346, 'SEC', 2791, 20, 1, 2316, 2771, 4),\n" +
            "(7347, 'SEC', 2434, 3600, 2, 2448, 3663, 4),\n" +
            "(7348, 'NAICS', 183, 22111, 4, 191, 221118, 5),\n" +
            "(7349, 'NAICS', 1850, 62, 1, 1882, 62151, 4),\n" +
            "(7350, 'NAICS', 1480, 52, 1, 1501, 522291, 5),\n" +
            "(7351, 'SIC', 2896, 1080, 3, 2897, 1081, 4),\n" +
            "(7352, 'SIC', 4065, 7370, 3, 4068, 7373, 4),\n" +
            "(7353, 'SEC', 2458, 3700, 2, 2468, 3728, 4),\n" +
            "(7354, 'NAICS', 1625, 541, 2, 1627, 541110, 5),\n" +
            "(7355, 'NAICS', 970, 4235, 3, 971, 423510, 5),\n" +
            "(7356, 'NAICS', 1725, 56, 1, 1799, 56221, 4),\n" +
            "(7357, 'SIC', 3083, 2300, 2, 3108, 2380, 3),\n" +
            "(7358, 'NAICS', 1725, 56, 1, 1757, 561499, 5),\n" +
            "(7359, 'NAICS', 118, 1151, 3, 119, 11511, 4),\n" +
            "(7360, 'NAICS', 2135, 92, 1, 2195, 92613, 4),\n" +
            "(7361, 'SIC', 4311, 52, 1, 3892, 5932, 4),\n" +
            "(7362, 'SIC', 3633, 4300, 2, 3635, 4311, 4),\n" +
            "(7363, 'NAICS', 205, 23, 1, 271, 238390, 5),\n" +
            "(7364, 'SEC', 2630, 5700, 2, 2632, 5712, 4),\n" +
            "(7365, 'SIC', 4314, 90, 1, 4281, 9530, 3),\n" +
            "(7366, 'NAICS', 1488, 52211, 4, 1487, 522110, 5),\n" +
            "(7367, 'SEC', 2792, 40, 1, 2533, 4581, 4),\n" +
            "(7368, 'NAICS', 2048, 81119, 4, 2050, 811192, 5),\n" +
            "(7369, 'NAICS', 930, 42, 1, 967, 42346, 4),\n" +
            "(7370, 'NAICS', 975, 4236, 3, 978, 423620, 5),\n" +
            "(7371, 'NAICS', 2122, 81391, 4, 2121, 813910, 5),\n" +
            "(7372, 'SEC', 2790, 15, 1, 2229, 1500, 2),\n" +
            "(7373, 'NAICS', 2176, 924, 2, 2180, 924120, 5),\n" +
            "(7374, 'NAICS', 1462, 5179, 3, 1464, 517911, 5),\n" +
            "(7375, 'SIC', 4125, 7900, 2, 4133, 7940, 3),\n" +
            "(7376, 'SIC', 3337, 3300, 2, 3369, 3398, 4),\n" +
            "(7377, 'NAICS', 2071, 812, 2, 2086, 812310, 5),\n" +
            "(7378, 'SEC', 2302, 2700, 2, 2313, 2760, 3),\n" +
            "(7379, 'SIC', 4308, 20, 1, 3419, 3500, 2),\n" +
            "(7380, 'SIC', 4308, 20, 1, 3449, 3556, 4),\n" +
            "(7381, 'SIC', 4310, 50, 1, 3753, 5085, 4),\n" +
            "(7382, 'SEC', 2424, 3570, 3, 2425, 3571, 4),\n" +
            "(7383, 'SIC', 2850, 720, 3, 2852, 722, 4),\n" +
            "(7384, 'SEC', 2791, 20, 1, 2324, 2833, 4),\n" +
            "(7385, 'NAICS', 192, 22112, 4, 193, 221121, 5),\n" +
            "(7386, 'NAICS', 2037, 81, 1, 2127, 813940, 5),\n" +
            "(7387, 'NAICS', 43, 1119, 3, 52, 11199, 4),\n" +
            "(7388, 'SIC', 4306, 10, 1, 2932, 1474, 4),\n" +
            "(7389, 'SIC', 4311, 52, 1, 3804, 5200, 2),\n" +
            "(7390, 'SEC', 2677, 6300, 2, 2688, 6361, 4),\n" +
            "(7391, 'NAICS', 1541, 52412, 4, 1544, 524128, 5),\n" +
            "(7392, 'NAICS', 3, 1111, 3, 18, 111199, 5),\n" +
            "(7393, 'NAICS', 930, 42, 1, 991, 4238, 3),\n" +
            "(7394, 'NAICS', 2031, 7225, 3, 2032, 72251, 4),\n" +
            "(7395, 'SIC', 3167, 2600, 2, 3180, 2670, 3),\n" +
            "(7396, 'SIC', 4178, 8200, 2, 4191, 8299, 4),\n" +
            "(7397, 'NAICS', 1402, 51, 1, 1466, 518, 2),\n" +
            "(7398, 'NAICS', 1485, 522, 2, 1505, 522298, 5),\n" +
            "(7399, 'NAICS', 1726, 561, 2, 1781, 561740, 5),\n" +
            "(7400, 'SIC', 4308, 20, 1, 3532, 3716, 4),\n" +
            "(7401, 'NAICS', 1625, 541, 2, 1674, 541611, 5),\n" +
            "(7402, 'NAICS', 1402, 51, 1, 1445, 515111, 5),\n" +
            "(7403, 'SIC', 3837, 5500, 2, 3850, 5570, 3),\n" +
            "(7404, 'SEC', 2465, 3720, 3, 2467, 3724, 4),\n" +
            "(7405, 'NAICS', 1625, 541, 2, 1672, 5416, 3),\n" +
            "(7406, 'SEC', 2262, 2200, 2, 2263, 2210, 3),\n" +
            "(7407, 'SIC', 3041, 2100, 2, 3042, 2110, 3),\n" +
            "(7408, 'NAICS', 930, 42, 1, 959, 42342, 4),\n" +
            "(7409, 'NAICS', 1850, 62, 1, 1894, 622, 2),\n" +
            "(7410, 'NAICS', 955, 4234, 3, 965, 42345, 4),\n" +
            "(7411, 'NAICS', 2032, 72251, 4, 2034, 722513, 5),\n" +
            "(7412, 'SIC', 3480, 3600, 2, 3488, 3629, 4),\n" +
            "(7413, 'SIC', 4310, 50, 1, 3734, 5047, 4),\n" +
            "(7414, 'SIC', 3715, 5000, 2, 3720, 5015, 4),\n" +
            "(7415, 'NAICS', 58, 11211, 4, 59, 112111, 5),\n" +
            "(7416, 'NAICS', 1612, 5324, 3, 1616, 532420, 5),\n" +
            "(7417, 'NAICS', 1836, 6116, 3, 1844, 611691, 5),\n" +
            "(7418, 'NAICS', 2038, 811, 2, 2042, 811112, 5),\n" +
            "(7419, 'SIC', 3520, 3690, 3, 3525, 3699, 4),\n" +
            "(7420, 'SIC', 3977, 6500, 2, 3990, 6552, 4),\n" +
            "(7421, 'SIC', 4081, 7500, 2, 4085, 7515, 4),\n" +
            "(7422, 'NAICS', 208, 23611, 4, 210, 236116, 5),\n" +
            "(7423, 'NAICS', 2037, 81, 1, 2088, 812320, 5),\n" +
            "(7424, 'SEC', 2791, 20, 1, 2399, 3460, 3),\n" +
            "(7425, 'SIC', 3977, 6500, 2, 3985, 6530, 3),\n" +
            "(7426, 'SIC', 4139, 7990, 3, 4142, 7993, 4),\n" +
            "(7427, 'SIC', 4308, 20, 1, 3162, 2541, 4),\n" +
            "(7428, 'SEC', 2424, 3570, 3, 2430, 3579, 4),\n" +
            "(7429, 'SEC', 2691, 6400, 2, 2692, 6410, 3),\n" +
            "(7430, 'SIC', 4310, 50, 1, 3767, 5120, 3),\n" +
            "(7431, 'NAICS', 180, 22, 1, 188, 221115, 5),\n" +
            "(7432, 'NAICS', 1404, 5111, 3, 1409, 511130, 5),\n" +
            "(7433, 'NAICS', 1625, 541, 2, 1628, 54111, 4),\n" +
            "(7434, 'SIC', 4308, 20, 1, 3522, 3692, 4),\n" +
            "(7435, 'SIC', 3200, 2750, 3, 3201, 2752, 4),\n" +
            "(7436, 'SEC', 2795, 60, 1, 2652, 6022, 4),\n" +
            "(7437, 'SIC', 3299, 3190, 3, 3300, 3199, 4),\n" +
            "(7438, 'SIC', 3552, 3800, 2, 3556, 3821, 4),\n" +
            "(7439, 'SIC', 3631, 4230, 3, 3632, 4231, 4),\n" +
            "(7440, 'SIC', 3854, 5600, 2, 3858, 5621, 4),\n" +
            "(7441, 'NAICS', 1942, 71, 1, 1991, 713910, 5),\n" +
            "(7442, 'NAICS', 2103, 813, 2, 2107, 8132, 3),\n" +
            "(7443, 'SIC', 4081, 7500, 2, 4094, 7537, 4),\n" +
            "(7444, 'SIC', 3086, 2320, 3, 3087, 2321, 4),\n" +
            "(7445, 'SIC', 3214, 2800, 2, 3244, 2875, 4),\n" +
            "(7446, 'SEC', 2610, 5300, 2, 2614, 5331, 4),\n" +
            "(7447, 'NAICS', 952, 42333, 4, 951, 423330, 5),\n" +
            "(7448, 'SIC', 4308, 20, 1, 2990, 2023, 4),\n" +
            "(7449, 'NAICS', 2085, 8123, 3, 2092, 812332, 5),\n" +
            "(7450, 'SIC', 4308, 20, 1, 3102, 2353, 4),\n" +
            "(7451, 'SIC', 3371, 3400, 2, 3416, 3497, 4),\n" +
            "(7452, 'SIC', 3680, 4800, 2, 3681, 4810, 3),\n" +
            "(7453, 'NAICS', 1820, 6113, 3, 1822, 61131, 4),\n" +
            "(7454, 'SIC', 3261, 3000, 2, 3271, 3069, 4),\n" +
            "(7455, 'SIC', 3636, 4400, 2, 3650, 4491, 4),\n" +
            "(7456, 'SIC', 4311, 52, 1, 3849, 5561, 4),\n" +
            "(7457, 'SIC', 3917, 6000, 2, 3919, 6011, 4),\n" +
            "(7458, 'NAICS', 119, 11511, 4, 124, 115115, 5),\n" +
            "(7459, 'NAICS', 2113, 81331, 4, 2116, 813319, 5),\n" +
            "(7460, 'NAICS', 2188, 926, 2, 2196, 926140, 5),\n" +
            "(7461, 'SEC', 2795, 60, 1, 2673, 6220, 3),\n" +
            "(7462, 'SIC', 3948, 6200, 2, 3950, 6211, 4),\n" +
            "(7463, 'NAICS', 1725, 56, 1, 1783, 561790, 5),\n" +
            "(7464, 'SEC', 2792, 40, 1, 2547, 4833, 4),\n" +
            "(7465, 'SIC', 4314, 90, 1, 4293, 9650, 3),\n" +
            "(7466, 'SIC', 3667, 4700, 2, 3677, 4783, 4),\n" +
            "(7467, 'SIC', 4313, 70, 1, 4074, 7379, 4),\n" +
            "(7468, 'NAICS', 931, 423, 2, 1005, 423910, 5),\n" +
            "(7469, 'SIC', 4305, 1, 1, 2843, 273, 4),\n" +
            "(7470, 'SEC', 2659, 6100, 2, 4324, 6190, 3),\n" +
            "(7471, 'SIC', 3337, 3300, 2, 3362, 3360, 3),\n" +
            "(7472, 'NAICS', 1706, 5419, 3, 1717, 54199, 4),\n" +
            "(7473, 'SIC', 4125, 7900, 2, 4127, 7911, 4),\n" +
            "(7474, 'SEC', 2791, 20, 1, 2366, 3270, 3),\n" +
            "(7475, 'SEC', 2742, 7820, 3, 2744, 7829, 4),\n" +
            "(7476, 'NAICS', 1657, 5414, 3, 1664, 541490, 5),\n" +
            "(7477, 'SIC', 4313, 70, 1, 4070, 7375, 4),\n" +
            "(7478, 'SEC', 2459, 3710, 3, 2464, 3716, 4),\n" +
            "(7479, 'NAICS', 206, 236, 2, 217, 23622, 4),\n" +
            "(7480, 'NAICS', 1785, 5619, 3, 1791, 56199, 4),\n" +
            "(7481, 'NAICS', 2150, 922, 2, 2163, 92216, 4),\n" +
            "(7482, 'SIC', 3934, 6090, 3, 3935, 6091, 4),\n" +
            "(7483, 'SEC', 2795, 60, 1, 4327, 6770, 3),\n" +
            "(7484, 'SIC', 4313, 70, 1, 4230, 8730, 3),\n" +
            "(7485, 'SIC', 4100, 7600, 2, 4101, 7620, 3),\n" +
            "(7486, 'NAICS', 2052, 8112, 3, 2054, 811211, 5),\n" +
            "(7487, 'SIC', 3098, 2340, 3, 3100, 2342, 4),\n" +
            "(7488, 'SIC', 4308, 20, 1, 3502, 3647, 4),\n" +
            "(7489, 'SIC', 3854, 5600, 2, 3868, 5699, 4),\n" +
            "(7490, 'SIC', 4308, 20, 1, 3285, 3130, 3),\n" +
            "(7491, 'NAICS', 1, 11, 1, 56, 112, 2),\n" +
            "(7492, 'SIC', 3696, 4920, 3, 3697, 4922, 4),\n" +
            "(7493, 'NAICS', 930, 42, 1, 1078, 42491, 4),\n" +
            "(7494, 'SIC', 4314, 90, 1, 4262, 9223, 4),\n" +
            "(7495, 'NAICS', 181, 221, 2, 187, 221114, 5),\n" +
            "(7496, 'SEC', 2476, 3800, 2, 2481, 3822, 4),\n" +
            "(7497, 'NAICS', 219, 2371, 3, 225, 23713, 4),\n" +
            "(7498, 'NAICS', 2037, 81, 1, 2101, 812990, 5),\n" +
            "(7499, 'NAICS', 2071, 812, 2, 2090, 81233, 4),\n" +
            "(7500, 'NAICS', 2131, 814, 2, 2134, 81411, 4),\n" +
            "(7501, 'SIC', 4309, 40, 1, 3631, 4230, 3),\n" +
            "(7502, 'NAICS', 28, 11133, 4, 33, 111335, 5),\n" +
            "(7503, 'NAICS', 1766, 5616, 3, 1773, 561622, 5),\n" +
            "(7504, 'SEC', 2699, 6530, 3, 2700, 6531, 4),\n" +
            "(7505, 'SIC', 3301, 3200, 2, 3318, 3262, 4),\n" +
            "(7506, 'SIC', 3214, 2800, 2, 3243, 2874, 4),\n" +
            "(7507, 'NAICS', 132, 21, 1, 173, 2131, 3),\n" +
            "(7508, 'NAICS', 1480, 52, 1, 1505, 522298, 5),\n" +
            "(7509, 'SIC', 4268, 9400, 2, 4272, 9431, 4),\n" +
            "(7510, 'SIC', 4125, 7900, 2, 4140, 7991, 4),\n" +
            "(7511, 'SIC', 3774, 5140, 3, 3777, 5143, 4),\n" +
            "(7512, 'NAICS', 1726, 561, 2, 1751, 56144, 4),\n" +
            "(7513, 'NAICS', 1851, 621, 2, 1873, 62141, 4),\n" +
            "(7514, 'NAICS', 1985, 7132, 3, 1986, 713210, 5),\n" +
            "(7515, 'SIC', 4306, 10, 1, 2906, 1231, 4),\n" +
            "(7516, 'NAICS', 1689, 5418, 3, 1694, 541830, 5),\n" +
            "(7517, 'SIC', 2948, 1600, 2, 2952, 1622, 4),\n" +
            "(7518, 'SEC', 2630, 5700, 2, 2636, 5735, 4),\n" +
            "(7519, 'SEC', 2725, 7370, 3, 2730, 7377, 4),\n" +
            "(7520, 'SEC', 2791, 20, 1, 2460, 3711, 4),\n" +
            "(7521, 'SIC', 2955, 1700, 2, 2981, 1799, 4),\n" +
            "(7522, 'SEC', 2797, 90, 1, 2787, 9721, 4),\n" +
            "(7523, 'NAICS', 1015, 424, 2, 1047, 42446, 4),\n" +
            "(7524, 'SEC', 2458, 3700, 2, 2465, 3720, 3),\n" +
            "(7525, 'SIC', 4308, 20, 1, 3078, 2295, 4),\n" +
            "(7526, 'NAICS', 1402, 51, 1, 1448, 51512, 4),\n" +
            "(7527, 'NAICS', 1526, 5239, 3, 1532, 52393, 4),\n" +
            "(7528, 'SEC', 2677, 6300, 2, 2680, 6320, 3),\n" +
            "(7529, 'SIC', 4308, 20, 1, 3036, 2095, 4),\n" +
            "(7530, 'SIC', 4311, 52, 1, 3860, 5632, 4),\n" +
            "(7531, 'SIC', 4308, 20, 1, 3067, 2260, 3),\n" +
            "(7532, 'SIC', 3338, 3310, 3, 3340, 3313, 4),\n" +
            "(7533, 'NAICS', 205, 23, 1, 268, 23834, 4),\n" +
            "(7534, 'SEC', 2791, 20, 1, 2472, 3750, 3),\n" +
            "(7535, 'SIC', 3190, 2700, 2, 3192, 2711, 4),\n" +
            "(7536, 'SIC', 3934, 6090, 3, 3936, 6099, 4),\n" +
            "(7537, 'NAICS', 1480, 52, 1, 1517, 523120, 5),\n" +
            "(7538, 'SEC', 2568, 5000, 2, 2588, 5090, 3),\n" +
            "(7539, 'SIC', 3511, 3670, 3, 3517, 3677, 4),\n" +
            "(7540, 'NAICS', 138, 212, 2, 154, 212291, 5),\n" +
            "(7541, 'NAICS', 1621, 5331, 3, 1623, 53311, 4),\n" +
            "(7542, 'SEC', 2791, 20, 1, 2502, 3911, 4),\n" +
            "(7543, 'SEC', 2415, 3550, 3, 2416, 3555, 4),\n" +
            "(7544, 'NAICS', 2103, 813, 2, 2104, 8131, 3),\n" +
            "(7545, 'SIC', 4311, 52, 1, 3856, 5611, 4),\n" +
            "(7546, 'SEC', 2591, 5100, 2, 2597, 5141, 4),\n" +
            "(7547, 'SIC', 3948, 6200, 2, 3955, 6280, 3),\n" +
            "(7548, 'NAICS', 1569, 53, 1, 1620, 533, 2),\n" +
            "(7549, 'NAICS', 1631, 54119, 4, 1632, 541191, 5),\n" +
            "(7550, 'SIC', 4308, 20, 1, 3200, 2750, 3),\n" +
            "(7551, 'NAICS', 2005, 7211, 3, 2009, 72112, 4),\n" +
            "(7552, 'NAICS', 2052, 8112, 3, 2056, 811213, 5),\n" +
            "(7553, 'SIC', 3261, 3000, 2, 3269, 3060, 3),\n" +
            "(7554, 'SIC', 4306, 10, 1, 2887, 1020, 3),\n" +
            "(7555, 'SIC', 4308, 20, 1, 3042, 2110, 3),\n" +
            "(7556, 'SIC', 3552, 3800, 2, 3575, 3873, 4),\n" +
            "(7557, 'NAICS', 931, 423, 2, 987, 423730, 5),\n" +
            "(7558, 'NAICS', 1485, 522, 2, 1501, 522291, 5),\n" +
            "(7559, 'SIC', 3645, 4480, 3, 3647, 4482, 4),\n" +
            "(7560, 'NAICS', 2155, 92212, 4, 2154, 922120, 5),\n" +
            "(7561, 'NAICS', 1725, 56, 1, 1731, 561210, 5),\n" +
            "(7562, 'SIC', 4308, 20, 1, 3218, 2816, 4),\n" +
            "(7563, 'SIC', 2799, 110, 3, 2802, 115, 4),\n" +
            "(7564, 'NAICS', 1, 11, 1, 100, 113110, 5),\n" +
            "(7565, 'NAICS', 1719, 551, 2, 1720, 5511, 3),\n" +
            "(7566, 'SEC', 2791, 20, 1, 2381, 3357, 4),\n" +
            "(7567, 'SIC', 2918, 1400, 2, 2935, 1480, 3),\n" +
            "(7568, 'SIC', 3762, 5100, 2, 3784, 5150, 3),\n" +
            "(7569, 'NAICS', 1536, 524, 2, 1541, 52412, 4),\n" +
            "(7570, 'SIC', 3214, 2800, 2, 3240, 2869, 4),\n" +
            "(7571, 'SEC', 2796, 70, 1, 2715, 7311, 4),\n" +
            "(7572, 'SEC', 2791, 20, 1, 2268, 2253, 4),\n" +
            "(7573, 'SIC', 4310, 50, 1, 3796, 5182, 4),\n" +
            "(7574, 'SIC', 3715, 5000, 2, 3727, 5033, 4),\n" +
            "(7575, 'SIC', 2955, 1700, 2, 2975, 1790, 3),\n" +
            "(7576, 'SIC', 4311, 52, 1, 3877, 5730, 3),\n" +
            "(7577, 'SIC', 4308, 20, 1, 3277, 3085, 4),\n" +
            "(7578, 'SIC', 3649, 4490, 3, 3652, 4493, 4),\n" +
            "(7579, 'SIC', 3729, 5040, 3, 3734, 5047, 4),\n" +
            "(7580, 'NAICS', 117, 115, 2, 118, 1151, 3),\n" +
            "(7581, 'NAICS', 2112, 8133, 3, 2116, 813319, 5),\n" +
            "(7582, 'SIC', 4308, 20, 1, 3062, 2253, 4),\n" +
            "(7583, 'NAICS', 1921, 6241, 3, 1923, 62411, 4),\n" +
            "(7584, 'SIC', 2868, 800, 2, 2873, 850, 3),\n" +
            "(7585, 'SIC', 3086, 2320, 3, 3092, 2329, 4),\n" +
            "(7586, 'SIC', 4308, 20, 1, 3339, 3312, 4),\n" +
            "(7587, 'NAICS', 2072, 8121, 3, 2076, 812113, 5),\n" +
            "(7588, 'SIC', 3190, 2700, 2, 3200, 2750, 3),\n" +
            "(7589, 'NAICS', 138, 212, 2, 169, 212392, 5),\n" +
            "(7590, 'SIC', 4309, 40, 1, 3601, 4000, 2),\n" +
            "(7591, 'SIC', 4117, 7820, 3, 4118, 7822, 4),\n" +
            "(7592, 'NAICS', 56, 112, 2, 75, 112340, 5),\n" +
            "(7593, 'SIC', 4313, 70, 1, 4169, 8080, 3),\n" +
            "(7594, 'NAICS', 1850, 62, 1, 1876, 62149, 4),\n" +
            "(7595, 'SEC', 2613, 5330, 3, 2614, 5331, 4),\n" +
            "(7596, 'SEC', 2795, 60, 1, 2689, 6390, 3),\n" +
            "(7597, 'NAICS', 941, 4232, 3, 945, 42322, 4),\n" +
            "(7598, 'NAICS', 2135, 92, 1, 2206, 928110, 5),\n" +
            "(7599, 'NAICS', 2204, 928, 2, 2207, 92811, 4),\n" +
            "(7600, 'SEC', 2342, 3000, 2, 2352, 3089, 4),\n" +
            "(7601, 'NAICS', 1725, 56, 1, 1752, 561450, 5),\n" +
            "(7602, 'NAICS', 2071, 812, 2, 2098, 812922, 5),\n" +
            "(7603, 'SIC', 2798, 100, 2, 2823, 190, 3),\n" +
            "(7604, 'NAICS', 930, 42, 1, 1081, 424930, 5),\n" +
            "(7605, 'NAICS', 1851, 621, 2, 1877, 621491, 5),\n" +
            "(7606, 'SIC', 4308, 20, 1, 3192, 2711, 4),\n" +
            "(7607, 'SIC', 3301, 3200, 2, 3312, 3251, 4),\n" +
            "(7608, 'NAICS', 1, 11, 1, 104, 11321, 4),\n" +
            "(7609, 'SIC', 2925, 1440, 3, 2927, 1446, 4),\n" +
            "(7610, 'SIC', 4247, 9100, 2, 4252, 9130, 3),\n" +
            "(7611, 'SIC', 4307, 15, 1, 2945, 1540, 3),\n" +
            "(7612, 'SIC', 4308, 20, 1, 3373, 3411, 4),\n" +
            "(7613, 'SIC', 4313, 70, 1, 4132, 7933, 4),\n" +
            "(7614, 'NAICS', 1526, 5239, 3, 1531, 523930, 5),\n" +
            "(7615, 'SIC', 4153, 8040, 3, 4155, 8042, 4),\n" +
            "(7616, 'NAICS', 1850, 62, 1, 1911, 623220, 5),\n" +
            "(7617, 'SEC', 2791, 20, 1, 2488, 3840, 3),\n" +
            "(7618, 'SEC', 2791, 20, 1, 2508, 3949, 4),\n" +
            "(7619, 'NAICS', 930, 42, 1, 956, 423410, 5),\n" +
            "(7620, 'NAICS', 2189, 9261, 3, 2193, 92612, 4),\n" +
            "(7621, 'SIC', 3020, 2070, 3, 3022, 2075, 4),\n" +
            "(7622, 'SEC', 2527, 4510, 3, 2528, 4512, 4),\n" +
            "(7623, 'SIC', 3214, 2800, 2, 3223, 2823, 4),\n" +
            "(7624, 'NAICS', 1657, 5414, 3, 1661, 54142, 4),\n" +
            "(7625, 'SIC', 4302, 9900, 2, 4304, 9999, 4),\n" +
            "(7626, 'SIC', 4139, 7990, 3, 4143, 7996, 4),\n" +
            "(7627, 'NAICS', 3, 1111, 3, 4, 111110, 5),\n" +
            "(7628, 'SEC', 2794, 52, 1, 2635, 5734, 4),\n" +
            "(7629, 'SIC', 4308, 20, 1, 3170, 2620, 3),\n" +
            "(7630, 'NAICS', 2071, 812, 2, 2075, 812112, 5),\n" +
            "(7631, 'SIC', 3749, 5080, 3, 3753, 5085, 4),\n" +
            "(7632, 'SIC', 4284, 9600, 2, 4287, 9620, 3),\n" +
            "(7633, 'SIC', 3907, 5980, 3, 3910, 5989, 4),\n" +
            "(7634, 'NAICS', 930, 42, 1, 1001, 42385, 4),\n" +
            "(7635, 'SIC', 3854, 5600, 2, 3860, 5632, 4),\n" +
            "(7636, 'SIC', 4308, 20, 1, 3085, 2311, 4),\n" +
            "(7637, 'NAICS', 132, 21, 1, 150, 21223, 4),\n" +
            "(7638, 'SEC', 2539, 4800, 2, 2545, 4830, 3),\n" +
            "(7639, 'SIC', 4309, 40, 1, 3624, 4214, 4),\n" +
            "(7640, 'SIC', 3993, 6710, 3, 3994, 6712, 4),\n" +
            "(7641, 'NAICS', 1536, 524, 2, 1546, 52413, 4),\n" +
            "(7642, 'SIC', 2982, 2000, 2, 3025, 2079, 4),\n" +
            "(7643, 'NAICS', 1706, 5419, 3, 1710, 541921, 5),\n" +
            "(7644, 'NAICS', 2040, 81111, 4, 2042, 811112, 5),\n" +
            "(7645, 'NAICS', 173, 2131, 3, 179, 213115, 5),\n" +
            "(7646, 'SEC', 2552, 4900, 2, 2553, 4910, 3),\n" +
            "(7647, 'NAICS', 1850, 62, 1, 1926, 624190, 5),\n" +
            "(7648, 'SEC', 2795, 60, 1, 2683, 6330, 3),\n" +
            "(7649, 'SIC', 4308, 20, 1, 3171, 2621, 4),\n" +
            "(7650, 'NAICS', 2071, 812, 2, 2074, 812111, 5),\n" +
            "(7651, 'SIC', 2875, 900, 2, 2883, 971, 4),\n" +
            "(7652, 'NAICS', 183, 22111, 4, 190, 221117, 5),\n" +
            "(7653, 'SIC', 3854, 5600, 2, 3856, 5611, 4),\n" +
            "(7654, 'SIC', 2850, 720, 3, 2851, 721, 4),\n" +
            "(7655, 'NAICS', 1942, 71, 1, 1945, 711110, 5),\n" +
            "(7656, 'SIC', 4313, 70, 1, 4058, 7350, 3),\n" +
            "(7657, 'NAICS', 235, 238, 2, 265, 238330, 5),\n" +
            "(7658, 'NAICS', 1575, 53112, 4, 1574, 531120, 5),\n" +
            "(7659, 'NAICS', 56, 112, 2, 95, 11293, 4),\n" +
            "(7660, 'NAICS', 2135, 92, 1, 2199, 92615, 4),\n" +
            "(7661, 'NAICS', 205, 23, 1, 238, 23811, 4),\n" +
            "(7662, 'NAICS', 1625, 541, 2, 1649, 541350, 5),\n" +
            "(7663, 'NAICS', 1726, 561, 2, 1737, 561320, 5),\n" +
            "(7664, 'SEC', 2539, 4800, 2, 2548, 4840, 3),\n" +
            "(7665, 'SIC', 4311, 52, 1, 3884, 5812, 4),\n" +
            "(7666, 'SIC', 4307, 15, 1, 2944, 1531, 4),\n" +
            "(7667, 'SIC', 3301, 3200, 2, 3311, 3250, 3),\n" +
            "(7668, 'SIC', 3869, 5700, 2, 3873, 5714, 4),\n" +
            "(7669, 'SIC', 4125, 7900, 2, 4141, 7992, 4),\n" +
            "(7670, 'SIC', 3301, 3200, 2, 3310, 3241, 4),\n" +
            "(7671, 'NAICS', 1420, 5121, 3, 1427, 512132, 5),\n" +
            "(7672, 'NAICS', 1536, 524, 2, 1542, 524126, 5),\n" +
            "(7673, 'SEC', 2789, 10, 1, 2228, 1400, 2),\n" +
            "(7674, 'SIC', 4311, 52, 1, 3868, 5699, 4),\n" +
            "(7675, 'SEC', 2731, 7380, 3, 2734, 7389, 4),\n" +
            "(7676, 'NAICS', 1402, 51, 1, 1435, 51222, 4),\n" +
            "(7677, 'SIC', 4308, 20, 1, 3155, 2519, 4),\n" +
            "(7678, 'NAICS', 1726, 561, 2, 1765, 561599, 5),\n" +
            "(7679, 'SIC', 3480, 3600, 2, 3508, 3661, 4),\n" +
            "(7680, 'NAICS', 1780, 56173, 4, 1779, 561730, 5),\n" +
            "(7681, 'NAICS', 1425, 51213, 4, 1426, 512131, 5),\n" +
            "(7682, 'SIC', 4308, 20, 1, 3120, 2395, 4),\n" +
            "(7683, 'SIC', 4308, 20, 1, 2989, 2022, 4),\n" +
            "(7684, 'SIC', 4100, 7600, 2, 4108, 7641, 4),\n" +
            "(7685, 'NAICS', 2038, 811, 2, 2061, 8114, 3),\n" +
            "(7686, 'SIC', 3190, 2700, 2, 3201, 2752, 4),\n" +
            "(7687, 'SEC', 2559, 4930, 3, 2560, 4931, 4),\n" +
            "(7688, 'SIC', 3161, 2540, 3, 3162, 2541, 4),\n" +
            "(7689, 'SIC', 4308, 20, 1, 3471, 3585, 4),\n" +
            "(7690, 'SIC', 4308, 20, 1, 3340, 3313, 4),\n" +
            "(7691, 'NAICS', 1470, 519, 2, 1471, 5191, 3),\n" +
            "(7692, 'SIC', 4305, 1, 1, 2845, 290, 3),\n" +
            "(7693, 'SIC', 2840, 270, 3, 2843, 273, 4),\n" +
            "(7694, 'SEC', 2792, 40, 1, 2554, 4911, 4),\n" +
            "(7695, 'NAICS', 1624, 54, 1, 1691, 54181, 4),\n" +
            "(7696, 'SEC', 2640, 5900, 2, 2645, 5945, 4),\n" +
            "(7697, 'SIC', 4308, 20, 1, 3072, 2273, 4),\n" +
            "(7698, 'SIC', 4308, 20, 1, 3517, 3677, 4),\n" +
            "(7699, 'SEC', 2342, 3000, 2, 2346, 3021, 4),\n" +
            "(7700, 'NAICS', 1741, 5614, 3, 1757, 561499, 5),\n" +
            "(7701, 'SEC', 2791, 20, 1, 2477, 3810, 3),\n" +
            "(7702, 'NAICS', 2, 111, 2, 15, 11116, 4),\n" +
            "(7703, 'NAICS', 1015, 424, 2, 1052, 424490, 5),\n" +
            "(7704, 'SIC', 4223, 8700, 2, 4238, 8743, 4),\n" +
            "(7705, 'NAICS', 1536, 524, 2, 1551, 524291, 5),\n" +
            "(7706, 'SIC', 3689, 4840, 3, 3690, 4841, 4),\n" +
            "(7707, 'NAICS', 156, 2123, 3, 171, 212399, 5),\n" +
            "(7708, 'NAICS', 138, 212, 2, 156, 2123, 3),\n" +
            "(7709, 'NAICS', 1625, 541, 2, 1694, 541830, 5),\n" +
            "(7710, 'SIC', 4305, 1, 1, 2880, 920, 3),\n" +
            "(7711, 'NAICS', 1642, 54131, 4, 1641, 541310, 5),\n" +
            "(7712, 'SIC', 3715, 5000, 2, 3736, 5049, 4),\n" +
            "(7713, 'NAICS', 1858, 62121, 4, 1857, 621210, 5),\n" +
            "(7714, 'NAICS', 2135, 92, 1, 2148, 921190, 5),\n" +
            "(7715, 'SIC', 4247, 9100, 2, 4251, 9121, 4),\n" +
            "(7716, 'SIC', 4308, 20, 1, 3117, 2392, 4),\n" +
            "(7717, 'SIC', 3338, 3310, 3, 3339, 3312, 4),\n" +
            "(7718, 'SIC', 4308, 20, 1, 3103, 2360, 3),\n" +
            "(7719, 'SIC', 4308, 20, 1, 3364, 3364, 4),\n" +
            "(7720, 'SIC', 4040, 7300, 2, 4079, 7384, 4),\n" +
            "(7721, 'SIC', 4297, 9700, 2, 4301, 9721, 4),\n" +
            "(7722, 'NAICS', 1625, 541, 2, 1642, 54131, 4),\n" +
            "(7723, 'SEC', 2659, 6100, 2, 2665, 6153, 4),\n" +
            "(7724, 'SIC', 4305, 1, 1, 2841, 271, 4),\n" +
            "(7725, 'NAICS', 1625, 541, 2, 1652, 54136, 4),\n" +
            "(7726, 'SIC', 3050, 2200, 2, 3073, 2280, 3),\n" +
            "(7727, 'SIC', 4308, 20, 1, 3556, 3821, 4),\n" +
            "(7728, 'NAICS', 1480, 52, 1, 1491, 522130, 5),\n" +
            "(7729, 'SEC', 2795, 60, 1, 2697, 6513, 4),\n" +
            "(7730, 'SIC', 4308, 20, 1, 3400, 3469, 4),\n" +
            "(7731, 'SIC', 3246, 2890, 3, 3250, 2895, 4),\n" +
            "(7732, 'SEC', 2276, 2400, 2, 2279, 2430, 3),\n" +
            "(7733, 'NAICS', 1624, 54, 1, 1673, 54161, 4),\n" +
            "(7734, 'NAICS', 1, 11, 1, 96, 112990, 5),\n" +
            "(7735, 'SIC', 4305, 1, 1, 2809, 134, 4),\n" +
            "(7736, 'NAICS', 2167, 9231, 3, 2171, 92312, 4),\n" +
            "(7737, 'NAICS', 1404, 5111, 3, 1412, 51114, 4),\n" +
            "(7738, 'SIC', 4309, 40, 1, 3630, 4226, 4),\n" +
            "(7739, 'NAICS', 2, 111, 2, 47, 11192, 4),\n" +
            "(7740, 'SIC', 4308, 20, 1, 3273, 3081, 4),\n" +
            "(7741, 'SIC', 4193, 8320, 3, 4194, 8322, 4),\n" +
            "(7742, 'NAICS', 2004, 721, 2, 2015, 721211, 5),\n" +
            "(7743, 'NAICS', 970, 4235, 3, 974, 42352, 4),\n" +
            "(7744, 'SEC', 2796, 70, 1, 2759, 8062, 4),\n" +
            "(7745, 'SIC', 4312, 60, 1, 3925, 6030, 3),\n" +
            "(7746, 'SIC', 4313, 70, 1, 4100, 7600, 2),\n" +
            "(7747, 'NAICS', 180, 22, 1, 182, 2211, 3),\n" +
            "(7748, 'NAICS', 930, 42, 1, 980, 423690, 5),\n" +
            "(7749, 'SEC', 2458, 3700, 2, 2475, 3790, 3),\n" +
            "(7750, 'SIC', 3636, 4400, 2, 3643, 4440, 3),\n" +
            "(7751, 'NAICS', 1486, 5221, 3, 1492, 52213, 4),\n" +
            "(7752, 'NAICS', 181, 221, 2, 200, 22131, 4),\n" +
            "(7753, 'SIC', 4041, 7310, 3, 4042, 7311, 4),\n" +
            "(7754, 'NAICS', 1688, 54172, 4, 1687, 541720, 5),\n" +
            "(7755, 'SIC', 2943, 1530, 3, 2944, 1531, 4),\n" +
            "(7756, 'SIC', 3794, 5180, 3, 3796, 5182, 4),\n" +
            "(7757, 'SIC', 4241, 8800, 2, 4243, 8811, 4),\n" +
            "(7758, 'NAICS', 1944, 7111, 3, 1952, 71119, 4),\n" +
            "(7759, 'NAICS', 162, 21232, 4, 163, 212321, 5),\n" +
            "(7760, 'SEC', 2794, 52, 1, 2610, 5300, 2),\n" +
            "(7761, 'SEC', 2796, 70, 1, 2773, 8600, 2),\n" +
            "(7762, 'SIC', 3050, 2200, 2, 3055, 2230, 3),\n" +
            "(7763, 'NAICS', 1942, 71, 1, 1985, 7132, 3),\n" +
            "(7764, 'SEC', 2791, 20, 1, 2478, 3812, 4),\n" +
            "(7765, 'SIC', 4308, 20, 1, 3201, 2752, 4),\n" +
            "(7766, 'SIC', 4247, 9100, 2, 4254, 9190, 3),\n" +
            "(7767, 'SIC', 4312, 60, 1, 3973, 6399, 4),\n" +
            "(7768, 'SEC', 2694, 6500, 2, 2696, 6512, 4),\n" +
            "(7769, 'SIC', 4307, 15, 1, 2976, 1791, 4),\n" +
            "(7770, 'SIC', 3804, 5200, 2, 3806, 5211, 4),\n" +
            "(7771, 'NAICS', 1887, 62161, 4, 1886, 621610, 5),\n" +
            "(7772, 'SIC', 3050, 2200, 2, 3052, 2211, 4),\n" +
            "(7773, 'SIC', 3587, 3950, 3, 3591, 3955, 4),\n" +
            "(7774, 'SIC', 4311, 52, 1, 3889, 5920, 3),\n" +
            "(7775, 'NAICS', 56, 112, 2, 92, 112920, 5),\n" +
            "(7776, 'SIC', 4113, 7800, 2, 4122, 7833, 4),\n" +
            "(7777, 'SIC', 3931, 6080, 3, 3933, 6082, 4),\n" +
            "(7778, 'NAICS', 1920, 624, 2, 1939, 6244, 3),\n" +
            "(7779, 'SIC', 3526, 3700, 2, 3548, 3790, 3),\n" +
            "(7780, 'NAICS', 1, 11, 1, 108, 114, 2),\n" +
            "(7781, 'NAICS', 1672, 5416, 3, 1676, 541613, 5),\n" +
            "(7782, 'NAICS', 108, 114, 2, 113, 114119, 5),\n" +
            "(7783, 'SEC', 2738, 7800, 2, 2740, 7812, 4),\n" +
            "(7784, 'NAICS', 1442, 515, 2, 1443, 5151, 3),\n" +
            "(7785, 'NAICS', 117, 115, 2, 127, 115210, 5),\n" +
            "(7786, 'NAICS', 1850, 62, 1, 1864, 621330, 5),\n" +
            "(7787, 'SEC', 2793, 50, 1, 2575, 5045, 4),\n" +
            "(7788, 'SIC', 4308, 20, 1, 3301, 3200, 2),\n" +
            "(7789, 'NAICS', 1012, 42394, 4, 1011, 423940, 5),\n" +
            "(7790, 'SIC', 4201, 8390, 3, 4202, 8399, 4),\n" +
            "(7791, 'SEC', 2791, 20, 1, 2440, 3630, 3),\n" +
            "(7792, 'SIC', 3526, 3700, 2, 3543, 3751, 4),\n" +
            "(7793, 'SIC', 4310, 50, 1, 3739, 5052, 4),\n" +
            "(7794, 'SIC', 3958, 6300, 2, 3963, 6324, 4),\n" +
            "(7795, 'SIC', 3252, 2900, 2, 3253, 2910, 3),\n" +
            "(7796, 'SIC', 4313, 70, 1, 4190, 8290, 3);\n";
    static String industryCodeInsert26 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(7797, 'SIC', 3667, 4700, 2, 3674, 4740, 3),\n" +
            "(7798, 'NAICS', 2135, 92, 1, 2149, 92119, 4),\n" +
            "(7799, 'SIC', 3886, 5900, 2, 3896, 5943, 4),\n" +
            "(7800, 'SIC', 2834, 250, 3, 2836, 252, 4),\n" +
            "(7801, 'SIC', 4308, 20, 1, 3196, 2731, 4),\n" +
            "(7802, 'NAICS', 205, 23, 1, 255, 23821, 4),\n" +
            "(7803, 'NAICS', 1726, 561, 2, 1785, 5619, 3),\n" +
            "(7804, 'SIC', 4308, 20, 1, 3209, 2782, 4),\n" +
            "(7805, 'SIC', 4313, 70, 1, 4033, 7250, 3),\n" +
            "(7806, 'NAICS', 1569, 53, 1, 1590, 53139, 4),\n" +
            "(7807, 'NAICS', 1842, 61163, 4, 1841, 611630, 5),\n" +
            "(7808, 'SIC', 3480, 3600, 2, 3490, 3631, 4),\n" +
            "(7809, 'SIC', 4305, 1, 1, 2876, 910, 3),\n" +
            "(7810, 'SIC', 3893, 5940, 3, 3901, 5948, 4),\n" +
            "(7811, 'SIC', 4308, 20, 1, 3594, 3965, 4),\n" +
            "(7812, 'NAICS', 1625, 541, 2, 1660, 541420, 5),\n" +
            "(7813, 'SIC', 4305, 1, 1, 2875, 900, 2),\n" +
            "(7814, 'SIC', 2909, 1300, 2, 2917, 1389, 4),\n" +
            "(7815, 'NAICS', 133, 211, 2, 136, 211111, 5),\n" +
            "(7816, 'NAICS', 2, 111, 2, 12, 111150, 5),\n" +
            "(7817, 'SIC', 4308, 20, 1, 3454, 3563, 4),\n" +
            "(7818, 'SIC', 2921, 1420, 3, 2923, 1423, 4),\n" +
            "(7819, 'SIC', 3180, 2670, 3, 3182, 2672, 4),\n" +
            "(7820, 'SIC', 2918, 1400, 2, 2919, 1410, 3),\n" +
            "(7821, 'NAICS', 1625, 541, 2, 1638, 541214, 5),\n" +
            "(7822, 'SEC', 2371, 3300, 2, 2372, 3310, 3),\n" +
            "(7823, 'SIC', 3371, 3400, 2, 3398, 3465, 4),\n" +
            "(7824, 'NAICS', 1850, 62, 1, 1863, 62132, 4),\n" +
            "(7825, 'NAICS', 930, 42, 1, 1048, 424470, 5),\n" +
            "(7826, 'NAICS', 1569, 53, 1, 1618, 532490, 5),\n" +
            "(7827, 'SIC', 3480, 3600, 2, 3511, 3670, 3),\n" +
            "(7828, 'SIC', 3362, 3360, 3, 3365, 3365, 4),\n" +
            "(7829, 'SIC', 4310, 50, 1, 3776, 5142, 4),\n" +
            "(7830, 'SIC', 4081, 7500, 2, 4082, 7510, 3),\n" +
            "(7831, 'SIC', 4308, 20, 1, 3232, 2842, 4),\n" +
            "(7832, 'NAICS', 1624, 54, 1, 1657, 5414, 3),\n" +
            "(7833, 'NAICS', 2150, 922, 2, 2160, 922150, 5),\n" +
            "(7834, 'SIC', 3380, 3430, 3, 3382, 3432, 4),\n" +
            "(7835, 'NAICS', 205, 23, 1, 228, 23721, 4),\n" +
            "(7836, 'NAICS', 1480, 52, 1, 1495, 5222, 3),\n" +
            "(7837, 'SIC', 3715, 5000, 2, 3743, 5065, 4),\n" +
            "(7838, 'NAICS', 56, 112, 2, 81, 11241, 4),\n" +
            "(7839, 'SIC', 3190, 2700, 2, 3209, 2782, 4),\n" +
            "(7840, 'NAICS', 1481, 521, 2, 1484, 52111, 4),\n" +
            "(7841, 'NAICS', 1570, 531, 2, 1578, 531190, 5),\n" +
            "(7842, 'NAICS', 1850, 62, 1, 1879, 621493, 5),\n" +
            "(7843, 'NAICS', 1851, 621, 2, 1865, 62133, 4),\n" +
            "(7844, 'SIC', 3190, 2700, 2, 3196, 2731, 4),\n" +
            "(7845, 'SEC', 2790, 15, 1, 2237, 1700, 2),\n" +
            "(7846, 'SIC', 3480, 3600, 2, 3503, 3648, 4),\n" +
            "(7847, 'SIC', 4311, 52, 1, 3898, 5945, 4),\n" +
            "(7848, 'NAICS', 1541, 52412, 4, 1543, 524127, 5),\n" +
            "(7849, 'SEC', 2498, 3870, 3, 2499, 3873, 4),\n" +
            "(7850, 'NAICS', 1725, 56, 1, 1787, 56191, 4),\n" +
            "(7851, 'SIC', 3917, 6000, 2, 3918, 6010, 3),\n" +
            "(7852, 'SIC', 4308, 20, 1, 2988, 2021, 4),\n" +
            "(7853, 'SIC', 3301, 3200, 2, 3326, 3274, 4),\n" +
            "(7854, 'NAICS', 1570, 531, 2, 1571, 5311, 3),\n" +
            "(7855, 'SEC', 2792, 40, 1, 2550, 4890, 3),\n" +
            "(7856, 'SIC', 3272, 3080, 3, 3274, 3082, 4),\n" +
            "(7857, 'SIC', 4309, 40, 1, 3619, 4173, 4),\n" +
            "(7858, 'SIC', 4035, 7260, 3, 4036, 7261, 4),\n" +
            "(7859, 'SIC', 2798, 100, 2, 2814, 171, 4),\n" +
            "(7860, 'NAICS', 1035, 4244, 3, 1043, 42444, 4),\n" +
            "(7861, 'NAICS', 2031, 7225, 3, 2034, 722513, 5),\n" +
            "(7862, 'SIC', 3526, 3700, 2, 3527, 3710, 3),\n" +
            "(7863, 'SEC', 2458, 3700, 2, 2463, 3715, 4),\n" +
            "(7864, 'SIC', 4308, 20, 1, 3581, 3930, 3),\n" +
            "(7865, 'NAICS', 138, 212, 2, 171, 212399, 5),\n" +
            "(7866, 'NAICS', 1763, 56159, 4, 1764, 561591, 5),\n" +
            "(7867, 'SIC', 3507, 3660, 3, 3509, 3663, 4),\n" +
            "(7868, 'SIC', 4310, 50, 1, 3729, 5040, 3),\n" +
            "(7869, 'NAICS', 1, 11, 1, 93, 11292, 4),\n" +
            "(7870, 'NAICS', 1570, 531, 2, 1587, 531320, 5),\n" +
            "(7871, 'NAICS', 2020, 722, 2, 2029, 722410, 5),\n" +
            "(7872, 'NAICS', 1894, 622, 2, 1901, 6223, 3),\n" +
            "(7873, 'NAICS', 2159, 92214, 4, 2158, 922140, 5),\n" +
            "(7874, 'NAICS', 2053, 81121, 4, 2055, 811212, 5),\n" +
            "(7875, 'NAICS', 1026, 4243, 3, 1028, 42431, 4),\n" +
            "(7876, 'NAICS', 1661, 54142, 4, 1660, 541420, 5),\n" +
            "(7877, 'SEC', 2418, 3560, 3, 2422, 3567, 4),\n" +
            "(7878, 'NAICS', 1569, 53, 1, 1612, 5324, 3),\n" +
            "(7879, 'SIC', 3636, 4400, 2, 3642, 4432, 4),\n" +
            "(7880, 'NAICS', 1624, 54, 1, 1626, 5411, 3),\n" +
            "(7881, 'SIC', 3555, 3820, 3, 3561, 3826, 4),\n" +
            "(7882, 'SIC', 3409, 3490, 3, 3414, 3495, 4),\n" +
            "(7883, 'NAICS', 1850, 62, 1, 1935, 62423, 4),\n" +
            "(7884, 'SIC', 4312, 60, 1, 3995, 6719, 4),\n" +
            "(7885, 'SIC', 4178, 8200, 2, 4187, 8243, 4),\n" +
            "(7886, 'NAICS', 1625, 541, 2, 1646, 54133, 4),\n" +
            "(7887, 'NAICS', 955, 4234, 3, 960, 423430, 5),\n" +
            "(7888, 'NAICS', 1402, 51, 1, 1465, 517919, 5),\n" +
            "(7889, 'SIC', 3663, 4610, 3, 3665, 4613, 4),\n" +
            "(7890, 'SIC', 4313, 70, 1, 4188, 8244, 4),\n" +
            "(7891, 'NAICS', 3, 1111, 3, 14, 111160, 5),\n" +
            "(7892, 'SIC', 3419, 3500, 2, 3477, 3594, 4),\n" +
            "(7893, 'NAICS', 1990, 7139, 3, 1992, 71391, 4),\n" +
            "(7894, 'SIC', 4308, 20, 1, 3226, 2833, 4),\n" +
            "(7895, 'NAICS', 1919, 62399, 4, 1918, 623990, 5),\n" +
            "(7896, 'NAICS', 1943, 711, 2, 1956, 711212, 5),\n" +
            "(7897, 'NAICS', 1089, 425, 2, 1091, 425110, 5),\n" +
            "(7898, 'SIC', 4308, 20, 1, 3507, 3660, 3),\n" +
            "(7899, 'SEC', 2791, 20, 1, 2443, 3650, 3),\n" +
            "(7900, 'SIC', 4081, 7500, 2, 4096, 7539, 4),\n" +
            "(7901, 'NAICS', 1080, 42492, 4, 1079, 424920, 5),\n" +
            "(7902, 'NAICS', 1726, 561, 2, 1786, 561910, 5),\n" +
            "(7903, 'SEC', 2418, 3560, 3, 2419, 3561, 4),\n" +
            "(7904, 'NAICS', 1554, 525, 2, 1567, 525990, 5),\n" +
            "(7905, 'NAICS', 2136, 921, 2, 2139, 92111, 4),\n" +
            "(7906, 'SIC', 3576, 3900, 2, 3584, 3942, 4),\n" +
            "(7907, 'NAICS', 1536, 524, 2, 1553, 524298, 5),\n" +
            "(7908, 'SIC', 2826, 210, 3, 2829, 213, 4),\n" +
            "(7909, 'SIC', 4308, 20, 1, 3124, 2400, 2),\n" +
            "(7910, 'SIC', 2982, 2000, 2, 3006, 2047, 4),\n" +
            "(7911, 'SIC', 4310, 50, 1, 3782, 5148, 4),\n" +
            "(7912, 'NAICS', 1853, 62111, 4, 1854, 621111, 5),\n" +
            "(7913, 'SIC', 4308, 20, 1, 3282, 3100, 2),\n" +
            "(7914, 'NAICS', 930, 42, 1, 1023, 4242, 3),\n" +
            "(7915, 'SEC', 2319, 2800, 2, 2321, 2820, 3),\n" +
            "(7916, 'SIC', 2982, 2000, 2, 3013, 2061, 4),\n" +
            "(7917, 'SEC', 2608, 5270, 3, 2609, 5271, 4),\n" +
            "(7918, 'SEC', 2319, 2800, 2, 2332, 2851, 4),\n" +
            "(7919, 'SIC', 4305, 1, 1, 2857, 742, 4),\n" +
            "(7920, 'SEC', 2792, 40, 1, 2515, 4013, 4),\n" +
            "(7921, 'SIC', 3419, 3500, 2, 3429, 3533, 4),\n" +
            "(7922, 'NAICS', 109, 1141, 3, 111, 114111, 5),\n" +
            "(7923, 'SIC', 3444, 3550, 3, 3446, 3553, 4),\n" +
            "(7924, 'NAICS', 1792, 562, 2, 1794, 56211, 4),\n" +
            "(7925, 'SIC', 3626, 4220, 3, 3628, 4222, 4),\n" +
            "(7926, 'NAICS', 1402, 51, 1, 1428, 51219, 4),\n" +
            "(7927, 'NAICS', 156, 2123, 3, 169, 212392, 5),\n" +
            "(7928, 'SIC', 4305, 1, 1, 2865, 781, 4),\n" +
            "(7929, 'NAICS', 19, 1112, 3, 22, 111219, 5),\n" +
            "(7930, 'NAICS', 932, 4231, 3, 936, 42312, 4),\n" +
            "(7931, 'SEC', 2235, 1620, 3, 2236, 1623, 4),\n" +
            "(7932, 'SIC', 3461, 3570, 3, 3467, 3579, 4),\n" +
            "(7933, 'SIC', 3958, 6300, 2, 3970, 6370, 3),\n" +
            "(7934, 'NAICS', 16, 11119, 4, 18, 111199, 5),\n" +
            "(7935, 'SEC', 2434, 3600, 2, 2443, 3650, 3),\n" +
            "(7936, 'SIC', 3958, 6300, 2, 3969, 6361, 4),\n" +
            "(7937, 'NAICS', 2031, 7225, 3, 2035, 722514, 5),\n" +
            "(7938, 'SIC', 3214, 2800, 2, 3216, 2812, 4),\n" +
            "(7939, 'SIC', 3371, 3400, 2, 3392, 3450, 3),\n" +
            "(7940, 'SIC', 4308, 20, 1, 3436, 3542, 4),\n" +
            "(7941, 'SIC', 2847, 700, 2, 2855, 740, 3),\n" +
            "(7942, 'NAICS', 931, 423, 2, 1000, 423850, 5),\n" +
            "(7943, 'SIC', 3033, 2090, 3, 3037, 2096, 4),\n" +
            "(7944, 'NAICS', 1437, 51223, 4, 1436, 512230, 5),\n" +
            "(7945, 'NAICS', 2071, 812, 2, 2078, 812191, 5),\n" +
            "(7946, 'SIC', 3977, 6500, 2, 3984, 6519, 4),\n" +
            "(7947, 'NAICS', 2071, 812, 2, 2082, 81221, 4),\n" +
            "(7948, 'SIC', 3693, 4900, 2, 3703, 4932, 4),\n" +
            "(7949, 'NAICS', 1480, 52, 1, 1527, 523910, 5),\n" +
            "(7950, 'NAICS', 1569, 53, 1, 1601, 532220, 5),\n" +
            "(7951, 'NAICS', 180, 22, 1, 186, 221113, 5),\n" +
            "(7952, 'NAICS', 930, 42, 1, 965, 42345, 4),\n" +
            "(7953, 'NAICS', 930, 42, 1, 1087, 424990, 5),\n" +
            "(7954, 'SEC', 2791, 20, 1, 2471, 3743, 4),\n" +
            "(7955, 'NAICS', 955, 4234, 3, 959, 42342, 4),\n" +
            "(7956, 'NAICS', 1444, 51511, 4, 1446, 515112, 5),\n" +
            "(7957, 'SIC', 4308, 20, 1, 2983, 2010, 3),\n" +
            "(7958, 'NAICS', 98, 113, 2, 106, 113310, 5),\n" +
            "(7959, 'SIC', 3774, 5140, 3, 3775, 5141, 4),\n" +
            "(7960, 'SEC', 2794, 52, 1, 2608, 5270, 3),\n" +
            "(7961, 'NAICS', 1725, 56, 1, 1763, 56159, 4),\n" +
            "(7962, 'SIC', 2798, 100, 2, 2802, 115, 4),\n" +
            "(7963, 'NAICS', 132, 21, 1, 155, 212299, 5),\n" +
            "(7964, 'SEC', 2795, 60, 1, 2660, 6110, 3),\n" +
            "(7965, 'NAICS', 2188, 926, 2, 2197, 92614, 4),\n" +
            "(7966, 'SEC', 2633, 5730, 3, 2635, 5734, 4),\n" +
            "(7967, 'SIC', 4308, 20, 1, 3132, 2431, 4),\n" +
            "(7968, 'SIC', 4040, 7300, 2, 4071, 7376, 4),\n" +
            "(7969, 'NAICS', 1, 11, 1, 46, 111920, 5),\n" +
            "(7970, 'SIC', 4313, 70, 1, 4202, 8399, 4),\n" +
            "(7971, 'SEC', 2791, 20, 1, 2493, 3845, 4),\n" +
            "(7972, 'SIC', 4308, 20, 1, 3118, 2393, 4),\n" +
            "(7973, 'NAICS', 89, 1129, 3, 92, 112920, 5),\n" +
            "(7974, 'NAICS', 1054, 4245, 3, 1056, 42451, 4),\n" +
            "(7975, 'NAICS', 1492, 52213, 4, 1491, 522130, 5),\n" +
            "(7976, 'SIC', 3230, 2840, 3, 3234, 2844, 4),\n" +
            "(7977, 'SIC', 4310, 50, 1, 3715, 5000, 2),\n" +
            "(7978, 'SIC', 3797, 5190, 3, 3800, 5193, 4),\n" +
            "(7979, 'NAICS', 1480, 52, 1, 1490, 52212, 4),\n" +
            "(7980, 'NAICS', 1691, 54181, 4, 1690, 541810, 5),\n" +
            "(7981, 'SIC', 3190, 2700, 2, 3193, 2720, 3),\n" +
            "(7982, 'NAICS', 85, 11251, 4, 88, 112519, 5),\n" +
            "(7983, 'SIC', 3948, 6200, 2, 3956, 6282, 4),\n" +
            "(7984, 'SIC', 3073, 2280, 3, 3075, 2282, 4),\n" +
            "(7985, 'SIC', 4309, 40, 1, 3681, 4810, 3),\n" +
            "(7986, 'SIC', 4075, 7380, 3, 4079, 7384, 4),\n" +
            "(7987, 'NAICS', 930, 42, 1, 1074, 424820, 5),\n" +
            "(7988, 'SIC', 4308, 20, 1, 3393, 3451, 4),\n" +
            "(7989, 'SIC', 3211, 2790, 3, 3213, 2796, 4),\n" +
            "(7990, 'NAICS', 1480, 52, 1, 1512, 52239, 4),\n" +
            "(7991, 'NAICS', 1, 11, 1, 73, 112330, 5),\n" +
            "(7992, 'SIC', 4305, 1, 1, 2810, 139, 4),\n" +
            "(7993, 'NAICS', 1850, 62, 1, 1901, 6223, 3),\n" +
            "(7994, 'SIC', 3869, 5700, 2, 3880, 5735, 4),\n" +
            "(7995, 'SIC', 4306, 10, 1, 2905, 1230, 3),\n" +
            "(7996, 'NAICS', 89, 1129, 3, 95, 11293, 4),\n" +
            "(7997, 'SIC', 4305, 1, 1, 2867, 783, 4),\n" +
            "(7998, 'SIC', 3680, 4800, 2, 3683, 4813, 4),\n" +
            "(7999, 'SIC', 3715, 5000, 2, 3748, 5078, 4),\n" +
            "(8000, 'NAICS', 1, 11, 1, 101, 11311, 4),\n" +
            "(8001, 'SIC', 4313, 70, 1, 4143, 7996, 4),\n" +
            "(8002, 'NAICS', 1812, 61, 1, 1823, 6114, 3),\n" +
            "(8003, 'SIC', 3480, 3600, 2, 3525, 3699, 4),\n" +
            "(8004, 'SIC', 3426, 3530, 3, 3430, 3534, 4),\n" +
            "(8005, 'NAICS', 991, 4238, 3, 1001, 42385, 4),\n" +
            "(8006, 'NAICS', 1514, 5231, 3, 1520, 52313, 4),\n" +
            "(8007, 'NAICS', 2071, 812, 2, 2079, 812199, 5),\n" +
            "(8008, 'SEC', 2356, 3210, 3, 2357, 3211, 4),\n" +
            "(8009, 'NAICS', 1812, 61, 1, 1837, 611610, 5),\n" +
            "(8010, 'NAICS', 180, 22, 1, 193, 221121, 5),\n" +
            "(8011, 'NAICS', 2, 111, 2, 31, 111333, 5),\n" +
            "(8012, 'SEC', 2793, 50, 1, 2569, 5010, 3),\n" +
            "(8013, 'SIC', 3955, 6280, 3, 3956, 6282, 4),\n" +
            "(8014, 'NAICS', 218, 237, 2, 229, 2373, 3),\n" +
            "(8015, 'NAICS', 1726, 561, 2, 1788, 561920, 5),\n" +
            "(8016, 'NAICS', 1813, 611, 2, 1847, 6117, 3),\n" +
            "(8017, 'SIC', 4149, 8020, 3, 4150, 8021, 4),\n" +
            "(8018, 'SEC', 2240, 2000, 2, 2247, 2030, 3),\n" +
            "(8019, 'NAICS', 1966, 7115, 3, 1967, 711510, 5),\n" +
            "(8020, 'NAICS', 1625, 541, 2, 1684, 54171, 4),\n" +
            "(8021, 'SIC', 3077, 2290, 3, 3081, 2298, 4),\n" +
            "(8022, 'SEC', 2659, 6100, 2, 2669, 6163, 4),\n" +
            "(8023, 'SIC', 2902, 1220, 3, 2903, 1221, 4),\n" +
            "(8024, 'NAICS', 1813, 611, 2, 1829, 61143, 4),\n" +
            "(8025, 'SIC', 4311, 52, 1, 3916, 5999, 4),\n" +
            "(8026, 'SEC', 2791, 20, 1, 2331, 2850, 3),\n" +
            "(8027, 'SIC', 3282, 3100, 2, 3290, 3144, 4),\n" +
            "(8028, 'SIC', 4113, 7800, 2, 4117, 7820, 3),\n" +
            "(8029, 'NAICS', 205, 23, 1, 256, 238220, 5),\n" +
            "(8030, 'SIC', 3337, 3300, 2, 3360, 3356, 4),\n" +
            "(8031, 'SIC', 3044, 2120, 3, 3045, 2121, 4),\n" +
            "(8032, 'SIC', 3762, 5100, 2, 3794, 5180, 3),\n" +
            "(8033, 'NAICS', 1695, 54183, 4, 1694, 541830, 5),\n" +
            "(8034, 'NAICS', 2037, 81, 1, 2076, 812113, 5),\n" +
            "(8035, 'NAICS', 1442, 515, 2, 1445, 515111, 5),\n" +
            "(8036, 'NAICS', 1588, 53132, 4, 1587, 531320, 5),\n" +
            "(8037, 'SEC', 2790, 15, 1, 2236, 1623, 4),\n" +
            "(8038, 'SEC', 2791, 20, 1, 2484, 3825, 4),\n" +
            "(8039, 'SEC', 2368, 3280, 3, 2369, 3281, 4),\n" +
            "(8040, 'SIC', 3124, 2400, 2, 3145, 2491, 4),\n" +
            "(8041, 'NAICS', 1, 11, 1, 119, 11511, 4),\n" +
            "(8042, 'NAICS', 213, 2362, 3, 215, 23621, 4),\n" +
            "(8043, 'NAICS', 2004, 721, 2, 2009, 72112, 4),\n" +
            "(8044, 'SIC', 2858, 750, 3, 2859, 751, 4),\n" +
            "(8045, 'NAICS', 260, 2383, 3, 272, 23839, 4),\n" +
            "(8046, 'NAICS', 1943, 711, 2, 1965, 71141, 4),\n" +
            "(8047, 'SIC', 3000, 2040, 3, 3004, 2045, 4),\n" +
            "(8048, 'NAICS', 974, 42352, 4, 973, 423520, 5),\n" +
            "(8049, 'SEC', 2434, 3600, 2, 2440, 3630, 3),\n" +
            "(8050, 'SIC', 3978, 6510, 3, 3979, 6512, 4),\n" +
            "(8051, 'NAICS', 205, 23, 1, 250, 23817, 4),\n" +
            "(8052, 'SIC', 3050, 2200, 2, 3074, 2281, 4),\n" +
            "(8053, 'SIC', 4306, 10, 1, 2915, 1381, 4),\n" +
            "(8054, 'SIC', 4305, 1, 1, 2878, 913, 4),\n" +
            "(8055, 'NAICS', 198, 2213, 3, 200, 22131, 4),\n" +
            "(8056, 'NAICS', 1733, 5613, 3, 1737, 561320, 5),\n" +
            "(8057, 'SIC', 4308, 20, 1, 3193, 2720, 3),\n" +
            "(8058, 'SEC', 2793, 50, 1, 2578, 5051, 4),\n" +
            "(8059, 'NAICS', 1701, 54186, 4, 1700, 541860, 5),\n" +
            "(8060, 'SEC', 2240, 2000, 2, 2254, 2080, 3),\n" +
            "(8061, 'SEC', 2793, 50, 1, 2596, 5140, 3),\n" +
            "(8062, 'NAICS', 1624, 54, 1, 1644, 54132, 4),\n" +
            "(8063, 'SIC', 3103, 2360, 3, 3105, 2369, 4),\n" +
            "(8064, 'SIC', 4310, 50, 1, 3793, 5172, 4),\n" +
            "(8065, 'SEC', 2796, 70, 1, 2748, 7900, 2),\n" +
            "(8066, 'SEC', 2796, 70, 1, 2710, 7010, 3),\n" +
            "(8067, 'NAICS', 1888, 6219, 3, 1890, 62191, 4),\n" +
            "(8068, 'NAICS', 56, 112, 2, 67, 11221, 4),\n" +
            "(8069, 'NAICS', 955, 4234, 3, 967, 42346, 4),\n" +
            "(8070, 'NAICS', 205, 23, 1, 216, 236220, 5),\n" +
            "(8071, 'SIC', 2955, 1700, 2, 2962, 1740, 3),\n" +
            "(8072, 'SIC', 4007, 7000, 2, 4016, 7041, 4),\n" +
            "(8073, 'SIC', 2884, 1000, 2, 2889, 1030, 3),\n" +
            "(8074, 'SIC', 3261, 3000, 2, 3266, 3050, 3),\n" +
            "(8075, 'NAICS', 235, 238, 2, 270, 23835, 4),\n" +
            "(8076, 'SIC', 4308, 20, 1, 3157, 2521, 4),\n" +
            "(8077, 'NAICS', 181, 221, 2, 195, 2212, 3),\n" +
            "(8078, 'NAICS', 2151, 9221, 3, 2164, 922190, 5),\n" +
            "(8079, 'NAICS', 1486, 5221, 3, 1494, 52219, 4),\n" +
            "(8080, 'SIC', 4308, 20, 1, 3541, 3743, 4),\n" +
            "(8081, 'SIC', 3148, 2500, 2, 3158, 2522, 4),\n" +
            "(8082, 'SIC', 3419, 3500, 2, 3433, 3537, 4),\n" +
            "(8083, 'SIC', 4313, 70, 1, 4124, 7841, 4),\n" +
            "(8084, 'SIC', 3977, 6500, 2, 3980, 6513, 4),\n" +
            "(8085, 'SEC', 4336, 99, 1, 4338, 8888, 2),\n" +
            "(8086, 'SIC', 3282, 3100, 2, 3285, 3130, 3),\n" +
            "(8087, 'SEC', 2791, 20, 1, 2483, 3824, 4),\n" +
            "(8088, 'SEC', 2795, 60, 1, 2655, 6035, 4),\n" +
            "(8089, 'SEC', 2659, 6100, 2, 2663, 6141, 4),\n" +
            "(8090, 'SIC', 4100, 7600, 2, 4111, 7694, 4),\n" +
            "(8091, 'NAICS', 1721, 55111, 4, 1723, 551112, 5),\n" +
            "(8092, 'NAICS', 1726, 561, 2, 1775, 561710, 5),\n" +
            "(8093, 'NAICS', 930, 42, 1, 1014, 42399, 4),\n" +
            "(8094, 'SEC', 2792, 40, 1, 2527, 4510, 3),\n" +
            "(8095, 'SEC', 2793, 50, 1, 2601, 5171, 4),\n" +
            "(8096, 'SIC', 3083, 2300, 2, 3110, 2384, 4),\n" +
            "(8097, 'NAICS', 1943, 711, 2, 1962, 71132, 4),\n" +
            "(8098, 'SIC', 4313, 70, 1, 4022, 7215, 4),\n" +
            "(8099, 'SIC', 4307, 15, 1, 2957, 1711, 4),\n" +
            "(8100, 'NAICS', 1851, 621, 2, 1889, 621910, 5),\n" +
            "(8101, 'NAICS', 1850, 62, 1, 1893, 621999, 5),\n" +
            "(8102, 'SEC', 2791, 20, 1, 2327, 2836, 4),\n" +
            "(8103, 'SIC', 3083, 2300, 2, 3112, 2386, 4),\n" +
            "(8104, 'NAICS', 1520, 52313, 4, 1519, 523130, 5),\n" +
            "(8105, 'SEC', 2505, 3940, 3, 2507, 3944, 4),\n" +
            "(8106, 'SEC', 2791, 20, 1, 2358, 3220, 3),\n" +
            "(8107, 'NAICS', 132, 21, 1, 154, 212291, 5),\n" +
            "(8108, 'NAICS', 205, 23, 1, 209, 236115, 5),\n" +
            "(8109, 'NAICS', 2093, 8129, 3, 2102, 81299, 4),\n" +
            "(8110, 'SEC', 2403, 3500, 2, 2418, 3560, 3),\n" +
            "(8111, 'SIC', 4311, 52, 1, 3814, 5271, 4),\n" +
            "(8112, 'SIC', 4308, 20, 1, 3475, 3592, 4),\n" +
            "(8113, 'SIC', 4313, 70, 1, 4140, 7991, 4),\n" +
            "(8114, 'NAICS', 1963, 7114, 3, 1964, 711410, 5),\n" +
            "(8115, 'SEC', 2472, 3750, 3, 2473, 3751, 4),\n" +
            "(8116, 'NAICS', 1514, 5231, 3, 1515, 523110, 5),\n" +
            "(8117, 'SIC', 3794, 5180, 3, 3795, 5181, 4),\n" +
            "(8118, 'NAICS', 1061, 4246, 3, 1062, 424610, 5),\n" +
            "(8119, 'NAICS', 1813, 611, 2, 1836, 6116, 3),\n" +
            "(8120, 'NAICS', 1851, 621, 2, 1858, 62121, 4),\n" +
            "(8121, 'SIC', 4065, 7370, 3, 4071, 7376, 4),\n" +
            "(8122, 'NAICS', 1667, 54151, 4, 1670, 541513, 5),\n" +
            "(8123, 'NAICS', 205, 23, 1, 277, 23899, 4),\n" +
            "(8124, 'SEC', 2796, 70, 1, 2763, 8082, 4),\n" +
            "(8125, 'NAICS', 1, 11, 1, 85, 11251, 4),\n" +
            "(8126, 'NAICS', 1480, 52, 1, 1506, 5223, 3),\n" +
            "(8127, 'NAICS', 1725, 56, 1, 1761, 561520, 5),\n" +
            "(8128, 'NAICS', 2020, 722, 2, 2036, 722515, 5),\n" +
            "(8129, 'SIC', 4308, 20, 1, 3342, 3316, 4),\n" +
            "(8130, 'NAICS', 1402, 51, 1, 1469, 51821, 4),\n" +
            "(8131, 'NAICS', 1683, 5417, 3, 1687, 541720, 5),\n" +
            "(8132, 'NAICS', 2167, 9231, 3, 2173, 92313, 4),\n" +
            "(8133, 'NAICS', 932, 4231, 3, 933, 423110, 5),\n" +
            "(8134, 'NAICS', 1799, 56221, 4, 1801, 562212, 5),\n" +
            "(8135, 'NAICS', 1726, 561, 2, 1762, 56152, 4),\n" +
            "(8136, 'SIC', 4308, 20, 1, 3070, 2269, 4),\n" +
            "(8137, 'SIC', 4313, 70, 1, 4194, 8322, 4),\n" +
            "(8138, 'SEC', 2796, 70, 1, 2722, 7360, 3),\n" +
            "(8139, 'NAICS', 1419, 512, 2, 1441, 51229, 4),\n" +
            "(8140, 'NAICS', 68, 1123, 3, 74, 11233, 4),\n" +
            "(8141, 'NAICS', 181, 221, 2, 197, 22121, 4),\n" +
            "(8142, 'SEC', 2791, 20, 1, 2489, 3841, 4),\n" +
            "(8143, 'SIC', 4314, 90, 1, 4299, 9711, 4),\n" +
            "(8144, 'SIC', 4306, 10, 1, 2926, 1442, 4),\n" +
            "(8145, 'NAICS', 2037, 81, 1, 2116, 813319, 5),\n" +
            "(8146, 'SEC', 2796, 70, 1, 2770, 8300, 2),\n" +
            "(8147, 'SIC', 3552, 3800, 2, 3563, 3829, 4),\n" +
            "(8148, 'SIC', 4308, 20, 1, 3553, 3810, 3),\n" +
            "(8149, 'NAICS', 132, 21, 1, 169, 212392, 5),\n" +
            "(8150, 'NAICS', 1466, 518, 2, 1469, 51821, 4),\n" +
            "(8151, 'NAICS', 1705, 54189, 4, 1704, 541890, 5),\n" +
            "(8152, 'SIC', 4146, 8000, 2, 4172, 8092, 4),\n" +
            "(8153, 'SEC', 2796, 70, 1, 2751, 7990, 3),\n" +
            "(8154, 'NAICS', 56, 112, 2, 58, 11211, 4),\n" +
            "(8155, 'NAICS', 2135, 92, 1, 2147, 92115, 4),\n" +
            "(8156, 'SIC', 3127, 2420, 3, 3128, 2421, 4),\n" +
            "(8157, 'NAICS', 1812, 61, 1, 1844, 611691, 5),\n" +
            "(8158, 'NAICS', 1813, 611, 2, 1835, 611519, 5),\n" +
            "(8159, 'SIC', 4308, 20, 1, 3589, 3952, 4),\n" +
            "(8160, 'SIC', 4308, 20, 1, 3463, 3572, 4),\n" +
            "(8161, 'NAICS', 1673, 54161, 4, 1676, 541613, 5),\n" +
            "(8162, 'SEC', 2791, 20, 1, 2509, 3950, 3),\n" +
            "(8163, 'SIC', 4125, 7900, 2, 4132, 7933, 4),\n" +
            "(8164, 'SIC', 4308, 20, 1, 3450, 3559, 4),\n" +
            "(8165, 'NAICS', 930, 42, 1, 1052, 424490, 5),\n" +
            "(8166, 'NAICS', 1719, 551, 2, 1724, 551114, 5),\n" +
            "(8167, 'SEC', 2319, 2800, 2, 2335, 2890, 3),\n" +
            "(8168, 'NAICS', 205, 23, 1, 226, 2372, 3),\n" +
            "(8169, 'NAICS', 1908, 6232, 3, 1911, 623220, 5),\n" +
            "(8170, 'NAICS', 2073, 81211, 4, 2075, 812112, 5),\n" +
            "(8171, 'SIC', 3966, 6350, 3, 3967, 6351, 4),\n" +
            "(8172, 'NAICS', 1071, 4248, 3, 1073, 42481, 4),\n" +
            "(8173, 'SIC', 3576, 3900, 2, 3599, 3996, 4),\n" +
            "(8174, 'SIC', 3368, 3390, 3, 3369, 3398, 4),\n" +
            "(8175, 'NAICS', 1624, 54, 1, 1632, 541191, 5),\n" +
            "(8176, 'NAICS', 1480, 52, 1, 1533, 52399, 4),\n" +
            "(8177, 'NAICS', 1942, 71, 1, 1946, 71111, 4),\n" +
            "(8178, 'SEC', 2795, 60, 1, 2664, 6150, 3),\n" +
            "(8179, 'SIC', 3362, 3360, 3, 3366, 3366, 4),\n" +
            "(8180, 'SIC', 3489, 3630, 3, 3490, 3631, 4),\n" +
            "(8181, 'NAICS', 1403, 511, 2, 1418, 51121, 4),\n" +
            "(8182, 'NAICS', 235, 238, 2, 261, 238310, 5),\n" +
            "(8183, 'SIC', 4309, 40, 1, 3709, 4953, 4),\n" +
            "(8184, 'SEC', 2384, 3400, 2, 2388, 3420, 3),\n" +
            "(8185, 'NAICS', 1, 11, 1, 34, 111336, 5),\n" +
            "(8186, 'SEC', 2450, 3670, 3, 2451, 3672, 4),\n" +
            "(8187, 'NAICS', 1624, 54, 1, 1647, 541340, 5),\n" +
            "(8188, 'NAICS', 1851, 621, 2, 1871, 6214, 3),\n" +
            "(8189, 'SIC', 4313, 70, 1, 4009, 7011, 4),\n" +
            "(8190, 'SIC', 2832, 240, 3, 2833, 241, 4),\n" +
            "(8191, 'SEC', 2371, 3300, 2, 2376, 3330, 3),\n" +
            "(8192, 'NAICS', 1625, 541, 2, 1677, 541614, 5),\n" +
            "(8193, 'SIC', 4117, 7820, 3, 4119, 7829, 4),\n" +
            "(8194, 'NAICS', 1831, 61151, 4, 1832, 611511, 5),\n" +
            "(8195, 'NAICS', 2071, 812, 2, 2084, 81222, 4),\n" +
            "(8196, 'NAICS', 1, 11, 1, 18, 111199, 5),\n" +
            "(8197, 'NAICS', 260, 2383, 3, 262, 23831, 4),\n" +
            "(8198, 'NAICS', 2, 111, 2, 25, 11131, 4),\n" +
            "(8199, 'NAICS', 1092, 42511, 4, 1091, 425110, 5),\n" +
            "(8200, 'SEC', 2349, 3080, 3, 2351, 3086, 4),\n" +
            "(8201, 'SEC', 2795, 60, 1, 2651, 6021, 4),\n" +
            "(8202, 'SIC', 2884, 1000, 2, 2899, 1094, 4),\n" +
            "(8203, 'SIC', 3033, 2090, 3, 3040, 2099, 4),\n" +
            "(8204, 'SIC', 2921, 1420, 3, 2922, 1422, 4),\n" +
            "(8205, 'SIC', 4308, 20, 1, 3478, 3596, 4),\n" +
            "(8206, 'SIC', 4162, 8060, 3, 4164, 8063, 4),\n" +
            "(8207, 'SIC', 4297, 9700, 2, 4298, 9710, 3),\n" +
            "(8208, 'NAICS', 2037, 81, 1, 2061, 8114, 3),\n" +
            "(8209, 'NAICS', 2039, 8111, 3, 2051, 811198, 5),\n" +
            "(8210, 'NAICS', 2135, 92, 1, 2187, 92512, 4),\n" +
            "(8211, 'NAICS', 982, 4237, 3, 985, 423720, 5),\n" +
            "(8212, 'NAICS', 1015, 424, 2, 1081, 424930, 5),\n" +
            "(8213, 'SIC', 4308, 20, 1, 3402, 3471, 4),\n" +
            "(8214, 'NAICS', 56, 112, 2, 80, 112410, 5),\n" +
            "(8215, 'SIC', 4313, 70, 1, 4024, 7217, 4),\n" +
            "(8216, 'SIC', 4309, 40, 1, 3692, 4899, 4),\n" +
            "(8217, 'SEC', 2796, 70, 1, 2782, 8742, 4),\n" +
            "(8218, 'SEC', 2323, 2830, 3, 2326, 2835, 4),\n" +
            "(8219, 'NAICS', 1526, 5239, 3, 1530, 52392, 4),\n" +
            "(8220, 'SIC', 4285, 9610, 3, 4286, 9611, 4),\n" +
            "(8221, 'NAICS', 1451, 51521, 4, 1450, 515210, 5),\n" +
            "(8222, 'NAICS', 2188, 926, 2, 2194, 926130, 5),\n" +
            "(8223, 'SIC', 3261, 3000, 2, 3274, 3082, 4),\n" +
            "(8224, 'SEC', 2435, 3610, 3, 2436, 3612, 4),\n" +
            "(8225, 'SIC', 4308, 20, 1, 3326, 3274, 4),\n" +
            "(8226, 'NAICS', 2071, 812, 2, 2092, 812332, 5),\n" +
            "(8227, 'NAICS', 132, 21, 1, 156, 2123, 3),\n" +
            "(8228, 'SIC', 3167, 2600, 2, 3178, 2656, 4),\n" +
            "(8229, 'SIC', 4310, 50, 1, 3795, 5181, 4),\n" +
            "(8230, 'NAICS', 1076, 4249, 3, 1079, 424920, 5),\n" +
            "(8231, 'NAICS', 1851, 621, 2, 1874, 621420, 5),\n" +
            "(8232, 'NAICS', 1813, 611, 2, 1848, 611710, 5),\n" +
            "(8233, 'SIC', 3083, 2300, 2, 3091, 2326, 4),\n" +
            "(8234, 'NAICS', 84, 1125, 3, 87, 112512, 5),\n" +
            "(8235, 'NAICS', 1814, 6111, 3, 1815, 611110, 5),\n" +
            "(8236, 'NAICS', 1500, 52229, 4, 1502, 522292, 5),\n" +
            "(8237, 'SIC', 4311, 52, 1, 3822, 5400, 2),\n" +
            "(8238, 'NAICS', 1625, 541, 2, 1713, 54193, 4),\n" +
            "(8239, 'SEC', 2792, 40, 1, 2535, 4610, 3),\n" +
            "(8240, 'SEC', 2630, 5700, 2, 2631, 5710, 3),\n" +
            "(8241, 'NAICS', 138, 212, 2, 150, 21223, 4),\n" +
            "(8242, 'SIC', 4313, 70, 1, 4141, 7992, 4),\n" +
            "(8243, 'NAICS', 1741, 5614, 3, 1744, 56142, 4),\n" +
            "(8244, 'SIC', 4313, 70, 1, 4103, 7623, 4),\n" +
            "(8245, 'NAICS', 36, 1114, 3, 39, 111419, 5),\n" +
            "(8246, 'NAICS', 930, 42, 1, 983, 423710, 5),\n" +
            "(8247, 'SIC', 3337, 3300, 2, 3353, 3340, 3),\n" +
            "(8248, 'SIC', 4223, 8700, 2, 4234, 8734, 4),\n" +
            "(8249, 'SIC', 4313, 70, 1, 4225, 8711, 4),\n" +
            "(8250, 'NAICS', 2073, 81211, 4, 2074, 812111, 5),\n" +
            "(8251, 'SIC', 4308, 20, 1, 3262, 3010, 3),\n" +
            "(8252, 'NAICS', 2093, 8129, 3, 2094, 812910, 5),\n" +
            "(8253, 'SIC', 4308, 20, 1, 3533, 3720, 3),\n" +
            "(8254, 'SIC', 4313, 70, 1, 4026, 7219, 4),\n" +
            "(8255, 'SIC', 3338, 3310, 3, 3342, 3316, 4),\n" +
            "(8256, 'SEC', 2791, 20, 1, 2244, 2015, 4),\n" +
            "(8257, 'SEC', 2791, 20, 1, 2418, 3560, 3),\n" +
            "(8258, 'SIC', 4312, 60, 1, 3931, 6080, 3),\n" +
            "(8259, 'SEC', 2646, 5960, 3, 2647, 5961, 4),\n" +
            "(8260, 'SIC', 2798, 100, 2, 2813, 170, 3),\n" +
            "(8261, 'NAICS', 206, 236, 2, 207, 2361, 3),\n" +
            "(8262, 'NAICS', 235, 238, 2, 253, 2382, 3),\n" +
            "(8263, 'SIC', 4146, 8000, 2, 4154, 8041, 4),\n" +
            "(8264, 'NAICS', 1, 11, 1, 66, 112210, 5),\n" +
            "(8265, 'SIC', 3917, 6000, 2, 3922, 6021, 4),\n" +
            "(8266, 'SIC', 3115, 2390, 3, 3121, 2396, 4),\n" +
            "(8267, 'SIC', 4313, 70, 1, 4199, 8360, 3),\n" +
            "(8268, 'NAICS', 1026, 4243, 3, 1027, 424310, 5),\n" +
            "(8269, 'SIC', 3822, 5400, 2, 3826, 5421, 4),\n" +
            "(8270, 'SEC', 2384, 3400, 2, 2398, 3452, 4),\n" +
            "(8271, 'SEC', 2623, 5600, 2, 2626, 5650, 3),\n" +
            "(8272, 'SEC', 2695, 6510, 3, 2696, 6512, 4),\n" +
            "(8273, 'NAICS', 28, 11133, 4, 32, 111334, 5),\n" +
            "(8274, 'NAICS', 205, 23, 1, 230, 237310, 5),\n" +
            "(8275, 'NAICS', 2037, 81, 1, 2121, 813910, 5),\n" +
            "(8276, 'NAICS', 1, 11, 1, 52, 11199, 4),\n" +
            "(8277, 'NAICS', 930, 42, 1, 1047, 42446, 4),\n" +
            "(8278, 'SIC', 4313, 70, 1, 4069, 7374, 4),\n" +
            "(8279, 'SIC', 4307, 15, 1, 2947, 1542, 4),\n" +
            "(8280, 'SIC', 3564, 3840, 3, 3567, 3843, 4),\n" +
            "(8281, 'NAICS', 1624, 54, 1, 1698, 541850, 5),\n" +
            "(8282, 'SIC', 4313, 70, 1, 4116, 7819, 4),\n" +
            "(8283, 'SEC', 2754, 8010, 3, 2755, 8011, 4),\n" +
            "(8284, 'SIC', 4308, 20, 1, 3452, 3561, 4),\n" +
            "(8285, 'SIC', 4308, 20, 1, 3254, 2911, 4),\n" +
            "(8286, 'SEC', 2307, 2730, 3, 2308, 2731, 4),\n" +
            "(8287, 'SIC', 4206, 8420, 3, 4207, 8422, 4),\n" +
            "(8288, 'SIC', 4219, 8660, 3, 4220, 8661, 4),\n" +
            "(8289, 'NAICS', 2037, 81, 1, 2112, 8133, 3),\n" +
            "(8290, 'SIC', 4305, 1, 1, 2820, 180, 3),\n" +
            "(8291, 'NAICS', 1591, 532, 2, 1593, 53211, 4),\n" +
            "(8292, 'SEC', 2791, 20, 1, 2264, 2211, 4),\n" +
            "(8293, 'SEC', 2637, 5800, 2, 2639, 5812, 4),\n" +
            "(8294, 'NAICS', 2107, 8132, 3, 2108, 81321, 4),\n" +
            "(8295, 'SEC', 2503, 3930, 3, 2504, 3931, 4);\n";
    static String industryCodeInsert27 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(8296, 'NAICS', 1402, 51, 1, 1460, 517410, 5),\n" +
            "(8297, 'SIC', 4248, 9110, 3, 4249, 9111, 4),\n" +
            "(8298, 'NAICS', 1890, 62191, 4, 1889, 621910, 5),\n" +
            "(8299, 'NAICS', 2085, 8123, 3, 2086, 812310, 5),\n" +
            "(8300, 'SEC', 2624, 5620, 3, 2625, 5621, 4),\n" +
            "(8301, 'NAICS', 23, 1113, 3, 34, 111336, 5),\n" +
            "(8302, 'SEC', 2321, 2820, 3, 2322, 2821, 4),\n" +
            "(8303, 'NAICS', 1850, 62, 1, 1875, 62142, 4),\n" +
            "(8304, 'NAICS', 56, 112, 2, 94, 112930, 5),\n" +
            "(8305, 'NAICS', 1726, 561, 2, 1773, 561622, 5),\n" +
            "(8306, 'NAICS', 1836, 6116, 3, 1841, 611630, 5),\n" +
            "(8307, 'SIC', 3694, 4910, 3, 3695, 4911, 4),\n" +
            "(8308, 'SIC', 3595, 3990, 3, 3599, 3996, 4),\n" +
            "(8309, 'NAICS', 2150, 922, 2, 2161, 92215, 4),\n" +
            "(8310, 'NAICS', 1625, 541, 2, 1670, 541513, 5),\n" +
            "(8311, 'SIC', 4307, 15, 1, 2973, 1780, 3),\n" +
            "(8312, 'SIC', 3605, 4100, 2, 3610, 4121, 4),\n" +
            "(8313, 'SIC', 3715, 5000, 2, 3717, 5012, 4),\n" +
            "(8314, 'NAICS', 932, 4231, 3, 934, 42311, 4),\n" +
            "(8315, 'SIC', 2939, 1500, 2, 2941, 1521, 4),\n" +
            "(8316, 'SIC', 2868, 800, 2, 2870, 811, 4),\n" +
            "(8317, 'SIC', 4308, 20, 1, 3434, 3540, 3),\n" +
            "(8318, 'SIC', 3337, 3300, 2, 3347, 3324, 4),\n" +
            "(8319, 'SIC', 4311, 52, 1, 3897, 5944, 4),\n" +
            "(8320, 'SIC', 3371, 3400, 2, 3405, 3482, 4),\n" +
            "(8321, 'SIC', 3214, 2800, 2, 3248, 2892, 4),\n" +
            "(8322, 'SIC', 3083, 2300, 2, 3089, 2323, 4),\n" +
            "(8323, 'SIC', 3198, 2740, 3, 3199, 2741, 4),\n" +
            "(8324, 'NAICS', 132, 21, 1, 138, 212, 2),\n" +
            "(8325, 'SEC', 2764, 8090, 3, 2765, 8093, 4),\n" +
            "(8326, 'SIC', 3605, 4100, 2, 3607, 4111, 4),\n" +
            "(8327, 'SIC', 3822, 5400, 2, 3832, 5451, 4),\n" +
            "(8328, 'SIC', 4312, 60, 1, 3956, 6282, 4),\n" +
            "(8329, 'NAICS', 931, 423, 2, 979, 42362, 4),\n" +
            "(8330, 'NAICS', 1480, 52, 1, 1489, 522120, 5),\n" +
            "(8331, 'NAICS', 181, 221, 2, 204, 22133, 4),\n" +
            "(8332, 'NAICS', 2136, 921, 2, 2144, 921140, 5),\n" +
            "(8333, 'SEC', 2795, 60, 1, 2682, 6324, 4),\n" +
            "(8334, 'SEC', 2384, 3400, 2, 2401, 3480, 3),\n" +
            "(8335, 'NAICS', 1, 11, 1, 39, 111419, 5),\n" +
            "(8336, 'SEC', 2793, 50, 1, 2568, 5000, 2),\n" +
            "(8337, 'NAICS', 931, 423, 2, 958, 423420, 5),\n" +
            "(8338, 'NAICS', 1931, 62422, 4, 1932, 624221, 5),\n" +
            "(8339, 'SIC', 4309, 40, 1, 3602, 4010, 3),\n" +
            "(8340, 'NAICS', 1015, 424, 2, 1078, 42491, 4),\n" +
            "(8341, 'NAICS', 1536, 524, 2, 1543, 524127, 5),\n" +
            "(8342, 'SIC', 3715, 5000, 2, 3742, 5064, 4),\n" +
            "(8343, 'SIC', 3083, 2300, 2, 3109, 2381, 4),\n" +
            "(8344, 'SEC', 2338, 2910, 3, 2339, 2911, 4),\n" +
            "(8345, 'NAICS', 147, 21222, 4, 148, 212221, 5),\n" +
            "(8346, 'NAICS', 1076, 4249, 3, 1082, 42493, 4),\n" +
            "(8347, 'SEC', 2623, 5600, 2, 2624, 5620, 3),\n" +
            "(8348, 'SEC', 2794, 52, 1, 2612, 5311, 4),\n" +
            "(8349, 'SIC', 4308, 20, 1, 3509, 3663, 4),\n" +
            "(8350, 'NAICS', 2080, 8122, 3, 2081, 812210, 5),\n" +
            "(8351, 'SIC', 3977, 6500, 2, 3988, 6541, 4),\n" +
            "(8352, 'NAICS', 131, 11531, 4, 130, 115310, 5),\n" +
            "(8353, 'SIC', 3958, 6300, 2, 3960, 6311, 4),\n" +
            "(8354, 'SIC', 3371, 3400, 2, 3374, 3412, 4),\n" +
            "(8355, 'SIC', 4308, 20, 1, 3351, 3334, 4),\n" +
            "(8356, 'NAICS', 13, 11115, 4, 12, 111150, 5),\n" +
            "(8357, 'SEC', 2791, 20, 1, 2419, 3561, 4),\n" +
            "(8358, 'SEC', 2766, 8100, 2, 2768, 8111, 4),\n" +
            "(8359, 'SIC', 4314, 90, 1, 4247, 9100, 2),\n" +
            "(8360, 'SIC', 3050, 2200, 2, 3053, 2220, 3),\n" +
            "(8361, 'SIC', 3867, 5690, 3, 3868, 5699, 4),\n" +
            "(8362, 'NAICS', 2037, 81, 1, 2122, 81391, 4),\n" +
            "(8363, 'SIC', 3484, 3620, 3, 3485, 3621, 4),\n" +
            "(8364, 'SIC', 3804, 5200, 2, 3811, 5260, 3),\n" +
            "(8365, 'SIC', 3961, 6320, 3, 3962, 6321, 4),\n" +
            "(8366, 'SIC', 4313, 70, 1, 4076, 7381, 4),\n" +
            "(8367, 'NAICS', 84, 1125, 3, 86, 112511, 5),\n" +
            "(8368, 'NAICS', 1569, 53, 1, 1595, 532112, 5),\n" +
            "(8369, 'NAICS', 1449, 5152, 3, 1450, 515210, 5),\n" +
            "(8370, 'NAICS', 1541, 52412, 4, 1542, 524126, 5),\n" +
            "(8371, 'NAICS', 1719, 551, 2, 1722, 551111, 5),\n" +
            "(8372, 'SIC', 4146, 8000, 2, 4149, 8020, 3),\n" +
            "(8373, 'NAICS', 2071, 812, 2, 2091, 812331, 5),\n" +
            "(8374, 'SIC', 3762, 5100, 2, 3803, 5199, 4),\n" +
            "(8375, 'NAICS', 2037, 81, 1, 2133, 814110, 5),\n" +
            "(8376, 'SIC', 3992, 6700, 2, 4002, 6790, 3),\n" +
            "(8377, 'SIC', 4139, 7990, 3, 4141, 7992, 4),\n" +
            "(8378, 'SEC', 2791, 20, 1, 2405, 3520, 3),\n" +
            "(8379, 'SEC', 2302, 2700, 2, 2310, 2740, 3),\n" +
            "(8380, 'SIC', 2982, 2000, 2, 2998, 2037, 4),\n" +
            "(8381, 'SEC', 2791, 20, 1, 2422, 3567, 4),\n" +
            "(8382, 'SIC', 4208, 8600, 2, 4219, 8660, 3),\n" +
            "(8383, 'NAICS', 2037, 81, 1, 2118, 813410, 5),\n" +
            "(8384, 'SEC', 2552, 4900, 2, 2560, 4931, 4),\n" +
            "(8385, 'NAICS', 2019, 72131, 4, 2018, 721310, 5),\n" +
            "(8386, 'SIC', 3480, 3600, 2, 3484, 3620, 3),\n" +
            "(8387, 'SEC', 2521, 4230, 3, 2522, 4231, 4),\n" +
            "(8388, 'SIC', 3823, 5410, 3, 3824, 5411, 4),\n" +
            "(8389, 'SIC', 2951, 1620, 3, 2953, 1623, 4),\n" +
            "(8390, 'SEC', 2795, 60, 1, 4322, 6180, 3),\n" +
            "(8391, 'NAICS', 1480, 52, 1, 1522, 52314, 4),\n" +
            "(8392, 'SIC', 3349, 3330, 3, 3350, 3331, 4),\n" +
            "(8393, 'SIC', 4308, 20, 1, 3195, 2730, 3),\n" +
            "(8394, 'SEC', 2792, 40, 1, 2531, 4522, 4),\n" +
            "(8395, 'SEC', 2793, 50, 1, 2591, 5100, 2),\n" +
            "(8396, 'SIC', 3149, 2510, 3, 3152, 2514, 4),\n" +
            "(8397, 'NAICS', 1943, 711, 2, 1953, 7112, 3),\n" +
            "(8398, 'NAICS', 1894, 622, 2, 1898, 6222, 3),\n" +
            "(8399, 'SIC', 4308, 20, 1, 2987, 2020, 3),\n" +
            "(8400, 'SIC', 4040, 7300, 2, 4061, 7359, 4),\n" +
            "(8401, 'NAICS', 2135, 92, 1, 2145, 92114, 4),\n" +
            "(8402, 'SIC', 3269, 3060, 3, 3270, 3061, 4),\n" +
            "(8403, 'NAICS', 2151, 9221, 3, 2156, 922130, 5),\n" +
            "(8404, 'NAICS', 1513, 523, 2, 1529, 523920, 5),\n" +
            "(8405, 'NAICS', 931, 423, 2, 1009, 423930, 5),\n" +
            "(8406, 'SIC', 4311, 52, 1, 3888, 5912, 4),\n" +
            "(8407, 'SIC', 4313, 70, 1, 4193, 8320, 3),\n" +
            "(8408, 'SIC', 4305, 1, 1, 2817, 174, 4),\n" +
            "(8409, 'NAICS', 1813, 611, 2, 1830, 6115, 3),\n" +
            "(8410, 'SEC', 2360, 3230, 3, 2361, 3231, 4),\n" +
            "(8411, 'SEC', 2791, 20, 1, 2294, 2611, 4),\n" +
            "(8412, 'SIC', 4308, 20, 1, 3586, 3949, 4),\n" +
            "(8413, 'SIC', 4308, 20, 1, 3310, 3241, 4),\n" +
            "(8414, 'SIC', 3715, 5000, 2, 3757, 5091, 4),\n" +
            "(8415, 'SIC', 4308, 20, 1, 3311, 3250, 3),\n" +
            "(8416, 'SIC', 4308, 20, 1, 3189, 2679, 4),\n" +
            "(8417, 'NAICS', 1958, 7113, 3, 1961, 711320, 5),\n" +
            "(8418, 'SEC', 2791, 20, 1, 2453, 3677, 4),\n" +
            "(8419, 'SIC', 4308, 20, 1, 3079, 2296, 4),\n" +
            "(8420, 'SIC', 3419, 3500, 2, 3439, 3545, 4),\n" +
            "(8421, 'NAICS', 2176, 924, 2, 2178, 924110, 5),\n" +
            "(8422, 'SEC', 2488, 3840, 3, 2490, 3842, 4),\n" +
            "(8423, 'NAICS', 1943, 711, 2, 1968, 71151, 4),\n" +
            "(8424, 'SIC', 3548, 3790, 3, 3549, 3792, 4),\n" +
            "(8425, 'NAICS', 2135, 92, 1, 2174, 923140, 5),\n" +
            "(8426, 'NAICS', 1571, 5311, 3, 1575, 53112, 4),\n" +
            "(8427, 'NAICS', 1452, 517, 2, 1462, 5179, 3),\n" +
            "(8428, 'NAICS', 1569, 53, 1, 1580, 5312, 3),\n" +
            "(8429, 'SEC', 2793, 50, 1, 2582, 5065, 4),\n" +
            "(8430, 'SIC', 4308, 20, 1, 3270, 3061, 4),\n" +
            "(8431, 'NAICS', 119, 11511, 4, 125, 115116, 5),\n" +
            "(8432, 'NAICS', 144, 2122, 3, 148, 212221, 5),\n" +
            "(8433, 'NAICS', 1812, 61, 1, 1827, 61142, 4),\n" +
            "(8434, 'SIC', 3419, 3500, 2, 3446, 3553, 4),\n" +
            "(8435, 'NAICS', 1480, 52, 1, 1500, 52229, 4),\n" +
            "(8436, 'SIC', 4309, 40, 1, 3695, 4911, 4),\n" +
            "(8437, 'NAICS', 20, 11121, 4, 21, 111211, 5),\n" +
            "(8438, 'NAICS', 1942, 71, 1, 1954, 71121, 4),\n" +
            "(8439, 'NAICS', 938, 42313, 4, 937, 423130, 5),\n" +
            "(8440, 'SIC', 2982, 2000, 2, 3011, 2053, 4),\n" +
            "(8441, 'NAICS', 1836, 6116, 3, 1845, 611692, 5),\n" +
            "(8442, 'NAICS', 1015, 424, 2, 1074, 424820, 5),\n" +
            "(8443, 'SEC', 2513, 4010, 3, 2515, 4013, 4),\n" +
            "(8444, 'SIC', 3077, 2290, 3, 3082, 2299, 4),\n" +
            "(8445, 'NAICS', 1850, 62, 1, 1892, 621991, 5),\n" +
            "(8446, 'SEC', 2434, 3600, 2, 2456, 3690, 3),\n" +
            "(8447, 'SIC', 4308, 20, 1, 3272, 3080, 3),\n" +
            "(8448, 'SIC', 4305, 1, 1, 2829, 213, 4),\n" +
            "(8449, 'NAICS', 2, 111, 2, 55, 111998, 5),\n" +
            "(8450, 'NAICS', 1402, 51, 1, 1429, 512191, 5),\n" +
            "(8451, 'SIC', 2982, 2000, 2, 3035, 2092, 4),\n" +
            "(8452, 'SIC', 4312, 60, 1, 3959, 6310, 3),\n" +
            "(8453, 'SIC', 3480, 3600, 2, 3500, 3645, 4),\n" +
            "(8454, 'SIC', 4308, 20, 1, 3401, 3470, 3),\n" +
            "(8455, 'NAICS', 1625, 541, 2, 1651, 541360, 5),\n" +
            "(8456, 'NAICS', 1592, 5321, 3, 1595, 532112, 5),\n" +
            "(8457, 'NAICS', 1635, 54121, 4, 1636, 541211, 5),\n" +
            "(8458, 'SEC', 2731, 7380, 3, 4329, 7385, 4),\n" +
            "(8459, 'SIC', 3190, 2700, 2, 3195, 2730, 3),\n" +
            "(8460, 'NAICS', 235, 238, 2, 258, 238290, 5),\n" +
            "(8461, 'SIC', 2875, 900, 2, 2881, 921, 4),\n" +
            "(8462, 'SIC', 3886, 5900, 2, 3902, 5949, 4),\n" +
            "(8463, 'SIC', 3480, 3600, 2, 3516, 3676, 4),\n" +
            "(8464, 'NAICS', 2, 111, 2, 38, 111411, 5),\n" +
            "(8465, 'SIC', 3328, 3280, 3, 3329, 3281, 4),\n" +
            "(8466, 'NAICS', 1798, 5622, 3, 1801, 562212, 5),\n" +
            "(8467, 'NAICS', 1813, 611, 2, 1826, 611420, 5),\n" +
            "(8468, 'SEC', 2793, 50, 1, 2602, 5172, 4),\n" +
            "(8469, 'SEC', 2796, 70, 1, 2743, 7822, 4),\n" +
            "(8470, 'NAICS', 132, 21, 1, 171, 212399, 5),\n" +
            "(8471, 'NAICS', 1804, 5629, 3, 1806, 56291, 4),\n" +
            "(8472, 'SIC', 3729, 5040, 3, 3736, 5049, 4),\n" +
            "(8473, 'SIC', 3937, 6100, 2, 3947, 6163, 4),\n" +
            "(8474, 'NAICS', 1015, 424, 2, 1087, 424990, 5),\n" +
            "(8475, 'SIC', 3451, 3560, 3, 3458, 3567, 4),\n" +
            "(8476, 'SIC', 3774, 5140, 3, 3781, 5147, 4),\n" +
            "(8477, 'SIC', 3893, 5940, 3, 3899, 5946, 4),\n" +
            "(8478, 'NAICS', 930, 42, 1, 957, 42341, 4),\n" +
            "(8479, 'SIC', 4312, 60, 1, 3955, 6280, 3),\n" +
            "(8480, 'SEC', 2659, 6100, 2, 2667, 6160, 3),\n" +
            "(8481, 'SIC', 3180, 2670, 3, 3181, 2671, 4),\n" +
            "(8482, 'SEC', 2588, 5090, 3, 2590, 5099, 4),\n" +
            "(8483, 'SIC', 4040, 7300, 2, 4062, 7360, 3),\n" +
            "(8484, 'NAICS', 1776, 56171, 4, 1775, 561710, 5),\n" +
            "(8485, 'NAICS', 2045, 81112, 4, 2046, 811121, 5),\n" +
            "(8486, 'SIC', 4131, 7930, 3, 4132, 7933, 4),\n" +
            "(8487, 'SEC', 2283, 2500, 2, 2287, 2522, 4),\n" +
            "(8488, 'SIC', 4223, 8700, 2, 4236, 8741, 4),\n" +
            "(8489, 'SEC', 2403, 3500, 2, 2419, 3561, 4),\n" +
            "(8490, 'NAICS', 3, 1111, 3, 7, 11112, 4),\n" +
            "(8491, 'NAICS', 1402, 51, 1, 1414, 511191, 5),\n" +
            "(8492, 'SIC', 3395, 3460, 3, 3398, 3465, 4),\n" +
            "(8493, 'NAICS', 89, 1129, 3, 94, 112930, 5),\n" +
            "(8494, 'SEC', 2342, 3000, 2, 2344, 3011, 4),\n" +
            "(8495, 'SEC', 2791, 20, 1, 2456, 3690, 3),\n" +
            "(8496, 'SIC', 4309, 40, 1, 3649, 4490, 3),\n" +
            "(8497, 'NAICS', 1822, 61131, 4, 1821, 611310, 5),\n" +
            "(8498, 'SEC', 2512, 4000, 2, 2515, 4013, 4),\n" +
            "(8499, 'SIC', 3869, 5700, 2, 3872, 5713, 4),\n" +
            "(8500, 'NAICS', 1480, 52, 1, 1548, 524210, 5),\n" +
            "(8501, 'NAICS', 1813, 611, 2, 1821, 611310, 5),\n" +
            "(8502, 'NAICS', 138, 212, 2, 155, 212299, 5),\n" +
            "(8503, 'SIC', 3992, 6700, 2, 3996, 6720, 3),\n" +
            "(8504, 'NAICS', 1555, 5251, 3, 1557, 52511, 4),\n" +
            "(8505, 'SEC', 2791, 20, 1, 2257, 2090, 3),\n" +
            "(8506, 'SIC', 2955, 1700, 2, 2974, 1781, 4),\n" +
            "(8507, 'SIC', 4310, 50, 1, 3720, 5015, 4),\n" +
            "(8508, 'NAICS', 930, 42, 1, 1092, 42511, 4),\n" +
            "(8509, 'SIC', 3526, 3700, 2, 3549, 3792, 4),\n" +
            "(8510, 'SEC', 2791, 20, 1, 2364, 3250, 3),\n" +
            "(8511, 'SEC', 2403, 3500, 2, 2422, 3567, 4),\n" +
            "(8512, 'NAICS', 1015, 424, 2, 1023, 4242, 3),\n" +
            "(8513, 'NAICS', 2166, 923, 2, 2170, 923120, 5),\n" +
            "(8514, 'SIC', 3164, 2590, 3, 3165, 2591, 4),\n" +
            "(8515, 'SEC', 2403, 3500, 2, 2405, 3520, 3),\n" +
            "(8516, 'SEC', 2791, 20, 1, 2243, 2013, 4),\n" +
            "(8517, 'SIC', 3337, 3300, 2, 3345, 3321, 4),\n" +
            "(8518, 'SIC', 4310, 50, 1, 3801, 5194, 4),\n" +
            "(8519, 'NAICS', 110, 11411, 4, 112, 114112, 5),\n" +
            "(8520, 'SIC', 4308, 20, 1, 3495, 3639, 4),\n" +
            "(8521, 'SIC', 3180, 2670, 3, 3184, 2674, 4),\n" +
            "(8522, 'NAICS', 1859, 6213, 3, 1863, 62132, 4),\n" +
            "(8523, 'SIC', 4308, 20, 1, 3205, 2761, 4),\n" +
            "(8524, 'SIC', 3124, 2400, 2, 3132, 2431, 4),\n" +
            "(8525, 'SIC', 4308, 20, 1, 3380, 3430, 3),\n" +
            "(8526, 'NAICS', 1767, 56161, 4, 1768, 561611, 5),\n" +
            "(8527, 'SIC', 3715, 5000, 2, 3734, 5047, 4),\n" +
            "(8528, 'SIC', 3869, 5700, 2, 3870, 5710, 3),\n" +
            "(8529, 'NAICS', 205, 23, 1, 244, 23814, 4),\n" +
            "(8530, 'SIC', 4308, 20, 1, 3001, 2041, 4),\n" +
            "(8531, 'SIC', 4308, 20, 1, 3095, 2335, 4),\n" +
            "(8532, 'SIC', 4139, 7990, 3, 4140, 7991, 4),\n" +
            "(8533, 'NAICS', 1725, 56, 1, 1794, 56211, 4),\n" +
            "(8534, 'NAICS', 2037, 81, 1, 2124, 81392, 4),\n" +
            "(8535, 'SIC', 4313, 70, 1, 4092, 7534, 4),\n" +
            "(8536, 'SIC', 3797, 5190, 3, 3798, 5191, 4),\n" +
            "(8537, 'NAICS', 931, 423, 2, 984, 42371, 4),\n" +
            "(8538, 'NAICS', 1725, 56, 1, 1770, 561613, 5),\n" +
            "(8539, 'SIC', 4114, 7810, 3, 4116, 7819, 4),\n" +
            "(8540, 'NAICS', 205, 23, 1, 243, 238140, 5),\n" +
            "(8541, 'SEC', 2517, 4200, 2, 2521, 4230, 3),\n" +
            "(8542, 'SIC', 3606, 4110, 3, 3607, 4111, 4),\n" +
            "(8543, 'SIC', 2931, 1470, 3, 2932, 1474, 4),\n" +
            "(8544, 'NAICS', 1403, 511, 2, 1411, 511140, 5),\n" +
            "(8545, 'NAICS', 1942, 71, 1, 1980, 7131, 3),\n" +
            "(8546, 'SIC', 4313, 70, 1, 4179, 8210, 3),\n" +
            "(8547, 'NAICS', 1035, 4244, 3, 1042, 424440, 5),\n" +
            "(8548, 'SIC', 4305, 1, 1, 2849, 711, 4),\n" +
            "(8549, 'SEC', 2479, 3820, 3, 2481, 3822, 4),\n" +
            "(8550, 'SEC', 2434, 3600, 2, 2453, 3677, 4),\n" +
            "(8551, 'SIC', 4306, 10, 1, 2924, 1429, 4),\n" +
            "(8552, 'SIC', 4309, 40, 1, 3651, 4492, 4),\n" +
            "(8553, 'NAICS', 1562, 5259, 3, 1563, 525910, 5),\n" +
            "(8554, 'SIC', 4007, 7000, 2, 4010, 7020, 3),\n" +
            "(8555, 'NAICS', 2023, 72231, 4, 2022, 722310, 5),\n" +
            "(8556, 'NAICS', 934, 42311, 4, 933, 423110, 5),\n" +
            "(8557, 'NAICS', 1650, 54135, 4, 1649, 541350, 5),\n" +
            "(8558, 'NAICS', 1725, 56, 1, 1774, 5617, 3),\n" +
            "(8559, 'NAICS', 1859, 6213, 3, 1864, 621330, 5),\n" +
            "(8560, 'NAICS', 2205, 9281, 3, 2209, 92812, 4),\n" +
            "(8561, 'NAICS', 2017, 7213, 3, 2019, 72131, 4),\n" +
            "(8562, 'NAICS', 1812, 61, 1, 1849, 61171, 4),\n" +
            "(8563, 'SIC', 4192, 8300, 2, 4195, 8330, 3),\n" +
            "(8564, 'NAICS', 1506, 5223, 3, 1508, 52231, 4),\n" +
            "(8565, 'NAICS', 1624, 54, 1, 1658, 541410, 5),\n" +
            "(8566, 'SIC', 2847, 700, 2, 2862, 761, 4),\n" +
            "(8567, 'SIC', 4308, 20, 1, 3312, 3251, 4),\n" +
            "(8568, 'SIC', 2884, 1000, 2, 2897, 1081, 4),\n" +
            "(8569, 'SIC', 2884, 1000, 2, 2891, 1040, 3),\n" +
            "(8570, 'SIC', 3835, 5490, 3, 3836, 5499, 4),\n" +
            "(8571, 'SIC', 4314, 90, 1, 4277, 9500, 2),\n" +
            "(8572, 'NAICS', 1536, 524, 2, 1549, 52421, 4),\n" +
            "(8573, 'SEC', 2568, 5000, 2, 2576, 5047, 4),\n" +
            "(8574, 'SIC', 4308, 20, 1, 3318, 3262, 4),\n" +
            "(8575, 'SEC', 2796, 70, 1, 2750, 7948, 4),\n" +
            "(8576, 'NAICS', 43, 1119, 3, 50, 111940, 5),\n" +
            "(8577, 'SIC', 3974, 6400, 2, 3976, 6411, 4),\n" +
            "(8578, 'NAICS', 1624, 54, 1, 1639, 541219, 5),\n" +
            "(8579, 'SIC', 4306, 10, 1, 2908, 1241, 4),\n" +
            "(8580, 'SEC', 2552, 4900, 2, 2564, 4950, 3),\n" +
            "(8581, 'SEC', 2796, 70, 1, 2733, 7384, 4),\n" +
            "(8582, 'NAICS', 946, 4233, 3, 952, 42333, 4),\n" +
            "(8583, 'SEC', 2792, 40, 1, 4316, 4955, 3),\n" +
            "(8584, 'SEC', 2793, 50, 1, 2586, 5082, 4),\n" +
            "(8585, 'SIC', 4308, 20, 1, 3356, 3351, 4),\n" +
            "(8586, 'SIC', 3344, 3320, 3, 3346, 3322, 4),\n" +
            "(8587, 'SIC', 4309, 40, 1, 3621, 4210, 3),\n" +
            "(8588, 'SIC', 3190, 2700, 2, 3205, 2761, 4),\n" +
            "(8589, 'SEC', 2372, 3310, 3, 2373, 3312, 4),\n" +
            "(8590, 'NAICS', 1076, 4249, 3, 1083, 424940, 5),\n" +
            "(8591, 'NAICS', 1942, 71, 1, 1993, 713920, 5),\n" +
            "(8592, 'SIC', 2798, 100, 2, 2816, 173, 4),\n" +
            "(8593, 'SIC', 2834, 250, 3, 2839, 259, 4),\n" +
            "(8594, 'SIC', 4312, 60, 1, 3997, 6722, 4),\n" +
            "(8595, 'NAICS', 1485, 522, 2, 1503, 522293, 5),\n" +
            "(8596, 'NAICS', 1443, 5151, 3, 1448, 51512, 4),\n" +
            "(8597, 'SIC', 3480, 3600, 2, 3524, 3695, 4),\n" +
            "(8598, 'SEC', 2458, 3700, 2, 2469, 3730, 3),\n" +
            "(8599, 'SIC', 3977, 6500, 2, 3983, 6517, 4),\n" +
            "(8600, 'SEC', 2795, 60, 1, 2707, 6798, 4),\n" +
            "(8601, 'SIC', 4308, 20, 1, 3230, 2840, 3),\n" +
            "(8602, 'NAICS', 180, 22, 1, 184, 221111, 5),\n" +
            "(8603, 'SIC', 4040, 7300, 2, 4042, 7311, 4),\n" +
            "(8604, 'SIC', 3148, 2500, 2, 3153, 2515, 4),\n" +
            "(8605, 'SIC', 3337, 3300, 2, 3352, 3339, 4),\n" +
            "(8606, 'SIC', 4313, 70, 1, 4093, 7536, 4),\n" +
            "(8607, 'NAICS', 1015, 424, 2, 1048, 424470, 5),\n" +
            "(8608, 'SEC', 2791, 20, 1, 2470, 3740, 3),\n" +
            "(8609, 'NAICS', 1061, 4246, 3, 1064, 424690, 5),\n" +
            "(8610, 'NAICS', 1850, 62, 1, 1898, 6222, 3),\n" +
            "(8611, 'SEC', 2517, 4200, 2, 2522, 4231, 4),\n" +
            "(8612, 'NAICS', 1871, 6214, 3, 1880, 621498, 5),\n" +
            "(8613, 'SIC', 4308, 20, 1, 3145, 2491, 4),\n" +
            "(8614, 'NAICS', 198, 2213, 3, 204, 22133, 4),\n" +
            "(8615, 'NAICS', 1419, 512, 2, 1433, 51221, 4),\n" +
            "(8616, 'SIC', 4308, 20, 1, 3290, 3144, 4),\n" +
            "(8617, 'SIC', 3680, 4800, 2, 3685, 4822, 4),\n" +
            "(8618, 'NAICS', 1, 11, 1, 120, 115111, 5),\n" +
            "(8619, 'NAICS', 1953, 7112, 3, 1954, 71121, 4),\n" +
            "(8620, 'NAICS', 2004, 721, 2, 2018, 721310, 5),\n" +
            "(8621, 'SIC', 3148, 2500, 2, 3156, 2520, 3),\n" +
            "(8622, 'NAICS', 1598, 5322, 3, 1601, 532220, 5),\n" +
            "(8623, 'SIC', 3371, 3400, 2, 3413, 3494, 4),\n" +
            "(8624, 'NAICS', 1850, 62, 1, 1936, 6243, 3),\n" +
            "(8625, 'NAICS', 2136, 921, 2, 2137, 9211, 3),\n" +
            "(8626, 'SIC', 3330, 3290, 3, 3333, 3295, 4),\n" +
            "(8627, 'NAICS', 1942, 71, 1, 1998, 71394, 4),\n" +
            "(8628, 'SIC', 3649, 4490, 3, 3653, 4499, 4),\n" +
            "(8629, 'SIC', 4311, 52, 1, 3874, 5719, 4),\n" +
            "(8630, 'NAICS', 1412, 51114, 4, 1411, 511140, 5),\n" +
            "(8631, 'SIC', 4247, 9100, 2, 4255, 9191, 4),\n" +
            "(8632, 'NAICS', 27, 11132, 4, 26, 111320, 5),\n" +
            "(8633, 'NAICS', 1458, 51721, 4, 1457, 517210, 5),\n" +
            "(8634, 'NAICS', 1813, 611, 2, 1833, 611512, 5),\n" +
            "(8635, 'NAICS', 1703, 54187, 4, 1702, 541870, 5),\n" +
            "(8636, 'SIC', 3715, 5000, 2, 3753, 5085, 4),\n" +
            "(8637, 'SIC', 4313, 70, 1, 4073, 7378, 4),\n" +
            "(8638, 'NAICS', 1729, 56111, 4, 1728, 561110, 5),\n" +
            "(8639, 'SEC', 2641, 5910, 3, 2642, 5912, 4),\n" +
            "(8640, 'SIC', 3083, 2300, 2, 3093, 2330, 3),\n" +
            "(8641, 'SIC', 4305, 1, 1, 2874, 851, 4),\n" +
            "(8642, 'SIC', 4314, 90, 1, 4249, 9111, 4),\n" +
            "(8643, 'NAICS', 1634, 5412, 3, 1636, 541211, 5),\n" +
            "(8644, 'NAICS', 1591, 532, 2, 1596, 532120, 5),\n" +
            "(8645, 'SEC', 2302, 2700, 2, 2311, 2741, 4),\n" +
            "(8646, 'SEC', 2673, 6220, 3, 2674, 6221, 4),\n" +
            "(8647, 'NAICS', 931, 423, 2, 938, 42313, 4),\n" +
            "(8648, 'SEC', 2789, 10, 1, 2219, 1220, 3),\n" +
            "(8649, 'NAICS', 975, 4236, 3, 976, 423610, 5),\n" +
            "(8650, 'NAICS', 1624, 54, 1, 1656, 54138, 4),\n" +
            "(8651, 'SIC', 4125, 7900, 2, 4143, 7996, 4),\n" +
            "(8652, 'NAICS', 1402, 51, 1, 1439, 51224, 4),\n" +
            "(8653, 'SIC', 3137, 2440, 3, 3140, 2449, 4),\n" +
            "(8654, 'NAICS', 1591, 532, 2, 1609, 5323, 3),\n" +
            "(8655, 'SIC', 2909, 1300, 2, 2914, 1380, 3),\n" +
            "(8656, 'NAICS', 57, 1121, 3, 58, 11211, 4),\n" +
            "(8657, 'NAICS', 1774, 5617, 3, 1778, 56172, 4),\n" +
            "(8658, 'SIC', 3815, 5300, 2, 3818, 5330, 3),\n" +
            "(8659, 'SIC', 4313, 70, 1, 4046, 7320, 3),\n" +
            "(8660, 'NAICS', 1782, 56174, 4, 1781, 561740, 5),\n" +
            "(8661, 'SIC', 4306, 10, 1, 2903, 1221, 4),\n" +
            "(8662, 'NAICS', 183, 22111, 4, 189, 221116, 5),\n" +
            "(8663, 'SEC', 2562, 4940, 3, 2563, 4941, 4),\n" +
            "(8664, 'SIC', 4037, 7290, 3, 4039, 7299, 4),\n" +
            "(8665, 'SIC', 4113, 7800, 2, 4116, 7819, 4),\n" +
            "(8666, 'SIC', 3282, 3100, 2, 3288, 3142, 4),\n" +
            "(8667, 'NAICS', 1813, 611, 2, 1846, 611699, 5),\n" +
            "(8668, 'SIC', 2939, 1500, 2, 2944, 1531, 4),\n" +
            "(8669, 'NAICS', 1, 11, 1, 116, 11421, 4),\n" +
            "(8670, 'NAICS', 2137, 9211, 3, 2149, 92119, 4),\n" +
            "(8671, 'SIC', 3124, 2400, 2, 3131, 2430, 3),\n" +
            "(8672, 'SEC', 2792, 40, 1, 2566, 4960, 3),\n" +
            "(8673, 'NAICS', 1921, 6241, 3, 1922, 624110, 5),\n" +
            "(8674, 'NAICS', 2003, 72, 1, 2022, 722310, 5),\n" +
            "(8675, 'SIC', 4308, 20, 1, 3455, 3564, 4),\n" +
            "(8676, 'SIC', 3576, 3900, 2, 3587, 3950, 3),\n" +
            "(8677, 'SEC', 2323, 2830, 3, 2327, 2836, 4),\n" +
            "(8678, 'SIC', 3716, 5010, 3, 3720, 5015, 4),\n" +
            "(8679, 'NAICS', 1725, 56, 1, 1810, 562991, 5),\n" +
            "(8680, 'SIC', 3526, 3700, 2, 3529, 3713, 4),\n" +
            "(8681, 'SIC', 4308, 20, 1, 3385, 3441, 4),\n" +
            "(8682, 'SIC', 3167, 2600, 2, 3174, 2650, 3),\n" +
            "(8683, 'SIC', 4310, 50, 1, 3744, 5070, 3),\n" +
            "(8684, 'NAICS', 1, 11, 1, 81, 11241, 4),\n" +
            "(8685, 'NAICS', 235, 238, 2, 275, 23891, 4),\n" +
            "(8686, 'NAICS', 1486, 5221, 3, 1490, 52212, 4),\n" +
            "(8687, 'SIC', 4107, 7640, 3, 4108, 7641, 4),\n" +
            "(8688, 'SEC', 2418, 3560, 3, 2421, 3564, 4),\n" +
            "(8689, 'SEC', 2568, 5000, 2, 2585, 5080, 3),\n" +
            "(8690, 'SIC', 3577, 3910, 3, 3580, 3915, 4),\n" +
            "(8691, 'NAICS', 1942, 71, 1, 1992, 71391, 4),\n" +
            "(8692, 'NAICS', 1470, 519, 2, 1477, 51913, 4),\n" +
            "(8693, 'SIC', 2931, 1470, 3, 2933, 1475, 4),\n" +
            "(8694, 'SIC', 3434, 3540, 3, 3443, 3549, 4),\n" +
            "(8695, 'SIC', 3715, 5000, 2, 3725, 5031, 4),\n" +
            "(8696, 'NAICS', 1725, 56, 1, 1727, 5611, 3),\n" +
            "(8697, 'SIC', 3474, 3590, 3, 3478, 3596, 4),\n" +
            "(8698, 'NAICS', 1015, 424, 2, 1032, 42433, 4),\n" +
            "(8699, 'SIC', 2894, 1060, 3, 2895, 1061, 4),\n" +
            "(8700, 'SIC', 4308, 20, 1, 3073, 2280, 3),\n" +
            "(8701, 'NAICS', 930, 42, 1, 1030, 42432, 4),\n" +
            "(8702, 'NAICS', 1640, 5413, 3, 1651, 541360, 5),\n" +
            "(8703, 'SIC', 3937, 6100, 2, 3946, 6162, 4),\n" +
            "(8704, 'NAICS', 1419, 512, 2, 1435, 51222, 4),\n" +
            "(8705, 'SIC', 3444, 3550, 3, 3449, 3556, 4),\n" +
            "(8706, 'SIC', 3337, 3300, 2, 3370, 3399, 4),\n" +
            "(8707, 'SIC', 4308, 20, 1, 3592, 3960, 3),\n" +
            "(8708, 'SIC', 4312, 60, 1, 3962, 6321, 4),\n" +
            "(8709, 'SEC', 2240, 2000, 2, 2244, 2015, 4),\n" +
            "(8710, 'SIC', 4310, 50, 1, 3769, 5130, 3),\n" +
            "(8711, 'NAICS', 930, 42, 1, 963, 42344, 4),\n" +
            "(8712, 'NAICS', 2150, 922, 2, 2164, 922190, 5),\n" +
            "(8713, 'SEC', 2796, 70, 1, 2720, 7350, 3),\n" +
            "(8714, 'NAICS', 2071, 812, 2, 2081, 812210, 5),\n" +
            "(8715, 'SIC', 3854, 5600, 2, 3861, 5640, 3),\n" +
            "(8716, 'SIC', 4081, 7500, 2, 4099, 7549, 4),\n" +
            "(8717, 'NAICS', 1452, 517, 2, 1456, 5172, 3),\n" +
            "(8718, 'SIC', 3372, 3410, 3, 3373, 3411, 4),\n" +
            "(8719, 'SIC', 4305, 1, 1, 2835, 251, 4),\n" +
            "(8720, 'NAICS', 1726, 561, 2, 1782, 56174, 4),\n" +
            "(8721, 'SIC', 4308, 20, 1, 3052, 2211, 4),\n" +
            "(8722, 'SIC', 4306, 10, 1, 2918, 1400, 2),\n" +
            "(8723, 'NAICS', 2003, 72, 1, 2028, 7224, 3),\n" +
            "(8724, 'NAICS', 1402, 51, 1, 1444, 51511, 4),\n" +
            "(8725, 'NAICS', 1598, 5322, 3, 1602, 53222, 4),\n" +
            "(8726, 'SIC', 3762, 5100, 2, 3772, 5137, 4),\n" +
            "(8727, 'NAICS', 1672, 5416, 3, 1682, 54169, 4),\n" +
            "(8728, 'NAICS', 2038, 811, 2, 2060, 81131, 4),\n" +
            "(8729, 'NAICS', 2032, 72251, 4, 2033, 722511, 5),\n" +
            "(8730, 'SIC', 3301, 3200, 2, 3313, 3253, 4),\n" +
            "(8731, 'NAICS', 930, 42, 1, 1072, 424810, 5),\n" +
            "(8732, 'NAICS', 1, 11, 1, 67, 11221, 4),\n" +
            "(8733, 'SEC', 2283, 2500, 2, 2291, 2590, 3),\n" +
            "(8734, 'NAICS', 2071, 812, 2, 2085, 8123, 3),\n" +
            "(8735, 'NAICS', 2135, 92, 1, 2204, 928, 2),\n" +
            "(8736, 'SIC', 3316, 3260, 3, 3321, 3269, 4),\n" +
            "(8737, 'NAICS', 1485, 522, 2, 1496, 522210, 5),\n" +
            "(8738, 'NAICS', 1850, 62, 1, 1861, 62131, 4),\n" +
            "(8739, 'NAICS', 1774, 5617, 3, 1783, 561790, 5),\n" +
            "(8740, 'SIC', 2905, 1230, 3, 2906, 1231, 4),\n" +
            "(8741, 'SIC', 4308, 20, 1, 3108, 2380, 3),\n" +
            "(8742, 'NAICS', 1979, 713, 2, 2000, 71395, 4),\n" +
            "(8743, 'SIC', 3693, 4900, 2, 3699, 4924, 4),\n" +
            "(8744, 'SEC', 2791, 20, 1, 2351, 3086, 4),\n" +
            "(8745, 'SIC', 3301, 3200, 2, 3305, 3221, 4),\n" +
            "(8746, 'NAICS', 1851, 621, 2, 1888, 6219, 3),\n" +
            "(8747, 'SEC', 2791, 20, 1, 2274, 2340, 3),\n" +
            "(8748, 'SEC', 2552, 4900, 2, 2556, 4922, 4),\n" +
            "(8749, 'NAICS', 2039, 8111, 3, 2044, 811118, 5),\n" +
            "(8750, 'SIC', 4313, 70, 1, 4177, 8111, 4),\n" +
            "(8751, 'SIC', 3371, 3400, 2, 3408, 3489, 4),\n" +
            "(8752, 'NAICS', 1851, 621, 2, 1880, 621498, 5),\n" +
            "(8753, 'SEC', 2791, 20, 1, 2506, 3942, 4),\n" +
            "(8754, 'SIC', 3837, 5500, 2, 3853, 5599, 4),\n" +
            "(8755, 'NAICS', 2151, 9221, 3, 2161, 92215, 4),\n" +
            "(8756, 'NAICS', 1942, 71, 1, 1949, 711130, 5),\n" +
            "(8757, 'SIC', 4100, 7600, 2, 4106, 7631, 4),\n" +
            "(8758, 'SIC', 3050, 2200, 2, 3067, 2260, 3),\n" +
            "(8759, 'NAICS', 2135, 92, 1, 2159, 92214, 4),\n" +
            "(8760, 'SEC', 2500, 3900, 2, 2510, 3960, 3),\n" +
            "(8761, 'SIC', 4311, 52, 1, 3861, 5640, 3),\n" +
            "(8762, 'SIC', 4308, 20, 1, 3558, 3823, 4),\n" +
            "(8763, 'SIC', 4307, 15, 1, 2962, 1740, 3),\n" +
            "(8764, 'NAICS', 1605, 53229, 4, 1608, 532299, 5),\n" +
            "(8765, 'SEC', 2229, 1500, 2, 2233, 1540, 3),\n" +
            "(8766, 'SIC', 3220, 2820, 3, 3223, 2823, 4),\n" +
            "(8767, 'SIC', 4308, 20, 1, 3223, 2823, 4),\n" +
            "(8768, 'SIC', 4113, 7800, 2, 4124, 7841, 4),\n" +
            "(8769, 'NAICS', 1771, 56162, 4, 1772, 561621, 5),\n" +
            "(8770, 'NAICS', 1754, 56149, 4, 1755, 561491, 5),\n" +
            "(8771, 'SIC', 4313, 70, 1, 4240, 8748, 4),\n" +
            "(8772, 'NAICS', 1979, 713, 2, 1990, 7139, 3),\n" +
            "(8773, 'NAICS', 1943, 711, 2, 1952, 71119, 4),\n" +
            "(8774, 'NAICS', 108, 114, 2, 110, 11411, 4),\n" +
            "(8775, 'NAICS', 1904, 623, 2, 1910, 62321, 4),\n" +
            "(8776, 'SEC', 2276, 2400, 2, 2281, 2451, 4),\n" +
            "(8777, 'SIC', 4311, 52, 1, 3826, 5421, 4),\n" +
            "(8778, 'NAICS', 1480, 52, 1, 1485, 522, 2),\n" +
            "(8779, 'SIC', 3337, 3300, 2, 3367, 3369, 4),\n" +
            "(8780, 'SEC', 2713, 7300, 2, 2714, 7310, 3),\n" +
            "(8781, 'SIC', 3050, 2200, 2, 3062, 2253, 4),\n" +
            "(8782, 'NAICS', 1840, 61162, 4, 1839, 611620, 5),\n" +
            "(8783, 'SEC', 2319, 2800, 2, 2336, 2891, 4),\n" +
            "(8784, 'SEC', 2677, 6300, 2, 2683, 6330, 3),\n" +
            "(8785, 'SIC', 3707, 4950, 3, 3708, 4952, 4),\n" +
            "(8786, 'NAICS', 1452, 517, 2, 1455, 51711, 4),\n" +
            "(8787, 'NAICS', 1726, 561, 2, 1758, 5615, 3),\n" +
            "(8788, 'NAICS', 2, 111, 2, 16, 11119, 4),\n" +
            "(8789, 'NAICS', 1898, 6222, 3, 1900, 62221, 4),\n" +
            "(8790, 'NAICS', 1847, 6117, 3, 1848, 611710, 5),\n" +
            "(8791, 'SEC', 2403, 3500, 2, 2407, 3524, 4),\n" +
            "(8792, 'SIC', 4308, 20, 1, 3302, 3210, 3),\n" +
            "(8793, 'SEC', 2649, 6000, 2, 2656, 6036, 4);\n";
    static String industryCodeInsert28 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(8794, 'SEC', 2791, 20, 1, 2480, 3821, 4),\n" +
            "(8795, 'SIC', 2982, 2000, 2, 2989, 2022, 4),\n" +
            "(8796, 'NAICS', 1920, 624, 2, 1935, 62423, 4),\n" +
            "(8797, 'SEC', 2713, 7300, 2, 2731, 7380, 3),\n" +
            "(8798, 'NAICS', 1513, 523, 2, 1517, 523120, 5),\n" +
            "(8799, 'SIC', 2939, 1500, 2, 2945, 1540, 3),\n" +
            "(8800, 'SEC', 2660, 6110, 3, 2661, 6111, 4),\n" +
            "(8801, 'SIC', 3804, 5200, 2, 3808, 5231, 4),\n" +
            "(8802, 'NAICS', 1725, 56, 1, 1748, 561431, 5),\n" +
            "(8803, 'NAICS', 117, 115, 2, 128, 11521, 4),\n" +
            "(8804, 'SIC', 3214, 2800, 2, 3218, 2816, 4),\n" +
            "(8805, 'SIC', 3190, 2700, 2, 3199, 2741, 4),\n" +
            "(8806, 'NAICS', 89, 1129, 3, 96, 112990, 5),\n" +
            "(8807, 'SIC', 3167, 2600, 2, 3188, 2678, 4),\n" +
            "(8808, 'SIC', 4306, 10, 1, 2925, 1440, 3),\n" +
            "(8809, 'SIC', 3124, 2400, 2, 3129, 2426, 4),\n" +
            "(8810, 'SIC', 3409, 3490, 3, 3411, 3492, 4),\n" +
            "(8811, 'SIC', 3301, 3200, 2, 3306, 3229, 4),\n" +
            "(8812, 'SIC', 4308, 20, 1, 3100, 2342, 4),\n" +
            "(8813, 'NAICS', 234, 23799, 4, 233, 237990, 5),\n" +
            "(8814, 'NAICS', 218, 237, 2, 230, 237310, 5),\n" +
            "(8815, 'SIC', 4308, 20, 1, 3537, 3730, 3),\n" +
            "(8816, 'NAICS', 1, 11, 1, 129, 1153, 3),\n" +
            "(8817, 'NAICS', 1015, 424, 2, 1038, 424420, 5),\n" +
            "(8818, 'NAICS', 45, 11191, 4, 44, 111910, 5),\n" +
            "(8819, 'SEC', 2539, 4800, 2, 2551, 4899, 4),\n" +
            "(8820, 'NAICS', 1442, 515, 2, 1450, 515210, 5),\n" +
            "(8821, 'NAICS', 1, 11, 1, 75, 112340, 5),\n" +
            "(8822, 'SIC', 2982, 2000, 2, 2988, 2021, 4),\n" +
            "(8823, 'SIC', 4309, 40, 1, 3638, 4412, 4),\n" +
            "(8824, 'SIC', 3893, 5940, 3, 3898, 5945, 4),\n" +
            "(8825, 'NAICS', 1966, 7115, 3, 1968, 71151, 4),\n" +
            "(8826, 'SIC', 3301, 3200, 2, 3332, 3292, 4),\n" +
            "(8827, 'SEC', 2791, 20, 1, 2438, 3620, 3),\n" +
            "(8828, 'NAICS', 2003, 72, 1, 2020, 722, 2),\n" +
            "(8829, 'SIC', 4308, 20, 1, 3049, 2141, 4),\n" +
            "(8830, 'SEC', 2292, 2600, 2, 2298, 2631, 4),\n" +
            "(8831, 'SIC', 4308, 20, 1, 3013, 2061, 4),\n" +
            "(8832, 'SIC', 4308, 20, 1, 3216, 2812, 4),\n" +
            "(8833, 'SIC', 4308, 20, 1, 3213, 2796, 4),\n" +
            "(8834, 'SEC', 2650, 6020, 3, 2653, 6029, 4),\n" +
            "(8835, 'SIC', 4308, 20, 1, 3278, 3086, 4),\n" +
            "(8836, 'SIC', 4308, 20, 1, 3006, 2047, 4),\n" +
            "(8837, 'SEC', 2746, 7840, 3, 2747, 7841, 4),\n" +
            "(8838, 'NAICS', 2182, 925, 2, 2185, 92511, 4),\n" +
            "(8839, 'SIC', 4308, 20, 1, 3467, 3579, 4),\n" +
            "(8840, 'SIC', 3686, 4830, 3, 3687, 4832, 4),\n" +
            "(8841, 'NAICS', 1942, 71, 1, 1973, 712120, 5),\n" +
            "(8842, 'SIC', 4313, 70, 1, 4187, 8243, 4),\n" +
            "(8843, 'NAICS', 930, 42, 1, 981, 42369, 4),\n" +
            "(8844, 'SIC', 4058, 7350, 3, 4061, 7359, 4),\n" +
            "(8845, 'SIC', 4313, 70, 1, 4151, 8030, 3),\n" +
            "(8846, 'SEC', 2539, 4800, 2, 2543, 4820, 3),\n" +
            "(8847, 'SIC', 4313, 70, 1, 4039, 7299, 4),\n" +
            "(8848, 'SIC', 4305, 1, 1, 2837, 253, 4),\n" +
            "(8849, 'SIC', 4313, 70, 1, 4050, 7331, 4),\n" +
            "(8850, 'SEC', 4322, 6180, 3, 4323, 6189, 4),\n" +
            "(8851, 'SEC', 2713, 7300, 2, 2724, 7363, 4),\n" +
            "(8852, 'SEC', 2446, 3660, 3, 2447, 3661, 4),\n" +
            "(8853, 'SIC', 4306, 10, 1, 2936, 1481, 4),\n" +
            "(8854, 'NAICS', 1958, 7113, 3, 1962, 71132, 4),\n" +
            "(8855, 'NAICS', 2117, 8134, 3, 2118, 813410, 5),\n" +
            "(8856, 'SIC', 4178, 8200, 2, 4188, 8244, 4),\n" +
            "(8857, 'SIC', 4311, 52, 1, 3901, 5948, 4),\n" +
            "(8858, 'NAICS', 2071, 812, 2, 2073, 81211, 4),\n" +
            "(8859, 'SIC', 4178, 8200, 2, 4190, 8290, 3),\n" +
            "(8860, 'SEC', 2796, 70, 1, 2749, 7940, 3),\n" +
            "(8861, 'NAICS', 235, 238, 2, 259, 23829, 4),\n" +
            "(8862, 'SIC', 3620, 4200, 2, 3628, 4222, 4),\n" +
            "(8863, 'SIC', 4312, 60, 1, 3981, 6514, 4),\n" +
            "(8864, 'SIC', 4313, 70, 1, 4216, 8641, 4),\n" +
            "(8865, 'SIC', 4313, 70, 1, 4077, 7382, 4),\n" +
            "(8866, 'SEC', 2791, 20, 1, 2339, 2911, 4),\n" +
            "(8867, 'SEC', 2796, 70, 1, 2727, 7372, 4),\n" +
            "(8868, 'NAICS', 1486, 5221, 3, 1491, 522130, 5),\n" +
            "(8869, 'SEC', 2659, 6100, 2, 4325, 6199, 4),\n" +
            "(8870, 'SIC', 4313, 70, 1, 4134, 7941, 4),\n" +
            "(8871, 'SIC', 3886, 5900, 2, 3912, 5992, 4),\n" +
            "(8872, 'SIC', 2826, 210, 3, 2828, 212, 4),\n" +
            "(8873, 'NAICS', 1624, 54, 1, 1686, 541712, 5),\n" +
            "(8874, 'NAICS', 1554, 525, 2, 1560, 525190, 5),\n" +
            "(8875, 'NAICS', 1726, 561, 2, 1749, 561439, 5),\n" +
            "(8876, 'SEC', 2517, 4200, 2, 2520, 4220, 3),\n" +
            "(8877, 'SIC', 4308, 20, 1, 3074, 2281, 4),\n" +
            "(8878, 'NAICS', 139, 2121, 3, 143, 212113, 5),\n" +
            "(8879, 'NAICS', 2, 111, 2, 3, 1111, 3),\n" +
            "(8880, 'SEC', 2240, 2000, 2, 2243, 2013, 4),\n" +
            "(8881, 'NAICS', 174, 21311, 4, 175, 213111, 5),\n" +
            "(8882, 'SEC', 2710, 7010, 3, 2711, 7011, 4),\n" +
            "(8883, 'NAICS', 3, 1111, 3, 11, 11114, 4),\n" +
            "(8884, 'NAICS', 1624, 54, 1, 1650, 54135, 4),\n" +
            "(8885, 'SIC', 4308, 20, 1, 3540, 3740, 3),\n" +
            "(8886, 'NAICS', 982, 4237, 3, 987, 423730, 5),\n" +
            "(8887, 'NAICS', 132, 21, 1, 140, 21211, 4),\n" +
            "(8888, 'NAICS', 1624, 54, 1, 1655, 541380, 5),\n" +
            "(8889, 'SEC', 2319, 2800, 2, 2325, 2834, 4),\n" +
            "(8890, 'SIC', 4308, 20, 1, 3150, 2511, 4),\n" +
            "(8891, 'SIC', 2847, 700, 2, 2866, 782, 4),\n" +
            "(8892, 'NAICS', 89, 1129, 3, 93, 11292, 4),\n" +
            "(8893, 'SEC', 2610, 5300, 2, 2613, 5330, 3),\n" +
            "(8894, 'NAICS', 1591, 532, 2, 1598, 5322, 3),\n" +
            "(8895, 'NAICS', 1035, 4244, 3, 1044, 424450, 5),\n" +
            "(8896, 'SEC', 2240, 2000, 2, 2257, 2090, 3),\n" +
            "(8897, 'SIC', 4295, 9660, 3, 4296, 9661, 4),\n" +
            "(8898, 'SEC', 2794, 52, 1, 2611, 5310, 3),\n" +
            "(8899, 'SIC', 2864, 780, 3, 2866, 782, 4),\n" +
            "(8900, 'NAICS', 1480, 52, 1, 1492, 52213, 4),\n" +
            "(8901, 'SEC', 2795, 60, 1, 2691, 6400, 2),\n" +
            "(8902, 'NAICS', 180, 22, 1, 183, 22111, 4),\n" +
            "(8903, 'NAICS', 1741, 5614, 3, 1743, 56141, 4),\n" +
            "(8904, 'NAICS', 1646, 54133, 4, 1645, 541330, 5),\n" +
            "(8905, 'SIC', 3214, 2800, 2, 3232, 2842, 4),\n" +
            "(8906, 'NAICS', 1030, 42432, 4, 1029, 424320, 5),\n" +
            "(8907, 'SIC', 3371, 3400, 2, 3381, 3431, 4),\n" +
            "(8908, 'NAICS', 144, 2122, 3, 149, 212222, 5),\n" +
            "(8909, 'SIC', 3252, 2900, 2, 3257, 2952, 4),\n" +
            "(8910, 'SEC', 2738, 7800, 2, 2746, 7840, 3),\n" +
            "(8911, 'NAICS', 2182, 925, 2, 2184, 925110, 5),\n" +
            "(8912, 'NAICS', 1054, 4245, 3, 1058, 42452, 4),\n" +
            "(8913, 'NAICS', 1023, 4242, 3, 1025, 42421, 4),\n" +
            "(8914, 'NAICS', 1066, 4247, 3, 1070, 42472, 4),\n" +
            "(8915, 'NAICS', 1485, 522, 2, 1486, 5221, 3),\n" +
            "(8916, 'NAICS', 218, 237, 2, 226, 2372, 3),\n" +
            "(8917, 'SIC', 3869, 5700, 2, 3871, 5712, 4),\n" +
            "(8918, 'SIC', 3148, 2500, 2, 3164, 2590, 3),\n" +
            "(8919, 'NAICS', 1624, 54, 1, 1700, 541860, 5),\n" +
            "(8920, 'NAICS', 2113, 81331, 4, 2114, 813311, 5),\n" +
            "(8921, 'SIC', 4007, 7000, 2, 4012, 7030, 3),\n" +
            "(8922, 'NAICS', 1054, 4245, 3, 1057, 424520, 5),\n" +
            "(8923, 'SIC', 3527, 3710, 3, 3529, 3713, 4),\n" +
            "(8924, 'SEC', 2791, 20, 1, 2288, 2530, 3),\n" +
            "(8925, 'SIC', 3404, 3480, 3, 3407, 3484, 4),\n" +
            "(8926, 'SEC', 2791, 20, 1, 2373, 3312, 4),\n" +
            "(8927, 'NAICS', 995, 42382, 4, 994, 423820, 5),\n" +
            "(8928, 'SIC', 3948, 6200, 2, 3952, 6221, 4),\n" +
            "(8929, 'NAICS', 2103, 813, 2, 2128, 81394, 4),\n" +
            "(8930, 'SIC', 4310, 50, 1, 3797, 5190, 3),\n" +
            "(8931, 'NAICS', 1404, 5111, 3, 1415, 511199, 5),\n" +
            "(8932, 'SIC', 3552, 3800, 2, 3569, 3845, 4),\n" +
            "(8933, 'SEC', 2791, 20, 1, 2323, 2830, 3),\n" +
            "(8934, 'NAICS', 1989, 71329, 4, 1988, 713290, 5),\n" +
            "(8935, 'SEC', 2774, 8700, 2, 2783, 8744, 4),\n" +
            "(8936, 'SIC', 4250, 9120, 3, 4251, 9121, 4),\n" +
            "(8937, 'NAICS', 1792, 562, 2, 1811, 562998, 5),\n" +
            "(8938, 'NAICS', 1943, 711, 2, 1966, 7115, 3),\n" +
            "(8939, 'SIC', 2982, 2000, 2, 2983, 2010, 3),\n" +
            "(8940, 'SIC', 4175, 8100, 2, 4176, 8110, 3),\n" +
            "(8941, 'SIC', 4311, 52, 1, 3914, 5994, 4),\n" +
            "(8942, 'NAICS', 1624, 54, 1, 1637, 541213, 5),\n" +
            "(8943, 'SIC', 2825, 200, 2, 2827, 211, 4),\n" +
            "(8944, 'SIC', 3762, 5100, 2, 3791, 5170, 3),\n" +
            "(8945, 'SIC', 4081, 7500, 2, 4088, 7521, 4),\n" +
            "(8946, 'SIC', 4309, 40, 1, 3640, 4424, 4),\n" +
            "(8947, 'SIC', 4308, 20, 1, 3336, 3299, 4),\n" +
            "(8948, 'NAICS', 1471, 5191, 3, 1479, 51919, 4),\n" +
            "(8949, 'NAICS', 1500, 52229, 4, 1503, 522293, 5),\n" +
            "(8950, 'SIC', 4308, 20, 1, 3438, 3544, 4),\n" +
            "(8951, 'SEC', 2526, 4500, 2, 2531, 4522, 4),\n" +
            "(8952, 'SEC', 2384, 3400, 2, 2400, 3470, 3),\n" +
            "(8953, 'NAICS', 147, 21222, 4, 149, 212222, 5),\n" +
            "(8954, 'SEC', 2770, 8300, 2, 2771, 8350, 3),\n" +
            "(8955, 'SIC', 3667, 4700, 2, 3678, 4785, 4),\n" +
            "(8956, 'NAICS', 1554, 525, 2, 1565, 525920, 5),\n" +
            "(8957, 'SEC', 2791, 20, 1, 2360, 3230, 3),\n" +
            "(8958, 'SIC', 4308, 20, 1, 3287, 3140, 3),\n" +
            "(8959, 'SEC', 2791, 20, 1, 2363, 3241, 4),\n" +
            "(8960, 'SEC', 2671, 6210, 3, 2672, 6211, 4),\n" +
            "(8961, 'NAICS', 1850, 62, 1, 1851, 621, 2),\n" +
            "(8962, 'SEC', 2793, 50, 1, 2604, 5190, 3),\n" +
            "(8963, 'NAICS', 181, 221, 2, 191, 221118, 5),\n" +
            "(8964, 'NAICS', 206, 236, 2, 214, 236210, 5),\n" +
            "(8965, 'SIC', 3715, 5000, 2, 3738, 5051, 4),\n" +
            "(8966, 'SIC', 3167, 2600, 2, 3168, 2610, 3),\n" +
            "(8967, 'NAICS', 172, 213, 2, 179, 213115, 5),\n" +
            "(8968, 'NAICS', 1725, 56, 1, 1735, 561311, 5),\n" +
            "(8969, 'SEC', 2791, 20, 1, 2270, 2273, 4),\n" +
            "(8970, 'SIC', 4017, 7200, 2, 4019, 7211, 4),\n" +
            "(8971, 'SIC', 3480, 3600, 2, 3493, 3634, 4),\n" +
            "(8972, 'SIC', 3886, 5900, 2, 3910, 5989, 4),\n" +
            "(8973, 'SEC', 2795, 60, 1, 2661, 6111, 4),\n" +
            "(8974, 'SIC', 3837, 5500, 2, 3840, 5520, 3),\n" +
            "(8975, 'NAICS', 1, 11, 1, 95, 11293, 4),\n" +
            "(8976, 'NAICS', 1943, 711, 2, 1963, 7114, 3),\n" +
            "(8977, 'SIC', 4308, 20, 1, 3111, 2385, 4),\n" +
            "(8978, 'NAICS', 1480, 52, 1, 1564, 52591, 4),\n" +
            "(8979, 'NAICS', 2205, 9281, 3, 2208, 928120, 5),\n" +
            "(8980, 'SEC', 2654, 6030, 3, 2656, 6036, 4),\n" +
            "(8981, 'NAICS', 1591, 532, 2, 1592, 5321, 3),\n" +
            "(8982, 'SIC', 3852, 5590, 3, 3853, 5599, 4),\n" +
            "(8983, 'NAICS', 1744, 56142, 4, 1746, 561422, 5),\n" +
            "(8984, 'SIC', 3877, 5730, 3, 3879, 5734, 4),\n" +
            "(8985, 'SIC', 3886, 5900, 2, 3900, 5947, 4),\n" +
            "(8986, 'NAICS', 1470, 519, 2, 1478, 519190, 5),\n" +
            "(8987, 'SIC', 3420, 3510, 3, 3422, 3519, 4),\n" +
            "(8988, 'SEC', 2796, 70, 1, 2742, 7820, 3),\n" +
            "(8989, 'SEC', 2434, 3600, 2, 2438, 3620, 3),\n" +
            "(8990, 'SIC', 4312, 60, 1, 3922, 6021, 4),\n" +
            "(8991, 'NAICS', 235, 238, 2, 247, 238160, 5),\n" +
            "(8992, 'SIC', 4312, 60, 1, 3991, 6553, 4),\n" +
            "(8993, 'NAICS', 1, 11, 1, 6, 111120, 5),\n" +
            "(8994, 'SEC', 2384, 3400, 2, 2393, 3443, 4),\n" +
            "(8995, 'SIC', 3992, 6700, 2, 4004, 6794, 4),\n" +
            "(8996, 'SEC', 2795, 60, 1, 2676, 6282, 4),\n" +
            "(8997, 'NAICS', 68, 1123, 3, 72, 11232, 4),\n" +
            "(8998, 'NAICS', 1758, 5615, 3, 1764, 561591, 5),\n" +
            "(8999, 'NAICS', 1597, 53212, 4, 1596, 532120, 5),\n" +
            "(9000, 'SIC', 2975, 1790, 3, 2977, 1793, 4),\n" +
            "(9001, 'NAICS', 1823, 6114, 3, 1828, 611430, 5),\n" +
            "(9002, 'NAICS', 1, 11, 1, 41, 111421, 5),\n" +
            "(9003, 'SEC', 2591, 5100, 2, 2600, 5170, 3),\n" +
            "(9004, 'SIC', 4100, 7600, 2, 4110, 7692, 4),\n" +
            "(9005, 'NAICS', 2137, 9211, 3, 2145, 92114, 4),\n" +
            "(9006, 'SIC', 3937, 6100, 2, 3944, 6159, 4),\n" +
            "(9007, 'NAICS', 2071, 812, 2, 2088, 812320, 5),\n" +
            "(9008, 'SIC', 4146, 8000, 2, 4163, 8062, 4),\n" +
            "(9009, 'SEC', 2795, 60, 1, 2662, 6140, 3),\n" +
            "(9010, 'SEC', 2434, 3600, 2, 2452, 3674, 4),\n" +
            "(9011, 'SIC', 3301, 3200, 2, 3327, 3275, 4),\n" +
            "(9012, 'SIC', 4313, 70, 1, 4017, 7200, 2),\n" +
            "(9013, 'SIC', 3404, 3480, 3, 3406, 3483, 4),\n" +
            "(9014, 'SIC', 3241, 2870, 3, 3242, 2873, 4),\n" +
            "(9015, 'SIC', 3301, 3200, 2, 3317, 3261, 4),\n" +
            "(9016, 'SEC', 2568, 5000, 2, 2573, 5031, 4),\n" +
            "(9017, 'NAICS', 1792, 562, 2, 1810, 562991, 5),\n" +
            "(9018, 'SIC', 4312, 60, 1, 3998, 6726, 4),\n" +
            "(9019, 'SIC', 4158, 8050, 3, 4160, 8052, 4),\n" +
            "(9020, 'SIC', 3974, 6400, 2, 3975, 6410, 3),\n" +
            "(9021, 'SEC', 2791, 20, 1, 2293, 2610, 3),\n" +
            "(9022, 'NAICS', 36, 1114, 3, 41, 111421, 5),\n" +
            "(9023, 'SEC', 2794, 52, 1, 2630, 5700, 2),\n" +
            "(9024, 'SIC', 3174, 2650, 3, 3177, 2655, 4),\n" +
            "(9025, 'SIC', 2798, 100, 2, 2819, 179, 4),\n" +
            "(9026, 'SIC', 2813, 170, 3, 2817, 174, 4),\n" +
            "(9027, 'NAICS', 1485, 522, 2, 1509, 522320, 5),\n" +
            "(9028, 'NAICS', 2037, 81, 1, 2060, 81131, 4),\n" +
            "(9029, 'SIC', 4308, 20, 1, 3346, 3322, 4),\n" +
            "(9030, 'SIC', 2909, 1300, 2, 2912, 1320, 3),\n" +
            "(9031, 'NAICS', 226, 2372, 3, 227, 237210, 5),\n" +
            "(9032, 'NAICS', 1403, 511, 2, 1414, 511191, 5),\n" +
            "(9033, 'SIC', 3322, 3270, 3, 3324, 3272, 4),\n" +
            "(9034, 'NAICS', 174, 21311, 4, 176, 213112, 5),\n" +
            "(9035, 'NAICS', 153, 21229, 4, 154, 212291, 5),\n" +
            "(9036, 'NAICS', 1625, 541, 2, 1663, 54143, 4),\n" +
            "(9037, 'NAICS', 1850, 62, 1, 1905, 6231, 3),\n" +
            "(9038, 'NAICS', 1875, 62142, 4, 1874, 621420, 5),\n" +
            "(9039, 'SIC', 3737, 5050, 3, 3739, 5052, 4),\n" +
            "(9040, 'SIC', 4307, 15, 1, 2941, 1521, 4),\n" +
            "(9041, 'SEC', 2791, 20, 1, 2266, 2221, 4),\n" +
            "(9042, 'SIC', 3977, 6500, 2, 3987, 6540, 3),\n" +
            "(9043, 'NAICS', 2, 111, 2, 54, 111992, 5),\n" +
            "(9044, 'NAICS', 1547, 5242, 3, 1551, 524291, 5),\n" +
            "(9045, 'SIC', 4310, 50, 1, 3746, 5074, 4),\n" +
            "(9046, 'SEC', 2640, 5900, 2, 2641, 5910, 3),\n" +
            "(9047, 'SIC', 2798, 100, 2, 2808, 133, 4),\n" +
            "(9048, 'SIC', 4310, 50, 1, 3756, 5090, 3),\n" +
            "(9049, 'NAICS', 1850, 62, 1, 1904, 623, 2),\n" +
            "(9050, 'NAICS', 2037, 81, 1, 2120, 8139, 3),\n" +
            "(9051, 'NAICS', 132, 21, 1, 167, 21239, 4),\n" +
            "(9052, 'NAICS', 2188, 926, 2, 2199, 92615, 4),\n" +
            "(9053, 'SIC', 4308, 20, 1, 3180, 2670, 3),\n" +
            "(9054, 'SEC', 2795, 60, 1, 2666, 6159, 4),\n" +
            "(9055, 'SIC', 2889, 1030, 3, 2890, 1031, 4),\n" +
            "(9056, 'NAICS', 1974, 71212, 4, 1973, 712120, 5),\n" +
            "(9057, 'SIC', 3526, 3700, 2, 3534, 3721, 4),\n" +
            "(9058, 'SEC', 2221, 1300, 2, 2223, 1311, 4),\n" +
            "(9059, 'NAICS', 1863, 62132, 4, 1862, 621320, 5),\n" +
            "(9060, 'NAICS', 1513, 523, 2, 1533, 52399, 4),\n" +
            "(9061, 'SIC', 4308, 20, 1, 3386, 3442, 4),\n" +
            "(9062, 'SIC', 4308, 20, 1, 3344, 3320, 3),\n" +
            "(9063, 'SIC', 2799, 110, 3, 2804, 119, 4),\n" +
            "(9064, 'NAICS', 235, 238, 2, 237, 238110, 5),\n" +
            "(9065, 'NAICS', 1015, 424, 2, 1016, 4241, 3),\n" +
            "(9066, 'SIC', 4308, 20, 1, 3309, 3240, 3),\n" +
            "(9067, 'SIC', 3533, 3720, 3, 3535, 3724, 4),\n" +
            "(9068, 'NAICS', 1725, 56, 1, 1734, 56131, 4),\n" +
            "(9069, 'SIC', 2798, 100, 2, 2805, 130, 3),\n" +
            "(9070, 'SIC', 4313, 70, 1, 4150, 8021, 4),\n" +
            "(9071, 'NAICS', 132, 21, 1, 170, 212393, 5),\n" +
            "(9072, 'SIC', 4314, 90, 1, 4275, 9450, 3),\n" +
            "(9073, 'SIC', 4308, 20, 1, 3390, 3448, 4),\n" +
            "(9074, 'SIC', 4312, 60, 1, 3999, 6730, 3),\n" +
            "(9075, 'SEC', 2284, 2510, 3, 2285, 2511, 4),\n" +
            "(9076, 'SIC', 4312, 60, 1, 3974, 6400, 2),\n" +
            "(9077, 'NAICS', 1851, 621, 2, 1857, 621210, 5),\n" +
            "(9078, 'NAICS', 1990, 7139, 3, 1998, 71394, 4),\n" +
            "(9079, 'SIC', 3496, 3640, 3, 3500, 3645, 4),\n" +
            "(9080, 'NAICS', 1571, 5311, 3, 1577, 53113, 4),\n" +
            "(9081, 'SEC', 2794, 52, 1, 2642, 5912, 4),\n" +
            "(9082, 'SEC', 2791, 20, 1, 2452, 3674, 4),\n" +
            "(9083, 'SEC', 2403, 3500, 2, 2421, 3564, 4),\n" +
            "(9084, 'SIC', 3667, 4700, 2, 3671, 4729, 4),\n" +
            "(9085, 'SEC', 2788, 1, 1, 2212, 700, 2),\n" +
            "(9086, 'SIC', 4313, 70, 1, 4043, 7312, 4),\n" +
            "(9087, 'NAICS', 1015, 424, 2, 1088, 42499, 4),\n" +
            "(9088, 'NAICS', 2166, 923, 2, 2169, 92311, 4),\n" +
            "(9089, 'SIC', 2798, 100, 2, 2818, 175, 4),\n" +
            "(9090, 'SIC', 4017, 7200, 2, 4020, 7212, 4),\n" +
            "(9091, 'SIC', 4310, 50, 1, 3762, 5100, 2),\n" +
            "(9092, 'NAICS', 1056, 42451, 4, 1055, 424510, 5),\n" +
            "(9093, 'SIC', 3272, 3080, 3, 3279, 3087, 4),\n" +
            "(9094, 'SIC', 4192, 8300, 2, 4200, 8361, 4),\n" +
            "(9095, 'NAICS', 932, 4231, 3, 937, 423130, 5),\n" +
            "(9096, 'NAICS', 931, 423, 2, 947, 423310, 5),\n" +
            "(9097, 'NAICS', 1626, 5411, 3, 1632, 541191, 5),\n" +
            "(9098, 'SIC', 4310, 50, 1, 3741, 5063, 4),\n" +
            "(9099, 'NAICS', 244, 23814, 4, 243, 238140, 5),\n" +
            "(9100, 'SIC', 3375, 3420, 3, 3376, 3421, 4),\n" +
            "(9101, 'SIC', 3330, 3290, 3, 3335, 3297, 4),\n" +
            "(9102, 'SIC', 4308, 20, 1, 3396, 3462, 4),\n" +
            "(9103, 'NAICS', 1666, 5415, 3, 1669, 541512, 5),\n" +
            "(9104, 'SEC', 2564, 4950, 3, 2565, 4953, 4),\n" +
            "(9105, 'NAICS', 1569, 53, 1, 1602, 53222, 4),\n" +
            "(9106, 'SEC', 2791, 20, 1, 2254, 2080, 3),\n" +
            "(9107, 'SIC', 4308, 20, 1, 3011, 2053, 4),\n" +
            "(9108, 'SEC', 2795, 60, 1, 2698, 6519, 4),\n" +
            "(9109, 'SIC', 3605, 4100, 2, 3612, 4131, 4),\n" +
            "(9110, 'NAICS', 1804, 5629, 3, 1805, 562910, 5),\n" +
            "(9111, 'SEC', 2476, 3800, 2, 2490, 3842, 4),\n" +
            "(9112, 'SEC', 2791, 20, 1, 2310, 2740, 3),\n" +
            "(9113, 'NAICS', 1402, 51, 1, 1433, 51221, 4),\n" +
            "(9114, 'NAICS', 2014, 72121, 4, 2015, 721211, 5),\n" +
            "(9115, 'SIC', 3576, 3900, 2, 3590, 3953, 4),\n" +
            "(9116, 'SIC', 3480, 3600, 2, 3522, 3692, 4),\n" +
            "(9117, 'SIC', 4313, 70, 1, 4207, 8422, 4),\n" +
            "(9118, 'NAICS', 1419, 512, 2, 1439, 51224, 4),\n" +
            "(9119, 'SIC', 4310, 50, 1, 3735, 5048, 4),\n" +
            "(9120, 'SIC', 3592, 3960, 3, 3593, 3961, 4),\n" +
            "(9121, 'SIC', 4313, 70, 1, 4090, 7532, 4),\n" +
            "(9122, 'NAICS', 1963, 7114, 3, 1965, 71141, 4),\n" +
            "(9123, 'SIC', 2898, 1090, 3, 2900, 1099, 4),\n" +
            "(9124, 'NAICS', 2003, 72, 1, 2019, 72131, 4),\n" +
            "(9125, 'NAICS', 1624, 54, 1, 1635, 54121, 4),\n" +
            "(9126, 'NAICS', 1624, 54, 1, 1710, 541921, 5),\n" +
            "(9127, 'SIC', 2825, 200, 2, 2826, 210, 3),\n" +
            "(9128, 'NAICS', 1672, 5416, 3, 1679, 541620, 5),\n" +
            "(9129, 'SIC', 4311, 52, 1, 3899, 5946, 4),\n" +
            "(9130, 'SIC', 3654, 4500, 2, 3658, 4520, 3),\n" +
            "(9131, 'SIC', 4313, 70, 1, 4117, 7820, 3),\n" +
            "(9132, 'SIC', 2914, 1380, 3, 2917, 1389, 4),\n" +
            "(9133, 'NAICS', 1823, 6114, 3, 1824, 611410, 5),\n" +
            "(9134, 'NAICS', 1850, 62, 1, 1870, 621399, 5),\n" +
            "(9135, 'SIC', 4308, 20, 1, 3083, 2300, 2),\n" +
            "(9136, 'SIC', 3083, 2300, 2, 3099, 2341, 4),\n" +
            "(9137, 'NAICS', 2201, 9271, 3, 2202, 927110, 5),\n" +
            "(9138, 'SIC', 4311, 52, 1, 3886, 5900, 2),\n" +
            "(9139, 'NAICS', 1494, 52219, 4, 1493, 522190, 5),\n" +
            "(9140, 'SIC', 4313, 70, 1, 4232, 8732, 4),\n" +
            "(9141, 'SEC', 2276, 2400, 2, 2280, 2450, 3),\n" +
            "(9142, 'SIC', 4308, 20, 1, 3035, 2092, 4),\n" +
            "(9143, 'NAICS', 1850, 62, 1, 1868, 62139, 4),\n" +
            "(9144, 'SIC', 3903, 5960, 3, 3904, 5961, 4),\n" +
            "(9145, 'SIC', 2848, 710, 3, 2849, 711, 4),\n" +
            "(9146, 'SIC', 3311, 3250, 3, 3315, 3259, 4),\n" +
            "(9147, 'SIC', 4254, 9190, 3, 4255, 9191, 4),\n" +
            "(9148, 'SIC', 4308, 20, 1, 2998, 2037, 4),\n" +
            "(9149, 'SIC', 3419, 3500, 2, 3474, 3590, 3),\n" +
            "(9150, 'NAICS', 1028, 42431, 4, 1027, 424310, 5),\n" +
            "(9151, 'SIC', 4313, 70, 1, 4075, 7380, 3),\n" +
            "(9152, 'SIC', 4305, 1, 1, 2828, 212, 4),\n" +
            "(9153, 'SEC', 2638, 5810, 3, 2639, 5812, 4),\n" +
            "(9154, 'SEC', 2793, 50, 1, 2593, 5120, 3),\n" +
            "(9155, 'SIC', 2884, 1000, 2, 2893, 1044, 4),\n" +
            "(9156, 'SIC', 4305, 1, 1, 2842, 272, 4),\n" +
            "(9157, 'SEC', 2591, 5100, 2, 2595, 5130, 3),\n" +
            "(9158, 'SIC', 3621, 4210, 3, 3625, 4215, 4),\n" +
            "(9159, 'NAICS', 138, 212, 2, 153, 21229, 4),\n" +
            "(9160, 'NAICS', 2151, 9221, 3, 2160, 922150, 5),\n" +
            "(9161, 'SIC', 4313, 70, 1, 4063, 7361, 4),\n" +
            "(9162, 'SIC', 3577, 3910, 3, 3578, 3911, 4),\n" +
            "(9163, 'NAICS', 2199, 92615, 4, 2198, 926150, 5),\n" +
            "(9164, 'SEC', 2796, 70, 1, 2757, 8051, 4),\n" +
            "(9165, 'NAICS', 208, 23611, 4, 212, 236118, 5),\n" +
            "(9166, 'SIC', 4221, 8690, 3, 4222, 8699, 4),\n" +
            "(9167, 'NAICS', 3, 1111, 3, 17, 111191, 5),\n" +
            "(9168, 'SIC', 2982, 2000, 2, 2987, 2020, 3),\n" +
            "(9169, 'SIC', 3214, 2800, 2, 3230, 2840, 3),\n" +
            "(9170, 'SEC', 2722, 7360, 3, 2724, 7363, 4),\n" +
            "(9171, 'SIC', 4308, 20, 1, 3453, 3562, 4),\n" +
            "(9172, 'SIC', 3000, 2040, 3, 3005, 2046, 4),\n" +
            "(9173, 'NAICS', 1726, 561, 2, 1790, 561990, 5),\n" +
            "(9174, 'SIC', 3869, 5700, 2, 3875, 5720, 3),\n" +
            "(9175, 'SIC', 4217, 8650, 3, 4218, 8651, 4),\n" +
            "(9176, 'SIC', 4125, 7900, 2, 4134, 7941, 4),\n" +
            "(9177, 'SEC', 2791, 20, 1, 2485, 3826, 4),\n" +
            "(9178, 'NAICS', 1486, 5221, 3, 1489, 522120, 5),\n" +
            "(9179, 'NAICS', 1843, 61169, 4, 1844, 611691, 5),\n" +
            "(9180, 'NAICS', 2106, 81311, 4, 2105, 813110, 5),\n" +
            "(9181, 'NAICS', 1, 11, 1, 45, 11191, 4),\n" +
            "(9182, 'NAICS', 930, 42, 1, 988, 42373, 4),\n" +
            "(9183, 'NAICS', 2175, 92314, 4, 2174, 923140, 5),\n" +
            "(9184, 'NAICS', 1015, 424, 2, 1039, 42442, 4),\n" +
            "(9185, 'SIC', 4259, 9220, 3, 4260, 9221, 4),\n" +
            "(9186, 'SIC', 3576, 3900, 2, 3600, 3999, 4),\n" +
            "(9187, 'SIC', 4309, 40, 1, 3603, 4011, 4),\n" +
            "(9188, 'SIC', 4002, 6790, 3, 4004, 6794, 4),\n" +
            "(9189, 'SIC', 4308, 20, 1, 3053, 2220, 3),\n" +
            "(9190, 'NAICS', 1480, 52, 1, 1566, 52592, 4),\n" +
            "(9191, 'SEC', 2791, 20, 1, 2503, 3930, 3),\n" +
            "(9192, 'SIC', 4007, 7000, 2, 4015, 7040, 3),\n" +
            "(9193, 'NAICS', 132, 21, 1, 152, 212234, 5),\n" +
            "(9194, 'NAICS', 1726, 561, 2, 1784, 56179, 4),\n" +
            "(9195, 'SIC', 3526, 3700, 2, 3536, 3728, 4),\n" +
            "(9196, 'NAICS', 1419, 512, 2, 1429, 512191, 5),\n" +
            "(9197, 'SEC', 2791, 20, 1, 2505, 3940, 3),\n" +
            "(9198, 'NAICS', 1570, 531, 2, 1588, 53132, 4),\n" +
            "(9199, 'NAICS', 1624, 54, 1, 1688, 54172, 4),\n" +
            "(9200, 'SIC', 3371, 3400, 2, 3384, 3440, 3),\n" +
            "(9201, 'NAICS', 1480, 52, 1, 1494, 52219, 4),\n" +
            "(9202, 'SIC', 4308, 20, 1, 3097, 2339, 4),\n" +
            "(9203, 'NAICS', 2, 111, 2, 51, 11194, 4),\n" +
            "(9204, 'NAICS', 1016, 4241, 3, 1021, 424130, 5),\n" +
            "(9205, 'SIC', 4309, 40, 1, 3693, 4900, 2),\n" +
            "(9206, 'SEC', 2319, 2800, 2, 2334, 2870, 3),\n" +
            "(9207, 'SIC', 3715, 5000, 2, 3723, 5023, 4),\n" +
            "(9208, 'SIC', 3917, 6000, 2, 3925, 6030, 3),\n" +
            "(9209, 'SEC', 2384, 3400, 2, 2394, 3444, 4),\n" +
            "(9210, 'NAICS', 1420, 5121, 3, 1424, 51212, 4),\n" +
            "(9211, 'NAICS', 2135, 92, 1, 2197, 92614, 4),\n" +
            "(9212, 'SEC', 2295, 2620, 3, 2296, 2621, 4),\n" +
            "(9213, 'SIC', 4308, 20, 1, 3167, 2600, 2),\n" +
            "(9214, 'SIC', 3645, 4480, 3, 3648, 4489, 4),\n" +
            "(9215, 'SEC', 2795, 60, 1, 2700, 6531, 4),\n" +
            "(9216, 'NAICS', 1766, 5616, 3, 1768, 561611, 5),\n" +
            "(9217, 'SIC', 3195, 2730, 3, 3197, 2732, 4),\n" +
            "(9218, 'SIC', 3420, 3510, 3, 3421, 3511, 4),\n" +
            "(9219, 'SEC', 2221, 1300, 2, 2224, 1380, 3),\n" +
            "(9220, 'NAICS', 235, 238, 2, 246, 23815, 4),\n" +
            "(9221, 'NAICS', 1640, 5413, 3, 1649, 541350, 5),\n" +
            "(9222, 'SIC', 4305, 1, 1, 2811, 160, 3),\n" +
            "(9223, 'NAICS', 56, 112, 2, 66, 112210, 5),\n" +
            "(9224, 'NAICS', 1689, 5418, 3, 1705, 54189, 4),\n" +
            "(9225, 'NAICS', 1058, 42452, 4, 1057, 424520, 5),\n" +
            "(9226, 'SIC', 4146, 8000, 2, 4173, 8093, 4),\n" +
            "(9227, 'NAICS', 931, 423, 2, 939, 423140, 5),\n" +
            "(9228, 'SEC', 2791, 20, 1, 2409, 3531, 4),\n" +
            "(9229, 'SIC', 2948, 1600, 2, 2951, 1620, 3),\n" +
            "(9230, 'SIC', 4268, 9400, 2, 4276, 9451, 4),\n" +
            "(9231, 'NAICS', 931, 423, 2, 993, 42381, 4),\n" +
            "(9232, 'NAICS', 1708, 54191, 4, 1707, 541910, 5),\n" +
            "(9233, 'SIC', 4256, 9200, 2, 4260, 9221, 4),\n" +
            "(9234, 'NAICS', 2, 111, 2, 35, 111339, 5),\n" +
            "(9235, 'SIC', 3756, 5090, 3, 3757, 5091, 4),\n" +
            "(9236, 'SIC', 4313, 70, 1, 4235, 8740, 3),\n" +
            "(9237, 'NAICS', 2103, 813, 2, 2111, 813219, 5),\n" +
            "(9238, 'SEC', 2796, 70, 1, 2764, 8090, 3),\n" +
            "(9239, 'SIC', 4313, 70, 1, 4041, 7310, 3),\n" +
            "(9240, 'NAICS', 1725, 56, 1, 1811, 562998, 5),\n" +
            "(9241, 'SIC', 2955, 1700, 2, 2973, 1780, 3),\n" +
            "(9242, 'SIC', 3124, 2400, 2, 3137, 2440, 3),\n" +
            "(9243, 'SIC', 3815, 5300, 2, 3817, 5311, 4),\n" +
            "(9244, 'NAICS', 1640, 5413, 3, 1652, 54136, 4),\n" +
            "(9245, 'NAICS', 1480, 52, 1, 1508, 52231, 4),\n" +
            "(9246, 'SEC', 2585, 5080, 3, 2586, 5082, 4),\n" +
            "(9247, 'SIC', 4309, 40, 1, 3679, 4789, 4),\n" +
            "(9248, 'SIC', 3419, 3500, 2, 3461, 3570, 3),\n" +
            "(9249, 'SEC', 2791, 20, 1, 2311, 2741, 4),\n" +
            "(9250, 'SEC', 2458, 3700, 2, 2462, 3714, 4),\n" +
            "(9251, 'SEC', 2791, 20, 1, 2328, 2840, 3),\n" +
            "(9252, 'NAICS', 1754, 56149, 4, 1756, 561492, 5),\n" +
            "(9253, 'NAICS', 1015, 424, 2, 1035, 4244, 3),\n" +
            "(9254, 'NAICS', 1513, 523, 2, 1522, 52314, 4),\n" +
            "(9255, 'NAICS', 1624, 54, 1, 1648, 54134, 4),\n" +
            "(9256, 'NAICS', 1, 11, 1, 80, 112410, 5),\n" +
            "(9257, 'SEC', 2731, 7380, 3, 2732, 7381, 4),\n" +
            "(9258, 'SIC', 4178, 8200, 2, 4179, 8210, 3),\n" +
            "(9259, 'SIC', 3602, 4010, 3, 3603, 4011, 4),\n" +
            "(9260, 'SIC', 3144, 2490, 3, 3145, 2491, 4),\n" +
            "(9261, 'NAICS', 118, 1151, 3, 125, 115116, 5),\n" +
            "(9262, 'NAICS', 1593, 53211, 4, 1595, 532112, 5),\n" +
            "(9263, 'SIC', 3595, 3990, 3, 3600, 3999, 4),\n" +
            "(9264, 'SIC', 4312, 60, 1, 3985, 6530, 3),\n" +
            "(9265, 'SIC', 4312, 60, 1, 3940, 6140, 3),\n" +
            "(9266, 'SIC', 4312, 60, 1, 3990, 6552, 4),\n" +
            "(9267, 'NAICS', 1943, 711, 2, 1955, 711211, 5),\n" +
            "(9268, 'SIC', 3404, 3480, 3, 3408, 3489, 4),\n" +
            "(9269, 'SIC', 3762, 5100, 2, 3782, 5148, 4),\n" +
            "(9270, 'SEC', 2337, 2900, 2, 2338, 2910, 3),\n" +
            "(9271, 'SIC', 2840, 270, 3, 2842, 272, 4),\n" +
            "(9272, 'NAICS', 1778, 56172, 4, 1777, 561720, 5),\n" +
            "(9273, 'NAICS', 2038, 811, 2, 2055, 811212, 5),\n" +
            "(9274, 'SEC', 2796, 70, 1, 2714, 7310, 3),\n" +
            "(9275, 'SEC', 2403, 3500, 2, 2425, 3571, 4),\n" +
            "(9276, 'SIC', 2847, 700, 2, 2854, 724, 4),\n" +
            "(9277, 'NAICS', 2135, 92, 1, 2181, 92412, 4),\n" +
            "(9278, 'SIC', 3180, 2670, 3, 3188, 2678, 4),\n" +
            "(9279, 'SIC', 4305, 1, 1, 2804, 119, 4),\n" +
            "(9280, 'SIC', 3419, 3500, 2, 3454, 3563, 4),\n" +
            "(9281, 'NAICS', 1898, 6222, 3, 1899, 622210, 5),\n" +
            "(9282, 'NAICS', 2071, 812, 2, 2076, 812113, 5),\n" +
            "(9283, 'SIC', 4125, 7900, 2, 4145, 7999, 4),\n" +
            "(9284, 'SIC', 3252, 2900, 2, 3255, 2950, 3),\n" +
            "(9285, 'SIC', 4313, 70, 1, 4128, 7920, 3),\n" +
            "(9286, 'NAICS', 2037, 81, 1, 2130, 81399, 4),\n" +
            "(9287, 'NAICS', 930, 42, 1, 1018, 42411, 4),\n" +
            "(9288, 'SEC', 2794, 52, 1, 2634, 5731, 4),\n" +
            "(9289, 'NAICS', 56, 112, 2, 97, 11299, 4),\n" +
            "(9290, 'SEC', 2539, 4800, 2, 2544, 4822, 4),\n" +
            "(9291, 'SEC', 2796, 70, 1, 2731, 7380, 3);\n";
    static String industryCodeInsert29 = "INSERT INTO industry_level (industry_level_id, industry_classification, ancestor_id, ancestor_code, ancestor_depth, descendant_id, descendant_code, descendant_depth) VALUES\n" +
            "(9292, 'NAICS', 235, 238, 2, 276, 238990, 5),\n" +
            "(9293, 'SIC', 4277, 9500, 2, 4283, 9532, 4),\n" +
            "(9294, 'SIC', 4208, 8600, 2, 4217, 8650, 3),\n" +
            "(9295, 'NAICS', 1431, 5122, 3, 1434, 512220, 5),\n" +
            "(9296, 'SIC', 4312, 60, 1, 3938, 6110, 3),\n" +
            "(9297, 'NAICS', 1485, 522, 2, 1508, 52231, 4),\n" +
            "(9298, 'NAICS', 1758, 5615, 3, 1759, 561510, 5),\n" +
            "(9299, 'SIC', 2891, 1040, 3, 2892, 1041, 4),\n" +
            "(9300, 'NAICS', 1485, 522, 2, 1494, 52219, 4),\n" +
            "(9301, 'NAICS', 1624, 54, 1, 1676, 541613, 5),\n" +
            "(9302, 'SIC', 4311, 52, 1, 3887, 5910, 3),\n" +
            "(9303, 'NAICS', 1471, 5191, 3, 1474, 519120, 5),\n" +
            "(9304, 'SIC', 4308, 20, 1, 3508, 3661, 4),\n" +
            "(9305, 'SIC', 3762, 5100, 2, 3776, 5142, 4),\n" +
            "(9306, 'NAICS', 1747, 56143, 4, 1749, 561439, 5),\n" +
            "(9307, 'NAICS', 2, 111, 2, 13, 11115, 4),\n" +
            "(9308, 'SIC', 4311, 52, 1, 3872, 5713, 4),\n" +
            "(9309, 'SIC', 4308, 20, 1, 3546, 3764, 4),\n" +
            "(9310, 'NAICS', 205, 23, 1, 264, 23832, 4),\n" +
            "(9311, 'SEC', 2796, 70, 1, 2762, 8080, 3),\n" +
            "(9312, 'SIC', 3480, 3600, 2, 3517, 3677, 4),\n" +
            "(9313, 'SEC', 2403, 3500, 2, 2430, 3579, 4),\n" +
            "(9314, 'SIC', 4306, 10, 1, 2933, 1475, 4),\n" +
            "(9315, 'NAICS', 1, 11, 1, 113, 114119, 5),\n" +
            "(9316, 'NAICS', 1591, 532, 2, 1618, 532490, 5),\n" +
            "(9317, 'NAICS', 1, 11, 1, 57, 1121, 3),\n" +
            "(9318, 'SEC', 2591, 5100, 2, 2598, 5150, 3),\n" +
            "(9319, 'SIC', 4125, 7900, 2, 4137, 7951, 4),\n" +
            "(9320, 'SIC', 4313, 70, 1, 4233, 8733, 4),\n" +
            "(9321, 'NAICS', 1725, 56, 1, 1767, 56161, 4),\n" +
            "(9322, 'NAICS', 1894, 622, 2, 1896, 622110, 5),\n" +
            "(9323, 'NAICS', 1624, 54, 1, 1717, 54199, 4),\n" +
            "(9324, 'NAICS', 2037, 81, 1, 2082, 81221, 4),\n" +
            "(9325, 'NAICS', 2037, 81, 1, 2078, 812191, 5),\n" +
            "(9326, 'SIC', 3681, 4810, 3, 3682, 4812, 4);\n";
    static String industryCodeInsert30 = "INSERT INTO industry_structure (industry_structure_id, industry_classification, depth, level_name) VALUES\n" +
            "(1, 'SIC', 1, 'Division'),\n" +
            "(2, 'SIC', 2, 'Major Group'),\n" +
            "(3, 'SIC', 3, 'Industry Group'),\n" +
            "(4, 'SIC', 4, 'Industry'),\n" +
            "(5, 'SEC', 1, 'Division'),\n" +
            "(6, 'SEC', 2, 'Major Group'),\n" +
            "(7, 'SEC', 3, 'Industry Group'),\n" +
            "(8, 'SEC', 4, 'Industry'),\n" +
            "(49, 'NAICS', 1, 'Economic Sector'),\n" +
            "(50, 'NAICS', 2, 'Subsector'),\n" +
            "(51, 'NAICS', 3, 'Industry Group'),\n" +
            "(52, 'NAICS', 4, 'NAICS Industry'),\n" +
            "(53, 'NAICS', 5, 'National Industry');\n";

}
