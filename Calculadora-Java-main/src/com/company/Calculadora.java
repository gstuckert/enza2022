package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel JCalculadora;
    private JButton btn_numOne;
    private JButton btn_numTwo;
    private JButton btn_numThree;
    private JButton btn_opTimes;
    private JButton btn_opClear1;
    private JButton btn_opClear2;
    private JButton btn_opClear3;
    private JButton btn_opDivide;
    private JButton btn_numFour;
    private JButton btn_numFive;
    private JButton btn_numSix;
    private JButton btn_opMinus;
    private JButton btn_numSeven;
    private JButton btn_numEight;
    private JButton btn_numNine;
    private JButton btn_numPlus;
    private JButton btn_numZero1;
    private JButton btn_numZero2;
    private JButton btn_dot;
    private JButton btn_opEquals;
    private JTextField showValuesBox;

    public int operationType;
    public double num1, num2, result;

    public Calculadora() {
        btn_opClear1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetNumsOnCalc();
            }
        });
        btn_opClear2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetNumsOnCalc();
            }
        });
        btn_opClear3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetNumsOnCalc();
            }
        });
        btn_numOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("1");
            }
        });
        btn_numTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("2");
            }
        });
        btn_numThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("3");
            }
        });
        btn_numFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("4");
            }
        });
        btn_numFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("5");
            }
        });
        btn_numSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("6");
            }
        });
        btn_numSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("7");
            }
        });
        btn_numEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("8");
            }
        });
        btn_numNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("9");
            }
        });
        btn_numZero1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("0");
            }
        });
        btn_numZero2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertToCalc("0");
            }
        });
        btn_dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertDot();
            }
        });
        btn_opDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation(0, Double.parseDouble(showValuesBox.getText()));
                resetNumsOnCalc();
            }
        });
        btn_opTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation(1, Double.parseDouble(showValuesBox.getText()));
                resetNumsOnCalc();
            }
        });
        btn_opMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation(2, Double.parseDouble(showValuesBox.getText()));
                resetNumsOnCalc();
            }
        });
        btn_numPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation(3, Double.parseDouble(showValuesBox.getText()));
                resetNumsOnCalc();
            }
        });
        btn_opEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMethod();
            }
        });
    }

    public void resetNumsOnCalc() {
        showValuesBox.setText("");
    }

    public void insertToCalc(String num) {
        showValuesBox.setText(showValuesBox.getText() + num);
    }

    public void setOperation(int type, double num1) { this.operationType = type; this.num1 = num1; }

    public void calculateMethod() {
        if (!showValuesBox.getText().equals("")) {
            this.num2 = Integer.parseInt(showValuesBox.getText());

            resetNumsOnCalc();

            switch (this.operationType) {
                case 0:
                    this.result = num1 / num2;
                    insertToCalc(String.valueOf(result));
                    break;
                case 1:
                    this.result = num1 * num2;
                    insertToCalc(String.valueOf(result));
                    break;
                case 2:
                    this.result = num1 - num2;
                    insertToCalc(String.valueOf(result));
                    break;
                case 3:
                    this.result = num1 + num2;
                    insertToCalc(String.valueOf(result));
                    break;
                default:
                    break;
            }
        }
    }

    public void insertDot() {
        int indexOfValuesBox = (showValuesBox.getText().length()) -1 ;

        if (showValuesBox.getText().charAt(indexOfValuesBox) == '.') {
            return;
        } else {
            insertToCalc(".");
        }
    }

    public static void run() {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().JCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
