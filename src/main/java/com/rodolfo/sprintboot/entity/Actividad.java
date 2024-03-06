package com.rodolfo.sprintboot.entity;

import lombok.*;


@AllArgsConstructor
@Getter

public enum Actividad {
    PROCESAMIENTO_Y_CONSERVACION_DE_ALIMENTOS_BEBIDAS_Y_TABACO(1, "Procesamiento y conservación de alimentos, bebidas y tabaco"),
    INDUSTRIA_FRIGORIFICA(2, "Industria frigorífica"),
    PESCA(3, "Pesca"),
    INDUSTRIA_TEXTIL(4, "Industria Textil"),
    INDUSTRIAS_DEL_CUERO_VESTIMENTA_Y_CALZADO(5, "Industrias del Cuero, Vestimenta y Calzado"),
    INDUSTRIA_DE_LA_MADERA_CELULOSA_Y_PAPEL(6, "Industria de la madera, celulosa y papel"),
    INDUSTRIA_QUIMICA_MEDICAMENTO_FARMACEUTICA_DE_COMBUSTIBLES_Y_ANEXOS(7, "Industria química, del medicamento, farmacéutica, de combustibles y anexos"),
    INDUSTRIA_DE_PRODUCTOS_METALICOS_MAQUINARIAS_Y_EQUIPO(8, "Industria de productos metálicos, maquinarias y equipo"),
    INDUSTRIA_DE_LA_CONSTRUCCION_Y_ACTIVIDADES_COMPLEMENTARIAS(9, "Industria de la construcción y actividades complementarias"),
    COMERCIO_EN_GENERAL(10, "Comercio en general"),
    COMERCIO_MINORISTA_DE_LA_ALIMENTACION(11, "Comercio minorista de la alimentación"),
    HOTELES_RESTORANES_Y_BARES(12, "Hoteles, restoranes y bares"),
    TRANSPORTE_Y_ALMACENAMIENTO(13, "Transporte y almacenamiento"),
    INTERMEDIACION_FINANCIERA_SEGUROS_Y_PENSIONES(14, "Intermediación financiera, seguros y pensiones"),
    SERVICIOS_DE_SALUD_Y_ANEXOS(15, "Servicios de salud y anexos"),
    SERVICIOS_DE_ENSENANZA(16, "Servicios de enseñanza"),
    INDUSTRIA_GRAFICA(17, "Industria gráfica"),
    SERVICIOS_CULTURALES_DE_ESPARCIMIENTO_Y_COMUNICACIONES(18, "Servicios culturales, de esparcimiento y comunicaciones"),
    SERVICIOS_PROFESIONALES_TECNICOS_ESPECIALIZADOS_Y_NO_INCLUIDOS_EN_OTROS_GRUPOS(19, "Servicios profesionales, técnicos, especializados y aquellos no incluidos en otros grupos"),
    ENTIDADES_GREMIALES_SOCIALES_Y_DEPORTIVAS(20, "Entidades gremiales, sociales y deportivas"),
    GANADERIA_AGRICULTURA_Y_ACTIVIDADES_CONEXAS(22, "Ganadería, Agricultura y actividades conexas"),
    VINEDOS_FRUTICULTURA_HORTICULTURA_FLORICULTURA_CRIADEROS_DE_AVES_SUINOS_APICULTURA_Y_OTRAS_ACTIVIDADES_NO_INCLUIDAS_EN_EL_GRUPO_22(23, "Viñedos, fruticultura, horticultura, floricultura, criaderos de aves, suinos, apicultura y otras actividades no inc. en el grpo.22"),
    FORESTACION_INCLUIDO_BOSQUES_MONTES_Y_TURBERAS(24, "Forestación (incluído bosques, montes y turberas)");
    ;

    private final int codigo;
    private final String descripcion;

}
