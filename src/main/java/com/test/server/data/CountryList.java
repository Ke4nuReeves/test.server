package com.test.server.data;

import com.test.server.data.entity.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
public class CountryList {
    private List<Country> countries = new ArrayList<>();

    public CountryList() {
    countries.add(new Country("Afghanistan"," Kabul"));
    countries.add(new Country("Albania"," Tirana"));
    countries.add(new Country("Algeria"," Algiers"));
    countries.add(new Country("Andorra", "Andorra la Vella"));
    countries.add(new Country("Angola"," Luanda"));
    countries.add(new Country("Argentina"," Buenos Aires"));
    countries.add(new Country("Armenia"," Yerevan"));
    countries.add(new Country("Australia"," Canberra"));
    countries.add(new Country("Austria"," Vienna"));
    countries.add(new Country("Azerbaijan"," Baku"));
    countries.add(new Country("Bahamas"," Nassau"));
    countries.add(new Country("Bahrain"," Manama"));
    countries.add(new Country("Bangladesh"," Dhaka"));
    countries.add(new Country("Belarus"," Minsk"));
    countries.add(new Country("Belgium"," Brussels"));
    countries.add(new Country("Belize"," Belmopan"));
    countries.add(new Country("Benin"," Porto-Novo"));
    countries.add(new Country("Bolivia"," Sucre"));
    countries.add(new Country("Bosnia and Herzegovina"," Sarajevo"));
    countries.add(new Country("Botswana"," Gaborone"));
    countries.add(new Country("Brazil"," Brasilia"));
    countries.add(new Country("Brunei"," Bandar Seri Begawan"));
    countries.add(new Country("Bulgaria"," Sofia"));
    countries.add(new Country("Burkina"," Faso	Ouagadougou"));
    countries.add(new Country("Burundi"," Bujumbura"));
    countries.add(new Country("Cambodia"," Phnom Penh"));
    countries.add(new Country("Cameroon"," Yaounde"));

        for (int i =0; i < countries.size(); i++) {
            countries.get(i).setId(i + 5);
        }
    }

    public List<Country> getCountries() {
        return countries;
    }
}
