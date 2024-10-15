package com.app.manager.utils;

import java.util.Collections;
import java.util.List;

public final class CollectionsUtils {

    private CollectionsUtils() {}

    public static <T>List<T> getEmptyIfNull(List<T> lista) {
        return lista != null ? lista : Collections.emptyList();
    }

    public static boolean isNullOrEmpty(List<?> lista) {
        return lista == null || lista.isEmpty();
    }

    public static boolean isNullOrEmpty(int[] lista) {
        return lista == null || lista.length == 0;
    }

    public static boolean isNullOrEmpty(String[] lista) {
        return lista == null || lista.length == 0;
    }

    public static String toString(List<?> lista) {
        return lista.toString().replace("[", "").replace("]", "");
    }
}
