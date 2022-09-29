interface Imprimivel {

    void imprimir();
}

interface Contavel {

    int getTotalAeronaves();
}

interface Comparable<T> {
    public Aeronave compareTo(T other);
}