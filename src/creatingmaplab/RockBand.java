package creatingmaplab;

import java.util.Objects;

/**
 *
 * @author J-Tron
 */
public class RockBand {
    
    private String rockBandId;
    private int numMembers;
    private String bandName;
    private String homeTown;
    private String foundedOnDate;

    public RockBand(String rockBandId, int numMembers, String bandName, String homeTown, String foundedOnDate) {
        this.rockBandId = rockBandId;
        this.numMembers = numMembers;
        this.bandName = bandName;
        this.homeTown = homeTown;
        this.foundedOnDate = foundedOnDate;
    }

    public String getRockBandId() {
        return rockBandId;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public String getBandName() {
        return bandName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getFoundedOnDate() {
        return foundedOnDate;
    }

    public void setRockBandId(String rockBandId) {
        this.rockBandId = rockBandId;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setFoundedOnDate(String foundedOnDate) {
        this.foundedOnDate = foundedOnDate;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.rockBandId);
        return hash;
    }

    @Override
    public String toString() {
        return "RockBand{" + "rockBandId=" + rockBandId + ", numMembers=" + numMembers + ", bandName=" + bandName + ", homeTown=" + homeTown + ", foundedOnDate=" + foundedOnDate + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RockBand other = (RockBand) obj;
        if (!Objects.equals(this.rockBandId, other.rockBandId)) {
            return false;
        }
        return true;
    }
    
    
}
