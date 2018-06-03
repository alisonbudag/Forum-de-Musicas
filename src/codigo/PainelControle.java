package codigo;

import javax.swing.table.DefaultTableModel;

public class PainelControle {
	
	public DefaultTableModel listarMembros() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Usuário");
		modelo.addColumn("Situação");
		
		for(int indice=0; indice<Perfil.dadosPerfil.size(); indice++) {
			modelo.addRow(new Object[] {
				Perfil.dadosPerfil.get(indice).getNome()
			});
			
			if(Perfil.dadosPerfil.get(indice).isBanido() == true) {
				modelo.setValueAt("Banido", indice, 1);
			}else if(Perfil.dadosPerfil.get(indice).isAdm() == true){
				modelo.setValueAt("Administrador", indice, 1);
			}else if(Perfil.dadosPerfil.get(indice).isMod() == true) {
				modelo.setValueAt("Moderador", indice, 1);
			}else {
				modelo.setValueAt("Membro", indice, 1);
			}
			
		}
			
		//Retorno
		return modelo;
				
	}

}
