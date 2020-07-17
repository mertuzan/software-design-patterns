package iteratorpattern;

import java.util.List;

class DersAggregate implements Aggregate {
    private List<Ders>dersler;
    DersAggregate(List<Ders>dersler){
        this.dersler=dersler;
    }
    @Override
    public Iterator getIterator() {
        return new DersIterator(dersler);
    }
}
