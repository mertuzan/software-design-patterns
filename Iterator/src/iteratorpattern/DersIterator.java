package iteratorpattern;

import java.util.List;

class DersIterator implements Iterator {

        private int index;
        private List<Ders> dersler;

        public DersIterator(List<Ders> dersler) {
            this.dersler = dersler;
        }

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean isDone() {
            return (dersler.size() <= index);
        }

        @Override
        public Ders currentItem() {
            return dersler.get(index);
        }

    }

