package braincohort.pku.edu.website.services.projectinfo;

import braincohort.pku.edu.website.entity.index.ProjectDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectInfoDao extends JpaRepository<ProjectDescription, String> {

}
