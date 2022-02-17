package ru.netology.domain;

public class CartManager {
    private PurchaseFilm[] items = new PurchaseFilm[0];

    private int maxValue = 10;

    public PurchaseFilm[] findAll() {
        return items;
    }

    public void add(PurchaseFilm item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseFilm[] getAll() {
        PurchaseFilm[] result = new PurchaseFilm[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];
        int index = 0;
        for (PurchaseFilm item : items) {
            if (item.getFilmId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }

    public CartManager() {
        maxValue = 10;
    }

    public CartManager(int maxValue) {
        this.maxValue = maxValue;
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

        // заполняем result из массива что лежит в поле
        // в обратном порядке
        return result;
    }
}




