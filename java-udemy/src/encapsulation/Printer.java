package encapsulation;

import jdk.jfr.Percentage;

public class Printer {

    private final int DEFAULT = 100;
    private int tonerRemainingAmount; // 토너 잔량
    private int printedPage; // 인쇄된 페이지
    private boolean doubleSidedPrinter; // 양면 프린터 여부

    public Printer() {
        this.tonerRemainingAmount = DEFAULT;
    }

    public void toFillInToner(int tonerFill) {
        if (tonerFill < 1 || tonerFill > 100) {
            return;
        }

        if (tonerFill + tonerRemainingAmount > DEFAULT) {
            System.out.println("100을 넘을 수 없습니다.");
            System.out.println("최대 " + (DEFAULT - tonerRemainingAmount) + " 만큼 충전할 수 있습니다.");
        } else {
            this.tonerRemainingAmount += tonerFill;
        }
    }

    public void print(int printedPage) {
        if (this.doubleSidedPrinter) {
            printedPage = printedPage * 2;
        }
        if (tonerRemainingAmount - printedPage < 1) {
            System.out.println("용량을 채우고 프린트 해주세요.");
        } else {
            tonerRemainingAmount -= printedPage;
            this.printedPage += printedPage;
        }
    }

    public void doublePrint(int doublePrintPage) {
        doublePrintPage *= 2;
        if (tonerRemainingAmount - doublePrintPage < 1) {
            System.out.println("용량을 채우고 프린트 해주세요.");
        } else {
            tonerRemainingAmount -= doublePrintPage;
            this.printedPage += doublePrintPage;
            doubleSidedPrinter = !doubleSidedPrinter;
        }
    }

    public void turnOnDouble() {
        doubleSidedPrinter = !doubleSidedPrinter;
    }

    public int getTonerRemainingAmount() {
        return tonerRemainingAmount;
    }


    public int getPrintedPage() {
        return printedPage;
    }

    public boolean isDoubleSidedPrinter() {
        return doubleSidedPrinter;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "DEFAULT=" + DEFAULT +
                ", tonerRemainingAmount=" + tonerRemainingAmount +
                ", printedPage=" + printedPage +
                ", doubleSidedPrinter=" + doubleSidedPrinter +
                '}';
    }
}
