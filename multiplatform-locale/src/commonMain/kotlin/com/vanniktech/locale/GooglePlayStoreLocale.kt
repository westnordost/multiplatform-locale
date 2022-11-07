package com.vanniktech.locale

/** All the locales supported by the Google Play Store. */
enum class GooglePlayStoreLocale {
  af,
  sq,
  am,
  ar,
  hy_AM,
  az_AZ,
  bn_BD,
  eu_ES,
  be,
  bg,
  my_MM,
  ca,
  zh_HK,
  zh_CN,
  zh_TW,
  hr,
  cs_CZ,
  da_DK,
  nl_NL,
  en_AU,
  en_US,
  en_CA,
  en_GB,
  en_IN,
  en_SG,
  en_ZA,
  et,
  fil,
  fi_FI,
  fr_CA,
  fr_FR,
  gl_ES,
  ka_GE,
  de_DE,
  el_GR,
  gu,
  iw_IL,
  hi_IN,
  hu_HU,
  is_IS,
  id,
  it_IT,
  ja_JP,
  kn_IN,
  kk,
  km_KH,
  ko_KR,
  ky_KG,
  lo_LA,
  lv,
  lt,
  mk_MK,
  ms_MY,
  ms,
  ml_IN,
  mr_IN,
  mn_MN,
  ne_NP,
  no_NO,
  fa,
  fa_AE,
  fa_AF,
  fa_IR,
  pl_PL,
  pt_BR,
  pt_PT,
  pa,
  ro,
  rm,
  ru_RU,
  sr,
  si_LK,
  sk,
  sl,
  es_ES,
  es_US,
  sw,
  sv_SE,
  ta_IN,
  te_IN,
  th,
  tr_TR,
  uk,
  ur,
  vi,
  zu,
  ;

  override fun toString() = name.replace("_", "-")
}
