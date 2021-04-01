package testejava.aprendizado.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Funcionario implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Double id;
    private String email_id;    
    private String name;
    private String supervisor_id;
    private String job_id;
    private int grade;
    private int plant;
    private LocalDate hire_date;
    private String active;
    private String admin;
    private String supervisor_email;
    private double leader;
    private String centro_custo;
    private String terceiro;
    private String temporario;
    private String cracha_clin;
    private String cracha;
    private String type;
    private LocalDateTime data_updates;
    private String user_update;
    private Blob photo_emp;

    public Double getId() {
        return id;
    }
    public void setId(Double id) {
        this.id = id;
    }
    public String getEmail_id() {
        return email_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSupervisor_id() {
        return supervisor_id;
    }
    public void setSupervisor_id(String supervisor_id) {
        this.supervisor_id = supervisor_id;
    }
    public String getJob_id() {
        return job_id;
    }
    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getPlant() {
        return plant;
    }
    public void setPlant(int plant) {
        this.plant = plant;
    }
    public LocalDate getHire_date() {
        return hire_date;
    }
    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }
    public String getActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }
    public String getAdmin() {
        return admin;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    public String getSupervisor_email() {
        return supervisor_email;
    }
    public void setSupervisor_email(String supervisor_email) {
        this.supervisor_email = supervisor_email;
    }
    public double getLeader() {
        return leader;
    }
    public void setLeader(double leader) {
        this.leader = leader;
    }
    public String getCentro_custo() {
        return centro_custo;
    }
    public void setCentro_custo(String centro_custo) {
        this.centro_custo = centro_custo;
    }
    public String getTerceiro() {
        return terceiro;
    }
    public void setTerceiro(String terceiro) {
        this.terceiro = terceiro;
    }
    public String getTemporario() {
        return temporario;
    }
    public void setTemporario(String temporario) {
        this.temporario = temporario;
    }
    public String getCracha_clin() {
        return cracha_clin;
    }
    public void setCracha_clin(String cracha_clin) {
        this.cracha_clin = cracha_clin;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public LocalDateTime getData_updates() {
        return data_updates;
    }
    public void setData_updates(LocalDateTime data_updates) {
        this.data_updates = data_updates;
    }
    public String getUser_update() {
        return user_update;
    }
    public void setUser_update(String user_update) {
        this.user_update = user_update;
    }
    public Blob getPhoto_emp() {
        return photo_emp;
    }
    public void setPhoto_emp(Blob photo_emp) {
        this.photo_emp = photo_emp;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((active == null) ? 0 : active.hashCode());
        result = prime * result + ((admin == null) ? 0 : admin.hashCode());
        result = prime * result + ((centro_custo == null) ? 0 : centro_custo.hashCode());
        result = prime * result + ((cracha == null) ? 0 : cracha.hashCode());
        result = prime * result + ((cracha_clin == null) ? 0 : cracha_clin.hashCode());
        result = prime * result + ((data_updates == null) ? 0 : data_updates.hashCode());
        result = prime * result + ((email_id == null) ? 0 : email_id.hashCode());
        result = prime * result + grade;
        result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
        long temp;
        temp = Double.doubleToLongBits(leader);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((photo_emp == null) ? 0 : photo_emp.hashCode());
        result = prime * result + plant;
        result = prime * result + ((supervisor_email == null) ? 0 : supervisor_email.hashCode());
        result = prime * result + ((supervisor_id == null) ? 0 : supervisor_id.hashCode());
        result = prime * result + ((temporario == null) ? 0 : temporario.hashCode());
        result = prime * result + ((terceiro == null) ? 0 : terceiro.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((user_update == null) ? 0 : user_update.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (active == null) {
            if (other.active != null)
                return false;
        } else if (!active.equals(other.active))
            return false;
        if (admin == null) {
            if (other.admin != null)
                return false;
        } else if (!admin.equals(other.admin))
            return false;
        if (centro_custo == null) {
            if (other.centro_custo != null)
                return false;
        } else if (!centro_custo.equals(other.centro_custo))
            return false;
        if (cracha == null) {
            if (other.cracha != null)
                return false;
        } else if (!cracha.equals(other.cracha))
            return false;
        if (cracha_clin == null) {
            if (other.cracha_clin != null)
                return false;
        } else if (!cracha_clin.equals(other.cracha_clin))
            return false;
        if (data_updates == null) {
            if (other.data_updates != null)
                return false;
        } else if (!data_updates.equals(other.data_updates))
            return false;
        if (email_id == null) {
            if (other.email_id != null)
                return false;
        } else if (!email_id.equals(other.email_id))
            return false;
        if (grade != other.grade)
            return false;
        if (hire_date == null) {
            if (other.hire_date != null)
                return false;
        } else if (!hire_date.equals(other.hire_date))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (job_id == null) {
            if (other.job_id != null)
                return false;
        } else if (!job_id.equals(other.job_id))
            return false;
        if (Double.doubleToLongBits(leader) != Double.doubleToLongBits(other.leader))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (photo_emp == null) {
            if (other.photo_emp != null)
                return false;
        } else if (!photo_emp.equals(other.photo_emp))
            return false;
        if (plant != other.plant)
            return false;
        if (supervisor_email == null) {
            if (other.supervisor_email != null)
                return false;
        } else if (!supervisor_email.equals(other.supervisor_email))
            return false;
        if (supervisor_id == null) {
            if (other.supervisor_id != null)
                return false;
        } else if (!supervisor_id.equals(other.supervisor_id))
            return false;
        if (temporario == null) {
            if (other.temporario != null)
                return false;
        } else if (!temporario.equals(other.temporario))
            return false;
        if (terceiro == null) {
            if (other.terceiro != null)
                return false;
        } else if (!terceiro.equals(other.terceiro))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (user_update == null) {
            if (other.user_update != null)
                return false;
        } else if (!user_update.equals(other.user_update))
            return false;
        return true;
    }
    
}
