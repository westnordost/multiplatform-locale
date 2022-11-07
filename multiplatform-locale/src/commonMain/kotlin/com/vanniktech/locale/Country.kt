package com.vanniktech.locale

/** https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
enum class Country(
  val identifier: String,
  val emoji: String,
) {
  AFGHANISTAN(identifier = "AF", emoji = """🇦🇫"""),
  ALAND_ISLANDS(identifier = "AX", emoji = """🇦🇽"""),
  ALBANIA(identifier = "AL", emoji = """🇦🇱"""),
  ALGERIA(identifier = "DZ", emoji = """🇩🇿"""),
  AMERICAN_SAMOA(identifier = "AS", emoji = """🇦🇸"""),
  ANDORRA(identifier = "AD", emoji = """🇦🇩"""),
  ANGOLA(identifier = "AO", emoji = """🇦🇴"""),
  ANGUILLA(identifier = "AI", emoji = """🇦🇮"""),
  ANTARCTICA(identifier = "AQ", emoji = """🇦🇶"""),
  ANTIGUA_AND_BARBUDA(identifier = "AG", emoji = """🇦🇬"""),
  ARGENTINA(identifier = "AR", emoji = """🇦🇷"""),
  ARMENIA(identifier = "AM", emoji = """🇦🇲"""),
  ARUBA(identifier = "AW", emoji = """🇦🇼"""),
  AUSTRALIA(identifier = "AU", emoji = """🇦🇺"""),
  AUSTRIA(identifier = "AT", emoji = """🇦🇹"""),
  AZERBAIJAN(identifier = "AZ", emoji = """🇦🇿"""),
  BAHAMAS(identifier = "BS", emoji = """🇧🇸"""),
  BAHRAIN(identifier = "BH", emoji = """🇧🇭"""),
  BANGLADESH(identifier = "BD", emoji = """🇧🇩"""),
  BARBADOS(identifier = "BB", emoji = """🇧🇧"""),
  BELARUS(identifier = "BY", emoji = """🇧🇾"""),
  BELGIUM(identifier = "BE", emoji = """🇧🇪"""),
  BELIZE(identifier = "BZ", emoji = """🇧🇿"""),
  BENIN(identifier = "BJ", emoji = """🇧🇯"""),
  BERMUDA(identifier = "BM", emoji = """🇧🇲"""),
  BHUTAN(identifier = "BT", emoji = """🇧🇹"""),
  BOLIVIA(identifier = "BO", emoji = """🇧🇴"""),
  BONAIRE(identifier = "BQ", emoji = """🇧🇶"""),
  BOSNIA_AND_HERZEGOVINA(identifier = "BA", emoji = """🇧🇦"""),
  BOTSWANA(identifier = "BW", emoji = """🇧🇼"""),
  BRAZIL(identifier = "BR", emoji = """🇧🇷"""),
  BRITISH_INDIAN_OCEAN_TERRITORY(identifier = "IO", emoji = """🇮🇴"""),
  BRITISH_VIRGIN_ISLANDS(identifier = "VG", emoji = """🇻🇬"""),
  BRUNEI(identifier = "BN", emoji = """🇧🇳"""),
  BULGARIA(identifier = "BG", emoji = """🇧🇬"""),
  BURKINA_FASO(identifier = "BF", emoji = """🇧🇫"""),
  BURUNDI(identifier = "BI", emoji = """🇧🇮"""),
  CAMBODIA(identifier = "KH", emoji = """🇰🇭"""),
  CAMEROON(identifier = "CM", emoji = """🇨🇲"""),
  CANADA(identifier = "CA", emoji = """🇨🇦"""),
  CANARY_ISLANDS(identifier = "IC", emoji = """🇮🇨"""),
  CAPE_VERDE(identifier = "CV", emoji = """🇨🇻"""),
  CAYMAN_ISLANDS(identifier = "KY", emoji = """🇰🇾"""),
  CENTRAL_AFRICAN_REPUBLIC(identifier = "CF", emoji = """🇨🇫"""),
  CHAD(identifier = "TD", emoji = """🇹🇩"""),
  CHILE(identifier = "CL", emoji = """🇨🇱"""),
  CHINA(identifier = "CN", emoji = """🇨🇳"""),
  CHRISTMAS_ISLAND(identifier = "CX", emoji = """🇨🇽"""),
  COCOS_ISLANDS(identifier = "CC", emoji = """🇨🇨"""),
  COLOMBIA(identifier = "CO", emoji = """🇨🇴"""),
  COMOROS(identifier = "KM", emoji = """🇰🇲"""),
  COOK_ISLANDS(identifier = "CK", emoji = """🇨🇰"""),
  COSTA_RICA(identifier = "CR", emoji = """🇨🇷"""),
  COTE_DIVOIRE(identifier = "CI", emoji = """🇫🇷"""),
  CROATIA(identifier = "HR", emoji = """🇭🇷"""),
  CUBA(identifier = "CU", emoji = """🇨🇺"""),
  CURACAO(identifier = "CW", emoji = """🇨🇼"""),
  CYPRUS(identifier = "CY", emoji = """🇨🇾"""),
  CZECHIA(identifier = "CZ", emoji = """🇨🇿"""),
  DEMOCRATIC_REPUBLIC_OF_CONGO(identifier = "CD", emoji = """🇨🇩"""),
  DENMARK(identifier = "DK", emoji = """🇩🇰"""),
  DJIBOUTI(identifier = "DJ", emoji = """🇩🇯"""),
  DOMINICA(identifier = "DM", emoji = """🇩🇲"""),
  DOMINICAN_REPUBLIC(identifier = "DO", emoji = """🇩🇴"""),
  ECUADOR(identifier = "EC", emoji = """🇪🇨"""),
  EGYPT(identifier = "EG", emoji = """🇪🇬"""),
  EL_SALVADOR(identifier = "SV", emoji = """🇸🇻"""),
  ENGLAND(identifier = "GB", emoji = """🏴󠁧󠁢󠁥󠁮󠁧󠁿󠁧"""),
  EQUATORIAL_GUINEA(identifier = "GQ", emoji = """🇬🇶"""),
  ERITREA(identifier = "ER", emoji = """🇪🇷"""),
  ESTONIA(identifier = "EE", emoji = """🇪🇪"""),
  ESWATINI(identifier = "SZ", emoji = """🇸🇿"""),
  ETHIOPIA(identifier = "ET", emoji = """🇪🇹"""),
  FALKLAND_ISLANDS(identifier = "FK", emoji = """🇫🇰"""),
  FAROE_ISLANDS(identifier = "FO", emoji = """🇫🇴"""),
  FIJI(identifier = "FJ", emoji = """🇫🇯"""),
  FINLAND(identifier = "FI", emoji = """🇫🇮"""),
  FRANCE(identifier = "FR", emoji = """🇫🇷"""),
  FRENCH_GUIANA(identifier = "GF", emoji = """🇬🇫"""),
  FRENCH_POLYNESIA(identifier = "PF", emoji = """🇵🇫"""),
  GABON(identifier = "GA", emoji = """🇬🇦"""),
  GAMBIA(identifier = "GM", emoji = """🇬🇲"""),
  GEORGIA(identifier = "GE", emoji = """🇬🇪"""),
  GERMANY(identifier = "DE", emoji = """🇩🇪"""),
  GHANA(identifier = "GH", emoji = """🇬🇭"""),
  GIBRALTAR(identifier = "GI", emoji = """🇬🇮"""),
  GREECE(identifier = "GR", emoji = """🇬🇷"""),
  GREENLAND(identifier = "GL", emoji = """🇬🇱"""),
  GRENADA(identifier = "GD", emoji = """🇬🇩"""),
  GUADELOUPE(identifier = "GP", emoji = """🇬🇵"""),
  GUAM(identifier = "GU", emoji = """🇬🇺"""),
  GUATEMALA(identifier = "GT", emoji = """🇬🇹"""),
  GUERNSEY(identifier = "GG", emoji = """🇬🇬"""),
  GUINEA(identifier = "GN", emoji = """🇬🇳"""),
  GUINEA_BISSAU(identifier = "GW", emoji = """🇬🇼"""),
  GUYANA(identifier = "GY", emoji = """🇬🇾"""),
  HAITI(identifier = "HT", emoji = """🇭🇹"""),
  HONDURAS(identifier = "HN", emoji = """🇭🇳"""),
  HONG_KONG(identifier = "HK", emoji = """🇭🇰"""),
  HUNGARY(identifier = "HU", emoji = """🇭🇺"""),
  ICELAND(identifier = "IS", emoji = """🇮🇸"""),
  INDIA(identifier = "IN", emoji = """🇮🇳"""),
  INDONESIA(identifier = "ID", emoji = """🇮🇩"""),
  INTERNATIONAL_WATERS(identifier = "XZ", emoji = """🌊"""), // https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2#User-assigned_code_elements
  IRAN(identifier = "IR", emoji = """🇮🇷"""),
  IRAQ(identifier = "IQ", emoji = """🇮🇶"""),
  IRELAND(identifier = "IE", emoji = """🇮🇪"""),
  ISLE_OF_MAN(identifier = "IM", emoji = """🇮🇲"""),
  ISRAEL(identifier = "IL", emoji = """🇮🇱"""),
  ITALY(identifier = "IT", emoji = """🇮🇹"""),
  JAMAICA(identifier = "JM", emoji = """🇯🇲"""),
  JAPAN(identifier = "JP", emoji = """🇯🇵"""),
  JERSEY(identifier = "JE", emoji = """🇯🇪"""),
  JORDAN(identifier = "JO", emoji = """🇯🇴"""),
  KAZAKHSTAN(identifier = "KZ", emoji = """🇰🇿"""),
  KENYA(identifier = "KE", emoji = """🇰🇪"""),
  KIRIBATI(identifier = "KI", emoji = """🇰🇮"""),
  KOSOVO(identifier = "XK", emoji = """🇽🇰"""),
  KUWAIT(identifier = "KW", emoji = """🇰🇼"""),
  KYRGYZSTAN(identifier = "KG", emoji = """🇰🇬"""),
  LAOS(identifier = "LA", emoji = """🇱🇦"""),
  LATVIA(identifier = "LV", emoji = """🇱🇻"""),
  LEBANON(identifier = "LB", emoji = """🇱🇧"""),
  LESOTHO(identifier = "LS", emoji = """🇱🇸"""),
  LIBERIA(identifier = "LR", emoji = """🇱🇷"""),
  LIBYA(identifier = "LY", emoji = """🇱🇾"""),
  LIECHTENSTEIN(identifier = "LI", emoji = """🇱🇮"""),
  LITHUANIA(identifier = "LT", emoji = """🇱🇹"""),
  LUXEMBOURG(identifier = "LU", emoji = """🇱🇺"""),
  MACAO(identifier = "MO", emoji = """🇲🇴"""),
  MADAGASCAR(identifier = "MG", emoji = """🇲🇬"""),
  MALAWI(identifier = "MW", emoji = """🇲🇼"""),
  MALAYSIA(identifier = "MY", emoji = """🇲🇾"""),
  MALDIVES(identifier = "MV", emoji = """🇲🇻"""),
  MALI(identifier = "ML", emoji = """🇲🇱"""),
  MALTA(identifier = "MT", emoji = """🇲🇹"""),
  MARSHALL_ISLAND(identifier = "MH", emoji = """🇲🇭"""),
  MARTINIQUE(identifier = "MQ", emoji = """🇲🇶"""),
  MAURITANIA(identifier = "MR", emoji = """🇲🇷"""),
  MAURITIUS(identifier = "MU", emoji = """🇲🇺"""),
  MAYOTTE(identifier = "YT", emoji = """🇾🇹"""),
  MEXICO(identifier = "MX", emoji = """🇲🇽"""),
  MICRONESIA(identifier = "FM", emoji = """🇫🇲"""),
  MOLDOVA(identifier = "MD", emoji = """🇲🇩"""),
  MONACO(identifier = "MC", emoji = """🇲🇨"""),
  MONGOLIA(identifier = "MN", emoji = """🇲🇳"""),
  MONTENEGRO(identifier = "ME", emoji = """🇲🇪"""),
  MONTSERRAT(identifier = "MS", emoji = """🇲🇸"""),
  MOROCCO(identifier = "MA", emoji = """🇲🇦"""),
  MOZAMBIQUE(identifier = "MZ", emoji = """🇲🇿"""),
  MYANMAR(identifier = "MM", emoji = """🇲🇲"""),
  NAMIBIA(identifier = "NA", emoji = """🇳🇦"""),
  NAURU(identifier = "NR", emoji = """🇳🇷"""),
  NEPAL(identifier = "NP", emoji = """🇳🇵"""),
  NETHERLANDS(identifier = "NL", emoji = """🇳🇱"""),
  NEW_CALEDONIA(identifier = "NC", emoji = """🇳🇨"""),
  NEW_ZEALAND(identifier = "NZ", emoji = """🇳🇿"""),
  NICARAGUA(identifier = "NI", emoji = """🇳🇮"""),
  NIGER(identifier = "NE", emoji = """🇳🇪"""),
  NIGERIA(identifier = "NG", emoji = """🇳🇬"""),
  NIUE(identifier = "NU", emoji = """🇳🇺"""),
  NORFOLK_ISLAND(identifier = "NF", emoji = """🇳🇫"""),
  NORTHERN_MARIANA_ISLANDS(identifier = "MP", emoji = """🇲🇵"""),
  NORTH_KOREA(identifier = "KP", emoji = """🇰🇵"""),
  NORTH_MACEDONIA(identifier = "MK", emoji = """🇲🇰"""),
  NORWAY(identifier = "NO", emoji = """🇳🇴"""),
  OMAN(identifier = "OM", emoji = """🇴🇲"""),
  PAKISTAN(identifier = "PK", emoji = """🇵🇰"""),
  PALAU(identifier = "PW", emoji = """🇵🇼"""),
  PALESTINE(identifier = "PS", emoji = """🇵🇸"""),
  PANAMA(identifier = "PA", emoji = """🇵🇦"""),
  PAPUA_NEW_GUINEA(identifier = "PG", emoji = """🇵🇬"""),
  PARAGUAY(identifier = "PY", emoji = """🇵🇾"""),
  PERU(identifier = "PE", emoji = """🇵🇾"""),
  PHILIPPINES(identifier = "PH", emoji = """🇵🇭"""),
  PITCAIRN_ISLANDS(identifier = "PN", emoji = """🇵🇳"""),
  POLAND(identifier = "PL", emoji = """🇵🇱"""),
  PORTUGAL(identifier = "PT", emoji = """🇵🇹"""),
  PUERTO_RICO(identifier = "PR", emoji = """🇵🇷"""),
  QATAR(identifier = "QA", emoji = """🇶🇦"""),
  REPUBLIC_OF_THE_CONGO(identifier = "CG", emoji = """🇨🇬"""),
  REUNION(identifier = "RE", emoji = """🇷🇪"""),
  ROMANIA(identifier = "RO", emoji = """🇷🇴"""),
  RUSSIA(identifier = "RU", emoji = """🇷🇺"""),
  RWANDA(identifier = "RW", emoji = """🇷🇼"""),
  SAHRAWI_ARAB_DEMOCRATIC_REPUBLIC(identifier = "EH", emoji = """🇪🇭"""),
  SAINT_BARTS(identifier = "BL", emoji = """🇧🇱"""),
  SAINT_KITTS_AND_NEVIS(identifier = "KN", emoji = """🇰🇳"""),
  SAINT_LUCIA(identifier = "LC", emoji = """🇱🇨"""),
  SAINT_VINCENT_AND_THE_GRENADINES(identifier = "VC", emoji = """🇻🇨"""),
  SAMOA(identifier = "WS", emoji = """🇼🇸"""),
  SAN_MARINO(identifier = "SM", emoji = """🇸🇲"""),
  SAO_TOME_AND_PRINCE(identifier = "ST", emoji = """🇸🇹"""),
  SAUDI_ARABIA(identifier = "SA", emoji = """🇸🇦"""),
  SENEGAL(identifier = "SN", emoji = """🇸🇳"""),
  SERBIA(identifier = "RS", emoji = """🇷🇸"""),
  SEYCHELLES(identifier = "SC", emoji = """🇸🇨"""),
  SIERRA_LEONE(identifier = "SL", emoji = """🇸🇱"""),
  SINGAPORE(identifier = "SG", emoji = """🇸🇬"""),
  SINT_MAARTEN(identifier = "SX", emoji = """🇸🇽"""),
  SLOVAKIA(identifier = "SK", emoji = """🇸🇰"""),
  SLOVENIA(identifier = "SI", emoji = """🇸🇮"""),
  SOLOMON_ISLANDS(identifier = "SB", emoji = """🇸🇧"""),
  SOMALIA(identifier = "SO", emoji = """🇸🇴"""),
  SOUTH_AFRICA(identifier = "ZA", emoji = """🇿🇦"""),
  SOUTH_KOREA(identifier = "KR", emoji = """🇰🇷"""),
  SOUTH_SUDAN(identifier = "SS", emoji = """🇸🇸"""),
  SPAIN(identifier = "ES", emoji = """🇪🇸"""),
  SRI_LANKA(identifier = "LK", emoji = """🇱🇰"""),
  SUDAN(identifier = "SD", emoji = """🇸🇩"""),
  SURINAME(identifier = "SR", emoji = """🇸🇷"""),
  SWEDEN(identifier = "SE", emoji = """🇸🇪"""),
  SWITZERLAND(identifier = "CH", emoji = """🇨🇭"""),
  SYRIA(identifier = "SY", emoji = """🇸🇾"""),
  TAIWAN(identifier = "TW", emoji = """🇹🇼"""),
  TAJIKISTAN(identifier = "TJ", emoji = """🇹🇯"""),
  TANZANIA(identifier = "TZ", emoji = """🇹🇿"""),
  THAILAND(identifier = "TH", emoji = """🇹🇭"""),
  TIMOR_LESTE(identifier = "TL", emoji = """🇹🇱"""),
  TOGO(identifier = "TG", emoji = """🇹🇬"""),
  TOKELAU(identifier = "TK", emoji = """🇹🇰"""),
  TONGA(identifier = "TO", emoji = """🇹🇴"""),
  TRINIDAD_AND_TOBAGO(identifier = "TT", emoji = """🇹🇹"""),
  TUNISIA(identifier = "TN", emoji = """🇹🇳"""),
  TURKEY(identifier = "TR", emoji = """🇹🇷"""),
  TURKMENISTAN(identifier = "TM", emoji = """🇹🇲"""),
  TURKS_AND_CAICOS(identifier = "TC", emoji = """🇹🇨"""),
  TUVALU(identifier = "TV", emoji = """🇹🇻"""),
  UGANDA(identifier = "UG", emoji = """🇺🇬"""),
  UKRAINE(identifier = "UA", emoji = """🇺🇦"""),
  UNITED_ARAB_EMIRATES(identifier = "AE", emoji = """🇦🇪"""),
  URUGUAY(identifier = "UY", emoji = """🇺🇾"""),
  USA(identifier = "US", emoji = """🇺🇸"""),
  US_VIRGIN_ISLANDS(identifier = "VI", emoji = """🇻🇮"""),
  UZBEKISTAN(identifier = "UZ", emoji = """🇺🇿"""),
  VANUATU(identifier = "VU", emoji = """🇻🇺"""),
  VATICAN_CITY(identifier = "VA", emoji = """🇻🇦"""),
  VENEZUELA(identifier = "VE", emoji = """🇻🇪"""),
  VIETNAM(identifier = "VN", emoji = """🇻🇳"""),
  WALLIS_AND_FUTUNA(identifier = "WF", emoji = """🇼🇫"""),
  YEMEN(identifier = "YE", emoji = """🇾🇪"""),
  ZAMBIA(identifier = "ZM", emoji = """🇿🇲"""),
  ZIMBABWE(identifier = "ZW", emoji = """🇿🇼"""),
  ;

  companion object {
    fun fromOrNull(identifier: String?) =
      values().firstOrNull { it.identifier.equals(identifier, ignoreCase = true) }

    fun fromLocaleOrNull(locale: String?): Country? {
      val splits = localeSplit(locale)
      return fromOrNull(splits.getOrNull(1))
    }

    /** Tries every possible combination that I know to somehow get a meaningful country. */
    fun fromLenientOrNull(string: String?) = values().firstOrNull { it.name.equals(string, ignoreCase = true) }
      ?: fromOrNull(string)
      ?: fromLocaleOrNull(string)
  }
}

/** Returns the display name of [Country] in the current language. */
expect fun Country.displayName(): String
