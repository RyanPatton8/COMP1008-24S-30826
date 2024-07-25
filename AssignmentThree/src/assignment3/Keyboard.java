package assignment3;

public abstract class Keyboard {
    private char[] keys = {'h','e','l','o','w','r','d',' '};
    public boolean fullSize = false;

    protected char getKeyBind(int keyIndex) {
        return keys[keyIndex];
    }

    public boolean setKeyBind(int keyIndex, char key) {
        if(validateSetKeyBind(keyIndex, key)) {
            keys[keyIndex] = key;
            return true;
        }
        return false;
    }

    private boolean validateSetKeyBind(int keyIndex, char keyChange) {
        if (keyIndex < 0 || keyIndex >= keys.length) {
            return false;
        }
        for (char key : keys) {
            if (key == keyChange) {
                return false;
            }
        }
        return true;
    }
}
