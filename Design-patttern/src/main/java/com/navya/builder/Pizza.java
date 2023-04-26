package com.navya.builder;

public class Pizza {
        private String dough;
        private String sauce;
        private String topping;

        private Pizza(Builder builder) {
            this.dough = builder.dough;
            this.sauce = builder.sauce;
            this.topping = builder.topping;
        }

        public String getDough() {
            return dough;
        }

        public String getSauce() {
            return sauce;
        }

        public String getTopping() {
            return topping;
        }
        public static class Builder {
            private String dough;
            private String sauce;
            private String topping;

            public Builder() {}

            public Builder setDough(String dough) {
                this.dough = dough;
                return this;
            }

            public Builder setSauce(String sauce) {
                this.sauce = sauce;
                return this;
            }

            public Builder setTopping(String topping) {
                this.topping = topping;
                return this;
            }

            public Pizza build() {
                return new Pizza(this);
            }
        }


    }





