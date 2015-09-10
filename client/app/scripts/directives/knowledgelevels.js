;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledgeLevels', knowledgeLevels);
	
	function knowledgeLevels() {
	    return {
			template: '<div></div>',
			restrict: 'E',
			scope: {
				user: '='
			},
			link: function postLink(scope, element, attrs) {
				var nLevels = 11; // 0 ~ 10
				var htmlText = '<div class="btn-group" data-toggle="buttons">';
				function appendKnowledgeLevel(level) {
					return '<label class="btn btn-default">'
						 + '  <input type="radio" id="' + level + '" name="level" value="' + level + '" /> ' + level
						 + '</label>';
				}
				for (var level = 0; level <= nLevels; level++) {
					htmlText += appendKnowledgeLevel(level);
				}
				htmlText += '</div>';
console.log(htmlText);
				element.html(htmlText);
			}
	    }
	}
})();
