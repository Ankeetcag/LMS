package springbootprojecttwowheller.com.cagl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import springbootprojecttwowheller.com.cagl.entity.whatsappLeads;

@Repository
public interface whatsappLeadsRepository extends JpaRepository<whatsappLeads, Integer>{

	@Query(value = "SELECT * FROM lmss.whatsapp_leads" ,nativeQuery = true)
	public List<whatsappLeads> getWhatsappLeads();
}
