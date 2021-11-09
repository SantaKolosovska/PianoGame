import javax.swing.*;

public class CheckBoxes extends JCheckBox {
    final static boolean contentArea = false;
    public static int boundX = 125;
    final static int boundY = 420;
    final static int height = 20;
    final static int width = 20;

    public CheckBoxes() {
    }

    public CheckBoxes(Icon icon) {
        super(icon);
    }

    public CheckBoxes(Icon icon, boolean selected) {
        super(icon, selected);
    }

    public CheckBoxes(String text) {
        super(text);
    }

    public CheckBoxes(Action a) {
        super(a);
    }

    public CheckBoxes(String text, boolean selected) {
        super(text, selected);
    }

    public CheckBoxes(String text, Icon icon) {
        super(text, icon);
    }

    public CheckBoxes(String text, Icon icon, boolean selected) {
        super(text, icon, selected);
    }

    public static JCheckBox createCheckboxC() {
        JCheckBox checkBoxC = new JCheckBox();
        checkBoxC.setBounds(boundX, boundY, width, height);
        checkBoxC.setContentAreaFilled(contentArea);
        return checkBoxC;
    }

    public static JCheckBox createWhiteKeyCheckbox() {
        JCheckBox newCheckBox = new JCheckBox();
        newCheckBox.setBounds(boundX + 70, boundY, width, height);
        newCheckBox.setContentAreaFilled(contentArea);
        boundX = boundX + 70;
        return newCheckBox;
    }


    public boolean isContentArea() {
        return contentArea;
    }


    public int getBoundX() {
        return boundX;
    }

    public void setBoundX(int boundX) {
        this.boundX = boundX;
    }

    public int getBoundY() {
        return boundY;
    }



    @Override
    public int getHeight() {
        return height;
    }



    @Override
    public int getWidth() {
        return width;
    }



//    public static JCheckBox createWhiteKeyCheckBox(){
//        JCheckBox checkBox = new JCheckBox();
//        checkBox.setBounds(boundX, boundY, width, height);
//        checkBox.setContentAreaFilled(contentArea);
//        return checkBox;
//    }
}
