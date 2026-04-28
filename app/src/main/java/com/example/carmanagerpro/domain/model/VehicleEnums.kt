package com.example.carmanagerpro.domain.model

enum class fuelType(val displayName: String) {
    PETROL("Бензин"),
    DIESEL("Дизель"),
    ELECTRIC("Электро"),
    HYBRID("Гибрид"),
    GAS("Газ"),
}

enum class brandingType(val displayName: String) {
    NONE_BRANDING("Без брендирования"),
    FULL_BRANDING("Полное брендирование"),
    PARTIAL_BRANDING("Частичное брендирование"),
}

enum class transmissionType(val displayName: String) {
    MANUAL("МКПП"),
    AUTOMATIC("АКПП"),
    ROBOT("Робот"),
    CVT("Вариатор")
}