package itacademy.factory.entity;

import itacademy.factory.enums.Type;

public class Factory {
    public Extend getExtend(Type type){
        Extend toReturn;
        switch (type){
            case CINEMA:
                toReturn = new Cinema();
                break;
            case TICKET:
                toReturn = new Ticket();
                break;
            case RESTAURANT:
                toReturn = new Restaurant();
                break;
            default:
                throw new IllegalArgumentException("Wrong type:" + type);
        }
        return toReturn;
    }


}
