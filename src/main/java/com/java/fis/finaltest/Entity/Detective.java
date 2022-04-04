package com.java.fis.finaltest.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detectives")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Detective implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detectiveId")
	private Long detectiveId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personId")
	private Person person;

	private String badgeNumber;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Ranks ranks;

	private Boolean amed;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private EmploymentStatus status;

	@OneToMany(mappedBy = "detective", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CriminalCase> criminalCases;

	@OneToMany(mappedBy = "detective", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<TrackEntry> trackEntries;

	@OneToMany(mappedBy = "detective", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<WorkingDetecCrimi> workingDetecCrimis;

}
