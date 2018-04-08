package org.alfime.apoyo.resources;

import org.alfime.apoyo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:3000")
@RestController
public class LookUpResource {
    @Autowired
    private BarrioRepository barrioRepository;

    @Autowired
    private CajaCompensacionRepository cajaCompensacionRepository;

    @Autowired
    private CiudadRepository ciudadRepository;

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private DiscapacidadRepository discapacidadRepository;

    @Autowired
    private EPSRepository epsRepository;

    @Autowired
    private EscolaridadRepository escolaridadRepository;

    @Autowired
    private EstadoCivilRepository estadoCivilRepository;

    @Autowired
    private FamiliaTipoRepository familiaTipoRepository;

    @Autowired
    private FrecuenciaRepository frecuenciaRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private IngresoRepository ingresoRepository;

    @Autowired
    private OcupacionRepository ocupacionRepository;

    @Autowired
    private ParentescoRepository parentescoRepository;

    @Autowired
    private PensionRepository pensionRepository;

    @Autowired
    private ProgramaRepository programaRepository;

    @Autowired
    private RegimenRepository regimenRepository;

    @Autowired
    private RemitenteRepository remitenteRepository;

    @Autowired
    private ResponsabilidadRepository responsabilidadRepository;

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @GetMapping("/barrios")
    public List<Barrio> retrieveAllBarrios() {
        return barrioRepository.findAll();
    }

    @GetMapping("/caja-compensacion")
    public List<CajaCompensacion> retrieveAllCajasCompensacion() {
        return cajaCompensacionRepository.findAll();
    }

    @GetMapping("/ciudades")
    public List<Ciudad> retrieveAllCiudades() {
        return ciudadRepository.findAll();
    }

    @GetMapping("/departamentos")
    public List<Departamento> retrieveAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    @GetMapping("/discapacidades")
    public List<Discapacidad> retrieveAllDiscapacidades() {
        return discapacidadRepository.findAll();
    }

    @GetMapping("/documento-tipos")
    public List<TipoDocumento> retrieveAllTipoDocumento() {
        return tipoDocumentoRepository.findAll();
    }

    @GetMapping("/eps")
    public List<EPS> retrieveAllEPSs() {
        return epsRepository.findAll();
    }

    @GetMapping("/escolaridades")
    public List<Escolaridad> retrieveAllEscolaridades() {
        return escolaridadRepository.findAll();
    }

    @GetMapping("/estados-civiles")
    public List<EstadoCivil> retrieveAllEstadosCiviles() {
        return estadoCivilRepository.findAll();
    }

    @GetMapping("/frecuencias")
    public List<Frecuencia> retrieveAllFrecuencias() {
        return frecuenciaRepository.findAll();
    }

    @GetMapping("/familia-tipos")
    public List<FamiliaTipo> retrieveAllFamiliaTipo() {
        return familiaTipoRepository.findAll();
    }

    @GetMapping("/generos")
    public List<Genero> retrieveAllGeneros() {
        return generoRepository.findAll();
    }

    @GetMapping("/ingresos")
    public List<Ingreso> retrieveAllIngresos() {
        return ingresoRepository.findAll();
    }

    @GetMapping("/ocupaciones")
    public List<Ocupacion> retrieveAllOcupaciones() {
        return ocupacionRepository.findAll();
    }

    @GetMapping("/parentescos")
    public List<Parentesco> retrieveAllParentesco() {
        return parentescoRepository.findAll();
    }

    @GetMapping("/pensiones")
    public List<Pension> retrieveAllPension() {
        return pensionRepository.findAll();
    }

    @GetMapping("/programas")
    public List<Programa> retrieveAllPrograma() {
        return programaRepository.findAll();
    }

    @GetMapping("/regimenes")
    public List<Regimen> retrieveAllRegimenes() {
        return regimenRepository.findAll();
    }

    @GetMapping("/remitentes")
    public List<Remitente> retrieveAllRemitentes() {
        return remitenteRepository.findAll();
    }

    @GetMapping("/responsabilidades")
    public List<Responsabilidad> retrieveAllResponsabilidades() {
        return responsabilidadRepository.findAll();
    }
}
