package us.br.com.mcoder.studies.poo.ds.entities;

public class Computer {

    private String cpu;
    private String motherBoard;
    private String energyBox;

    private Long fans;

    public Computer(String cpu, String motherBoard, String energyBox, Long fans) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.energyBox = energyBox;
        this.fans = fans;
    }

    public Computer() {
    }

    public String getCpu() {
        return cpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getEnergyBox() {
        return energyBox;
    }

    public Long getFans() {
        return fans;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setEnergyBox(String energyBox) {
        this.energyBox = energyBox;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", motherBoard='").append(motherBoard).append('\'');
        sb.append(", energyBox='").append(energyBox).append('\'');
        sb.append(", fans=").append(fans);
        sb.append('}');
        return sb.toString();
    }
}
