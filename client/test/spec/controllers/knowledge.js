'use strict';

describe('Controller: KnowledgeCtrl', function () {

  // load the controller's module
  beforeEach(module('clientApp'));

  var KnowledgeCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    KnowledgeCtrl = $controller('KnowledgeCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should knowledge is a object', function () {
    expect(KnowledgeCtrl.knowledge).toBe('object');
  });
});
