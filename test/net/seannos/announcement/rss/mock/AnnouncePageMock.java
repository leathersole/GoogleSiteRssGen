package net.seannos.announcement.rss.mock;

public class AnnouncePageMock {
	public static final String ANNOUNCE_PAGE = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" + "\n" +
	"<html xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
	"<head>" + "\n" +
	"<script type=\"text/javascript\">/* Copyright 2008 Google. */ (function() { // Input 0" + "\n" +
	"var a=window;" + "\n" +
	"// Input 1" + "\n" +
	"var c=\"start\";function d(e){this.t={};this.tick=function(f,g,b){b=b?b:(new Date).getTime();this.t[f]=[b,g]};this.tick(c,null,e)}var h=new d;a.jstiming={Timer:d,load:h};try{a.jstiming.pt=a.gtbExternal&&a.gtbExternal.pageT()||a.external&&a.external.pageT}catch(i){};" + "\n" +
	"// Input 2" + "\n" +
	"})()" + "\n" +
	"</script>" + "\n" +
	"<link rel=\"shortcut icon\" href=\"http://www.gstatic.com/sites/p/8440a8/system/app/images/favicon.ico\" type=\"image/x-icon\" />" + "\n" +
	"<link rel=\"apple-touch-icon\" href=\"http://www.gstatic.com/sites/p/8440a8/system/app/images/apple-touch-icon.png\" type=\"image/png\" />" + "\n" +
	"<script type=\"text/javascript\">/* Copyright 2008 Google. */ (function() { var e=parseInt,h=window,i=\"length\";function j(a){return document.getElementById(a)}h.byId=j;var k=\"\";function l(a){return a.replace(/^\\s+|\\s+$/g,k)}h.trim=l;" + "\n" +
	"var m=\"MSIE\",n=\"6.0\",o=\"string\",p='id=\"',q='\" ',r='class=\"',s='title=\"',t=\"display:inline-block;\",u=\"left\",v=\"float:left;\",w=\"right\",x=\"float:right;\",y=\"cursor:hand;\",z=\"<span \",A=' style=\"width:',B=\"px; height:\",C=\"px;\",D=\";padding: 0;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='\",E=\"', sizingMethod='scale');\\\"></span><span style=\\\"padding: \",F=\" \",G=\";\",H=\"float:\",I='\"></span>';" + "\n" +
	"h.ie6ImgFix=function(a){var b=h.navigator?navigator.userAgent:k;if(b.indexOf(m)!=-1&&typeof opera==\"undefined\"){var d=/MSIE\\s+([^\\);]+)(\\)|;)/;d.test(b);b=RegExp.$1;if(b==n){var c=typeof a==o?j(a):a;a=c.id?p+c.id+q:k;b=c.className?r+c.className+q:k;d=c.title?s+c.title+q:s+c.alt+q;var f=t+c.style.cssText;if(c.align==u)f=v+f;if(c.align==w)f=x+f;if(c.parentElement.href)f=y+f;var g=c.currentStyle,L=c.width-e(g.paddingLeft,10)-e(g.paddingRight,10),M=c.height-e(g.paddingTop,10)-e(g.paddingBottom,10),N=" + "\n" +
	"z+a+b+d+A+L+B+M+C+f+D+c.src+E+g.paddingTop+F+g.paddingRight+F+g.paddingBottom+F+g.paddingLeft+G+(g.styleFloat?H+g.styleFloat+G:k)+I;h.setTimeout(function(){c.outerHTML=N},1)}}};var J=[],K=0;h.JOT_addListener=function(a,b,d){var c=new String(K++);a={eventName:a,handler:b,compId:d,key:c};J.push(a);return c};h.JOT_removeListenerByKey=function(a){for(var b=0;b<J[i];b++)if(J[b].key==a){J.splice(b,1);break}};" + "\n" +
	"h.JOT_removeAllListenersForName=function(a){for(var b=0;b<J[i];b++)J[b].eventName==a&&J.splice(b,1)};var O=\"function\";h.JOT_postEvent=function(a,b,d){var c={eventName:a,eventSrc:b||{},payload:d||{}};if(h.JOT_fullyLoaded){b=J[i];for(d=0;d<b&&d<J[i];d++){var f=J[d];if(f&&f.eventName==a){c.listenerCompId=f.compId||k;(f=typeof f.handler==O?f.handler:h[f.handler])&&f(c)}}}else h.JOT_delayedEvents.push({eventName:a,eventSrc:b,payload:d})};h.JOT_delayedEvents=[];h.JOT_fullyLoaded=false;var P=\"{0}\";" + "\n" +
	"h.JOT_formatRelativeToNow=function(a,b){a=((new Date).getTime()-a)/60000;if(a>=1440)return null;var d=0;if(a>=60){a/=60;d=2}a>=2&&d++;return b?h.JOT_siteRelTimeStrs[d].replace(P,Math.floor(a)):h.JOT_userRelTimeStrs[d].replace(P,Math.floor(a))}; })()" + "\n" +
	"</script>" + "\n" +
	"<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.gstatic.com/sites/p/8440a8/system/app/pagetypes/announcements/announcements.css\" />" + "\n" +
	"<script>" + "\n" +
	"webspace = {};" + "\n" +
	"webspace.domain = 'sean-nos.net';" + "\n" +
	"webspace.isConsumer = false;" + "\n" +
	"webspace.sharingPolicy = 'OPENED_WITH_INDICATOR';" + "\n" +
	"webspace.baseUri = '';" + "\n" +
	"webspace.siteTitle = 'Sean-nós';" + "\n" +
	"webspace.homePath = '/';" + "\n" +
	"webspace.analyticsAccountId = '';" + "\n" +
	"webspace.enableAnalytics = false;" + "\n" +
	"webspace.domainAnalyticsAccountId = '';" + "\n" +
	"webspace.termsUrl = 'http://www.google.com/sites/help/intl/ja/terms_apps.html';" + "\n" +
	"webspace.isStartPageEnabled = true;" + "\n" +
	"webspace.features = {};" + "\n" +
	"webspace.features.pageTemplates = true;" + "\n" +
	"webspace.features.uploadHTMLFiles = true;" + "\n" +
	"webspace.features.subpageNav = false;" + "\n" +
	"\n" +
	"\n" +
	"webspace.isAdsenseEnabled = true;" + "\n" +
	"webspace.adsensePublisherId = '';" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.isCodeSnippetEnabled = true;" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.isInsertPicasaPhotosEnabled = true;" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.isMyMapsEmbedEnabled = true;" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.isCalendarOnePickEnabled = true;" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.isEnhancedRecentAnnouncementsEnabled = true;" + "\n" +
	"  " + "\n" +
	"webspace.gadgets = {};" + "\n" +
	"webspace.gadgets.baseUri = '/system/app/pages/gadgets';" + "\n" +
	"webspace.gadgets.isGadgetDirectoryEnabled = true;" + "\n" +
	"webspace.gadgets.isGgsRenderingEnabled = true;" + "\n" +
	"\n" +
	"webspace.isSubpageEmbeddingEnabled = true;" + "\n" +
	"  " + "\n" +
	"\n" +
	"webspace.user = {\"uid\":\"\",\"hasAdminAccess\":false,\"guest_\":true,\"domain\":\"\",\"hasWriteAccess\":false,\"userName\":\"guest\",\"dasherUser\":false,\"primaryEmail\":\"guest\",\"displayNameOrEmail\":\"guest\"};" + "\n" +
	"\n" +
	"webspace.page = {\"locale\":\"en\",\"state\":\"\",\"wuid\":\"wuid:gx:86f8a7f7feaf53c\",\"properties\":{},\"type\":\"announcements\",\"canChangePath\":true,\"parentWuid\":\"wuid:gx:417850bb3f16b580\",\"revision\":12,\"title\":\"Announcements\",\"isRtlLocale\":false,\"bidiEnabled\":false,\"siteLocale\":\"ja\",\"name\":\"announcement\",\"path\":\"/Home/announcement\",\"isSiteRtlLocale\":false,\"parentPath\":\"/Home\"};" + "\n" +
	"\n" +
	"\n" +
	"var editorResources = [" + "\n" +
	"  'http://www.gstatic.com/sites/p/8440a8/system/js/trog_edit__en.js'," + "\n" +
	"  'http://www.gstatic.com/sites/p/8440a8/system/app/css/trogedit.css'," + "\n" +
	"  '/_/rsrc/1254940850527/system/app/css/editor.css'" + "\n" +
	"];" + "\n" +
	"\n" +
	"var JOT_clearDotPath = \"http://www.gstatic.com/sites/p/8440a8/system/app/images/cleardot.gif\";" + "\n" +
	"\n" +
	"var JOT_userRelTimeStrs = [\"a minute ago\", \"{0} minutes ago\", \"an hour ago\", \"{0} hours ago\"];" + "\n" +
	"\n" +
	"\n" +
	"    " + "\n" +
	"    webspace.page.currentTemplate = {\"title\":\"Web Page\",\"path\":\"/system/app/pagetemplates/text\"};" + "\n" +
	"    " + "\n" +
	"  " + "\n" +
	"\n" +
	"\n" +
	"var JOT_siteRelTimeStrs = [\"1 分前\", \"{0} 分前\", \"1 時間前\", \"{0} 時間前\"];" + "\n" +
	"\n" +
	"\n" +
	"</script>" + "\n" +
	"<script type=\"text/javascript\">" + "\n" +
	"                window.jstiming.load.tick('scl');" + "\n" +
	"              </script>" + "\n" +
	"<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.gstatic.com/sites/p/8440a8/system/app/themes/garden/standard-css-garden-ltr-ltr.css\" />" + "\n" +
	"<link rel=\"stylesheet\" type=\"text/css\" href=\"/_/rsrc/1254940850581/system/app/css/overlay.css?cb=garden2100%25150goog-ws-right\" />" + "\n" +
	"<title>Announcements (Sean-nós)</title>" + "\n" +
	"<script type=\"text/javascript\">" + "\n" +
	"                window.jstiming.load.tick('cl');" + "\n" +
	"              </script>" + "\n" +
	"</head>" + "\n" +
	"\n" +
	"<body xmlns=\"http://www.google.com/ns/jotspot\" id=\"body\" class=\" ja\">" + "\n" +
	"<div id=\"sites-page-toolbar\">" + "\n" +
	"<div id=\"sites-status\" class=\"sites-status\" style=\"display:none;\">" + "\n" +
	"<div id=\"sites-notice\" class=\"sites-notice\"> </div>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div id=\"sites-chrome-everything\" style=\"direction: ltr\">" + "\n" +
	"<div id=\"sites-chrome-page-wrapper\">" + "\n" +
	"<div id=\"sites-chrome-page-wrapper-inside\">" + "\n" +
	"<div xmlns=\"http://www.w3.org/1999/xhtml\" id=\"sites-chrome-header-wrapper\">" + "\n" +
	"<table id=\"sites-chrome-header\" class=\"sites-layout-hbox\" cellspacing=\"0\">" + "\n" +
	"<tr class=\"sites-header-primary-row\">" + "\n" +
	"<td id=\"sites-header-title\">" + "\n" +
	"<a href=\"http://www.sean-nos.net/\">" + "\n" +
	"<img src=\"/_/rsrc/1233403944932/config/app/images/customLogo/customLogo.gif?revision=1\" id=\"logo-img-id\" onload=\"ie6ImgFix('logo-img-id');\" alt=\"Logo\" class=\"sites-logo\" />" + "\n" +
	"</a>" + "\n" +
	"</td>" + "\n" +
	"<td class=\"sites-layout-searchbox\">" + "\n" +
	"<div>" + "\n" +
	"<form id=\"sites-searchbox-form\" action=\"/system/app/pages/search\">" + "\n" +
	"<input type=\"text\" onpropertychange=\"JOT_setTextDir(this)\" oninput=\"JOT_setTextDir(this)\" dir=\"\" id=\"jot-ui-searchInput\" name=\"q\" size=\"20\" />" + "\n" +
	"<input type=\"hidden\" id=\"sites-searchbox-scope\" name=\"scope\" value=\"search-site\" />" + "\n" +
	"<div class=\"goog-inline-block goog-button goog-button-base   \"><div class=\"goog-inline-block goog-button-base-outer-box\"><div class=\"goog-inline-block goog-button-base-inner-box\"><div class=\"goog-button-base-pos\"><div class=\"goog-button-base-top-shadow\"> </div><div id=\"sites-searchbox-search-button\" class=\"goog-button-base-content \" style=\"\" onclick=\"\"><span id=\"sites-searchbox-search-button-label\">このサイトを検索</span></div></div></div></div></div>" + "\n" +
	"</form>" + "\n" +
	"</div>" + "\n" +
	"</td>" + "\n" +
	"</tr>" + "\n" +
	"</table> " + "\n" +
	"</div> " + "\n" +
	"<div id=\"sites-chrome-main-wrapper\">" + "\n" +
	"<div id=\"sites-chrome-main-wrapper-inside\">" + "\n" +
	"<table id=\"sites-chrome-main\" class=\"sites-layout-hbox\" cellspacing=\"0\">" + "\n" +
	"<tr>" + "\n" +
	"<td id=\"sites-canvas-wrapper\">" + "\n" +
	"<div id=\"sites-canvas\">" + "\n" +
	"<div id=\"goog-ws-editor-toolbar-container\"> </div>" + "\n" +
	"<div xmlns=\"http://www.w3.org/1999/xhtml\" id=\"title-crumbs\" style=\"display: none;\">" + "\n" +
	"<A dir=\"ltr\" href=\"/Home\">Front page</A>‎ &gt; ‎" + "\n" +
	"  </div>" + "\n" +
	"<h3 xmlns=\"http://www.w3.org/1999/xhtml\" id=\"sites-page-title-header\" style=\"display: none;\" align=\"left\">" + "\n" +
	"<span id=\"sites-page-title\" dir=\"ltr\">Announcements</span>" + "\n" +
	"</h3>" + "\n" +
	"\n" +
	"<div id=\"sites-canvas-main\" class=\"sites-canvas-main\">" + "\n" +
	"<div id=\"sites-canvas-main-content\">" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-two-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1 sites-layout-empty-tile\"><div dir=\"ltr\"><br /></div></td><td class=\"sites-layout-tile sites-tile-name-content-2 sites-layout-empty-tile\"><div dir=\"ltr\"><br /></div></td></tr></tbody></table>" + "\n" +
	"</div> " + "\n" +
	"<div class=\"announcements\">" + "\n" +
	"<div class=\"sites-clear\" style=\"padding: 0 0 5px;\">" + "\n" +
	"<img xmlns=\"http://www.w3.org/1999/xhtml\" src=\"/_/rsrc/1254940857171/system/app/images/icon_feed.gif\" style=\"border:none; vertical-align: middle;\" />" + "\n" +
	"<a href=\"http://www.google.com/ig/add?feedurl=http://www.sean-nos.net/Home/announcement/posts.xml\">" + "\n" +
	"                    投稿を登録</a>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/rsswohenkoushimashita\" dir=\"ltr\">RSSを変更しました</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/09/26 8:24‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">RSSはいままでYahoo pipesを使用していましたが、うまく動かなくなっているようなので、変更しました。<div>以降、<a href=\"feed://seannos-rss.appspot.com/seannos_rss\">feed://seannos-rss.appspot.com/seannos_rss</a> をご利用ください。</div><div>よろしくお願いします。</div></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/10tsukinoyoteiwotsuika\" dir=\"ltr\">10月の予定を追加</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/09/23 18:23‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">10月の練習会の予定を追加しました。<div>9月に引き続き、12:00〜12:30を未経験あるいは初心者のための時間としています。</div><div>初めての方はぜひこの時間からおいで下さい。</div></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/stepsnidougawotsuika-1\" dir=\"ltr\">Stepsに動画を追加</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/09/23 18:19‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\"><a href=\"http://www.sean-nos.net/steps-1\">Steps</a>にCasey O'Dea を追加しました。</div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/stepsnidougawotsuika\" dir=\"ltr\">Stepsに動画を追加</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/07/02 8:13‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\"><a href=\"http://www.sean-nos.net/steps-1\">Steps</a>にHips!とStampを追加しました。<br /></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/7tsukinoyoteihenkou\" dir=\"ltr\">7月の予定変更</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/07/02 7:07‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">12日の練習会は所用により26日に移します。すみません。</div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/stepswotsuika\" dir=\"ltr\">Stepsを追加</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/06/14 5:25‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\"><a href=\"http://www.sean-nos.net/steps-1\">Steps</a>のページを追加しました。今後増やしていく予定です。（記録はしたのですが編集が…）<br /></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/6tsukinoyoteihenkou21nichihachuushi\" dir=\"ltr\">6月の予定変更（21日は中止）</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/06/05 18:33‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">6月21日の練習会は、所用によりとりやめます。<div>すみません。</div></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/yokuarushitsumon\" dir=\"ltr\">よくある質問</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/06/01 7:20‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\"><a href=\"http://www.sean-nos.net/faq\">よくある質問</a>のページを作りました。</div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/6tsukinorenshuukai\" dir=\"ltr\">6月の練習会</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/05/30 19:49‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">6月のカレンダーを更新しました。<div>7日、14日、21日の12:30〜14:00、千歳船橋駅から徒歩5分</div></div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"announcement\">" + "\n" +
	"<h4><a href=\"/Home/announcement/5tsukinorenshuukai\" dir=\"ltr\">5月の練習会</a></h4>" + "\n" +
	"<span class=\"timestamp\">" + "\n" +
	"                  " + "\n" +
	"  " + "\n" +
	"  " + "\n" +
	"  ‎<span xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">‎2009/04/26 6:22‎</span>‎ に Takayuki Konishi が投稿" + "\n" +
	"\n" +
	"                  " + "\n" +
	"                </span>" + "\n" +
	"<p>" + "\n" +
	"<table xmlns=\"http://www.w3.org/1999/xhtml\" cellspacing=\"0\" class=\"sites-layout-name-one-column sites-layout-hbox\"><tbody><tr><td class=\"sites-layout-tile sites-tile-name-content-1\"><div dir=\"ltr\">練習会、5月分を更新しました。</div></td></tr></tbody></table>" + "\n" +
	"</p>" + "\n" +
	"<div class=\"postfooter\">" + "\n" +
	"<p>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div class=\"sites-clear\" style=\"padding: 0 0 10px 5px;\">" + "\n" +
	"<p>" + "\n" +
	"<span xmlns=\"http://www.w3.org/1999/xhtml\">‹ 前へ</span>" + "\n" +
	"        " + "\n" +
	"\n" +
	"        " + "\n" +
	"      <strong xmlns=\"http://www.w3.org/1999/xhtml\">1 - 10</strong> / <strong xmlns=\"http://www.w3.org/1999/xhtml\">13</strong> 件" + "\n" +
	"        " + "\n" +
	"\n" +
	"      " + "\n" +
	"          <a xmlns=\"http://www.w3.org/1999/xhtml\" href=\"javascript:window.location=nextUrl\" class=\"enabled\">次へ ›</a>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"</div> " + "\n" +
	"<div id=\"sites-canvas-bottom-panel\">" + "\n" +
	"</div>" + "\n" +
	"</div> " + "\n" +
	"</td> " + "\n" +
	"<td id=\"sites-chrome-sidebar-right\" class=\"sites-layout-sidebar-right\">" + "\n" +
	"<div xmlns=\"http://www.w3.org/1999/xhtml\" id=\"COMP_2bd\" class=\"sites-embed\">" + "\n" +
	"<h4 class=\"sites-embed-title\">Navigation</h4>" + "\n" +
	"<div class=\"sites-embed-content sites-sidebar-nav \">" + "\n" +
	"<ul jotId=\"navList\">" + "\n" +
	"<li class=\"nav-first\"><div dir=\"ltr\" style=\"padding-left: 5px;\"><a href=\"http://www.sean-nos.net/Home\" jotId=\"wuid:gx:417850bb3f16b580\">Front page</a>" + "\n" +
	"</div></li>" + "\n" +
	"<li class=\"\"><div dir=\"ltr\" style=\"padding-left: 5px;\"><a href=\"http://www.sean-nos.net/faq\" jotId=\"wuid:gx:5c794949d04def10\">FAQ</a>" + "\n" +
	"</div></li>" + "\n" +
	"<li class=\"\"><div class=\"current-bg\" jotId=\"wuid:gx:86f8a7f7feaf53c\" dir=\"ltr\" style=\"padding-left: 5px;\">Announcements" + "\n" +
	"</div></li>" + "\n" +
	"<li class=\"\"><div dir=\"ltr\" style=\"padding-left: 5px;\"><a href=\"http://www.sean-nos.net/steps-1\" jotId=\"wuid:gx:bb1b5135769e80b\">Steps</a>" + "\n" +
	"</div></li>" + "\n" +
	"<li class=\"\"><div dir=\"ltr\" style=\"padding-left: 5px;\"><a href=\"http://www.sean-nos.net/gallery\" jotId=\"wuid:gx:270f4d57768893a7\">Gallery</a>" + "\n" +
	"</div></li>" + "\n" +
	"<li class=\"\"><div dir=\"ltr\" style=\"padding-left: 5px;\"><a href=\"http://www.sean-nos.net/system/app/pages/sitemap/hierarchy\" jotId=\"wuid:gx:4fb0cb02de62bad3\">サイトマップ</a>" + "\n" +
	"</div></li>" + "\n" +
	"</ul>" + "\n" +
	"\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<div xmlns=\"http://www.w3.org/1999/xhtml\" id=\"COMP_5308565213344991\" class=\"sites-embed\" style=\"width:\">" + "\n" +
	"<h4 class=\"sites-embed-title\">作者</h4>" + "\n" +
	"<div class=\"sites-embed-content\" style=\"padding:5px;\">" + "\n" +
	"<div dir=\"ltr\"><h4>プロフィール</h4>" + "\n" +
	"<p>アイルランドに行ったらダンスを習ったりしてます。</p>" + "\n" +
	"<h4>一言</h4>" + "\n" +
	"<p>思ったほどGoogle sitesは使いやすくないな…。</p></div>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"<DIV xmlns=\"http://www.w3.org/1999/xhtml\" id=\"COMP_023192806635051966\" style=\"width:undefined\" class=\"sites-embed\"><H4 class=\"sites-embed-title\">最近の更新履歴</H4><DIV class=\"sites-embed-content sites-sidebar-recent-activity\"><UL><LI><A jotId=\"wuid:gx:21c806ce4df0c1ad\" dir=\"ltr\" href=\"http://www.sean-nos.net/Home/announcement/rsswohenkoushimashita\">RSSを変更しました</A><DIV><SPAN class=\"sites-text-secondary\">Takayuki Konishi 作成</SPAN></DIV></LI><LI><A jotId=\"wuid:gx:417850bb3f16b580\" dir=\"ltr\" href=\"http://www.sean-nos.net/Home\">Front page</A><DIV><SPAN class=\"sites-text-secondary\">Takayuki Konishi 編集</SPAN></DIV></LI><LI><A jotId=\"wuid:gx:5d2f9574525f52ec\" dir=\"ltr\" href=\"http://www.sean-nos.net/Home/announcement/10tsukinoyoteiwotsuika\">10月の予定を追加</A><DIV><SPAN class=\"sites-text-secondary\">Takayuki Konishi 作成</SPAN></DIV></LI><LI><A jotId=\"wuid:gx:18bfd982e79401d\" dir=\"ltr\" href=\"http://www.sean-nos.net/Home/announcement/stepsnidougawotsuika-1\">Stepsに動画を追加</A><DIV><SPAN class=\"sites-text-secondary\">Takayuki Konishi 作成</SPAN></DIV></LI><LI><A jotId=\"wuid:gx:bb1b5135769e80b\" dir=\"ltr\" href=\"http://www.sean-nos.net/steps-1\">Steps</A><DIV><SPAN class=\"sites-text-secondary\">Takayuki Konishi 編集</SPAN></DIV></LI><LI class=\"sites-sidebar-recent-activity-viewall\"><A href=\"/system/app/pages/recentChanges\">すべて表示</A></LI></UL></DIV></DIV>" + "\n" +
	"</td>" + "\n" +
	"</tr>" + "\n" +
	"</table> " + "\n" +
	"</div> " + "\n" +
	"</div> " + "\n" +
	"<div id=\"sites-chrome-footer-wrapper\">" + "\n" +
	"<div id=\"sites-chrome-footer-wrapper-inside\">" + "\n" +
	"<div id=\"sites-chrome-footer\">" + "\n" +
	"<div xmlns=\"http://www.w3.org/1999/xhtml\" class=\"sites-subfooter\">" + "\n" +
	"<p>" + "\n" +
	"            " + "\n" +
	"                 " + "\n" +
	"                <a class=\"sites-system-link\" href=\"https://www.google.com/a/UniversalLogin?md=sean-nos.net&amp;continue=http%3A%2F%2Fsites.google.com%2Fa%2Fsean-nos.net%2Finfo%2FHome%2Fannouncement&amp;service=jotspot\">ログイン</a>" + "\n" +
	"              " + "\n" +
	"             " + "\n" +
	"            <a class=\"sites-system-link\" href=\"javascript:void(window.open('http://www.google.com/sites/help/intl/ja/terms_apps.html'))\">利用規約</a>" + "\n" +
	"             " + "\n" +
	"            <a class=\"sites-system-link\" href=\"/system/app/pages/reportAbuse\" target=\"_blank\">不正行為を報告</a>" + "\n" +
	"            " + "\n" +
	"                 " + "\n" +
	"                <a class=\"sites-system-link\" href=\"javascript:;\" onclick=\"window.open(webspace.printUrl)\">ページを印刷</a>" + "\n" +
	"              " + "\n" +
	"            " + "\n" +
	"             | " + "\n" +
	"            <b class=\"powered-by\">Powered by <a class=\"sites-system-link\" href=\"http://sites.google.com\">Google サイト</a></b>" + "\n" +
	"</p>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"</div>" + "\n" +
	"</div> " + "\n" +
	"</div> " + "\n" +
	"</div> " + "\n" +
	"\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"    window.jstiming.load.tick('sjl');" + "\n" +
	"  </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" src=\"http://www.gstatic.com/sites/p/8440a8/system/js/jot_min_announcements_view__ja.js\"></script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"                JOT_postEvent('moduleLoad');" + "\n" +
	"              </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"    window.jstiming.load.tick('jl');" + "\n" +
	"  </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"              var searchBox = new gsites.Searchbox('sites-searchbox-search-button');" + "\n" +
	"              searchBox.initListeners();" + "\n" +
	"              searchBox.setScopesMenu(webspace.page.isSiteRtlLocale);" + "\n" +
	"            </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"          var nextUrl = JOT_addParamToUri(window.location, 'offset', '10');" + "\n" +
	"          var prevUrl = JOT_addParamToUri(window.location, 'offset', '-10');" + "\n" +
	"        </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" defer=\"true\">" + "\n" +
	"            JOT_setupNav(\"2bd\", \"Navigation\", false);" + "\n" +
	"            JOT_addListener('titleChange', 'JOT_NAVIGATION_titleChange', 'COMP_2bd');" + "\n" +
	"          </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"  setTimeout(function() {" + "\n" +
	"    var fingerprint = gsites.date.TimeZone.getFingerprint([1109635200000,1128902400000,1130657000000,1143333000000,1143806400000,1145000000000,1146380000000,1152489600000,1159800000000,1159500000000,1162095000000,1162075000000,1162105500000]);" + "\n" +
	"    gsites.Xhr.send('http://www.sean-nos.net/_/tz', null, null, 'GET', null, null, { afjstz: fingerprint });" + "\n" +
	"  }, 500);" + "\n" +
	"</script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
	"                    window.onload = function() {                    " + "\n" +
	"                      var loadTimer = window.jstiming.load;" + "\n" +
	"                      loadTimer.tick(\"ol\");" + "\n" +
	"                      loadTimer[\"name\"] = \"load,\" + webspace.page.type;" + "\n" +
	"                      window.jstiming.report(loadTimer);" + "\n" +
	"                    }" + "\n" +
	"                  </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\">" + "\n" +
	"        JOT_insertAnalyticsCode(false);" + "\n" +
	"      </script>" + "\n" +
	"<script xmlns=\"http://www.w3.org/1999/xhtml\" type=\"text/javascript\" defer=\"true\">" + "\n" +
	"  //<![CDATA[" + "\n" +
	"    // Fires delayed events." + "\n" +
	"    (function() {" + "\n" +
	"      JOT_fullyLoaded = true;" + "\n" +
	"      var delayedEvents = JOT_delayedEvents;" + "\n" +
	"      for (var x = 0; x < delayedEvents.length; x++) {" + "\n" +
	"        var event = delayedEvents[x];" + "\n" +
	"        JOT_postEvent(event.eventName, event.eventSrc, event.payload);" + "\n" +
	"      }" + "\n" +
	"      JOT_delayedEvents = null;" + "\n" +
	"      JOT_postEvent('pageLoaded');" + "\n" +
	"    })();" + "\n" +
	"\n" +
	"    // Decorate any fastUI buttons on the page with a class of 'goog-button'." + "\n" +
	"    if (webspace.user.hasWriteAccess) {" + "\n" +
	"      JOT_decorateButtons();" + "\n" +
	"    }" + "\n" +
	" //]]>" + "\n" +
	"</script>" + "\n" +
	"<div id=\"server-timer-div\" style=\"display:none\"> </div>" + "\n" +
	"<script>" + "\n" +
	"          window.jstiming.load.tick('render');" + "\n" +
	"        </script>" + "\n" +
	"</body>" + "\n" +
	"</html>";
}