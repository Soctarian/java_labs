package edu.ntu.dp.models;

import java.util.Collection;
import java.util.Objects;

public class University {
    private Collection<Faculty> faculties;
    private Human rector;
    private String universityName;

    public Human getRector() {
        return rector;
    }

    public void setRector(Human rector) {
        this.rector = rector;
    }

    public String getUniversityName()
    {
        return universityName;
    }
    public void setUniversityName(String universityName)
    {
        this.universityName = universityName;
    }

    public Collection<Faculty> getFaculties()
    {
        return faculties;
    }
    public void setFaculties(Collection<Faculty> faculties)
    {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(universityName, that.universityName) &&
                Objects.equals(rector, that.rector) &&
                Objects.equals(faculties, that.faculties);
    }
}
