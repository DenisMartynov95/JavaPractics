package org.example;
//В классе MelonStorage хранится переменная melonAmount — количество дынь на складе. Когда со склада вывозят дыни, метод reduceMelonAmount меняет значение этой переменной.
// Метод принимает в качестве параметра переменную amountToTake — количество дынь, которое нужно вывезти.
//
//    1)Добавь геттер, чтобы получать количество доступных дынь; и конструктор, который принимает параметр newMelonAmount и приравнивает значение переменной melonAmount к переданному параметру newMelonAmount
//    2)В методе main установи количество дынь 300 и выведи его на экран геттером.
//    3)Дополни условие в методе reduceMelonAmount, чтобы со склада невозможно было вывезти больше дынь, чем есть в наличии.
//
//    Если заказчик хочет вывезти больше дынь, чем есть на складе, нужно:
//
//    1)В переменной difference рассчитать разницу между количеством дынь на складе и тем, сколько дынь нужно заказчику;
//    2)вывести сообщение "Не удалось вывезти: [количество дынь]";
//    3)обнулить количество дынь на складе (melonAmount): заказчик заберёт все доступные.
//
//    Если же в наличии достаточно дынь, то просто обнови значение melonAmount , вычтя то количество дынь, которое заказчик заберет.
//
//    В методе main вызови метод reduceMelonAmount с аргументом 100 и ещё раз выведи на экран количество дынь.

public class MelonStorage {
    private int melonAmount; //Количество дынь на складе

    //Добавь здесь конструктор
    public MelonStorage(int melonAmount) {
        this.melonAmount = melonAmount;
    }

    public void reduceMelonAmount(int amountToTake) {
        if (amountToTake > melonAmount) {
            //Допиши, сколько дынь не удалось вывести и обнули их количество
            int difference = amountToTake - melonAmount;
            System.out.println("Не удалось вывезти: " + difference);
            melonAmount = 0;
        } else {
            //Измени исходное количество дынь
            melonAmount = melonAmount - amountToTake;
        }
    }

    //Добавь геттер
    public int getMelonAmount() {
        return melonAmount;
    }
}
