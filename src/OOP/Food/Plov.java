package OOP.Food;

public class Plov {

    //значения по  умолчанию от джава
    //значения по  умолчанию от нас

    public double carrot ;
    public double meat   ;
    public int rice  =  1;
    public int onion     ;

    public Plov(){

    }

    public Plov(double carrot, double meat, int rice, int onion) {
        this.carrot = carrot;
        this.meat = meat;
        this.rice = rice;
        this.onion = onion;
    }

    @Override
    public String toString() {
        return "Plov{" +
                "carrot=" + carrot +
                ", meat=" + meat +
                ", rice=" + rice +
                ", onion=" + onion +
                '}';
    }
}

//дефолтный конструкот создается всегда, первый коструктор создает джава под капотом и он пустой
//если мы создадим  любой конструктор , то тот который был создан джавой удаляется
//несколько видов конструктора в классе могут существоват , но не могут дублироваться(джава смотрит на типы , а не на индификаторы. Т е если два конструктора с разнымии идентификаторами , но с одинаковоми типами то будет конфликт)
//если мы хотим перейти в конструктор класса , но он создан джавой то перейдет просто к классу где под капотом создан пустой конструктор
//конструктор это инициализатор