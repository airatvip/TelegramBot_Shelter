package com.skypro.shelter_telegrambot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Entity
@Table(name = "dogShelterUsers")
public class DogShelterUser {

        @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;
        @Column(name = "full_name")
        private String fullName;
        @Column(name = "age")
        private int age;
        @Column(name = "address")
        private String address;
        @Column(name = "phone_number")
        private String phoneNumber;

        public DogShelterUser() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DogShelterUser user = (DogShelterUser) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public long getId() {
            return id;
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }


