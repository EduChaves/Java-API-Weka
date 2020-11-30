package projetoweka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*  -- Classes que formam o pacote Weka --*/
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.Instance;
/*  -- Importações do algoritmo de classificação --*/
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;

/**
 *
 * @author Eduardo Chaves
 */

public class TesteWeka {
    final String caminhoDados;
    private Instances dados;
    
    public TesteWeka(String caminhoDados) {
        this.caminhoDados = caminhoDados;      
    } 
    
    public void leDados() throws Exception {
        
        DataSource fonte = new DataSource(caminhoDados);
        dados = fonte.getDataSet();
                   
        if(dados.classIndex() == -1)  
            dados.setClassIndex(dados.numAttributes() -1);
    }
    
    public double gerar_death_event(){
    
        return 0.0;
    } 
    
    public String imprimeDados() {
        
        String aux = " ";
        for(int i = 0;  i < dados.numInstances(); i++){
            Instance atual = dados.instance(i);
            
            aux = aux + "\n     " + (i + 1) + ":     " + atual + "\n";           
        }
        return aux;
    }  
    
    public String arvoreDeDecisaoJ48() {
        String resultado = "";
        
        try {
            J48 tree = new J48();
            tree.buildClassifier(dados);
            resultado = tree.toString();
            resultado = resultado + "\tAvaliação Inicial:\n";
        
            Evaluation avaliacao = new Evaluation(dados);
            avaliacao.evaluateModel(tree, dados);
        
            resultado = resultado + "--> Instancias Corretas: " + avaliacao.correct() +"\n";
            
            return resultado;
        }catch(Exception ex){
            System.out.println("Error: " + ex);
            
            return ex.toString();
        }
    }
    
    public String gerandoNovaInstancia(DeathEvent death) {
        try 
        {
            leDados();
            DataSource ds = new DataSource(caminhoDados);
            Instances instancia = ds.getDataSet();
            instancia.setClassIndex(11);

            NaiveBayes nb = new NaiveBayes();
        
            nb.buildClassifier(instancia);
        
            Instance novo = new DenseInstance(12);
                     
            novo.setDataset(instancia);
            
            novo.setValue(0, death.getIdade());
            novo.setValue(1, death.getAnemia());
            novo.setValue(2, death.getCreatina_fosfocinase());
            novo.setValue(3, death.getDiabetes());
            novo.setValue(4, death.getFracao_de_ejecao());
            novo.setValue(5, death.getPressao_alta());
            novo.setValue(6, death.getPlaquetas());
            novo.setValue(7, death.getSoro_creatina());
            novo.setValue(8, death.getSoro_sodico());
            novo.setValue(9, death.getSexo());
            novo.setValue(10, death.getFumante());
                        
            double prob[] = nb.distributionForInstance(novo);
            
            death.setProb1(prob[1]);
            death.setProb2(prob[0]);
            
            String resultado = "Resultado:\n\n" + "Sim: " + prob[1] + "\n" + "Não: " + prob[0];
        
            return resultado;
            
        }catch(Exception ex) {
            
            System.out.println("Verifique se o Dataset foi carregado!");
            return ex.toString();
        }            
    }
}
