package com.example.carmanagerpro.domain.model

enum class FuelType(val displayName: String) {
    PETROL("Бензин"),
    DIESEL("Дизель"),
    ELECTRIC("Электро"),
    HYBRID("Гибрид"),
    GAS("Газ"),
}

enum class BrandingType(val displayName: String) {
    NONE_BRANDING("Без брендирования"),
    FULL_BRANDING("Полное брендирование"),
    PARTIAL_BRANDING("Частичное брендирование"),
}

enum class TransmissionType(val displayName: String) {
    MANUAL("МКПП"),
    AUTOMATIC("АКПП"),
    ROBOT("Робот"),
    CVT("Вариатор")
}