import java.util.ArrayList;

        

          

import java.util.List;

        

          


        

          

public class PythagoreanTriplet {

        

          

    private final int a;

        

          

    private final int b;

        

          

    private final int c;

        

          


        

          

    public PythagoreanTriplet(int a, int b, int c) {

        

          

        this.a = a;

        

          

        this.b = b;

        

          

        this.c = c;

        

          

    }

        

          


        

          

    public static Builder makeTripletsList() {

        

          

        return new Builder();

        

          

    }

        

          


        

          

    @Override

        

          

    public boolean equals(Object o) {

        

          

        if (this == o) return true;

        

          

        if (o == null || getClass() != o.getClass()) return false;

        

          

        PythagoreanTriplet that = (PythagoreanTriplet) o;

        

          

        return a == that.a &&

        

          

                b == that.b &&

        

          

                c == that.c;

        

          

    }

        

          


        

          

    @Override

        

          

    public String toString() {

        

          

        return "PythagoreanTriplet{" +

        

          

                "a=" + a +

        

          

                ", b=" + b +

        

          

                ", c=" + c +

        

          

                '}';

        

          

    }

        

          


        

          

    static class Builder {

        

          

        private int maxFactor;

        

          


        

          

        public Builder withFactorsLessThanOrEqualTo(int maxFactor) {

        

          

            this.maxFactor = maxFactor;

        

          

            return this;

        

          

        }

        

          


        

          

        public Builder thatSumTo(int sum) {

        

          

            return this;

        

          

        }

        

          


        

          

        public List<PythagoreanTriplet> build() {

        

          

            var result = new ArrayList<PythagoreanTriplet>();

        

          

            for (int c = maxFactor; c >= 0; --c) {

        

          

                for (int b = Math.min(maxFactor - c, c - 1); b > (maxFactor - c) / 2; --b) {

        

          

                    int a = maxFactor - c - b;

        

          

                    if (isValid(a, b, c)) {

        

          

                        result.add(new PythagoreanTriplet(a, b, c));

        

          

                    }

        

          

                }

        

          

            }

        

          

            return result;

        

          

        }

        

          


        

          

        boolean isValid(int a, int b, int c) {

        

          

            return a * a + b * b == c * c;

        

          

        }

        

          

    }

        

          

}

        

          


            
