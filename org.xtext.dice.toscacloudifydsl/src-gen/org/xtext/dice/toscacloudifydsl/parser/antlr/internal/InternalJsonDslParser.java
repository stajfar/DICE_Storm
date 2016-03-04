package org.xtext.dice.toscacloudifydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dice.toscacloudifydsl.services.JsonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"tosca_definition_version\" :'", "'\\n, \"description\" :'", "'\\n, \"imports\" :'", "'['", "','", "']'", "'\\n, \"inputs\" :'", "'}'", "'\\n, \"node_templates\" :'", "'\\n, \"outputs\" :'", "':'", "'\"description\" :'", "'value:'", "'type'", "'description'", "'default'", "'\"type\" :'", "', \\n \"description\" :'", "', \\n \"interfaces\" :'", "', \\n \"properties\" :'", "', \\n \"attributes\" :'", "', \\n \"requirements\" :'", "', \\n \"relationships\" :'", "', \\n \"instances\" :'", "'Attribute'", "'value'", "'required'", "'status'", "'Requirement'", "'requirement_name'", "'node'", "'capability_Type_name'", "'occurances'", "', \\n \"source\" :'", "', \\n \"target\" :'", "', \\n \"source_interfaces\" :'", "', \\n \"target_interfaces\" :'", "' :'", "'  :'", "'hasOperation'", "'Contained_in'", "'validSource'", "'validTarget'", "'relation_haSourceInterface'", "'relation_hasTargetInterface'", "'Connected_to'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalJsonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g"; }



     	private JsonDslGrammarAccess grammarAccess;
     	
        public InternalJsonDslParser(TokenStream input, JsonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Service_Template";	
       	}
       	
       	@Override
       	protected JsonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleService_Template"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:67:1: entryRuleService_Template returns [EObject current=null] : iv_ruleService_Template= ruleService_Template EOF ;
    public final EObject entryRuleService_Template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService_Template = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:68:2: (iv_ruleService_Template= ruleService_Template EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:69:2: iv_ruleService_Template= ruleService_Template EOF
            {
             newCompositeNode(grammarAccess.getService_TemplateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_Template_in_entryRuleService_Template75);
            iv_ruleService_Template=ruleService_Template();

            state._fsp--;

             current =iv_ruleService_Template; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService_Template85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService_Template"


    // $ANTLR start "ruleService_Template"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:76:1: ruleService_Template returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleService_Template() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tosca_definition_version_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_serviceTemplate_hasImport_7_0 = null;

        EObject lv_serviceTemplate_hasImport_9_0 = null;

        EObject lv_interface_hasInput_13_0 = null;

        EObject lv_interface_hasInput_15_0 = null;

        EObject lv_service_hasNodeTemplate_19_0 = null;

        EObject lv_service_hasNodeTemplate_21_0 = null;

        EObject lv_serviceTemplate_hasOutput_25_0 = null;

        EObject lv_serviceTemplate_hasOutput_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:79:28: ( (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:80:1: (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:80:1: (otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:80:3: otherlv_0= '{' (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )? (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )? (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )? (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )? otherlv_17= '\\n, \"node_templates\" :' otherlv_18= '{' ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) ) (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )* otherlv_22= '}' (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleService_Template122); 

                	newLeafNode(otherlv_0, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:84:1: (otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:84:3: otherlv_1= '\"tosca_definition_version\" :' ( (lv_tosca_definition_version_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleService_Template135); 

                        	newLeafNode(otherlv_1, grammarAccess.getService_TemplateAccess().getTosca_definition_versionKeyword_1_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:88:1: ( (lv_tosca_definition_version_2_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:89:1: (lv_tosca_definition_version_2_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:89:1: (lv_tosca_definition_version_2_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:90:3: lv_tosca_definition_version_2_0= RULE_STRING
                    {
                    lv_tosca_definition_version_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleService_Template152); 

                    			newLeafNode(lv_tosca_definition_version_2_0, grammarAccess.getService_TemplateAccess().getTosca_definition_versionSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getService_TemplateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tosca_definition_version",
                            		lv_tosca_definition_version_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:106:4: (otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:106:6: otherlv_3= '\\n, \"description\" :' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleService_Template172); 

                        	newLeafNode(otherlv_3, grammarAccess.getService_TemplateAccess().getDescriptionKeyword_2_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:110:1: ( (lv_description_4_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:111:1: (lv_description_4_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:112:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleService_Template189); 

                    			newLeafNode(lv_description_4_0, grammarAccess.getService_TemplateAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getService_TemplateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:128:4: (otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:128:6: otherlv_5= '\\n, \"imports\" :' otherlv_6= '[' ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )* otherlv_10= ']'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleService_Template209); 

                        	newLeafNode(otherlv_5, grammarAccess.getService_TemplateAccess().getImportsKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleService_Template221); 

                        	newLeafNode(otherlv_6, grammarAccess.getService_TemplateAccess().getLeftSquareBracketKeyword_3_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:136:1: ( (lv_serviceTemplate_hasImport_7_0= ruleImport ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:137:1: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:137:1: (lv_serviceTemplate_hasImport_7_0= ruleImport )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:138:3: lv_serviceTemplate_hasImport_7_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleService_Template242);
                    lv_serviceTemplate_hasImport_7_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	        }
                           		add(
                           			current, 
                           			"serviceTemplate_hasImport",
                            		lv_serviceTemplate_hasImport_7_0, 
                            		"Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:154:2: (otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:154:4: otherlv_8= ',' ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService_Template255); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getService_TemplateAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:158:1: ( (lv_serviceTemplate_hasImport_9_0= ruleImport ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:159:1: (lv_serviceTemplate_hasImport_9_0= ruleImport )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:159:1: (lv_serviceTemplate_hasImport_9_0= ruleImport )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:160:3: lv_serviceTemplate_hasImport_9_0= ruleImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasImportImportParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleService_Template276);
                    	    lv_serviceTemplate_hasImport_9_0=ruleImport();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"serviceTemplate_hasImport",
                    	            		lv_serviceTemplate_hasImport_9_0, 
                    	            		"Import");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleService_Template290); 

                        	newLeafNode(otherlv_10, grammarAccess.getService_TemplateAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:180:3: (otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:180:5: otherlv_11= '\\n, \"inputs\" :' otherlv_12= '{' ( (lv_interface_hasInput_13_0= ruleInput ) ) (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleService_Template305); 

                        	newLeafNode(otherlv_11, grammarAccess.getService_TemplateAccess().getInputsKeyword_4_0());
                        
                    otherlv_12=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleService_Template317); 

                        	newLeafNode(otherlv_12, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:188:1: ( (lv_interface_hasInput_13_0= ruleInput ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:189:1: (lv_interface_hasInput_13_0= ruleInput )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:189:1: (lv_interface_hasInput_13_0= ruleInput )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:190:3: lv_interface_hasInput_13_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getInterface_hasInputInputParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleService_Template338);
                    lv_interface_hasInput_13_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	        }
                           		add(
                           			current, 
                           			"interface_hasInput",
                            		lv_interface_hasInput_13_0, 
                            		"Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:206:2: (otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:206:4: otherlv_14= ',' ( (lv_interface_hasInput_15_0= ruleInput ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService_Template351); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getService_TemplateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:210:1: ( (lv_interface_hasInput_15_0= ruleInput ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:211:1: (lv_interface_hasInput_15_0= ruleInput )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:211:1: (lv_interface_hasInput_15_0= ruleInput )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:212:3: lv_interface_hasInput_15_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getInterface_hasInputInputParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleService_Template372);
                    	    lv_interface_hasInput_15_0=ruleInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interface_hasInput",
                    	            		lv_interface_hasInput_15_0, 
                    	            		"Input");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleService_Template386); 

                        	newLeafNode(otherlv_16, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleService_Template400); 

                	newLeafNode(otherlv_17, grammarAccess.getService_TemplateAccess().getNode_templatesKeyword_5());
                
            otherlv_18=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleService_Template412); 

                	newLeafNode(otherlv_18, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_6());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:240:1: ( (lv_service_hasNodeTemplate_19_0= ruleNode_template ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:241:1: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:241:1: (lv_service_hasNodeTemplate_19_0= ruleNode_template )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:242:3: lv_service_hasNodeTemplate_19_0= ruleNode_template
            {
             
            	        newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNode_template_in_ruleService_Template433);
            lv_service_hasNodeTemplate_19_0=ruleNode_template();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            	        }
                   		add(
                   			current, 
                   			"service_hasNodeTemplate",
                    		lv_service_hasNodeTemplate_19_0, 
                    		"Node_template");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:258:2: (otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:258:4: otherlv_20= ',' ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) )
            	    {
            	    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService_Template446); 

            	        	newLeafNode(otherlv_20, grammarAccess.getService_TemplateAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:262:1: ( (lv_service_hasNodeTemplate_21_0= ruleNode_template ) )
            	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:263:1: (lv_service_hasNodeTemplate_21_0= ruleNode_template )
            	    {
            	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:263:1: (lv_service_hasNodeTemplate_21_0= ruleNode_template )
            	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:264:3: lv_service_hasNodeTemplate_21_0= ruleNode_template
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getService_hasNodeTemplateNode_templateParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNode_template_in_ruleService_Template467);
            	    lv_service_hasNodeTemplate_21_0=ruleNode_template();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service_hasNodeTemplate",
            	            		lv_service_hasNodeTemplate_21_0, 
            	            		"Node_template");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleService_Template481); 

                	newLeafNode(otherlv_22, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_9());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:284:1: (otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:284:3: otherlv_23= '\\n, \"outputs\" :' otherlv_24= '{' ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) ) (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleService_Template494); 

                        	newLeafNode(otherlv_23, grammarAccess.getService_TemplateAccess().getOutputsKeyword_10_0());
                        
                    otherlv_24=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleService_Template506); 

                        	newLeafNode(otherlv_24, grammarAccess.getService_TemplateAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:292:1: ( (lv_serviceTemplate_hasOutput_25_0= ruleOutput ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:293:1: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:293:1: (lv_serviceTemplate_hasOutput_25_0= ruleOutput )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:294:3: lv_serviceTemplate_hasOutput_25_0= ruleOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOutput_in_ruleService_Template527);
                    lv_serviceTemplate_hasOutput_25_0=ruleOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	        }
                           		add(
                           			current, 
                           			"serviceTemplate_hasOutput",
                            		lv_serviceTemplate_hasOutput_25_0, 
                            		"Output");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:310:2: (otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:310:4: otherlv_26= ',' ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) )
                    	    {
                    	    otherlv_26=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleService_Template540); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getService_TemplateAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:314:1: ( (lv_serviceTemplate_hasOutput_27_0= ruleOutput ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:315:1: (lv_serviceTemplate_hasOutput_27_0= ruleOutput )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:315:1: (lv_serviceTemplate_hasOutput_27_0= ruleOutput )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:316:3: lv_serviceTemplate_hasOutput_27_0= ruleOutput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getService_TemplateAccess().getServiceTemplate_hasOutputOutputParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOutput_in_ruleService_Template561);
                    	    lv_serviceTemplate_hasOutput_27_0=ruleOutput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getService_TemplateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"serviceTemplate_hasOutput",
                    	            		lv_serviceTemplate_hasOutput_27_0, 
                    	            		"Output");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleService_Template575); 

                        	newLeafNode(otherlv_28, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleService_Template589); 

                	newLeafNode(otherlv_29, grammarAccess.getService_TemplateAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService_Template"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:348:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:349:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:350:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterface_in_entryRuleInterface625);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterface635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:357:1: ruleInterface returns [EObject current=null] : (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_Impl_0 = null;

        EObject this_Source_interface_1 = null;

        EObject this_Target_interface_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:360:28: ( (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:361:1: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:361:1: (this_Interface_Impl_0= ruleInterface_Impl | this_Source_interface_1= ruleSource_interface | this_Target_interface_2= ruleTarget_interface )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    alt10=1;
                    }
                    break;
                case 50:
                    {
                    alt10=3;
                    }
                    break;
                case 49:
                    {
                    alt10=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:362:5: this_Interface_Impl_0= ruleInterface_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInterfaceAccess().getInterface_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInterface_Impl_in_ruleInterface682);
                    this_Interface_Impl_0=ruleInterface_Impl();

                    state._fsp--;

                     
                            current = this_Interface_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:372:5: this_Source_interface_1= ruleSource_interface
                    {
                     
                            newCompositeNode(grammarAccess.getInterfaceAccess().getSource_interfaceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleInterface709);
                    this_Source_interface_1=ruleSource_interface();

                    state._fsp--;

                     
                            current = this_Source_interface_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:382:5: this_Target_interface_2= ruleTarget_interface
                    {
                     
                            newCompositeNode(grammarAccess.getInterfaceAccess().getTarget_interfaceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleInterface736);
                    this_Target_interface_2=ruleTarget_interface();

                    state._fsp--;

                     
                            current = this_Target_interface_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleRelationship"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:398:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:399:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:400:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship771);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:407:1: ruleRelationship returns [EObject current=null] : (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_Impl_0 = null;

        EObject this_Contained_in_1 = null;

        EObject this_Connected_to_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:410:28: ( (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:411:1: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:411:1: (this_Relationship_Impl_0= ruleRelationship_Impl | this_Contained_in_1= ruleContained_in | this_Connected_to_2= ruleConnected_to )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case 57:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:412:5: this_Relationship_Impl_0= ruleRelationship_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getRelationship_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_Impl_in_ruleRelationship828);
                    this_Relationship_Impl_0=ruleRelationship_Impl();

                    state._fsp--;

                     
                            current = this_Relationship_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:422:5: this_Contained_in_1= ruleContained_in
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getContained_inParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContained_in_in_ruleRelationship855);
                    this_Contained_in_1=ruleContained_in();

                    state._fsp--;

                     
                            current = this_Contained_in_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:432:5: this_Connected_to_2= ruleConnected_to
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipAccess().getConnected_toParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConnected_to_in_ruleRelationship882);
                    this_Connected_to_2=ruleConnected_to();

                    state._fsp--;

                     
                            current = this_Connected_to_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:450:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:451:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:452:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport919);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:459:1: ruleImport returns [EObject current=null] : ( () ( (lv_file_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:462:28: ( ( () ( (lv_file_1_0= RULE_STRING ) )? ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:463:1: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:463:1: ( () ( (lv_file_1_0= RULE_STRING ) )? )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:463:2: () ( (lv_file_1_0= RULE_STRING ) )?
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:463:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:464:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImportAccess().getImportAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:469:2: ( (lv_file_1_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:470:1: (lv_file_1_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:470:1: (lv_file_1_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:471:3: lv_file_1_0= RULE_STRING
                    {
                    lv_file_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport980); 

                    			newLeafNode(lv_file_1_0, grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"file",
                            		lv_file_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:495:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:496:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:497:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOutput_in_entryRuleOutput1022);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutput1032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:504:1: ruleOutput returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:507:28: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:508:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:508:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:508:2: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:508:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:509:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOutputAccess().getOutputAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:514:2: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:515:1: (lv_parameter_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:515:1: (lv_parameter_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:516:3: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOutput1083); 

            			newLeafNode(lv_parameter_name_1_0, grammarAccess.getOutputAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter_name",
                    		lv_parameter_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOutput1100); 

                	newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOutput1112); 

                	newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:540:1: (otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:540:3: otherlv_4= '\"description\" :' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOutput1125); 

                        	newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:544:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:545:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:545:1: (lv_description_5_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:546:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOutput1142); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getOutputAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:562:4: (otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:562:6: otherlv_6= 'value:' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOutput1162); 

                        	newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getValueKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:566:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:567:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:567:1: (lv_value_7_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:568:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOutput1179); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getOutputAccess().getValueSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOutputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOutput1198); 

                	newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:596:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:597:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:598:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput1234);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput1244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:605:1: ruleInput returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:608:28: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:609:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:609:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:609:2: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:609:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputAccess().getInputAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:615:2: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:616:1: (lv_parameter_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:616:1: (lv_parameter_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:617:3: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInput1295); 

            			newLeafNode(lv_parameter_name_1_0, grammarAccess.getInputAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter_name",
                    		lv_parameter_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInput1312); 

                	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:637:1: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:637:3: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInput1325); 

                        	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTypeKeyword_3_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:641:1: ( (lv_type_4_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:642:1: (lv_type_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:642:1: (lv_type_4_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:643:3: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInput1342); 

                    			newLeafNode(lv_type_4_0, grammarAccess.getInputAccess().getTypeSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:659:4: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:659:6: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInput1362); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:663:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:664:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:664:1: (lv_description_6_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:665:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInput1379); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getInputAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:681:4: (otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:681:6: otherlv_7= 'default' ( (lv_default_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInput1399); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getDefaultKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:685:1: ( (lv_default_8_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:686:1: (lv_default_8_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:686:1: (lv_default_8_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:687:3: lv_default_8_0= RULE_STRING
                    {
                    lv_default_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInput1416); 

                    			newLeafNode(lv_default_8_0, grammarAccess.getInputAccess().getDefaultSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInput1435); 

                	newLeafNode(otherlv_9, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode_template"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:715:1: entryRuleNode_template returns [EObject current=null] : iv_ruleNode_template= ruleNode_template EOF ;
    public final EObject entryRuleNode_template() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_template = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:716:2: (iv_ruleNode_template= ruleNode_template EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:717:2: iv_ruleNode_template= ruleNode_template EOF
            {
             newCompositeNode(grammarAccess.getNode_templateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNode_template_in_entryRuleNode_template1471);
            iv_ruleNode_template=ruleNode_template();

            state._fsp--;

             current =iv_ruleNode_template; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNode_template1481); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode_template"


    // $ANTLR start "ruleNode_template"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:724:1: ruleNode_template returns [EObject current=null] : ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' ) ;
    public final EObject ruleNode_template() throws RecognitionException {
        EObject current = null;

        Token lv_node_template_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_nodeTemplate_hasInterface_10_0 = null;

        EObject lv_nodeTemplate_hasInterface_12_0 = null;

        EObject lv_nodeTemplate_hasProperty_16_0 = null;

        EObject lv_nodeTemplate_hasProperty_18_0 = null;

        EObject lv_nodeTemplate_hasAttribute_22_0 = null;

        EObject lv_nodeTemplate_hasAttribute_24_0 = null;

        EObject lv_nodeTemplate_hasRequirement_28_0 = null;

        EObject lv_nodeTemplate_hasRequirement_30_0 = null;

        EObject lv_NodeTemplate_hasRelationship_34_0 = null;

        EObject lv_NodeTemplate_hasRelationship_36_0 = null;

        EObject lv_nodeTemplate_hasInstances_40_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:727:28: ( ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:728:1: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:728:1: ( () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:728:2: () ( (lv_node_template_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )? (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )? (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )? (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )? (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )? otherlv_42= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:728:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:729:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNode_templateAccess().getNode_templateAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:734:2: ( (lv_node_template_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:735:1: (lv_node_template_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:735:1: (lv_node_template_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:736:3: lv_node_template_name_1_0= RULE_STRING
            {
            lv_node_template_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNode_template1532); 

            			newLeafNode(lv_node_template_name_1_0, grammarAccess.getNode_templateAccess().getNode_template_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNode_templateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"node_template_name",
                    		lv_node_template_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNode_template1549); 

                	newLeafNode(otherlv_2, grammarAccess.getNode_templateAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template1561); 

                	newLeafNode(otherlv_3, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:760:1: (otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:760:3: otherlv_4= '\"type\" :' ( (lv_type_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNode_template1574); 

                        	newLeafNode(otherlv_4, grammarAccess.getNode_templateAccess().getTypeKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:764:1: ( (lv_type_5_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:765:1: (lv_type_5_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:765:1: (lv_type_5_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:766:3: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNode_template1591); 

                    			newLeafNode(lv_type_5_0, grammarAccess.getNode_templateAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_templateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:782:4: (otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:782:6: otherlv_6= ', \\n \"description\" :' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNode_template1611); 

                        	newLeafNode(otherlv_6, grammarAccess.getNode_templateAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:786:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:787:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:787:1: (lv_description_7_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:788:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNode_template1628); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getNode_templateAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNode_templateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:804:4: (otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:804:6: otherlv_8= ', \\n \"interfaces\" :' otherlv_9= '{' ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) ) (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNode_template1648); 

                        	newLeafNode(otherlv_8, grammarAccess.getNode_templateAccess().getInterfacesKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template1660); 

                        	newLeafNode(otherlv_9, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:812:1: ( (lv_nodeTemplate_hasInterface_10_0= ruleInterface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:813:1: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:813:1: (lv_nodeTemplate_hasInterface_10_0= ruleInterface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:814:3: lv_nodeTemplate_hasInterface_10_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInterface_in_ruleNode_template1681);
                    lv_nodeTemplate_hasInterface_10_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeTemplate_hasInterface",
                            		lv_nodeTemplate_hasInterface_10_0, 
                            		"Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:830:2: (otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:830:4: otherlv_11= ',' ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNode_template1694); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getNode_templateAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:834:1: ( (lv_nodeTemplate_hasInterface_12_0= ruleInterface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:835:1: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:835:1: (lv_nodeTemplate_hasInterface_12_0= ruleInterface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:836:3: lv_nodeTemplate_hasInterface_12_0= ruleInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInterfaceInterfaceParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInterface_in_ruleNode_template1715);
                    	    lv_nodeTemplate_hasInterface_12_0=ruleInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeTemplate_hasInterface",
                    	            		lv_nodeTemplate_hasInterface_12_0, 
                    	            		"Interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template1729); 

                        	newLeafNode(otherlv_13, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:856:3: (otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:856:5: otherlv_14= ', \\n \"properties\" :' otherlv_15= '{' ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) ) (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNode_template1744); 

                        	newLeafNode(otherlv_14, grammarAccess.getNode_templateAccess().getPropertiesKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template1756); 

                        	newLeafNode(otherlv_15, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:864:1: ( (lv_nodeTemplate_hasProperty_16_0= ruleProperty ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:865:1: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:865:1: (lv_nodeTemplate_hasProperty_16_0= ruleProperty )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:866:3: lv_nodeTemplate_hasProperty_16_0= ruleProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleNode_template1777);
                    lv_nodeTemplate_hasProperty_16_0=ruleProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeTemplate_hasProperty",
                            		lv_nodeTemplate_hasProperty_16_0, 
                            		"Property");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:882:2: (otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:882:4: otherlv_17= ',' ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNode_template1790); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getNode_templateAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:886:1: ( (lv_nodeTemplate_hasProperty_18_0= ruleProperty ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:887:1: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:887:1: (lv_nodeTemplate_hasProperty_18_0= ruleProperty )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:888:3: lv_nodeTemplate_hasProperty_18_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasPropertyPropertyParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleNode_template1811);
                    	    lv_nodeTemplate_hasProperty_18_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeTemplate_hasProperty",
                    	            		lv_nodeTemplate_hasProperty_18_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template1825); 

                        	newLeafNode(otherlv_19, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:908:3: (otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:908:5: otherlv_20= ', \\n \"attributes\" :' otherlv_21= '{' ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) ) (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNode_template1840); 

                        	newLeafNode(otherlv_20, grammarAccess.getNode_templateAccess().getAttributesKeyword_8_0());
                        
                    otherlv_21=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template1852); 

                        	newLeafNode(otherlv_21, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:916:1: ( (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:917:1: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:917:1: (lv_nodeTemplate_hasAttribute_22_0= ruleAttribute )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:918:3: lv_nodeTemplate_hasAttribute_22_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleNode_template1873);
                    lv_nodeTemplate_hasAttribute_22_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeTemplate_hasAttribute",
                            		lv_nodeTemplate_hasAttribute_22_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:934:2: (otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:934:4: otherlv_23= ',' ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNode_template1886); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getNode_templateAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:938:1: ( (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:939:1: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:939:1: (lv_nodeTemplate_hasAttribute_24_0= ruleAttribute )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:940:3: lv_nodeTemplate_hasAttribute_24_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasAttributeAttributeParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleNode_template1907);
                    	    lv_nodeTemplate_hasAttribute_24_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeTemplate_hasAttribute",
                    	            		lv_nodeTemplate_hasAttribute_24_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template1921); 

                        	newLeafNode(otherlv_25, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:960:3: (otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:960:5: otherlv_26= ', \\n \"requirements\" :' otherlv_27= '{' ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) ) (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNode_template1936); 

                        	newLeafNode(otherlv_26, grammarAccess.getNode_templateAccess().getRequirementsKeyword_9_0());
                        
                    otherlv_27=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template1948); 

                        	newLeafNode(otherlv_27, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:968:1: ( (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:969:1: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:969:1: (lv_nodeTemplate_hasRequirement_28_0= ruleRequirement )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:970:3: lv_nodeTemplate_hasRequirement_28_0= ruleRequirement
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRequirement_in_ruleNode_template1969);
                    lv_nodeTemplate_hasRequirement_28_0=ruleRequirement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		add(
                           			current, 
                           			"nodeTemplate_hasRequirement",
                            		lv_nodeTemplate_hasRequirement_28_0, 
                            		"Requirement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:986:2: (otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:986:4: otherlv_29= ',' ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNode_template1982); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getNode_templateAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:990:1: ( (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:991:1: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:991:1: (lv_nodeTemplate_hasRequirement_30_0= ruleRequirement )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:992:3: lv_nodeTemplate_hasRequirement_30_0= ruleRequirement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRequirementRequirementParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRequirement_in_ruleNode_template2003);
                    	    lv_nodeTemplate_hasRequirement_30_0=ruleRequirement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"nodeTemplate_hasRequirement",
                    	            		lv_nodeTemplate_hasRequirement_30_0, 
                    	            		"Requirement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template2017); 

                        	newLeafNode(otherlv_31, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1012:3: (otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1012:5: otherlv_32= ', \\n \"relationships\" :' otherlv_33= '[' ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) ) (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )* otherlv_37= ']'
                    {
                    otherlv_32=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNode_template2032); 

                        	newLeafNode(otherlv_32, grammarAccess.getNode_templateAccess().getRelationshipsKeyword_10_0());
                        
                    otherlv_33=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleNode_template2044); 

                        	newLeafNode(otherlv_33, grammarAccess.getNode_templateAccess().getLeftSquareBracketKeyword_10_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1020:1: ( (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1021:1: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1021:1: (lv_NodeTemplate_hasRelationship_34_0= ruleRelationship )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1022:3: lv_NodeTemplate_hasRelationship_34_0= ruleRelationship
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleNode_template2065);
                    lv_NodeTemplate_hasRelationship_34_0=ruleRelationship();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		add(
                           			current, 
                           			"NodeTemplate_hasRelationship",
                            		lv_NodeTemplate_hasRelationship_34_0, 
                            		"Relationship");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1038:2: (otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1038:4: otherlv_35= ',' ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleNode_template2078); 

                    	        	newLeafNode(otherlv_35, grammarAccess.getNode_templateAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1042:1: ( (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1043:1: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1043:1: (lv_NodeTemplate_hasRelationship_36_0= ruleRelationship )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1044:3: lv_NodeTemplate_hasRelationship_36_0= ruleRelationship
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasRelationshipRelationshipParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleNode_template2099);
                    	    lv_NodeTemplate_hasRelationship_36_0=ruleRelationship();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"NodeTemplate_hasRelationship",
                    	            		lv_NodeTemplate_hasRelationship_36_0, 
                    	            		"Relationship");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNode_template2113); 

                        	newLeafNode(otherlv_37, grammarAccess.getNode_templateAccess().getRightSquareBracketKeyword_10_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1064:3: (otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1064:5: otherlv_38= ', \\n \"instances\" :' otherlv_39= '{' ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) ) otherlv_41= '}'
                    {
                    otherlv_38=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleNode_template2128); 

                        	newLeafNode(otherlv_38, grammarAccess.getNode_templateAccess().getInstancesKeyword_11_0());
                        
                    otherlv_39=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleNode_template2140); 

                        	newLeafNode(otherlv_39, grammarAccess.getNode_templateAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1072:1: ( (lv_nodeTemplate_hasInstances_40_0= ruleinstance ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1073:1: (lv_nodeTemplate_hasInstances_40_0= ruleinstance )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1073:1: (lv_nodeTemplate_hasInstances_40_0= ruleinstance )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1074:3: lv_nodeTemplate_hasInstances_40_0= ruleinstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getNode_templateAccess().getNodeTemplate_hasInstancesInstanceParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleinstance_in_ruleNode_template2161);
                    lv_nodeTemplate_hasInstances_40_0=ruleinstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNode_templateRule());
                    	        }
                           		set(
                           			current, 
                           			"nodeTemplate_hasInstances",
                            		lv_nodeTemplate_hasInstances_40_0, 
                            		"instance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_41=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template2173); 

                        	newLeafNode(otherlv_41, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_11_3());
                        

                    }
                    break;

            }

            otherlv_42=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNode_template2187); 

                	newLeafNode(otherlv_42, grammarAccess.getNode_templateAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode_template"


    // $ANTLR start "entryRuleInterface_Impl"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1106:1: entryRuleInterface_Impl returns [EObject current=null] : iv_ruleInterface_Impl= ruleInterface_Impl EOF ;
    public final EObject entryRuleInterface_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface_Impl = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1107:2: (iv_ruleInterface_Impl= ruleInterface_Impl EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1108:2: iv_ruleInterface_Impl= ruleInterface_Impl EOF
            {
             newCompositeNode(grammarAccess.getInterface_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInterface_Impl_in_entryRuleInterface_Impl2223);
            iv_ruleInterface_Impl=ruleInterface_Impl();

            state._fsp--;

             current =iv_ruleInterface_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterface_Impl2233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface_Impl"


    // $ANTLR start "ruleInterface_Impl"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1115:1: ruleInterface_Impl returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleInterface_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1118:28: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1119:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1119:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1119:2: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1119:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1120:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInterface_ImplAccess().getInterfaceAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1125:2: ( (lv_interface_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1126:1: (lv_interface_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1126:1: (lv_interface_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1127:3: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleInterface_Impl2284); 

            			newLeafNode(lv_interface_name_1_0, grammarAccess.getInterface_ImplAccess().getInterface_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterface_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interface_name",
                    		lv_interface_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInterface_Impl2301); 

                	newLeafNode(otherlv_2, grammarAccess.getInterface_ImplAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleInterface_Impl2313); 

                	newLeafNode(otherlv_3, grammarAccess.getInterface_ImplAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1151:1: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING||LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1151:2: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1151:2: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1152:1: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1152:1: (lv_hasOperation_4_0= ruleOperation )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1153:3: lv_hasOperation_4_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleInterface_Impl2335);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"hasOperation",
                            		lv_hasOperation_4_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1169:2: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1169:4: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInterface_Impl2348); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInterface_ImplAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1173:1: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1174:1: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1174:1: (lv_hasOperation_6_0= ruleOperation )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1175:3: lv_hasOperation_6_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInterface_ImplAccess().getHasOperationOperationParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleInterface_Impl2369);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInterface_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasOperation",
                    	            		lv_hasOperation_6_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInterface_Impl2385); 

                	newLeafNode(otherlv_7, grammarAccess.getInterface_ImplAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface_Impl"


    // $ANTLR start "entryRuleProperty"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1203:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1204:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1205:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty2421);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty2431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1212:1: ruleProperty returns [EObject current=null] : ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_property_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_property_hasParameters_4_0 = null;

        EObject lv_property_hasParameters_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1215:28: ( ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )? otherlv_7= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1216:1: ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )? otherlv_7= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1216:1: ( () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )? otherlv_7= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1216:2: () ( (lv_property_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )? otherlv_7= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1216:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1217:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1222:2: ( (lv_property_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1223:1: (lv_property_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1223:1: (lv_property_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1224:3: lv_property_name_1_0= RULE_STRING
            {
            lv_property_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProperty2482); 

            			newLeafNode(lv_property_name_1_0, grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property_name",
                    		lv_property_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProperty2499); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProperty2511); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1248:1: ( ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1248:2: ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) ) (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )*
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1248:2: ( (lv_property_hasParameters_4_0= ruleProperty_parameter ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1249:1: (lv_property_hasParameters_4_0= ruleProperty_parameter )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1249:1: (lv_property_hasParameters_4_0= ruleProperty_parameter )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1250:3: lv_property_hasParameters_4_0= ruleProperty_parameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getProperty_hasParametersProperty_parameterParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_parameter_in_ruleProperty2533);
                    lv_property_hasParameters_4_0=ruleProperty_parameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		add(
                           			current, 
                           			"property_hasParameters",
                            		lv_property_hasParameters_4_0, 
                            		"Property_parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1266:2: (otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1266:4: otherlv_5= ',' ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProperty2546); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1270:1: ( (lv_property_hasParameters_6_0= ruleProperty_parameter ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1271:1: (lv_property_hasParameters_6_0= ruleProperty_parameter )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1271:1: (lv_property_hasParameters_6_0= ruleProperty_parameter )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1272:3: lv_property_hasParameters_6_0= ruleProperty_parameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyAccess().getProperty_hasParametersProperty_parameterParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProperty_parameter_in_ruleProperty2567);
                    	    lv_property_hasParameters_6_0=ruleProperty_parameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"property_hasParameters",
                    	            		lv_property_hasParameters_6_0, 
                    	            		"Property_parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProperty2583); 

                	newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleProperty_parameter"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1300:1: entryRuleProperty_parameter returns [EObject current=null] : iv_ruleProperty_parameter= ruleProperty_parameter EOF ;
    public final EObject entryRuleProperty_parameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty_parameter = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1301:2: (iv_ruleProperty_parameter= ruleProperty_parameter EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1302:2: iv_ruleProperty_parameter= ruleProperty_parameter EOF
            {
             newCompositeNode(grammarAccess.getProperty_parameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_parameter_in_entryRuleProperty_parameter2619);
            iv_ruleProperty_parameter=ruleProperty_parameter();

            state._fsp--;

             current =iv_ruleProperty_parameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty_parameter2629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty_parameter"


    // $ANTLR start "ruleProperty_parameter"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1309:1: ruleProperty_parameter returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleProperty_parameter() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1312:28: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1313:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1313:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1313:2: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )?
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1313:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProperty_parameterAccess().getProperty_parameterAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1319:2: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1320:1: (lv_parameter_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1320:1: (lv_parameter_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1321:3: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProperty_parameter2680); 

            			newLeafNode(lv_parameter_name_1_0, grammarAccess.getProperty_parameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProperty_parameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter_name",
                    		lv_parameter_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProperty_parameter2697); 

                	newLeafNode(otherlv_2, grammarAccess.getProperty_parameterAccess().getColonKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1341:1: ( (lv_value_3_0= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1342:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1342:1: (lv_value_3_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1343:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleProperty_parameter2714); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getProperty_parameterAccess().getValueSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProperty_parameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty_parameter"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1367:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1368:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1369:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute2756);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute2766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1376:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_parameter_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_value_9_0=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        Token lv_default_13_0=null;
        Token otherlv_14=null;
        Token lv_status_15_0=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1379:28: ( ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1380:1: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1380:1: ( () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1380:2: () otherlv_1= 'Attribute' ( (lv_parameter_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )? (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )? (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )? (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )? otherlv_16= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1380:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1381:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAttribute2812); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1390:1: ( (lv_parameter_name_2_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1391:1: (lv_parameter_name_2_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1391:1: (lv_parameter_name_2_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1392:3: lv_parameter_name_2_0= RULE_STRING
            {
            lv_parameter_name_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute2829); 

            			newLeafNode(lv_parameter_name_2_0, grammarAccess.getAttributeAccess().getParameter_nameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter_name",
                    		lv_parameter_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAttribute2846); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1412:1: (otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1412:3: otherlv_4= 'type' ( (lv_type_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttribute2859); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1416:1: ( (lv_type_5_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1417:1: (lv_type_5_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1417:1: (lv_type_5_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1418:3: lv_type_5_0= RULE_STRING
                    {
                    lv_type_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute2876); 

                    			newLeafNode(lv_type_5_0, grammarAccess.getAttributeAccess().getTypeSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1434:4: (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1434:6: otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAttribute2896); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1438:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1439:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1439:1: (lv_description_7_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1440:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute2913); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getAttributeAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1456:4: (otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1456:6: otherlv_8= 'value' ( (lv_value_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAttribute2933); 

                        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getValueKeyword_6_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1460:1: ( (lv_value_9_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1461:1: (lv_value_9_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1461:1: (lv_value_9_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1462:3: lv_value_9_0= RULE_STRING
                    {
                    lv_value_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute2950); 

                    			newLeafNode(lv_value_9_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1478:4: (otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1478:6: otherlv_10= 'required' ( (lv_required_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAttribute2970); 

                        	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRequiredKeyword_7_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1482:1: ( (lv_required_11_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1483:1: (lv_required_11_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1483:1: (lv_required_11_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1484:3: lv_required_11_0= RULE_STRING
                    {
                    lv_required_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute2987); 

                    			newLeafNode(lv_required_11_0, grammarAccess.getAttributeAccess().getRequiredSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"required",
                            		lv_required_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1500:4: (otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1500:6: otherlv_12= 'default' ( (lv_default_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAttribute3007); 

                        	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getDefaultKeyword_8_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1504:1: ( (lv_default_13_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1505:1: (lv_default_13_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1505:1: (lv_default_13_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1506:3: lv_default_13_0= RULE_STRING
                    {
                    lv_default_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute3024); 

                    			newLeafNode(lv_default_13_0, grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_13_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1522:4: (otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1522:6: otherlv_14= 'status' ( (lv_status_15_0= RULE_STRING ) )
                    {
                    otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAttribute3044); 

                        	newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getStatusKeyword_9_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1526:1: ( (lv_status_15_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1527:1: (lv_status_15_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1527:1: (lv_status_15_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1528:3: lv_status_15_0= RULE_STRING
                    {
                    lv_status_15_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttribute3061); 

                    			newLeafNode(lv_status_15_0, grammarAccess.getAttributeAccess().getStatusSTRINGTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"status",
                            		lv_status_15_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute3080); 

                	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequirement"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1556:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1557:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1558:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRequirement_in_entryRuleRequirement3116);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRequirement3126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1565:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_requirement_name_4_0=null;
        Token otherlv_5=null;
        Token lv_node_6_0=null;
        Token otherlv_7=null;
        Token lv_capability_Type_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_occurances_11_0=null;
        Token otherlv_12=null;
        Token lv_occurances_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1568:28: ( ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1569:1: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1569:1: ( () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1569:2: () otherlv_1= 'Requirement' otherlv_2= '{' (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )? (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )? (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )? (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1569:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1570:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequirementAccess().getRequirementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRequirement3172); 

                	newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRequirement3184); 

                	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1583:1: (otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1583:3: otherlv_3= 'requirement_name' ( (lv_requirement_name_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleRequirement3197); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getRequirement_nameKeyword_3_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1587:1: ( (lv_requirement_name_4_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1588:1: (lv_requirement_name_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1588:1: (lv_requirement_name_4_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1589:3: lv_requirement_name_4_0= RULE_STRING
                    {
                    lv_requirement_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequirement3214); 

                    			newLeafNode(lv_requirement_name_4_0, grammarAccess.getRequirementAccess().getRequirement_nameSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"requirement_name",
                            		lv_requirement_name_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1605:4: (otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1605:6: otherlv_5= 'node' ( (lv_node_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRequirement3234); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getNodeKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1609:1: ( (lv_node_6_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1610:1: (lv_node_6_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1610:1: (lv_node_6_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1611:3: lv_node_6_0= RULE_STRING
                    {
                    lv_node_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequirement3251); 

                    			newLeafNode(lv_node_6_0, grammarAccess.getRequirementAccess().getNodeSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"node",
                            		lv_node_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1627:4: (otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1627:6: otherlv_7= 'capability_Type_name' ( (lv_capability_Type_name_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRequirement3271); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCapability_Type_nameKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1631:1: ( (lv_capability_Type_name_8_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1632:1: (lv_capability_Type_name_8_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1632:1: (lv_capability_Type_name_8_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1633:3: lv_capability_Type_name_8_0= RULE_STRING
                    {
                    lv_capability_Type_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequirement3288); 

                    			newLeafNode(lv_capability_Type_name_8_0, grammarAccess.getRequirementAccess().getCapability_Type_nameSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"capability_Type_name",
                            		lv_capability_Type_name_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1649:4: (otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1649:6: otherlv_9= 'occurances' otherlv_10= '{' ( (lv_occurances_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleRequirement3308); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getOccurancesKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRequirement3320); 

                        	newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1657:1: ( (lv_occurances_11_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1658:1: (lv_occurances_11_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1658:1: (lv_occurances_11_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1659:3: lv_occurances_11_0= RULE_STRING
                    {
                    lv_occurances_11_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequirement3337); 

                    			newLeafNode(lv_occurances_11_0, grammarAccess.getRequirementAccess().getOccurancesSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"occurances",
                            		lv_occurances_11_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1675:2: (otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==16) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1675:4: otherlv_12= ',' ( (lv_occurances_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRequirement3355); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1679:1: ( (lv_occurances_13_0= RULE_STRING ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1680:1: (lv_occurances_13_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1680:1: (lv_occurances_13_0= RULE_STRING )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1681:3: lv_occurances_13_0= RULE_STRING
                    	    {
                    	    lv_occurances_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRequirement3372); 

                    	    			newLeafNode(lv_occurances_13_0, grammarAccess.getRequirementAccess().getOccurancesSTRINGTerminalRuleCall_6_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"occurances",
                    	            		lv_occurances_13_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRequirement3391); 

                        	newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRequirement3405); 

                	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleRelationship_Impl"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1713:1: entryRuleRelationship_Impl returns [EObject current=null] : iv_ruleRelationship_Impl= ruleRelationship_Impl EOF ;
    public final EObject entryRuleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship_Impl = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1714:2: (iv_ruleRelationship_Impl= ruleRelationship_Impl EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1715:2: iv_ruleRelationship_Impl= ruleRelationship_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelationship_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_Impl_in_entryRuleRelationship_Impl3441);
            iv_ruleRelationship_Impl=ruleRelationship_Impl();

            state._fsp--;

             current =iv_ruleRelationship_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship_Impl3451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship_Impl"


    // $ANTLR start "ruleRelationship_Impl"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1722:1: ruleRelationship_Impl returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleRelationship_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_validSource_5_0=null;
        Token otherlv_6=null;
        Token lv_validTarget_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_relation_haSourceInterface_10_0 = null;

        EObject lv_relation_haSourceInterface_12_0 = null;

        EObject lv_relation_hasTargetInterface_16_0 = null;

        EObject lv_relation_hasTargetInterface_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1725:28: ( ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1726:1: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1726:1: ( () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1726:2: () otherlv_1= '{' (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )? (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )? (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )? (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )? (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1726:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1727:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationship_ImplAccess().getRelationshipAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRelationship_Impl3497); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1736:1: (otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1736:3: otherlv_2= '\"type\" :' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleRelationship_Impl3510); 

                        	newLeafNode(otherlv_2, grammarAccess.getRelationship_ImplAccess().getTypeKeyword_2_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1740:1: ( (lv_type_3_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1741:1: (lv_type_3_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1741:1: (lv_type_3_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1742:3: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRelationship_Impl3527); 

                    			newLeafNode(lv_type_3_0, grammarAccess.getRelationship_ImplAccess().getTypeSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1758:4: (otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1758:6: otherlv_4= ', \\n \"source\" :' ( (lv_validSource_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleRelationship_Impl3547); 

                        	newLeafNode(otherlv_4, grammarAccess.getRelationship_ImplAccess().getSourceKeyword_3_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1762:1: ( (lv_validSource_5_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1763:1: (lv_validSource_5_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1763:1: (lv_validSource_5_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1764:3: lv_validSource_5_0= RULE_STRING
                    {
                    lv_validSource_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRelationship_Impl3564); 

                    			newLeafNode(lv_validSource_5_0, grammarAccess.getRelationship_ImplAccess().getValidSourceSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validSource",
                            		lv_validSource_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1780:4: (otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1780:6: otherlv_6= ', \\n \"target\" :' ( (lv_validTarget_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRelationship_Impl3584); 

                        	newLeafNode(otherlv_6, grammarAccess.getRelationship_ImplAccess().getTargetKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1784:1: ( (lv_validTarget_7_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1785:1: (lv_validTarget_7_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1785:1: (lv_validTarget_7_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1786:3: lv_validTarget_7_0= RULE_STRING
                    {
                    lv_validTarget_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRelationship_Impl3601); 

                    			newLeafNode(lv_validTarget_7_0, grammarAccess.getRelationship_ImplAccess().getValidTargetSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationship_ImplRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validTarget",
                            		lv_validTarget_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1802:4: (otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1802:6: otherlv_8= ', \\n \"source_interfaces\" :' otherlv_9= '{' ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) ) (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRelationship_Impl3621); 

                        	newLeafNode(otherlv_8, grammarAccess.getRelationship_ImplAccess().getSource_interfacesKeyword_5_0());
                        
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRelationship_Impl3633); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1810:1: ( (lv_relation_haSourceInterface_10_0= ruleSource_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1811:1: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1811:1: (lv_relation_haSourceInterface_10_0= ruleSource_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1812:3: lv_relation_haSourceInterface_10_0= ruleSource_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleRelationship_Impl3654);
                    lv_relation_haSourceInterface_10_0=ruleSource_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_haSourceInterface",
                            		lv_relation_haSourceInterface_10_0, 
                            		"Source_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1828:2: (otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==16) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1828:4: otherlv_11= ',' ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRelationship_Impl3667); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1832:1: ( (lv_relation_haSourceInterface_12_0= ruleSource_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1833:1: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1833:1: (lv_relation_haSourceInterface_12_0= ruleSource_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1834:3: lv_relation_haSourceInterface_12_0= ruleSource_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleRelationship_Impl3688);
                    	    lv_relation_haSourceInterface_12_0=ruleSource_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_haSourceInterface",
                    	            		lv_relation_haSourceInterface_12_0, 
                    	            		"Source_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRelationship_Impl3702); 

                        	newLeafNode(otherlv_13, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1854:3: (otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1854:5: otherlv_14= ', \\n \"target_interfaces\" :' otherlv_15= '{' ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) ) (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleRelationship_Impl3717); 

                        	newLeafNode(otherlv_14, grammarAccess.getRelationship_ImplAccess().getTarget_interfacesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRelationship_Impl3729); 

                        	newLeafNode(otherlv_15, grammarAccess.getRelationship_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1862:1: ( (lv_relation_hasTargetInterface_16_0= ruleTarget_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1863:1: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1863:1: (lv_relation_hasTargetInterface_16_0= ruleTarget_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1864:3: lv_relation_hasTargetInterface_16_0= ruleTarget_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleRelationship_Impl3750);
                    lv_relation_hasTargetInterface_16_0=ruleTarget_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_hasTargetInterface",
                            		lv_relation_hasTargetInterface_16_0, 
                            		"Target_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1880:2: (otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==16) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1880:4: otherlv_17= ',' ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRelationship_Impl3763); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getRelationship_ImplAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1884:1: ( (lv_relation_hasTargetInterface_18_0= ruleTarget_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1885:1: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1885:1: (lv_relation_hasTargetInterface_18_0= ruleTarget_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1886:3: lv_relation_hasTargetInterface_18_0= ruleTarget_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationship_ImplAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleRelationship_Impl3784);
                    	    lv_relation_hasTargetInterface_18_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationship_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_hasTargetInterface",
                    	            		lv_relation_hasTargetInterface_18_0, 
                    	            		"Target_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRelationship_Impl3798); 

                        	newLeafNode(otherlv_19, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRelationship_Impl3812); 

                	newLeafNode(otherlv_20, grammarAccess.getRelationship_ImplAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship_Impl"


    // $ANTLR start "entryRuleinstance"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1918:1: entryRuleinstance returns [EObject current=null] : iv_ruleinstance= ruleinstance EOF ;
    public final EObject entryRuleinstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinstance = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1919:2: (iv_ruleinstance= ruleinstance EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1920:2: iv_ruleinstance= ruleinstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleinstance_in_entryRuleinstance3848);
            iv_ruleinstance=ruleinstance();

            state._fsp--;

             current =iv_ruleinstance; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinstance3858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinstance"


    // $ANTLR start "ruleinstance"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1927:1: ruleinstance returns [EObject current=null] : ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleinstance() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1930:28: ( ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1931:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1931:1: ( () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )? )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1931:2: () ( (lv_parameter_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )?
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1931:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1932:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInstanceAccess().getInstanceAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1937:2: ( (lv_parameter_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1938:1: (lv_parameter_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1938:1: (lv_parameter_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1939:3: lv_parameter_name_1_0= RULE_STRING
            {
            lv_parameter_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleinstance3909); 

            			newLeafNode(lv_parameter_name_1_0, grammarAccess.getInstanceAccess().getParameter_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter_name",
                    		lv_parameter_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleinstance3926); 

                	newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1959:1: ( (lv_value_3_0= RULE_STRING ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1960:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1960:1: (lv_value_3_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1961:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleinstance3943); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getInstanceAccess().getValueSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinstance"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1985:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1986:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1987:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation3985);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation3995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1994:1: ruleOperation returns [EObject current=null] : ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_name_1_0=null;
        Token otherlv_2=null;
        Token lv_script_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1997:28: ( ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1998:1: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1998:1: ( () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )? )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1998:2: () ( (lv_operation_name_1_0= RULE_STRING ) )? otherlv_2= ':' ( (lv_script_3_0= RULE_STRING ) )?
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1998:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:1999:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2004:2: ( (lv_operation_name_1_0= RULE_STRING ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2005:1: (lv_operation_name_1_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2005:1: (lv_operation_name_1_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2006:3: lv_operation_name_1_0= RULE_STRING
                    {
                    lv_operation_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOperation4046); 

                    			newLeafNode(lv_operation_name_1_0, grammarAccess.getOperationAccess().getOperation_nameSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operation_name",
                            		lv_operation_name_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOperation4064); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getColonKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2026:1: ( (lv_script_3_0= RULE_STRING ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2027:1: (lv_script_3_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2027:1: (lv_script_3_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2028:3: lv_script_3_0= RULE_STRING
                    {
                    lv_script_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOperation4081); 

                    			newLeafNode(lv_script_3_0, grammarAccess.getOperationAccess().getScriptSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"script",
                            		lv_script_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSource_interface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2052:1: entryRuleSource_interface returns [EObject current=null] : iv_ruleSource_interface= ruleSource_interface EOF ;
    public final EObject entryRuleSource_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource_interface = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2053:2: (iv_ruleSource_interface= ruleSource_interface EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2054:2: iv_ruleSource_interface= ruleSource_interface EOF
            {
             newCompositeNode(grammarAccess.getSource_interfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_entryRuleSource_interface4123);
            iv_ruleSource_interface=ruleSource_interface();

            state._fsp--;

             current =iv_ruleSource_interface; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSource_interface4133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource_interface"


    // $ANTLR start "ruleSource_interface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2061:1: ruleSource_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleSource_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_hasOperation_4_0 = null;

        EObject lv_hasOperation_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2064:28: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2065:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2065:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2065:2: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )? otherlv_7= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2065:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2066:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSource_interfaceAccess().getSource_interfaceAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2071:2: ( (lv_interface_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2072:1: (lv_interface_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2072:1: (lv_interface_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2073:3: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSource_interface4184); 

            			newLeafNode(lv_interface_name_1_0, grammarAccess.getSource_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSource_interfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interface_name",
                    		lv_interface_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSource_interface4201); 

                	newLeafNode(otherlv_2, grammarAccess.getSource_interfaceAccess().getSpaceColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSource_interface4213); 

                	newLeafNode(otherlv_3, grammarAccess.getSource_interfaceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2097:1: ( ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING||LA58_0==22) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2097:2: ( (lv_hasOperation_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2097:2: ( (lv_hasOperation_4_0= ruleOperation ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2098:1: (lv_hasOperation_4_0= ruleOperation )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2098:1: (lv_hasOperation_4_0= ruleOperation )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2099:3: lv_hasOperation_4_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSource_interface4235);
                    lv_hasOperation_4_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    	        }
                           		add(
                           			current, 
                           			"hasOperation",
                            		lv_hasOperation_4_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2115:2: (otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==16) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2115:4: otherlv_5= ',' ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSource_interface4248); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSource_interfaceAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2119:1: ( (lv_hasOperation_6_0= ruleOperation ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2120:1: (lv_hasOperation_6_0= ruleOperation )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2120:1: (lv_hasOperation_6_0= ruleOperation )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2121:3: lv_hasOperation_6_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSource_interfaceAccess().getHasOperationOperationParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSource_interface4269);
                    	    lv_hasOperation_6_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSource_interfaceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasOperation",
                    	            		lv_hasOperation_6_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSource_interface4285); 

                	newLeafNode(otherlv_7, grammarAccess.getSource_interfaceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource_interface"


    // $ANTLR start "entryRuleTarget_interface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2149:1: entryRuleTarget_interface returns [EObject current=null] : iv_ruleTarget_interface= ruleTarget_interface EOF ;
    public final EObject entryRuleTarget_interface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget_interface = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2150:2: (iv_ruleTarget_interface= ruleTarget_interface EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2151:2: iv_ruleTarget_interface= ruleTarget_interface EOF
            {
             newCompositeNode(grammarAccess.getTarget_interfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_entryRuleTarget_interface4321);
            iv_ruleTarget_interface=ruleTarget_interface();

            state._fsp--;

             current =iv_ruleTarget_interface; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTarget_interface4331); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget_interface"


    // $ANTLR start "ruleTarget_interface"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2158:1: ruleTarget_interface returns [EObject current=null] : ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleTarget_interface() throws RecognitionException {
        EObject current = null;

        Token lv_interface_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_hasOperation_6_0 = null;

        EObject lv_hasOperation_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2161:28: ( ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2162:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2162:1: ( () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2162:2: () ( (lv_interface_name_1_0= RULE_STRING ) ) otherlv_2= ' :' otherlv_3= '{' (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2162:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2163:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTarget_interfaceAccess().getTarget_interfaceAction_0(),
                        current);
                

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2168:2: ( (lv_interface_name_1_0= RULE_STRING ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2169:1: (lv_interface_name_1_0= RULE_STRING )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2169:1: (lv_interface_name_1_0= RULE_STRING )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2170:3: lv_interface_name_1_0= RULE_STRING
            {
            lv_interface_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTarget_interface4382); 

            			newLeafNode(lv_interface_name_1_0, grammarAccess.getTarget_interfaceAccess().getInterface_nameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTarget_interfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"interface_name",
                    		lv_interface_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTarget_interface4399); 

                	newLeafNode(otherlv_2, grammarAccess.getTarget_interfaceAccess().getSpaceSpaceColonKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTarget_interface4411); 

                	newLeafNode(otherlv_3, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2194:1: (otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==51) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2194:3: otherlv_4= 'hasOperation' otherlv_5= '{' ( (lv_hasOperation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTarget_interface4424); 

                        	newLeafNode(otherlv_4, grammarAccess.getTarget_interfaceAccess().getHasOperationKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleTarget_interface4436); 

                        	newLeafNode(otherlv_5, grammarAccess.getTarget_interfaceAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2202:1: ( (lv_hasOperation_6_0= ruleOperation ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2203:1: (lv_hasOperation_6_0= ruleOperation )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2203:1: (lv_hasOperation_6_0= ruleOperation )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2204:3: lv_hasOperation_6_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTarget_interface4457);
                    lv_hasOperation_6_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    	        }
                           		add(
                           			current, 
                           			"hasOperation",
                            		lv_hasOperation_6_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2220:2: (otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==16) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2220:4: otherlv_7= ',' ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTarget_interface4470); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getTarget_interfaceAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2224:1: ( (lv_hasOperation_8_0= ruleOperation ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2225:1: (lv_hasOperation_8_0= ruleOperation )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2225:1: (lv_hasOperation_8_0= ruleOperation )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2226:3: lv_hasOperation_8_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTarget_interfaceAccess().getHasOperationOperationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleTarget_interface4491);
                    	    lv_hasOperation_8_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTarget_interfaceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"hasOperation",
                    	            		lv_hasOperation_8_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTarget_interface4505); 

                        	newLeafNode(otherlv_9, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTarget_interface4519); 

                	newLeafNode(otherlv_10, grammarAccess.getTarget_interfaceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget_interface"


    // $ANTLR start "entryRuleContained_in"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2258:1: entryRuleContained_in returns [EObject current=null] : iv_ruleContained_in= ruleContained_in EOF ;
    public final EObject entryRuleContained_in() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContained_in = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2259:2: (iv_ruleContained_in= ruleContained_in EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2260:2: iv_ruleContained_in= ruleContained_in EOF
            {
             newCompositeNode(grammarAccess.getContained_inRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContained_in_in_entryRuleContained_in4555);
            iv_ruleContained_in=ruleContained_in();

            state._fsp--;

             current =iv_ruleContained_in; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContained_in4565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContained_in"


    // $ANTLR start "ruleContained_in"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2267:1: ruleContained_in returns [EObject current=null] : ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleContained_in() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_validSource_6_0=null;
        Token otherlv_7=null;
        Token lv_validTarget_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2270:28: ( ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2271:1: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2271:1: ( () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2271:2: () otherlv_1= 'Contained_in' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2271:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2272:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContained_inAccess().getContained_inAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleContained_in4611); 

                	newLeafNode(otherlv_1, grammarAccess.getContained_inAccess().getContained_inKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContained_in4623); 

                	newLeafNode(otherlv_2, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2285:1: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==25) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2285:3: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContained_in4636); 

                        	newLeafNode(otherlv_3, grammarAccess.getContained_inAccess().getTypeKeyword_3_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2289:1: ( (lv_type_4_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2290:1: (lv_type_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2290:1: (lv_type_4_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2291:3: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleContained_in4653); 

                    			newLeafNode(lv_type_4_0, grammarAccess.getContained_inAccess().getTypeSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContained_inRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2307:4: (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2307:6: otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleContained_in4673); 

                        	newLeafNode(otherlv_5, grammarAccess.getContained_inAccess().getValidSourceKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2311:1: ( (lv_validSource_6_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2312:1: (lv_validSource_6_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2312:1: (lv_validSource_6_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2313:3: lv_validSource_6_0= RULE_STRING
                    {
                    lv_validSource_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleContained_in4690); 

                    			newLeafNode(lv_validSource_6_0, grammarAccess.getContained_inAccess().getValidSourceSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContained_inRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validSource",
                            		lv_validSource_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2329:4: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==54) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2329:6: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleContained_in4710); 

                        	newLeafNode(otherlv_7, grammarAccess.getContained_inAccess().getValidTargetKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2333:1: ( (lv_validTarget_8_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2334:1: (lv_validTarget_8_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2334:1: (lv_validTarget_8_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2335:3: lv_validTarget_8_0= RULE_STRING
                    {
                    lv_validTarget_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleContained_in4727); 

                    			newLeafNode(lv_validTarget_8_0, grammarAccess.getContained_inAccess().getValidTargetSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContained_inRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validTarget",
                            		lv_validTarget_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2351:4: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==55) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2351:6: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleContained_in4747); 

                        	newLeafNode(otherlv_9, grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContained_in4759); 

                        	newLeafNode(otherlv_10, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2359:1: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2360:1: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2360:1: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2361:3: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleContained_in4780);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_haSourceInterface",
                            		lv_relation_haSourceInterface_11_0, 
                            		"Source_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2377:2: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==16) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2377:4: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContained_in4793); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getContained_inAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2381:1: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2382:1: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2382:1: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2383:3: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContained_inAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleContained_in4814);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_haSourceInterface",
                    	            		lv_relation_haSourceInterface_13_0, 
                    	            		"Source_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContained_in4828); 

                        	newLeafNode(otherlv_14, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2403:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==56) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2403:5: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleContained_in4843); 

                        	newLeafNode(otherlv_15, grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleContained_in4855); 

                        	newLeafNode(otherlv_16, grammarAccess.getContained_inAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2411:1: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2412:1: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2412:1: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2413:3: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleContained_in4876);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_hasTargetInterface",
                            		lv_relation_hasTargetInterface_17_0, 
                            		"Target_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2429:2: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==16) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2429:4: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContained_in4889); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getContained_inAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2433:1: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2434:1: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2434:1: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2435:3: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContained_inAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleContained_in4910);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContained_inRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_hasTargetInterface",
                    	            		lv_relation_hasTargetInterface_19_0, 
                    	            		"Target_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContained_in4924); 

                        	newLeafNode(otherlv_20, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleContained_in4938); 

                	newLeafNode(otherlv_21, grammarAccess.getContained_inAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContained_in"


    // $ANTLR start "entryRuleConnected_to"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2467:1: entryRuleConnected_to returns [EObject current=null] : iv_ruleConnected_to= ruleConnected_to EOF ;
    public final EObject entryRuleConnected_to() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnected_to = null;


        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2468:2: (iv_ruleConnected_to= ruleConnected_to EOF )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2469:2: iv_ruleConnected_to= ruleConnected_to EOF
            {
             newCompositeNode(grammarAccess.getConnected_toRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnected_to_in_entryRuleConnected_to4974);
            iv_ruleConnected_to=ruleConnected_to();

            state._fsp--;

             current =iv_ruleConnected_to; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnected_to4984); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnected_to"


    // $ANTLR start "ruleConnected_to"
    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2476:1: ruleConnected_to returns [EObject current=null] : ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleConnected_to() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_validSource_6_0=null;
        Token otherlv_7=null;
        Token lv_validTarget_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_relation_haSourceInterface_11_0 = null;

        EObject lv_relation_haSourceInterface_13_0 = null;

        EObject lv_relation_hasTargetInterface_17_0 = null;

        EObject lv_relation_hasTargetInterface_19_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2479:28: ( ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2480:1: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2480:1: ( () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2480:2: () otherlv_1= 'Connected_to' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )? (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )? (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )? (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )? (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2480:2: ()
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2481:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnected_toAccess().getConnected_toAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleConnected_to5030); 

                	newLeafNode(otherlv_1, grammarAccess.getConnected_toAccess().getConnected_toKeyword_1());
                
            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConnected_to5042); 

                	newLeafNode(otherlv_2, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2494:1: (otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==25) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2494:3: otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConnected_to5055); 

                        	newLeafNode(otherlv_3, grammarAccess.getConnected_toAccess().getTypeKeyword_3_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2498:1: ( (lv_type_4_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2499:1: (lv_type_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2499:1: (lv_type_4_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2500:3: lv_type_4_0= RULE_STRING
                    {
                    lv_type_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConnected_to5072); 

                    			newLeafNode(lv_type_4_0, grammarAccess.getConnected_toAccess().getTypeSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnected_toRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2516:4: (otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2516:6: otherlv_5= 'validSource' ( (lv_validSource_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleConnected_to5092); 

                        	newLeafNode(otherlv_5, grammarAccess.getConnected_toAccess().getValidSourceKeyword_4_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2520:1: ( (lv_validSource_6_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2521:1: (lv_validSource_6_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2521:1: (lv_validSource_6_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2522:3: lv_validSource_6_0= RULE_STRING
                    {
                    lv_validSource_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConnected_to5109); 

                    			newLeafNode(lv_validSource_6_0, grammarAccess.getConnected_toAccess().getValidSourceSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnected_toRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validSource",
                            		lv_validSource_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2538:4: (otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==54) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2538:6: otherlv_7= 'validTarget' ( (lv_validTarget_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleConnected_to5129); 

                        	newLeafNode(otherlv_7, grammarAccess.getConnected_toAccess().getValidTargetKeyword_5_0());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2542:1: ( (lv_validTarget_8_0= RULE_STRING ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2543:1: (lv_validTarget_8_0= RULE_STRING )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2543:1: (lv_validTarget_8_0= RULE_STRING )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2544:3: lv_validTarget_8_0= RULE_STRING
                    {
                    lv_validTarget_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConnected_to5146); 

                    			newLeafNode(lv_validTarget_8_0, grammarAccess.getConnected_toAccess().getValidTargetSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnected_toRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"validTarget",
                            		lv_validTarget_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2560:4: (otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==55) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2560:6: otherlv_9= 'relation_haSourceInterface' otherlv_10= '{' ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) ) (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleConnected_to5166); 

                        	newLeafNode(otherlv_9, grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConnected_to5178); 

                        	newLeafNode(otherlv_10, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2568:1: ( (lv_relation_haSourceInterface_11_0= ruleSource_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2569:1: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2569:1: (lv_relation_haSourceInterface_11_0= ruleSource_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2570:3: lv_relation_haSourceInterface_11_0= ruleSource_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleConnected_to5199);
                    lv_relation_haSourceInterface_11_0=ruleSource_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_haSourceInterface",
                            		lv_relation_haSourceInterface_11_0, 
                            		"Source_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2586:2: (otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==16) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2586:4: otherlv_12= ',' ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConnected_to5212); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getConnected_toAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2590:1: ( (lv_relation_haSourceInterface_13_0= ruleSource_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2591:1: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2591:1: (lv_relation_haSourceInterface_13_0= ruleSource_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2592:3: lv_relation_haSourceInterface_13_0= ruleSource_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_haSourceInterfaceSource_interfaceParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSource_interface_in_ruleConnected_to5233);
                    	    lv_relation_haSourceInterface_13_0=ruleSource_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_haSourceInterface",
                    	            		lv_relation_haSourceInterface_13_0, 
                    	            		"Source_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConnected_to5247); 

                        	newLeafNode(otherlv_14, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2612:3: (otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==56) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2612:5: otherlv_15= 'relation_hasTargetInterface' otherlv_16= '{' ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) ) (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleConnected_to5262); 

                        	newLeafNode(otherlv_15, grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConnected_to5274); 

                        	newLeafNode(otherlv_16, grammarAccess.getConnected_toAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2620:1: ( (lv_relation_hasTargetInterface_17_0= ruleTarget_interface ) )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2621:1: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    {
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2621:1: (lv_relation_hasTargetInterface_17_0= ruleTarget_interface )
                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2622:3: lv_relation_hasTargetInterface_17_0= ruleTarget_interface
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleConnected_to5295);
                    lv_relation_hasTargetInterface_17_0=ruleTarget_interface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	        }
                           		add(
                           			current, 
                           			"relation_hasTargetInterface",
                            		lv_relation_hasTargetInterface_17_0, 
                            		"Target_interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2638:2: (otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==16) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2638:4: otherlv_18= ',' ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConnected_to5308); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getConnected_toAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2642:1: ( (lv_relation_hasTargetInterface_19_0= ruleTarget_interface ) )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2643:1: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    {
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2643:1: (lv_relation_hasTargetInterface_19_0= ruleTarget_interface )
                    	    // ../org.xtext.dice.toscacloudifydsl/src-gen/org/xtext/dice/toscacloudifydsl/parser/antlr/internal/InternalJsonDsl.g:2644:3: lv_relation_hasTargetInterface_19_0= ruleTarget_interface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnected_toAccess().getRelation_hasTargetInterfaceTarget_interfaceParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTarget_interface_in_ruleConnected_to5329);
                    	    lv_relation_hasTargetInterface_19_0=ruleTarget_interface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnected_toRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relation_hasTargetInterface",
                    	            		lv_relation_hasTargetInterface_19_0, 
                    	            		"Target_interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConnected_to5343); 

                        	newLeafNode(otherlv_20, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConnected_to5357); 

                	newLeafNode(otherlv_21, grammarAccess.getConnected_toAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnected_to"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleService_Template_in_entryRuleService_Template75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService_Template85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleService_Template122 = new BitSet(new long[]{0x0000000000147000L});
        public static final BitSet FOLLOW_12_in_ruleService_Template135 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleService_Template152 = new BitSet(new long[]{0x0000000000146000L});
        public static final BitSet FOLLOW_13_in_ruleService_Template172 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleService_Template189 = new BitSet(new long[]{0x0000000000144000L});
        public static final BitSet FOLLOW_14_in_ruleService_Template209 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleService_Template221 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_ruleImport_in_ruleService_Template242 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleService_Template255 = new BitSet(new long[]{0x0000000000030010L});
        public static final BitSet FOLLOW_ruleImport_in_ruleService_Template276 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleService_Template290 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleService_Template305 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleService_Template317 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInput_in_ruleService_Template338 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleService_Template351 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInput_in_ruleService_Template372 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleService_Template386 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleService_Template400 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleService_Template412 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNode_template_in_ruleService_Template433 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleService_Template446 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNode_template_in_ruleService_Template467 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleService_Template481 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_21_in_ruleService_Template494 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleService_Template506 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOutput_in_ruleService_Template527 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleService_Template540 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOutput_in_ruleService_Template561 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleService_Template575 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleService_Template589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterface635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterface_Impl_in_ruleInterface682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleInterface709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleInterface736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_Impl_in_ruleRelationship828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContained_in_in_ruleRelationship855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnected_to_in_ruleRelationship882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput1022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutput1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOutput1083 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleOutput1100 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleOutput1112 = new BitSet(new long[]{0x0000000001880000L});
        public static final BitSet FOLLOW_23_in_ruleOutput1125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOutput1142 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleOutput1162 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOutput1179 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleOutput1198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput1234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInput1295 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleInput1312 = new BitSet(new long[]{0x000000000E080000L});
        public static final BitSet FOLLOW_25_in_ruleInput1325 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInput1342 = new BitSet(new long[]{0x000000000C080000L});
        public static final BitSet FOLLOW_26_in_ruleInput1362 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInput1379 = new BitSet(new long[]{0x0000000008080000L});
        public static final BitSet FOLLOW_27_in_ruleInput1399 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInput1416 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleInput1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNode_template_in_entryRuleNode_template1471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNode_template1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNode_template1532 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNode_template1549 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template1561 = new BitSet(new long[]{0x0000000FF0080000L});
        public static final BitSet FOLLOW_28_in_ruleNode_template1574 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNode_template1591 = new BitSet(new long[]{0x0000000FE0080000L});
        public static final BitSet FOLLOW_29_in_ruleNode_template1611 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNode_template1628 = new BitSet(new long[]{0x0000000FC0080000L});
        public static final BitSet FOLLOW_30_in_ruleNode_template1648 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template1660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInterface_in_ruleNode_template1681 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleNode_template1694 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleInterface_in_ruleNode_template1715 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template1729 = new BitSet(new long[]{0x0000000F80080000L});
        public static final BitSet FOLLOW_31_in_ruleNode_template1744 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template1756 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleNode_template1777 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleNode_template1790 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleNode_template1811 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template1825 = new BitSet(new long[]{0x0000000F00080000L});
        public static final BitSet FOLLOW_32_in_ruleNode_template1840 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template1852 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleNode_template1873 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleNode_template1886 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleNode_template1907 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template1921 = new BitSet(new long[]{0x0000000E00080000L});
        public static final BitSet FOLLOW_33_in_ruleNode_template1936 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template1948 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleRequirement_in_ruleNode_template1969 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleNode_template1982 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleRequirement_in_ruleNode_template2003 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template2017 = new BitSet(new long[]{0x0000000C00080000L});
        public static final BitSet FOLLOW_34_in_ruleNode_template2032 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleNode_template2044 = new BitSet(new long[]{0x0210000000000800L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleNode_template2065 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleNode_template2078 = new BitSet(new long[]{0x0210000000000800L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleNode_template2099 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleNode_template2113 = new BitSet(new long[]{0x0000000800080000L});
        public static final BitSet FOLLOW_35_in_ruleNode_template2128 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleNode_template2140 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleinstance_in_ruleNode_template2161 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template2173 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleNode_template2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterface_Impl_in_entryRuleInterface_Impl2223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterface_Impl2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface_Impl2284 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInterface_Impl2301 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleInterface_Impl2313 = new BitSet(new long[]{0x0000000000480010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleInterface_Impl2335 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleInterface_Impl2348 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleInterface_Impl2369 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleInterface_Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty2482 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleProperty2499 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleProperty2511 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_ruleProperty_parameter_in_ruleProperty2533 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleProperty2546 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleProperty_parameter_in_ruleProperty2567 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleProperty2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_parameter_in_entryRuleProperty_parameter2619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty_parameter2629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty_parameter2680 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleProperty_parameter2697 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleProperty_parameter2714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAttribute2812 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2829 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleAttribute2846 = new BitSet(new long[]{0x000000E00E080000L});
        public static final BitSet FOLLOW_25_in_ruleAttribute2859 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2876 = new BitSet(new long[]{0x000000E00C080000L});
        public static final BitSet FOLLOW_26_in_ruleAttribute2896 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2913 = new BitSet(new long[]{0x000000E008080000L});
        public static final BitSet FOLLOW_37_in_ruleAttribute2933 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2950 = new BitSet(new long[]{0x000000C008080000L});
        public static final BitSet FOLLOW_38_in_ruleAttribute2970 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2987 = new BitSet(new long[]{0x0000008008080000L});
        public static final BitSet FOLLOW_27_in_ruleAttribute3007 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3024 = new BitSet(new long[]{0x0000008000080000L});
        public static final BitSet FOLLOW_39_in_ruleAttribute3044 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute3061 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute3080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement3116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRequirement3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleRequirement3172 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRequirement3184 = new BitSet(new long[]{0x00001E0000080000L});
        public static final BitSet FOLLOW_41_in_ruleRequirement3197 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement3214 = new BitSet(new long[]{0x00001C0000080000L});
        public static final BitSet FOLLOW_42_in_ruleRequirement3234 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement3251 = new BitSet(new long[]{0x0000180000080000L});
        public static final BitSet FOLLOW_43_in_ruleRequirement3271 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement3288 = new BitSet(new long[]{0x0000100000080000L});
        public static final BitSet FOLLOW_44_in_ruleRequirement3308 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRequirement3320 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement3337 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleRequirement3355 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement3372 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleRequirement3391 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRequirement3405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_Impl_in_entryRuleRelationship_Impl3441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship_Impl3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRelationship_Impl3497 = new BitSet(new long[]{0x0001E00010080000L});
        public static final BitSet FOLLOW_28_in_ruleRelationship_Impl3510 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship_Impl3527 = new BitSet(new long[]{0x0001E00000080000L});
        public static final BitSet FOLLOW_45_in_ruleRelationship_Impl3547 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship_Impl3564 = new BitSet(new long[]{0x0001C00000080000L});
        public static final BitSet FOLLOW_46_in_ruleRelationship_Impl3584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship_Impl3601 = new BitSet(new long[]{0x0001800000080000L});
        public static final BitSet FOLLOW_47_in_ruleRelationship_Impl3621 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRelationship_Impl3633 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleRelationship_Impl3654 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleRelationship_Impl3667 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleRelationship_Impl3688 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleRelationship_Impl3702 = new BitSet(new long[]{0x0001000000080000L});
        public static final BitSet FOLLOW_48_in_ruleRelationship_Impl3717 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRelationship_Impl3729 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleRelationship_Impl3750 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleRelationship_Impl3763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleRelationship_Impl3784 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleRelationship_Impl3798 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRelationship_Impl3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinstance_in_entryRuleinstance3848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinstance3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleinstance3909 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleinstance3926 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleinstance3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation3985 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation3995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation4046 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleOperation4064 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation4081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSource_interface_in_entryRuleSource_interface4123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSource_interface4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSource_interface4184 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleSource_interface4201 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleSource_interface4213 = new BitSet(new long[]{0x0000000000480010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSource_interface4235 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleSource_interface4248 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSource_interface4269 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleSource_interface4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_entryRuleTarget_interface4321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTarget_interface4331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTarget_interface4382 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleTarget_interface4399 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleTarget_interface4411 = new BitSet(new long[]{0x0008000000080000L});
        public static final BitSet FOLLOW_51_in_ruleTarget_interface4424 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleTarget_interface4436 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTarget_interface4457 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleTarget_interface4470 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleTarget_interface4491 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleTarget_interface4505 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTarget_interface4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContained_in_in_entryRuleContained_in4555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContained_in4565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleContained_in4611 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleContained_in4623 = new BitSet(new long[]{0x01E0000002080000L});
        public static final BitSet FOLLOW_25_in_ruleContained_in4636 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleContained_in4653 = new BitSet(new long[]{0x01E0000000080000L});
        public static final BitSet FOLLOW_53_in_ruleContained_in4673 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleContained_in4690 = new BitSet(new long[]{0x01C0000000080000L});
        public static final BitSet FOLLOW_54_in_ruleContained_in4710 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleContained_in4727 = new BitSet(new long[]{0x0180000000080000L});
        public static final BitSet FOLLOW_55_in_ruleContained_in4747 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleContained_in4759 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleContained_in4780 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleContained_in4793 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleContained_in4814 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleContained_in4828 = new BitSet(new long[]{0x0100000000080000L});
        public static final BitSet FOLLOW_56_in_ruleContained_in4843 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleContained_in4855 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleContained_in4876 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleContained_in4889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleContained_in4910 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleContained_in4924 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleContained_in4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnected_to_in_entryRuleConnected_to4974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnected_to4984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleConnected_to5030 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleConnected_to5042 = new BitSet(new long[]{0x01E0000002080000L});
        public static final BitSet FOLLOW_25_in_ruleConnected_to5055 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConnected_to5072 = new BitSet(new long[]{0x01E0000000080000L});
        public static final BitSet FOLLOW_53_in_ruleConnected_to5092 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConnected_to5109 = new BitSet(new long[]{0x01C0000000080000L});
        public static final BitSet FOLLOW_54_in_ruleConnected_to5129 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConnected_to5146 = new BitSet(new long[]{0x0180000000080000L});
        public static final BitSet FOLLOW_55_in_ruleConnected_to5166 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleConnected_to5178 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleConnected_to5199 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleConnected_to5212 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSource_interface_in_ruleConnected_to5233 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleConnected_to5247 = new BitSet(new long[]{0x0100000000080000L});
        public static final BitSet FOLLOW_56_in_ruleConnected_to5262 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleConnected_to5274 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleConnected_to5295 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_16_in_ruleConnected_to5308 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTarget_interface_in_ruleConnected_to5329 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleConnected_to5343 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConnected_to5357 = new BitSet(new long[]{0x0000000000000002L});
    }


}