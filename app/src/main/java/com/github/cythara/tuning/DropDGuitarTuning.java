package com.github.cythara.tuning;

import com.github.cythara.Tuning;

public class DropDGuitarTuning implements Tuning {

    private enum Pitch implements com.github.cythara.Note {

        D2("D", "2", 73.416f),
        A2("A", "2", 110f),
        D3("D", "3", 146.832f),
        G3("G", "3", 195.998f),
        B3("B", "3", 246.942f),
        E4("E", "4", 329.628f);

        private String name;
        private final String sign;
        private final String octave;
        private final float frequency;

        Pitch(String name, String octave, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = "";
            this.frequency = frequency;
        }

        public String getName() {
            return name;
        }

        public float getFrequency() {
            return frequency;
        }

        @Override
        public String getOctave() {
            return octave;
        }

        @Override
        public String getSign() {
            return sign;
        }
    }

    @Override
    public com.github.cythara.Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public com.github.cythara.Note findNote(String name) {
        return Pitch.valueOf(name);
    }
}
