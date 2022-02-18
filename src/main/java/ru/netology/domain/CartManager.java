package ru.netology.domain;

public class CartManager {
    private PurchaseFilm[] items = new PurchaseFilm[0];

    private int maxValue = 10;

    public CartManager() {
        maxValue = 10;
    }

    public CartManager(int maxValue) {
        this.maxValue = maxValue;
    }

    public PurchaseFilm[] findAll() {
        return items;
    }

    public void add(PurchaseFilm item) {
        int length = items.length + 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseFilm[] getAll() {
        PurchaseFilm[] result = new PurchaseFilm[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PurchaseFilm[] findLast() {
        int resultLength;
        if (items.length < maxValue) {
            resultLength = items.length;
        } else {
            resultLength = maxValue;
        }
        PurchaseFilm[] result = new PurchaseFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}




