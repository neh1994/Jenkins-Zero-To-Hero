package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Neha Tatpuje Resume");
        model.addAttribute("msg", "Neha Tatpuje
Mobile No: +91-8080134648	
Location: Bengaluru, India                                  
Email: tatpujen@gmail.com
LinkedIn: https://www.linkedin.com/in/neha-tatpuje-943b511a2/                
Github: https://github.com/ntatpj
Experienced DevOps & Network Engineer bringing proven experience in both Devops and Operations over 8+ years. Highly skilled in planning and implementation of CI / CD pipelines, infrastructure provisioning, application deployments and environment management. Adept at collaborating with cross-functional teams to streamline operations and enhance customer satisfaction. Proven track record in optimizing system performance and reliability at small and large scale depending on the customer(s) with negligible error rate. 
Looking forward for DevOps, Cloud engineer and SRE roles.
Skills:  
•	Operating Systems: Linux (RHEL, Ubuntu, CentOS), Windows.		
•	Cloud-Native: AWS EC2, S3, Lambda function EKS, Docker, Kubernetes, Helm.
•	CI / CD: Jenkins, AWS Code Deploy.
•	VCS: GIT, Bitbucket, AWS Codecommit.	
•	Incident Management: JIRA	
•	Networking: TCP / IP, DNS, Load Balancing, VPC.
•	Monitoring and Observability: Prometheus, Grafana, Cloudwatch.	
•	Scripting and Programming: Python, Bash.
•	IaC: Terraform, Ansible
Certification: Certified Kubernertes Administrator (CKA)   Certificate ID: LF-dfjjrkygb4  Date:12 October-2023
Professional Experience:  
Lead Analyst Devops & SRE Operations:
Ribbon Communication Inc. | Bengaluru | 2021 - Present.
Achievements: 
•	Top performer of the team. I am considered SME for one of the biggest customer.
•	Optimized Kubernertes based PAAS infrastructure achieving 10% reduction in error rate.
•	Created standards and documentation to resolve BAU requests resulting in operational efficiency.
•	Initiated and implemented container-based deployments using Docker/Docker Hub and private Docker registry. Implemented three tier application Muse on cloud environment using services in AWS.
•	Created automated version controlled CI / CD pipeline integrating tools like Jenkins, SonarQube, ArgoCD.
•	Building and maintain Pipeline AWS using AWS codecommit, AWS Code Build, AWS Code Deploy.
•	Configured AWS EC2, VPC, S3.
•	Implemented scripts using Python and Bash to streamline repetitive and reduce human intervention in various processes 
•	Resolved complex Kubernetes issues, providing expert guidance on container management and improving operational efficiency.
•	Developed scalable infrastructure using Terraform, implementing best practices to ensure robust and efficient AWS deployments.
•	Responsible for upgrades, providing and designing sizing rules for infrastructure as per the application load.


Skills:  
Operating System:       Linux RHEL, Solaris, Ubuntu	Cloud: 			      AWS (beginner)
CI/CD tool:                   Jenkins, GitHub Actions		Infrastructure as code:      Terraform (beginner)
SCM tool: 	             GIT, Bitbucket			Programming Language:  Python, Shell Scripting
Build Tool: 		Maven				Code Analysis: 	      SonarQube
Artifact Repository: 	ArgoCD 			Application:	                   Muse Infra (PAAS)
Containerization/ Orchestration:     Kubernetes, Docker	
Monitoring: Prometheus, Grafana 		
Network support Engineer
ECI Telecom Pvt Ltd. AKA Ribbon Communication Inc | Airoli, Navi Mumbai | 2016 - 2021.
Responsibilities: 
•	Diagnose, troubleshoot, and resolve issues from customer, or other network and system problems for XDM product line for live customer traffic. Worked on issue related to switching, NMS and EMS and MSPP.
•	Provide official Root cause analysis for the failures and at times attend joint calls with customer for technical discussion related resolution to issue in live network.
•	Simulate specific field issues at the Lab using the same hardware/software and database in order to replicate the         problem for R&D escalation if needed. Used tools like Wireshark and Spirent device for testing and customer issue simulation.
•	Identify bugs, enter problem reports into bug tracking database; JIRA for all bugs observed in customer network during support. Co-ordinate with R&D with various stakeholders
•	Automated system tasks: Prepared script in python for health check of XDM product line by reducing the time for health check log collection by approx. 90%.

Skills:  
Operating System:  RHEL, Centos, Solaris, Ubuntu, Windows.
Technologies:           SDH, MPLS, CCNA, Network Function Virtualization NFV
Applications:            EMS (Element management system), NMS (Network management system)
Awards: 	          Spot awards for resolving critical issue in customer network well before time SLA.
          Spot award for preparing HLD document for internal network of an Romanian customer 
Apprentice Trainee Engineer 
Essjay Ericson Pvt Ltd. (Client: Reliance communication) | DAKC, Navi Mumbai|2015-2016
Responsibilities
•	Identify issues related to call routing, call congestion for CDMA, GSM routed via MSC, BSC in PAN India network of RCOM. 
•	Perform health check, upgrade and migrations of BSC and MSC 
•	Responsible for configuring monitoring scripts in crontab and notify if any issue occurs.

Education:  
Bachelor of Engineering (2012-2015) University of Mumbai(Electronic &Telecom).	        Score: 70 %
Engineering Diploma (2009-2012) V.J.T.I Mumbai(Electronics).			                    Score: 88.15%

");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
