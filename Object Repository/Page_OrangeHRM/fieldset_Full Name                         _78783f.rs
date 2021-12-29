<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>fieldset_Full Name                         _78783f</name>
   <tag></tag>
   <elementGuidId>20044f03-c2b2-4631-8389-ee0dac4d3f0a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='frmAddCandidate']/fieldset</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#frmAddCandidate > fieldset</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>fieldset</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                
                    

                        Full Name
                        
                            
                                * First Name
                                                            
                            
                                Middle Name
                                                             
                            
                                * Last Name
                                                            
                                                

                    

                    

                        Email *                                            
                    
                        Contact No                                            
                
                
                    
                        Job Vacancy                        
-- Select --
Associate IT Manager
Junior Account Assistant
Payroll Administrator
Sales Representative
Senior QA Lead
Senior Support Specialist
Software Engineer


                                            

                    

                        

                        ResumeAccepts .docx, .doc, .odt, .pdf, .rtf, .txt up to 1MB                    

                    

                    
                        Keywords                                            
                    
                        Comment                                            
                    
                        Date of Application                         

    var datepickerDateFormat = 'yy-mm-dd';
    var displayDateFormat = datepickerDateFormat.replace('yy', 'yyyy');

    $(document).ready(function(){
        
        var dateFieldValue = $.trim($(&quot;#addCandidate_appliedDate&quot;).val());
        if (dateFieldValue == '') {
            $(&quot;#addCandidate_appliedDate&quot;).val(displayDateFormat);
        }

        daymarker.bindElement(&quot;#addCandidate_appliedDate&quot;,
        {
            showOn: &quot;both&quot;,
            dateFormat: datepickerDateFormat,
            buttonImage: &quot;/webres_6051af48107ce6.31500353/themes/default/images/calendar.png&quot;,
            buttonText:&quot;&quot;,
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            yearRange: &quot;-100:+100&quot;,
            firstDay: 1,
            onClose: function() {
                $(&quot;#addCandidate_appliedDate&quot;).trigger('blur');
            }            
        });
        
        //$(&quot;img.ui-datepicker-trigger&quot;).addClass(&quot;editable&quot;);
        
        $(&quot;#addCandidate_appliedDate&quot;).click(function(){
            daymarker.show(&quot;#addCandidate_appliedDate&quot;);
            if ($(this).val() == displayDateFormat) {
                $(this).val('');
            }
        });
    
    });

                    
                    
                        Consent to keep data                                            
                    
                        * Required field                    
                
                

                                                                    
                                                                
                
            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmAddCandidate&quot;)/fieldset[1]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='frmAddCandidate']/fieldset</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Add Candidate'])[1]/following::fieldset[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Buzz'])[1]/following::fieldset[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div/div[2]/form/fieldset</value>
   </webElementXpaths>
</WebElementEntity>
