package by.tms.services;

public enum  CalcService {
    SUM{
        @Override
        public double run(double a, double b) { return a + b; }
    },

    SUB{
        @Override
        public double run(double a, double b) { return a - b; }
    },

    MUL{
        @Override
        public double run(double a, double b) { return a * b; }
    },

    DIV{
        @Override
        public double run(double a, double b) { return a / b; }
    };

    public abstract double run(double a, double b) throws ArithmeticException;
}
