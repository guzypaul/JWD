package by.guzypaul.xml.entity;

public class Paper {
    private String title;
    private String type;
    private boolean monthly;
    private Chars chars = new Chars();

    public Paper() {
    }

    public Paper(String title, String type, boolean monthly) {
        this.title = title;
        this.type = type;
        this.monthly = monthly;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMonthly() {
        return monthly;
    }

    public void setMonthly(boolean monthly) {
        this.monthly = monthly;
    }

    public Chars getChars() {
        return chars;
    }
    public void setChars(Chars chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", monthly=" + monthly +
                '}';
    }

    public class Chars { // inner class
        private boolean color;
        private int volume;
        private boolean gloss;
        private boolean index;

        public Chars() {
        }

        public Chars(boolean color, int volume, boolean gloss, boolean index) {
            this.color = color;
            this.volume = volume;
            this.gloss = gloss;
            this.index = index;
        }

        public boolean isColor() {
            return color;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public boolean isGloss() {
            return gloss;
        }

        public void setGloss(boolean gloss) {
            this.gloss = gloss;
        }

        public boolean isIndex() {
            return index;
        }

        public void setIndex(boolean index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "Chars{" +
                    "color=" + color +
                    ", volume=" + volume +
                    ", gloss=" + gloss +
                    ", index=" + index +
                    '}';
        }
    }
}
