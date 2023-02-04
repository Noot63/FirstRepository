package com.academy;

public class SuperClass {

    public String count;
    private String name;
        public int id;

        public SuperClass() {
        }

        public SuperClass(String name) {
            this.name = name;
        }

        public SuperClass(int id) {
            this.id = id;
        }

        public SuperClass(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "com.academy.SuperClass.SuperClass{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

