
package com.teamj.MyDiet.model.OpenFoodAPIModel;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "categories_imported",
    "countries_lc",
    "nutrient_levels_tags",
    "pnns_groups_2_tags",
    "states_tags",
    "emb_codes_20141016",
    "labels_prev_hierarchy",
    "allergens_from_user",
    "nutrition_data_prepared",
    "ingredients_n_tags",
    "nutrition_data_per",
    "ingredients_that_may_be_from_palm_oil_tags",
    "stores_debug_tags",
    "quantity",
    "serving_size_debug_tags",
    "data_sources",
    "photographers",
    "ingredients",
    "no_nutrition_data",
    "fruits-vegetables-nuts_100g_estimate",
    "last_image_t",
    "expiration_date_debug_tags",
    "ingredients_debug",
    "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value",
    "known_ingredients_n",
    "sources_fields",
    "creator",
    "stores",
    "ingredients_text_with_allergens",
    "traces",
    "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients",
    "informers_tags",
    "last_editor",
    "data_quality_errors_tags",
    "emb_codes_tags",
    "additives_tags",
    "amino_acids_prev_tags",
    "additives_n",
    "codes_tags",
    "unknown_nutrients_tags",
    "correctors",
    "nova_groups",
    "origins_tags",
    "product_name_en_imported",
    "nutrition_data_prepared_per_debug_tags",
    "traces_tags",
    "generic_name_en_debug_tags",
    "ingredients_text_en_debug_tags",
    "sources",
    "labels_lc",
    "image_ingredients_small_url",
    "quantity_debug_tags",
    "nova_group",
    "categories_hierarchy",
    "languages_tags",
    "new_additives_n",
    "rev",
    "labels_hierarchy",
    "nucleotides_prev_tags",
    "data_sources_tags",
    "stores_tags",
    "manufacturing_places_debug_tags",
    "image_ingredients_thumb_url",
    "nutrition_data_prepared_per",
    "product_name_en_debug_tags",
    "nutrition_grades_tags",
    "nutrition_grades",
    "categories_lc",
    "ingredients_tags",
    "traces_hierarchy",
    "languages_hierarchy",
    "image_thumb_url",
    "created_t",
    "brand_owner",
    "image_front_thumb_url",
    "packaging_tags",
    "ingredients_from_or_that_may_be_from_palm_oil_n",
    "other_nutritional_substances_tags",
    "additives_old_tags",
    "checkers",
    "ciqual_food_name_tags",
    "debug_param_sorted_langs",
    "minerals_tags",
    "ingredients_text_en_imported",
    "images",
    "countries_tags",
    "vitamins_prev_tags",
    "nutriscore_data",
    "nutrient_levels",
    "link",
    "ingredients_original_tags",
    "traces_from_ingredients",
    "last_modified_t",
    "nutriments",
    "allergens_tags",
    "image_nutrition_thumb_url",
    "ingredients_n",
    "brands_debug_tags",
    "image_small_url",
    "ingredients_text_with_allergens_en",
    "brands_tags",
    "minerals_prev_tags",
    "ingredients_from_palm_oil_tags",
    "nutrition_score_beverage",
    "ingredients_text_en",
    "ingredients_ids_debug",
    "last_modified_by",
    "ingredients_text",
    "brands",
    "nutrition_data",
    "categories_tags",
    "countries_debug_tags",
    "image_front_small_url",
    "link_debug_tags",
    "categories",
    "data_quality_tags",
    "data_quality_info_tags",
    "nutrition_data_per_debug_tags",
    "purchase_places_debug_tags",
    "generic_name_en",
    "pnns_groups_2",
    "countries",
    "labels",
    "amino_acids_tags",
    "ingredients_from_palm_oil_n",
    "additives_prev_original_tags",
    "states_hierarchy",
    "unique_scans_n",
    "image_ingredients_url",
    "popularity_tags",
    "data_quality_bugs_tags",
    "product_name",
    "photographers_tags",
    "lc",
    "traces_from_user",
    "brand_owner_imported",
    "entry_dates_tags",
    "nova_groups_tags",
    "product_name_en",
    "editors",
    "emb_codes_orig",
    "countries_hierarchy",
    "checkers_tags",
    "_keywords",
    "interface_version_modified",
    "pnns_groups_1",
    "ingredients_percent_analysis",
    "serving_size",
    "unknown_ingredients_n",
    "additives_tags_n",
    "image_url",
    "compared_to_category",
    "packaging",
    "nucleotides_tags",
    "generic_name",
    "emb_codes",
    "lang_debug_tags",
    "_id",
    "packaging_debug_tags",
    "ingredients_text_debug",
    "interface_version_created",
    "manufacturing_places",
    "vitamins_tags",
    "allergens_from_ingredients",
    "update_key",
    "nutrition_grade_fr",
    "origins_debug_tags",
    "category_properties",
    "nutrition_data_prepared_per_imported",
    "last_image_dates_tags",
    "misc_tags",
    "languages_codes",
    "purchase_places",
    "nutrition_data_per_imported",
    "expiration_date",
    "emb_codes_debug_tags",
    "ingredients_that_may_be_from_palm_oil_n",
    "additives_old_n",
    "data_quality_warnings_tags",
    "editors_tags",
    "languages",
    "origins",
    "labels_tags",
    "selected_images",
    "serving_size_imported",
    "traces_debug_tags",
    "scans_n",
    "additives_debug_tags",
    "image_nutrition_url",
    "sortkey",
    "product_quantity",
    "countries_imported",
    "manufacturing_places_tags",
    "image_front_url",
    "nutriscore_score",
    "nova_group_debug",
    "serving_quantity",
    "completed_t",
    "pnns_groups_1_tags",
    "ingredients_analysis_tags",
    "max_imgid",
    "additives_original_tags",
    "cities_tags",
    "states",
    "purchase_places_tags",
    "informers",
    "lang",
    "nutriscore_grade",
    "lc_imported",
    "last_edit_dates_tags",
    "code",
    "image_nutrition_small_url",
    "correctors_tags",
    "complete",
    "allergens_hierarchy",
    "labels_prev_tags",
    "completeness",
    "ingredients_hierarchy",
    "data_sources_imported",
    "allergens"
})
public class Product implements Serializable
{

    @JsonProperty("categories_imported")
    private String categoriesImported;
    @JsonProperty("countries_lc")
    private String countriesLc;
    @JsonProperty("nutrient_levels_tags")
    private List<String> nutrientLevelsTags = null;
    @JsonProperty("pnns_groups_2_tags")
    private List<String> pnnsGroups2Tags = null;
    @JsonProperty("states_tags")
    private List<String> statesTags = null;
    @JsonProperty("emb_codes_20141016")
    private String embCodes20141016;
    @JsonProperty("labels_prev_hierarchy")
    private List<String> labelsPrevHierarchy = null;
    @JsonProperty("allergens_from_user")
    private String allergensFromUser;
    @JsonProperty("nutrition_data_prepared")
    private String nutritionDataPrepared;
    @JsonProperty("ingredients_n_tags")
    private List<String> ingredientsNTags = null;
    @JsonProperty("nutrition_data_per")
    private String nutritionDataPer;
    @JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
    private List<Object> ingredientsThatMayBeFromPalmOilTags = null;
    @JsonProperty("stores_debug_tags")
    private List<Object> storesDebugTags = null;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("serving_size_debug_tags")
    private List<Object> servingSizeDebugTags = null;
    @JsonProperty("data_sources")
    private String dataSources;
    @JsonProperty("photographers")
    private List<String> photographers = null;
    @JsonProperty("ingredients")
    private List<Ingredient> ingredients = null;
    @JsonProperty("no_nutrition_data")
    private String noNutritionData;
    @JsonProperty("fruits-vegetables-nuts_100g_estimate")
    private Long fruitsVegetablesNuts100gEstimate;
    @JsonProperty("last_image_t")
    private Long lastImageT;
    @JsonProperty("expiration_date_debug_tags")
    private List<Object> expirationDateDebugTags = null;
    @JsonProperty("ingredients_debug")
    private List<String> ingredientsDebug = null;
    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
    private Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
    @JsonProperty("known_ingredients_n")
    private Long knownIngredientsN;
    @JsonProperty("sources_fields")
    private SourcesFields sourcesFields;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("stores")
    private String stores;
    @JsonProperty("ingredients_text_with_allergens")
    private String ingredientsTextWithAllergens;
    @JsonProperty("traces")
    private String traces;
    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
    private Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
    @JsonProperty("informers_tags")
    private List<String> informersTags = null;
    @JsonProperty("last_editor")
    private String lastEditor;
    @JsonProperty("data_quality_errors_tags")
    private List<Object> dataQualityErrorsTags = null;
    @JsonProperty("emb_codes_tags")
    private List<Object> embCodesTags = null;
    @JsonProperty("additives_tags")
    private List<String> additivesTags = null;
    @JsonProperty("amino_acids_prev_tags")
    private List<Object> aminoAcidsPrevTags = null;
    @JsonProperty("additives_n")
    private Long additivesN;
    @JsonProperty("codes_tags")
    private List<String> codesTags = null;
    @JsonProperty("unknown_nutrients_tags")
    private List<Object> unknownNutrientsTags = null;
    @JsonProperty("correctors")
    private List<String> correctors = null;
    @JsonProperty("nova_groups")
    private String novaGroups;
    @JsonProperty("origins_tags")
    private List<String> originsTags = null;
    @JsonProperty("product_name_en_imported")
    private String productNameEnImported;
    @JsonProperty("nutrition_data_prepared_per_debug_tags")
    private List<Object> nutritionDataPreparedPerDebugTags = null;
    @JsonProperty("traces_tags")
    private List<String> tracesTags = null;
    @JsonProperty("generic_name_en_debug_tags")
    private List<Object> genericNameEnDebugTags = null;
    @JsonProperty("ingredients_text_en_debug_tags")
    private List<Object> ingredientsTextEnDebugTags = null;
    @JsonProperty("sources")
    private List<Source> sources = null;
    @JsonProperty("labels_lc")
    private String labelsLc;
    @JsonProperty("image_ingredients_small_url")
    private String imageIngredientsSmallUrl;
    @JsonProperty("quantity_debug_tags")
    private List<Object> quantityDebugTags = null;
    @JsonProperty("nova_group")
    private Long novaGroup;
    @JsonProperty("categories_hierarchy")
    private List<String> categoriesHierarchy = null;
    @JsonProperty("languages_tags")
    private List<String> languagesTags = null;
    @JsonProperty("new_additives_n")
    private Long newAdditivesN;
    @JsonProperty("rev")
    private Long rev;
    @JsonProperty("labels_hierarchy")
    private List<String> labelsHierarchy = null;
    @JsonProperty("nucleotides_prev_tags")
    private List<Object> nucleotidesPrevTags = null;
    @JsonProperty("data_sources_tags")
    private List<String> dataSourcesTags = null;
    @JsonProperty("stores_tags")
    private List<Object> storesTags = null;
    @JsonProperty("manufacturing_places_debug_tags")
    private List<Object> manufacturingPlacesDebugTags = null;
    @JsonProperty("image_ingredients_thumb_url")
    private String imageIngredientsThumbUrl;
    @JsonProperty("nutrition_data_prepared_per")
    private String nutritionDataPreparedPer;
    @JsonProperty("product_name_en_debug_tags")
    private List<Object> productNameEnDebugTags = null;
    @JsonProperty("nutrition_grades_tags")
    private List<String> nutritionGradesTags = null;
    @JsonProperty("nutrition_grades")
    private String nutritionGrades;
    @JsonProperty("categories_lc")
    private String categoriesLc;
    @JsonProperty("ingredients_tags")
    private List<String> ingredientsTags = null;
    @JsonProperty("traces_hierarchy")
    private List<String> tracesHierarchy = null;
    @JsonProperty("languages_hierarchy")
    private List<String> languagesHierarchy = null;
    @JsonProperty("image_thumb_url")
    private String imageThumbUrl;
    @JsonProperty("created_t")
    private Long createdT;
    @JsonProperty("brand_owner")
    private String brandOwner;
    @JsonProperty("image_front_thumb_url")
    private String imageFrontThumbUrl;
    @JsonProperty("packaging_tags")
    private List<String> packagingTags = null;
    @JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    private Long ingredientsFromOrThatMayBeFromPalmOilN;
    @JsonProperty("other_nutritional_substances_tags")
    private List<Object> otherNutritionalSubstancesTags = null;
    @JsonProperty("additives_old_tags")
    private List<String> additivesOldTags = null;
    @JsonProperty("checkers")
    private List<Object> checkers = null;
    @JsonProperty("ciqual_food_name_tags")
    private List<String> ciqualFoodNameTags = null;
    @JsonProperty("debug_param_sorted_langs")
    private List<String> debugParamSortedLangs = null;
    @JsonProperty("minerals_tags")
    private List<Object> mineralsTags = null;
    @JsonProperty("ingredients_text_en_imported")
    private String ingredientsTextEnImported;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("countries_tags")
    private List<String> countriesTags = null;
    @JsonProperty("vitamins_prev_tags")
    private List<Object> vitaminsPrevTags = null;
    @JsonProperty("nutriscore_data")
    private NutriscoreData nutriscoreData;
    @JsonProperty("nutrient_levels")
    private NutrientLevels nutrientLevels;
    @JsonProperty("link")
    private String link;
    @JsonProperty("ingredients_original_tags")
    private List<String> ingredientsOriginalTags = null;
    @JsonProperty("traces_from_ingredients")
    private String tracesFromIngredients;
    @JsonProperty("last_modified_t")
    private Long lastModifiedT;
    @JsonProperty("nutriments")
    private Nutriments nutriments;
    @JsonProperty("allergens_tags")
    private List<Object> allergensTags = null;
    @JsonProperty("image_nutrition_thumb_url")
    private String imageNutritionThumbUrl;
    @JsonProperty("ingredients_n")
    private Long ingredientsN;
    @JsonProperty("brands_debug_tags")
    private List<Object> brandsDebugTags = null;
    @JsonProperty("image_small_url")
    private String imageSmallUrl;
    @JsonProperty("ingredients_text_with_allergens_en")
    private String ingredientsTextWithAllergensEn;
    @JsonProperty("brands_tags")
    private List<String> brandsTags = null;
    @JsonProperty("minerals_prev_tags")
    private List<Object> mineralsPrevTags = null;
    @JsonProperty("ingredients_from_palm_oil_tags")
    private List<Object> ingredientsFromPalmOilTags = null;
    @JsonProperty("nutrition_score_beverage")
    private Long nutritionScoreBeverage;
    @JsonProperty("ingredients_text_en")
    private String ingredientsTextEn;
    @JsonProperty("ingredients_ids_debug")
    private List<String> ingredientsIdsDebug = null;
    @JsonProperty("last_modified_by")
    private String lastModifiedBy;
    @JsonProperty("ingredients_text")
    private String ingredientsText;
    @JsonProperty("brands")
    private String brands;
    @JsonProperty("nutrition_data")
    private String nutritionData;
    @JsonProperty("categories_tags")
    private List<String> categoriesTags = null;
    @JsonProperty("countries_debug_tags")
    private List<Object> countriesDebugTags = null;
    @JsonProperty("image_front_small_url")
    private String imageFrontSmallUrl;
    @JsonProperty("link_debug_tags")
    private List<Object> linkDebugTags = null;
    @JsonProperty("categories")
    private String categories;
    @JsonProperty("data_quality_tags")
    private List<String> dataQualityTags = null;
    @JsonProperty("data_quality_info_tags")
    private List<String> dataQualityInfoTags = null;
    @JsonProperty("nutrition_data_per_debug_tags")
    private List<Object> nutritionDataPerDebugTags = null;
    @JsonProperty("purchase_places_debug_tags")
    private List<Object> purchasePlacesDebugTags = null;
    @JsonProperty("generic_name_en")
    private String genericNameEn;
    @JsonProperty("pnns_groups_2")
    private String pnnsGroups2;
    @JsonProperty("countries")
    private String countries;
    @JsonProperty("labels")
    private String labels;
    @JsonProperty("amino_acids_tags")
    private List<Object> aminoAcidsTags = null;
    @JsonProperty("ingredients_from_palm_oil_n")
    private Long ingredientsFromPalmOilN;
    @JsonProperty("additives_prev_original_tags")
    private List<String> additivesPrevOriginalTags = null;
    @JsonProperty("states_hierarchy")
    private List<String> statesHierarchy = null;
    @JsonProperty("unique_scans_n")
    private Long uniqueScansN;
    @JsonProperty("image_ingredients_url")
    private String imageIngredientsUrl;
    @JsonProperty("popularity_tags")
    private List<String> popularityTags = null;
    @JsonProperty("data_quality_bugs_tags")
    private List<Object> dataQualityBugsTags = null;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("photographers_tags")
    private List<String> photographersTags = null;
    @JsonProperty("lc")
    private String lc;
    @JsonProperty("traces_from_user")
    private String tracesFromUser;
    @JsonProperty("brand_owner_imported")
    private String brandOwnerImported;
    @JsonProperty("entry_dates_tags")
    private List<String> entryDatesTags = null;
    @JsonProperty("nova_groups_tags")
    private List<String> novaGroupsTags = null;
    @JsonProperty("product_name_en")
    private String productNameEn;
    @JsonProperty("editors")
    private List<String> editors = null;
    @JsonProperty("emb_codes_orig")
    private String embCodesOrig;
    @JsonProperty("countries_hierarchy")
    private List<String> countriesHierarchy = null;
    @JsonProperty("checkers_tags")
    private List<Object> checkersTags = null;
    @JsonProperty("_keywords")
    private List<String> keywords = null;
    @JsonProperty("interface_version_modified")
    private String interfaceVersionModified;
    @JsonProperty("pnns_groups_1")
    private String pnnsGroups1;
    @JsonProperty("ingredients_percent_analysis")
    private Long ingredientsPercentAnalysis;
    @JsonProperty("serving_size")
    private String servingSize;
    @JsonProperty("unknown_ingredients_n")
    private Long unknownIngredientsN;
    @JsonProperty("additives_tags_n")
    private Object additivesTagsN;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("compared_to_category")
    private String comparedToCategory;
    @JsonProperty("packaging")
    private String packaging;
    @JsonProperty("nucleotides_tags")
    private List<Object> nucleotidesTags = null;
    @JsonProperty("generic_name")
    private String genericName;
    @JsonProperty("emb_codes")
    private String embCodes;
    @JsonProperty("lang_debug_tags")
    private List<Object> langDebugTags = null;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("packaging_debug_tags")
    private List<Object> packagingDebugTags = null;
    @JsonProperty("ingredients_text_debug")
    private String ingredientsTextDebug;
    @JsonProperty("interface_version_created")
    private String interfaceVersionCreated;
    @JsonProperty("manufacturing_places")
    private String manufacturingPlaces;
    @JsonProperty("vitamins_tags")
    private List<Object> vitaminsTags = null;
    @JsonProperty("allergens_from_ingredients")
    private String allergensFromIngredients;
    @JsonProperty("update_key")
    private String updateKey;
    @JsonProperty("nutrition_grade_fr")
    private String nutritionGradeFr;
    @JsonProperty("origins_debug_tags")
    private List<Object> originsDebugTags = null;
    @JsonProperty("category_properties")
    private CategoryProperties categoryProperties;
    @JsonProperty("nutrition_data_prepared_per_imported")
    private String nutritionDataPreparedPerImported;
    @JsonProperty("last_image_dates_tags")
    private List<String> lastImageDatesTags = null;
    @JsonProperty("misc_tags")
    private List<String> miscTags = null;
    @JsonProperty("languages_codes")
    private LanguagesCodes languagesCodes;
    @JsonProperty("purchase_places")
    private String purchasePlaces;
    @JsonProperty("nutrition_data_per_imported")
    private String nutritionDataPerImported;
    @JsonProperty("expiration_date")
    private String expirationDate;
    @JsonProperty("emb_codes_debug_tags")
    private List<Object> embCodesDebugTags = null;
    @JsonProperty("ingredients_that_may_be_from_palm_oil_n")
    private Long ingredientsThatMayBeFromPalmOilN;
    @JsonProperty("additives_old_n")
    private Long additivesOldN;
    @JsonProperty("data_quality_warnings_tags")
    private List<String> dataQualityWarningsTags = null;
    @JsonProperty("editors_tags")
    private List<String> editorsTags = null;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("origins")
    private String origins;
    @JsonProperty("labels_tags")
    private List<String> labelsTags = null;
    @JsonProperty("selected_images")
    private SelectedImages selectedImages;
    @JsonProperty("serving_size_imported")
    private String servingSizeImported;
    @JsonProperty("traces_debug_tags")
    private List<Object> tracesDebugTags = null;
    @JsonProperty("scans_n")
    private Long scansN;
    @JsonProperty("additives_debug_tags")
    private List<Object> additivesDebugTags = null;
    @JsonProperty("image_nutrition_url")
    private String imageNutritionUrl;
    @JsonProperty("sortkey")
    private Long sortkey;
    @JsonProperty("product_quantity")
    private String productQuantity;
    @JsonProperty("countries_imported")
    private String countriesImported;
    @JsonProperty("manufacturing_places_tags")
    private List<Object> manufacturingPlacesTags = null;
    @JsonProperty("image_front_url")
    private String imageFrontUrl;
    @JsonProperty("nutriscore_score")
    private Long nutriscoreScore;
    @JsonProperty("nova_group_debug")
    private String novaGroupDebug;
    @JsonProperty("serving_quantity")
    private String servingQuantity;
    @JsonProperty("completed_t")
    private Long completedT;
    @JsonProperty("pnns_groups_1_tags")
    private List<String> pnnsGroups1Tags = null;
    @JsonProperty("ingredients_analysis_tags")
    private List<String> ingredientsAnalysisTags = null;
    @JsonProperty("max_imgid")
    private String maxImgid;
    @JsonProperty("additives_original_tags")
    private List<String> additivesOriginalTags = null;
    @JsonProperty("cities_tags")
    private List<Object> citiesTags = null;
    @JsonProperty("states")
    private String states;
    @JsonProperty("purchase_places_tags")
    private List<Object> purchasePlacesTags = null;
    @JsonProperty("informers")
    private List<String> informers = null;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("nutriscore_grade")
    private String nutriscoreGrade;
    @JsonProperty("lc_imported")
    private String lcImported;
    @JsonProperty("last_edit_dates_tags")
    private List<String> lastEditDatesTags = null;
    @JsonProperty("code")
    private String code;
    @JsonProperty("image_nutrition_small_url")
    private String imageNutritionSmallUrl;
    @JsonProperty("correctors_tags")
    private List<String> correctorsTags = null;
    @JsonProperty("complete")
    private Long complete;
    @JsonProperty("allergens_hierarchy")
    private List<Object> allergensHierarchy = null;
    @JsonProperty("labels_prev_tags")
    private List<String> labelsPrevTags = null;
    @JsonProperty("completeness")
    private Float completeness;
    @JsonProperty("ingredients_hierarchy")
    private List<String> ingredientsHierarchy = null;
    @JsonProperty("data_sources_imported")
    private String dataSourcesImported;
    @JsonProperty("allergens")
    private String allergens;
    private final static long serialVersionUID = -6943041553837605815L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param nutriscoreScore
     * @param additivesOldN
     * @param labelsTags
     * @param miscTags
     * @param editorsTags
     * @param maxImgid
     * @param imageFrontSmallUrl
     * @param additivesPrevOriginalTags
     * @param novaGroupDebug
     * @param nutritionDataPrepared
     * @param embCodesOrig
     * @param photographers
     * @param additivesOldTags
     * @param nutriments
     * @param brandsDebugTags
     * @param labelsPrevHierarchy
     * @param allergensFromUser
     * @param originsDebugTags
     * @param vitaminsTags
     * @param nutritionDataPreparedPer
     * @param aminoAcidsTags
     * @param ingredientsIdsDebug
     * @param nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients
     * @param ingredientsTextEn
     * @param imageIngredientsUrl
     * @param embCodesTags
     * @param pnnsGroups2Tags
     * @param nutritionGradesTags
     * @param tracesFromIngredients
     * @param imageSmallUrl
     * @param countries
     * @param nucleotidesTags
     * @param labels
     * @param dataSourcesTags
     * @param additivesDebugTags
     * @param categoriesLc
     * @param statesTags
     * @param tracesHierarchy
     * @param nutritionGrades
     * @param additivesOriginalTags
     * @param nutritionDataPer
     * @param ingredients
     * @param origins
     * @param imageFrontUrl
     * @param servingSizeImported
     * @param uniqueScansN
     * @param brands
     * @param languages
     * @param nutritionDataPreparedPerDebugTags
     * @param brandOwner
     * @param allergensHierarchy
     * @param countriesLc
     * @param categoriesHierarchy
     * @param entryDatesTags
     * @param knownIngredientsN
     * @param tracesFromUser
     * @param nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue
     * @param novaGroup
     * @param packagingTags
     * @param codesTags
     * @param categoryProperties
     * @param embCodes20141016
     * @param keywords
     * @param genericName
     * @param imageNutritionSmallUrl
     * @param nutritionGradeFr
     * @param completeness
     * @param countriesHierarchy
     * @param popularityTags
     * @param dataQualityErrorsTags
     * @param nutrientLevelsTags
     * @param rev
     * @param statesHierarchy
     * @param languagesTags
     * @param correctors
     * @param scansN
     * @param dataQualityInfoTags
     * @param nucleotidesPrevTags
     * @param lastImageT
     * @param mineralsPrevTags
     * @param photographersTags
     * @param ingredientsTextWithAllergensEn
     * @param productQuantity
     * @param interfaceVersionModified
     * @param tracesDebugTags
     * @param ingredientsHierarchy
     * @param novaGroups
     * @param sources
     * @param servingQuantity
     * @param checkers
     * @param citiesTags
     * @param expirationDateDebugTags
     * @param ingredientsDebug
     * @param nutritionScoreBeverage
     * @param allergensTags
     * @param states
     * @param completedT
     * @param imageUrl
     * @param ingredientsOriginalTags
     * @param embCodesDebugTags
     * @param imageNutritionThumbUrl
     * @param debugParamSortedLangs
     * @param ingredientsTextEnImported
     * @param expirationDate
     * @param imageThumbUrl
     * @param interfaceVersionCreated
     * @param dataQualityWarningsTags
     * @param ingredientsAnalysisTags
     * @param countriesImported
     * @param packaging
     * @param createdT
     * @param purchasePlacesDebugTags
     * @param labelsLc
     * @param allergens
     * @param brandsTags
     * @param ingredientsTextWithAllergens
     * @param tracesTags
     * @param ingredientsTextEnDebugTags
     * @param productNameEn
     * @param pnnsGroups2
     * @param pnnsGroups1
     * @param additivesTagsN
     * @param ingredientsNTags
     * @param imageIngredientsSmallUrl
     * @param updateKey
     * @param lastModifiedT
     * @param productName
     * @param ingredientsN
     * @param storesTags
     * @param nutrientLevels
     * @param id
     * @param nutritionDataPerImported
     * @param labelsPrevTags
     * @param unknownNutrientsTags
     * @param labelsHierarchy
     * @param images
     * @param noNutritionData
     * @param servingSizeDebugTags
     * @param countriesDebugTags
     * @param informersTags
     * @param dataQualityBugsTags
     * @param informers
     * @param lastEditDatesTags
     * @param additivesTags
     * @param aminoAcidsPrevTags
     * @param ingredientsFromPalmOilTags
     * @param nutritionDataPerDebugTags
     * @param nutritionDataPreparedPerImported
     * @param ingredientsText
     * @param manufacturingPlaces
     * @param imageFrontThumbUrl
     * @param manufacturingPlacesDebugTags
     * @param languagesHierarchy
     * @param sortkey
     * @param languagesCodes
     * @param ingredientsFromPalmOilN
     * @param ingredientsFromOrThatMayBeFromPalmOilN
     * @param unknownIngredientsN
     * @param categories
     * @param creator
     * @param stores
     * @param ingredientsTextDebug
     * @param purchasePlacesTags
     * @param embCodes
     * @param allergensFromIngredients
     * @param lastEditor
     * @param lc
     * @param purchasePlaces
     * @param complete
     * @param lastImageDatesTags
     * @param comparedToCategory
     * @param brandOwnerImported
     * @param ingredientsPercentAnalysis
     * @param quantityDebugTags
     * @param linkDebugTags
     * @param categoriesImported
     * @param genericNameEnDebugTags
     * @param productNameEnDebugTags
     * @param nutritionData
     * @param ingredientsThatMayBeFromPalmOilN
     * @param checkersTags
     * @param packagingDebugTags
     * @param dataSources
     * @param selectedImages
     * @param correctorsTags
     * @param traces
     * @param novaGroupsTags
     * @param storesDebugTags
     * @param newAdditivesN
     * @param fruitsVegetablesNuts100gEstimate
     * @param categoriesTags
     * @param imageIngredientsThumbUrl
     * @param ingredientsTags
     * @param otherNutritionalSubstancesTags
     * @param langDebugTags
     * @param lcImported
     * @param pnnsGroups1Tags
     * @param countriesTags
     * @param code
     * @param genericNameEn
     * @param link
     * @param mineralsTags
     * @param vitaminsPrevTags
     * @param productNameEnImported
     * @param sourcesFields
     * @param dataQualityTags
     * @param nutriscoreData
     * @param imageNutritionUrl
     * @param lang
     * @param servingSize
     * @param editors
     * @param quantity
     * @param additivesN
     * @param dataSourcesImported
     * @param ciqualFoodNameTags
     * @param lastModifiedBy
     * @param nutriscoreGrade
     * @param ingredientsThatMayBeFromPalmOilTags
     * @param originsTags
     * @param manufacturingPlacesTags
     */
    public Product(String categoriesImported, String countriesLc, List<String> nutrientLevelsTags, List<String> pnnsGroups2Tags, List<String> statesTags, String embCodes20141016, List<String> labelsPrevHierarchy, String allergensFromUser, String nutritionDataPrepared, List<String> ingredientsNTags, String nutritionDataPer, List<Object> ingredientsThatMayBeFromPalmOilTags, List<Object> storesDebugTags, String quantity, List<Object> servingSizeDebugTags, String dataSources, List<String> photographers, List<Ingredient> ingredients, String noNutritionData, Long fruitsVegetablesNuts100gEstimate, Long lastImageT, List<Object> expirationDateDebugTags, List<String> ingredientsDebug, Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue, Long knownIngredientsN, SourcesFields sourcesFields, String creator, String stores, String ingredientsTextWithAllergens, String traces, Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients, List<String> informersTags, String lastEditor, List<Object> dataQualityErrorsTags, List<Object> embCodesTags, List<String> additivesTags, List<Object> aminoAcidsPrevTags, Long additivesN, List<String> codesTags, List<Object> unknownNutrientsTags, List<String> correctors, String novaGroups, List<String> originsTags, String productNameEnImported, List<Object> nutritionDataPreparedPerDebugTags, List<String> tracesTags, List<Object> genericNameEnDebugTags, List<Object> ingredientsTextEnDebugTags, List<Source> sources, String labelsLc, String imageIngredientsSmallUrl, List<Object> quantityDebugTags, Long novaGroup, List<String> categoriesHierarchy, List<String> languagesTags, Long newAdditivesN, Long rev, List<String> labelsHierarchy, List<Object> nucleotidesPrevTags, List<String> dataSourcesTags, List<Object> storesTags, List<Object> manufacturingPlacesDebugTags, String imageIngredientsThumbUrl, String nutritionDataPreparedPer, List<Object> productNameEnDebugTags, List<String> nutritionGradesTags, String nutritionGrades, String categoriesLc, List<String> ingredientsTags, List<String> tracesHierarchy, List<String> languagesHierarchy, String imageThumbUrl, Long createdT, String brandOwner, String imageFrontThumbUrl, List<String> packagingTags, Long ingredientsFromOrThatMayBeFromPalmOilN, List<Object> otherNutritionalSubstancesTags, List<String> additivesOldTags, List<Object> checkers, List<String> ciqualFoodNameTags, List<String> debugParamSortedLangs, List<Object> mineralsTags, String ingredientsTextEnImported, Images images, List<String> countriesTags, List<Object> vitaminsPrevTags, NutriscoreData nutriscoreData, NutrientLevels nutrientLevels, String link, List<String> ingredientsOriginalTags, String tracesFromIngredients, Long lastModifiedT, Nutriments nutriments, List<Object> allergensTags, String imageNutritionThumbUrl, Long ingredientsN, List<Object> brandsDebugTags, String imageSmallUrl, String ingredientsTextWithAllergensEn, List<String> brandsTags, List<Object> mineralsPrevTags, List<Object> ingredientsFromPalmOilTags, Long nutritionScoreBeverage, String ingredientsTextEn, List<String> ingredientsIdsDebug, String lastModifiedBy, String ingredientsText, String brands, String nutritionData, List<String> categoriesTags, List<Object> countriesDebugTags, String imageFrontSmallUrl, List<Object> linkDebugTags, String categories, List<String> dataQualityTags, List<String> dataQualityInfoTags, List<Object> nutritionDataPerDebugTags, List<Object> purchasePlacesDebugTags, String genericNameEn, String pnnsGroups2, String countries, String labels, List<Object> aminoAcidsTags, Long ingredientsFromPalmOilN, List<String> additivesPrevOriginalTags, List<String> statesHierarchy, Long uniqueScansN, String imageIngredientsUrl, List<String> popularityTags, List<Object> dataQualityBugsTags, String productName, List<String> photographersTags, String lc, String tracesFromUser, String brandOwnerImported, List<String> entryDatesTags, List<String> novaGroupsTags, String productNameEn, List<String> editors, String embCodesOrig, List<String> countriesHierarchy, List<Object> checkersTags, List<String> keywords, String interfaceVersionModified, String pnnsGroups1, Long ingredientsPercentAnalysis, String servingSize, Long unknownIngredientsN, Object additivesTagsN, String imageUrl, String comparedToCategory, String packaging, List<Object> nucleotidesTags, String genericName, String embCodes, List<Object> langDebugTags, String id, List<Object> packagingDebugTags, String ingredientsTextDebug, String interfaceVersionCreated, String manufacturingPlaces, List<Object> vitaminsTags, String allergensFromIngredients, String updateKey, String nutritionGradeFr, List<Object> originsDebugTags, CategoryProperties categoryProperties, String nutritionDataPreparedPerImported, List<String> lastImageDatesTags, List<String> miscTags, LanguagesCodes languagesCodes, String purchasePlaces, String nutritionDataPerImported, String expirationDate, List<Object> embCodesDebugTags, Long ingredientsThatMayBeFromPalmOilN, Long additivesOldN, List<String> dataQualityWarningsTags, List<String> editorsTags, Languages languages, String origins, List<String> labelsTags, SelectedImages selectedImages, String servingSizeImported, List<Object> tracesDebugTags, Long scansN, List<Object> additivesDebugTags, String imageNutritionUrl, Long sortkey, String productQuantity, String countriesImported, List<Object> manufacturingPlacesTags, String imageFrontUrl, Long nutriscoreScore, String novaGroupDebug, String servingQuantity, Long completedT, List<String> pnnsGroups1Tags, List<String> ingredientsAnalysisTags, String maxImgid, List<String> additivesOriginalTags, List<Object> citiesTags, String states, List<Object> purchasePlacesTags, List<String> informers, String lang, String nutriscoreGrade, String lcImported, List<String> lastEditDatesTags, String code, String imageNutritionSmallUrl, List<String> correctorsTags, Long complete, List<Object> allergensHierarchy, List<String> labelsPrevTags, Float completeness, List<String> ingredientsHierarchy, String dataSourcesImported, String allergens) {
        super();
        this.categoriesImported = categoriesImported;
        this.countriesLc = countriesLc;
        this.nutrientLevelsTags = nutrientLevelsTags;
        this.pnnsGroups2Tags = pnnsGroups2Tags;
        this.statesTags = statesTags;
        this.embCodes20141016 = embCodes20141016;
        this.labelsPrevHierarchy = labelsPrevHierarchy;
        this.allergensFromUser = allergensFromUser;
        this.nutritionDataPrepared = nutritionDataPrepared;
        this.ingredientsNTags = ingredientsNTags;
        this.nutritionDataPer = nutritionDataPer;
        this.ingredientsThatMayBeFromPalmOilTags = ingredientsThatMayBeFromPalmOilTags;
        this.storesDebugTags = storesDebugTags;
        this.quantity = quantity;
        this.servingSizeDebugTags = servingSizeDebugTags;
        this.dataSources = dataSources;
        this.photographers = photographers;
        this.ingredients = ingredients;
        this.noNutritionData = noNutritionData;
        this.fruitsVegetablesNuts100gEstimate = fruitsVegetablesNuts100gEstimate;
        this.lastImageT = lastImageT;
        this.expirationDateDebugTags = expirationDateDebugTags;
        this.ingredientsDebug = ingredientsDebug;
        this.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue = nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
        this.knownIngredientsN = knownIngredientsN;
        this.sourcesFields = sourcesFields;
        this.creator = creator;
        this.stores = stores;
        this.ingredientsTextWithAllergens = ingredientsTextWithAllergens;
        this.traces = traces;
        this.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients = nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
        this.informersTags = informersTags;
        this.lastEditor = lastEditor;
        this.dataQualityErrorsTags = dataQualityErrorsTags;
        this.embCodesTags = embCodesTags;
        this.additivesTags = additivesTags;
        this.aminoAcidsPrevTags = aminoAcidsPrevTags;
        this.additivesN = additivesN;
        this.codesTags = codesTags;
        this.unknownNutrientsTags = unknownNutrientsTags;
        this.correctors = correctors;
        this.novaGroups = novaGroups;
        this.originsTags = originsTags;
        this.productNameEnImported = productNameEnImported;
        this.nutritionDataPreparedPerDebugTags = nutritionDataPreparedPerDebugTags;
        this.tracesTags = tracesTags;
        this.genericNameEnDebugTags = genericNameEnDebugTags;
        this.ingredientsTextEnDebugTags = ingredientsTextEnDebugTags;
        this.sources = sources;
        this.labelsLc = labelsLc;
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
        this.quantityDebugTags = quantityDebugTags;
        this.novaGroup = novaGroup;
        this.categoriesHierarchy = categoriesHierarchy;
        this.languagesTags = languagesTags;
        this.newAdditivesN = newAdditivesN;
        this.rev = rev;
        this.labelsHierarchy = labelsHierarchy;
        this.nucleotidesPrevTags = nucleotidesPrevTags;
        this.dataSourcesTags = dataSourcesTags;
        this.storesTags = storesTags;
        this.manufacturingPlacesDebugTags = manufacturingPlacesDebugTags;
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
        this.nutritionDataPreparedPer = nutritionDataPreparedPer;
        this.productNameEnDebugTags = productNameEnDebugTags;
        this.nutritionGradesTags = nutritionGradesTags;
        this.nutritionGrades = nutritionGrades;
        this.categoriesLc = categoriesLc;
        this.ingredientsTags = ingredientsTags;
        this.tracesHierarchy = tracesHierarchy;
        this.languagesHierarchy = languagesHierarchy;
        this.imageThumbUrl = imageThumbUrl;
        this.createdT = createdT;
        this.brandOwner = brandOwner;
        this.imageFrontThumbUrl = imageFrontThumbUrl;
        this.packagingTags = packagingTags;
        this.ingredientsFromOrThatMayBeFromPalmOilN = ingredientsFromOrThatMayBeFromPalmOilN;
        this.otherNutritionalSubstancesTags = otherNutritionalSubstancesTags;
        this.additivesOldTags = additivesOldTags;
        this.checkers = checkers;
        this.ciqualFoodNameTags = ciqualFoodNameTags;
        this.debugParamSortedLangs = debugParamSortedLangs;
        this.mineralsTags = mineralsTags;
        this.ingredientsTextEnImported = ingredientsTextEnImported;
        this.images = images;
        this.countriesTags = countriesTags;
        this.vitaminsPrevTags = vitaminsPrevTags;
        this.nutriscoreData = nutriscoreData;
        this.nutrientLevels = nutrientLevels;
        this.link = link;
        this.ingredientsOriginalTags = ingredientsOriginalTags;
        this.tracesFromIngredients = tracesFromIngredients;
        this.lastModifiedT = lastModifiedT;
        this.nutriments = nutriments;
        this.allergensTags = allergensTags;
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
        this.ingredientsN = ingredientsN;
        this.brandsDebugTags = brandsDebugTags;
        this.imageSmallUrl = imageSmallUrl;
        this.ingredientsTextWithAllergensEn = ingredientsTextWithAllergensEn;
        this.brandsTags = brandsTags;
        this.mineralsPrevTags = mineralsPrevTags;
        this.ingredientsFromPalmOilTags = ingredientsFromPalmOilTags;
        this.nutritionScoreBeverage = nutritionScoreBeverage;
        this.ingredientsTextEn = ingredientsTextEn;
        this.ingredientsIdsDebug = ingredientsIdsDebug;
        this.lastModifiedBy = lastModifiedBy;
        this.ingredientsText = ingredientsText;
        this.brands = brands;
        this.nutritionData = nutritionData;
        this.categoriesTags = categoriesTags;
        this.countriesDebugTags = countriesDebugTags;
        this.imageFrontSmallUrl = imageFrontSmallUrl;
        this.linkDebugTags = linkDebugTags;
        this.categories = categories;
        this.dataQualityTags = dataQualityTags;
        this.dataQualityInfoTags = dataQualityInfoTags;
        this.nutritionDataPerDebugTags = nutritionDataPerDebugTags;
        this.purchasePlacesDebugTags = purchasePlacesDebugTags;
        this.genericNameEn = genericNameEn;
        this.pnnsGroups2 = pnnsGroups2;
        this.countries = countries;
        this.labels = labels;
        this.aminoAcidsTags = aminoAcidsTags;
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
        this.additivesPrevOriginalTags = additivesPrevOriginalTags;
        this.statesHierarchy = statesHierarchy;
        this.uniqueScansN = uniqueScansN;
        this.imageIngredientsUrl = imageIngredientsUrl;
        this.popularityTags = popularityTags;
        this.dataQualityBugsTags = dataQualityBugsTags;
        this.productName = productName;
        this.photographersTags = photographersTags;
        this.lc = lc;
        this.tracesFromUser = tracesFromUser;
        this.brandOwnerImported = brandOwnerImported;
        this.entryDatesTags = entryDatesTags;
        this.novaGroupsTags = novaGroupsTags;
        this.productNameEn = productNameEn;
        this.editors = editors;
        this.embCodesOrig = embCodesOrig;
        this.countriesHierarchy = countriesHierarchy;
        this.checkersTags = checkersTags;
        this.keywords = keywords;
        this.interfaceVersionModified = interfaceVersionModified;
        this.pnnsGroups1 = pnnsGroups1;
        this.ingredientsPercentAnalysis = ingredientsPercentAnalysis;
        this.servingSize = servingSize;
        this.unknownIngredientsN = unknownIngredientsN;
        this.additivesTagsN = additivesTagsN;
        this.imageUrl = imageUrl;
        this.comparedToCategory = comparedToCategory;
        this.packaging = packaging;
        this.nucleotidesTags = nucleotidesTags;
        this.genericName = genericName;
        this.embCodes = embCodes;
        this.langDebugTags = langDebugTags;
        this.id = id;
        this.packagingDebugTags = packagingDebugTags;
        this.ingredientsTextDebug = ingredientsTextDebug;
        this.interfaceVersionCreated = interfaceVersionCreated;
        this.manufacturingPlaces = manufacturingPlaces;
        this.vitaminsTags = vitaminsTags;
        this.allergensFromIngredients = allergensFromIngredients;
        this.updateKey = updateKey;
        this.nutritionGradeFr = nutritionGradeFr;
        this.originsDebugTags = originsDebugTags;
        this.categoryProperties = categoryProperties;
        this.nutritionDataPreparedPerImported = nutritionDataPreparedPerImported;
        this.lastImageDatesTags = lastImageDatesTags;
        this.miscTags = miscTags;
        this.languagesCodes = languagesCodes;
        this.purchasePlaces = purchasePlaces;
        this.nutritionDataPerImported = nutritionDataPerImported;
        this.expirationDate = expirationDate;
        this.embCodesDebugTags = embCodesDebugTags;
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
        this.additivesOldN = additivesOldN;
        this.dataQualityWarningsTags = dataQualityWarningsTags;
        this.editorsTags = editorsTags;
        this.languages = languages;
        this.origins = origins;
        this.labelsTags = labelsTags;
        this.selectedImages = selectedImages;
        this.servingSizeImported = servingSizeImported;
        this.tracesDebugTags = tracesDebugTags;
        this.scansN = scansN;
        this.additivesDebugTags = additivesDebugTags;
        this.imageNutritionUrl = imageNutritionUrl;
        this.sortkey = sortkey;
        this.productQuantity = productQuantity;
        this.countriesImported = countriesImported;
        this.manufacturingPlacesTags = manufacturingPlacesTags;
        this.imageFrontUrl = imageFrontUrl;
        this.nutriscoreScore = nutriscoreScore;
        this.novaGroupDebug = novaGroupDebug;
        this.servingQuantity = servingQuantity;
        this.completedT = completedT;
        this.pnnsGroups1Tags = pnnsGroups1Tags;
        this.ingredientsAnalysisTags = ingredientsAnalysisTags;
        this.maxImgid = maxImgid;
        this.additivesOriginalTags = additivesOriginalTags;
        this.citiesTags = citiesTags;
        this.states = states;
        this.purchasePlacesTags = purchasePlacesTags;
        this.informers = informers;
        this.lang = lang;
        this.nutriscoreGrade = nutriscoreGrade;
        this.lcImported = lcImported;
        this.lastEditDatesTags = lastEditDatesTags;
        this.code = code;
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
        this.correctorsTags = correctorsTags;
        this.complete = complete;
        this.allergensHierarchy = allergensHierarchy;
        this.labelsPrevTags = labelsPrevTags;
        this.completeness = completeness;
        this.ingredientsHierarchy = ingredientsHierarchy;
        this.dataSourcesImported = dataSourcesImported;
        this.allergens = allergens;
    }

    @JsonProperty("categories_imported")
    public String getCategoriesImported() {
        return categoriesImported;
    }

    @JsonProperty("categories_imported")
    public void setCategoriesImported(String categoriesImported) {
        this.categoriesImported = categoriesImported;
    }

    @JsonProperty("countries_lc")
    public String getCountriesLc() {
        return countriesLc;
    }

    @JsonProperty("countries_lc")
    public void setCountriesLc(String countriesLc) {
        this.countriesLc = countriesLc;
    }

    @JsonProperty("nutrient_levels_tags")
    public List<String> getNutrientLevelsTags() {
        return nutrientLevelsTags;
    }

    @JsonProperty("nutrient_levels_tags")
    public void setNutrientLevelsTags(List<String> nutrientLevelsTags) {
        this.nutrientLevelsTags = nutrientLevelsTags;
    }

    @JsonProperty("pnns_groups_2_tags")
    public List<String> getPnnsGroups2Tags() {
        return pnnsGroups2Tags;
    }

    @JsonProperty("pnns_groups_2_tags")
    public void setPnnsGroups2Tags(List<String> pnnsGroups2Tags) {
        this.pnnsGroups2Tags = pnnsGroups2Tags;
    }

    @JsonProperty("states_tags")
    public List<String> getStatesTags() {
        return statesTags;
    }

    @JsonProperty("states_tags")
    public void setStatesTags(List<String> statesTags) {
        this.statesTags = statesTags;
    }

    @JsonProperty("emb_codes_20141016")
    public String getEmbCodes20141016() {
        return embCodes20141016;
    }

    @JsonProperty("emb_codes_20141016")
    public void setEmbCodes20141016(String embCodes20141016) {
        this.embCodes20141016 = embCodes20141016;
    }

    @JsonProperty("labels_prev_hierarchy")
    public List<String> getLabelsPrevHierarchy() {
        return labelsPrevHierarchy;
    }

    @JsonProperty("labels_prev_hierarchy")
    public void setLabelsPrevHierarchy(List<String> labelsPrevHierarchy) {
        this.labelsPrevHierarchy = labelsPrevHierarchy;
    }

    @JsonProperty("allergens_from_user")
    public String getAllergensFromUser() {
        return allergensFromUser;
    }

    @JsonProperty("allergens_from_user")
    public void setAllergensFromUser(String allergensFromUser) {
        this.allergensFromUser = allergensFromUser;
    }

    @JsonProperty("nutrition_data_prepared")
    public String getNutritionDataPrepared() {
        return nutritionDataPrepared;
    }

    @JsonProperty("nutrition_data_prepared")
    public void setNutritionDataPrepared(String nutritionDataPrepared) {
        this.nutritionDataPrepared = nutritionDataPrepared;
    }

    @JsonProperty("ingredients_n_tags")
    public List<String> getIngredientsNTags() {
        return ingredientsNTags;
    }

    @JsonProperty("ingredients_n_tags")
    public void setIngredientsNTags(List<String> ingredientsNTags) {
        this.ingredientsNTags = ingredientsNTags;
    }

    @JsonProperty("nutrition_data_per")
    public String getNutritionDataPer() {
        return nutritionDataPer;
    }

    @JsonProperty("nutrition_data_per")
    public void setNutritionDataPer(String nutritionDataPer) {
        this.nutritionDataPer = nutritionDataPer;
    }

    @JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
    public List<Object> getIngredientsThatMayBeFromPalmOilTags() {
        return ingredientsThatMayBeFromPalmOilTags;
    }

    @JsonProperty("ingredients_that_may_be_from_palm_oil_tags")
    public void setIngredientsThatMayBeFromPalmOilTags(List<Object> ingredientsThatMayBeFromPalmOilTags) {
        this.ingredientsThatMayBeFromPalmOilTags = ingredientsThatMayBeFromPalmOilTags;
    }

    @JsonProperty("stores_debug_tags")
    public List<Object> getStoresDebugTags() {
        return storesDebugTags;
    }

    @JsonProperty("stores_debug_tags")
    public void setStoresDebugTags(List<Object> storesDebugTags) {
        this.storesDebugTags = storesDebugTags;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("serving_size_debug_tags")
    public List<Object> getServingSizeDebugTags() {
        return servingSizeDebugTags;
    }

    @JsonProperty("serving_size_debug_tags")
    public void setServingSizeDebugTags(List<Object> servingSizeDebugTags) {
        this.servingSizeDebugTags = servingSizeDebugTags;
    }

    @JsonProperty("data_sources")
    public String getDataSources() {
        return dataSources;
    }

    @JsonProperty("data_sources")
    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
    }

    @JsonProperty("photographers")
    public List<String> getPhotographers() {
        return photographers;
    }

    @JsonProperty("photographers")
    public void setPhotographers(List<String> photographers) {
        this.photographers = photographers;
    }

    @JsonProperty("ingredients")
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("no_nutrition_data")
    public String getNoNutritionData() {
        return noNutritionData;
    }

    @JsonProperty("no_nutrition_data")
    public void setNoNutritionData(String noNutritionData) {
        this.noNutritionData = noNutritionData;
    }

    @JsonProperty("fruits-vegetables-nuts_100g_estimate")
    public Long getFruitsVegetablesNuts100gEstimate() {
        return fruitsVegetablesNuts100gEstimate;
    }

    @JsonProperty("fruits-vegetables-nuts_100g_estimate")
    public void setFruitsVegetablesNuts100gEstimate(Long fruitsVegetablesNuts100gEstimate) {
        this.fruitsVegetablesNuts100gEstimate = fruitsVegetablesNuts100gEstimate;
    }

    @JsonProperty("last_image_t")
    public Long getLastImageT() {
        return lastImageT;
    }

    @JsonProperty("last_image_t")
    public void setLastImageT(Long lastImageT) {
        this.lastImageT = lastImageT;
    }

    @JsonProperty("expiration_date_debug_tags")
    public List<Object> getExpirationDateDebugTags() {
        return expirationDateDebugTags;
    }

    @JsonProperty("expiration_date_debug_tags")
    public void setExpirationDateDebugTags(List<Object> expirationDateDebugTags) {
        this.expirationDateDebugTags = expirationDateDebugTags;
    }

    @JsonProperty("ingredients_debug")
    public List<String> getIngredientsDebug() {
        return ingredientsDebug;
    }

    @JsonProperty("ingredients_debug")
    public void setIngredientsDebug(List<String> ingredientsDebug) {
        this.ingredientsDebug = ingredientsDebug;
    }

    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
    public Long getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue() {
        return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
    }

    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value")
    public void setNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue(Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue) {
        this.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue = nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue;
    }

    @JsonProperty("known_ingredients_n")
    public Long getKnownIngredientsN() {
        return knownIngredientsN;
    }

    @JsonProperty("known_ingredients_n")
    public void setKnownIngredientsN(Long knownIngredientsN) {
        this.knownIngredientsN = knownIngredientsN;
    }

    @JsonProperty("sources_fields")
    public SourcesFields getSourcesFields() {
        return sourcesFields;
    }

    @JsonProperty("sources_fields")
    public void setSourcesFields(SourcesFields sourcesFields) {
        this.sourcesFields = sourcesFields;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("stores")
    public String getStores() {
        return stores;
    }

    @JsonProperty("stores")
    public void setStores(String stores) {
        this.stores = stores;
    }

    @JsonProperty("ingredients_text_with_allergens")
    public String getIngredientsTextWithAllergens() {
        return ingredientsTextWithAllergens;
    }

    @JsonProperty("ingredients_text_with_allergens")
    public void setIngredientsTextWithAllergens(String ingredientsTextWithAllergens) {
        this.ingredientsTextWithAllergens = ingredientsTextWithAllergens;
    }

    @JsonProperty("traces")
    public String getTraces() {
        return traces;
    }

    @JsonProperty("traces")
    public void setTraces(String traces) {
        this.traces = traces;
    }

    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
    public Long getNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients() {
        return nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
    }

    @JsonProperty("nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients")
    public void setNutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients(Long nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients) {
        this.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients = nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients;
    }

    @JsonProperty("informers_tags")
    public List<String> getInformersTags() {
        return informersTags;
    }

    @JsonProperty("informers_tags")
    public void setInformersTags(List<String> informersTags) {
        this.informersTags = informersTags;
    }

    @JsonProperty("last_editor")
    public String getLastEditor() {
        return lastEditor;
    }

    @JsonProperty("last_editor")
    public void setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
    }

    @JsonProperty("data_quality_errors_tags")
    public List<Object> getDataQualityErrorsTags() {
        return dataQualityErrorsTags;
    }

    @JsonProperty("data_quality_errors_tags")
    public void setDataQualityErrorsTags(List<Object> dataQualityErrorsTags) {
        this.dataQualityErrorsTags = dataQualityErrorsTags;
    }

    @JsonProperty("emb_codes_tags")
    public List<Object> getEmbCodesTags() {
        return embCodesTags;
    }

    @JsonProperty("emb_codes_tags")
    public void setEmbCodesTags(List<Object> embCodesTags) {
        this.embCodesTags = embCodesTags;
    }

    @JsonProperty("additives_tags")
    public List<String> getAdditivesTags() {
        return additivesTags;
    }

    @JsonProperty("additives_tags")
    public void setAdditivesTags(List<String> additivesTags) {
        this.additivesTags = additivesTags;
    }

    @JsonProperty("amino_acids_prev_tags")
    public List<Object> getAminoAcidsPrevTags() {
        return aminoAcidsPrevTags;
    }

    @JsonProperty("amino_acids_prev_tags")
    public void setAminoAcidsPrevTags(List<Object> aminoAcidsPrevTags) {
        this.aminoAcidsPrevTags = aminoAcidsPrevTags;
    }

    @JsonProperty("additives_n")
    public Long getAdditivesN() {
        return additivesN;
    }

    @JsonProperty("additives_n")
    public void setAdditivesN(Long additivesN) {
        this.additivesN = additivesN;
    }

    @JsonProperty("codes_tags")
    public List<String> getCodesTags() {
        return codesTags;
    }

    @JsonProperty("codes_tags")
    public void setCodesTags(List<String> codesTags) {
        this.codesTags = codesTags;
    }

    @JsonProperty("unknown_nutrients_tags")
    public List<Object> getUnknownNutrientsTags() {
        return unknownNutrientsTags;
    }

    @JsonProperty("unknown_nutrients_tags")
    public void setUnknownNutrientsTags(List<Object> unknownNutrientsTags) {
        this.unknownNutrientsTags = unknownNutrientsTags;
    }

    @JsonProperty("correctors")
    public List<String> getCorrectors() {
        return correctors;
    }

    @JsonProperty("correctors")
    public void setCorrectors(List<String> correctors) {
        this.correctors = correctors;
    }

    @JsonProperty("nova_groups")
    public String getNovaGroups() {
        return novaGroups;
    }

    @JsonProperty("nova_groups")
    public void setNovaGroups(String novaGroups) {
        this.novaGroups = novaGroups;
    }

    @JsonProperty("origins_tags")
    public List<String> getOriginsTags() {
        return originsTags;
    }

    @JsonProperty("origins_tags")
    public void setOriginsTags(List<String> originsTags) {
        this.originsTags = originsTags;
    }

    @JsonProperty("product_name_en_imported")
    public String getProductNameEnImported() {
        return productNameEnImported;
    }

    @JsonProperty("product_name_en_imported")
    public void setProductNameEnImported(String productNameEnImported) {
        this.productNameEnImported = productNameEnImported;
    }

    @JsonProperty("nutrition_data_prepared_per_debug_tags")
    public List<Object> getNutritionDataPreparedPerDebugTags() {
        return nutritionDataPreparedPerDebugTags;
    }

    @JsonProperty("nutrition_data_prepared_per_debug_tags")
    public void setNutritionDataPreparedPerDebugTags(List<Object> nutritionDataPreparedPerDebugTags) {
        this.nutritionDataPreparedPerDebugTags = nutritionDataPreparedPerDebugTags;
    }

    @JsonProperty("traces_tags")
    public List<String> getTracesTags() {
        return tracesTags;
    }

    @JsonProperty("traces_tags")
    public void setTracesTags(List<String> tracesTags) {
        this.tracesTags = tracesTags;
    }

    @JsonProperty("generic_name_en_debug_tags")
    public List<Object> getGenericNameEnDebugTags() {
        return genericNameEnDebugTags;
    }

    @JsonProperty("generic_name_en_debug_tags")
    public void setGenericNameEnDebugTags(List<Object> genericNameEnDebugTags) {
        this.genericNameEnDebugTags = genericNameEnDebugTags;
    }

    @JsonProperty("ingredients_text_en_debug_tags")
    public List<Object> getIngredientsTextEnDebugTags() {
        return ingredientsTextEnDebugTags;
    }

    @JsonProperty("ingredients_text_en_debug_tags")
    public void setIngredientsTextEnDebugTags(List<Object> ingredientsTextEnDebugTags) {
        this.ingredientsTextEnDebugTags = ingredientsTextEnDebugTags;
    }

    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    @JsonProperty("labels_lc")
    public String getLabelsLc() {
        return labelsLc;
    }

    @JsonProperty("labels_lc")
    public void setLabelsLc(String labelsLc) {
        this.labelsLc = labelsLc;
    }

    @JsonProperty("image_ingredients_small_url")
    public String getImageIngredientsSmallUrl() {
        return imageIngredientsSmallUrl;
    }

    @JsonProperty("image_ingredients_small_url")
    public void setImageIngredientsSmallUrl(String imageIngredientsSmallUrl) {
        this.imageIngredientsSmallUrl = imageIngredientsSmallUrl;
    }

    @JsonProperty("quantity_debug_tags")
    public List<Object> getQuantityDebugTags() {
        return quantityDebugTags;
    }

    @JsonProperty("quantity_debug_tags")
    public void setQuantityDebugTags(List<Object> quantityDebugTags) {
        this.quantityDebugTags = quantityDebugTags;
    }

    @JsonProperty("nova_group")
    public Long getNovaGroup() {
        return novaGroup;
    }

    @JsonProperty("nova_group")
    public void setNovaGroup(Long novaGroup) {
        this.novaGroup = novaGroup;
    }

    @JsonProperty("categories_hierarchy")
    public List<String> getCategoriesHierarchy() {
        return categoriesHierarchy;
    }

    @JsonProperty("categories_hierarchy")
    public void setCategoriesHierarchy(List<String> categoriesHierarchy) {
        this.categoriesHierarchy = categoriesHierarchy;
    }

    @JsonProperty("languages_tags")
    public List<String> getLanguagesTags() {
        return languagesTags;
    }

    @JsonProperty("languages_tags")
    public void setLanguagesTags(List<String> languagesTags) {
        this.languagesTags = languagesTags;
    }

    @JsonProperty("new_additives_n")
    public Long getNewAdditivesN() {
        return newAdditivesN;
    }

    @JsonProperty("new_additives_n")
    public void setNewAdditivesN(Long newAdditivesN) {
        this.newAdditivesN = newAdditivesN;
    }

    @JsonProperty("rev")
    public Long getRev() {
        return rev;
    }

    @JsonProperty("rev")
    public void setRev(Long rev) {
        this.rev = rev;
    }

    @JsonProperty("labels_hierarchy")
    public List<String> getLabelsHierarchy() {
        return labelsHierarchy;
    }

    @JsonProperty("labels_hierarchy")
    public void setLabelsHierarchy(List<String> labelsHierarchy) {
        this.labelsHierarchy = labelsHierarchy;
    }

    @JsonProperty("nucleotides_prev_tags")
    public List<Object> getNucleotidesPrevTags() {
        return nucleotidesPrevTags;
    }

    @JsonProperty("nucleotides_prev_tags")
    public void setNucleotidesPrevTags(List<Object> nucleotidesPrevTags) {
        this.nucleotidesPrevTags = nucleotidesPrevTags;
    }

    @JsonProperty("data_sources_tags")
    public List<String> getDataSourcesTags() {
        return dataSourcesTags;
    }

    @JsonProperty("data_sources_tags")
    public void setDataSourcesTags(List<String> dataSourcesTags) {
        this.dataSourcesTags = dataSourcesTags;
    }

    @JsonProperty("stores_tags")
    public List<Object> getStoresTags() {
        return storesTags;
    }

    @JsonProperty("stores_tags")
    public void setStoresTags(List<Object> storesTags) {
        this.storesTags = storesTags;
    }

    @JsonProperty("manufacturing_places_debug_tags")
    public List<Object> getManufacturingPlacesDebugTags() {
        return manufacturingPlacesDebugTags;
    }

    @JsonProperty("manufacturing_places_debug_tags")
    public void setManufacturingPlacesDebugTags(List<Object> manufacturingPlacesDebugTags) {
        this.manufacturingPlacesDebugTags = manufacturingPlacesDebugTags;
    }

    @JsonProperty("image_ingredients_thumb_url")
    public String getImageIngredientsThumbUrl() {
        return imageIngredientsThumbUrl;
    }

    @JsonProperty("image_ingredients_thumb_url")
    public void setImageIngredientsThumbUrl(String imageIngredientsThumbUrl) {
        this.imageIngredientsThumbUrl = imageIngredientsThumbUrl;
    }

    @JsonProperty("nutrition_data_prepared_per")
    public String getNutritionDataPreparedPer() {
        return nutritionDataPreparedPer;
    }

    @JsonProperty("nutrition_data_prepared_per")
    public void setNutritionDataPreparedPer(String nutritionDataPreparedPer) {
        this.nutritionDataPreparedPer = nutritionDataPreparedPer;
    }

    @JsonProperty("product_name_en_debug_tags")
    public List<Object> getProductNameEnDebugTags() {
        return productNameEnDebugTags;
    }

    @JsonProperty("product_name_en_debug_tags")
    public void setProductNameEnDebugTags(List<Object> productNameEnDebugTags) {
        this.productNameEnDebugTags = productNameEnDebugTags;
    }

    @JsonProperty("nutrition_grades_tags")
    public List<String> getNutritionGradesTags() {
        return nutritionGradesTags;
    }

    @JsonProperty("nutrition_grades_tags")
    public void setNutritionGradesTags(List<String> nutritionGradesTags) {
        this.nutritionGradesTags = nutritionGradesTags;
    }

    @JsonProperty("nutrition_grades")
    public String getNutritionGrades() {
        return nutritionGrades;
    }

    @JsonProperty("nutrition_grades")
    public void setNutritionGrades(String nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    @JsonProperty("categories_lc")
    public String getCategoriesLc() {
        return categoriesLc;
    }

    @JsonProperty("categories_lc")
    public void setCategoriesLc(String categoriesLc) {
        this.categoriesLc = categoriesLc;
    }

    @JsonProperty("ingredients_tags")
    public List<String> getIngredientsTags() {
        return ingredientsTags;
    }

    @JsonProperty("ingredients_tags")
    public void setIngredientsTags(List<String> ingredientsTags) {
        this.ingredientsTags = ingredientsTags;
    }

    @JsonProperty("traces_hierarchy")
    public List<String> getTracesHierarchy() {
        return tracesHierarchy;
    }

    @JsonProperty("traces_hierarchy")
    public void setTracesHierarchy(List<String> tracesHierarchy) {
        this.tracesHierarchy = tracesHierarchy;
    }

    @JsonProperty("languages_hierarchy")
    public List<String> getLanguagesHierarchy() {
        return languagesHierarchy;
    }

    @JsonProperty("languages_hierarchy")
    public void setLanguagesHierarchy(List<String> languagesHierarchy) {
        this.languagesHierarchy = languagesHierarchy;
    }

    @JsonProperty("image_thumb_url")
    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    @JsonProperty("image_thumb_url")
    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    @JsonProperty("created_t")
    public Long getCreatedT() {
        return createdT;
    }

    @JsonProperty("created_t")
    public void setCreatedT(Long createdT) {
        this.createdT = createdT;
    }

    @JsonProperty("brand_owner")
    public String getBrandOwner() {
        return brandOwner;
    }

    @JsonProperty("brand_owner")
    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    @JsonProperty("image_front_thumb_url")
    public String getImageFrontThumbUrl() {
        return imageFrontThumbUrl;
    }

    @JsonProperty("image_front_thumb_url")
    public void setImageFrontThumbUrl(String imageFrontThumbUrl) {
        this.imageFrontThumbUrl = imageFrontThumbUrl;
    }

    @JsonProperty("packaging_tags")
    public List<String> getPackagingTags() {
        return packagingTags;
    }

    @JsonProperty("packaging_tags")
    public void setPackagingTags(List<String> packagingTags) {
        this.packagingTags = packagingTags;
    }

    @JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    public Long getIngredientsFromOrThatMayBeFromPalmOilN() {
        return ingredientsFromOrThatMayBeFromPalmOilN;
    }

    @JsonProperty("ingredients_from_or_that_may_be_from_palm_oil_n")
    public void setIngredientsFromOrThatMayBeFromPalmOilN(Long ingredientsFromOrThatMayBeFromPalmOilN) {
        this.ingredientsFromOrThatMayBeFromPalmOilN = ingredientsFromOrThatMayBeFromPalmOilN;
    }

    @JsonProperty("other_nutritional_substances_tags")
    public List<Object> getOtherNutritionalSubstancesTags() {
        return otherNutritionalSubstancesTags;
    }

    @JsonProperty("other_nutritional_substances_tags")
    public void setOtherNutritionalSubstancesTags(List<Object> otherNutritionalSubstancesTags) {
        this.otherNutritionalSubstancesTags = otherNutritionalSubstancesTags;
    }

    @JsonProperty("additives_old_tags")
    public List<String> getAdditivesOldTags() {
        return additivesOldTags;
    }

    @JsonProperty("additives_old_tags")
    public void setAdditivesOldTags(List<String> additivesOldTags) {
        this.additivesOldTags = additivesOldTags;
    }

    @JsonProperty("checkers")
    public List<Object> getCheckers() {
        return checkers;
    }

    @JsonProperty("checkers")
    public void setCheckers(List<Object> checkers) {
        this.checkers = checkers;
    }

    @JsonProperty("ciqual_food_name_tags")
    public List<String> getCiqualFoodNameTags() {
        return ciqualFoodNameTags;
    }

    @JsonProperty("ciqual_food_name_tags")
    public void setCiqualFoodNameTags(List<String> ciqualFoodNameTags) {
        this.ciqualFoodNameTags = ciqualFoodNameTags;
    }

    @JsonProperty("debug_param_sorted_langs")
    public List<String> getDebugParamSortedLangs() {
        return debugParamSortedLangs;
    }

    @JsonProperty("debug_param_sorted_langs")
    public void setDebugParamSortedLangs(List<String> debugParamSortedLangs) {
        this.debugParamSortedLangs = debugParamSortedLangs;
    }

    @JsonProperty("minerals_tags")
    public List<Object> getMineralsTags() {
        return mineralsTags;
    }

    @JsonProperty("minerals_tags")
    public void setMineralsTags(List<Object> mineralsTags) {
        this.mineralsTags = mineralsTags;
    }

    @JsonProperty("ingredients_text_en_imported")
    public String getIngredientsTextEnImported() {
        return ingredientsTextEnImported;
    }

    @JsonProperty("ingredients_text_en_imported")
    public void setIngredientsTextEnImported(String ingredientsTextEnImported) {
        this.ingredientsTextEnImported = ingredientsTextEnImported;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("countries_tags")
    public List<String> getCountriesTags() {
        return countriesTags;
    }

    @JsonProperty("countries_tags")
    public void setCountriesTags(List<String> countriesTags) {
        this.countriesTags = countriesTags;
    }

    @JsonProperty("vitamins_prev_tags")
    public List<Object> getVitaminsPrevTags() {
        return vitaminsPrevTags;
    }

    @JsonProperty("vitamins_prev_tags")
    public void setVitaminsPrevTags(List<Object> vitaminsPrevTags) {
        this.vitaminsPrevTags = vitaminsPrevTags;
    }

    @JsonProperty("nutriscore_data")
    public NutriscoreData getNutriscoreData() {
        return nutriscoreData;
    }

    @JsonProperty("nutriscore_data")
    public void setNutriscoreData(NutriscoreData nutriscoreData) {
        this.nutriscoreData = nutriscoreData;
    }

    @JsonProperty("nutrient_levels")
    public NutrientLevels getNutrientLevels() {
        return nutrientLevels;
    }

    @JsonProperty("nutrient_levels")
    public void setNutrientLevels(NutrientLevels nutrientLevels) {
        this.nutrientLevels = nutrientLevels;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("ingredients_original_tags")
    public List<String> getIngredientsOriginalTags() {
        return ingredientsOriginalTags;
    }

    @JsonProperty("ingredients_original_tags")
    public void setIngredientsOriginalTags(List<String> ingredientsOriginalTags) {
        this.ingredientsOriginalTags = ingredientsOriginalTags;
    }

    @JsonProperty("traces_from_ingredients")
    public String getTracesFromIngredients() {
        return tracesFromIngredients;
    }

    @JsonProperty("traces_from_ingredients")
    public void setTracesFromIngredients(String tracesFromIngredients) {
        this.tracesFromIngredients = tracesFromIngredients;
    }

    @JsonProperty("last_modified_t")
    public Long getLastModifiedT() {
        return lastModifiedT;
    }

    @JsonProperty("last_modified_t")
    public void setLastModifiedT(Long lastModifiedT) {
        this.lastModifiedT = lastModifiedT;
    }

    @JsonProperty("nutriments")
    public Nutriments getNutriments() {
        return nutriments;
    }

    @JsonProperty("nutriments")
    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    @JsonProperty("allergens_tags")
    public List<Object> getAllergensTags() {
        return allergensTags;
    }

    @JsonProperty("allergens_tags")
    public void setAllergensTags(List<Object> allergensTags) {
        this.allergensTags = allergensTags;
    }

    @JsonProperty("image_nutrition_thumb_url")
    public String getImageNutritionThumbUrl() {
        return imageNutritionThumbUrl;
    }

    @JsonProperty("image_nutrition_thumb_url")
    public void setImageNutritionThumbUrl(String imageNutritionThumbUrl) {
        this.imageNutritionThumbUrl = imageNutritionThumbUrl;
    }

    @JsonProperty("ingredients_n")
    public Long getIngredientsN() {
        return ingredientsN;
    }

    @JsonProperty("ingredients_n")
    public void setIngredientsN(Long ingredientsN) {
        this.ingredientsN = ingredientsN;
    }

    @JsonProperty("brands_debug_tags")
    public List<Object> getBrandsDebugTags() {
        return brandsDebugTags;
    }

    @JsonProperty("brands_debug_tags")
    public void setBrandsDebugTags(List<Object> brandsDebugTags) {
        this.brandsDebugTags = brandsDebugTags;
    }

    @JsonProperty("image_small_url")
    public String getImageSmallUrl() {
        return imageSmallUrl;
    }

    @JsonProperty("image_small_url")
    public void setImageSmallUrl(String imageSmallUrl) {
        this.imageSmallUrl = imageSmallUrl;
    }

    @JsonProperty("ingredients_text_with_allergens_en")
    public String getIngredientsTextWithAllergensEn() {
        return ingredientsTextWithAllergensEn;
    }

    @JsonProperty("ingredients_text_with_allergens_en")
    public void setIngredientsTextWithAllergensEn(String ingredientsTextWithAllergensEn) {
        this.ingredientsTextWithAllergensEn = ingredientsTextWithAllergensEn;
    }

    @JsonProperty("brands_tags")
    public List<String> getBrandsTags() {
        return brandsTags;
    }

    @JsonProperty("brands_tags")
    public void setBrandsTags(List<String> brandsTags) {
        this.brandsTags = brandsTags;
    }

    @JsonProperty("minerals_prev_tags")
    public List<Object> getMineralsPrevTags() {
        return mineralsPrevTags;
    }

    @JsonProperty("minerals_prev_tags")
    public void setMineralsPrevTags(List<Object> mineralsPrevTags) {
        this.mineralsPrevTags = mineralsPrevTags;
    }

    @JsonProperty("ingredients_from_palm_oil_tags")
    public List<Object> getIngredientsFromPalmOilTags() {
        return ingredientsFromPalmOilTags;
    }

    @JsonProperty("ingredients_from_palm_oil_tags")
    public void setIngredientsFromPalmOilTags(List<Object> ingredientsFromPalmOilTags) {
        this.ingredientsFromPalmOilTags = ingredientsFromPalmOilTags;
    }

    @JsonProperty("nutrition_score_beverage")
    public Long getNutritionScoreBeverage() {
        return nutritionScoreBeverage;
    }

    @JsonProperty("nutrition_score_beverage")
    public void setNutritionScoreBeverage(Long nutritionScoreBeverage) {
        this.nutritionScoreBeverage = nutritionScoreBeverage;
    }

    @JsonProperty("ingredients_text_en")
    public String getIngredientsTextEn() {
        return ingredientsTextEn;
    }

    @JsonProperty("ingredients_text_en")
    public void setIngredientsTextEn(String ingredientsTextEn) {
        this.ingredientsTextEn = ingredientsTextEn;
    }

    @JsonProperty("ingredients_ids_debug")
    public List<String> getIngredientsIdsDebug() {
        return ingredientsIdsDebug;
    }

    @JsonProperty("ingredients_ids_debug")
    public void setIngredientsIdsDebug(List<String> ingredientsIdsDebug) {
        this.ingredientsIdsDebug = ingredientsIdsDebug;
    }

    @JsonProperty("last_modified_by")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("last_modified_by")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("ingredients_text")
    public String getIngredientsText() {
        return ingredientsText;
    }

    @JsonProperty("ingredients_text")
    public void setIngredientsText(String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    @JsonProperty("brands")
    public String getBrands() {
        return brands;
    }

    @JsonProperty("brands")
    public void setBrands(String brands) {
        this.brands = brands;
    }

    @JsonProperty("nutrition_data")
    public String getNutritionData() {
        return nutritionData;
    }

    @JsonProperty("nutrition_data")
    public void setNutritionData(String nutritionData) {
        this.nutritionData = nutritionData;
    }

    @JsonProperty("categories_tags")
    public List<String> getCategoriesTags() {
        return categoriesTags;
    }

    @JsonProperty("categories_tags")
    public void setCategoriesTags(List<String> categoriesTags) {
        this.categoriesTags = categoriesTags;
    }

    @JsonProperty("countries_debug_tags")
    public List<Object> getCountriesDebugTags() {
        return countriesDebugTags;
    }

    @JsonProperty("countries_debug_tags")
    public void setCountriesDebugTags(List<Object> countriesDebugTags) {
        this.countriesDebugTags = countriesDebugTags;
    }

    @JsonProperty("image_front_small_url")
    public String getImageFrontSmallUrl() {
        return imageFrontSmallUrl;
    }

    @JsonProperty("image_front_small_url")
    public void setImageFrontSmallUrl(String imageFrontSmallUrl) {
        this.imageFrontSmallUrl = imageFrontSmallUrl;
    }

    @JsonProperty("link_debug_tags")
    public List<Object> getLinkDebugTags() {
        return linkDebugTags;
    }

    @JsonProperty("link_debug_tags")
    public void setLinkDebugTags(List<Object> linkDebugTags) {
        this.linkDebugTags = linkDebugTags;
    }

    @JsonProperty("categories")
    public String getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(String categories) {
        this.categories = categories;
    }

    @JsonProperty("data_quality_tags")
    public List<String> getDataQualityTags() {
        return dataQualityTags;
    }

    @JsonProperty("data_quality_tags")
    public void setDataQualityTags(List<String> dataQualityTags) {
        this.dataQualityTags = dataQualityTags;
    }

    @JsonProperty("data_quality_info_tags")
    public List<String> getDataQualityInfoTags() {
        return dataQualityInfoTags;
    }

    @JsonProperty("data_quality_info_tags")
    public void setDataQualityInfoTags(List<String> dataQualityInfoTags) {
        this.dataQualityInfoTags = dataQualityInfoTags;
    }

    @JsonProperty("nutrition_data_per_debug_tags")
    public List<Object> getNutritionDataPerDebugTags() {
        return nutritionDataPerDebugTags;
    }

    @JsonProperty("nutrition_data_per_debug_tags")
    public void setNutritionDataPerDebugTags(List<Object> nutritionDataPerDebugTags) {
        this.nutritionDataPerDebugTags = nutritionDataPerDebugTags;
    }

    @JsonProperty("purchase_places_debug_tags")
    public List<Object> getPurchasePlacesDebugTags() {
        return purchasePlacesDebugTags;
    }

    @JsonProperty("purchase_places_debug_tags")
    public void setPurchasePlacesDebugTags(List<Object> purchasePlacesDebugTags) {
        this.purchasePlacesDebugTags = purchasePlacesDebugTags;
    }

    @JsonProperty("generic_name_en")
    public String getGenericNameEn() {
        return genericNameEn;
    }

    @JsonProperty("generic_name_en")
    public void setGenericNameEn(String genericNameEn) {
        this.genericNameEn = genericNameEn;
    }

    @JsonProperty("pnns_groups_2")
    public String getPnnsGroups2() {
        return pnnsGroups2;
    }

    @JsonProperty("pnns_groups_2")
    public void setPnnsGroups2(String pnnsGroups2) {
        this.pnnsGroups2 = pnnsGroups2;
    }

    @JsonProperty("countries")
    public String getCountries() {
        return countries;
    }

    @JsonProperty("countries")
    public void setCountries(String countries) {
        this.countries = countries;
    }

    @JsonProperty("labels")
    public String getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(String labels) {
        this.labels = labels;
    }

    @JsonProperty("amino_acids_tags")
    public List<Object> getAminoAcidsTags() {
        return aminoAcidsTags;
    }

    @JsonProperty("amino_acids_tags")
    public void setAminoAcidsTags(List<Object> aminoAcidsTags) {
        this.aminoAcidsTags = aminoAcidsTags;
    }

    @JsonProperty("ingredients_from_palm_oil_n")
    public Long getIngredientsFromPalmOilN() {
        return ingredientsFromPalmOilN;
    }

    @JsonProperty("ingredients_from_palm_oil_n")
    public void setIngredientsFromPalmOilN(Long ingredientsFromPalmOilN) {
        this.ingredientsFromPalmOilN = ingredientsFromPalmOilN;
    }

    @JsonProperty("additives_prev_original_tags")
    public List<String> getAdditivesPrevOriginalTags() {
        return additivesPrevOriginalTags;
    }

    @JsonProperty("additives_prev_original_tags")
    public void setAdditivesPrevOriginalTags(List<String> additivesPrevOriginalTags) {
        this.additivesPrevOriginalTags = additivesPrevOriginalTags;
    }

    @JsonProperty("states_hierarchy")
    public List<String> getStatesHierarchy() {
        return statesHierarchy;
    }

    @JsonProperty("states_hierarchy")
    public void setStatesHierarchy(List<String> statesHierarchy) {
        this.statesHierarchy = statesHierarchy;
    }

    @JsonProperty("unique_scans_n")
    public Long getUniqueScansN() {
        return uniqueScansN;
    }

    @JsonProperty("unique_scans_n")
    public void setUniqueScansN(Long uniqueScansN) {
        this.uniqueScansN = uniqueScansN;
    }

    @JsonProperty("image_ingredients_url")
    public String getImageIngredientsUrl() {
        return imageIngredientsUrl;
    }

    @JsonProperty("image_ingredients_url")
    public void setImageIngredientsUrl(String imageIngredientsUrl) {
        this.imageIngredientsUrl = imageIngredientsUrl;
    }

    @JsonProperty("popularity_tags")
    public List<String> getPopularityTags() {
        return popularityTags;
    }

    @JsonProperty("popularity_tags")
    public void setPopularityTags(List<String> popularityTags) {
        this.popularityTags = popularityTags;
    }

    @JsonProperty("data_quality_bugs_tags")
    public List<Object> getDataQualityBugsTags() {
        return dataQualityBugsTags;
    }

    @JsonProperty("data_quality_bugs_tags")
    public void setDataQualityBugsTags(List<Object> dataQualityBugsTags) {
        this.dataQualityBugsTags = dataQualityBugsTags;
    }

    @JsonProperty("product_name")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("photographers_tags")
    public List<String> getPhotographersTags() {
        return photographersTags;
    }

    @JsonProperty("photographers_tags")
    public void setPhotographersTags(List<String> photographersTags) {
        this.photographersTags = photographersTags;
    }

    @JsonProperty("lc")
    public String getLc() {
        return lc;
    }

    @JsonProperty("lc")
    public void setLc(String lc) {
        this.lc = lc;
    }

    @JsonProperty("traces_from_user")
    public String getTracesFromUser() {
        return tracesFromUser;
    }

    @JsonProperty("traces_from_user")
    public void setTracesFromUser(String tracesFromUser) {
        this.tracesFromUser = tracesFromUser;
    }

    @JsonProperty("brand_owner_imported")
    public String getBrandOwnerImported() {
        return brandOwnerImported;
    }

    @JsonProperty("brand_owner_imported")
    public void setBrandOwnerImported(String brandOwnerImported) {
        this.brandOwnerImported = brandOwnerImported;
    }

    @JsonProperty("entry_dates_tags")
    public List<String> getEntryDatesTags() {
        return entryDatesTags;
    }

    @JsonProperty("entry_dates_tags")
    public void setEntryDatesTags(List<String> entryDatesTags) {
        this.entryDatesTags = entryDatesTags;
    }

    @JsonProperty("nova_groups_tags")
    public List<String> getNovaGroupsTags() {
        return novaGroupsTags;
    }

    @JsonProperty("nova_groups_tags")
    public void setNovaGroupsTags(List<String> novaGroupsTags) {
        this.novaGroupsTags = novaGroupsTags;
    }

    @JsonProperty("product_name_en")
    public String getProductNameEn() {
        return productNameEn;
    }

    @JsonProperty("product_name_en")
    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    @JsonProperty("editors")
    public List<String> getEditors() {
        return editors;
    }

    @JsonProperty("editors")
    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    @JsonProperty("emb_codes_orig")
    public String getEmbCodesOrig() {
        return embCodesOrig;
    }

    @JsonProperty("emb_codes_orig")
    public void setEmbCodesOrig(String embCodesOrig) {
        this.embCodesOrig = embCodesOrig;
    }

    @JsonProperty("countries_hierarchy")
    public List<String> getCountriesHierarchy() {
        return countriesHierarchy;
    }

    @JsonProperty("countries_hierarchy")
    public void setCountriesHierarchy(List<String> countriesHierarchy) {
        this.countriesHierarchy = countriesHierarchy;
    }

    @JsonProperty("checkers_tags")
    public List<Object> getCheckersTags() {
        return checkersTags;
    }

    @JsonProperty("checkers_tags")
    public void setCheckersTags(List<Object> checkersTags) {
        this.checkersTags = checkersTags;
    }

    @JsonProperty("_keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    @JsonProperty("_keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("interface_version_modified")
    public String getInterfaceVersionModified() {
        return interfaceVersionModified;
    }

    @JsonProperty("interface_version_modified")
    public void setInterfaceVersionModified(String interfaceVersionModified) {
        this.interfaceVersionModified = interfaceVersionModified;
    }

    @JsonProperty("pnns_groups_1")
    public String getPnnsGroups1() {
        return pnnsGroups1;
    }

    @JsonProperty("pnns_groups_1")
    public void setPnnsGroups1(String pnnsGroups1) {
        this.pnnsGroups1 = pnnsGroups1;
    }

    @JsonProperty("ingredients_percent_analysis")
    public Long getIngredientsPercentAnalysis() {
        return ingredientsPercentAnalysis;
    }

    @JsonProperty("ingredients_percent_analysis")
    public void setIngredientsPercentAnalysis(Long ingredientsPercentAnalysis) {
        this.ingredientsPercentAnalysis = ingredientsPercentAnalysis;
    }

    @JsonProperty("serving_size")
    public String getServingSize() {
        return servingSize;
    }

    @JsonProperty("serving_size")
    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    @JsonProperty("unknown_ingredients_n")
    public Long getUnknownIngredientsN() {
        return unknownIngredientsN;
    }

    @JsonProperty("unknown_ingredients_n")
    public void setUnknownIngredientsN(Long unknownIngredientsN) {
        this.unknownIngredientsN = unknownIngredientsN;
    }

    @JsonProperty("additives_tags_n")
    public Object getAdditivesTagsN() {
        return additivesTagsN;
    }

    @JsonProperty("additives_tags_n")
    public void setAdditivesTagsN(Object additivesTagsN) {
        this.additivesTagsN = additivesTagsN;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("compared_to_category")
    public String getComparedToCategory() {
        return comparedToCategory;
    }

    @JsonProperty("compared_to_category")
    public void setComparedToCategory(String comparedToCategory) {
        this.comparedToCategory = comparedToCategory;
    }

    @JsonProperty("packaging")
    public String getPackaging() {
        return packaging;
    }

    @JsonProperty("packaging")
    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @JsonProperty("nucleotides_tags")
    public List<Object> getNucleotidesTags() {
        return nucleotidesTags;
    }

    @JsonProperty("nucleotides_tags")
    public void setNucleotidesTags(List<Object> nucleotidesTags) {
        this.nucleotidesTags = nucleotidesTags;
    }

    @JsonProperty("generic_name")
    public String getGenericName() {
        return genericName;
    }

    @JsonProperty("generic_name")
    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    @JsonProperty("emb_codes")
    public String getEmbCodes() {
        return embCodes;
    }

    @JsonProperty("emb_codes")
    public void setEmbCodes(String embCodes) {
        this.embCodes = embCodes;
    }

    @JsonProperty("lang_debug_tags")
    public List<Object> getLangDebugTags() {
        return langDebugTags;
    }

    @JsonProperty("lang_debug_tags")
    public void setLangDebugTags(List<Object> langDebugTags) {
        this.langDebugTags = langDebugTags;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("packaging_debug_tags")
    public List<Object> getPackagingDebugTags() {
        return packagingDebugTags;
    }

    @JsonProperty("packaging_debug_tags")
    public void setPackagingDebugTags(List<Object> packagingDebugTags) {
        this.packagingDebugTags = packagingDebugTags;
    }

    @JsonProperty("ingredients_text_debug")
    public String getIngredientsTextDebug() {
        return ingredientsTextDebug;
    }

    @JsonProperty("ingredients_text_debug")
    public void setIngredientsTextDebug(String ingredientsTextDebug) {
        this.ingredientsTextDebug = ingredientsTextDebug;
    }

    @JsonProperty("interface_version_created")
    public String getInterfaceVersionCreated() {
        return interfaceVersionCreated;
    }

    @JsonProperty("interface_version_created")
    public void setInterfaceVersionCreated(String interfaceVersionCreated) {
        this.interfaceVersionCreated = interfaceVersionCreated;
    }

    @JsonProperty("manufacturing_places")
    public String getManufacturingPlaces() {
        return manufacturingPlaces;
    }

    @JsonProperty("manufacturing_places")
    public void setManufacturingPlaces(String manufacturingPlaces) {
        this.manufacturingPlaces = manufacturingPlaces;
    }

    @JsonProperty("vitamins_tags")
    public List<Object> getVitaminsTags() {
        return vitaminsTags;
    }

    @JsonProperty("vitamins_tags")
    public void setVitaminsTags(List<Object> vitaminsTags) {
        this.vitaminsTags = vitaminsTags;
    }

    @JsonProperty("allergens_from_ingredients")
    public String getAllergensFromIngredients() {
        return allergensFromIngredients;
    }

    @JsonProperty("allergens_from_ingredients")
    public void setAllergensFromIngredients(String allergensFromIngredients) {
        this.allergensFromIngredients = allergensFromIngredients;
    }

    @JsonProperty("update_key")
    public String getUpdateKey() {
        return updateKey;
    }

    @JsonProperty("update_key")
    public void setUpdateKey(String updateKey) {
        this.updateKey = updateKey;
    }

    @JsonProperty("nutrition_grade_fr")
    public String getNutritionGradeFr() {
        return nutritionGradeFr;
    }

    @JsonProperty("nutrition_grade_fr")
    public void setNutritionGradeFr(String nutritionGradeFr) {
        this.nutritionGradeFr = nutritionGradeFr;
    }

    @JsonProperty("origins_debug_tags")
    public List<Object> getOriginsDebugTags() {
        return originsDebugTags;
    }

    @JsonProperty("origins_debug_tags")
    public void setOriginsDebugTags(List<Object> originsDebugTags) {
        this.originsDebugTags = originsDebugTags;
    }

    @JsonProperty("category_properties")
    public CategoryProperties getCategoryProperties() {
        return categoryProperties;
    }

    @JsonProperty("category_properties")
    public void setCategoryProperties(CategoryProperties categoryProperties) {
        this.categoryProperties = categoryProperties;
    }

    @JsonProperty("nutrition_data_prepared_per_imported")
    public String getNutritionDataPreparedPerImported() {
        return nutritionDataPreparedPerImported;
    }

    @JsonProperty("nutrition_data_prepared_per_imported")
    public void setNutritionDataPreparedPerImported(String nutritionDataPreparedPerImported) {
        this.nutritionDataPreparedPerImported = nutritionDataPreparedPerImported;
    }

    @JsonProperty("last_image_dates_tags")
    public List<String> getLastImageDatesTags() {
        return lastImageDatesTags;
    }

    @JsonProperty("last_image_dates_tags")
    public void setLastImageDatesTags(List<String> lastImageDatesTags) {
        this.lastImageDatesTags = lastImageDatesTags;
    }

    @JsonProperty("misc_tags")
    public List<String> getMiscTags() {
        return miscTags;
    }

    @JsonProperty("misc_tags")
    public void setMiscTags(List<String> miscTags) {
        this.miscTags = miscTags;
    }

    @JsonProperty("languages_codes")
    public LanguagesCodes getLanguagesCodes() {
        return languagesCodes;
    }

    @JsonProperty("languages_codes")
    public void setLanguagesCodes(LanguagesCodes languagesCodes) {
        this.languagesCodes = languagesCodes;
    }

    @JsonProperty("purchase_places")
    public String getPurchasePlaces() {
        return purchasePlaces;
    }

    @JsonProperty("purchase_places")
    public void setPurchasePlaces(String purchasePlaces) {
        this.purchasePlaces = purchasePlaces;
    }

    @JsonProperty("nutrition_data_per_imported")
    public String getNutritionDataPerImported() {
        return nutritionDataPerImported;
    }

    @JsonProperty("nutrition_data_per_imported")
    public void setNutritionDataPerImported(String nutritionDataPerImported) {
        this.nutritionDataPerImported = nutritionDataPerImported;
    }

    @JsonProperty("expiration_date")
    public String getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expiration_date")
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("emb_codes_debug_tags")
    public List<Object> getEmbCodesDebugTags() {
        return embCodesDebugTags;
    }

    @JsonProperty("emb_codes_debug_tags")
    public void setEmbCodesDebugTags(List<Object> embCodesDebugTags) {
        this.embCodesDebugTags = embCodesDebugTags;
    }

    @JsonProperty("ingredients_that_may_be_from_palm_oil_n")
    public Long getIngredientsThatMayBeFromPalmOilN() {
        return ingredientsThatMayBeFromPalmOilN;
    }

    @JsonProperty("ingredients_that_may_be_from_palm_oil_n")
    public void setIngredientsThatMayBeFromPalmOilN(Long ingredientsThatMayBeFromPalmOilN) {
        this.ingredientsThatMayBeFromPalmOilN = ingredientsThatMayBeFromPalmOilN;
    }

    @JsonProperty("additives_old_n")
    public Long getAdditivesOldN() {
        return additivesOldN;
    }

    @JsonProperty("additives_old_n")
    public void setAdditivesOldN(Long additivesOldN) {
        this.additivesOldN = additivesOldN;
    }

    @JsonProperty("data_quality_warnings_tags")
    public List<String> getDataQualityWarningsTags() {
        return dataQualityWarningsTags;
    }

    @JsonProperty("data_quality_warnings_tags")
    public void setDataQualityWarningsTags(List<String> dataQualityWarningsTags) {
        this.dataQualityWarningsTags = dataQualityWarningsTags;
    }

    @JsonProperty("editors_tags")
    public List<String> getEditorsTags() {
        return editorsTags;
    }

    @JsonProperty("editors_tags")
    public void setEditorsTags(List<String> editorsTags) {
        this.editorsTags = editorsTags;
    }

    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @JsonProperty("origins")
    public String getOrigins() {
        return origins;
    }

    @JsonProperty("origins")
    public void setOrigins(String origins) {
        this.origins = origins;
    }

    @JsonProperty("labels_tags")
    public List<String> getLabelsTags() {
        return labelsTags;
    }

    @JsonProperty("labels_tags")
    public void setLabelsTags(List<String> labelsTags) {
        this.labelsTags = labelsTags;
    }

    @JsonProperty("selected_images")
    public SelectedImages getSelectedImages() {
        return selectedImages;
    }

    @JsonProperty("selected_images")
    public void setSelectedImages(SelectedImages selectedImages) {
        this.selectedImages = selectedImages;
    }

    @JsonProperty("serving_size_imported")
    public String getServingSizeImported() {
        return servingSizeImported;
    }

    @JsonProperty("serving_size_imported")
    public void setServingSizeImported(String servingSizeImported) {
        this.servingSizeImported = servingSizeImported;
    }

    @JsonProperty("traces_debug_tags")
    public List<Object> getTracesDebugTags() {
        return tracesDebugTags;
    }

    @JsonProperty("traces_debug_tags")
    public void setTracesDebugTags(List<Object> tracesDebugTags) {
        this.tracesDebugTags = tracesDebugTags;
    }

    @JsonProperty("scans_n")
    public Long getScansN() {
        return scansN;
    }

    @JsonProperty("scans_n")
    public void setScansN(Long scansN) {
        this.scansN = scansN;
    }

    @JsonProperty("additives_debug_tags")
    public List<Object> getAdditivesDebugTags() {
        return additivesDebugTags;
    }

    @JsonProperty("additives_debug_tags")
    public void setAdditivesDebugTags(List<Object> additivesDebugTags) {
        this.additivesDebugTags = additivesDebugTags;
    }

    @JsonProperty("image_nutrition_url")
    public String getImageNutritionUrl() {
        return imageNutritionUrl;
    }

    @JsonProperty("image_nutrition_url")
    public void setImageNutritionUrl(String imageNutritionUrl) {
        this.imageNutritionUrl = imageNutritionUrl;
    }

    @JsonProperty("sortkey")
    public Long getSortkey() {
        return sortkey;
    }

    @JsonProperty("sortkey")
    public void setSortkey(Long sortkey) {
        this.sortkey = sortkey;
    }

    @JsonProperty("product_quantity")
    public String getProductQuantity() {
        return productQuantity;
    }

    @JsonProperty("product_quantity")
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    @JsonProperty("countries_imported")
    public String getCountriesImported() {
        return countriesImported;
    }

    @JsonProperty("countries_imported")
    public void setCountriesImported(String countriesImported) {
        this.countriesImported = countriesImported;
    }

    @JsonProperty("manufacturing_places_tags")
    public List<Object> getManufacturingPlacesTags() {
        return manufacturingPlacesTags;
    }

    @JsonProperty("manufacturing_places_tags")
    public void setManufacturingPlacesTags(List<Object> manufacturingPlacesTags) {
        this.manufacturingPlacesTags = manufacturingPlacesTags;
    }

    @JsonProperty("image_front_url")
    public String getImageFrontUrl() {
        return imageFrontUrl;
    }

    @JsonProperty("image_front_url")
    public void setImageFrontUrl(String imageFrontUrl) {
        this.imageFrontUrl = imageFrontUrl;
    }

    @JsonProperty("nutriscore_score")
    public Long getNutriscoreScore() {
        return nutriscoreScore;
    }

    @JsonProperty("nutriscore_score")
    public void setNutriscoreScore(Long nutriscoreScore) {
        this.nutriscoreScore = nutriscoreScore;
    }

    @JsonProperty("nova_group_debug")
    public String getNovaGroupDebug() {
        return novaGroupDebug;
    }

    @JsonProperty("nova_group_debug")
    public void setNovaGroupDebug(String novaGroupDebug) {
        this.novaGroupDebug = novaGroupDebug;
    }

    @JsonProperty("serving_quantity")
    public String getServingQuantity() {
        return servingQuantity;
    }

    @JsonProperty("serving_quantity")
    public void setServingQuantity(String servingQuantity) {
        this.servingQuantity = servingQuantity;
    }

    @JsonProperty("completed_t")
    public Long getCompletedT() {
        return completedT;
    }

    @JsonProperty("completed_t")
    public void setCompletedT(Long completedT) {
        this.completedT = completedT;
    }

    @JsonProperty("pnns_groups_1_tags")
    public List<String> getPnnsGroups1Tags() {
        return pnnsGroups1Tags;
    }

    @JsonProperty("pnns_groups_1_tags")
    public void setPnnsGroups1Tags(List<String> pnnsGroups1Tags) {
        this.pnnsGroups1Tags = pnnsGroups1Tags;
    }

    @JsonProperty("ingredients_analysis_tags")
    public List<String> getIngredientsAnalysisTags() {
        return ingredientsAnalysisTags;
    }

    @JsonProperty("ingredients_analysis_tags")
    public void setIngredientsAnalysisTags(List<String> ingredientsAnalysisTags) {
        this.ingredientsAnalysisTags = ingredientsAnalysisTags;
    }

    @JsonProperty("max_imgid")
    public String getMaxImgid() {
        return maxImgid;
    }

    @JsonProperty("max_imgid")
    public void setMaxImgid(String maxImgid) {
        this.maxImgid = maxImgid;
    }

    @JsonProperty("additives_original_tags")
    public List<String> getAdditivesOriginalTags() {
        return additivesOriginalTags;
    }

    @JsonProperty("additives_original_tags")
    public void setAdditivesOriginalTags(List<String> additivesOriginalTags) {
        this.additivesOriginalTags = additivesOriginalTags;
    }

    @JsonProperty("cities_tags")
    public List<Object> getCitiesTags() {
        return citiesTags;
    }

    @JsonProperty("cities_tags")
    public void setCitiesTags(List<Object> citiesTags) {
        this.citiesTags = citiesTags;
    }

    @JsonProperty("states")
    public String getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(String states) {
        this.states = states;
    }

    @JsonProperty("purchase_places_tags")
    public List<Object> getPurchasePlacesTags() {
        return purchasePlacesTags;
    }

    @JsonProperty("purchase_places_tags")
    public void setPurchasePlacesTags(List<Object> purchasePlacesTags) {
        this.purchasePlacesTags = purchasePlacesTags;
    }

    @JsonProperty("informers")
    public List<String> getInformers() {
        return informers;
    }

    @JsonProperty("informers")
    public void setInformers(List<String> informers) {
        this.informers = informers;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("nutriscore_grade")
    public String getNutriscoreGrade() {
        return nutriscoreGrade;
    }

    @JsonProperty("nutriscore_grade")
    public void setNutriscoreGrade(String nutriscoreGrade) {
        this.nutriscoreGrade = nutriscoreGrade;
    }

    @JsonProperty("lc_imported")
    public String getLcImported() {
        return lcImported;
    }

    @JsonProperty("lc_imported")
    public void setLcImported(String lcImported) {
        this.lcImported = lcImported;
    }

    @JsonProperty("last_edit_dates_tags")
    public List<String> getLastEditDatesTags() {
        return lastEditDatesTags;
    }

    @JsonProperty("last_edit_dates_tags")
    public void setLastEditDatesTags(List<String> lastEditDatesTags) {
        this.lastEditDatesTags = lastEditDatesTags;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("image_nutrition_small_url")
    public String getImageNutritionSmallUrl() {
        return imageNutritionSmallUrl;
    }

    @JsonProperty("image_nutrition_small_url")
    public void setImageNutritionSmallUrl(String imageNutritionSmallUrl) {
        this.imageNutritionSmallUrl = imageNutritionSmallUrl;
    }

    @JsonProperty("correctors_tags")
    public List<String> getCorrectorsTags() {
        return correctorsTags;
    }

    @JsonProperty("correctors_tags")
    public void setCorrectorsTags(List<String> correctorsTags) {
        this.correctorsTags = correctorsTags;
    }

    @JsonProperty("complete")
    public Long getComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(Long complete) {
        this.complete = complete;
    }

    @JsonProperty("allergens_hierarchy")
    public List<Object> getAllergensHierarchy() {
        return allergensHierarchy;
    }

    @JsonProperty("allergens_hierarchy")
    public void setAllergensHierarchy(List<Object> allergensHierarchy) {
        this.allergensHierarchy = allergensHierarchy;
    }

    @JsonProperty("labels_prev_tags")
    public List<String> getLabelsPrevTags() {
        return labelsPrevTags;
    }

    @JsonProperty("labels_prev_tags")
    public void setLabelsPrevTags(List<String> labelsPrevTags) {
        this.labelsPrevTags = labelsPrevTags;
    }

    @JsonProperty("completeness")
    public Float getCompleteness() {
        return completeness;
    }

    @JsonProperty("completeness")
    public void setCompleteness(Float completeness) {
        this.completeness = completeness;
    }

    @JsonProperty("ingredients_hierarchy")
    public List<String> getIngredientsHierarchy() {
        return ingredientsHierarchy;
    }

    @JsonProperty("ingredients_hierarchy")
    public void setIngredientsHierarchy(List<String> ingredientsHierarchy) {
        this.ingredientsHierarchy = ingredientsHierarchy;
    }

    @JsonProperty("data_sources_imported")
    public String getDataSourcesImported() {
        return dataSourcesImported;
    }

    @JsonProperty("data_sources_imported")
    public void setDataSourcesImported(String dataSourcesImported) {
        this.dataSourcesImported = dataSourcesImported;
    }

    @JsonProperty("allergens")
    public String getAllergens() {
        return allergens;
    }

    @JsonProperty("allergens")
    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("categoriesImported", categoriesImported).append("countriesLc", countriesLc).append("nutrientLevelsTags", nutrientLevelsTags).append("pnnsGroups2Tags", pnnsGroups2Tags).append("statesTags", statesTags).append("embCodes20141016", embCodes20141016).append("labelsPrevHierarchy", labelsPrevHierarchy).append("allergensFromUser", allergensFromUser).append("nutritionDataPrepared", nutritionDataPrepared).append("ingredientsNTags", ingredientsNTags).append("nutritionDataPer", nutritionDataPer).append("ingredientsThatMayBeFromPalmOilTags", ingredientsThatMayBeFromPalmOilTags).append("storesDebugTags", storesDebugTags).append("quantity", quantity).append("servingSizeDebugTags", servingSizeDebugTags).append("dataSources", dataSources).append("photographers", photographers).append("ingredients", ingredients).append("noNutritionData", noNutritionData).append("fruitsVegetablesNuts100gEstimate", fruitsVegetablesNuts100gEstimate).append("lastImageT", lastImageT).append("expirationDateDebugTags", expirationDateDebugTags).append("ingredientsDebug", ingredientsDebug).append("nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue", nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue).append("knownIngredientsN", knownIngredientsN).append("sourcesFields", sourcesFields).append("creator", creator).append("stores", stores).append("ingredientsTextWithAllergens", ingredientsTextWithAllergens).append("traces", traces).append("nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients", nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients).append("informersTags", informersTags).append("lastEditor", lastEditor).append("dataQualityErrorsTags", dataQualityErrorsTags).append("embCodesTags", embCodesTags).append("additivesTags", additivesTags).append("aminoAcidsPrevTags", aminoAcidsPrevTags).append("additivesN", additivesN).append("codesTags", codesTags).append("unknownNutrientsTags", unknownNutrientsTags).append("correctors", correctors).append("novaGroups", novaGroups).append("originsTags", originsTags).append("productNameEnImported", productNameEnImported).append("nutritionDataPreparedPerDebugTags", nutritionDataPreparedPerDebugTags).append("tracesTags", tracesTags).append("genericNameEnDebugTags", genericNameEnDebugTags).append("ingredientsTextEnDebugTags", ingredientsTextEnDebugTags).append("sources", sources).append("labelsLc", labelsLc).append("imageIngredientsSmallUrl", imageIngredientsSmallUrl).append("quantityDebugTags", quantityDebugTags).append("novaGroup", novaGroup).append("categoriesHierarchy", categoriesHierarchy).append("languagesTags", languagesTags).append("newAdditivesN", newAdditivesN).append("rev", rev).append("labelsHierarchy", labelsHierarchy).append("nucleotidesPrevTags", nucleotidesPrevTags).append("dataSourcesTags", dataSourcesTags).append("storesTags", storesTags).append("manufacturingPlacesDebugTags", manufacturingPlacesDebugTags).append("imageIngredientsThumbUrl", imageIngredientsThumbUrl).append("nutritionDataPreparedPer", nutritionDataPreparedPer).append("productNameEnDebugTags", productNameEnDebugTags).append("nutritionGradesTags", nutritionGradesTags).append("nutritionGrades", nutritionGrades).append("categoriesLc", categoriesLc).append("ingredientsTags", ingredientsTags).append("tracesHierarchy", tracesHierarchy).append("languagesHierarchy", languagesHierarchy).append("imageThumbUrl", imageThumbUrl).append("createdT", createdT).append("brandOwner", brandOwner).append("imageFrontThumbUrl", imageFrontThumbUrl).append("packagingTags", packagingTags).append("ingredientsFromOrThatMayBeFromPalmOilN", ingredientsFromOrThatMayBeFromPalmOilN).append("otherNutritionalSubstancesTags", otherNutritionalSubstancesTags).append("additivesOldTags", additivesOldTags).append("checkers", checkers).append("ciqualFoodNameTags", ciqualFoodNameTags).append("debugParamSortedLangs", debugParamSortedLangs).append("mineralsTags", mineralsTags).append("ingredientsTextEnImported", ingredientsTextEnImported).append("images", images).append("countriesTags", countriesTags).append("vitaminsPrevTags", vitaminsPrevTags).append("nutriscoreData", nutriscoreData).append("nutrientLevels", nutrientLevels).append("link", link).append("ingredientsOriginalTags", ingredientsOriginalTags).append("tracesFromIngredients", tracesFromIngredients).append("lastModifiedT", lastModifiedT).append("nutriments", nutriments).append("allergensTags", allergensTags).append("imageNutritionThumbUrl", imageNutritionThumbUrl).append("ingredientsN", ingredientsN).append("brandsDebugTags", brandsDebugTags).append("imageSmallUrl", imageSmallUrl).append("ingredientsTextWithAllergensEn", ingredientsTextWithAllergensEn).append("brandsTags", brandsTags).append("mineralsPrevTags", mineralsPrevTags).append("ingredientsFromPalmOilTags", ingredientsFromPalmOilTags).append("nutritionScoreBeverage", nutritionScoreBeverage).append("ingredientsTextEn", ingredientsTextEn).append("ingredientsIdsDebug", ingredientsIdsDebug).append("lastModifiedBy", lastModifiedBy).append("ingredientsText", ingredientsText).append("brands", brands).append("nutritionData", nutritionData).append("categoriesTags", categoriesTags).append("countriesDebugTags", countriesDebugTags).append("imageFrontSmallUrl", imageFrontSmallUrl).append("linkDebugTags", linkDebugTags).append("categories", categories).append("dataQualityTags", dataQualityTags).append("dataQualityInfoTags", dataQualityInfoTags).append("nutritionDataPerDebugTags", nutritionDataPerDebugTags).append("purchasePlacesDebugTags", purchasePlacesDebugTags).append("genericNameEn", genericNameEn).append("pnnsGroups2", pnnsGroups2).append("countries", countries).append("labels", labels).append("aminoAcidsTags", aminoAcidsTags).append("ingredientsFromPalmOilN", ingredientsFromPalmOilN).append("additivesPrevOriginalTags", additivesPrevOriginalTags).append("statesHierarchy", statesHierarchy).append("uniqueScansN", uniqueScansN).append("imageIngredientsUrl", imageIngredientsUrl).append("popularityTags", popularityTags).append("dataQualityBugsTags", dataQualityBugsTags).append("productName", productName).append("photographersTags", photographersTags).append("lc", lc).append("tracesFromUser", tracesFromUser).append("brandOwnerImported", brandOwnerImported).append("entryDatesTags", entryDatesTags).append("novaGroupsTags", novaGroupsTags).append("productNameEn", productNameEn).append("editors", editors).append("embCodesOrig", embCodesOrig).append("countriesHierarchy", countriesHierarchy).append("checkersTags", checkersTags).append("keywords", keywords).append("interfaceVersionModified", interfaceVersionModified).append("pnnsGroups1", pnnsGroups1).append("ingredientsPercentAnalysis", ingredientsPercentAnalysis).append("servingSize", servingSize).append("unknownIngredientsN", unknownIngredientsN).append("additivesTagsN", additivesTagsN).append("imageUrl", imageUrl).append("comparedToCategory", comparedToCategory).append("packaging", packaging).append("nucleotidesTags", nucleotidesTags).append("genericName", genericName).append("embCodes", embCodes).append("langDebugTags", langDebugTags).append("id", id).append("packagingDebugTags", packagingDebugTags).append("ingredientsTextDebug", ingredientsTextDebug).append("interfaceVersionCreated", interfaceVersionCreated).append("manufacturingPlaces", manufacturingPlaces).append("vitaminsTags", vitaminsTags).append("allergensFromIngredients", allergensFromIngredients).append("updateKey", updateKey).append("nutritionGradeFr", nutritionGradeFr).append("originsDebugTags", originsDebugTags).append("categoryProperties", categoryProperties).append("nutritionDataPreparedPerImported", nutritionDataPreparedPerImported).append("lastImageDatesTags", lastImageDatesTags).append("miscTags", miscTags).append("languagesCodes", languagesCodes).append("purchasePlaces", purchasePlaces).append("nutritionDataPerImported", nutritionDataPerImported).append("expirationDate", expirationDate).append("embCodesDebugTags", embCodesDebugTags).append("ingredientsThatMayBeFromPalmOilN", ingredientsThatMayBeFromPalmOilN).append("additivesOldN", additivesOldN).append("dataQualityWarningsTags", dataQualityWarningsTags).append("editorsTags", editorsTags).append("languages", languages).append("origins", origins).append("labelsTags", labelsTags).append("selectedImages", selectedImages).append("servingSizeImported", servingSizeImported).append("tracesDebugTags", tracesDebugTags).append("scansN", scansN).append("additivesDebugTags", additivesDebugTags).append("imageNutritionUrl", imageNutritionUrl).append("sortkey", sortkey).append("productQuantity", productQuantity).append("countriesImported", countriesImported).append("manufacturingPlacesTags", manufacturingPlacesTags).append("imageFrontUrl", imageFrontUrl).append("nutriscoreScore", nutriscoreScore).append("novaGroupDebug", novaGroupDebug).append("servingQuantity", servingQuantity).append("completedT", completedT).append("pnnsGroups1Tags", pnnsGroups1Tags).append("ingredientsAnalysisTags", ingredientsAnalysisTags).append("maxImgid", maxImgid).append("additivesOriginalTags", additivesOriginalTags).append("citiesTags", citiesTags).append("states", states).append("purchasePlacesTags", purchasePlacesTags).append("informers", informers).append("lang", lang).append("nutriscoreGrade", nutriscoreGrade).append("lcImported", lcImported).append("lastEditDatesTags", lastEditDatesTags).append("code", code).append("imageNutritionSmallUrl", imageNutritionSmallUrl).append("correctorsTags", correctorsTags).append("complete", complete).append("allergensHierarchy", allergensHierarchy).append("labelsPrevTags", labelsPrevTags).append("completeness", completeness).append("ingredientsHierarchy", ingredientsHierarchy).append("dataSourcesImported", dataSourcesImported).append("allergens", allergens).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nutriscoreScore).append(additivesOldN).append(labelsTags).append(miscTags).append(editorsTags).append(maxImgid).append(imageFrontSmallUrl).append(additivesPrevOriginalTags).append(novaGroupDebug).append(nutritionDataPrepared).append(embCodesOrig).append(photographers).append(additivesOldTags).append(nutriments).append(brandsDebugTags).append(labelsPrevHierarchy).append(allergensFromUser).append(originsDebugTags).append(vitaminsTags).append(nutritionDataPreparedPer).append(aminoAcidsTags).append(ingredientsIdsDebug).append(nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients).append(ingredientsTextEn).append(imageIngredientsUrl).append(embCodesTags).append(pnnsGroups2Tags).append(nutritionGradesTags).append(tracesFromIngredients).append(imageSmallUrl).append(countries).append(nucleotidesTags).append(labels).append(dataSourcesTags).append(additivesDebugTags).append(categoriesLc).append(statesTags).append(tracesHierarchy).append(nutritionGrades).append(additivesOriginalTags).append(nutritionDataPer).append(ingredients).append(origins).append(imageFrontUrl).append(servingSizeImported).append(uniqueScansN).append(brands).append(languages).append(nutritionDataPreparedPerDebugTags).append(brandOwner).append(allergensHierarchy).append(countriesLc).append(categoriesHierarchy).append(entryDatesTags).append(knownIngredientsN).append(tracesFromUser).append(nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue).append(novaGroup).append(packagingTags).append(codesTags).append(categoryProperties).append(embCodes20141016).append(keywords).append(genericName).append(imageNutritionSmallUrl).append(nutritionGradeFr).append(completeness).append(countriesHierarchy).append(popularityTags).append(dataQualityErrorsTags).append(nutrientLevelsTags).append(rev).append(statesHierarchy).append(languagesTags).append(correctors).append(scansN).append(dataQualityInfoTags).append(nucleotidesPrevTags).append(lastImageT).append(mineralsPrevTags).append(photographersTags).append(ingredientsTextWithAllergensEn).append(productQuantity).append(interfaceVersionModified).append(tracesDebugTags).append(ingredientsHierarchy).append(novaGroups).append(sources).append(servingQuantity).append(checkers).append(citiesTags).append(expirationDateDebugTags).append(ingredientsDebug).append(nutritionScoreBeverage).append(allergensTags).append(states).append(completedT).append(imageUrl).append(ingredientsOriginalTags).append(embCodesDebugTags).append(imageNutritionThumbUrl).append(debugParamSortedLangs).append(ingredientsTextEnImported).append(expirationDate).append(imageThumbUrl).append(interfaceVersionCreated).append(dataQualityWarningsTags).append(ingredientsAnalysisTags).append(countriesImported).append(packaging).append(createdT).append(purchasePlacesDebugTags).append(labelsLc).append(allergens).append(brandsTags).append(ingredientsTextWithAllergens).append(tracesTags).append(ingredientsTextEnDebugTags).append(productNameEn).append(pnnsGroups2).append(pnnsGroups1).append(additivesTagsN).append(ingredientsNTags).append(imageIngredientsSmallUrl).append(updateKey).append(lastModifiedT).append(productName).append(ingredientsN).append(storesTags).append(nutrientLevels).append(id).append(nutritionDataPerImported).append(labelsPrevTags).append(unknownNutrientsTags).append(labelsHierarchy).append(images).append(noNutritionData).append(servingSizeDebugTags).append(countriesDebugTags).append(informersTags).append(dataQualityBugsTags).append(informers).append(lastEditDatesTags).append(additivesTags).append(aminoAcidsPrevTags).append(ingredientsFromPalmOilTags).append(nutritionDataPerDebugTags).append(nutritionDataPreparedPerImported).append(ingredientsText).append(manufacturingPlaces).append(imageFrontThumbUrl).append(manufacturingPlacesDebugTags).append(languagesHierarchy).append(sortkey).append(languagesCodes).append(ingredientsFromPalmOilN).append(ingredientsFromOrThatMayBeFromPalmOilN).append(unknownIngredientsN).append(categories).append(creator).append(stores).append(ingredientsTextDebug).append(purchasePlacesTags).append(embCodes).append(allergensFromIngredients).append(lastEditor).append(lc).append(purchasePlaces).append(complete).append(lastImageDatesTags).append(comparedToCategory).append(brandOwnerImported).append(ingredientsPercentAnalysis).append(quantityDebugTags).append(linkDebugTags).append(categoriesImported).append(genericNameEnDebugTags).append(productNameEnDebugTags).append(nutritionData).append(ingredientsThatMayBeFromPalmOilN).append(checkersTags).append(packagingDebugTags).append(dataSources).append(selectedImages).append(correctorsTags).append(traces).append(novaGroupsTags).append(storesDebugTags).append(newAdditivesN).append(fruitsVegetablesNuts100gEstimate).append(categoriesTags).append(imageIngredientsThumbUrl).append(ingredientsTags).append(otherNutritionalSubstancesTags).append(langDebugTags).append(lcImported).append(pnnsGroups1Tags).append(countriesTags).append(code).append(genericNameEn).append(link).append(mineralsTags).append(vitaminsPrevTags).append(productNameEnImported).append(sourcesFields).append(dataQualityTags).append(nutriscoreData).append(imageNutritionUrl).append(lang).append(servingSize).append(editors).append(quantity).append(additivesN).append(dataSourcesImported).append(ciqualFoodNameTags).append(lastModifiedBy).append(nutriscoreGrade).append(ingredientsThatMayBeFromPalmOilTags).append(originsTags).append(manufacturingPlacesTags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(nutriscoreScore, rhs.nutriscoreScore).append(additivesOldN, rhs.additivesOldN).append(labelsTags, rhs.labelsTags).append(miscTags, rhs.miscTags).append(editorsTags, rhs.editorsTags).append(maxImgid, rhs.maxImgid).append(imageFrontSmallUrl, rhs.imageFrontSmallUrl).append(additivesPrevOriginalTags, rhs.additivesPrevOriginalTags).append(novaGroupDebug, rhs.novaGroupDebug).append(nutritionDataPrepared, rhs.nutritionDataPrepared).append(embCodesOrig, rhs.embCodesOrig).append(photographers, rhs.photographers).append(additivesOldTags, rhs.additivesOldTags).append(nutriments, rhs.nutriments).append(brandsDebugTags, rhs.brandsDebugTags).append(labelsPrevHierarchy, rhs.labelsPrevHierarchy).append(allergensFromUser, rhs.allergensFromUser).append(originsDebugTags, rhs.originsDebugTags).append(vitaminsTags, rhs.vitaminsTags).append(nutritionDataPreparedPer, rhs.nutritionDataPreparedPer).append(aminoAcidsTags, rhs.aminoAcidsTags).append(ingredientsIdsDebug, rhs.ingredientsIdsDebug).append(nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients, rhs.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients).append(ingredientsTextEn, rhs.ingredientsTextEn).append(imageIngredientsUrl, rhs.imageIngredientsUrl).append(embCodesTags, rhs.embCodesTags).append(pnnsGroups2Tags, rhs.pnnsGroups2Tags).append(nutritionGradesTags, rhs.nutritionGradesTags).append(tracesFromIngredients, rhs.tracesFromIngredients).append(imageSmallUrl, rhs.imageSmallUrl).append(countries, rhs.countries).append(nucleotidesTags, rhs.nucleotidesTags).append(labels, rhs.labels).append(dataSourcesTags, rhs.dataSourcesTags).append(additivesDebugTags, rhs.additivesDebugTags).append(categoriesLc, rhs.categoriesLc).append(statesTags, rhs.statesTags).append(tracesHierarchy, rhs.tracesHierarchy).append(nutritionGrades, rhs.nutritionGrades).append(additivesOriginalTags, rhs.additivesOriginalTags).append(nutritionDataPer, rhs.nutritionDataPer).append(ingredients, rhs.ingredients).append(origins, rhs.origins).append(imageFrontUrl, rhs.imageFrontUrl).append(servingSizeImported, rhs.servingSizeImported).append(uniqueScansN, rhs.uniqueScansN).append(brands, rhs.brands).append(languages, rhs.languages).append(nutritionDataPreparedPerDebugTags, rhs.nutritionDataPreparedPerDebugTags).append(brandOwner, rhs.brandOwner).append(allergensHierarchy, rhs.allergensHierarchy).append(countriesLc, rhs.countriesLc).append(categoriesHierarchy, rhs.categoriesHierarchy).append(entryDatesTags, rhs.entryDatesTags).append(knownIngredientsN, rhs.knownIngredientsN).append(tracesFromUser, rhs.tracesFromUser).append(nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue, rhs.nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue).append(novaGroup, rhs.novaGroup).append(packagingTags, rhs.packagingTags).append(codesTags, rhs.codesTags).append(categoryProperties, rhs.categoryProperties).append(embCodes20141016, rhs.embCodes20141016).append(keywords, rhs.keywords).append(genericName, rhs.genericName).append(imageNutritionSmallUrl, rhs.imageNutritionSmallUrl).append(nutritionGradeFr, rhs.nutritionGradeFr).append(completeness, rhs.completeness).append(countriesHierarchy, rhs.countriesHierarchy).append(popularityTags, rhs.popularityTags).append(dataQualityErrorsTags, rhs.dataQualityErrorsTags).append(nutrientLevelsTags, rhs.nutrientLevelsTags).append(rev, rhs.rev).append(statesHierarchy, rhs.statesHierarchy).append(languagesTags, rhs.languagesTags).append(correctors, rhs.correctors).append(scansN, rhs.scansN).append(dataQualityInfoTags, rhs.dataQualityInfoTags).append(nucleotidesPrevTags, rhs.nucleotidesPrevTags).append(lastImageT, rhs.lastImageT).append(mineralsPrevTags, rhs.mineralsPrevTags).append(photographersTags, rhs.photographersTags).append(ingredientsTextWithAllergensEn, rhs.ingredientsTextWithAllergensEn).append(productQuantity, rhs.productQuantity).append(interfaceVersionModified, rhs.interfaceVersionModified).append(tracesDebugTags, rhs.tracesDebugTags).append(ingredientsHierarchy, rhs.ingredientsHierarchy).append(novaGroups, rhs.novaGroups).append(sources, rhs.sources).append(servingQuantity, rhs.servingQuantity).append(checkers, rhs.checkers).append(citiesTags, rhs.citiesTags).append(expirationDateDebugTags, rhs.expirationDateDebugTags).append(ingredientsDebug, rhs.ingredientsDebug).append(nutritionScoreBeverage, rhs.nutritionScoreBeverage).append(allergensTags, rhs.allergensTags).append(states, rhs.states).append(completedT, rhs.completedT).append(imageUrl, rhs.imageUrl).append(ingredientsOriginalTags, rhs.ingredientsOriginalTags).append(embCodesDebugTags, rhs.embCodesDebugTags).append(imageNutritionThumbUrl, rhs.imageNutritionThumbUrl).append(debugParamSortedLangs, rhs.debugParamSortedLangs).append(ingredientsTextEnImported, rhs.ingredientsTextEnImported).append(expirationDate, rhs.expirationDate).append(imageThumbUrl, rhs.imageThumbUrl).append(interfaceVersionCreated, rhs.interfaceVersionCreated).append(dataQualityWarningsTags, rhs.dataQualityWarningsTags).append(ingredientsAnalysisTags, rhs.ingredientsAnalysisTags).append(countriesImported, rhs.countriesImported).append(packaging, rhs.packaging).append(createdT, rhs.createdT).append(purchasePlacesDebugTags, rhs.purchasePlacesDebugTags).append(labelsLc, rhs.labelsLc).append(allergens, rhs.allergens).append(brandsTags, rhs.brandsTags).append(ingredientsTextWithAllergens, rhs.ingredientsTextWithAllergens).append(tracesTags, rhs.tracesTags).append(ingredientsTextEnDebugTags, rhs.ingredientsTextEnDebugTags).append(productNameEn, rhs.productNameEn).append(pnnsGroups2, rhs.pnnsGroups2).append(pnnsGroups1, rhs.pnnsGroups1).append(additivesTagsN, rhs.additivesTagsN).append(ingredientsNTags, rhs.ingredientsNTags).append(imageIngredientsSmallUrl, rhs.imageIngredientsSmallUrl).append(updateKey, rhs.updateKey).append(lastModifiedT, rhs.lastModifiedT).append(productName, rhs.productName).append(ingredientsN, rhs.ingredientsN).append(storesTags, rhs.storesTags).append(nutrientLevels, rhs.nutrientLevels).append(id, rhs.id).append(nutritionDataPerImported, rhs.nutritionDataPerImported).append(labelsPrevTags, rhs.labelsPrevTags).append(unknownNutrientsTags, rhs.unknownNutrientsTags).append(labelsHierarchy, rhs.labelsHierarchy).append(images, rhs.images).append(noNutritionData, rhs.noNutritionData).append(servingSizeDebugTags, rhs.servingSizeDebugTags).append(countriesDebugTags, rhs.countriesDebugTags).append(informersTags, rhs.informersTags).append(dataQualityBugsTags, rhs.dataQualityBugsTags).append(informers, rhs.informers).append(lastEditDatesTags, rhs.lastEditDatesTags).append(additivesTags, rhs.additivesTags).append(aminoAcidsPrevTags, rhs.aminoAcidsPrevTags).append(ingredientsFromPalmOilTags, rhs.ingredientsFromPalmOilTags).append(nutritionDataPerDebugTags, rhs.nutritionDataPerDebugTags).append(nutritionDataPreparedPerImported, rhs.nutritionDataPreparedPerImported).append(ingredientsText, rhs.ingredientsText).append(manufacturingPlaces, rhs.manufacturingPlaces).append(imageFrontThumbUrl, rhs.imageFrontThumbUrl).append(manufacturingPlacesDebugTags, rhs.manufacturingPlacesDebugTags).append(languagesHierarchy, rhs.languagesHierarchy).append(sortkey, rhs.sortkey).append(languagesCodes, rhs.languagesCodes).append(ingredientsFromPalmOilN, rhs.ingredientsFromPalmOilN).append(ingredientsFromOrThatMayBeFromPalmOilN, rhs.ingredientsFromOrThatMayBeFromPalmOilN).append(unknownIngredientsN, rhs.unknownIngredientsN).append(categories, rhs.categories).append(creator, rhs.creator).append(stores, rhs.stores).append(ingredientsTextDebug, rhs.ingredientsTextDebug).append(purchasePlacesTags, rhs.purchasePlacesTags).append(embCodes, rhs.embCodes).append(allergensFromIngredients, rhs.allergensFromIngredients).append(lastEditor, rhs.lastEditor).append(lc, rhs.lc).append(purchasePlaces, rhs.purchasePlaces).append(complete, rhs.complete).append(lastImageDatesTags, rhs.lastImageDatesTags).append(comparedToCategory, rhs.comparedToCategory).append(brandOwnerImported, rhs.brandOwnerImported).append(ingredientsPercentAnalysis, rhs.ingredientsPercentAnalysis).append(quantityDebugTags, rhs.quantityDebugTags).append(linkDebugTags, rhs.linkDebugTags).append(categoriesImported, rhs.categoriesImported).append(genericNameEnDebugTags, rhs.genericNameEnDebugTags).append(productNameEnDebugTags, rhs.productNameEnDebugTags).append(nutritionData, rhs.nutritionData).append(ingredientsThatMayBeFromPalmOilN, rhs.ingredientsThatMayBeFromPalmOilN).append(checkersTags, rhs.checkersTags).append(packagingDebugTags, rhs.packagingDebugTags).append(dataSources, rhs.dataSources).append(selectedImages, rhs.selectedImages).append(correctorsTags, rhs.correctorsTags).append(traces, rhs.traces).append(novaGroupsTags, rhs.novaGroupsTags).append(storesDebugTags, rhs.storesDebugTags).append(newAdditivesN, rhs.newAdditivesN).append(fruitsVegetablesNuts100gEstimate, rhs.fruitsVegetablesNuts100gEstimate).append(categoriesTags, rhs.categoriesTags).append(imageIngredientsThumbUrl, rhs.imageIngredientsThumbUrl).append(ingredientsTags, rhs.ingredientsTags).append(otherNutritionalSubstancesTags, rhs.otherNutritionalSubstancesTags).append(langDebugTags, rhs.langDebugTags).append(lcImported, rhs.lcImported).append(pnnsGroups1Tags, rhs.pnnsGroups1Tags).append(countriesTags, rhs.countriesTags).append(code, rhs.code).append(genericNameEn, rhs.genericNameEn).append(link, rhs.link).append(mineralsTags, rhs.mineralsTags).append(vitaminsPrevTags, rhs.vitaminsPrevTags).append(productNameEnImported, rhs.productNameEnImported).append(sourcesFields, rhs.sourcesFields).append(dataQualityTags, rhs.dataQualityTags).append(nutriscoreData, rhs.nutriscoreData).append(imageNutritionUrl, rhs.imageNutritionUrl).append(lang, rhs.lang).append(servingSize, rhs.servingSize).append(editors, rhs.editors).append(quantity, rhs.quantity).append(additivesN, rhs.additivesN).append(dataSourcesImported, rhs.dataSourcesImported).append(ciqualFoodNameTags, rhs.ciqualFoodNameTags).append(lastModifiedBy, rhs.lastModifiedBy).append(nutriscoreGrade, rhs.nutriscoreGrade).append(ingredientsThatMayBeFromPalmOilTags, rhs.ingredientsThatMayBeFromPalmOilTags).append(originsTags, rhs.originsTags).append(manufacturingPlacesTags, rhs.manufacturingPlacesTags).isEquals();
    }

}
