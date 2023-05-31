package project.models;

public abstract class Medals {
    abstract void  calcMedal(int a);

    public void setGoldMedals(int count) {
    }

    public String getGoldMedals() {
        return null;
    }
}

class Gold extends Medals{
    @Override
    void calcMedal(int a) {
        a *= 3;
    }
}

class Silver extends Medals{
    @Override
    void calcMedal(int a) {
        a *= 2;
    }
}

class Bronze extends Medals{
    @Override
    void calcMedal(int a) {
        a *= 1;
    }
}