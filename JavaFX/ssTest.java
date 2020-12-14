

public class ssTest 

//In initialization code:
    chinButton = new JCheckBox("Chin");
    chinButton.setMnemonic(KeyEvent.VK_C);
    chinButton.setSelected(true);

    glassesButton = new JCheckBox("Glasses");
    glassesButton.setMnemonic(KeyEvent.VK_G);
    glassesButton.setSelected(true);

    hairButton = new JCheckBox("Hair");
    hairButton.setMnemonic(KeyEvent.VK_H);
    hairButton.setSelected(true);

    teethButton = new JCheckBox("Teeth");
    teethButton.setMnemonic(KeyEvent.VK_T);
    teethButton.setSelected(true);

    //Register a listener for the check boxes.
    chinButton.addItemListener(this);
    glassesButton.addItemListener(this);
    hairButton.addItemListener(this);
    teethButton.addItemListener(this);
...
public void itemStateChanged(ItemEvent e) {
    ...
    Object source = e.getItemSelectable();

    if (source == chinButton) {
        //...make a note of it...
    } else if (source == glassesButton) {
        //...make a note of it...
    } else if (source == hairButton) {
        //...make a note of it...
    } else if (source == teethButton) {
        //...make a note of it...
    }

    if (e.getStateChange() == ItemEvent.DESELECTED)
        //...make a note of it...
    ...
    updatePicture();
}

